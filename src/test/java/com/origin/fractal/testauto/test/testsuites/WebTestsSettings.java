package com.origin.fractal.testauto.test.testsuites;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.origin.fractal.testauto.DataManager;
import com.origin.fractal.testauto.steps.HomeSteps;
import com.origin.fractal.testauto.steps.SettingsSteps;
import com.origin.fractal.testauto.test.FractalBaseWebTest;
import com.wv.auto.framework.BrowserFactory;
import com.wv.auto.framework.utils.Reporter;

public class WebTestsSettings extends FractalBaseWebTest {


	@Test(dataProviderClass = DataManager.class, dataProvider = "browers", groups = {
			"Phase1.2" }, enabled = true, description = "TCID_nnn : Verify Settings Page")
	public void testSettings(String row, String strBrowserName) {
		String result = "Passed";
		driver = BrowserFactory.getBrowser(strBrowserName);
		login(driver);

		//Test moves to next page
		HomeSteps homeSteps = new HomeSteps(driver);
		homeSteps.clickOnProfile();
		//TCID_76:The user is able to navigate to the settings page on clicking the "Settings" Hyperlink
		homeSteps.clickOnsettings();
		Reporter.writeSummary("TCID_Settings_076,Verify The user is able to navigate to the settings page on clicking the Settings Hyperlink, " +   result);

		//Test moves to next page
		SettingsSteps settingsSteps = new SettingsSteps(driver);
	//	settingsSteps.printStatus();
		//TCID_77:The Mail Notification is getting enabled on selecting the Mail notification button from disable to enable 
	/*	settingsSteps.clickOnSwitch(); 15/4/2020
		Reporter.writeSummary("TCID_Settings_077,Verify The Mail Notification is getting enabled on selecting the Mail notification button from disable to enable, " +   settingsSteps.getResult() );
		settingsSteps.clickOnSave(); */
	}
}
    