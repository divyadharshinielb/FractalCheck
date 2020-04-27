package com.origin.fractal.testauto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.origin.fractal.testauto.FractalBasePage;

public class AccountPage extends FractalBasePage {

	private By lblMyAccountHdr = By.xpath(".//div[@class='heading-left mb-4']");
	private By lblProfileTitle = By.xpath(".//div[contains(@class,'myaccount-text padding-30 mt-3')]");
	private By lblEmailAddr = By.xpath(".//div[contains(@class,'register_scrn padding-tb-20 font-size-16 noEdit')]");
	private By lblFirstName = By.xpath(".//h3[contains(text(),'First Name*')]");
	private By lblLastName = By.xpath(".//h3[contains(text(),'Last Name *')]");
	private By phoneNumber = By.xpath(".//h3[contains(text(),'Phone *')]");
	private By lblChgPass = By.xpath(".//div[contains(@class,'col-lg-12 text-center myaccount-text padding-30 mt-5')]");
	private By lblOldPass = By.xpath(".//h3[contains(text(),'Old Password *')]");
	private By lblNewPass = By.xpath(".//h3[contains(text(),'New Password *')]");
	private By lblconfrmPass = By.xpath(".//h3[contains(text(),'Confirm Password *')]");
	/* completed till here*/
	private By lblEmail = By.xpath(".//*[@id=\"register\"]/div[1]/text()");
	private By lblFName = By.xpath(".//input[contains(@name,'firstname')]");
	private By lblLName = By.xpath(".//input[contains(@name,'lastname')]");
	private By btnSave = By.xpath(".//input[contains(@class,'save-button')]");
	private By txtboxNewPass = By.xpath(".//div[contains(@class,'row bg-white ml-0')]//div[3]//div[3]//input[1]");
	private By txtboxConfirmPass = By.xpath(".//input[@id='pass']");
	private By btncancel = By.xpath(".//div/form/*//button[contains(text(),'Cancel')]");

	private By fNameError = By.id("errFirstName");
	private By fNameErrorOnlyLetters = By.id("errFirstNameLetters");
	private By lNameError = By.id("errLastName");
	private By lNameErrorOnlyLetters = By.id("errLastNameMinLetters");
	
	private By fNameErrMsg = By.xpath(".//div[contains(text(),'First name field should not be empty.')]");
	private By lNameErrMsg = By.xpath(".//div[contains(text(),'Last name should not be empty.')]");
	private By lNewPass = By.xpath(".//div[contains(text(),'Your password must be minimum 8 characters or long')]");
	private By changePassword =By.xpath(".//input[@name='password']");
	private By oldPassword= By.xpath(".//input[contains(@name,'oldpassword')]");
	private By confirmPassword = By.xpath(".//input[@id='pass']");
	private By saveButton = By.xpath(".//input[contains(@class,'save-button')]");
	private By lblProfile = By.xpath(".//img[@class='logout-height']");
	private By logOutButton = By.xpath("//a[@class='pointer padding-l-15']");

	public AccountPage(WebDriver driver) {
		super(driver);
		pageName ="AccountPage"; 
	}
	
	public void verifyAccountPageLabels() {
		verifyLabel("lblMyAccountHdr",lblMyAccountHdr);
		verifyLabel("lblProfileTitle",lblProfileTitle);
		verifyLabel("lblEmailAddr",lblEmailAddr);
		wait(5);
		verifyLabel("lblFirstName",lblFirstName);
		verifyLabel("lblLastName",lblLastName);
		wait(2);
		verifyLabel("phoneNumber",phoneNumber);
		verifyLabel("lblChgPass",lblChgPass);
		verifyLabel("lblOldPass",lblOldPass);
		verifyLabel("lblNewPass",lblNewPass);
		verifyLabel("lblconfrmPass",lblconfrmPass);
	}
	
	public void verifyProfileDetails() {
		//verifyValue(getLabel("lblEmail"),lblEmail);
		wait(5);
		verifyValue(getLabel("lblFName"),lblFName);
		wait(5);
		verifyValue(getLabel("lblLName"),lblLName);
	}
	public void verifyEmptyProfileValidation() {
		wait(5);
		clear(lblFName);
		clear(lblLName);
		wait(5);
		enterData(getLabel("newPass"), txtboxNewPass);
		wait(5);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element= driver.findElement(By.xpath(".//input[contains(@class,'save-button')]"));
		js.executeScript("arguments[0].scrollIntoView();", Element);
		wait(5);
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
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement Element= driver.findElement(By.xpath(".//input[contains(@class,'save-button')]"));
			js.executeScript("arguments[0].scrollIntoView();", Element);
			wait(5);
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
			WebElement element = driver.findElement(By.xpath(".//input[contains(@class,'save-button')]")); 
			Actions actions = new Actions(driver); 
			actions.moveToElement(element);
			actions.perform();
			wait(5);
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
		enterData("AutoDU@123",oldPassword);
		enterData("Origin@123",changePassword);
		enterData("Origin@123",confirmPassword);
		System.out.print("1."+confirmPassword);
		wait(5);
		click(saveButton);
		wait(5);
		WebElement element = driver.findElement(By.xpath(".//img[@class='logout-height']")); 
		Actions actions = new Actions(driver); 
		actions.moveToElement(element);
		actions.perform();
		wait(2);
		click(lblProfile);
		wait(2);
		click(logOutButton);	
	}
	public void afterChangePassword() {
		wait(5);
		enterData("Origin@123",oldPassword);
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
