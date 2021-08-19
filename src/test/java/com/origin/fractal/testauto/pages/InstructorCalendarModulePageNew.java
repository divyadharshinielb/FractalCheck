package com.origin.fractal.testauto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.origin.fractal.testauto.FractalBasePage;
import com.origin.fractal.testauto.steps.InstructorBellNotificationSteps;
/*
 * File/Class name: InstructorCalendarModulePage.java
 * Created by: Vignesh 
 * Updated on:27-Mar-2021
 * Purpose: This includes all the required xpath variables and page level functionalities for the following user stories -
 * FR1-2164 Instructor Module - Calendar - Event view, Search view 
 * FR1-2382 Instructor accepting event for the same day
 */
public class InstructorCalendarModulePageNew extends FractalBasePage  {

	InstructorBellNotificationSteps instbellnotiSteps;
	public By instructorBurgerBtn=By.xpath("//button[@class='sidenav---sidenav-toggle---1KRjR']");
	public By instructorCalendar=By.xpath("//div[@id='sidebar']//div[3]");
	public By todayinCalender=By.xpath("//*[@class='e-cell e-today']");
	public By inviteDotOnSameDay=By.xpath("//*[contains(@class,' e-focused-date e-today')]//*[@class='dot background dot_ins_event_invite']");
	public By searchIconEventInEventTab=By.xpath("//*[contains(@class, 'ins_cat_search')]");
	public By searchDataInEventTab=By.xpath("//*[@id='theInput']");
	public By acceptBtn=By.xpath("//button[text()='ACCEPT']");
	public By rejectBtn=By.xpath("//*[text()='REJECT']");
	public By rejectCommentTextarea=By.xpath("//textarea[@placeholder='Please leave a reason for rejecting the invite']");
	public By rejectYesBtn=By.xpath("//*[text()='YES']");
	public By acceptOKBtn=By.xpath("//button[text()='OK']");
	public By closeIcon=By.xpath("//*[contains(@class, 'styles_closeIcon__1QwbI')]");
	public By UpcomingEvent=By.xpath("(//*[@class='ins_ins_ins_ins_name ins_classroom_invite_name ins_ins_ins_event_circle_upcoming '])[1]");
	public By eventTabTimeZone=By.xpath("(//*[@class='ins_ins_time_zone_ist'])[1]");
	public By warningMessage=By.xpath("//*[contains(@class,'select-background form-group')]//*[contains(@class,'text-danger')][contains(text(),'already has an event')]");
	Actions actions;
	WebElement element;

	private By calendarMonthHeader=By.xpath("(//*[@id='calendar']//*[@class='e-header e-month'])//div[1]");
	private By calendarYearHeader=By.xpath("(//*[@id='calendar']//*[@class='e-header e-year'])//div[1]");
	private By calendarSelectYear=By.xpath("//*[text()='2025']");
	private By calendarSelectMonth=By.xpath("//*[text()='Oct']");
	private By calendarTradEventinvite=By.xpath("(//*[contains(@class,'dot background dot_ins_event_invite')])[1]");
	private By calendarVirEventinvite=By.xpath("(//*[contains(@class,'dot background dot_ins_event_invite')])[2]");
	private By searchClassRoomName=By.xpath("//input[@id='searchClassroom']");
	private By editTredIcon=By.xpath("(//*[@title='Edit'])[2]");
	private By editVirIcon=By.xpath("(//*[@title='Edit'])[1]");
	private By btnContinue=By.xpath("//button[text()='Continue']");
	private By btnUpdate=By.xpath("//button[text()='Update']");
	private By btnBackToList=By.xpath("//button[text()='Back To Classroom List']");
	private By clickCETTime=By.xpath("//li[contains(text(), 'CET European Central Time (GMT+1:00)')]");
	private By clickISTTime=By.xpath("//li[contains(text(), 'IST India Standard Time (GMT+5:30)')]");
	public By classRoomList=By.xpath("(//*[contains(@class, 'border-tb')])[1]");
	public By closeXIcon=By.xpath("//*[contains(@class, 'close')]");

