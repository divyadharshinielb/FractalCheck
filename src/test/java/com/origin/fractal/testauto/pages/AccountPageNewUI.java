package com.origin.fractal.testauto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.origin.fractal.testauto.FractalBasePage;
import com.wv.auto.framework.BrowserFactory;

public class AccountPageNewUI  extends FractalBasePage{
	
	private By lblMyAccountHdr = By.xpath(".//div[contains(@class, 'heading-left mb-4')]");
	private By lblProfileTitle = By.xpath("//div[contains(text(),'MY PROFILE')]");
	private By lblEmailAddr = By.xpath(".//h3[@class='padding-b-10']");
	private By lblFirstName = By.xpath("//h3[contains(text(),'First name')]");
	private By lblLastName = By.xpath(".//h3[contains(text(),'Last Name *')]");
	private By lblPhone = By.xpath(".//h3[contains(text(),'Phone')]");
	private By lblChgPass = By.xpath("//div[contains(text(),'CHANGE PASSWORD')]");
	private By lblOldPass = By.xpath(".//h3[contains(text(),'Old password')]");
	private By lblNewPass = By.xpath(".//h3[contains(text(),'New password')]");
	private By lblconfrmPass = By.xpath(".//h3[contains(text(),'Confirm password')]");
	
	private By inpEmail = By.xpath(".//input[@name='email']");
	private By inpFName = By.xpath(".//input[@name='firstname']");
	private By inpLName = By.xpath(".//input[@name='lastname']");
	private By inpPhone = By.xpath(".//input[@name='phone']");
	private By inpOldPass = By.xpath(".//input[@name='oldpassword']");
	 private By inpNewPass = By.xpath(".//input[@name='password']");
	 private By inpConfirmPass = By.xpath(".//input[@name='confirmpassword']");
	
	
	private By btnSave = By.xpath(".//input[contains(@value,'Save')]");
	private By fNameErrorOnlyLetters = By.xpath(".//input[@name='firstname']/../div[contains(@class,'errorMsg')]");
	private By lNameError = By.xpath(".//input[@name='lastname']/../div[contains(@class,'errorMsg')]");
	private By fNameErrMsg = By.xpath(".//input[@name='firstname']/../div[contains(@class,'errorMsg')]");
	private By lNameErrMsg = By.xpath(".//input[@name='lastname']/../div[contains(@class,'errorMsg')]");
	private By newPassErrorMsg = By.xpath(".//input[@name='password']/../div[contains(@class,'errorMsg')]");
	private By lblProfile = By.xpath(".//div[contains(@class,'logout_pop')]/*//button[contains(@class,'circle-hover')]");
	private By logOutButton=By.xpath(".//li[contains(text(),'Logout')]");
	private By btncancel = By.xpath(".//div/form/*//button[contains(text(),'Cancel')]");
	/*private By inpPhone = By.xpath("");
	 private By inpPhone = By.xpath("");
	 private By inpPhone = By.xpath("");
	 */
	
