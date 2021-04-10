package com.origin.fractal.testauto.steps;

import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBaseStep;
import com.origin.fractal.testauto.pages.LeaderBoardPointPage;

/*
 * File/Class name: LeaderBoardPointSteps.java
 * Purpose: Checking the FR1-3599 - User leader board points & FR1-3786 Learner board - Step level code 
 * Created by: Vignesh 
 * Created on: 4-Jan-2021
 * Updated on 20-Feb-21
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

	/*Added on 15-Feb-21 and Updated on 16-Feb-21
	 * Function Name: CheckDurationFilter
	 * Purpose: verify User is able to check the overall, Weekly and monthly point
	 */
	public void  checkDurationFilter() {
		try {result="FAILED";
		if(page.checkDurationFilter()==true)
			result="PASSED";
		}catch(Exception e) {
			result="FAILED";
		}
	}

	/* Function Name: CheckDurationFilter
	 * Purpose: verify User is able to check the overall, Weekly and monthly point
	 */
	public void verifyArrow() {
		try {result="FAILED";
		if(page.verifyArrow()==true)
			result="PASSED";
		}catch(Exception e) {
			result="FAILED";
		}
	}

	/* Function Name: verifyCertiPopUp
	 * Purpose: verify certification in popup
	 */
	public void verifyCertiPopUp() {
		try {result="FAILED";
		if(page.verifyCertiPopUp()==true)
			result="PASSED";
		}catch(Exception e) {
			result="FAILED";
		}
	}

	/* Function Name: verifyCertiDetails
	 * Purpose: verify certification Details
	 */
	public void verifyCertiDetails() {
		try {result="FAILED";
		if(page.verifyCertiDetails()==true)
			result="PASSED";
		}catch(Exception e) {
			result="FAILED";
		}
	}

	/* Function Name: verifyProfileCTA
	 * Purpose: verify profile CTA Link
	 */
	public void verifyProfileCTA() {
		try {result="FAILED";
		page.verifyProfileCTA();
			result="PASSED";
		}catch(Exception e) {
			result="FAILED";
		}	}

	// Added on 18-Feb-2021 and updated on 20-Feb-2021
	/* Function Name: verifyLearnerBoard
	 * Purpose:check the Leanerboard point in dashboard page
	 */
	public void verifyLearnerBoard() {
		try {result="FAILED";
		page.verifyLearnerBoard();
		result="PASSED";
		}catch(Exception e) {
			result="FAILED";
		}	}

	/* Function Name: verifyUserLearnerPoint
	 * Purpose: verify User current score (new)
	 */
	public void verifyUserLearnerPoint() {
		try {result="FAILED";
		if(page.verifyUserLearnerPoint()==true)
			result="PASSED";
		}catch(Exception e) {
			result="FAILED";
		}	
	}

	/* Function Name: verifyUserLearnerBoard
	 * Purpose: verify User current score (new)
	 */
	public void verifyUserLearnerBoard() {
		try {result="FAILED";
		page.verifyUserLearnerBoard();
		result="PASSED";
		}catch(Exception e) {
			result="FAILED";
		}	
	}

	/* Function Name: verifyLearnerBoardShare
	 * Purpose: verify Learner Board Share social media
	 */
	public void verifyLearnerBoardShare() {
		try {result="FAILED";
		if(page.verifyLearnerBoardShare()==true)
			result="PASSED";
		}catch(Exception e) {
			result="FAILED";
		}	
	}

	/* Function Name: verifyNumberofUsdersListed
	 * Purpose: verify Number of Usders Listed
	 */
	public void verifyNumberofUsdersListed() {
		try {result="FAILED";
		if(page.verifyNumberofUsdersListed()==true)
			result="PASSED";
		}catch(Exception e) {
			result="FAILED";
		}	
	}
	//Ends
}