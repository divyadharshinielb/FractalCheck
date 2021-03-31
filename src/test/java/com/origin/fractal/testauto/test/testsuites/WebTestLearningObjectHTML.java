package com.origin.fractal.testauto.test.testsuites;

import java.io.IOException;

import org.testng.annotations.Test;

import com.origin.fractal.testauto.DataManager;
import com.origin.fractal.testauto.steps.LeaderBoardPointSteps;
import com.origin.fractal.testauto.steps.LearningObjectHTMLSteps;
import com.origin.fractal.testauto.steps.LoginSteps;
import com.origin.fractal.testauto.test.FractalBaseWebTest;
import com.wv.auto.framework.BrowserFactory;
import com.wv.auto.framework.utils.Reporter;
/* File Name: WebTestLearningObjectHTML.java
 * Purpose: Check to HTML Learning object -FR1-2207 & FR1-3599 Checking the User leader board points & FR1-3786 Learner board 
 * Number of Testcases: 22
 * Created by: Vignesh
 * Created on: 20/Jun/20
 * Updated on: 22-Feb-21 
 */
public class WebTestLearningObjectHTML extends FractalBaseWebTest{
	@Test(dataProviderClass=DataManager.class, dataProvider = "browers", groups = { "pilot"}, enabled = true,priority=0)
	public void TestHTMLlearningObjectCreation(String row, String strBrowserName) throws IOException{
		driver = BrowserFactory.getBrowser(strBrowserName);
		siteAdminLoginwithcookies(driver); 
		LoginSteps login = new LoginSteps(driver);
		LearningObjectHTMLSteps HTMLSteps= new LearningObjectHTMLSteps(driver);
		HTMLSteps.verifyCreateHtmlLearningObject();
		Reporter.writeSummary("FR1-2207_HTMLLO_TC-001,Verify the Site admin is able to Create HTML Learning object," +HTMLSteps.getResult());
		HTMLSteps.verifyEditAndCancelHTMLLearningObject();
		Reporter.writeSummary("FR1-2207_HTMLLO_TC-002,Verify the Site admin is able to click cancel and Edit the HTML Learning object," +HTMLSteps.getResult());
		HTMLSteps.verifyFilterAndSearchHtmlLO();	
		Reporter.writeSummary("FR1-2207_HTMLLO_TC-003,Verify the Site admin is able to filter and search the HTML Learning object," +HTMLSteps.getResult());
		HTMLSteps.createandEditCatalogBundleWithHTML("ADD HTML");
		Reporter.writeSummary("FR1-2207_HTMLLO_TC-004,Verify the Site admin is able to map the HTML Learning Object to Bundle Catalog item," +HTMLSteps.getResult());
		login.adminLogout();
		login1(driver);
		LeaderBoardPointSteps Steps= new LeaderBoardPointSteps(driver);
		Steps.verifyLearnerBoard();
		Reporter.writeSummary("FR1-3786_LearnerBoard_TC-001,Verify the Learnerboard points is present on the user dashboard page," +Steps.getResult());
		Steps.verifyLeaderBoard();
		Reporter.writeSummary("FR1-3599_LeaderBoard_TC-001,Verify the Leaderboard points is present on the user dashboard page," +Steps.getResult());
		Steps.verifyUserLearnerBoard();
		Reporter.writeSummary("FR1-3786_LearnerBoard_TC-002,Verify the user is able to see the Learnerboard details," +Steps.getResult());
		Steps.verifyLeaderBoardPage();
		Reporter.writeSummary("FR1-3599_LeaderBoard_TC-002,Verify the Leaderboard points is clickable and landing on the Leaderboard page," +Steps.getResult());
		Steps.verifyUserNameInList();
		Reporter.writeSummary("FR1-3599_LeaderBoard_TC-003,Verify the Current user is listed in the leaderboard with points," +Steps.getResult());
		Steps.checkDurationFilter();
		Reporter.writeSummary("FR1-3599_LeaderBoard (phase-2)_TC-001,Verify the user is able to filter the user list (overall/ Week wise/ Month wise)," +Steps.getResult());
		Steps.verifyArrow();
		Reporter.writeSummary("FR1-3599_LeaderBoard (phase-2)_TC-002,Verify the user is able to see the green (upward) and red (downward) arrows," +Steps.getResult());
		Steps.verifySearchLeader();
		Reporter.writeSummary("FR1-3599_LeaderBoard_TC-004,Verify the user is able to search the name under leaderboard page," +Steps.getResult());
		Steps.verifyLeaderPopUp();
		Reporter.writeSummary("FR1-3599_LeaderBoard_TC-005,Verify the pop-up is showing when the user is clicking on the list of name," +Steps.getResult());
		Steps.verifyCertiPopUp();
		Reporter.writeSummary("FR1-3599_LeaderBoard (phase-2)_TC-003,Verify the pop-up is showing with the certificate details when the user is clicking on the list of name," +Steps.getResult());
		Steps.verifyCertiDetails();
		Reporter.writeSummary("FR1-3599_LeaderBoard (phase-2)_TC-004,Verify the user is able to see the certification details in leaderboard page," +Steps.getResult());
		Steps.verifyProfileCTA();
		Reporter.writeSummary("FR1-3599_LeaderBoard (phase-2)_TC-005,Verify the URL is navicate to account page when user clicks on profile CTA link," +Steps.getResult());
		HTMLSteps.userSearchHTMLLOAndLaunchHTML();
		Reporter.writeSummary("FR1-2207_HTMLLO_TC-005,Verify the User is able to see the HTML Learning Object in Bundle Catalog item," +HTMLSteps.getResult());
		Steps.verifyUserLearnerPoint();
		Reporter.writeSummary("FR1-3786_LearnerBoard_TC-003,Verify the learnerboard point is updated when the user completes the Learning object," +Steps.getResult());
		Steps.verifyUserPointInList();
		Reporter.writeSummary("FR1-3599_LeaderBoard_TC-006,Verify the leaderboard point is updated when the user completes the Learning object," +Steps.getResult());
		Steps.verifyLearnerBoardShare();
		Reporter.writeSummary("FR1-3786_LearnerBoard_TC-004,Verify the user is able to share the learnerboard details to social media," +Steps.getResult());
		Steps.verifyNumberofUsdersListed();
		Reporter.writeSummary("FR1-3786_LearnerBoard_TC-005,Verify the number of user shown in list and check the view more button action," +Steps.getResult());
		login.logOutUser();
		siteAdminLogin(driver); 
		HTMLSteps.verifyDeleteHTMLLearnignobject();
		Reporter.writeSummary("FR1-2207_HTMLLO_TC-006,Verify the Site admin is able to Delete HTML Learning object," +HTMLSteps.getResult());
	}
}
