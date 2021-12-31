package com.origin.fractal.testauto.test.testsuites;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.origin.fractal.testauto.steps.HomeSteps;
import com.origin.fractal.testauto.steps.ResumeLearningSteps;
import com.origin.fractal.testauto.test.FractalBaseWebTest;
import com.wv.auto.framework.BrowserFactory;
import com.wv.auto.framework.utils.Reporter;

/* File Name: WebTestResumeLearning.java
 * Purpose: resume learning re-direction with INPROGRESS and COMPLETED-5246
 * Number of Testcases: 3
 * Created by: Mahesh
 * Created on: 15-11-2021
 */

public class WebTestResumeLearning extends FractalBaseWebTest {


	@DataProvider
	public Object[][] browers() {
		return new Object[][] {
		new Object[] { "1", "chrome" }
//		 ,new Object[] { "2", "firefox" },
//		 new Object[] { "3", "msedge" } ,
//		 new Object[] { "4", "ie11" }
		};
	}
	
	@Test(dataProvider = "browers", groups = { "pilot", "Home" }, enabled = true,
			// description="Verify categories are available as expected" )
			description = "")
	public void testResumeLearning(String row, String strBrowserName) throws InterruptedException {
		driver = BrowserFactory.getBrowser(strBrowserName);
		login(driver);

		HomeSteps homeSteps = new HomeSteps(driver);
		ResumeLearningSteps resumeLearningSteps=new ResumeLearningSteps(driver);
		homeSteps.verifyResumeLearningText();//newui
		resumeLearningSteps.CompareResumeCatalogText();
		Reporter.writeSummary("FR1-5246_UserPage_TC-001,Verify the resume learning re-direction with INPROGRESS and COMPLETED state, " +  resumeLearningSteps.getResult() );
		resumeLearningSteps.verifyResumeCatalogLabel();
		Reporter.writeSummary("FR1-5246_UserPage_TC-001,Verify the resume learning re-direction to Catalog label page, " +  resumeLearningSteps.getResult() );
		resumeLearningSteps.verifyResumeCount();
		Reporter.writeSummary("FR1-5246_UserPage_TC-001,Verify the resume learning resource count , " +  resumeLearningSteps.getResult() );
	}
}
