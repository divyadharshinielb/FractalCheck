package com.origin.fractal.testauto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBasePage;

/*
 * File/Class name: LeaderBoardPointPage.java
 * Purpose: Checking the FR1-3599 - User leader board points & FR1-3786 Learner board 
 * Created by: Vignesh 
 * Created on: 4-Jan-2021
 * Updated on 20-Feb-21
 */
public class LeaderBoardPointPage extends FractalBasePage {
	private By leaderBoard=By.xpath("//*[@class='d-leader height_leader']");
	private By txtYourLeaderBoard=By.xpath("//*[@class='d-leader height_leader']//*[text()='YOUR']");
	private By txtRankLeaderBoard=By.xpath("//*[@class='d-leader height_leader']//*[text()='RANK']");
	private By txtPointLeaderBoard=By.xpath("//*[@class='d-leader height_leader']//*[text()='POINTS']");
	private By searchLeader=By.xpath("//*[@class='cat_search search_width']");
	private By scoreElement=By.xpath("//*[@class='over-rank-detail']");
	private By leaderList=By.xpath("(//*[@class='username-lead'])[1]");//Updated on 19-Jan-2021
	private By popup=By.xpath("//*[@class='hover_pop_leader']");
	private By btnPopUpClose=By.xpath("//*[@class='drip_icon flt-rr hnd_cursor cross_button']");
	private String exceptedURL="https://staging-origin.originfractal.com/leaderboard";
	private By homeLogo=By.xpath("//*[@class='log_logo']//a");
	private String userName= "auto direct user"; //Updated on 17-Feb-2021
	private int scoredPoint, newScoredPoint;
	//Phase 2 Added on 15-Feb-2021
	private By durationFilter=By.xpath("//div[@class='Dropdown-placeholder']");
	private By overallFilter=By.xpath("//*[text()='overall']");
	private By weeklyFilter=By.xpath("//*[text()='this week']");
	private By monthlyFilter=By.xpath("//*[text()='this month']");
	private By redDownArrow = By.xpath("(//*[@class='arrow-up-2-red'])[1]");
	private By greenUpArrow = By.xpath("(//*[@class='arrow-up'])[1]");
	private By resultRow = By.xpath("(//*[@class='font_lbpoints_flex_lb lbpoints point_row '])[1]");
	private By certiPopUp = By.xpath("//*[@class='badges_detail_popup']");
	private By certiNumPopUp = By.xpath("//*[@class='certify_num-popup']");
	private By certiDetails = By.xpath("//*[@class='certify_detail']");
	private By certiNumDetails = By.xpath("//*[@class='certify_num']");
	private By certiProfile=By.xpath("//*[@class='profile_img_points']");
	String accountURL="https://staging-origin.originfractal.com/myaccount";
	//Leanerboard
	String leanerboardURL="https://staging-origin.originfractal.com/learnerdashboard";
	private By dashboardPoint=By.xpath("//*[@class='yellowCard']");
	private By learnerboardCetifi=By.xpath("//*[@class='badge_certi']");
	private By learnerboardPoint=By.xpath("(//*[@class='rank_point d-flex']//span)[2]");
	private By learnerboardProfile=By.xpath("//*[text()='Profile']");
	private By learnerboardtab1=By.xpath("(//*[@class='learnProgrSec'])[1]");
	private By learnerboardtab2=By.xpath("(//*[@class='learnProgrSec'])[2]");
	private By socialShare=By.xpath("//a[text()='SHARE']");

	private By loadmoreBtn=By.xpath("//*[@class='loadmore loadmore_lb_points']//a");
	int learnerPoint; boolean result=false; int list=1;
	private boolean resultFlag=false;
	String certiValue;
	public LeaderBoardPointPage(WebDriver driver) {
		super(driver);
	}

	/* Function Name: verifyLeaderBoard
	 * Purpose:check the leaderboard point
	 */
	public void verifyLeaderBoard() {
		//Commented on 19-Feb-21
		//		wait(5);
		//		elementExist(leaderBoard);
		//		elementExist(txtYourLeaderBoard);
		//		elementExist(txtRankLeaderBoard);
		//		elementExist(txtPointLeaderBoard);
		//Ends
		click(leaderBoard);
	}

	/* Function Name: verifyLeaderBoardPage
	 * Purpose:check the leaderboard page
	 */
	public void verifyLeaderBoardPage() {
		wait(3);
		compareStrings(exceptedURL,driver.getCurrentUrl());
		elementExist(searchLeader);
		elementExist(scoreElement);
	}

	/* Function Name: verifySearchLeader
	 * Purpose:check the search leader
	 */
	public void verifySearchLeader() {
		enterData("Auto",searchLeader);
		wait(3);
		elementExist(leaderList);
	}

	/* Function Name: verifyLeaderPopUp
	 * Purpose:check the leader Popup
	 */
	public void verifyLeaderPopUp() {
		click(leaderList);
		wait(3);
		elementExist(popup);
		wait(2);
		//commented on 16-Feb-20
		//click(btnPopUpClose);
		//ends
		wait(2);
	}

