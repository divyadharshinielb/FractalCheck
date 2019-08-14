package com.origin.fractal.testauto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBasePage;

public class AccountPage extends FractalBasePage {

	private By lblMyAccountHdr = By.xpath(".//*[@id='myAccount']");
	private By lblProfileTitle = By.xpath(".//*[@id='profileTitle']");
	private By lblEmailAddr = By.xpath(".//*[@id='email']");
	private By lblFirstName = By.xpath(".//*[@id='lblFirstName']");
	private By lblLastName = By.xpath(".//*[@id='lblLastName']");
	private By lblChgPass = By.xpath(".//*[@id='changePassword']");
	private By lblNewPass = By.xpath(".//*[@id='lblNewPass']");
	private By lblconfrmPass = By.xpath(".//*[@id='lblConfirmPass']");
/**addded here**/
	private By lblEmail = By.xpath(".//div/form/*//div[contains(text(),'Email Address:')]/../div/input");
/**here**/	
	private By lblFName = By.xpath(".//div/form/*//div[contains(text(),'First Name:')]/../div/input");
	private By lblLName = By.xpath(".//div/form/*//div[contains(text(),'Last Name:')]/../div/input");
	private By btnSave = By.xpath(".//div/form/*//button[contains(text(),'Save')]");
	private By txtboxNewPass = By.xpath(".//div/form/*//div[contains(text(),'New Password:')]/../div/input");
	private By txtboxConfirmPass = By.xpath(".//div/form/*//div[contains(text(),'Confirm Password:')]/../div/input");
	private By btncancel = By.xpath(".//div/form/*//button[contains(text(),'Cancel')]");

	private By fNameError = By.id("errFirstName");
	private By fNameErrorOnlyLetters = By.id("errFirstNameLetters");
	private By lNameError = By.id("errLastName");
	private By lNameErrorOnlyLetters = By.id("errLastNameMinLetters");
	
	private By fNameErrMsg = By.id("errFirstName");
	private By lNameErrMsg = By.id("errLastName");
	private By lNewPass = By.id("errNewPassword");
	private By changePassword =By.xpath("//input[@id='newPassword']");
	private By confirmPassword = By.xpath("//input[@id='confirmPassword']");
	private By saveButton = By.xpath("//button[@id='submit']");
	private By lblProfile = By.xpath("//*[@id='dLabel']/span");
	private By logOutButton = By.xpath("//a[@class='pointer padding-l-15']");

	public AccountPage(WebDriver driver) {
		super(driver);
		pageName ="AccountPage"; 
	}
	
	public void verifyAccountPageLabels() {
		verifyLabel("lblMyAccountHdr",lblMyAccountHdr);
		verifyLabel("lblProfileTitle",lblProfileTitle);
		verifyLabel("lblEmailAddr",lblEmailAddr);
		verifyLabel("lblFirstName",lblFirstName);
		verifyLabel("lblLastName",lblLastName);
		verifyLabel("lblChgPass",lblChgPass);
		verifyLabel("lblNewPass",lblNewPass);
		verifyLabel("lblconfrmPass",lblconfrmPass);
	}
	
	public void verifyProfileDetails() {
		verifyValue(getLabel("lblEmail"),lblEmail);
		wait(5);
		verifyValue(getLabel("lblFName"),lblFName);
		wait(5);
		verifyValue(getLabel("lblLName"),lblLName);
	}
	public void verifyEmptyProfileValidation() {
		clear(lblFName);
		clear(lblLName);
		enterData(getLabel("newPass"), lblFName);//Updated by Nithin K on Aug_14_19
		clear(lblLName);
		click(btnSave);
		verifyErrorMessage();
	}
	
	public void verifyAfterCancelValidation() {
		clear(lblFName);
		clear(lblLName);
		enterData(getLabel("lblFName"), lblFName);
		enterData(getLabel("lblLName"), lblLName);
		enterData(getLabel("newPass"), txtboxNewPass);
		enterData(getLabel("confirmPass"), txtboxConfirmPass);
		click(btncancel);
		wait(5);
		verifyValue(getLabel("lblFName"),lblFName);//could not get text
		verifyValue(getLabel("lblLName"),lblLName);//could not get text
		wait(10);
		verifyText("",txtboxNewPass);	
		verifyText("",txtboxConfirmPass);
	}
	public void verifyFieldValidation() {
		clear(lblFName);
		clear(lblLName);
		verifyFnameField(lblFName);
		clear(lblFName);
		clear(lblLName);
		verifyLnameField(lblLName);
	}
	public boolean verifyFnameField(By objLoc){
		boolean status=false;
		String[] inpArray= {"1111","!@#"};
		for(int i=0;i<inpArray.length;i++) {
			enterData(inpArray[i], objLoc);
			click(btnSave);
			status=elementExist(fNameErrorOnlyLetters);
			status=elementExist(lNameError);
		}
		return status;
	}
	public boolean verifyLnameField(By objLoc){
		boolean status=false;
		String[] inpArray= {"1111","!@#"};
		for(int i=0;i<inpArray.length;i++) {
			enterData(inpArray[i], objLoc);
			click(btnSave);
			status=elementExist(lNameErrorOnlyLetters);
			status=elementExist(fNameError);
		}
		return status;
	}
	
	public void verifyErrorMessage(){
		if (elementExist(fNameErrMsg)) {
		verifyLabel("fNameErrMsg",fNameErrMsg);
		verifyLabel("lNameErrMsg",lNameErrMsg);
		verifyLabel("lNewPass",lNewPass);
	     }
		}
		
	public void changePassword() {
		wait(5);
		enterData("Origin@123",changePassword);
		enterData("Origin@123",confirmPassword);
		System.out.print("1."+confirmPassword);
		wait(5);
		click(saveButton);
		wait(5);
		click(lblProfile);
		click(logOutButton);	
	}
	public void afterChangePassword() {
		wait(5);
		enterData("AutoDU@123",changePassword);
		enterData("AutoDU@123",confirmPassword);
		wait(5);
		System.out.print(confirmPassword);
		click(saveButton);
		wait(5);
		click(lblProfile);
		click(logOutButton);
	}

}
