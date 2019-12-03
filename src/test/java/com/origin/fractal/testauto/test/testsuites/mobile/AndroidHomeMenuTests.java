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

public class AndroidHomeMenuTests extends FractalBaseAppTest {

	private AppiumDriver<MobileElement> appDriver;

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
		mAMLS.clickMenu();
		mAMnuSteps.clickOnLogout();
	}

	@Test(groups = { "pilot" }, enabled = true, description = "TCID_28,29,30,31,32,33,61:"
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

}
