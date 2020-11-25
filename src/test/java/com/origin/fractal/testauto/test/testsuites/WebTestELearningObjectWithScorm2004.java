package com.origin.fractal.testauto.test.testsuites;

import java.io.IOException;

import org.testng.annotations.Test;

import com.origin.fractal.testauto.DataManager;
import com.origin.fractal.testauto.steps.ELearningObjectWithScorm2004Steps;
import com.origin.fractal.testauto.steps.LoginSteps;
import com.origin.fractal.testauto.test.FractalBaseWebTest;
import com.wv.auto.framework.BrowserFactory;
import com.wv.auto.framework.utils.Reporter;
/* File Name: WebTestELearningObjectWithScorm2004.java
 * Purpose: Check to eLearning object with scorm -FR1-2364
 * Number of Testcases: 7
 * Created by: Vignesh
 * Created on: 31/Jun/20
 * Updated on: 21/Aug/20
 */
public class WebTestELearningObjectWithScorm2004 extends FractalBaseWebTest{
	@Test(dataProviderClass=DataManager.class, dataProvider = "browers", groups = { "pilot"}, enabled = true,priority=1)
	public void Testscorme2004(String row, String strBrowserName) throws IOException {
		driver = BrowserFactory.getBrowser(strBrowserName);
		siteAdminLogin(driver);
		LoginSteps login= new LoginSteps(driver);
		ELearningObjectWithScorm2004Steps scorm2004= new ELearningObjectWithScorm2004Steps(driver);
		scorm2004.verifyCreateELearningObjectWithscorm2004();
		Reporter.writeSummary("FR1-2364_eLearnScorm2004_TC-001,Verify that Site admin is able to Create an eLearning object with Scorm 2004," +scorm2004.getResult());
		scorm2004.verifyEditAndCancelELearningObjectWithscorm2004();
		Reporter.writeSummary("FR1-2364_eLearnScorm2004_TC-002,Verify that Site admin is able to click Cancel and Edit the eLearning object with Scorm 2004," +scorm2004.getResult());
		scorm2004.verifyPreviewscorm2004();
		Reporter.writeSummary("FR1-2364_eLearnScorm2004_TC-003,Verify that Site admin is able to Preview the eLearning object with Scorm 2004," +scorm2004.getResult());
		scorm2004.verifyInvalidscorm2004();
		Reporter.writeSummary("FR1-2364_eLearnScorm2004_TC-004,Verify that Site admin is Not able to Upload the invalid Scorm file," +scorm2004.getResult());
		login.adminLogout();		
		siteAdminLogin(driver);
		scorm2004.createandEditCatalogBundleWitheLearningWithscorm2004("Add scorm2004");
		Reporter.writeSummary("FR1-2364_eLearnScorm2004_TC-005,Verify that Site admin is able to map the eLearning Object with Scorm 2004 to Bundle Catalog item," +scorm2004.getResult());
		login.adminLogout();
		login1(driver);
		scorm2004.userSearchElearningobjectWithscorm2004AndLaunch();
		Reporter.writeSummary("FR1-2364_eLearnScorm2004_TC-006,Verify that User is able to see the Scorm 2004 eLearning Object in Bundle Catalog item," +scorm2004.getResult());
		login.logOutUser();
		siteAdminLogin(driver); 
		scorm2004.verifyDeleteELearnignobjectWithscorm2004();
		Reporter.writeSummary("FR1-2364_eLearnScorm2004_TC-007,Verify that Site admin is able Delete an eLearning object with Scorm 2004," +scorm2004.getResult());

	}
}