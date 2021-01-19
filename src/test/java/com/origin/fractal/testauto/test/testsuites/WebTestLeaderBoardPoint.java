package com.origin.fractal.testauto.test.testsuites;

import com.origin.fractal.testauto.steps.LeaderBoardPointSteps;
import com.origin.fractal.testauto.test.FractalBaseWebTest;

import com.wv.auto.framework.utils.Reporter;
/* File Name: WebTestLeaderBoardPoint.java
 * Purpose: Check to FR1-3599 - User LeaderBoard points
 * Number of Testcases: 4
 * Created by: Vignesh
 * Created on: 4/Jan/21
 * Updated on: 5/Jan/21
 */
public class WebTestLeaderBoardPoint extends FractalBaseWebTest{
//	@Test(dataProviderClass=DataManager.class, dataProvider = "browers", groups = { "pilot"}, enabled = true,priority=0)
//	public void TestLeaderBoardPoint(String row, String strBrowserName) throws IOException {
//		driver = BrowserFactory.getBrowser(strBrowserName);
//		login1(driver);
		public void TestLeaderBoardPoint() {
		LeaderBoardPointSteps Steps= new LeaderBoardPointSteps(driver);
		Steps.verifyLeaderBoard();
		Reporter.writeSummary("FR1-3599_LeaderBoard_TC-001,Verify the Leaderboard points is present on the user dashboard page," +Steps.getResult());
		Steps.verifyLeaderBoardPage();
		Reporter.writeSummary("FR1-3599_LeaderBoard_TC-002,Verify the Leaderboard points is clickable and landing on the Leaderboard page," +Steps.getResult());
		Steps.verifySearchLeader();
		Reporter.writeSummary("FR1-3599_LeaderBoard_TC-003,Verify the user is able to search the leader name," +Steps.getResult());
		Steps.verifyLeaderPopUp();
		Reporter.writeSummary("FR1-3599_LeaderBoard_TC-004,Verify the popUp is showing when the user is clicking on the list of name," +Steps.getResult());
	}

}
