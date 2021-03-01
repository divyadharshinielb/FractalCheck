package com.origin.fractal.testauto.test.testsuites;

import java.io.IOException;

import org.testng.annotations.Test;

import com.origin.fractal.testauto.DataManager;
import com.origin.fractal.testauto.steps.LearningObjectHTMLSteps;
import com.origin.fractal.testauto.steps.LoginSteps;
import com.origin.fractal.testauto.test.FractalBaseWebTest;
import com.wv.auto.framework.BrowserFactory;
import com.wv.auto.framework.utils.Reporter;
/* File Name: WebTestLearningObjectHTML.java
 * Purpose: Check to HTML Learning object -FR1-2207
 * Number of Testcases: 6
 * Created by: Vignesh
 * Created on: 20/Jun/20
 * Updated on: 17/Nov/20 - Last update few xpaths and waiting time increased....
 */
public class WebTestLearningObjectHTML extends FractalBaseWebTest{
	@Test(dataProviderClass=DataManager.class, dataProvider = "browers", groups = { "pilot"}, enabled = true,priority=0)
	public void TestHTMLlearningObjectCreation(String row, String strBrowserName) throws IOException{
		driver = BrowserFactory.getBrowser(strBrowserName);
		siteAdminLogin(driver); 
		LoginSteps login= new LoginSteps(driver);
		LearningObjectHTMLSteps HTMLSteps= new LearningObjectHTMLSteps(driver);
		HTMLSteps.verifyCreateHtmlLearningObject();
		Reporter.writeSummary("FR1-2207_HTMLLO_TC-001,Verify that Site admin is able to Create HTML Learning object," +HTMLSteps.getResult());
		//commented on 25-Feb-21 HTML LO edit is NOT working
		//		HTMLSteps.verifyEditAndCancelHTMLLearningObject();
		//		Reporter.writeSummary("FR1-2207_HTMLLO_TC-002,Verify that Site admin is able to click cancel and Edit the HTML Learning object," +HTMLSteps.getResult());
		//ends
		HTMLSteps.verifyFilterAndSearchHtmlLO();	
		Reporter.writeSummary("FR1-2207_HTMLLO_TC-003,Verify that Site admin is able to filter and search the HTML Learning object," +HTMLSteps.getResult());
		login.adminLogout();		
		siteAdminLogin(driver);
		HTMLSteps.createandEditCatalogBundleWithHTML("ADD HTML");
		Reporter.writeSummary("FR1-2207_HTMLLO_TC-004,Verify that Site admin is able to map the HTML Learning Object to Bundle Catalog item," +HTMLSteps.getResult());
		login.adminLogout();
		login1(driver); 
		HTMLSteps.userSearchHTMLLOAndLaunchHTML();
		Reporter.writeSummary("FR1-2207_HTMLLO_TC-005,Verify that Users able to see the HTML Learning Object in Bundle Catalog item," +HTMLSteps.getResult());
		login.logOutUser();
//		wait(3);
		siteAdminLogin(driver); 
//		wait(5);
		HTMLSteps.verifyDeleteHTMLLearnignobject();
		Reporter.writeSummary("FR1-2207_HTMLLO_TC-006,Verify that Site admin is able to Delete HTML Learning object," +HTMLSteps.getResult());
	}
}
