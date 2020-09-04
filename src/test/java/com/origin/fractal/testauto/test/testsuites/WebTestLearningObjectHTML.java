package com.origin.fractal.testauto.test.testsuites;

import java.io.IOException;

import org.testng.annotations.Test;

import com.origin.fractal.testauto.DataManager;
import com.origin.fractal.testauto.steps.LearningObjectHTMLSteps;
import com.origin.fractal.testauto.test.FractalBaseWebTest;
import com.wv.auto.framework.BrowserFactory;
import com.wv.auto.framework.utils.Reporter;
/* File Name: WebTestLearningObjectHTML.java
 * Purpose: Check to HTML Learning object -FR1-2207
 * Number of Testcases: 6
 * Created by: Vignesh
 * Created on: 20/Jun/20
 * Updated on: 3/Sep/20
 */
public class WebTestLearningObjectHTML extends FractalBaseWebTest{
	@Test(dataProviderClass=DataManager.class, dataProvider = "browers", groups = { "pilot"}, enabled = true,priority=1, description = "Verification for all the 31 email templates")
	public void TestHTMLlearningObjectCreation(String row, String strBrowserName) throws IOException{
		driver = BrowserFactory.getBrowser(strBrowserName);
		siteAdminLoginwithcookies(driver); 
		LearningObjectHTMLSteps HTMLSteps= new LearningObjectHTMLSteps(driver);
		HTMLSteps.verifyCreateHtmlLearningObject();
		Reporter.writeSummary("FR1-2207_HtmlLO_TC-001,Verify that Site admin is able to Create HTML Learning object," +HTMLSteps.getResult());
		HTMLSteps.verifyEditAndCancelHTMLLearningObject();
		Reporter.writeSummary("FR1-2207_HtmlLO_TC-002,Verify that Site admin is able to click cancel and Edit the HTML Learning object," +HTMLSteps.getResult());
		HTMLSteps.verifyFilterAndSearchHtmlLO();	
		Reporter.writeSummary("FR1-2207_HtmlLO_TC-003,Verify that Site admin is able to filter and search the HTML Learning object," +HTMLSteps.getResult());
		HTMLSteps.createandEditCatalogBundleWithHTML("ADD HTML");
		Reporter.writeSummary("FR1-2207_HtmlLO_TC-004,Verify that Site admin is able to map the HTML Learning Object to Bundle Catalog item," +HTMLSteps.getResult());
		login1(driver); 
		HTMLSteps.userSearchHTMLLOAndLaunchHTML();
		Reporter.writeSummary("FR1-2207_HtmlLO_TC-005,Verify that Users able to see the HTML Learning Object in Bundle Catalog item," +HTMLSteps.getResult());
		siteAdminLogin(driver); 
		HTMLSteps.verifyDeleteHTMLLearnignobject();
		Reporter.writeSummary("FR1-2207_HtmlLO_TC-006,Verify that Site admin is able to Delete HTML Learning object," +HTMLSteps.getResult());

	}
}
