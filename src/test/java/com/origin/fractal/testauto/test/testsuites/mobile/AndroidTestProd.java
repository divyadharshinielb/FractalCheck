package com.origin.fractal.testauto.test.testsuites.mobile;

import org.testng.annotations.Test;

import com.origin.fractal.testauto.steps.mobile.MAForgotPasswordSteps;
import com.origin.fractal.testauto.steps.mobile.MALoginSteps;
import com.origin.fractal.testauto.steps.mobile.MAMenuOptionsSteps;
import com.origin.fractal.testauto.steps.mobile.MAMyAccountSteps;
import com.origin.fractal.testauto.steps.mobile.MAMyLearningInProSteps;
import com.origin.fractal.testauto.steps.mobile.MASelectInstanceSteps;
import com.origin.fractal.testauto.steps.mobile.MAWhatsNewSteps;
import com.origin.fractal.testauto.test.FractalBaseAppTest;
import com.wv.auto.framework.app.AppFactory;
import com.wv.auto.framework.utils.Reporter;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class AndroidTestProd extends FractalBaseAppTest{
	private AppiumDriver<MobileElement> appDriver;
	@Test(groups = { "pilot" },priority= 0, enabled = true, description = "TCID_01:Verification of Splash Screen"
		+ "TCID_01: Verify the splash screen after login to the application,")
		public void verifySplashScreen() {
		System.out.println("---------------------------------------verifySplashScreen-------------------------------");
		appDriver = AppFactory.getAndroidApp();
		MALoginSteps maLoginSteps = new MALoginSteps(appDriver);
		maLoginSteps.verifySplashScreen();
		Reporter.writeSummary("TCID_001, Verifying whether the splash screen appears after launching the app, " +  maLoginSteps.getResult());
		MASelectInstanceSteps mASIS = new MASelectInstanceSteps(appDriver);
		maLoginSteps.doLogin();	
		mASIS.selectFractal();
		wait(5);
		// My Learning Screen
		MAMyLearningInProSteps mAMLS = new MAMyLearningInProSteps(appDriver);
		// Menu Options Screen
		MAMenuOptionsSteps mAMnuSteps = new MAMenuOptionsSteps(appDriver);
		mAMLS.clickMenu();
		mAMnuSteps.clickOnLogout();
		Reporter.writeSummary("TCID_078,Verifying whether the user can able to logout successfully on clicking the logout button, " +  mAMnuSteps.getResult() );
		
	}
	@Test(groups = { "LoginPage0" }, priority =1,enabled = true, description = "Combined mobile test")
	public void LoginPage() {
		System.out.println("TCID_002,003,004,005,006: Verification of Login Page");
		appDriver = AppFactory.getAndroidApp();

		MALoginSteps maLoginSteps = new MALoginSteps(appDriver);
		MASelectInstanceSteps mASIS = new MASelectInstanceSteps(appDriver);
		wait(5);
		maLoginSteps.blankPasswordVerification();
		maLoginSteps.blankUserName();
		Reporter.writeSummary("TCID_004,  Verify the origin fractal app login page with invalid user name and  valid password., " +  maLoginSteps.getResult() );
		maLoginSteps.inValid();
		Reporter.writeSummary("TCID_003,  Verify the origin fractal app login page with invalid user name and password., " +  maLoginSteps.getResult() );
		maLoginSteps.blankUserNamePassword();
		Reporter.writeSummary("TCID_005,  Verify the origin fractal app login page with blank values for username and password, " +  maLoginSteps.getResult() );
		wait(5);
		maLoginSteps.doLogin();
		mASIS.selectFractal();
		wait(5);
		Reporter.writeSummary("TCID_002,  Verify user is able to login for origin fractal app with valid user name and password., " +  maLoginSteps.getResult() );
		
		MAMyLearningInProSteps mAMLS = new MAMyLearningInProSteps(appDriver);
		MAMenuOptionsSteps mAMnuSteps = new MAMenuOptionsSteps(appDriver);
		mAMLS.clickMenu();
		wait(5);
		mAMnuSteps.clickOnLogout();
		
		MAForgotPasswordSteps maForgotPasswordSteps = new MAForgotPasswordSteps(appDriver);
		maForgotPasswordSteps.verifyForgotPassword();
		Reporter.writeSummary("TCID_006, Verify forgot password link available on login page, " +  maForgotPasswordSteps.getResult());
	}
	@Test(groups = { "pilot" }, priority=2,enabled = true, description = "TCID_25:Verification of Menus page"
			+ "25: Verify the Menu functionality is working fine")
	public void verifyMenuPage() {
		appDriver = AppFactory.getAndroidApp();

		MALoginSteps maLoginSteps = new MALoginSteps(appDriver);
		maLoginSteps.doLogin();		
		// Select Instance Screen
		MASelectInstanceSteps mASIS = new MASelectInstanceSteps(appDriver);
		//mASIS.selectFractalDemo();
		// What's New Screen MAWhatsNewSteps
		MAWhatsNewSteps mAWNS = new MAWhatsNewSteps(appDriver);
		wait(5);
		//mAWNS.clickLater();
		mASIS.selectFractal();
		wait(5);
		// My Learning Screen
		MAMyLearningInProSteps mAMLS = new MAMyLearningInProSteps(appDriver);
		MAMenuOptionsSteps mAMnuSteps = new MAMenuOptionsSteps(appDriver);
		mAMnuSteps.verifyMenusFunctionality();
		Reporter.writeSummary("TCID_025,Verify the Menu functionality is working fine, " +  mAMnuSteps.getResult() );
		mAMLS.clickMenu();
		mAMnuSteps.clickOnLogout();
	}
	@Test(groups = { "pilot" },priority=3, enabled = true, description = "TCID_27,28,29,30,31,32,61:"
			+ "Verification of My Learning page"
			+ "27: Verify whether the user able be  to access the My Learning page"
			+ "28:Verify whether the user able be  to navigate correctly in both In progress and Completed Tabs."
			+ "29:Verify the Catalog items are displayed in an List View format on clicking the List view icon"
			+ "30:Verify the Catalog items are displayed in an Grid View format on clicking the Grid view icon"
			+ "31:Verify the  content which are not completed is displayed in the In Progress Tab")

	public void verifHomePage() {
		appDriver = AppFactory.getAndroidApp();
		System.out.println("pilot29");

		MALoginSteps maLoginSteps = new MALoginSteps(appDriver);
		maLoginSteps.doLogin();
		// Select Instance Screen
		MASelectInstanceSteps mASIS = new MASelectInstanceSteps(appDriver);
		/*mASIS.validateInstanceSelectionPage();

		mASIS.swipeInstances();*/

		mASIS.selectFractal();
		wait(5);
		MAWhatsNewSteps mAWNS = new MAWhatsNewSteps(appDriver);
		mAWNS.validateWhatsNewPage();
		mAWNS.clickLater();

		MAMyLearningInProSteps mAMLS = new MAMyLearningInProSteps(appDriver);
		Reporter.writeSummary("TCID_027,Verify whether the user able be  to access the My Learning page, " +  mAMLS.getResult() );
		mAMLS.verifyInProgress();
		Reporter.writeSummary("TCID_028,Verify whether the user able be  to navigate correctly in both In progress and Completed Tabs., " +  mAMLS.getResult() );
		mAMLS.verifyGridView();
		Reporter.writeSummary("TCID_030,Verify the Catalog items are displayed in an Grid View format on clicking the Grid view icon, " +  mAMLS.getResult() );
		mAMLS.verifyListView();
		Reporter.writeSummary("TCID_029,Verify the Catalog items are displayed in an List View format on clicking the List view icon, " +  mAMLS.getResult() );
		mAMLS.clickCompleted();
		Reporter.writeSummary("TCID_031,Verify the  content which are not completed is displayed in the In Progress Tab, " +  mAMLS.getResult() );
		
		MAMenuOptionsSteps mAMnuSteps = new MAMenuOptionsSteps(appDriver);
		wait(5);
		mAMLS.clickMenu();
		mAMnuSteps.clickOnLogout();
	}
	@Test(groups = { "pilot" },priority=4, enabled = true, description = "TCID_:Verification of My Account page"
			+ "61: Verifying whether the user details are displayed correctly in the My Account page"
			+ "62: Verifying whether the first  and last name accespts space"
			+ "63: Verifying whether the first  and last name accespts number"
			+ "64: Verifying whether the first  and last name accespts special charecters"
			+ "70: Verifying whether the valid  first  and last names are updated successfully")
	public void verifyMyAccountPage() {
		System.out.println("61");
		appDriver = AppFactory.getAndroidApp();

		MALoginSteps maLoginSteps = new MALoginSteps(appDriver);
		MASelectInstanceSteps mASIS = new MASelectInstanceSteps(appDriver);
		maLoginSteps.doLogin();		
		mASIS.selectFractal();
		wait(5);
		// Select Instance Screen
		//mASIS.selectFractalDemo();
		// What's New Screen MAWhatsNewSteps
		MAWhatsNewSteps mAWNS = new MAWhatsNewSteps(appDriver);
		wait(5);
		mAWNS.clickLater();
		// My Learning Screen
		MAMyLearningInProSteps mAMLS = new MAMyLearningInProSteps(appDriver);
		// Menu Options Screen
		MAMenuOptionsSteps mAMnuSteps = new MAMenuOptionsSteps(appDriver);
		mAMLS.clickMenu1();
		mAMnuSteps.clickOnMyAccount();
		//My Account Screen
		MAMyAccountSteps mMyAcc = new MAMyAccountSteps(appDriver);
		
		String[] firstName = {" ","10","@#","Vel"};
		String[] lastName = {" ","10","!&*","Winvinaya"};
		mMyAcc.verifyFirstLastNameWithSpace(firstName[0], lastName[0]);
		Reporter.writeSummary("TCID_062,Verifying whether the first  and last name accepts space, " +  mMyAcc.getResult() );
		mMyAcc.verifyFirstLastNameWithNos(firstName[1], lastName[1]);
		Reporter.writeSummary("TCID_063,Verifying whether the first  and last name accepts number, " +  mMyAcc.getResult() );
		mMyAcc.verifyFirstLastNameWithSpecialChars(firstName[2], lastName[2]);
		Reporter.writeSummary("TCID_064,Verifying whether the first  and last name accepts special characters, " +  mMyAcc.getResult() );
		/*Starts - added by Manju Priya A on Jan-22-19*/
		//Commented because of the Password reset issue
		String[] newPassword = {"abcdegf123#^A","abcdefgh","12345678"};
		String[] confirmPassword = {"abcdegf123#^A","abcdefgh","12345678"};
		mMyAcc.verifyInvalidPassCredentials(newPassword[0], confirmPassword[0]);
		Reporter.writeSummary("TCID_071,Verifying whether the New password and Confirm password fields accepts more than 8 characters, " +  mMyAcc.getResult() );
		mMyAcc.verifyInvalidPassCredentials(newPassword[1], confirmPassword[1]);
		Reporter.writeSummary("TCID_072,Verifying whether the details are getting updated successfully if the New password and Confirm password have only alphabets, " +  mMyAcc.getResult() );
		mMyAcc.verifyInvalidPassCredentials(newPassword[2], confirmPassword[2]);
		Reporter.writeSummary("TCID_073,Verifying whether the details are getting updated successfully if the New password and Confirm password have only numbers with 8 characters length, " +  mMyAcc.getResult() );
		/*Ends - added by Manju Priya A on Jan-22-19*/
		//For Logout
		mAMLS.clickMenu();
		mAMnuSteps.clickOnLogout();
	}
	@Test(groups = { "pilot" }, priority=5,enabled = true, description = "TCID_20,21:Verification of Select client page"
			+ "20: Verify that assigned clients are listed for user"
			+ "21: Verify that user able to select their 'Learning site' ")
	public void verifySelectClientPage() {
		appDriver = AppFactory.getAndroidApp();
		System.out.println("21");

		MALoginSteps maLoginSteps = new MALoginSteps(appDriver);
		MASelectInstanceSteps mASIS = new MASelectInstanceSteps(appDriver);
		maLoginSteps.doLogin();	
		mASIS.selectFractal();
		wait(5);
		// My Learning Screen
		MAMyLearningInProSteps mAMLS = new MAMyLearningInProSteps(appDriver);
		// Menu Options Screen
		MAMenuOptionsSteps mAMnuSteps = new MAMenuOptionsSteps(appDriver);
		mAMLS.clickMenu();
		mAMnuSteps.clickOnLogout();
		Reporter.writeSummary("TCID_078,Verifying whether the user can able to logout successfully on clicking the logout button, " +  mAMnuSteps.getResult() );
		
	}
}
