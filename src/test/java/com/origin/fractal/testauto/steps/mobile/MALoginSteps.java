package com.origin.fractal.testauto.steps.mobile;




import com.origin.fractal.testauto.FractalBaseStep;
import com.origin.fractal.testauto.pages.mobile.MALoginPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class MALoginSteps extends FractalBaseStep{//extends by Jan_16_19
	private MALoginPage page;

	public MALoginSteps(AppiumDriver<MobileElement> appDriver) {
		page = new MALoginPage(appDriver);
	}

	public void doLogin() {
		page.doLogin();
	}
	public void clickForgetPassword() {
		page.clickForgetPassword();
	}
	//**********added by mahesh from here **********//
	public void clickYesBtn() {
		page.clickYesBtn();
	}
	public void blankPasswordVerification() {
		result = "Passed";
		try{
			page.blankPasswordVerification();
		}catch(Exception e) {
			result = "FAILED";
			e.printStackTrace();
		}
	}
	public void blankUserName() {
		result = "Passed";
		try{
			page.blankUserName();
		}catch(Exception e) {
			result = "FAILED";
			e.printStackTrace();
		}
	}
	public void inValid() {
		result = "Passed";
		try{
			page.inValid();
		}
		catch(Exception e) {
			result = "FAILED";
			e.printStackTrace();
		}
	}
	public void blankUserNamePassword() {
		result = "Passed";
		try{
			page.blankUserNamePassword();
		}catch(Exception e) {
			result = "FAILED";
			e.printStackTrace();
		}
	}

	public void clickOnLogout() {
		page.clickOnLogout();
	}
	//**********added by mahesh till here **********//

	public void noInternetErrorVerify() {
		result = "Passed";
		try{
			page.noInternetErrorVerify();
		}
		catch(Exception e) {
			result = "FAILED";
			e.printStackTrace();
		}
	}
	//Updtaed by Manju Priya A on Jan_11_19
	public void verifyValidLogin() {
		result = "Passed";
		try{
			page.verifyValidLogin();
		}
		catch(Exception e) {
			result = "FAILED";
			e.printStackTrace();
		}
	}
	public void verifySplashScreen() {
		result = "Passed";
		try{
			page.verifySplashScreen();
		}catch(Exception e) {
			result = "FAILED";
			e.printStackTrace();
		}
	}
	public void verifyLogoutWithNoBtn() {
		result = "Passed";
		try{
			page.verifyLogoutWithNoBtn();
		}catch(Exception e) {
			result = "FAILED";
			e.printStackTrace();
		}
	}
	public void verifyLogoutWithYesBtn() {
		result = "Passed";
		try{
			page.verifyLogoutWithYesBtn();
		}
		catch(Exception e) {
			result = "FAILED";
			e.printStackTrace();
		}
	}
}
