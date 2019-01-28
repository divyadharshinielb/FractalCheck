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

public class IOSTest extends FractalBaseAppTest{
	private static AppiumDriver<MobileElement> appDriver;
	/*1-> ddddd/ Added by Manju Priya A - Jan-11-19 - Completed without any issues..*///
	@Test(groups = { "pilot" }, enabled = true, description = "TCID_25,26:Verification of Menus page"
			+ "25: Verify the Menu functionality is working fine"
			+ "26: Verify that user able to close menu section")
	public void verifyMenuPage() {
		System.out.println("-------------------------------------verifyMenuPage------------------------------------------");
		appDriver = AppFactory.getAndroidApp();
		//appDriver = AppFactory.getiOSApp();
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
		// Menu Options Screen
		MAMenuOptionsSteps mAMnuSteps = new MAMenuOptionsSteps(appDriver);
		//TCID_25: Verify the Menu functionality is working fine
		mAMnuSteps.verifyMenusFunctionality();
		Reporter.writeSummary("TCID_25,  Verify the Menu functionality is working fine, " +  mAMnuSteps.getResult());
		//TCID_26: Verify that user able to close menu section
		mAMnuSteps.verifyCloseMenuFunctionality();
		Reporter.writeSummary("TCID_26,  Verify that user able to close menu section, " +  mAMnuSteps.getResult());
		mAMLS.clickMenu();
		mAMnuSteps.clickOnLogout();
	}
	/*2-> ddddd/ Added by Manju Priya A - Jan-11-19 - Completed without any issues.. */
	@Test(groups = { "pilot" }, enabled = true, description = "TCID_:Verification of My Account page"
			+ "TCID_61: Verifying whether the user details are displayed correctly in the My Account page"
			+ "TCID_62: Verifying whether the first  and last name accespts space"
			+ "TCID_63: Verifying whether the first  and last name accespts number"
			+ "TCID_64: Verifying whether the first  and last name accespts special charecters"
			+ "TCID_70: Verifying whether the valid  first  and last names are updated successfully"
			+ "TCID_71: Verifying whether the New password and Confirm password fields accepts more than 8 characters"
			+ "TCID_72: Verifying whether the details are getting updated successfully if the New password and Confirm password have only alphabets"
			+ "TCID_73: Verifying whether the details are getting updated successfully if the New password and Confirm password have only numbers with 8 characters length")
	public void verifyMyAccountPage() {
		System.out.println("---------------------------My Account Verification----------------------------------");
		appDriver = AppFactory.getAndroidApp();
		//appDriver = AppFactory.getiOSApp();
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
		//TCID_61: Verifying whether the user details are displayed correctly in the My Account page
		mMyAcc.verifyUserDeatils();
		Reporter.writeSummary("TCID_61,  Verifying whether the user details are displayed correctly in the My Account page, " +  mMyAcc.getResult());
		String[] firstName = {" ","10","@#","Vel"};
		String[] lastName = {" ","10","!&*","Winvinaya"};
		//TCID_62: Verifying whether the first  and last name accespts space
		mMyAcc.verifyFirstLastNameWithSpace(firstName[0], lastName[0]);
		Reporter.writeSummary("TCID_62, Verifying whether the first  and last name accespts space," +  mMyAcc.getResult());
		//TCID_63: Verifying whether the first  and last name accespts number
		mMyAcc.verifyFirstLastNameWithNos(firstName[1], lastName[1]);
		Reporter.writeSummary("TCID_63, Verifying whether the first  and last name accespts number," +  mMyAcc.getResult());
		//TCID_64: Verifying whether the first  and last name accespts special charecters
		mMyAcc.verifyFirstLastNameWithSpecialChars(firstName[2], lastName[2]);
		Reporter.writeSummary("TCID_64, Verifying whether the first  and last name accespts special charecters," +  mMyAcc.getResult());
		//TCID_70: Verifying whether the valid  first  and last names are updated successfully
		mMyAcc.verifyWithValidCredential(firstName[3], lastName[3]);
		Reporter.writeSummary("TCID_70, Verifying whether the valid  first  and last names are updated successfully," +  mMyAcc.getResult());
		/*Starts - added by Manju Priya A on Jan-22-19*/
		//Commented because of the Password reset issue
		/*String[] newPassword = {"abcdegf123#^A","abcdefgh","12345678"};
		String[] confirmPassword = {"abcdegf123#^A","abcdefgh","12345678"};
		//TCID_71: Verifying whether the New password and Confirm password fields accepts more than 8 characters
		mMyAcc.verifyInvalidPassCredentials(newPassword[0], confirmPassword[0]);
		Reporter.writeSummary("TCID_071,Verifying whether the New password and Confirm password fields accepts more than 8 characters, " +  mMyAcc.getResult() );
		//TCID_72: Verifying whether the details are getting updated successfully if the New password and Confirm password have only alphabets
		mMyAcc.verifyInvalidPassCredentials(newPassword[1], confirmPassword[1]);
		Reporter.writeSummary("TCID_072,Verifying whether the details are getting updated successfully if the New password and Confirm password have only alphabets, " +  mMyAcc.getResult() );
		//TCID_73: Verifying whether the details are getting updated successfully if the New password and Confirm password have only numbers with 8 characters length
		mMyAcc.verifyInvalidPassCredentials(newPassword[2], confirmPassword[2]);
		Reporter.writeSummary("TCID_073,Verifying whether the details are getting updated successfully if the New password and Confirm password have only numbers with 8 characters length, " +  mMyAcc.getResult() );
		/*Ends - added by Manju Priya A on Jan-22-19*/
		//For Logout
		mAMLS.clickMenu();
		mAMnuSteps.clickOnLogout();
	}
	/*3-> ddddd/ Added by Manju Priya A - Jan-11-19 - Completed without any issues..*///last 4 are pending
	@Test(groups = { "pilot" }, enabled = true, description = "TCID_:"
			+ "TCID_35:Verify the filter icon is displayed on My Learning page"
			+ "TCID_36:Verify only the bundles are displayed if the Bundle filter is applied"
			+ "TCID_37:Verify only the courses are displayed if the Courses filter is applied"
			+ "TCID_38:Verify only the Learning Paths are displayed if the Learning Path filter is applied"
			+ "TCID_39:Verify only the Resources are displayed if the Resource filter is applied"
			+ "TCID_40:Verify all the contents are displayed if the All Filter is applied")

