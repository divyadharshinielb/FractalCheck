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

public class IOSTestProd extends FractalBaseAppTest{
	private static AppiumDriver<MobileElement> appDriver;
	//Fine
	@Test(groups = { "pilot" }, enabled = true, description = "TCID_01:Verification of Splash Screen"
			+ "TCID_01: Verifying whether the splash screen appears after launching the app")
	public void verifySplashScreen() {
		System.out.println("---------------------------------------verifySplashScreen-------------------------------");
		appDriver = AppFactory.getiOSApp();
		//appDriver = AppFactory.getAndroidApp();
		MALoginSteps maLoginSteps = new MALoginSteps(appDriver);
		maLoginSteps.verifySplashScreen();
		Reporter.writeSummary("TCID_01, Verifying whether the splash screen appears after launching the app, " +  maLoginSteps.getResult());
		
		
		maLoginSteps.doLogin();   
		// Select Instance Screen
		MASelectInstanceSteps mASIS = new MASelectInstanceSteps(appDriver);
		mASIS.selectFractal();
		
		
		// What's New Screen MAWhatsNewSteps
		MAWhatsNewSteps mAWNS = new MAWhatsNewSteps(appDriver);
		wait(5);
		//mAWNS.clickLater();
		// My Learning Screen
		MAMyLearningInProSteps mAMLS = new MAMyLearningInProSteps(appDriver);
		
		//TCID_80: Verify the voice assitant is available in the My learning page on launching the app.
		mAMLS.verifyVoiceAssitant();
		Reporter.writeSummary("TCID_80, Verify the voice assitant is available in the Mylearning page on launching the app., " +  mAMLS.getResult());
		wait(5);
		
		maLoginSteps.verifyLogoutWithYesBtn();
		Reporter.writeSummary("TCID_78, Verifying whether the user can able to logout successfully on cliking the logout button. On Clicking Yes button., " +  maLoginSteps.getResult());
		
		
	}
	//fine
	@Test(groups = { "LoginPage0" }, enabled = true, description = "Verification of login Page"
			+ "TCID_2 : Verify user is able to login for origin fractal app with valid user name and password."
			+ "TCID_3: Verify the origin fractal app login page with invalid user name and password."
			+ "TCID_4: Verify the origin fractal app login page with invalid user name and  valid password."
			+ "TCID_5: Verify the origin fractal app login page with valid username and  invalid password.")
	public void LoginPage0() {
		appDriver = AppFactory.getiOSApp();
		//appDriver = AppFactory.getAndroidApp();
		print("---------------------------------------LoginPage0-------------------------------");
		MALoginSteps maLoginSteps = new MALoginSteps(appDriver);
		wait(10);
		
		//TCID_5: Verify the origin fractal app login page with valid username and  invalid password.
        maLoginSteps.blankPasswordVerification();
		Reporter.writeSummary("TCID_5, Verify the origin fractal app login page with valid username and  invalid password., " +  maLoginSteps.getResult());
		//TCID_4: Verify the origin fractal app login page with invalid user name and  valid password.
		maLoginSteps.blankUserName();
		Reporter.writeSummary("TCID_4, Verify the origin fractal app login page with invalid user name and  valid password., " +  maLoginSteps.getResult());
		//TCID_3: Verify the origin fractal app login page with invalid user name and password.
		maLoginSteps.inValid();
		Reporter.writeSummary("TCID_3, Verify the origin fractal app login page with invalid user name and password., " +  maLoginSteps.getResult());
		maLoginSteps.blankUserNamePassword();
		//TCID_2 : Verify user is able to login for origin fractal app with valid user name and password.
		maLoginSteps.verifyValidLogin();
		Reporter.writeSummary("TCID_2, Verify user is able to login for origin fractal app with valid user name and password., " +  maLoginSteps.getResult());
		
		MAMyLearningInProSteps mAMLS = new MAMyLearningInProSteps(appDriver);
		
		mAMLS.clickMenu();
		MAMenuOptionsSteps mAMnuSteps = new MAMenuOptionsSteps(appDriver);
		mAMnuSteps.clickOnLogout();
		
		MAForgotPasswordSteps maForgotPasswordSteps = new MAForgotPasswordSteps(appDriver);
		maForgotPasswordSteps.verifyForgotPassword();
		Reporter.writeSummary("TCID_6, Verify forgot password link available on login page, " +  maForgotPasswordSteps.getResult());
	}
	//fine//EEEEEeeeeeeeeeee
	@Test(groups = { "pilot" }, enabled = true, description = "TCID_25,26:Verification of Menus page"
			+ "25: Verify the Menu functionality is working fine"
			+ "26: Verify that user able to close menu section")
	public void verifyMenuPage() {
		System.out.println("-------------------------------------verifyMenuPage------------------------------------------");
		//appDriver = AppFactory.getAndroidApp();
		appDriver = AppFactory.getiOSApp();
		MALoginSteps maLoginSteps = new MALoginSteps(appDriver);
		maLoginSteps.doLogin();
		// Select Instance Screen
		MASelectInstanceSteps mASIS = new MASelectInstanceSteps(appDriver);
		mASIS.selectFractal();
		// What's New Screen MAWhatsNewSteps
		MAWhatsNewSteps mAWNS = new MAWhatsNewSteps(appDriver);
		wait(5);
		//mAWNS.clickLater();
		// My Learning Screen
		MAMyLearningInProSteps mAMLS = new MAMyLearningInProSteps(appDriver);
		// Menu Options Screen
		MAMenuOptionsSteps mAMnuSteps = new MAMenuOptionsSteps(appDriver);
		mAMnuSteps.verifyMenusFunctionality();
		Reporter.writeSummary("TCID_25,  Verify the Menu functionality is working fine, " +  mAMnuSteps.getResult());
		wait(5);
		//edit by divya commenting this as already menu button is clicked in previous function
		//mAMLS.clickMenu();
		mAMLS.clickMenuAccount();
		mAMnuSteps.clickOnLogout();//EEEEEeeeeeeeeeee
	}
	//fine//EEEEEeeeeeeeeeee1
	@Test(groups = { "pilot" }, enabled = true, description = "TCID_27,28,29,30,31,32,33,61:"
			+ "Verification of My Learning p   age"
			+ "TCID_27: Verify whether the user able be  to access the My Learning page"
			+ "TCID_28:Verify whether the user able be  to navigate correctly in both In progress and Completed Tabs."
			+ "TCID_29:Verify the Catalog items are displayed in an List View format on clicking the List view icon"
			+ "TCID_30:Verify the Catalog items are displayed in an Grid View format on clicking the Grid view icon"
			+ "TCID_31:Verify the  content which are not completed is displayed in the In Progress Tab"
			+ "TCID_32: Verify the name and type of the Content"
			+ "TCID_41: Verify the catalog item is displayed on entering any catalog item name in the search field")

