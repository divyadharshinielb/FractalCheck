package com.origin.fractal.testauto.test.testsuites;

import java.io.IOException;

import org.testng.annotations.Test;

import com.origin.fractal.testauto.DataManager;
import com.origin.fractal.testauto.steps.ElearningOrientationSteps;
import com.origin.fractal.testauto.test.FractalBaseWebTest;
import com.wv.auto.framework.BrowserFactory;
import com.wv.auto.framework.utils.Reporter;

/* File Name:  WebTestELearningOrientation.java
 * Description: FR1-2539  - Add Orientation field to E-Learning Learning Object & Orientation field with LANDSCAPE, PORTRAIT, AUTO
 * Number of Test cases covered: 4
 * Developed By: Vigneshwaran R
 * Updated Date: 10-July-20
 * */
public class WebTestELearningOrientation extends FractalBaseWebTest{
	@Test(dataProviderClass=DataManager.class, dataProvider = "browers", groups = { "pilot"}, enabled = true,priority=1)
	public void TestELearningOrientation(String row, String strBrowserName) throws IOException {
		driver = BrowserFactory.getBrowser(strBrowserName);
		siteAdminLoginwithcookies(driver); 	
		ElearningOrientationSteps eLearningOrientation= new ElearningOrientationSteps(driver);
		eLearningOrientation.verifyELearningOrientation();
		Reporter.writeSummary("FR1-2539_eLearnOrient_TC-001, Verify the admin able to see orientation Modes Auto/Landscape/Portrait in elearning," +  eLearningOrientation.getResult()); 
		eLearningOrientation.verifyOrientationSelection();
		Reporter.writeSummary("FR1-2539_eLearnOrient_TC-002, Verify the admin able to select the orientation Auto/Landscape/Portrait in elearning," +  eLearningOrientation.getResult()); 
		// Added on 22-Sep-20
		eLearningOrientation.preRequisite();
		//ends
		eLearningOrientation.verifyScormOrientation();
		Reporter.writeSummary("FR1-2539_eLearnOrient_TC-003, Verify the admin able to select the orientation Auto/Landscape/Portrait and save the elearning with Scrome1.2 package," +  eLearningOrientation.getResult()); 
		eLearningOrientation.verifyXapiOrientation();
		Reporter.writeSummary("FR1-2539_eLearnOrient_TC-004, Verify the admin able to select the orientation Auto/Landscape/Portrait and save the elearning with Xapi package," +  eLearningOrientation.getResult()); 
	}
}
