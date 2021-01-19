package com.origin.fractal.testauto.steps;

import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBaseStep;
import com.origin.fractal.testauto.pages.LeaderBoardPointPage;

/*
 * File/Class name: LeaderBoardPointSteps.java
 * Purpose: Checking the User leader board points - Step level code 
 * Created by: Vignesh 
 * Created on: 4-Jan-2021
 * Updated on 7-Jan-21
 */
public class LeaderBoardPointSteps extends FractalBaseStep {
	LeaderBoardPointPage page=null;
	public LeaderBoardPointSteps(WebDriver driver) {
		page=new LeaderBoardPointPage(driver);
	}

	/* Function Name: verifyLeaderBoard();
	 * Purpose:check the leaderboard point
	 */
	public void verifyLeaderBoard() {
		try {result="FAILED";
		page.verifyLeaderBoard();
		result="PASSED";
		}catch(Exception e) {
			result="FAILED";
		}
	}

	/* Function Name: verifyLeaderBoardPage();
	 * Purpose:check the leaderboard point
	 */
	public void verifyLeaderBoardPage() {
		try {result="FAILED";
		page.verifyLeaderBoardPage();
		result="PASSED";
		}catch(Exception e) {
			result="FAILED";
		}
	}

	/* Function Name: verifySearchLeader();
	 * Purpose:check the search leader
	 */
	public void verifySearchLeader() {
		try {result="FAILED";
		page.verifySearchLeader();
		result="PASSED";
		}catch(Exception e) {
			result="FAILED";
		}
	}

	/* Function Name: verifyLeaderPopUp();
	 * Purpose:check the leader Popup
	 */
	public void verifyLeaderPopUp() {
		try {result="FAILED";
		page.verifyLeaderPopUp();
		result="PASSED";
		}catch(Exception e) {
			result="FAILED";
		}
	}

	/* Function Name: verifyUserNameInList();
	 * Purpose: verify User Name In List and get the current score
	 */
	public void verifyUserNameInList() {
		try {result="FAILED";
		page.verifyUserNameInList();
		result="PASSED";
		}catch(Exception e) {
			result="FAILED";
		}
	}

	/* Function Name: verifyUserPointInList();
	 * Purpose: verify User Name In List and get the current score (new)
	 */
	public void verifyUserPointInList() {
		try {result="FAILED";
		page.verifyUserPointInList();
		result="PASSED";
		}catch(Exception e) {
			result="FAILED";
		}
	}
}

