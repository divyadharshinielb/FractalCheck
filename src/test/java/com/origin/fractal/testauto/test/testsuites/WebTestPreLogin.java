package com.origin.fractal.testauto.test.testsuites;

import java.io.IOException;
/*
 * File: WebTestPreLogin.java
 * Purpose: Prelogin page function(FR1-2994)
 * Number of Test cases: 05
 * Created by: Mahesh G
 * Updated on: 5-11-2020
 */

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.origin.fractal.testauto.DataManager;
import com.origin.fractal.testauto.steps.CustomizationRolesSteps;
import com.origin.fractal.testauto.steps.PreLoginSteps;
import com.origin.fractal.testauto.test.FractalBaseWebTest;
import com.wv.auto.framework.BrowserFactory;
import com.wv.auto.framework.utils.Reporter;

 public class WebTestPreLogin extends FractalBaseWebTest{
		/*@DataProvider
		public Object[][] browers() {
			return new Object[][] {
				new Object[] { "1", "chrome" }
				//		 new Object[] { "2", "firefox" },
				//		 new Object[] { "3", "msedge" } ,
				//		 new Object[] { "4", "ie11" }
			};
		}*/
		@Test(dataProviderClass = DataManager.class,dataProvider="browers", groups= {"pilot"}, enabled= false, description="")
		public void Prelogin(String row, String strBrowserName) throws IOException {
			driver = BrowserFactory.getBrowser(strBrowserName);	
			PreLoginSteps preLoginSteps = new PreLoginSteps(driver);
			preLogin(driver);
			preLoginSteps.LoginPageElements();
			Reporter.writeSummary("FR1-2994_PreLogin_TC-001,Verify the header elements in Pre-login page," +preLoginSteps.getResult());
			preLoginSteps.preLoginPageFiltersVerification();
			Reporter.writeSummary("FR1-2994_PreLogin_TC-002,Verify what's  new filters in pre-login page," +preLoginSteps.getResult());
			preLoginSteps.signUpFunction();
			Reporter.writeSummary("FR1-2994_PreLogin_TC-003,Verify singup function in pre-login page," +preLoginSteps.getResult());
			preLoginSteps.forBusiness();
			Reporter.writeSummary("FR1-2994_PreLogin_TC-004,Verify business user function in pre-login page," +preLoginSteps.getResult());
			preLoginSteps.loginFunction();
			Reporter.writeSummary("FR1-2994_PreLogin_TC-005,Verify login function in pre-login page," +preLoginSteps.getResult());
 }
		//added By Divya based on Nov-Dec sprint
		@Test(dataProviderClass = DataManager.class,dataProvider="browers", groups= {"pilot"}, enabled= true, description="")
		public void adminPreLogin(String row, String strBrowserName) throws IOException {
			driver = BrowserFactory.getBrowser(strBrowserName);	
			PreLoginSteps preLoginSteps = new PreLoginSteps(driver);
			//login(driver);
			CustomizationRolesSteps rolestep = new CustomizationRolesSteps(driver);
			loginToContentAdmin(driver);
			rolestep.clickSettingsicon();
			preLoginSteps.clickWhiteLabel();
			preLoginSteps.preloginAdmin();
			Reporter.writeSummary("FR1-2994_PreLogin_TC-006,Verify the different section for pre-login home in admin," +preLoginSteps.getResult());
			rolestep.adminLogout();
			wait(5);
			preLogin(driver);
			preLoginSteps.wishlistFlowCheck();
			Reporter.writeSummary("FR1-2994_PreLogin_TC-007,Verify the navigation to login page after selecting wishlist item," +preLoginSteps.getResult());
		}
 }
