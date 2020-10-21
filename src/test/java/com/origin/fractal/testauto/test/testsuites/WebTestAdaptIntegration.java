package com.origin.fractal.testauto.test.testsuites;



import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.origin.fractal.testauto.steps.AdaptIntegrationSteps;
import com.origin.fractal.testauto.test.FractalBaseWebTest;
import com.wv.auto.framework.BrowserFactory;
import com.wv.auto.framework.utils.Reporter;
/* File Name: WebTestAdaptIntegration.java
 * Purpose: Check for adapt icon in admin side 
 * Number of Test cases: 1
 * Created by: DivyaDharshini
 * Created on: 30-sept-2020
 */

public class WebTestAdaptIntegration extends FractalBaseWebTest {
	@DataProvider
	public  Object[][] browers() {
		return new Object[][] {
			new Object[] { "1", "chrome" }
		};
	}
	@Test(dataProvider = "browers", groups= {"pilot"}, enabled= true, description="")
	public void adaptCheck(String row, String strBrowserName) throws Exception {
		driver = BrowserFactory.getBrowser(strBrowserName);
		loginToContentAdmin(driver);
		AdaptIntegrationSteps adaptStep = new AdaptIntegrationSteps(driver);
		adaptStep.iconVerification();
		Reporter.writeSummary("FR1-2775_Doc_TC_001,Verify Empty Field validation messages for Document, " +  adaptStep.getResult() );



	}
}