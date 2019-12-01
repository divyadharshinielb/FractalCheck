package com.origin.fractal.testauto.test.testsuites.mobile;

import org.testng.annotations.Test;

import com.origin.fractal.testauto.steps.mobile.MACatalogSteps;
import com.origin.fractal.testauto.steps.mobile.MAForgotPasswordSteps;
import com.origin.fractal.testauto.steps.mobile.MALoginSteps;
import com.origin.fractal.testauto.steps.mobile.MAMenuOptionsSteps;
import com.origin.fractal.testauto.steps.mobile.MAMyAccountSteps;
import com.origin.fractal.testauto.steps.mobile.MAMyLearningInProSteps;
import com.origin.fractal.testauto.steps.mobile.MASelectInstanceSteps;
import com.origin.fractal.testauto.steps.mobile.MAWhatsNewSteps;
import com.origin.fractal.testauto.test.FractalBaseAppTest;
import com.wv.auto.framework.app.AppFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class AndroidLoginTests extends FractalBaseAppTest {

	private AppiumDriver<MobileElement> appDriver;

	@Test(groups = { "LoginPage0" }, enabled = true, description = "Combined mobile test")
	public void LoginPage0() {
		try {
		System.out.println("login0");
		appDriver = AppFactory.getAndroidApp();

		MALoginSteps maLoginSteps = new MALoginSteps(appDriver);
		
		maLoginSteps.blankPasswordVerification();
		maLoginSteps.blankUserName();
		maLoginSteps.inValid();
		maLoginSteps.blankUserNamePassword();
		maLoginSteps.doLogin();
		
		MAMenuOptionsSteps mAMnuSteps = new MAMenuOptionsSteps(appDriver);
		
		mAMnuSteps.clickOnLogout();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			appDriver.closeApp();
//			appDriver.resetApp();
		}
		
	}	
	@Test(groups = { "login1" }, enabled = true, description = "Combined mobile test")
		public void LoginPage1() {
		
		System.out.println("login1");
			appDriver = AppFactory.getAndroidApp();

		MALoginSteps maLoginSteps = new MALoginSteps(appDriver);
		maLoginSteps.doLogin();
		MASelectInstanceSteps mASIS = new MASelectInstanceSteps(appDriver);
		mASIS.validateInstanceSelectionPage();
		mASIS.swipeInstances();
		mASIS.selectFractal();
		maLoginSteps.clickYesBtn();		
	}

		@Test(groups = { "pilot" }, enabled = true, description = "TC10:Send button should not get enabled"
				+ "TC11:App should throw an error message saying Email id doesn't exist in database"
				+ "TC6:Verify forgot password link available on login page")
		  public void verifyForgotPassword() {
			appDriver = AppFactory.getAndroidApp();
			
			MAForgotPasswordSteps maForgotPasswordSteps = new MAForgotPasswordSteps(appDriver);
			//TCID_6:Verify forgot password link available on login page
			maForgotPasswordSteps.verifyForgotPassword();
			//TCID_10:Send button should not get enabled
			//TCID_11:App should throw an error message saying Email id doesn't exist in database
			maForgotPasswordSteps.verifyEmailError();
			MALoginSteps maLoginSteps = new MALoginSteps(appDriver);
			maLoginSteps.doLogin();
			MAMyLearningInProSteps mAMLS = new MAMyLearningInProSteps(appDriver);
			// Menu Options Screen
			MAMenuOptionsSteps mAMnuSteps = new MAMenuOptionsSteps(appDriver);
			MAWhatsNewSteps mAWNS = new MAWhatsNewSteps(appDriver);
			mAWNS.validateWhatsNewPage();
			mAWNS.clickLater();
			MASelectInstanceSteps mASIS = new MASelectInstanceSteps(appDriver);
			mASIS.validateInstanceSelectionPage();

			mASIS.swipeInstances();

			mASIS.selectFractal();
			mAMLS.clickMenu();
			mAMnuSteps.clickOnMyAccount();
			//TCID_18:Verify change password functionality working fine 
			maForgotPasswordSteps.verifyNewPassError();
			maLoginSteps.clickYesBtn();	
		}
}