	public AccountPageNewUI(WebDriver driver) {
		super(driver);
		pageName ="AccountPageNewUI"; 
	}
	public void verifyAccountPageLabels() {
		verifyLabel("lblMyAccountHdr",lblMyAccountHdr);
		verifyLabel("lblProfileTitle",lblProfileTitle);
		verifyLabel("lblEmailAddr",lblEmailAddr);
		wait(5);
		verifyLabel("lblFirstName",lblFirstName);
		verifyLabel("lblLastName",lblLastName);
		verifyLabel("lblPhone",lblPhone);
		verifyLabel("lblOldPass",lblOldPass);
		verifyLabel("lblChgPass",lblChgPass);
		verifyLabel("lblNewPass",lblNewPass);
		verifyLabel("lblconfrmPass",lblconfrmPass);
	}
	public void verifyProfileDetails() {
		//verifyValue(getLabel("inpEmail"),inpEmail);
		wait(5);
		verifyValue(getLabel("inpFName"),inpFName);
		wait(5);
		verifyValue(getLabel("inpLName"),inpLName);
		wait(5);
		verifyValue(getLabel("inpPhone"),inpPhone);
	}
	public void verifyFieldValidation() {
		clear(inpFName);
		clear(inpLName);
		wait(5);
		verifyFnameField(inpFName);
		clear(inpFName);
		clear(inpLName);
		verifyLnameField(inpLName);
	}
	public boolean verifyFnameField(By objLoc){
		
		boolean status=false;
		String[] inpArray= {"1111","!@#"};
		for(int i=0;i<inpArray.length;i++) {
			enterData(inpArray[i], objLoc);
			WebElement element = driver.findElement(By.xpath("//input[contains(@value,'Save')]")); 
			
			if(BrowserFactory.getOS().equalsIgnoreCase("win")) {
				Actions actions = new Actions(driver); 
				actions.moveToElement(element);
				actions.perform();
			}
			
			wait(5);
			click(btnSave);
			status = elementExist(fNameErrorOnlyLetters);
			status = elementExist(lNameError);
		}
		return status;
	}
	public boolean verifyLnameField(By objLoc){
		boolean status=false;
		String[] inpArray= {"1111","!@#"};
		for(int i=0;i<inpArray.length;i++) {
			enterData(inpArray[i], objLoc);
			
			WebElement element = driver.findElement(By.xpath("//input[contains(@value,'Save')]"));
			if(BrowserFactory.getOS().equalsIgnoreCase("win")) {
			Actions actions = new Actions(driver); 
			actions.moveToElement(element);
			actions.perform();
			}
			
			
			wait(5);
			click(btnSave);
			status=elementExist(lNameError);
			status=elementExist(fNameErrorOnlyLetters);
		}
		return status;
	}
	public void verifyEmptyProfileValidation() {
		clear(inpFName);
		clear(inpLName);
		enterData(getLabel("newPass"), inpNewPass);
		WebElement element = driver.findElement(By.xpath("//input[contains(@value,'Save')]")); 
		if(BrowserFactory.getOS().equalsIgnoreCase("win")) {
		Actions actions = new Actions(driver); actions.moveToElement(element);
		actions.perform();
		}
		wait(5);
		click(btnSave);
		verifyErrorMessage();
	}
	public void verifyErrorMessage(){
		if (elementExist(fNameErrorOnlyLetters)) {
			verifyLabel("fNameErrMsg",fNameErrMsg);
			verifyLabel("lNameErrMsg",lNameErrMsg);
			verifyLabel("newPassErrorMsg",newPassErrorMsg);
	     }
	}
	public void afterChangePassword() {
		wait(10);
		enterData("P@ssw0rd1",inpNewPass);
		enterData("P@ssw0rd1",inpConfirmPass);
		wait(5);
		WebElement element = driver.findElement(By.xpath("//input[contains(@value,'Save')]")); 
		if(BrowserFactory.getOS().equalsIgnoreCase("win")) {
		Actions actions = new Actions(driver); actions.moveToElement(element);
		actions.perform();
		}
		wait(5);
		click(btnSave);
		wait(5);
		enterData("Origin@123",inpNewPass);
		enterData("Origin@123",inpConfirmPass);
		wait(5);
		WebElement element1 = driver.findElement(By.xpath("//input[contains(@value,'Save')]"));
		if(BrowserFactory.getOS().equalsIgnoreCase("win")) {
		Actions actions1 = new Actions(driver); actions1.moveToElement(element1);
		actions1.perform();
		}
		wait(5);
		if(BrowserFactory.getOS().equalsIgnoreCase("win")) { 
		Actions actions = new Actions(driver); actions.moveToElement(element);
		actions.perform();
		}
		wait(5);
		click(btnSave);
		wait(5);
		WebElement element2 = driver.findElement(By.xpath("//div[contains(@class,'logout_pop')]/*//button[contains(@class,'circle-hover')]")); 
		if(BrowserFactory.getOS().equalsIgnoreCase("win")) {
		Actions actions2 = new Actions(driver); actions2.moveToElement(element2);
		actions2.perform();
		}
		wait(5);
		click(lblProfile);
		wait(5);
		click(logOutButton);
		wait(5);
	}
	public void verifyAfterCancelValidation() {
		clear(inpFName);
		clear(inpLName);
		enterData(getLabel("inpFName"), inpFName);
		enterData(getLabel("inpLName"), inpLName);
		enterData(getLabel("newPass"), inpNewPass);
		enterData(getLabel("confirmPass"), inpConfirmPass);
		click(btncancel);
		wait(5);
		verifyValue(getLabel("lblFName"),inpFName);//could not get text
		verifyValue(getLabel("lblLName"),inpLName);//could not get text
		wait(10);
		verifyText("",inpNewPass);	
		verifyText("",inpConfirmPass);
	}
}
