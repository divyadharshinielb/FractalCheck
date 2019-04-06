package com.origin.fractal.testauto.test.testsuites;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.origin.fractal.testauto.DataManager;
import com.origin.fractal.testauto.steps.HomeSteps;
import com.origin.fractal.testauto.steps.LoginSteps;
import com.origin.fractal.testauto.steps.ValidityContentAdminSteps;
import com.origin.fractal.testauto.test.FractalBaseWebTest;
import com.wv.auto.framework.BrowserFactory;

public class WebTestContentAdmin extends FractalBaseWebTest{
	@Test(dataProviderClass=DataManager.class, dataProvider = "browers", groups = { "Phase1.0" }, enabled = true)
	
	public void testMyAccountPage(String row, String strBrowserName) {
		driver = BrowserFactory.getBrowser(strBrowserName);
		LoginSteps loginSteps = new LoginSteps(driver);
		HomeSteps homeSteps = new HomeSteps(driver);
		loginSteps.loginAdmin();
		ValidityContentAdminSteps validityContentAdminSteps = new ValidityContentAdminSteps(driver);
		validityContentAdminSteps.unLimited();
		homeSteps.clickLogout();
		loginSteps.doLogin();
		validityContentAdminSteps.UserLogin();
		homeSteps.clickLogout();
		validityContentAdminSteps.editCatalog();
		homeSteps.clickLogout();
		loginSteps.loginAdmin();
		validityContentAdminSteps.deleteCatalog();
		homeSteps.clickLogout();
		validityContentAdminSteps.validity();
		homeSteps.clickLogout();
		loginSteps.doLogin();
		validityContentAdminSteps.UserLogin();
		homeSteps.clickLogout();
	}
}
