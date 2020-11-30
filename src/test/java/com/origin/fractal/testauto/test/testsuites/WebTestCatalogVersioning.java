package com.origin.fractal.testauto.test.testsuites;

import java.io.IOException;

import org.testng.annotations.Test;

import com.origin.fractal.testauto.DataManager;
import com.origin.fractal.testauto.steps.CatalogVersioningSteps;
import com.origin.fractal.testauto.steps.LoginSteps;
import com.origin.fractal.testauto.test.FractalBaseWebTest;
import com.wv.auto.framework.BrowserFactory;
import com.wv.auto.framework.utils.Reporter;
/* File Name: WebTestCatalogVersioning.java
 * Purpose: Check FR1-2772 Learning Object version
 * Number of Testcases: 6
 * Created by: Vignesh
 * Created on: 28-Aug-2020
 * Updated Date: 30-Nov-20
 */
public class WebTestCatalogVersioning extends FractalBaseWebTest{
	@Test(dataProviderClass=DataManager.class, dataProvider = "browers", groups = { "pilot"}, enabled = true,priority=1)
	public void TestCatalogVersioning(String row, String strBrowserName) throws IOException{
		driver = BrowserFactory.getBrowser(strBrowserName);
		siteAdminLoginwithcookies(driver); 
		LoginSteps login= new LoginSteps(driver);
		CatalogVersioningSteps steps = new CatalogVersioningSteps(driver);
		steps.createLearningObject();
		steps.createVersioningLearningObject();
		Reporter.writeSummary("FR1-2772_LearnObjVersion_TC-001,Verify the learning object creation and add new version," +steps.getResult());
		login.adminLogout();
		siteAdminLogin(driver); 
		steps.editCatalogToIncludeLearningObject("ADD","Ver");
		Reporter.writeSummary("FR1-2772_LearnObjVersion_TC-002,Verify the admin is able to map the Learning object to Independent option Catalog item," +steps.getResult());
		Reporter.writeSummary("FR1-2772_LearnObjVersion_TC-003,Verify the admin is able to map the Learning object to part of Catalog item," +steps.getResult());
		steps.verifyAssignedCatalogDetails(); 
		Reporter.writeSummary("FR1-2772_LearnObjVersion_TC-004,Verify the alert Pop-up while edit Mapped Learning Object," +steps.getResult());
		steps.deleteVersionLearningObject("","Ver1");
		Reporter.writeSummary("FR1-2772_LearnObjVersion_TC-005,Verify the admin is able to delete the Learning object (Ver1)," +steps.getResult());
		steps.deleteLearningObject("","Ver2");
		Reporter.writeSummary("FR1-2772_LearnObjVersion_TC-006,Verify the admin is able to delete the Learning object (Ver2)," +steps.getResult());
	}
}
