package com.origin.fractal.testauto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBasePage;

/*
 * File/Class name: LeaderBoardPointPage.java
 * Purpose: Checking the User leader board points
 * Created by: Vignesh 
 * Created on: 4-Jan-2021
 * Updated on 19-Jan-21
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
	private String exceptedURL="https://qadev.originfractal.com/leaderboard";
	private By homeLogo=By.xpath("//*[@class='log_logo']//a");
	private String userName= "Automation Directuser";
	private int scoredPoint, newScoredPoint;
	public LeaderBoardPointPage(WebDriver driver) {
		super(driver);
	}

	/* Function Name: verifyLeaderBoard();
	 * Purpose:check the leaderboard point
	 */
	public void verifyLeaderBoard() {
		wait(5);
		elementExist(leaderBoard);
		elementExist(txtYourLeaderBoard);
		elementExist(txtRankLeaderBoard);
		elementExist(txtPointLeaderBoard);
		click(leaderBoard);
	}

	/* Function Name: verifyLeaderBoardPage();
	 * Purpose:check the leaderboard page
	 */
	public void verifyLeaderBoardPage() {
		wait(3);
		compareStrings(exceptedURL,driver.getCurrentUrl());
		elementExist(searchLeader);
		elementExist(scoreElement);
	}

	/* Function Name: verifySearchLeader();
	 * Purpose:check the search leader
	 */
	public void verifySearchLeader() {
		enterData("Auto",searchLeader);
		wait(3);
		elementExist(leaderList);
	}

	/* Function Name: verifyLeaderPopUp();
	 * Purpose:check the leader Popup
	 */
	public void verifyLeaderPopUp() {
		click(leaderList);
		wait(3);
		elementExist(popup);
		wait(2);
		click(btnPopUpClose);
		wait(2);
	}

	/* Function Name: verifyUserNameInList();
	 * Purpose: verify User Name In List and get the current score
	 */
	public void verifyUserNameInList() {
		for(int path=1; path<=10; path++) {
			if(getText(By.xpath("//*[@class='font_lbpoints_flex1 lbpoints point_row ']["+path+"]/div/div[2]/div")).equalsIgnoreCase(userName)) {
				scoredPoint=Integer.valueOf(driver.findElement(By.xpath("//*[@class='font_lbpoints_flex1 lbpoints point_row ']["+path+"]/div/div[3]/span")).getText());
				print("Current user score is = "+ scoredPoint);
				return;
			}
		}
	}
	/* Function Name: verifyUserPointInList();
	 * Purpose: verify User Name In List and get the current score (new)
	 */
	public boolean verifyUserPointInList() {
		wait(3);
		moveElementFocusandClick(homeLogo);
		wait(10);
		moveElementFocusandClick(leaderBoard);
		wait(5);
		for(int path=1; path<=10; path++) {
			if(getText(By.xpath("//*[@class='font_lbpoints_flex1 lbpoints point_row ']["+path+"]/div/div[2]/div")).equalsIgnoreCase(userName)) {
				newScoredPoint=Integer.valueOf(driver.findElement(By.xpath("//*[@class='font_lbpoints_flex1 lbpoints point_row ']["+path+"]/div/div[3]/span")).getText());
				print("Current user score is = "+ newScoredPoint);
				if(newScoredPoint>scoredPoint) {
					return true;
				}
			}
		}
		return false;
	}
}