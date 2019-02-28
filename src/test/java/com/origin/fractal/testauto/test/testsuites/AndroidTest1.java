package com.origin.fractal.testauto.test.testsuites;

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
import com.wv.auto.framework.utils.Reporter;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class AndroidTest1 extends FractalBaseAppTest {

	private AppiumDriver<MobileElement> appDriver;

	@Test(groups = { "pilot" }, enabled = false, description = "TCID_:Verification of My Account page"
			+ "61: Verifying whether the user details are displayed correctly in the My Account page"
			+ "62: Verifying whether the first  and last name accespts space"
			+ "63: Verifying whether the first  and last name accespts number"
			+ "64: Verifying whether the first  and last name accespts special charecters"
			+ "70: Verifying whether the valid  first  and last names are updated successfully")
	public void verifyMyAccountPage() {
		System.out.println("61");
		appDriver = AppFactory.getAndroidApp();

		MALoginSteps maLoginSteps = new MALoginSteps(appDriver);
		maLoginSteps.doLogin();		
		// Select Instance Screen
		MASelectInstanceSteps mASIS = new MASelectInstanceSteps(appDriver);
		mASIS.selectFractalDemo();
		// What's New Screen MAWhatsNewSteps
		MAWhatsNewSteps mAWNS = new MAWhatsNewSteps(appDriver);
		wait(5);
		mAWNS.clickLater();
		// My Learning Screen
		MAMyLearningInProSteps mAMLS = new MAMyLearningInProSteps(appDriver);
		// Menu Options Screen
		MAMenuOptionsSteps mAMnuSteps = new MAMenuOptionsSteps(appDriver);
		mAMLS.clickMenu();
		mAMnuSteps.clickOnMyAccount();
		//My Account Screen
		MAMyAccountSteps mMyAcc = new MAMyAccountSteps(appDriver);
		mMyAcc.verifyUserDeatils();
		String[] firstName = {" ","10","@#","Vel"};
		String[] lastName = {" ","10","!&*","Winvinaya"};
		mMyAcc.verifyFirstLastNameWithSpace(firstName[0], lastName[0]);
		mMyAcc.verifyFirstLastNameWithNos(firstName[1], lastName[1]);
		mMyAcc.verifyFirstLastNameWithSpecialChars(firstName[2], lastName[2]);
		mMyAcc.verifyWithValidCredential(firstName[3], lastName[3]);
		//For Logout
		mAMLS.clickMenu();
		mAMnuSteps.clickOnLogout();
	}
	//Done Integration
	@Test(groups = { "pilot" }, enabled = false, description = "TCID_25,26:Verification of Menus page"
			+ "25: Verify the Menu functionality is working fine"
			+ "26: Verify that user able to close menu section")
	public void verifyMenuPage() {
		System.out.println("25");
		appDriver = AppFactory.getAndroidApp();

		MALoginSteps maLoginSteps = new MALoginSteps(appDriver);
		maLoginSteps.doLogin();		
		// Select Instance Screen
		MASelectInstanceSteps mASIS = new MASelectInstanceSteps(appDriver);
		mASIS.selectFractalDemo();
		// What's New Screen MAWhatsNewSteps
		MAWhatsNewSteps mAWNS = new MAWhatsNewSteps(appDriver);
		wait(5);
		mAWNS.clickLater();
		// My Learning Screen
		MAMyLearningInProSteps mAMLS = new MAMyLearningInProSteps(appDriver);
		MAMenuOptionsSteps mAMnuSteps = new MAMenuOptionsSteps(appDriver);
		mAMnuSteps.verifyCloseMenuFunctionality();
		mAMLS.clickMenu();
		mAMnuSteps.clickOnLogout();
	}

	@Test(groups = { "pilot" }, enabled = false, description = "TCID_20,21:Verification of Select client page"
			+ "20: Verify that assigned clients are listed for user"
			+ "21: Verify that user able to select their 'Learning site' ")
	public void verifySelectClientPage() {
		appDriver = AppFactory.getAndroidApp();
		System.out.println("21");

		MALoginSteps maLoginSteps = new MALoginSteps(appDriver);
		maLoginSteps.doLogin();		
		// Select Instance Screen
		MASelectInstanceSteps mASIS = new MASelectInstanceSteps(appDriver);
		// My Learning Screen
		MAMyLearningInProSteps mAMLS = new MAMyLearningInProSteps(appDriver);
		// Menu Options Screen
		MAMenuOptionsSteps mAMnuSteps = new MAMenuOptionsSteps(appDriver);
		//String[] instances = {"Fractal","Fractal Demo"};
		/*Starts - Dec-13-18*/
		mASIS.verifyInstances();
		mASIS.verifyFractalSelection();
		wait(5);
		mASIS.verifyFractalDemoSelection();
		/*Ends - Dec-13-18*/
		mAMLS.clickMenu();
		mAMnuSteps.clickOnLogout();
	}

	@Test(groups = { "pilot" }, enabled = false, description = "TCID_58,59,60:Verification of Notification page"
			+ "58: Verifying whether the assigned content is getting displayed on clicking the notification bell icon"
			+ "59: Verifying whether all the assigned items are getting displayed on clicking the more button"
			+ "60: Verifyiong whether the content is accessible from the notification page")
	public void verifyNotificationPage() {
		appDriver = AppFactory.getAndroidApp();
		System.out.println("60");

		MALoginSteps maLoginSteps = new MALoginSteps(appDriver);
		maLoginSteps.doLogin();
		// Select Instance Screen
		MASelectInstanceSteps mASIS = new MASelectInstanceSteps(appDriver);
		mASIS.selectFractal();
		// What's New Screen MAWhatsNewSteps
		MAWhatsNewSteps mAWNS = new MAWhatsNewSteps(appDriver);
		wait(5);
		mAWNS.clickLater();
		// My Learning Screen
		MAMyLearningInProSteps mAMLS = new MAMyLearningInProSteps(appDriver);
		// Menu Options Screen
		MAMenuOptionsSteps mAMnuSteps = new MAMenuOptionsSteps(appDriver);
		/*Starts - Dec-07-18*/
		mAMLS.clickNotification();
		mAMLS.verifyNotification();
		/*Ends - Dec-07-18*/
		/*Starts - Dec-12-18*/
		mAMLS.verifyMoreButton();
		mAMLS.verifyContentAccess();
		/*Ends - Dec-12-18*/
		mAMLS.clickMenu();
		mAMnuSteps.clickOnLogout();
	}
	
	
	/*Added by Manju Priya A - Dec-03-18*/
	@Test(groups = { "pilot" }, enabled = false, description = "TCID_42,43,50,45,47:Verification of catalog page"
			+ "42: Verify Popular categories are listed in the Catalog page"
			+ "43: Verify what's new contents are listed in the Catalog page"
			+ "45: Verify the BUY button for the paid catalog item"
			+ "50: Verify the filter icon is displayed"
			+ "47: Verify the Catalogs are displayed correspond to the selected Category under Popular category")
	public void verifyCatalogPage0() {
		appDriver = AppFactory.getAndroidApp();
		System.out.println("42");

		MALoginSteps maLoginSteps = new MALoginSteps(appDriver);
		maLoginSteps.doLogin();
		// Select Instance Screen
		MASelectInstanceSteps mASIS = new MASelectInstanceSteps(appDriver);
		//mASIS.selectFractal();
		mASIS.selectFractalDemo();
		// What's New Screen MAWhatsNewSteps
		MAWhatsNewSteps mAWNS = new MAWhatsNewSteps(appDriver);
		wait(5);
		mAWNS.clickLater();
		// My Learning Screen
		MAMyLearningInProSteps mAMLS = new MAMyLearningInProSteps(appDriver);
		mAMLS.clickMenu();
		// Menu Options Screen
		MAMenuOptionsSteps mAMnuSteps = new MAMenuOptionsSteps(appDriver);
		mAMnuSteps.clickOnCategory();
		// Catalog Screen
		MACatalogSteps mACatSteps = new MACatalogSteps(appDriver);
		/*Starts - Dec-03-18*/
		wait(5);
		mACatSteps.verifyPopularCategory();
		mACatSteps.verifyWhatsNewContents();
		/*Ends - Dec-03-18*/
		/*Starts - Dec-06-18*/
		mACatSteps.verifyFilterExist() ;
		/*Ends - Dec-06-18*/
		/*Starts - Dec-10-18*/
		mACatSteps.verifyBuyButton();
		mACatSteps.verifyCategory();
		/*Ends - Dec-10-18*/
		mAMLS.clickMenu();
		mAMnuSteps.clickOnLogout();
	}
	/*Added by Manju Priya A - Dec-10-18*/
	@Test(groups = { "pilot" }, enabled = false, description = "TCID_48,49,51,52,53,54,55,56:Verification of catalog page"
			+ "48: Verify LIST view"
			+ "49: Verify GRID view"
			+ "51: Verify bundle filter"
			+ "52: Verify learning path filter"
			+ "53: Verify course filter"
			+ "54: Verify resource filter"
			+ "55: Verify all the contents are displayed if the All Filter is applied"
			+ "56: Verify the Language filter is working fine")
	public void verifyCatalogPage1() {
		appDriver = AppFactory.getAndroidApp();
		System.out.println("51");

		MALoginSteps maLoginSteps = new MALoginSteps(appDriver);
		maLoginSteps.doLogin();
		// Select Instance Screen
		MASelectInstanceSteps mASIS = new MASelectInstanceSteps(appDriver);
		//mASIS.selectFractal();
		mASIS.selectFractalDemo();
		// What's New Screen MAWhatsNewSteps
		MAWhatsNewSteps mAWNS = new MAWhatsNewSteps(appDriver);
		wait(5);
		mAWNS.clickLater();
		// My Learning Screen
		MAMyLearningInProSteps mAMLS = new MAMyLearningInProSteps(appDriver);
		mAMLS.clickMenu();
		// Menu Options Screen
		MAMenuOptionsSteps mAMnuSteps = new MAMenuOptionsSteps(appDriver);
		mAMnuSteps.clickOnCategory();
		// Catalog Screen
		MACatalogSteps mACatSteps = new MACatalogSteps(appDriver);
		
		mACatSteps.verifyListView();
		mACatSteps.verifyGridView();
		/*Ends - Dec-10-18*/
		
		/*Starts - Dec-11-18*/
		mACatSteps.verifyBundleFilter();
		mACatSteps.verifyLpathFilter();
		mACatSteps.verifyCourseFilter();
		mACatSteps.verifyResourceFilter();
		/*Ends - Dec-11-18*/
		/*Starts - Dec-12-18*/
		mACatSteps.verifyAllFilter();
		mACatSteps.verifyLangFilter();
		/*Ends - Dec-12-18*/
		wait(5);
		mAMLS.clickMenu();
		mAMnuSteps.clickOnLogout();
		
	}
	@Test(groups = { "pilot" }, enabled = false, description = "Combined mobile test")
	public void mobileTest() {
		System.out.println("pilot");
		try {
			appDriver = AppFactory.getAndroidApp();

			MALoginSteps maLoginSteps = new MALoginSteps(appDriver);
			maLoginSteps.doLogin();

			// Select Instance Screen
			MASelectInstanceSteps mASIS = new MASelectInstanceSteps(appDriver);
			mASIS.validateInstanceSelectionPage();

			mASIS.swipeInstances();

			mASIS.selectFractal();

			// What's New Screen MAWhatsNewSteps
			MAWhatsNewSteps mAWNS = new MAWhatsNewSteps(appDriver);
			mAWNS.validateWhatsNewPage();
			mAWNS.clickLater();

			// My Learning Screen
			MAMyLearningInProSteps mAMLS = new MAMyLearningInProSteps(appDriver);
			mAMLS.validateMyLearningTitle();
			mAMLS.clickCompleted();
			mAMLS.clickMenu();

			// Menu Options Screen
			MAMenuOptionsSteps mAMnuSteps = new MAMenuOptionsSteps(appDriver);
			mAMnuSteps.validateCategoryPresence();
			mAMnuSteps.clickOnCategory();

			// Catalog Screen
			MACatalogSteps mACatSteps = new MACatalogSteps(appDriver);
			mACatSteps.validateCatalogPageTile();
			mACatSteps.verifyBuyPresence();

			mAMLS.clickMenu();
			mAMnuSteps.clickOnLogout();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			appDriver.closeApp();
//			appDriver.resetApp();
		}

	}

	@Test(groups = { "pilot" }, enabled = false, description = "TCID_28,29,30,31,32,33,61:"
			+ "Verification of My Learning page"
			+ "28: Verify whether the user able be  to access the My Learning page"
			+ "29:Verify whether the user able be  to navigate correctly in both In progress and Completed Tabs."
			+ "30:Verify the Catalog items are displayed in an List View format on clicking the List view icon"
			+ "31:Verify the Catalog items are displayed in an Grid View format on clicking the Grid view icon"
			+ "32:Verify the  content which are not completed is displayed in the In Progress Tab"
			+ "33:Verify the name and type of the Content;"
			+ "61:Verify the  content which are completed is displayed in the In Progress Tab")

	public void verifHomePage() {
		appDriver = AppFactory.getAndroidApp();
		System.out.println("pilot29");

		MALoginSteps maLoginSteps = new MALoginSteps(appDriver);
		maLoginSteps.doLogin();
		// Select Instance Screen
		MASelectInstanceSteps mASIS = new MASelectInstanceSteps(appDriver);
		mASIS.validateInstanceSelectionPage();

		mASIS.swipeInstances();

		mASIS.selectFractal();
		MAWhatsNewSteps mAWNS = new MAWhatsNewSteps(appDriver);
		mAWNS.validateWhatsNewPage();
		mAWNS.clickLater();

		MAMyLearningInProSteps mAMLS = new MAMyLearningInProSteps(appDriver);
		mAMLS.validateMyLearningTitle();
		mAMLS.verifyInProgress();
		mAMLS.clickCompleted();
		mAMLS.verifyGridView();
		mAMLS.verifyListView();
		mAMLS.searchIcon();
		mAMLS.clickMenu();
		
		MAMenuOptionsSteps mAMnuSteps = new MAMenuOptionsSteps(appDriver);
		mAMnuSteps.clickOnLogout();
		
	}
	//added by karpagavalli from here
	@Test(groups = { "pilot" }, enabled = false, description = "TCID_62,63,64,65,66,67,36,37,40,42,43,44,48,50,51,55,57,58:"
			+ "64:Verify only the courses are displayed if the Courses filter is applied;"
			+ "65:Verify only the Learning Paths are displayed if the Learning Path filter is applied;"
			+ "66:Verify only the Resources are displayed if the Resource filter is applied;"
			+ "67:Verify all the contents are displayed if the All Filter is applied;"
			+ "62:Verify the filter icon is displayed on My Learning page;"
			+ "63:Verify only the bundles are displayed if the Bundle filter is applied;"
			+ "36:Verify the initial progress percentage of the bundle and its contents;"
			+ "37:Verify the Progress percentage of bundle;"
			+ "40:Verify the name and type of the Learning path;"
			+ "42:Verify the initial progress for Learning path;"
			+ "43:Verify the course progress inside the learning path;"
			+ "44:Verify the course progress inside the learning path;"
			+ "48:Verify the name and type of the course;"
			+ "50:Verify the initial progress percentage of the course;"
			+ "51:Verify the Progress percentage of the learning object inside the course;"
			+ "55:Verify the name and type of the resource;"
			+ "57:Verify the initial progress percentage of the resource;"
			+ "58:Verify the Progress percentage of the learning object inside the resource")

	public void veriyFilterPage() {
		appDriver = AppFactory.getAndroidApp();
		System.out.println("pilot1");

		MALoginSteps maLoginSteps = new MALoginSteps(appDriver);
		maLoginSteps.doLogin();
		// Select Instance Screen
		MASelectInstanceSteps mASIS = new MASelectInstanceSteps(appDriver);
		mASIS.validateInstanceSelectionPage();
		// Menu Options Screen
		MAMenuOptionsSteps mAMnuSteps = new MAMenuOptionsSteps(appDriver);
		
		mASIS.swipeInstances();
		mASIS.selectFractalDemo();
		//What's New Screen MAWhatsNewSteps
		MAWhatsNewSteps mAWNS = new MAWhatsNewSteps(appDriver);
		mAWNS.clickLater();
		MAMyLearningInProSteps mAMLS = new MAMyLearningInProSteps(appDriver);
		mAMLS.allFilter();
		mAMLS.bundelFilter();
		mAMLS.courseFilter();
		mAMLS.resourceFilter();
		mAMLS.learningpathFilter();
		mAMLS.verifyBundleCount();
		mAMLS.verifycourseCount();
		mAMLS.verifyLearningPathCount();
		mAMLS.verifyResourceCount();
		
		mAMLS.clickMenu();
		mAMnuSteps.clickOnLogout();

	}
	//added by karpagavalli till here
	
	//added by mahesh from here
	@Test(groups = { "LoginPage0" }, enabled = false, description = "Combined mobile test")
	public void LoginPage0() {
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
		
	}	
	@Test(groups = { "login1" }, enabled = false, description = "Combined mobile test")
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
	//	maLoginSteps.clickOnLogout();
		
	}
	@Test(groups = { "pilot" }, enabled = false, description = "TC79:the \"No internet connection Available\" message is getting displayed if there is no internet connection")
	public void general() {
	appDriver = AppFactory.getAndroidApp();

	MALoginSteps maLoginSteps = new MALoginSteps(appDriver);
	maLoginSteps.doLogin();
	//TCID_79:the "No Internet connection Available" message is getting displayed if there is no Internet connection
	maLoginSteps.noInternetErrorVerify();
    } 
	//******mahesh20/12/2018************//
	//Updated by Manju priya A on Jan_18_19
	/*10 -> Updated by Manju Priya A - Jan-17-19 - Completed no issues..... *///Have to check with Mahesh for commented Lines
	@Test(groups = { "pilot" }, enabled = true, description = "TCID_6, 11: Verification of Forgot password page"
			+ "TCID_6: Verify forgot password link available on login page"
			+ "TCID_11: App should throw an error message saying Email id doesn't exist in database"
			+ "TCID_10: Verify forgot password field is accepting valid email ID"
			+ "TCID_12: Verify OTP is received to register email ID"
			+ "TCID_13: Verify the received OTP is working fine ,when user try for forgot password functionality."
			+ "TCID_14: Verify the received OTP is working fine ,when user try for forgot password functionality."
			+ "TCID_7: Verify OTP is received to registered email id ,when user click on forgot password."
			+ "TCID_8: Verify the recived OTP is working fine ,when user try for forgot password functionality."
			+ "TCID_15: Verify the received OTP is working fine ,when user try for forgot password functionality."
			+ "TCID_9: Verify forgot password allowed to change password for registered user.")
	public void verifyForgotPassword() {
		appDriver = AppFactory.getiOSApp();
		//appDriver = AppFactory.getAndroidApp();
		print("---------------------------------------verifyForgotPassword-------------------------------");
		MAForgotPasswordSteps maForgotPasswordSteps = new MAForgotPasswordSteps(appDriver);
		
		//TCID_6:Verify forgot password link available on login page
		maForgotPasswordSteps.verifyForgotPassword();
		Reporter.writeSummary("TCID_6, Verify forgot password link available on login page, " +  maForgotPasswordSteps.getResult());
		//TCID_11: App should throw an error message saying Email id doesn't exist in database
		maForgotPasswordSteps.verifyEmailError();
		Reporter.writeSummary("TCID_11, App should throw an error message saying Email id doesn't exist in database, " +  maForgotPasswordSteps.getResult());
		
		//Starts - Added on Jan_17_19 by manju Priya A
		//TCID_10: Verify forgot password field is accepting valid email ID
		maForgotPasswordSteps.verifyWithInvalidDBEmail();
		Reporter.writeSummary("TCID_10, Verify forgot password field is accepting valid email ID, " +  maForgotPasswordSteps.getResult());
		//TCID_12: Verify OTP is received to register email ID
		maForgotPasswordSteps.verifyOTPSentPopup();
		Reporter.writeSummary("TCID_12, Verify OTP is received to register email ID, " +  maForgotPasswordSteps.getResult());
		//TCID_13: Verify the received OTP is working fine ,when user try for forgot password functionality.
		maForgotPasswordSteps.verifyConfirmPassPage();
		Reporter.writeSummary("TCID_13, Verify the received OTP is working fine ,when user try for forgot password functionality., " +  maForgotPasswordSteps.getResult());
		//TCID_14: Verify the received OTP is working fine ,when user try for forgot password functionality.
		maForgotPasswordSteps.verifyInvalidOTPErrorMsg();
		Reporter.writeSummary("TCID_14, Verify the received OTP is working fine ,when user try for forgot password functionality., " +  maForgotPasswordSteps.getResult());
		//TCID_7: Verify OTP is received to registered email id ,when user click on forgot password.
		maForgotPasswordSteps.verifyOTPReceivedToEmail();
		Reporter.writeSummary("TCID_7, Verify OTP is received to registered email id ,when user click on forgot password., " +  maForgotPasswordSteps.getResult());
		//TCID_8: Verify the recived OTP is working fine ,when user try for forgot password functionality.
		maForgotPasswordSteps.verifyOTPWorkfFine();
		Reporter.writeSummary("TCID_8, Verify the recived OTP is working fine ,when user try for forgot password functionality., " +  maForgotPasswordSteps.getResult());
		//TCID_15: Verify the received OTP is working fine ,when user try for forgot password functionality.
		maForgotPasswordSteps.verifyChangePassPage();
		Reporter.writeSummary("TCID_15, Verify the received OTP is working fine ,when user try for forgot password functionality., " +  maForgotPasswordSteps.getResult());
		//TCID_9: Verify forgot password allowed to change password for registered user.
		maForgotPasswordSteps.verifyPasswordChange();
		Reporter.writeSummary("TCID_9, Verify forgot password allowed to change password for registered user., " +  maForgotPasswordSteps.getResult());
		//Ends - Added by Manju Priya A on jan_17_19
	}
	//*****************************//
	//added by mahesh till here
}
