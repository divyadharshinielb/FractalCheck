package com.origin.fractal.testauto.test.testsuites;

import java.io.IOException;

import org.testng.annotations.Test;

import com.origin.fractal.testauto.DataManager;
import com.origin.fractal.testauto.steps.LoginSteps;
import com.origin.fractal.testauto.test.FractalBaseWebTest;
import com.wv.auto.framework.BrowserFactory;
import com.wv.auto.framework.utils.Reporter;

/* File Name: WebTestLogin.java
 * Purpose: check login
 * No. of Testcases: 1
 * Create by: vigheshwaran R
 * created on: 6-Aug-20
 * 
 */
public class WebTestLogin extends FractalBaseWebTest {
	@Test(dataProviderClass=DataManager.class, dataProvider = "browers", groups = { "pilot" }, enabled = true, priority = 0 )
	public void StagingSanityLogin(String row, String strBrowserName) throws IOException {
		driver = BrowserFactory.getBrowser(strBrowserName);
		LoginSteps steps=new LoginSteps(driver);
		loginToContentAdmin(driver);
		steps.verifyAdminLogin();
	/*	login(driver);
		steps.verifyLogin();
	*/	Reporter.writeSummary("TC-01,Verify the Login is working," +steps.getResult() );
		
	}
}
