package com.origin.fractal.testauto.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import com.origin.fractal.testauto.FractalBasePage;
/* File Name: HelpFractalPage.java
 * Purpose: Check Help Link  - FR1-3780
 * Number of Testcases: 6
 * Created by: DivyaDharshini
 * Created on: 05-02-2021
 */
public class HelpFractalPage extends FractalBasePage {
	public By learnerViewAll = By.xpath("//h3[contains(text(),'Learner (Direct or Business User)')]/../../a");
	public By instructorViewAll = By.xpath("//h3[contains(text(),'Instructor')]/../../a");
	public By businessAdminViewAll = By.xpath("//h3[contains(text(),'Business Admin')]/../../a");
	public By contentViewAll = By.xpath("//h3[contains(text(),'Content and User')]/../../a");
	public By settingViewAll = By.xpath("//h3[contains(text(),'Settings')]/../../a");
	public By accountViewAll = By.xpath("//h3[contains(text(),'My Account and Site Tour')]/../../a");
	public By classroomViewAll = By.xpath("//h3[contains(text(),'Classroom and Events')]/../../a");
	public By reportViewAll = By.xpath("//h3[contains(text(),'Reports')]/../../a");
	public By siteAdminLbl = By.xpath("//strong[contains(text(),'Site Admin')]");
	public By categoryLbl = By.xpath("//h3[contains(text(),'Category')]");
	public By learnerLbl = By.xpath("//div[contains(text(),'Learner (Direct or Business User)')]");
	public By glossaryLbl = By.xpath("//div[contains(text(),'Glossary')]");
	public By logoIcon = By.xpath("//h1[contains(@class,'logo')]");
	public By accessLbl = By.xpath("//h3/a[contains(@title,'Access Notifications')]/..");
	public By accessDiv = By.xpath("//span[contains(text(),'Access Notifications')]");
	public By editAccountLbl = By.xpath("//h3/a[contains(@title,'Edit Account Details')]");
	public By manageRolesLbl = By.xpath("//h3/a[contains(@title,'Manage Roles')]");
	public By editAccountDiv = By.xpath("//span[contains(text(),'Edit Account Details')]");
	public By manageRolesDiv = By.xpath("//span[contains(text(),'Manage Roles')]");
	public By importUserLbl = By.xpath("//h3/a[contains(@title,'Import and Export User List')]");
	public By activitiesDiv = By.xpath("//span[contains(text(),'ACTIVITIES & MATERIALS and ROSTER tabs')]");
	public By activitiesLbl = By.xpath("//h3/a[contains(@title,'ACTIVITIES and MATERIALS and ROSTER tabs')]");
	public By financeLbl = By.xpath("//h3/a[contains(@title,'Finance Report')]");
	public By financeDiv = By.xpath("//span[contains(text(),'Finance Report')]");
	public HelpFractalPage(WebDriver driver) {
		super(driver);
		// Go to Home Page
		String baseUrl = "https://help.originfractal.com/"; 
		goTo(baseUrl);
	}
	/*
	 * Function name:helpLink()
	 * Covers:It covers creation of a classroom
	 */
	public void helpLink() {
		print("helppage - Loads the url");
		wait(5);
	}
	/*
	 * Function name:logoClick()
	 * Covers:It covers clicking logo icon
	 */
	public void logoClick() {
		click(logoIcon);
		wait(5);
	}
	/*
	 * Function name:learnerViewAllCheck()
	 * Covers:It covers Learner part
	 */
	public void learnerViewAllCheck() {
		wait(2);
		click(learnerViewAll);
		wait(2);
		elementExist(categoryLbl);
		verifyText("Learner (Direct or Business User)",learnerLbl);
		verifyText("Glossary",glossaryLbl);
		logoClick();
	}
	/*
	 * Function name:siteAdminReportsCheck()
	 * Covers:It covers site admin report part
	 */
	public void siteAdminReportsCheck() {
		scrollToElement(accountViewAll);
		wait(2);
		click(reportViewAll);
		wait(2);
		click(financeLbl);
		wait(2);
		click(financeDiv);

	}
	/*
	 * Function name:siteAdminClassroomCheck()
	 * Covers:It covers Siteadmin classroom part
	 */
	public void siteAdminClassroomCheck() {
		scrollToElement(accountViewAll);
		wait(2);
		click(classroomViewAll);
		wait(2);
		click(activitiesLbl);
		wait(2);
		click(activitiesDiv);
		logoClick();

	}
	/*
	 * Function name:siteAdminSettingCheck()
	 * Covers:It covers Site admin Settings part
	 */
	public void siteAdminSettingCheck() {
		scrollToElement(accountViewAll);
		wait(2);
		click(settingViewAll);
		wait(2);
		click(manageRolesLbl);
		wait(2);
		click(manageRolesDiv);
		logoClick();

	}
	/*
	 * Function name:siteAdminAccountCheck()
	 * Covers:It covers Site admin account part
	 */
	public void siteAdminAccountCheck() {
		scrollToElement(accountViewAll);
		wait(2);
		click(accountViewAll);
		wait(5);
		click(editAccountLbl);
		wait(2);
		click(editAccountDiv);
		logoClick();
	}
	/*
	 * Function name:businessAdminViewAllCheck()
	 * Covers:It covers Business Admin Part
	 */
	public void businessAdminViewAllCheck() {
		wait(2);
		click(businessAdminViewAll);
		wait(10);
		elementExist(categoryLbl);
		wait(2);
		elementExist(accessLbl);
		click(accessLbl);
		wait(2);
		elementExist(accessDiv);
		logoClick();
	}
	/*
	 * Function name:instructorViewAllCheck()
	 * Covers:It covers Instructor part 
	 */
	public void instructorViewAllCheck() {
		wait(2);
		click(instructorViewAll);
		wait(10);
		elementExist(categoryLbl);
		wait(2);
		elementExist(accessLbl);
		click(accessLbl);
		wait(2);
		elementExist(accessDiv);
		logoClick();
	}

}
