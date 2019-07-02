package com.origin.fractal.testauto.pages.mobile;

import org.openqa.selenium.By;

import com.origin.fractal.testauto.FractalAppPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class MAMyAccountPage extends FractalAppPage{

	private By txtFname = By.id("com.originkonnect.app:id/editText");
	private By txtLname = By.id("com.originkonnect.app:id/editText2");
	private By txtSave = By.id("com.originkonnect.app:id/save");
	private By txtSuccess = By.id("com.originkonnect.app:id/userInput");
	private By btnOK = By.id("com.originkonnect.app:id/btnAdd1");
	private By blankAlertMsg = By.id("com.originkonnect.app:id/userInput");

	private By btnMenuMyAcc = By.xpath("");//Added By manju Priya A on Jan_11_19 for IOS
	private By btnCatalog = By.id("com.originkonnect.app:id/catalog_text");//Added By manju Priya A on Jan_11_19 for IOS
	/*Starts - added by Manju Priya A on Jan-22-19*/
	private By txtNewPass = By.id("com.originkonnect.app:id/editText4");
	private By txtConfirmPass = By.id("com.originkonnect.app:id/editText5");
	private By lblPasswordAlert = By.id("com.originkonnect.app:id/userInput");
	/*Ends - added by Manju Priya A on Jan-22-19*/
	public MAMyAccountPage(AppiumDriver<MobileElement> appDriver) {
		super(appDriver);
		this.setLocators();
	}
	public void setLocators() {
		if(platform.equalsIgnoreCase("ios")) {
			txtFname = By.xpath("//XCUIElementTypeStaticText[contains(@value,'First Name:')]/../XCUIElementTypeTextField[1]");
			txtLname = By.xpath("//XCUIElementTypeStaticText[contains(@value,'Last Name:')]/../XCUIElementTypeTextField[1]");
			txtSave = By.xpath("//XCUIElementTypeButton[contains(@name,'SAVE')]");
			btnOK = By.xpath("//XCUIElementTypeButton[contains(@name,'OK')]");
			blankAlertMsg = By.xpath("//XCUIElementTypeImage[contains(@name,'warningOutline')]/../../*//XCUIElementTypeStaticText[1]");
			btnMenuMyAcc =	By.xpath("//XCUIElementTypeButton[@name='menuButton']");
			btnCatalog = By.xpath("//XCUIElementTypeImage[contains(@name,'CatalogIcon')]/../XCUIElementTypeButton[1]");
		}
	}

	public void verifyUserDeatils() {
		//Updated by Manju priya A on Jan_11_19
		if(platform.equalsIgnoreCase("ios")) {
			verifyText("Vel",getAttributeValueIos(txtFname));
			verifyText("Winvinaya",getAttributeValueIos(txtLname));
		}else {
			verifyText("Vel",getAttributeValue(txtFname));
			verifyText("Winvinaya",getAttributeValue(txtLname));
		}
	}
	public void verifyFirstLastNameWithSpace(String fName, String lName) {
		wait(5);
		clear(txtFname);
		clear(txtLname);
		//Updated by Manju Priya A on Jna_11_19
		if(platform.equalsIgnoreCase("ios")) {
			typeIntoElement(fName,getObj(txtFname));
			typeIntoElement(lName, getObj(txtLname));
		}
		else{
			enterData(fName, txtFname);
			enterData(fName, txtLname);
		}
		click(txtSave);
		if(elementExist(blankAlertMsg))
		{
		wait(3);
		verifyText("WHAT'S NEW?", getObj(blankAlertMsg));
		click(getObj(btnOK));
		}
		/*verifyFailure(blackAlertMsg);
		click(btnOK);*/
	}
	public void verifyFirstLastNameWithNos(String fName, String lName) {
		clear(txtFname);
		clear(txtLname);
		//Updated by Manju Priya A on Jna_11_19
		if(platform.equalsIgnoreCase("ios")) {
			typeIntoElement(fName,getObj(txtFname));
			typeIntoElement(lName, getObj(txtLname));
		}else {
			enterData(fName, txtFname);
			enterData(fName, txtLname);
		}
		click(txtSave);
		verifyFailure(blankAlertMsg);
		click(btnOK);
	}
	public void verifyFirstLastNameWithSpecialChars(String fName, String lName) {
		clear(txtFname);
		clear(txtLname);
		//Updated by Manju Priya A on Jna_11_19
		if(platform.equalsIgnoreCase("ios")) {
			typeIntoElement(fName,getObj(txtFname));
			typeIntoElement(lName, getObj(txtLname));
		}else {
			enterData(fName, txtFname);
			enterData(fName, txtLname);
		}
		click(txtSave);
		verifyFailure(blankAlertMsg);
		click(btnOK);
	}
	public void verifyWithValidCredential(String fName, String lName) {
		clear(txtFname);
		clear(txtLname);
		//Updated by Manju Priya A on Jna_11_19
		if(platform.equalsIgnoreCase("ios")) {
			typeIntoElement(fName,getObj(txtFname));
			typeIntoElement(lName, getObj(txtLname));
		}else {
			enterData(fName, txtFname);
			enterData(fName, txtLname);
		}
		click(txtSave);
		verifySuccess(blankAlertMsg);//Name updated from txtSuccess to blankAlert by Manju Priya A on Jna_11_19
		click(btnOK);
		//Updated by Manju Priya A on Jna_11_19
		if(platform.equalsIgnoreCase("ios")) {
			click(btnMenuMyAcc);
			click(btnCatalog);
		}
	}
	public void verifySuccess(By lobjPath) {
		verifyText("Your details are updated!", lobjPath);
	}
	public void verifyFailure(By lobjPath) {
		verifyText("First name cannot be blank.", lobjPath);
	}
	
	/*Starts - added by Manju Priya A on Jan-22-19*/
	public void verifyInvalidPassCredentials(String fName, String lName) {
		clear(txtNewPass);
		clear(txtConfirmPass);
		enterData(fName, txtNewPass);
		enterData(fName, txtConfirmPass);
		click(txtSave);
		verifyPasswordFailure(lblPasswordAlert);
		click(btnOK);
	}
	public void verifyPasswordFailure(By lobjPath) {
		verifyText("New Password must contain 8 characters, including one uppercase letter, one special character and alphanumeric characters.", lobjPath);
	}
	/*Ends - added by Manju Priya A on Jan-22-19*/
}