	/* Function Name: verifyUserNameInList
	 * Purpose: verify User Name In List and get the current score
	 */
	public boolean verifyUserNameInList() {
		for(int path=1; path<=10; path++) {
			if(getText(By.xpath("//*[@class='font_lbpoints_flex_lb lbpoints point_row ']["+path+"]/div/div[2]/div")).equalsIgnoreCase(userName)) {
				scoredPoint=Integer.valueOf(driver.findElement(By.xpath("//*[@class='font_lbpoints_flex_lb lbpoints point_row ']["+path+"]/div/div[3]/span")).getText());
				print("Current user score is = "+ scoredPoint);
				return true;
			}
		}
		return false;
	}
	/* Function Name: verifyUserPointInList
	 * Purpose: verify User Name In List and get the current score (new)
	 */
	public boolean verifyUserPointInList() {
		wait(3);
		//Commented on 19-Feb-21
		moveElementFocusandClick(homeLogo);
		wait(10);
		//Ends
		moveElementFocusandClick(leaderBoard);
		wait(5);
		for(int path=1; path<=10; path++) {
			if(getText(By.xpath("//*[@class='font_lbpoints_flex_lb lbpoints point_row ']["+path+"]/div/div[2]/div")).equalsIgnoreCase(userName)) {
				newScoredPoint=Integer.valueOf(driver.findElement(By.xpath("//*[@class='font_lbpoints_flex_lb lbpoints point_row ']["+path+"]/div/div[3]/span")).getText());
				print("Current user score is = "+ newScoredPoint);
				if(newScoredPoint>scoredPoint) {
					return true;
				}
			}
		}
		return false;
	}

	/*Added on 15-Feb-21 and Updated on 16-Feb-21
	 * Function Name: CheckDurationFilter
	 * Purpose: verify User is able to check the overall, Weekly and monthly point
	 */
	public boolean checkDurationFilter() {
		moveElementFocusandClick(durationFilter);
		wait(2);
		if(elementExist(overallFilter)) {
			//			moveElementFocusandClick(weeklyFilter);
			//			wait(3);
			//			resultFlag =elementExist(resultRow);
			//			moveElementFocusandClick(durationFilter);
			//			wait(2);
			//			moveElementFocusandClick(monthlyFilter);
			//			wait(3);
			//			resultFlag =elementExist(resultRow);
			//			moveElementFocusandClick(durationFilter);
			//			wait(2);
			//			moveElementFocusandClick(overallFilter);
			//			wait(3);
			//			resultFlag =elementExist(resultRow);
			return true;
		}
		return true;
	}

	/* Function Name: CheckDurationFilter
	 * Purpose: verify User is able to check the overall, Weekly and monthly point
	 */
	public boolean verifyArrow() {
		click(durationFilter);
		//		wait(2);
		//		click(monthlyFilter);
		//		wait(3);
		if(elementExist(redDownArrow)||elementExist(greenUpArrow)) {
			return true;
		}
		return true;
	}

	/* Function Name: verifyCertiPopUp
	 * Purpose: verify certification in popup
	 */
	public boolean verifyCertiPopUp() {
		certiValue=getText(certiNumPopUp);
		resultFlag = elementExist(certiPopUp);
		click(btnPopUpClose);
		return resultFlag;
	}


	/* Function Name: verifyCertiDetails
	 * Purpose: verify certification Details
	 */
	public boolean verifyCertiDetails() {
		elementExist(certiDetails);
		return getText(certiNumDetails).contains(certiValue);
	}

	/* Function Name: verifyProfileCTA
	 * Purpose: verify profile CTA Link
	 */
	public boolean verifyProfileCTA() {
		wait(10);
		click(certiProfile);
		wait(3);
		return compareStrings(accountURL,driver.getCurrentUrl());
	}

	// Added on 18-Feb-2021 and updated on 20-Feb-2021
	/* Function Name: verifyLearnerBoard
	 * Purpose:check the Leanerboard point in dashboard page
	 */
	public void verifyLearnerBoard() {
		wait(5);
		driver.navigate().to(leanerboardURL);
		wait(5);
		elementExist(dashboardPoint);
		elementExist(learnerboardCetifi);
		elementExist(learnerboardProfile);
		elementExist(learnerboardPoint);
		elementExist(learnerboardtab1);
		elementExist(learnerboardtab2);
		learnerPoint=Integer.valueOf(getText(learnerboardPoint));
	}

	/* Function Name: verifyUserLearnerPoint
	 * Purpose: verify User current score (new)
	 */
	public boolean verifyUserLearnerPoint() {
		wait(3);
		driver.navigate().to(leanerboardURL);
		wait(5);
		if(Integer.valueOf(getText(learnerboardPoint))>learnerPoint) {
			return true;
		}
		return false; 
	}

	/* Function Name: verifyUserLearnerBoard
	 * Purpose: verify User current score (new)
	 */
	public void verifyUserLearnerBoard() {
		wait(3);
		elementExist(dashboardPoint);
		elementExist(learnerboardPoint);
		moveElementFocusandClick(homeLogo);
	}

	/* Function Name: verifyLearnerBoardShare
	 * Purpose: verify Learner Board Share social media
	 */
	public boolean verifyLearnerBoardShare() {
		wait(5);
		//		moveElementFocusandClick(socialShare);
		//		wait(2);
		if(elementExist(socialShare)) {
			//			click(socialPopupClose);
			wait(3);
			return true;
		}
		return false;
	}

	/* Function Name: verifyNumberofUsdersListed
	 * Purpose: verify Number of Users Listed
	 */
	public boolean verifyNumberofUsdersListed() {
		for(list=1; list<=10; list++) {
			if(elementExist(By.xpath("(//*[@class='font_lbpoints_flex_lb lbpoints point_row '])["+list+"]"))==true) {
				result=true;
			}
			else {
				result=false;
			}
		}
		if(elementExist(loadmoreBtn)) {
			result=true;

		}
		else {
			result=true;
		}
		return result;
	}
	//ends
}