	public void verifyFilterPage() {
		/*I have removed few functions, and inclused in some other functions, and != ios*/
		//appDriver = AppFactory.getiOSApp();
		appDriver = AppFactory.getAndroidApp();
		System.out.println("---------------------------Verification of FilterPage -------------------------------------");

		MALoginSteps maLoginSteps = new MALoginSteps(appDriver);
		maLoginSteps.doLogin();
		// Select Instance Screen
		MASelectInstanceSteps mASIS = new MASelectInstanceSteps(appDriver);
		mASIS.validateInstanceSelectionPage();
		// Menu Options Screen
		MAMenuOptionsSteps mAMnuSteps = new MAMenuOptionsSteps(appDriver);
		//mASIS.swipeInstancesIos();//Swipe not happening but error also didn't came.Have to check
		mASIS.selectFractalDemo();
		//What's New Screen MAWhatsNewSteps
		MAWhatsNewSteps mAWNS = new MAWhatsNewSteps(appDriver);
		mAWNS.clickLater();
		//Added By manju Priya on Jan_02_19
		MAMyLearningInProSteps mAMLS = new MAMyLearningInProSteps(appDriver);
		mAMLS.clickMenu();
		mAMnuSteps.clickOnMyLearning();
		
		//TCID_35: Verify the filter icon is displayed on My Learning page
		mAMLS.filterDisplayed();
		Reporter.writeSummary("TCID_35 ,Verify the filter icon is displayed on My Learning page, " +  mAMLS.getResult());
		//TCID_40:Verify all the contents are displayed if the All Filter is applied
		mAMLS.allFilter();
		Reporter.writeSummary("TCID_40 ,Verify all the contents are displayed if the All Filter is applied, " +  mAMLS.getResult());
		//TCID_36: Verify only the bundles are displayed if the Bundle filter is applied
		mAMLS.bundelFilter();
		Reporter.writeSummary("TCID_36 ,Verify only the bundles are displayed if the Bundle filter is applied, " +  mAMLS.getResult());
		//TCID_37: Verify only the courses are displayed if the Courses filter is applied
		mAMLS.courseFilter();
		Reporter.writeSummary("TCID_37 ,Verify only the courses are displayed if the Courses filter is applied, " +  mAMLS.getResult());
		//TCID_39: Verify only the Resources are displayed if the Resource filter is applied
		mAMLS.resourceFilter();
		Reporter.writeSummary("TCID_39 ,Verify only the Resources are displayed if the Resource filter is applied, " +  mAMLS.getResult());
		//TCID_38: Verify only the Learning Paths are displayed if the Learning Path filter is applied
		mAMLS.learningpathFilter();
		Reporter.writeSummary("TCID_38 ,Verify only the Learning Paths are displayed if the Learning Path filter is applied, " +  mAMLS.getResult());
		
		mAMLS.clickMenu();
		mAMnuSteps.clickOnLogout();

	}
	/*4-> Added by Manju Priya A - Jan-11-19 - Completed fully no issues*///karpagavalli
	@Test(groups = { "pilot" }, enabled = true, description = "TCID_27,28,29,30,31,32,33,61:"
			+ "Verification of My Learning page"
			+ "TCID_27: Verify whether the user able be  to access the My Learning page"
			+ "TCID_28:Verify whether the user able be  to navigate correctly in both In progress and Completed Tabs."
			+ "TCID_29:Verify the Catalog items are displayed in an List View format on clicking the List view icon"
			+ "TCID_30:Verify the Catalog items are displayed in an Grid View format on clicking the Grid view icon"
			+ "TCID_31:Verify the  content which are not completed is displayed in the In Progress Tab"
			+ "TCID_32: Verify the name and type of the Content"
			+ "TCID_41: Verify the catalog item is displayed on entering any catalog item name in the search field")