	public By changeTimeZone=By.xpath("//*[@class='elearninglabel margin-b-20']//md-input-container/div");
	private By time1 = By.xpath("(//*[@class='type-indicator font-size-12 padding-b-10 ng-binding'])[2]");
	private By time2 = By.xpath("(//*[@class='type-indicator font-size-12 padding-b-10 ng-binding'])[4]");
	private By instTime1 = By.xpath("(//*[contains(@class,'ins_ins_time_zone')])[3]");
	private By instTime2 = By.xpath("(//*[contains(@class,'ins_ins_time_zone')])[4]");
	String temp, flag=null;
	String eventSessionName="Auto_InstrCalendar_DoNotDelete";
	public InstructorCalendarModulePageNew(WebDriver driver) {
		super(driver);
	}

	/*
	 * Method name: gotoInstructorCalendar()
	 * Return type: void
	 * Desc: goto Instructor Calendar 
	 */	
	public void gotoInstructorCalendar() {
		wait(3);
		click(instructorBurgerBtn);
		wait(2);
		click(instructorCalendar);
		//Waiting time increased on15-Feb
		wait(8);
		//ends
	}

	/*
	 * Method name: verifyTradInviteNotification()
	 * Return type: boolean
	 * Desc: Instructor Calendar Event- Invite notification 
	 */	
	public boolean verifyTradInviteNotification() {
		By inviteDetailsInEventTab=By.xpath("//*[text()='"+eventSessionName+"']");
		click(searchIconEventInEventTab);
		enterData(eventSessionName,searchDataInEventTab);
		driver.findElement(searchDataInEventTab).sendKeys(Keys.ENTER);
		wait(5);
		moveElementFocusandClick(calendarMonthHeader);
		wait(2);
		moveElementFocusandClick(calendarYearHeader);
		wait(2);
		moveElementFocusandClick(calendarSelectYear);
		wait(2);
		moveElementFocusandClick(calendarSelectMonth);
		wait(2);
		if(getAttributeValue(calendarTradEventinvite,"title").contains(eventSessionName) ||  elementExist(inviteDetailsInEventTab) ) 
		{
			return true;
		}
		return false;
	}

	/*
	 * Method name: verifyVirInviteNotification()
	 * Return type: boolean
	 * Desc: Instructor Calendar Event- Invite notification 
	 */	
	public boolean verifyVirInviteNotification() {
		By inviteDetailsInEventTab=By.xpath("//*[text()='"+eventSessionName+"']");
		if(elementExist(inviteDetailsInEventTab)) {		
			print("true");
		}
		if(getAttributeValue(calendarVirEventinvite,"title").contains(eventSessionName)  ||  elementExist(inviteDetailsInEventTab) ) 
		{
			return true;
		}
		return false;
	}