	public void verifyHomePage() {
		appDriver = AppFactory.getiOSApp();
		//appDriver = AppFactory.getAndroidApp();
		System.out.println("-------------------------Verification of HomePage----------------------");

		MALoginSteps maLoginSteps = new MALoginSteps(appDriver);
		maLoginSteps.doLogin();
		// Select Instance Screen
		MASelectInstanceSteps mASIS = new MASelectInstanceSteps(appDriver);
		mASIS.selectFractal();
		
		MAWhatsNewSteps mAWNS = new MAWhatsNewSteps(appDriver);
		mAWNS.validateWhatsNewPage();
		//mAWNS.clickLater();

		MAMyLearningInProSteps mAMLS = new MAMyLearningInProSteps(appDriver);
		//TCID_27: Verify whether the user able be  to access the My Learning page
		mAMLS.validateMyLearningTitle();
		Reporter.writeSummary("TCID_27, Verify whether the user able be  to access the My Learning page, " +  mAMLS.getResult());
		//TCID_28: Verify whether the user able be  to navigate correctly in both In progress and Completed Tabs.
		mAMLS.verifyTwoTabsNavigation();//EEEEEeeeeeeeeeee
		Reporter.writeSummary("TCID_28, Verify whether the user able be  to navigate correctly in both In progress and Completed Tabs., " +  mAMLS.getResult());
		//mAMLS.verifyInProgress();
		//mAMLS.clickCompleted();
		//TCID_29: Verify the Catalog items are displayed in an List View format on clicking the List view icon
		mAMLS.verifyListView();
		Reporter.writeSummary("TCID_29, Verify the Catalog items are displayed in an List View format on clicking the List view icon, " +  mAMLS.getResult());
		//TCID_30: Verify the Catalog items are displayed in an Grid View format on clicking the Grid view icon
		mAMLS.verifyGridView();
		Reporter.writeSummary("TCID_30, Verify the Catalog items are displayed in an Grid View format on clicking the Grid view icon, " +  mAMLS.getResult());
		//Added on Dec-28-18  By manju Priya A
		//TCID_31: Verify the  content which are not completed is displayed in the In Progress Tab
		mAMLS.verifyInProgTabContents();
		//wait(20);
		Reporter.writeSummary("TCID_31, Verify the  content which are not completed is displayed in the In Progress Tab, " +  mAMLS.getResult());
		
		mAMLS.clickMenu();
		MAMenuOptionsSteps mAMnuSteps = new MAMenuOptionsSteps(appDriver);
		mAMnuSteps.clickOnLogout();

	}
	//repeatedly failing
	@Test(groups = { "pilot" }, enabled = true, description = "TCID_:Verification of My Account page"
			+ "TCID_62: Verifying whether the first  and last name accespts space"
			+ "TCID_63: Verifying whether the first  and last name accepts number"
			+ "TCID_64: Verifying whether the first  and last name accespts special charecters"
			+ "TCID_71: Verifying whether the New password and Confirm password fields accepts more than 8 characters"
			+ "TCID_72: Verifying whether the details are getting updated successfully if the New password and Confirm password have only alphabets"
			+ "TCID_73: Verifying whether the details are getting updated successfully if the New password and Confirm password have only numbers with 8 characters length")
	public void verifyMyAccountPage() {
		System.out.println("---------------------------My Account Verification----------------------------------");
		//appDriver = AppFactory.getAndroidApp();
		appDriver = AppFactory.getiOSApp();
		MALoginSteps maLoginSteps = new MALoginSteps(appDriver);
		maLoginSteps.doLogin();		
		// Select Instance Screen
		MASelectInstanceSteps mASIS = new MASelectInstanceSteps(appDriver);
		mASIS.selectFractal();
		// What's New Screen MAWhatsNewSteps
		MAWhatsNewSteps mAWNS = new MAWhatsNewSteps(appDriver);
		wait(5);
		//mAWNS.clickLater();
		// My Learning Screen
		MAMyLearningInProSteps mAMLS = new MAMyLearningInProSteps(appDriver);
		// Menu Options Screen
		MAMenuOptionsSteps mAMnuSteps = new MAMenuOptionsSteps(appDriver);
		
		mAMLS.clickMenu();
		mAMnuSteps.clickOnMyAccount();
		//My Account Screen
		MAMyAccountSteps mMyAcc = new MAMyAccountSteps(appDriver);
		String[] firstName = {" ","10","@#","Vel"};
		String[] lastName = {" ","10","!&*","Winvinaya"};
		//TCID_62: Verifying whether the first  and last name accepts space
		//mMyAcc.verifyFirstLastNameWithSpace(firstName[0], lastName[0]);
		Reporter.writeSummary("TCID_62, Verifying whether the first  and last name accespts space," +  mMyAcc.getResult());
		//TCID_63: Verifying whether the first  and last name accepts number
		//mMyAcc.verifyFirstLastNameWithNos(firstName[1], lastName[1]);
		Reporter.writeSummary("TCID_63, Verifying whether the first  and last name accespts number," +  mMyAcc.getResult());
		//TCID_64: Verifying whether the first  and last name accepts special characters
		//mMyAcc.verifyFirstLastNameWithSpecialChars(firstName[2], lastName[2]);
		Reporter.writeSummary("TCID_64, Verifying whether the first  and last name accespts special charecters," +  mMyAcc.getResult());
		
		//Commented because of the Password reset issue
		String[] newPassword = {"abcdegf123#^A","abcdefgh","12345678"};
		String[] confirmPassword = {"abcdegf123#^A","abcdefgh","12345678"};
		//TCID_71: Verifying whether the New password and Confirm password fields accepts more than 8 characters
		//edit by divya mMyAcc.verifyInvalidPassCredentials(newPassword[0], confirmPassword[0]);
		mMyAcc.verifySamePassCredentials(newPassword[0], confirmPassword[0]);
		Reporter.writeSummary("TCID_071,Verifying whether the New password and Confirm password fields accepts more than 8 characters, " +  mMyAcc.getResult() );
		//TCID_72: Verifying whether the details are getting updated successfully if the New password and Confirm password have only alphabets
		mMyAcc.verifyInvalidPassCredentials(newPassword[1], confirmPassword[1]);
		Reporter.writeSummary("TCID_072,Verifying whether the details are getting updated successfully if the New password and Confirm password have only alphabets, " +  mMyAcc.getResult() );
		//TCID_73: Verifying whether the details are getting updated successfully if the New password and Confirm password have only numbers with 8 characters length
		mMyAcc.verifyInvalidPassCredentials(newPassword[2], confirmPassword[2]);
		Reporter.writeSummary("TCID_073,Verifying whether the details are getting updated successfully if the New password and Confirm password have only numbers with 8 characters length, " +  mMyAcc.getResult() );
	// edit by divya mMyAcc.revertBackPassword("AutoDU@123","AutoDU@123");
		wait(5);
	// edit by divya	mMyAcc.backToMylearningIos();
		//For Logout
		wait(5);
		//edit by divya commented clickMenu() , because it is called in previous function
		mAMLS.clickMenuAccount();
		mAMnuSteps.clickOnLogout();
	}
	
	
}
