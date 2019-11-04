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
	//edit by divya
	private By returnkey = By.id("Return");
	private By lblsamepassAlert = By.id("Oops! New password cannot be same as the old password.");
	private By btnMyAcc = By.id("com.originkonnect.app:id/myaccount");
	/*Ends - added by Manju Priya A on Jan-22-19*/
	public MAMyAccountPage(AppiumDriver<MobileElement> appDriver) {
		super(appDriver);
		this.setLocators();
	}
	public void setLocators() {
		if(platform.equalsIgnoreCase("ios")) {
			//edit by divya txtFname = By.xpath("//XCUIElementTypeStaticText[contains(@value,'First Name:')]/../XCUIElementTypeTextField[1]");
			txtFname = By.xpath("//XCUIElementTypeApplication[@name=\"Origin Fractal\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTextField");
			//edit bydivya txtLname = By.xpath("//XCUIElementTypeStaticText[contains(@value,'Last Name:')]/../XCUIElementTypeTextField[1]");
			txtLname = By.xpath("//XCUIElementTypeApplication[@name=\"Origin Fractal\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeTextField");
			txtSave = By.xpath("//XCUIElementTypeButton[@name=\"SAVE\"]"); 	//XCUIElementTypeButton[@name="SAVE"]
			btnOK = By.xpath("//XCUIElementTypeApplication[@name=\"Origin Fractal\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther"); //XCUIElementTypeApplication[@name="Origin Fractal"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther
			blankAlertMsg = By.xpath("//XCUIElementTypeImage[contains(@name,'warningOutline')]/../../*//XCUIElementTypeStaticText[1]");
			btnMenuMyAcc =	By.xpath("//XCUIElementTypeButton[@name='menuButton']");
			btnCatalog = By.xpath("//XCUIElementTypeImage[contains(@name,'CatalogIcon')]/../XCUIElementTypeButton[1]");
		//edit by divya
			txtNewPass = By.xpath("//XCUIElementTypeApplication[@name=\"Origin Fractal\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[5]/XCUIElementTypeSecureTextField");
			txtConfirmPass = By.xpath("//XCUIElementTypeApplication[@name=\"Origin Fractal\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[6]/XCUIElementTypeSecureTextField");
			lblPasswordAlert= By.xpath("//XCUIElementTypeStaticText[contains(@name, 'Your password must be minimum 8 characters or longer, including at least one number, one special character and one uppercase letter.')]");  //XCUIElementTypeApplication[@name=\"Origin Fractal\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther
		returnkey = By.xpath("//XCUIElementTypeButton[@name=\"Return\"]");
		lblsamepassAlert = By.xpath("//XCUIElementTypeStaticText[@name=\"Oops! New password cannot be same as the old password.\"]"); //XCUIElementTypeStaticText[@name="Oops! New password cannot be same as the old password."]
		btnMyAcc = By.xpath("//XCUIElementTypeStaticText[contains(@value,'MY ACCOUNT')]/../XCUIElementTypeButton[1]");
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
		//updated by divya
		verifyText("Your details are updated!", getObj(blankAlertMsg));
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
			enterData(lName, txtLname);
		}
		click(txtSave);
		//updated by divya verifyFailure(blankAlertMsg);
		verifyText("Your details are updated!", getObj(blankAlertMsg));
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
			//edit by divya , changed fName to lName in this full page
			enterData(lName, txtLname);
		}
		click(txtSave);
		//updated by divya verifyFailure(blankAlertMsg);
		verifyText("Your details are updated!", getObj(blankAlertMsg));
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
			enterData(lName, txtLname);
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
	/*	//Updated by Divya 
		if(platform.equalsIgnoreCase("ios")) { 
			typeIntoElement(fName,getObj(txtNewPass));
			typeIntoElement(lName,getObj(txtConfirmPass));
		}
		else {
		enterData(fName, txtNewPass);
		enterData(lName, txtConfirmPass);
		}*/
		wait(5);
		enterData(fName, txtNewPass);
		wait(5);
		enterData(lName, txtConfirmPass);
		wait(10);
		click(returnkey);
		click(txtSave);
		wait(5);
		verifyPasswordFailure(lblPasswordAlert);
		wait(5);
		click(btnOK);
		
	}
	//edit by divya from here
	public void verifySamePassCredentials(String fName, String lName) {
		clear(txtNewPass);
		clear(txtConfirmPass);
	/*	//Updated by Divya 
		if(platform.equalsIgnoreCase("ios")) { 
			typeIntoElement(fName,getObj(txtNewPass));
			typeIntoElement(lName,getObj(txtConfirmPass));
		}
		else {
		enterData(fName, txtNewPass);
		enterData(lName, txtConfirmPass);
		}*/
		wait(10);
		enterData(fName, txtNewPass);
		wait(5);
		enterData(lName, txtConfirmPass);
		wait(10);
		click(returnkey);
		click(txtSave);
		wait(5);
		verifyPasswordSimilarMsg(lblsamepassAlert);
		wait(5);
		click(btnOK);
	}//ends here
	public void verifyPasswordFailure(By lobjPath) {
		verifyText("Your password must be minimum 8 characters or longer, including at least one number, one special character and one uppercase letter.", lobjPath);
	}
	public void verifyPasswordSimilarMsg(By lobjPath) {
		verifyText("Oops! New password cannot be same as the old password.", lobjPath);
	}
	/*Ends - added by Manju Priya A on Jan-22-19*/
}