	public void verifyHomePage() {
		//appDriver = AppFactory.getiOSApp();
		appDriver = AppFactory.getAndroidApp();
		System.out.println("-------------------------Verification of HomePage----------------------");

		MALoginSteps maLoginSteps = new MALoginSteps(appDriver);
		maLoginSteps.doLogin();
		// Select Instance Screen
		MASelectInstanceSteps mASIS = new MASelectInstanceSteps(appDriver);
		//mASIS.validateInstanceSelectionPage();

		//mASIS.swipeInstances();

		mASIS.selectFractalDemo();
		MAWhatsNewSteps mAWNS = new MAWhatsNewSteps(appDriver);
		mAWNS.validateWhatsNewPage();
		mAWNS.clickLater();

		MAMyLearningInProSteps mAMLS = new MAMyLearningInProSteps(appDriver);
		//TCID_27: Verify whether the user able be  to access the My Learning page
		mAMLS.validateMyLearningTitle();
		Reporter.writeSummary("TCID_27, Verify whether the user able be  to access the My Learning page, " +  mAMLS.getResult());
		//TCID_28: Verify whether the user able be  to navigate correctly in both In progress and Completed Tabs.
		mAMLS.verifyTwoTabsNavigation();
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
		Reporter.writeSummary("TCID_31, Verify the  content which are not completed is displayed in the In Progress Tab, " +  mAMLS.getResult());
		//TCID_32: Verify the name and type of the Content
		mAMLS.verifyCatalogNameTitle();
		Reporter.writeSummary("TCID_32, Verify the name and type of the Content, " +  mAMLS.getResult());
		//TCID_41: Verify the catalog item is displayed on entering any catalog item name in the search field
		mAMLS.searchIcon();
		Reporter.writeSummary("TCID_41, Verify the catalog item is displayed on entering any catalog item name in the search field, " +  mAMLS.getResult());
		
		//
		/*Commented by Manju Priya A on Jan_04_19
		//TCID_33:Verify the Count of the items inside the bundle
		mAMLS.verifyCatalogContensCount();//Facing issues on clicking the catalog item
		mAMLS.searchIcon();*/
		
		mAMLS.clickMenu();
		MAMenuOptionsSteps mAMnuSteps = new MAMenuOptionsSteps(appDriver);
		mAMnuSteps.clickOnLogout();
		
	}
	/*5->New One - Added by Manju Priya A - Jan-11-19 - Facing issue in clickonbundle*///karpagavalli
	@Test(groups = { "pilot" }, enabled = true, description = "TCID_33:"
			+ "Verification of Bundles in My Learning page"
			+"TCID_33: Verify the Count of the items inside the bundle"
			+"TCID_34: Verify the name and type of the Content inside the bundle"
			+"TCID_35: Verify the initial progress percentage of the bundle and its contents"
			+"TCID_36: Verify the Progress percentage of bundle"
			+"TCID_37: Verify the Completion for content inside the bundle"
			+"TCID_38: Verify the full completion of the bundle")

	public void verifyHomePageBundles() {
		//appDriver = AppFactory.getiOSApp();
		appDriver = AppFactory.getAndroidApp();
		System.out.println("---------------------------Verification of Home Page Bundles-------------------------");

		MALoginSteps maLoginSteps = new MALoginSteps(appDriver);
		maLoginSteps.doLogin();
		// Select Instance Screen
		MASelectInstanceSteps mASIS = new MASelectInstanceSteps(appDriver);
		//mASIS.validateInstanceSelectionPage();

		//mASIS.swipeInstances();

		mASIS.selectFractalDemo();
		MAWhatsNewSteps mAWNS = new MAWhatsNewSteps(appDriver);
		mAWNS.validateWhatsNewPage();
		mAWNS.clickLater();

		MAMyLearningInProSteps mAMLS = new MAMyLearningInProSteps(appDriver);
		//TCID_33: Verify the Count of the items inside the bundle
		mAMLS.verifyBundleCount();
		Reporter.writeSummary("TCID_33, Verify the Count of the items inside the bundle, " +  mAMLS.getResult());
		//TCID_34: Verify the name and type of the Content inside the bundle
		mAMLS.verifyNameTitleInsideBundle();
		Reporter.writeSummary("TCID_34, Verify the name and type of the Content inside the bundle, " +  mAMLS.getResult());
		//TCID_35: Verify the initial progress percentage of the bundle and its contents
		mAMLS.verifyBundleAndContentsIntialProgress();//Couldn't take the progress value in Ios, waitinf for updated build from ajith
		Reporter.writeSummary("TCID_35, Verify the initial progress percentage of the bundle and its contents, " +  mAMLS.getResult());
		//TCID_36: Verify the Progress percentage of bundle
		mAMLS.verifyBundleProgress();//Couldn't take the progress value in Ios, waitinf for updated build from ajith
		Reporter.writeSummary("TCID_36, Verify the Progress percentage of bundle, " +  mAMLS.getResult());
		//TCID_37: Verify the Completion for content inside the bundle
		mAMLS.verifyBundleContentsProgress();//Couldn't take the progress value in Ios, waitinf for updated build from ajith
		Reporter.writeSummary("TCID_37, Verify the Completion for content inside the bundle, " +  mAMLS.getResult());
		//TCID_38: Verify the full completion of the bundle
		mAMLS.verifyBundleFullCompletion();//Couldn't take the progress value in Ios, waitinf for updated build from ajith
		Reporter.writeSummary("TCID_38, Verify the full completion of the bundle, " +  mAMLS.getResult());
		
		mAMLS.clickMenu();
		MAMenuOptionsSteps mAMnuSteps = new MAMenuOptionsSteps(appDriver);
		mAMnuSteps.clickOnLogout();
	}
	/*6 -> New One Added by Manju Priya A - Jan-11-19 - Facing issue in clickonlpath*///karpagavalli
	@Test(groups = { "pilot" }, enabled = true, description = "TCID_33:"
			+ "Verification of LearningPaths in My Learning page"
			+"TCID_13: Verify the name and type of the Learning path"
			+"TCID_14: Verify the Count of the items inside the Learning path"
			+"TCID_15: Verify the initial progress for Learnin path"
			+"TCID_16: Verify the course progress inside the learning path(i.e Completion percentage)"
			+"TCID_17: Verify the course progress inside the learning path(i.e Full completion)"
			+"TCID_18: Verify the Learning path Progress if the half contents are completed"
			+"TCID_19: Verify the Learning path Progress if the all contents are completed"
			+"TCID_20: Verify the completed tab after completion of the learning path")

