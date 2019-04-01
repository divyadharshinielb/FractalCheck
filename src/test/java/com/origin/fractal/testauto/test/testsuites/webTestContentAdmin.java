package com.origin.fractal.testauto.test.testsuites;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.origin.fractal.testauto.steps.HomeSteps;
import com.origin.fractal.testauto.steps.LoginSteps;
import com.origin.fractal.testauto.steps.ValidityContentAdminSteps;
import com.wv.auto.framework.BrowserFactory;

public class webTestContentAdmin {
	private WebDriver driver;
	@DataProvider
	public Object[][] browers() {
		return new Object[][] {
			new Object[] { "1", "chrome" }
	//	, new Object[] { "2", "firefox" }
	//	, new Object[] { "3", "msedge" } 
//		 new Object[] { "4", "ie11" }
		};
	}
	@Test(dataProvider = "browers", groups= {"pilot"}, enabled= true)
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
