package com.origin.fractal.testauto.steps;

import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBaseStep;
/* File Name: UserPaginationSteps.java
 * Purpose: Check for pagination in user side -FR1-2498
 * Number of Testcases: 5
 * Created by: DivyaDharshini
 * Created on: 08-Aug-2020

 */
import com.origin.fractal.testauto.pages.ForumIntegrationPage;
/* File Name: ForumIntegrationSteps.java
 * Purpose: FR1-5148- Forum Task - Discussion Report and delete
 * Number of Testcases: 3
 * Created by: DivyaDharshini R
 * Created on: 25-12-2021
  */
public class ForumIntegrationSteps extends FractalBaseStep {

	public ForumIntegrationPage page;
	public ForumIntegrationSteps(WebDriver driver) {
		page = new ForumIntegrationPage(driver);
		fBPage = page;
	}
	
	/*
	 * function: user1AddDiscussion()
	 * covers: It covers navigation of user1AddDiscussion() in ForumIntegrationPage
	 */
	public void user1AddDiscussion() {
		result ="PASSED";
		try {
			page.user1AddDiscussion();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}

	}
	/*
	 * function: user2ReportDiscussion()
	 * covers: It covers navigation of user2ReportDiscussion() in ForumIntegrationPage
	 */
	public void user2ReportDiscussion() {
		result ="PASSED";
		try {
			page.user2ReportDiscussion();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	/*
	 * function: deleteCommentsAdmin()
	 * covers: It covers navigation of deleteCommentsAdmin() in ForumIntegrationPage
	 */
	public void deleteCommentsAdmin() {
		result ="PASSED";
		try {
			page.deleteCommentsAdmin();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}

	public void userLogout() {
		result ="PASSED";
		try {
			page.userLogout();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
}