	/*
	 * Method name: verifyTredAcceptedEnvent()
	 * Return type: boolean
	 * Desc: Instructor Calendar Event- Green dot on calendar
	 */	
	public boolean verifyTredAcceptedEnvent() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		wait(2);
		By inviteDetailsInEventTab=By.xpath("(//*[contains(@class,'dot background dot_ins_event_upcoming')][contains(@title,'"+eventSessionName+"')])[1]");	
		if(elementExist(inviteDetailsInEventTab)) 
		{
			return true;
		}
		return false;
	}

	/*
	 * Method name: verifyVirAcceptedEnvent()
	 * Return type: boolean
	 * Desc: Instructor Calendar Event- Green dot on calendar
	 */	
	public boolean verifyVirAcceptedEnvent() {
		wait(2);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		By inviteDetailsInEventTab=By.xpath("(//*[contains(@class,'dot background dot_ins_event_upcoming')][contains(@title,'"+eventSessionName+"')])[2]");

		if(elementExist(inviteDetailsInEventTab)) 
		{
			return true;
		}
		return false;
	}
	/*
	 * Method name: verifyTredInviteAccepts()
	 * Return type: boolean
	 * Desc: Instructor Calendar Event- Invite accepts 
	 */	
	public boolean verifyTredInviteAccepts() {
		By inviteDetailsInEventTab=By.xpath("(//p[contains(@class,'ins_ins_ins_event_circle_invite ins_ins_ins_ins_name ins_classroom_invite_name')][text()='"+eventSessionName+"'])[1]");
		if(elementExist(inviteDetailsInEventTab) ) 
		{
			click(inviteDetailsInEventTab);
			wait(5);
			return elementExist(acceptBtn) && isClickable(acceptBtn);
		}
		return false;
	}

	/*
	 * Method name: verifyTredInviteReject()
	 * Return type: boolean
	 * Desc: Instructor Calendar Event- Reject the event
	 */	
	public boolean verifyTredInviteReject() {
		if(elementExist(rejectBtn) ) 
		{
			return isClickable(rejectBtn);
		}
		return false;
	}

	/*
	 * Method name: verifyVirInviteAccepts()
	 * Return type: boolean
	 * Desc: Instructor Calendar Event- Invite accepts 
	 */	
	public boolean verifyVirInviteAccepts() {
		gotoInstructorCalendar();
		click(searchIconEventInEventTab);
		enterData(eventSessionName,searchDataInEventTab);
		driver.findElement(searchDataInEventTab).sendKeys(Keys.ENTER);
		wait(5);
		By inviteDetailsInEventTab=By.xpath("(//p[contains(@class,'ins_ins_ins_event_circle_invite ins_ins_ins_ins_name ins_classroom_invite_name')][text()='"+eventSessionName+"'])[2]");
		if(elementExist(inviteDetailsInEventTab) ) 
		{
			click(inviteDetailsInEventTab);
			wait(5);
			return elementExist(acceptBtn) && isClickable(acceptBtn);
		}
		return false;
	}

	/* Function name: editEvent()
	 * Action: Admin search specific classroom and add a instructor & time zone in classroom
	 * Return Type: void
	 */
	public void editEvent(String check) {
		wait(10);
		enterData(eventSessionName,searchClassRoomName);
		wait(20);
		click(classRoomList);
		wait(20);
		temp = getText(time1);
		flag = getText(time2);
		print(temp);
		print(flag);
		if(check.contentEquals("Tred")) {
			click(editTredIcon);
		}
		else {
			click(editVirIcon);
		}
		wait(20);
		click(changeTimeZone);
		wait(2);
		if(temp.contains("CET") || flag.contains("CET")){
			element=driver.findElement(clickISTTime);
			actions= new Actions(driver);
			actions.moveToElement(element).perform();
			wait(2);
			click(clickISTTime);
		}
		else if(temp.contains("IST") || flag.contains("IST")){
			element=driver.findElement(clickCETTime);
			actions= new Actions(driver);
			actions.moveToElement(element).perform();
			wait(2);
			click(clickCETTime);
		}
		click(btnContinue);
		wait(2);
		click(btnUpdate);
		wait(10);
		click(closeXIcon);
		wait(5);

	}		



	/*
	 * Method name: verifyResucheduleTimeZoneTre()
	 * Return type: bool
	 * Desc: Instructor Calendar Event- Verify Reschedule Invite notification 
	 */
	public boolean verifyResucheduleTimeZoneTre() {
		gotoInstructorCalendar();
		click(searchIconEventInEventTab);
		enterData(eventSessionName,searchDataInEventTab);
		driver.findElement(searchDataInEventTab).sendKeys(Keys.ENTER);
		wait(5);
		temp = getText(instTime1);
		flag = getText(instTime2);
		if(temp.contains("IST") || temp.contains("CET") || flag.contains("IST") || flag.contains("CET")) {
			print("PASSED: The Reschedule time Zone is shown in Instructor side");
			return true;
		}
		return false;
	}

	/*
	 * Method name: verifyResucheduleTimeZoneVir()
	 * Return type: void
	 * Desc: Instructor Calendar Event- Verify Reschedule Invite notification 
	 */
	public boolean verifyResucheduleTimeZoneVir() {
			if(flag.contains("IST") || flag.contains("CET")) {
			print("PASSED: The Reschedule time Zone is shown in Instructor side");
			return true;
		}
		return false;
	}


}