	public void verifyHomePageLearningPath() {
		//appDriver = AppFactory.getiOSApp();
		appDriver = AppFactory.getAndroidApp();
		System.out.println("--------------------Verify HomePage LearningPath----------------------");

		MALoginSteps maLoginSteps = new MALoginSteps(appDriver);
		maLoginSteps.doLogin();
		// Select Instance Screen
		MASelectInstanceSteps mASIS = new MASelectInstanceSteps(appDriver);
		//mASIS.validateInstanceSelectionPage();

		//mASIS.swipeInstances();

		mASIS.selectFractalDemo();
		MAWhatsNewSteps mAWNS = new MAWhatsNewSteps(appDriver);
		mAWNS.validateWhatsNewPage();
		mAWNS.clickLater();

		MAMyLearningInProSteps mAMLS = new MAMyLearningInProSteps(appDriver);
		
		//TCID_14: Verify the Count of the items inside the Learning path
		mAMLS.verifyLearningPathCount();
		Reporter.writeSummary("TCID_14, Verify the Count of the items inside the Learning path, " +  mAMLS.getResult());
		//TCID_13: Verify the name and type of the Learning path
		mAMLS.verifyNameTitleInsideLpath();
		Reporter.writeSummary("TCID_13, Verify the name and type of the Learning path, " +  mAMLS.getResult());
		//TCID_15: Verify the initial progress for Learnin path
		mAMLS.verifyLpathIntialProgress();//Couldn't take the progress value in Ios, waiting for updated build from ajith
		Reporter.writeSummary("TCID_15, Verify the initial progress for Learnin path, " +  mAMLS.getResult());
		//TCID_16: Verify the course progress inside the learning path
		mAMLS.verifyCourseProgInLpath();//Couldn't take the progress value in Ios, waiting for updated build from ajith
		Reporter.writeSummary("TCID_16, Verify the course progress inside the learning path, " +  mAMLS.getResult());
		//TCID_17: Verify the course progress inside the learning path(i.e Full completion)
		mAMLS.verifyFullCourseProgInLpath();//Couldn't take the progress value in Ios, waiting for updated build from ajith
		Reporter.writeSummary("TCID_17, Verify the course progress inside the learning path(i.e Full completion), " +  mAMLS.getResult());
		//TCID_18: Verify the Learning path Progress if the half contents are completed
		mAMLS.verifyPartialLpathProg();//Couldn't take the progress value in Ios, waitinf for updated build from ajith
		Reporter.writeSummary("TCID_18, Verify the Learning path Progress if the half contents are completed, " +  mAMLS.getResult());
		//TCID_19: Verify the Learning path Progress if the all contents are completed
		mAMLS.verifyLpathFullCompletion();//Couldn't take the progress value in Ios, waitinf for updated build from ajith
		Reporter.writeSummary("TCID_19, Verify the Learning path Progress if the all contents are completed, " +  mAMLS.getResult());
		//TCID_20: Verify the completed tab after completion of the learning path
		mAMLS.verifyLpathMovedToCompTab();//Waiting for the Database Backup
		Reporter.writeSummary("TCID_20, Verify the completed tab after completion of the learning path, " +  mAMLS.getResult());
		
		mAMLS.clickMenu();
		MAMenuOptionsSteps mAMnuSteps = new MAMenuOptionsSteps(appDriver);
		mAMnuSteps.clickOnLogout();
	}
	/*7 -> New One Added by Manju Priya A - Jan-11-19 - Facing issue in click on resource*///karpagavalli
	@Test(groups = { "pilot" }, enabled = true, description = "TCID_33:"
			+ "Verification of Resources in My Learning page"
			+"TCID_28: Verify the name and type of the resource"
			+"TCID_29: Verify the count of the Resource"
			+"TCID_30: Verify the initial progress percentage of the resource"
			+"TCID_31: Verify the Progress percentage of the learning object inside the resource"
			+"TCID_32: Verify the full completion of the resource"
			+"TCID_33: Verify the completed tab after completion of the resource")

