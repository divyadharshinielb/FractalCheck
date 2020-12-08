package com.origin.fractal.testauto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBasePage;
/*
 * File Name: ClassRoomRosterPage.java
 * Created By: Vignesh
 * Created on: 28-Sep-20
 * Purpose: To check the classroom Roster on Admin side (FR_145 - Learning Admin/Site Admin can manage the roster.)
 */
public class ClassRoomRosterPage extends FractalBasePage{
	private By searchClassRoomName=By.xpath("//input[@id='searchClassroom']");
	private By classRoomList=By.xpath("((//*[contains(@class, 'border-tb')])[1]//div)[3]");// Updated on 4-Dec-20
	private By eventList=By.xpath("(//*[contains(@ng-click,'viewEventDetails')])[1]");
	private By eventRosterTab=By.xpath("(//*[contains(text(),'Roster')])[2]");
	private By sessionAttendance=By.xpath("//*[contains(@class, 'md-bar')]");
	private By userModuleAssignment=By.xpath("//*[contains(@ng-show, 'active1')]");
	private By userSubmitedAssignment=By.xpath("//i[@class='icon-togg padding-lr-20 icon text-right font-size-20 bold gray-85 cursor-pointer']");
	//private By assignmentStatus=By.xpath("//*[contains(text(),'Select')]");
	private By assignmentStatus=By.xpath("//*[@class='nice-select ng-pristine ng-untouched ng-valid ng-scope ng-isolate-scope ng-empty']");
	private By assignmentEvalution=By.xpath("//li[contains(text(),'Evaluated')]");
	private By assignmentReject=By.xpath("//li[contains(text(),'Rejected')]");
	private By btnDone=By.xpath("//*[contains(text(),'Done')]");
	private By inputAssignmentScore=By.xpath("//*[@id='itemCode']");
	private By activitiesTab=By.xpath("(//*[contains(text(),'Activities & Materials')])[1]");
	private By preEventActivitiesModule=By.xpath("//h4[contains(text(),'Pre-event Activities')]");
	private By preEventAssignment=By.xpath("//*[contains(@ng-click,'viewAssignmentDetails(assignmentdetails,eventdetails_materials_page)')]");
	private By preEventAssignmentStatus=By.xpath("//*[contains(text(),'Pre-event assignment')]");
	private By assignmentPreview=By.xpath("//*[contains(@ng-click,'gotoAssignmentDetails')]");
	private By backToAssignmentDetails=By.xpath("//div[contains(text(),'Back To Assignment Details')]");
	private By backToEventDetails=By.xpath("//div[contains(text(),'Back To Event Details')]");
	private By backToClassRoom=By.xpath("//*[text()='Back to Classroom']");
	private By backToClassRoomList=By.xpath("//div[@class='padding-t-2']");
	public ClassRoomRosterPage(WebDriver driver) {
		super(driver);
	}

	/* Function Name: verifyClassroomRoster()
	 * purpose: Verifying the Roster details
	 */
	public boolean verifyClassroomRoster() {
		enterData("Auto_Roster_Check",searchClassRoomName);
		wait(5);
		click(classRoomList);
		wait(5);
		click(eventList);
		wait(3);
		moveElementFocusandClick(eventRosterTab);
//		wait(2);
//		moveElementFocusandClick(sessionAttendance);
		wait(10);
		moveElementFocusandClick(userModuleAssignment);
		wait(2);
		moveElementFocusandClick(userSubmitedAssignment);
		wait(5);
		moveElementFocusandClick(assignmentStatus);
		wait(2);
		elementExist(assignmentEvalution);
		elementExist(assignmentReject);
		elementExist(btnDone);
		click(backToAssignmentDetails);
		wait(3);
		return elementExist(backToClassRoom);
	}

	/* Function Name: verifyAssignmentDetails()
	 * purpose: Verifying the Assignment details
	 */
	public boolean verifyAssignmentDetails() {
		click(activitiesTab);
		wait(2);
		moveElementFocusandClick(preEventActivitiesModule);
		wait(2);
		moveElementFocusandClick(preEventAssignment);
		wait(5);
		elementExist(preEventAssignmentStatus);
		wait(3);
		click(assignmentPreview);
		wait(5);
		click(backToAssignmentDetails);
		wait(3);
		click(backToEventDetails);
		wait(3);
		return elementExist(backToClassRoom);
	}

	/* Function Name: verifyAssignmentScore()
	 * purpose: Verifying the Assignment Score
	 */
	public boolean verifyAssignmentScore() {
		try{click(eventRosterTab);
		wait(5);
		moveElementFocusandClick(userModuleAssignment);
		wait(2);
		moveElementFocusandClick(userSubmitedAssignment);
		wait(5);
		moveElementFocusandClick(assignmentStatus);
		wait(2);
		moveElementFocusandClick(assignmentEvalution);
		wait(2);
		enterData("50",inputAssignmentScore);
		wait(2);
		click(backToAssignmentDetails);
		wait(3);
		click(backToClassRoom);
		wait(3);
		click(backToClassRoomList);
		wait(3);
		return true;
		}
		catch(Exception e) {
			return false;
		}
	}
}
