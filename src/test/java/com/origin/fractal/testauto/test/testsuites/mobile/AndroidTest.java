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
import com.wv.auto.framework.utils.Reporter;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class AndroidTest extends FractalBaseAppTest {

	private AppiumDriver<MobileElement> appDriver;

	@Test(groups = { "pilot" }, enabled = true, description = "TCID_:Verification of My Account page"
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
		Reporter.writeSummary("TCID_061,Verifying whether the user details are displayed correctly in the My Account page, " +  mMyAcc.getResult() );
		String[] firstName = {" ","10","@#","Vel"};
		String[] lastName = {" ","10","!&*","Winvinaya"};
		mMyAcc.verifyFirstLastNameWithSpace(firstName[0], lastName[0]);
		Reporter.writeSummary("TCID_062,Verifying whether the first  and last name accepts space, " +  mMyAcc.getResult() );
		mMyAcc.verifyFirstLastNameWithNos(firstName[1], lastName[1]);
		Reporter.writeSummary("TCID_063,Verifying whether the first  and last name accepts number, " +  mMyAcc.getResult() );
		mMyAcc.verifyFirstLastNameWithSpecialChars(firstName[2], lastName[2]);
		Reporter.writeSummary("TCID_064,Verifying whether the first  and last name accepts special charecters, " +  mMyAcc.getResult() );
		mMyAcc.verifyWithValidCredential(firstName[3], lastName[3]);
		Reporter.writeSummary("TCID_070,Verifying whether the valid  first  and last names are updated successfully, " +  mMyAcc.getResult() );
		/*Starts - added by Manju Priya A on Jan-22-19*/
		//Commented because of the Password reset issue
		/*String[] newPassword = {"abcdegf123#^A","abcdefgh","12345678"};
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
	//Done Integration
	@Test(groups = { "pilot" }, enabled = true, description = "TCID_25,26:Verification of Menus page"
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
		Reporter.writeSummary("TCID_025,Verify the Menu functionality is working fine, " +  mAMnuSteps.getResult() );
		mAMLS.clickMenu();
		Reporter.writeSummary("TCID_026,Verify that user able to close menu section, " +  mAMnuSteps.getResult() );
		mAMnuSteps.clickOnLogout();
		Reporter.writeSummary("TCID_077,Verifying whether the user can able to logout successfully on clicking the logout button, " +  mAMnuSteps.getResult() );
	}

	@Test(groups = { "pilot" }, enabled = true, description = "TCID_20,21:Verification of Select client page"
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
		Reporter.writeSummary("TCID_020,Verify that assigned clients are listed for user, " +  mASIS.getResult() );
		mASIS.verifyFractalSelection();
		wait(5);
		mASIS.verifyFractalDemoSelection();
		Reporter.writeSummary("TCID_021,Verify that user able to select their 'Learning site', " +  mASIS.getResult() );
		/*Ends - Dec-13-18*/
		mAMLS.clickMenu();
		mAMnuSteps.clickOnLogout();
		Reporter.writeSummary("TCID_078,Verifying whether the user can able to logout successfully on clicking the logout button, " +  mAMnuSteps.getResult() );
		
	}

	@Test(groups = { "pilot" }, enabled = true, description = "TCID_58,59,60:Verification of Notification page"
			+ "58: Verifying whether the assigned content is getting displayed on clicking the notification bell icon"
			+ "59: Verifying whether all the assigned items are getting displayed on clicking the more button"
			+ "60: Verifying whether the content is accessible from the notification page")
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
		Reporter.writeSummary("TCID_058,Verifying whether the assigned content is getting displayed on clicking the notification bell icon, " +  mAMLS.getResult() );
		/*Ends - Dec-07-18*/
		/*Starts - Dec-12-18*/
		mAMLS.verifyMoreButton();
		Reporter.writeSummary("TCID_059,Verifying whether all the assigned items are getting displayed on clicking the more button, " +  mAMLS.getResult() );
		mAMLS.verifyContentAccess();
		Reporter.writeSummary("TCID_060,Verifying whether the content is accessible from the notification page, " +  mASIS.getResult() );
		/*Ends - Dec-12-18*/
		mAMLS.clickMenu();
		mAMnuSteps.clickOnLogout();
	}
	
	
	/*Added by Manju Priya A - Dec-03-18*/
	@Test(groups = { "pilot" }, enabled = true, description = "TCID_42,43,50,45,47:Verification of catalog page"
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
		Reporter.writeSummary("TCID_023,Verify that user able to close  'WHATS NEW' popup, " +  mAWNS.getResult() );
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
		Reporter.writeSummary("TCID_042,Verify Popular categories are listed in the Catalog page, " +  mACatSteps.getResult() );
		mACatSteps.verifyWhatsNewContents();
		Reporter.writeSummary("TCID_043,Verify what's new contents are listed in the Catalog page, " +  mACatSteps.getResult() );
		/*Ends - Dec-03-18*/
		/*Starts - Dec-06-18*/
		mACatSteps.verifyFilterExist() ;
		Reporter.writeSummary("TCID_050,Verify the filter icon is displayed, " +  mACatSteps.getResult() );
		/*Ends - Dec-06-18*/
		/*Starts - Dec-10-18*/
		mACatSteps.verifyBuyButton();
		Reporter.writeSummary("TCID_045,Verify the BUY button for the paid catalog item, " +  mACatSteps.getResult() );
		mACatSteps.verifyCategory();
		Reporter.writeSummary("TCID_047,Verify the Catalogs are displayed correspond to the selected Category under Popular category, " +  mACatSteps.getResult() );
		/*Ends - Dec-10-18*/
		mAMLS.clickMenu();
		mAMnuSteps.clickOnLogout();
	}
	/*Added by Manju Priya A - Dec-10-18*/
	@Test(groups = { "pilot" }, enabled = true, description = "TCID_48,49,51,52,53,54,55,56:Verification of catalog page"
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
		Reporter.writeSummary("TCID_048,Verify LIST view, " +  mACatSteps.getResult() );
		mACatSteps.verifyGridView();
		Reporter.writeSummary("TCID_049,Verify GRID view, " +  mACatSteps.getResult() );
		/*Ends - Dec-10-18*/
		
		/*Starts - Dec-11-18*/
		mACatSteps.verifyBundleFilter();
		Reporter.writeSummary("TCID_051,Verify only the bundles are displayed if the Bundle filter is applied, " +  mACatSteps.getResult() );
		mACatSteps.verifyLpathFilter();
		Reporter.writeSummary("TCID_053,Verify only the Learning Paths are displayed if the Learning Path filter is applied, " +  mACatSteps.getResult() );
		mACatSteps.verifyCourseFilter();
		Reporter.writeSummary("TCID_052,Verify only the courses are displayed if the Courses filter is applied, " +  mACatSteps.getResult() );
		mACatSteps.verifyResourceFilter();
		Reporter.writeSummary("TCID_054,Verify only the Resources are displayed if the Resource filter is applied, " +  mACatSteps.getResult() );
		/*Ends - Dec-11-18*/
		/*Starts - Dec-12-18*/
		mACatSteps.verifyAllFilter();
		Reporter.writeSummary("TCID_055,Verify all the contents are displayed if the All Filter is applied, " +  mACatSteps.getResult() );
		mACatSteps.verifyLangFilter();
		Reporter.writeSummary("TCID_056,Verify the Language filter is working fine, " +  mACatSteps.getResult() );
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
			appDriver.resetApp();
		}

	}

	@Test(groups = { "pilot" }, enabled = true, description = "TCID_27,28,29,30,31,32,61:"
			+ "Verification of My Learning page"
			+ "27: Verify whether the user able be  to access the My Learning page"
			+ "28:Verify whether the user able be  to navigate correctly in both In progress and Completed Tabs."
			+ "29:Verify the Catalog items are displayed in an List View format on clicking the List view icon"
			+ "30:Verify the Catalog items are displayed in an Grid View format on clicking the Grid view icon"
			+ "31:Verify the  content which are not completed is displayed in the In Progress Tab"
			+ "32:Verify the name and type of the Content;"
			+ "34:Verify the  content which are completed is displayed in the In Progress Tab"
			+ "41:Verify the catalog item is displayed on entering any catalog item name in the search field")

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
		Reporter.writeSummary("TCID_032,Verify the name and type of the Content, " +  mAMLS.getResult() );
		mAMLS.validateMyLearningTitle();
		Reporter.writeSummary("TCID_034,Verify the  content which are completed is displayed in the In Progress Tab, " +  mAMLS.getResult() );
		mAMLS.clickCompleted();
		Reporter.writeSummary("TCID_027,Verify whether the user able be  to access the My Learning page, " +  mAMLS.getResult() );
		mAMLS.verifyInProgress();
		Reporter.writeSummary("TCID_028,Verify whether the user able be  to navigate correctly in both In progress and Completed Tabs., " +  mAMLS.getResult() );
		Reporter.writeSummary("TCID_033,Verify the completed tab after completion of the resource, " +  mAMLS.getResult() );
		Reporter.writeSummary("TCID_034,Verify the  content which are completed is displayed in the Completed Tab, " +  mAMLS.getResult() );
		
		mAMLS.clickCompleted();
		Reporter.writeSummary("TCID_031,Verify the  content which are not completed is displayed in the In Progress Tab, " +  mAMLS.getResult() );
		mAMLS.verifyGridView();
		Reporter.writeSummary("TCID_030,Verify the Catalog items are displayed in an Grid View format on clicking the Grid view icon, " +  mAMLS.getResult() );
		mAMLS.verifyListView();
		Reporter.writeSummary("TCID_029,Verify the Catalog items are displayed in an List View format on clicking the List view icon, " +  mAMLS.getResult() );
		//mAMLS.searchIcon();
		//Reporter.writeSummary("TCID_041,Verify the catalog item is displayed on entering any catalog item name in the search field, " +  mAMLS.getResult() );
		MAMenuOptionsSteps mAMnuSteps = new MAMenuOptionsSteps(appDriver);
		wait(5);
		mAMLS.clickMenu();
		mAMnuSteps.clickOnLogout();
		
	}
	//added by karpagavalli from here
	@Test(groups = { "pilot" }, enabled = true, description = "TCID_62,63,64,65,66,67,36,37,40,42,43,44,48,50,51,55,57,58:"
			+ "37:Verify only the courses are displayed if the Courses filter is applied;"
			+ "38:Verify only the Learning Paths are displayed if the Learning Path filter is applied;"
			+ "39:Verify only the Resources are displayed if the Resource filter is applied;"
			+ "40:Verify all the contents are displayed if the All Filter is applied;"
			+ "35:Verify the filter icon is displayed on My Learning page;"
			+ "36:Verify only the bundles are displayed if the Bundle filter is applied;"
			+ "35:Verify the initial progress percentage of the bundle and its contents;"
			+ "37:Verify the Progress percentage of bundle;"
			+ "40:Verify the name and type of the Learning path;"
			+ "42:Verify the initial progress for Learning path;"
			+ "43:Verify the course progress inside the learning path;"
			+ "44:Verify the course progress inside the learning path;"
			+ "48:Verify the name and type of the course;"
			+ "50:Verify the initial progress percentage of the course;"
			+ "51:Verify the Progress percentage of the learning object inside the course;"
			+ "55:Verify the name and type of the resource;"
			+ "30:Verify the initial progress percentage of the resource;"
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
		mAMLS.filterICon();
		Reporter.writeSummary("TCID_035,Verify the filter icon is displayed on My Learning page, " +  mAMLS.getResult() );
		mAMLS.allFilter();
		Reporter.writeSummary("TCID_040,Verify all the contents are displayed if the All Filter is applied, " +  mAMLS.getResult() );
		mAMLS.bundelFilter();
		Reporter.writeSummary("TCID_036,Verify only the bundles are displayed if the Bundle filter is applied, " +  mAMLS.getResult() );
		mAMLS.courseFilter();
		Reporter.writeSummary("TCID_037,Verify only the courses are displayed if the Courses filter is applied, " +  mAMLS.getResult() );
		mAMLS.resourceFilter();
		Reporter.writeSummary("TCID_039,Verify only the Resources are displayed if the Resource filter is applied, " +  mAMLS.getResult() );
		mAMLS.learningpathFilter();
		Reporter.writeSummary("TCID_038,Verify only the Learning Paths are displayed if the Learning Path filter is applied, " +  mAMLS.getResult() );
		mAMLS.progressBar();
		Reporter.writeSummary("TCID_036,Verify the Progress percentage of bundle, " +  mAMLS.getResult() );
		mAMLS.verifyBundleCount();
		Reporter.writeSummary("TCID_023,Verify the Count of the items inside the bundle, " +  mAMLS.getResult() );
		Reporter.writeSummary("TCID_034,Verify the name and type of the Content inside the bundle, " +  mAMLS.getResult() );
		Reporter.writeSummary("TCID_035,Verify the initial progress percentage of the bundle and its contents," +  mAMLS.getResult() );
		mAMLS.progressBar();
		Reporter.writeSummary("TCID_033,Verify the initial progress percentage of the course ," +  mAMLS.getResult() );
		mAMLS.verifycourseCount();
		Reporter.writeSummary("TCID_022,Verify the Count of the items inside the course, " +  mAMLS.getResult() );
		Reporter.writeSummary("TCID_024,Verify the Progress percentage of the learning object inside the course," +  mAMLS.getResult() );
		Reporter.writeSummary("TCID_034,Verify the name and type of the Content inside the bundle, " +  mAMLS.getResult() );
		Reporter.writeSummary("TCID_021,Verify the name and type of the course, " +  mAMLS.getResult() );
		mAMLS.progressBar();
		Reporter.writeSummary("TCID_015,Verify the initial progress for Learning path, " +  mAMLS.getResult() );
		mAMLS.verifyLearningPathCount();
		Reporter.writeSummary("TCID_014,Verify the Count of the items inside the Learning path, " +  mAMLS.getResult() );
		Reporter.writeSummary("TCID_017,Verify the course progress inside the learning path, " +  mAMLS.getResult() );
		Reporter.writeSummary("TCID_013,Verify the name and type of the Learning path, " +  mAMLS.getResult() );
		mAMLS.progressBar();
		Reporter.writeSummary("TCID_030,Verify the initial progress percentage of the resource, " +  mAMLS.getResult() );
		mAMLS.verifyResourceCount();
		Reporter.writeSummary("TCID_029,Verify the count of the Resource, " +  mAMLS.getResult() );
		Reporter.writeSummary("TCID_031,Verify the Progress percentage of the learning object inside the resource, " +  mAMLS.getResult() );
		Reporter.writeSummary("TCID_028,Verify the name and type of the resource, " +  mAMLS.getResult() );
		mAMLS.clickMenu();
		mAMnuSteps.clickOnLogout();

	}
	//added by karpagavalli till here
	
	//added by mahesh from here
	@Test(groups = { "LoginPage0" }, enabled = true, description = "Combined mobile test")
	public void LoginPage0() {
		System.out.println("login0");
		appDriver = AppFactory.getAndroidApp();

		MALoginSteps maLoginSteps = new MALoginSteps(appDriver);
		
		maLoginSteps.blankPasswordVerification();
		maLoginSteps.blankUserName();
		Reporter.writeSummary("TCID_004,  Verify the origin fractal app login page with invalid user name and  valid password., " +  maLoginSteps.getResult() );
		maLoginSteps.inValid();
		Reporter.writeSummary("TCID_003,  Verify the origin fractal app login page with invalid user name and password., " +  maLoginSteps.getResult() );
		maLoginSteps.blankUserNamePassword();
		Reporter.writeSummary("TCID_005,  Verify the origin fractal app login page with blank values for username and password, " +  maLoginSteps.getResult() );
		maLoginSteps.doLogin();
		Reporter.writeSummary("TCID_002,  Verify user is able to login for origin fractal app with valid user name and password., " +  maLoginSteps.getResult() );
		
		MAMenuOptionsSteps mAMnuSteps = new MAMenuOptionsSteps(appDriver);
		mAMnuSteps.clickOnLogout();
		
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
	//	maLoginSteps.clickOnLogout();
		
	}
	@Test(groups = { "pilot" }, enabled = false, description = "TC79:the \"No internet connection Available\" message is getting displayed if there is no internet connection")
	   public void general() {
		appDriver = AppFactory.getAndroidApp();

		MALoginSteps maLoginSteps = new MALoginSteps(appDriver);
		maLoginSteps.doLogin();
		//TCID_79:the "No Internet connection Available" message is getting displayed if there is no Internet connection
		maLoginSteps.noInternetErrorVerify();
		Reporter.writeSummary("TCID_079,Verify No Internet connection Available\" message is getting displayed if there is no Internet connection, " +  maLoginSteps.getResult() );
		
	    } 
	//******mahesh20/12/2018************//
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
		//appDriver = AppFactory.getiOSApp();
		appDriver = AppFactory.getAndroidApp();
		print("---------------------------------------verifyForgotPassword-------------------------------");
		MAForgotPasswordSteps maForgotPasswordSteps = new MAForgotPasswordSteps(appDriver);
		
		//TCID_6:Verify forgot password link available on login page
		maForgotPasswordSteps.verifyForgotPassword();
		Reporter.writeSummary("TCID_006, Verify forgot password link available on login page, " +  maForgotPasswordSteps.getResult());
		//TCID_11: App should throw an error message saying Email id doesn't exist in database
		maForgotPasswordSteps.verifyEmailError();
		Reporter.writeSummary("TCID_011, App should throw an error message saying Email id doesn't exist in database, " +  maForgotPasswordSteps.getResult());
		
		//Starts - Added on Jan_17_19 by manju Priya A
		//TCID_10: Verify forgot password field is accepting valid email ID
		maForgotPasswordSteps.verifyWithInvalidDBEmail();
		Reporter.writeSummary("TCID_010, Verify forgot password field is accepting valid email ID, " +  maForgotPasswordSteps.getResult());
		//TCID_12: Verify OTP is received to register email ID
		maForgotPasswordSteps.verifyOTPSentPopup();
		Reporter.writeSummary("TCID_012, Verify OTP is received to register email ID, " +  maForgotPasswordSteps.getResult());
		//TCID_13: Verify the received OTP is working fine ,when user try for forgot password functionality.
		maForgotPasswordSteps.verifyConfirmPassPage();
		Reporter.writeSummary("TCID_013, Verify the received OTP is working fine when user try for forgot password functionality., " +  maForgotPasswordSteps.getResult());
		//TCID_14: Verify the received OTP is working fine ,when user try for forgot password functionality.
		maForgotPasswordSteps.verifyInvalidOTPErrorMsg();
		Reporter.writeSummary("TCID_014, Verify the received OTP is working fine when user try for forgot password functionality., " +  maForgotPasswordSteps.getResult());
		//TCID_7: Verify OTP is received to registered email id ,when user click on forgot password.
		maForgotPasswordSteps.verifyOTPReceivedToEmail();
		Reporter.writeSummary("TCID_007, Verify OTP is received to registered email id when user click on forgot password, " +  maForgotPasswordSteps.getResult());
		//TCID_8: Verify the recived OTP is working fine ,when user try for forgot password functionality.
		maForgotPasswordSteps.verifyOTPWorkfFine();
		Reporter.writeSummary("TCID_008, Verify the recived OTP is working fine when user try for forgot password functionality., " +  maForgotPasswordSteps.getResult());
		//TCID_15: Verify the received OTP is working fine ,when user try for forgot password functionality.
		maForgotPasswordSteps.verifyChangePassPage();
		Reporter.writeSummary("TCID_015, Verify the received OTP is working fine when user try for forgot password functionality., " +  maForgotPasswordSteps.getResult());
		//TCID_9: Verify forgot password allowed to change password for registered user.
		maForgotPasswordSteps.verifyPasswordChange();
		Reporter.writeSummary("TCID_009, Verify forgot password allowed to change password for registered user., " +  maForgotPasswordSteps.getResult());
		maForgotPasswordSteps.verifyNewPassError();
		Reporter.writeSummary("TCID_018,Verify change password functionality working fine, " +  maForgotPasswordSteps.getResult() );
		//Ends - Added by Manju Priya A on jan_17_19
	}
		//*****************************//
	//added by mahesh till here
		 /*12 -> Added by Manju Priya A - Jan-11-19 -  Completed no issues.....*/
		@Test(groups = { "pilot" }, enabled = true, description = "TCID_01:Verification of Splash Screen"
		+ "TCID_01: Verify the splash screen after login to the application,")
		public void verifySplashScreen() {
		System.out.println("---------------------------------------verifySplashScreen-------------------------------");
		appDriver = AppFactory.getAndroidApp();
		MALoginSteps maLoginSteps = new MALoginSteps(appDriver);
		maLoginSteps.verifySplashScreen();
		Reporter.writeSummary("TCID_001, Verifying whether the splash screen appears after launching the app, " +  maLoginSteps.getResult());
		}
		
		/*Added by Manju Priya A - Jan_21_19*/
		@Test(groups = { "pilot" }, enabled = true, description = "TCID_80,81,82:Verification of catalog page"
				+ "TCID_80: Verify the voice assitant is available in the Mylearning page on launching the app."
				+ "TCID_81: Verify to check the display of the alert 'allow Origin Fractal to record audio?' on pressing the voice assistant")
		public void verifyVoice() {
			print("-------------------------------Verification of Voice assistant-------------------------");
			appDriver = AppFactory.getAndroidApp();

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
			
			//TCID_80: Verify the voice assitant is available in the Mylearning page on launching the app.
			mAMLS.verifyVoiceAssitant();
			Reporter.writeSummary("TCID_80, Verify the voice assitant is available in the Mylearning page on launching the app., " +  mAMLS.getResult());
			wait(5);
			//TCID_81: Verify to check the display of the alert "allow Origin Fractal to record audio?' on pressing the voice assistant
			mAMLS.verifyAllowPopup();
			Reporter.writeSummary("TCID_81, Verify to check the display of the alert \"allow Origin Fractal to record audio?' on pressing the voice assistant, " +  mAMLS.getResult());
			//TCID_82: Verify the presence of Speaker icon and the Voice assistant icon
			mAMLS.verifyVoiceAssistLabels();
			Reporter.writeSummary("TCID_82, Verify the presence of Speaker icon and the Voice assistant icon, " +  mAMLS.getResult());
			
			// Menu Options Screen
			MAMenuOptionsSteps mAMnuSteps = new MAMenuOptionsSteps(appDriver);
			wait(5);
			mAMLS.clickMenu();
			mAMnuSteps.clickOnLogout();
		}	
		
		
		
		
		
		
		
		
		
}