	public void verifyHomePageResource() {
		//appDriver = AppFactory.getiOSApp();
		appDriver = AppFactory.getAndroidApp();
		System.out.println("------------------------- Verify HomePage Resource ----------------------");

		MALoginSteps maLoginSteps = new MALoginSteps(appDriver);
		maLoginSteps.doLogin();
		// Select Instance Screen
		MASelectInstanceSteps mASIS = new MASelectInstanceSteps(appDriver);
		//mASIS.validateInstanceSelectionPage();

		//mASIS.swipeInstances();

		mASIS.selectFractalDemo();
		MAWhatsNewSteps mAWNS = new MAWhatsNewSteps(appDriver);
		mAWNS.validateWhatsNewPage();
		mAWNS.clickLater();

		MAMyLearningInProSteps mAMLS = new MAMyLearningInProSteps(appDriver);
		
		//TCID_28: Verify the name and type of the resource
		mAMLS.verifyResourceCount();
		Reporter.writeSummary("TCID_28, Verify the name and type of the resource, " +  mAMLS.getResult());
		//TCID_29: Verify the count of the Resource
		mAMLS.verifyNameTitleInsideResource();
		Reporter.writeSummary("TCID_29, Verify the count of the Resource, " +  mAMLS.getResult());
		//TCID_30: Verify the initial progress percentage of the resource
		mAMLS.verifyResourceIntialProgress();//Couldn't take the progress value in Ios, waiting for updated build from ajith
		Reporter.writeSummary("TCID_30, Verify the initial progress percentage of the resource, " +  mAMLS.getResult());
		//TCID_31: Verify the Progress percentage of the learning object inside the resource
		mAMLS.verifyLobjProgInResource();//Couldn't take the progress value in Ios, waiting for updated build from ajith
		Reporter.writeSummary("TCID_31, Verify the Progress percentage of the learning object inside the resource, " +  mAMLS.getResult());
		//TCID_32: Verify the full completion of the resource
		mAMLS.verifyFullResourceProg();//Couldn't take the progress value in Ios, waiting for updated build from ajith
		Reporter.writeSummary("TCID_32, Verify the full completion of the resource, " +  mAMLS.getResult());
		//TCID_33: Verify the completed tab after completion of the resource
		mAMLS.verifyRecMovedToCompTab();//Waiting for the Database Backup
		Reporter.writeSummary("TCID_33, Verify the completed tab after completion of the resource, " +  mAMLS.getResult());
		
		mAMLS.clickMenu();
		MAMenuOptionsSteps mAMnuSteps = new MAMenuOptionsSteps(appDriver);
		mAMnuSteps.clickOnLogout();
	}
	/*8 -> New One Added by Manju Priya A - Jan-11-19 - Facing issue in click on course*///karpagavalli
	@Test(groups = { "pilot" }, enabled = true, description = "TCID_33:"
			+ "Verification of Courses in My Learning page"
			+"TCID_21: Verify the name and type of the course"
			+"TCID_22: Verify the Count of the items inside the course"
			+"TCID_23: Verify the initial progress percentage of the course"
			+"TCID_24: Verify the Progress percentage of the learning object inside the course"
			+"TCID_25: Verify the Progress percentage of the course after completion of some contents"
			+"TCID_26: Verify the full completion of the course"
			+"TCID_27: Verify the completed tab after completion of the course")

