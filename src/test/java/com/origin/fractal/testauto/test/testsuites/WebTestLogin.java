package com.origin.fractal.testauto.test.testsuites;

import java.io.IOException;

import org.testng.annotations.Test;

import com.origin.fractal.testauto.DataManager;
import com.origin.fractal.testauto.FractalBaseStep;
import com.origin.fractal.testauto.steps.LoginSteps;
import com.origin.fractal.testauto.test.FractalBaseWebTest;
import com.wv.auto.framework.BrowserFactory;
import com.wv.auto.framework.utils.Reporter;

import jxl.common.Assert;

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
		login(driver);
		steps.verifyLogin();
		Reporter.writeSummary("TC-01,Verify the Admin/User Login is working," +steps.getResult() );
		
	}
	@Test(dataProviderClass=DataManager.class, dataProvider = "browers", groups = { "Phase1.0" }, enabled = false, description = "Login Page")
	public void checkOverallTestNGResult(String row, String strBrowserName) {
		print("Number of Test cases Failed ="+ FractalBaseStep.overallTestNGResult );
		if(FractalBaseStep.overallTestNGResult > 0) {
			Assert.verify(true);
		}
	}
}
