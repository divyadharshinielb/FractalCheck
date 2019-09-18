package com.origin.fractal.testauto.test.testsuites;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.origin.fractal.testauto.steps.AccountSteps;
import com.origin.fractal.testauto.steps.HomeSteps;
import com.origin.fractal.testauto.steps.MyLearningSteps;
import com.origin.fractal.testauto.steps.SettingsSteps;
import com.origin.fractal.testauto.test.FractalBaseWebTest;
import com.wv.auto.framework.BrowserFactory;

public class WebTestsSprint0 extends FractalBaseWebTest {

	@DataProvider
	public Object[][] browers() {
		return new Object[][] { new Object[] { "1", "chrome" }
//		, new Object[] { "2", "firefox" }
//		, new Object[] { "3", "msedge" } 
		};
	}

	@Test(dataProvider = "browers", groups = {
			"Phase1.2" }, enabled = true, description = "TCID_nnn : Verify Settings Page")
	public void testSettings(String row, String strBrowserName) {

		driver = BrowserFactory.getBrowser(strBrowserName);
		login(driver);

// Test moves to next page
		HomeSteps homeSteps = new HomeSteps(driver);
		homeSteps.clickOnProfile();
		homeSteps.clickOnsettings();

// Test moves to next page
		SettingsSteps settingsSteps = new SettingsSteps(driver);
		settingsSteps.printStatus();
		settingsSteps.clickOnSwitch();
		settingsSteps.clickOnSave();
	}

	@Test(dataProvider = "browers", groups = {
			"pilot" }, enabled = true, description = "TCID_nnn : Verify navigation to My Learning page")
	public void testMyLearningPage(String row, String strBrowserName) {
		driver = BrowserFactory.getBrowser(strBrowserName);
		login(driver);

// Test moves to Home page
		HomeSteps homeSteps = new HomeSteps(driver);
		homeSteps.clickOnMyLearning();
		wait(5);

// Test moves to MyLearning page
		MyLearningSteps mLSteps = new MyLearningSteps(driver);
		mLSteps.verifyMyLearningPage();

		mLSteps.verifySubMenu();
		wait(5);
// Added by Manju Priya A
// To verify the completion status Nov_12_18
		mLSteps.verifyComplStatus();
		wait(5);
// To verify the catalog name after opening the particular catalog Nov_13_18
		mLSteps.verifyCatalogname();
		wait(5);
// To verify the catalog labels Nov_13_18
		mLSteps.verifyCatalogDetails();
		wait(5);
// To Verify the bundleContents Nov_14_18
		mLSteps.verifyCourseInBundle();
// To verify ALL filter Nov_15_18
		wait(5);
		homeSteps.clickOnMyLearning();
		wait(5);
		mLSteps.verifyAllFilter();
// To verify Bundle filter Nov_15_18
		mLSteps.verifyBundleFilter();
// To verify Course filter Nov_15_18
		mLSteps.verifyCourseFilter();
// To verify Resource filter Nov_15_18
		mLSteps.verifyResourceFilter();
// To verify Resource filter Nov_16_18
		mLSteps.verifyTickmark();
// Added by manju Priya A
	}

	@Test(dataProvider = "browers", groups = { "pilot" }, enabled = true,
			// description="Verify categories are available as expected" )
			description = "Verify dashboardsteps  are available as expected")
	public void testDashboardPage(String row, String strBrowserName) {

		driver = BrowserFactory.getBrowser(strBrowserName);
		login(driver);

		// Test moves to Home page
		// ******mahesh*******//
		HomeSteps homeSteps = new HomeSteps(driver);
//	homeSteps.verifyLearningInProgressText();
		homeSteps.verifyComplStatus();
		homeSteps.verifyCoverageText();
		homeSteps.verifyContinueText();
		homeSteps.clickContinueBtnRetToHome();
		homeSteps.verifyNavTORcntAddedCoursesRtnToHome();
		homeSteps.verifyRcntAdded_CoursesText();
		homeSteps.verifyTopArrBtn();
		// **************//
		// wait(10);
		// *******11/17/2018(Inprogress)*************//
		/**
		 * homeSteps.verifyAllFilterRcntAdded();
		 * 
		 * //To verify Bundle filter Nov_15_18 homeSteps.verifyBundleFilterRcntAdded();
		 * //To verify Course filter Nov_15_18 homeSteps.verifyCourseFilterRcntAdded();
		 * //To verify Resource filter Nov_15_18
		 * homeSteps.verifyResourceFilterRcntAdded(); //To verify Resource filter
		 * Nov_16_18
		 * 
		 */
	}
}