	public void verifyHomePageCourse() {
		//appDriver = AppFactory.getiOSApp();
		appDriver = AppFactory.getAndroidApp();
		System.out.println("------------------------------------- Verify HomePage Course -----------------------------------");

		MALoginSteps maLoginSteps = new MALoginSteps(appDriver);
		maLoginSteps.doLogin();
		// Select Instance Screen
		MASelectInstanceSteps mASIS = new MASelectInstanceSteps(appDriver);
		//mASIS.validateInstanceSelectionPage();

		//mASIS.swipeInstances();

		mASIS.selectFractalDemo();
		MAWhatsNewSteps mAWNS = new MAWhatsNewSteps(appDriver);
		mAWNS.validateWhatsNewPage();
		mAWNS.clickLater();

		MAMyLearningInProSteps mAMLS = new MAMyLearningInProSteps(appDriver);
		
		//TCID_22: Verify the Count of the items inside the course
		mAMLS.verifycourseCount();
		Reporter.writeSummary("TCID_22, Verify the Count of the items inside the course, " +  mAMLS.getResult());
		//TCID_21: Verify the name and type of the course
		mAMLS.verifyNameTitleInsideCourse();
		Reporter.writeSummary("TCID_21, Verify the name and type of the course, " +  mAMLS.getResult());
		//TCID_23: Verify the initial progress percentage of the course
		mAMLS.verifyCourseIntialProgress();//Couldn't take the progress value in Ios, waiting for updated build from ajith
		Reporter.writeSummary("TCID_23, Verify the initial progress percentage of the course, " +  mAMLS.getResult());
		//TCID_24: Verify the Progress percentage of the learning object inside the course
		mAMLS.verifyLobjProgInCourse();//Couldn't take the progress value in Ios, waiting for updated build from ajith
		Reporter.writeSummary("TCID_24, Verify the Progress percentage of the learning object inside the course, " +  mAMLS.getResult());
		//TCID_25: Verify the Progress percentage of the course after completion of some contents
		mAMLS.verifyPartialCourseProg();//Couldn't take the progress value in Ios, waitinf for updated build from ajith
		Reporter.writeSummary("TCID_25, Verify the Progress percentage of the course after completion of some contents, " +  mAMLS.getResult());
		//TCID_26: Verify the full completion of the course
		mAMLS.verifyFullCourseProg();//Couldn't take the progress value in Ios, waiting for updated build from ajith
		Reporter.writeSummary("TCID_26, Verify the full completion of the course, " +  mAMLS.getResult());
		//TCID_27: Verify the completed tab after completion of the course
		mAMLS.verifyCourseMovedToCompTab();
		Reporter.writeSummary("TCID_27, Verify the completed tab after completion of the course, " +  mAMLS.getResult());
		
		mAMLS.clickMenu();
		MAMenuOptionsSteps mAMnuSteps = new MAMenuOptionsSteps(appDriver);
		mAMnuSteps.clickOnLogout();
	}
	/*9-> Added by Manju Priya A - Jan-11-19 - Completed without any issues.....*///
	@Test(groups = { "LoginPage0" }, enabled = true, description = "Verification of login Page"
			+ "TCID_2 : Verify user is able to login for origin fractal app with valid user name and password."
			+ "TCID_3: Verify the origin fractal app login page with invalid user name and password."
			+ "TCID_4: Verify the origin fractal app login page with invalid user name and  valid password."
			+ "TCID_5: Verify the origin fractal app login page with valid username and  invalid password.")
	public void LoginPage0() {
		//appDriver = AppFactory.getiOSApp();
		appDriver = AppFactory.getAndroidApp();
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
		//maLoginSteps.blankUserNamePassword();
		//TCID_2 : Verify user is able to login for origin fractal app with valid user name and password.
		maLoginSteps.verifyValidLogin();
		Reporter.writeSummary("TCID_2, Verify user is able to login for origin fractal app with valid user name and password., " +  maLoginSteps.getResult());
		
		MAMyLearningInProSteps mAMLS = new MAMyLearningInProSteps(appDriver);
		mAMLS.clickMenu();
		MAMenuOptionsSteps mAMnuSteps = new MAMenuOptionsSteps(appDriver);
		mAMnuSteps.clickOnLogout();
	}
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
	/*11 -> Added by Manju Priya A - Jan-11-19 - Completed no issues..... */
	@Test(groups = { "pilot" }, enabled = true, description = "TCID_20,21:Verification of Select client page"
			+ "TCID_20: Verify that assigned clients are listed for user"
			+ "TCID_21: Verify that user able to select their 'Learning site' ")
	public void verifySelectClientPage() {
		appDriver = AppFactory.getiOSApp();
		//appDriver = AppFactory.getAndroidApp();
		System.out.println("---------------------------------------verify Select ClientPage-------------------------------");

		MALoginSteps maLoginSteps = new MALoginSteps(appDriver);
		maLoginSteps.doLogin();
		// Select Instance Screen
		MASelectInstanceSteps mASIS = new MASelectInstanceSteps(appDriver);
		// My Learning Screen
		MAMyLearningInProSteps mAMLS = new MAMyLearningInProSteps(appDriver);
		// Menu Options Screen
		MAMenuOptionsSteps mAMnuSteps = new MAMenuOptionsSteps(appDriver);
		//String[] instances = {"Fractal","Fractal Demo"};
		
		mASIS.verifyInstances();
		Reporter.writeSummary("TCID_20, Verify that assigned clients are listed for user, " +  mASIS.getResult());
		mASIS.verifyFractalSelection();
		wait(5);
		mASIS.verifyFractalDemoSelection();
		Reporter.writeSummary("TCID_21, Verify that user able to select their 'Learning site', " +  mASIS.getResult());
		
		mAMLS.clickMenu();
		mAMnuSteps.clickOnLogout();
	}
	/*12 -> Added by Manju Priya A - Jan-11-19 -  Completed no issues.....*/
	@Test(groups = { "pilot" }, enabled = true, description = "TCID_01:Verification of Splash Screen"
			+ "TCID_01: Verifying whether the splash screen appears after launching the app")
	public void verifySplashScreen() {
		System.out.println("---------------------------------------verifySplashScreen-------------------------------");
		appDriver = AppFactory.getiOSApp();
		//appDriver = AppFactory.getAndroidApp();
		MALoginSteps maLoginSteps = new MALoginSteps(appDriver);
		maLoginSteps.verifySplashScreen();
		Reporter.writeSummary("TCID_01, Verifying whether the splash screen appears after launching the app, " +  maLoginSteps.getResult());
	}
	/*13 - >Added by Manju Priya A - Jan-11-19 -  Completed without any issues....*/
	@Test(groups = { "pilot" }, enabled = true, description = "TCID_23:Verification of What's new popup"
			+ "TCID_23: Verifying whether the whatsnew popup is closed on clicking the Later button")
	public void verifyWhatsNewPage() {
		System.out.println("---------------------------------------verifyWhatsNewPage-------------------------------");
		appDriver = AppFactory.getiOSApp();
		//appDriver = AppFactory.getAndroidApp();
		MALoginSteps maLoginSteps = new MALoginSteps(appDriver);
		maLoginSteps.doLogin();		
		// Select Instance Screen
		MASelectInstanceSteps mASIS = new MASelectInstanceSteps(appDriver);
		mASIS.selectFractalDemo();
		// My Learning Screen
		MAMyLearningInProSteps mAMLS = new MAMyLearningInProSteps(appDriver);
		// Menu Options Screen
		MAMenuOptionsSteps mAMnuSteps = new MAMenuOptionsSteps(appDriver);
		// What's New Screen MAWhatsNewSteps
		MAWhatsNewSteps mAWNS = new MAWhatsNewSteps(appDriver);
		wait(5);
		
		mAWNS.verifyWhatsNewLaterBtn();
		Reporter.writeSummary("TCID_23, Verifying whether the whatsnew popup is closed on clicking the Later button, " +  mAWNS.getResult());
		
		//For Logout
		mAMLS.clickMenu();
		mAMnuSteps.clickOnLogout();
	}
	/*14 - >Added by Manju Priya A - Jan-11-19 - COmpleted no issues.....*///Mahesh code, he has to change for android
	@Test(groups = { "login1" }, enabled = true, description = "TCID_77,78: Verification of Logout"
			+"TCID_77: Verifying whether the user can able to logout successfully on cliking the logout button.On Clicking No button"
			+"TCID_78: Verifying whether the user can able to logout successfully on cliking the logout button. On Clicking Yes button.")
	public void verifyLogout() {//Name changed from LoginPage1 to verifyLogout
		System.out.print("-------------------------------Logout is running-------------------------------");
		appDriver = AppFactory.getiOSApp();
		//appDriver = AppFactory.getAndroidApp();
		MALoginSteps maLoginSteps = new MALoginSteps(appDriver);
		maLoginSteps.doLogin();
		MASelectInstanceSteps mASIS = new MASelectInstanceSteps(appDriver);
		mASIS.validateInstanceSelectionPage();
		mASIS.selectFractalDemo();
		
		maLoginSteps.verifyLogoutWithNoBtn();
		Reporter.writeSummary("TCID_77, Verifying whether the user can able to logout successfully on cliking the logout button.On Clicking No button, " +  maLoginSteps.getResult());
		maLoginSteps.verifyLogoutWithYesBtn();
		Reporter.writeSummary("TCID_78, Verifying whether the user can able to logout successfully on cliking the logout button. On Clicking Yes button., " +  maLoginSteps.getResult());
		
		/*oldmaLoginSteps.clickYesBtn();*/
	//	maLoginSteps.clickOnLogout();
	}
	/*15 -> Added by Manju Priya A - Jan-11-19 - COmpleted no issues.....*/
	@Test(groups = { "pilot" }, enabled = false, description = "TC79:the \"No internet connection Available\" message is getting displayed if there is no internet connection")
	public void verifyGeneralNoInternet() {//Hasve to tell mahesh to change function name from general to verifyGeneralNoInternet in android
		System.out.print("-------------------------------General - Int-------------------------------");
		appDriver = AppFactory.getiOSApp();
		MALoginSteps maLoginSteps = new MALoginSteps(appDriver);
		maLoginSteps.doLogin();
		//TCID_79:the "No Internet connection Available" message is getting displayed if there is no Internet connection
		maLoginSteps.noInternetErrorVerify();
		Reporter.writeSummary("TCID_79, No Internet connection Available\" message is getting displayed if there is no Internet connection, " +  maLoginSteps.getResult());
	}
	/*16 -> Added by Manju Priya A - Jan-14-19*/
	@Test(groups = { "pilot" }, enabled = true, description = "TCID_58,59,60:Verification of Notification page"
			+ "TCID_58: Verifying whether the assigned content is getting displayed on clicking the notification bell icon"
			+ "TCID_59: Verifying whether all the assigned items are getting displayed on clicking the more button"
			+ "TCID_60: Verifyiong whether the content is accessible from the notification page")
	public void verifyNotificationPage() {
		System.out.print("-------------------------------Verification of notification-------------------------------");
		appDriver = AppFactory.getiOSApp();

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
		mAMLS.clickNotification();
		
		//TCID_58: Verifying whether the assigned content is getting displayed on clicking the notification bell icon
		mAMLS.verifyNotification();
		Reporter.writeSummary("TCID_58, Verifying whether the assigned content is getting displayed on clicking the notification bell icon, " +  mAMLS.getResult());
		//TCID_59: Verifying whether all the assigned items are getting displayed on clicking the more button
		mAMLS.verifyMoreButton();
		Reporter.writeSummary("TCID_59, Verifying whether all the assigned items are getting displayed on clicking the more button, " +  mAMLS.getResult());
		//TCID_60: Verifyiong whether the content is accessible from the notification page
		mAMLS.verifyContentAccess();//Yet to start
		Reporter.writeSummary("TCID_60, Verifyiong whether the content is accessible from the notification page, " +  mAMLS.getResult());
		
		mAMLS.clickMenu();
		mAMnuSteps.clickOnLogout();
	}
	//After Integration new code starts here - Jan_14_19
	/*Added by Manju Priya A - Jan_11_19*/
	@Test(groups = { "pilot" }, enabled = true, description = "TCID_80,81,82:Verification of catalog page"
			+ "TCID_80: Verify the voice assitant is available in the Mylearning page on launching the app."
			+ "TCID_81: Verify to check the display of the alert 'allow Origin Fractal to record audio?' on pressing the voice assistant")
	public void verifyVoice() {
		print("-------------------------------Verification of Voice assistant-------------------------");
		appDriver = AppFactory.getiOSApp();

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
		//mAMLS.verifyAllowPopup();->Facing issues in  taking xpath
		Reporter.writeSummary("TCID_81, Verify to check the display of the alert \"allow Origin Fractal to record audio?' on pressing the voice assistant, " +  mAMLS.getResult());
		//TCID_82: Verify the presence of Speaker icon and the Voice assistant icon
		//mAMLS.verifyVoiceAssistLabels();->Facing issues in  taking xpath
		Reporter.writeSummary("TCID_82, Verify the presence of Speaker icon and the Voice assistant icon, " +  mAMLS.getResult());
		
		// Menu Options Screen
		MAMenuOptionsSteps mAMnuSteps = new MAMenuOptionsSteps(appDriver);
		wait(5);
		mAMLS.clickMenu();
		mAMnuSteps.clickOnLogout();
	}
	/*Added by Manju Priya A - Dec-19-18*/
	@Test(groups = { "pilot" }, enabled = true, description = "TCID_42,43,50,45,47:Verification of catalog page"
			+ "TCID_42: Verify Popular categories are listed in the Catalog page"
			+ "TCID_43: Verify what's new contents are listed in the Catalog page"
			+ "TCID_45: Verify the BUY button for the paid catalog item"
			+ "TCID_50: Verify the filter icon is displayed"
			+ "TCID_47: Verify the Catalogs are displayed correspond to the selected Category under Popular category")
	public void verifyCatalogPage0() {
		print("---------------------------------------------- Verification of Catalog Page ----------------------------------------------");
		appDriver = AppFactory.getiOSApp();

		MALoginSteps maLoginSteps = new MALoginSteps(appDriver);
		maLoginSteps.doLogin();
		// Select Instance Screen
		MASelectInstanceSteps mASIS = new MASelectInstanceSteps(appDriver);
		//mASIS.selectFractal();
		mASIS.selectFractalDemo();
		// What's New Screen MAWhatsNewSteps
		MAWhatsNewSteps mAWNS = new MAWhatsNewSteps(appDriver);
		//wait(5);
		mAWNS.clickLater();
		// My Learning Screen
		MAMyLearningInProSteps mAMLS = new MAMyLearningInProSteps(appDriver);
		mAMLS.clickMenu();
		// Menu Options Screen
		MAMenuOptionsSteps mAMnuSteps = new MAMenuOptionsSteps(appDriver);
		mAMnuSteps.clickOnCategory();
		// Catalog Screen
		MACatalogSteps mACatSteps = new MACatalogSteps(appDriver);
		wait(5);
		
		//TCID_42: Verify Popular categories are listed in the Catalog page
		mACatSteps.verifyPopularCategory();
		Reporter.writeSummary("TCID_42, Verify Popular categories are listed in the Catalog page, " +  mACatSteps.getResult());
		//TCID_43: Verify what's new contents are listed in the Catalog page
		mACatSteps.verifyWhatsNewContents();
		Reporter.writeSummary("TCID_43, Verify what's new contents are listed in the Catalog page, " +  mACatSteps.getResult());
		//TCID_50: Verify the filter icon is displayed
		mACatSteps.verifyFilterExist() ;
		Reporter.writeSummary("TCID_50, Verify the filter icon is displayed, " +  mACatSteps.getResult());
		//TCID_45: Verify the BUY button for the paid catalog item
		mACatSteps.verifyBuyButton();
		Reporter.writeSummary("TCID_45, Verify the BUY button for the paid catalog item, " +  mACatSteps.getResult());
		//TCID_47: Verify the Catalogs are displayed correspond to the selected Category under Popular category
		mACatSteps.verifyCategory();
		Reporter.writeSummary("TCID_47, Verify the Catalogs are displayed correspond to the selected Category under Popular category, " +  mACatSteps.getResult());
		
		mAMLS.clickMenu();
		mAMnuSteps.clickOnLogout();
	}
	/*Added by Manju Priya A - Dec-20-18*/
	@Test(groups = { "pilot" }, enabled = true, description = "TCID_48,49,51,52,53,54,55,56:Verification of catalog page"
			+ "TCID_48: Verify LIST view"
			+ "TCID_49: Verify GRID view"
			+ "TCID_51: Verify bundle filter"
			+ "TCID_53: Verify learning path filter"
			+ "TCID_52: Verify course filter"
			+ "TCID_54: Verify resource filter"
			+ "TCID_55: Verify all the contents are displayed if the All Filter is applied"
			+ "TCID_56: Verify the Language filter is working fine")
	public void verifyCatalogPage1() {
		print("---------------------------------------------- Verification of Catalog Page 1 ----------------------------------------------");
		appDriver = AppFactory.getiOSApp();
		//appDriver = AppFactory.getAndroidApp();
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
		
		//TCID_48: Verify LIST view
		mACatSteps.verifyListView();
		Reporter.writeSummary("TCID_48, Verify LIST view, " +  mACatSteps.getResult());
		//TCID_49: Verify GRID view
		mACatSteps.verifyGridView();
		Reporter.writeSummary("TCID_49, Verify GRID view, " +  mACatSteps.getResult());
		//TCID_51: Verify bundle filter
		mACatSteps.verifyBundleFilter();
		Reporter.writeSummary("TCID_51, Verify bundle filter, " +  mACatSteps.getResult());
		//TCID_53: Verify learning path filter
		mACatSteps.verifyLpathFilter();
		Reporter.writeSummary("TCID_53, Verify learning path filter, " +  mACatSteps.getResult());
		//TCID_52: Verify course filter
		mACatSteps.verifyCourseFilter();
		Reporter.writeSummary("TCID_52, Verify course filter, " +  mACatSteps.getResult());
		//TCID_54: Verify resource filter
		mACatSteps.verifyResourceFilter();
		Reporter.writeSummary("TCID_54, Verify resource filter, " +  mACatSteps.getResult());
		//TCID_55: Verify all the contents are displayed if the All Filter is applied
		mACatSteps.verifyAllFilter();
		Reporter.writeSummary("TCID_55, Verify all the contents are displayed if the All Filter is applied, " +  mACatSteps.getResult());
		//TCID_56: Verify the Language filter is working fine
		mACatSteps.verifyLangFilter();
		Reporter.writeSummary("TCID_56, Verify the Language filter is working fine, " +  mACatSteps.getResult());
		
		wait(5);
		mAMLS.clickMenu();
		mAMnuSteps.clickOnLogout();
	}
	//Jan_21_19
}
