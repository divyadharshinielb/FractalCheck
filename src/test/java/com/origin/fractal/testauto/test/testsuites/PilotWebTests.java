package com.origin.fractal.testauto.test.testsuites;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.origin.fractal.testauto.steps.AccountSteps;
import com.origin.fractal.testauto.steps.HomeSteps;
import com.origin.fractal.testauto.steps.MyLearningSteps;
import com.origin.fractal.testauto.test.FractalBaseWebTest;
import com.wv.auto.framework.BrowserFactory;

public class PilotWebTests extends FractalBaseWebTest {

	@DataProvider
	public Object[][] browers() {
		return new Object[][] { new Object[] { "1", "chrome" }, new Object[] { "2", "firefox" }
//		,
//				new Object[] { "3", "msedge" }
		};
	}

	@Test(dataProvider = "browers", groups = {
			"pilot" }, enabled = true, description = "TCID_031 : Verify navigation to Home page")
	public void testHomePage(String row, String strBrowserName) {

		driver = BrowserFactory.getBrowser(strBrowserName);
		login(driver);

		// Test moves to Home page
		HomeSteps homeSteps = new HomeSteps(driver);
		homeSteps.verifySubHeaders();
	}

	@Test(dataProvider = "browers", groups = {
			"pilot" }, enabled = true, description = "TCID_004 : Verify navigation to My Learning page")
	public void testMyLearningPage(String row, String strBrowserName) {

		driver = BrowserFactory.getBrowser(strBrowserName);
		login(driver);

		// Test moves to Home page
		HomeSteps homeSteps = new HomeSteps(driver);
		homeSteps.clickOnMyLearning();
		// Test moves to MyLearning page
		MyLearningSteps mLSteps = new MyLearningSteps(driver);
		mLSteps.verifyMyLearningPage();
		mLSteps.verifySubMenu();
	}

	@Test(dataProvider = "browers", groups = {
			"pilot" }, enabled = true, description = "TCID_061 : Verify navigation to My Account page")
	public void testMyAccountPage(String row, String strBrowserName) {

		driver = BrowserFactory.getBrowser(strBrowserName);
		login(driver);
		// Test moves to next page
		AccountSteps accountSteps = new AccountSteps(driver);
		accountSteps.clickOnMyAccount();
		accountSteps.verifyAccountPageLabels();

	}

	@Test(dataProvider = "browers", groups = {
			"pilot" }, enabled = true, description = "TCID_080 : Verify categories are available as expected")
	public void testCategories(String row, String strBrowserName) {

		driver = BrowserFactory.getBrowser(strBrowserName);
		login(driver);

		// Test moves to Home page
		HomeSteps homeSteps = new HomeSteps(driver);
		homeSteps.verifyCategories();

	}

	@Test(dataProvider = "browers", groups = {
			"pilot" }, enabled = true, description = "TCID_032 : Verify notifications are available as expected")
	public void testNotifications(String row, String strBrowserName) {

		driver = BrowserFactory.getBrowser(strBrowserName);
		login(driver);

		// Test moves to next page
		HomeSteps homeSteps = new HomeSteps(driver);
		homeSteps.verifyBellNotification();

	}

}
