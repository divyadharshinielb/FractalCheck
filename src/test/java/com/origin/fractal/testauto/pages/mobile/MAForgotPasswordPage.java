package com.origin.fractal.testauto.pages.mobile;

import org.openqa.selenium.By;

import com.origin.fractal.testauto.FractalAppPage;
import com.origin.fractal.testauto.GmailInbox;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class MAForgotPasswordPage extends FractalAppPage {
	//private By tbUserName = By.id("com.originkonnect.app:id/username");
//	private By tbPassword = By.id("com.originkonnect.app:id/password");
	private By lblForgotPassword = By.id("com.originkonnect.app:id/textView5");
//	private By btnLogin = By.id("com.originkonnect.app:id/login_btn");
	private By tbEmailId= By.id("com.originkonnect.app:id/enter_email");
	private By lblEmailError= By.id("com.originkonnect.app:id/userInput");
	private By lblSend= By.id("com.originkonnect.app:id/send_button");
	private By lblEmailId= By.id("com.originkonnect.app:id/enter_email");
	private By backBtn= By.id("com.originkonnect.app:id/action_bar_back");
	private By okBtn= By.id("com.originkonnect.app:id/btnAdd1");
	private By lblPassMissMatch= By.id("com.originkonnect.app:id/userInput");
	private By tbNewPass= By.id("com.originkonnect.app:id/editText4");
	private By tbConfirmPass= By.id("com.originkonnect.app:id/editText5");
	private By saveBtn= By.id("com.originkonnect.app:id/save");
	//Starts - Added by Manju Priya A on jan_17_19
	private By txtOTPSuccess= By.id("com.originkonnect.app:id/userInput");
	private By fieldEnterOTP= By.id("com.originkonnect.app:id/enter_otp");
	private By btnConfirm= By.id("com.originkonnect.app:id/confirm_button");
	private By lblChangePass= By.id("com.originkonnect.app:id/bundle_selected");
	private By txtboxNewPass= By.id("com.originkonnect.app:id/enter_password");
	private By txtboxConfirmPass= By.id("com.originkonnect.app:id/enter_confirm_password");
	private By btnTick= By.id("com.originkonnect.app:id/textView36");
	private By btnLogin= By.id("com.originkonnect.app:id/login_btn");
	private By lblConfirmOTP = By.id("com.originkonnect.app:id/bundle_selected");
	private By linkResend= By.id("com.originkonnect.app:id/resend");
	private By lblQuestionResend= By.id("com.originkonnect.app:id/textView18");
	private By errorWarning= By.id("com.originkonnect.app:id/userInput");
	GmailInbox gm = new GmailInbox();
	String otp ="";
	public MAForgotPasswordPage(AppiumDriver<MobileElement> appDriver) {
		super(appDriver);
		this.setLocators();
	}

	public void setLocators() {
		if(platform.equalsIgnoreCase("ios")) {
			/*tbUserName = By.xpath("//XCUIElementTypeImage[@name=\"iconUsername\"]/preceding-sibling::XCUIElementTypeTextField");
			tbPassword = By.xpath("//XCUIElementTypeImage[@name=\"iconPassword\"]/following-sibling::XCUIElementTypeSecureTextField");
			btnLogin = By.name("LOGIN");*/
			lblForgotPassword = By.xpath("//XCUIElementTypeButton[contains(@name,'Forgot Password?')]");
			lblEmailId = By.xpath("//XCUIElementTypeButton[contains(@name,'SEND')]/../XCUIElementTypeTextField");
			tbEmailId = By.xpath("//XCUIElementTypeButton[contains(@name,'SEND')]/../XCUIElementTypeTextField");
			lblSend = By.xpath("//XCUIElementTypeButton[contains(@name,'SEND')]");
			backBtn = By.xpath("//XCUIElementTypeButton[contains(@name,'back icon Green')]");
			lblEmailError = By.xpath("//XCUIElementTypeImage[contains(@name,'warningOutline')]/../../*//XCUIElementTypeStaticText");
			okBtn = By.xpath("//XCUIElementTypeButton[contains(@name,'OK')]");
			//Starts - Added by Manju Priya A on jan_17_19
			txtOTPSuccess= By.xpath("//XCUIElementTypeImage[contains(@name,'notificationOutline')]/../../*//XCUIElementTypeStaticText");
			fieldEnterOTP= By.xpath("//XCUIElementTypeButton[contains(@name,'CONFIRM')]/../XCUIElementTypeSecureTextField");
			btnConfirm= By.xpath("//XCUIElementTypeButton[contains(@name,'CONFIRM')]");
			lblChangePass= By.xpath("//XCUIElementTypeStaticText[contains(@name,'Change Password')]");
			txtboxNewPass= By.xpath("//XCUIElementTypeButton[contains(@name,'tick white')]/../XCUIElementTypeSecureTextField[1]");
			txtboxConfirmPass= By.xpath("//XCUIElementTypeButton[contains(@name,'tick white')]/../XCUIElementTypeSecureTextField[2]");
			btnTick= By.xpath("//XCUIElementTypeButton[contains(@name,'tick white')]");
			btnLogin= By.xpath("//XCUIElementTypeButton[contains(@name,'LOGIN')]");
			lblConfirmOTP = By.xpath("//XCUIElementTypeButton[contains(@name,'CONFIRM')]/../XCUIElementTypeStaticText[1]");
			linkResend= By.xpath("//XCUIElementTypeButton[contains(@name,'Resend')]");
			lblQuestionResend= By.xpath("//XCUIElementTypeButton[contains(@name,'Resend')]/../XCUIElementTypeStaticText");
			errorWarning= By.xpath("//XCUIElementTypeImage[contains(@name,'warningOutline')]/../../*//XCUIElementTypeStaticText");
		}
	}
	
	public void verifyForgotPassword() {
		wait(5);
		verifyText("Forgot Password?", getObj(lblForgotPassword));
		wait(5);
		click(getObj(lblForgotPassword));
		wait(5);
		verifyText("Enter Your Registered Email",getObj(lblEmailId));
		wait(5);
		verifyText("SEND",getObj(lblSend));
		wait(5);
		click(getObj(backBtn));
		wait(5);
	}
	public void verifyEmailError() {
		click(getObj(lblForgotPassword));
		wait(5);
		typeIntoElement("dghjhkfghjjgfk",getObj(tbEmailId));
		wait(5);
		click(getObj(lblSend));
		wait(5);
		verifyText("Oops! Email Id is not in the database.",getObj(lblEmailError));
		wait(5);
		click(getObj(okBtn));
		wait(5);
		//click(getObj(backBtn));
		wait(5);
	}
	//****************mahesh 20/12/2018***********//
	public void verifyNewPassError() {
		wait(5);
		typeIntoElement("P@ssw0rd",getObj(tbNewPass));
		wait(5);
		typeIntoElement("P@ssw0",getObj(tbConfirmPass));
		wait(5);
		click(getObj(saveBtn));
		wait(5);
		verifyText("Both passwords are mismatched!",getObj(lblPassMissMatch));
		wait(5);
		click(getObj(okBtn));
		wait(5);
		
	}
	//****************************//
	//Starts - Added by Manju Priya A on jan_17_19
	public void verifyWithInvalidDBEmail() {
		clear(tbEmailId);
		typeIntoElement("manjupriya.a@gmail.com",getObj(tbEmailId));
		click(getObj(lblSend));
		verifyText("Oops! Email Id is not in the database.",errorWarning);
		click(okBtn);
	}
	public void verifyOTPSentPopup() {
		clear(tbEmailId);
		typeIntoElement("automation_directuser@originlearning.com",getObj(tbEmailId));
		click(getObj(lblSend));
		wait(5);
		String otpSucc ="An One Time Password (OTP) has been sent to your mail. Please verify.";
		verifyText(otpSucc, txtOTPSuccess);
		click(okBtn);
	}
	public void verifyConfirmPassPage() {
		verifyText("Confirm Your OTP",lblConfirmOTP);
		if(platform.equalsIgnoreCase("ios")) {
			verifyText("Enter Your One Time Password (OTP)",getAttributeValueIos(fieldEnterOTP));
		}else {
			verifyText("Enter Your One Time Password (OTP)",getAttributeValue(fieldEnterOTP));
		}
		verifyText("CONFIRM",btnConfirm);
		verifyText("Haven't received OTP?",lblQuestionResend);
		verifyText("Resend",linkResend);
	}
	public void verifyInvalidOTPErrorMsg() {
		typeOTPIntoElement("123456",getObj(fieldEnterOTP));
		//click(btnConfirm);
		wait(5);
		verifyText("Sorry! The OTP you entered is wrong.",errorWarning);
		click(okBtn);
	}
	public void verifyOTPReceivedToEmail() {
		otp = gm.read();
		String otpReceived =otp;//have to get OTP from Mahesh/karpagavalli
		verifyOTPReceived(otpReceived);
	}
	public void verifyOTPReceived(String otp) {
		if(otp.length() == 6) {
			print("PASSED: OTP received successfully to registered email ");
		}else {
			print("FAILED: OTP not received to registered email ");
		}
	}
	public void verifyOTPWorkfFine() {
		String otpReceived =otp;//have to get OTP from Mahesh/karpagavalli
		clear(fieldEnterOTP);
		typeOTPIntoElement(otpReceived,getObj(fieldEnterOTP));
		//click(btnConfirm);
		verifyValidOTP();
	}
	public void verifyChangePassPage() {
		verifyText("Change Password",lblChangePass);
		if(platform.equalsIgnoreCase("ios")) {
			verifyText("New Password",getAttributeValueIos(txtboxNewPass));
			verifyText("Confirm Password",getAttributeValueIos(txtboxConfirmPass));
		}else {
			verifyText("New Password",getAttributeValue(txtboxNewPass));
			verifyText("Confirm Password",getAttributeValue(txtboxConfirmPass));
		}		
	}
	public void verifyValidOTP() {
		if(verifyText("Change Password", lblChangePass)){
			print("PASSED: OTP recived successfully");
		}else {
			print("FAILED: OTP not recived");
		}
	}
	public void verifySuccPasswordChange() {
		wait(10);
		if(verifyText("LOGIN",btnLogin)){
			print("PASSED: Password changed successfully");
		}else {
			print("FAILED: Password not changed successfully");
		}
	}
	public void verifyPasswordChange() {
		typeIntoElement("Auto@123",getObj(txtboxNewPass));
		typeIntoElement("Auto@123",getObj(txtboxConfirmPass));
		click(btnTick);
		wait(5);
		if(platform.equalsIgnoreCase("ios")) {
			
		}else {
			click(okBtn);
		}
		verifySuccPasswordChange();
	}
	//Ends - Added by Manju Priya A on jan_17_19
}