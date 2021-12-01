package com.origin.fractal.testauto.test.testsuites;

import java.io.IOException;

import org.testng.annotations.Test;

import com.origin.fractal.testauto.DataManager;
import com.origin.fractal.testauto.steps.ForumIntegrationSteps;
import com.origin.fractal.testauto.test.FractalBaseWebTest;
import com.wv.auto.framework.BrowserFactory;
import com.wv.auto.framework.utils.Reporter;
/* File Name: WebTestForumIntegration.java
 * Purpose: FR1-5148- Forum Task - Discussion Report and delete
 * Number of Testcases: 3
 * Created by: DivyaDharshini R
 * Created on: 25-12-2021
  */
public class WebTestForumIntegration extends FractalBaseWebTest {

	@Test(dataProviderClass=DataManager.class, dataProvider = "browers", groups = { "Phase1.0" }, enabled = true, description = "Login Page")
	public void forumReport(String row, String strBrowserName) throws IOException {
		driver = BrowserFactory.getBrowser(strBrowserName);
		login(driver);
		wait(2);
		ForumIntegrationSteps forumStep = new ForumIntegrationSteps(driver);
		forumStep.user1AddDiscussion();
		Reporter.writeSummary("FR1-5148_TCID_forum_04,Verify the discussion created by a user1  , " +  forumStep.getResult() );
		forumStep.user2ReportDiscussion();
		Reporter.writeSummary("FR1-5148_TCID_forum_04,Verify the discussion created by user1 is reported by user2  , " +  forumStep.getResult() );
		loginToContentAdmin(driver);
		forumStep.deleteCommentsAdmin();
		Reporter.writeSummary("FR1-5148_TCID_forum_04,Verify the discussion is deleted by the admin  , " +  forumStep.getResult() );
	}
}