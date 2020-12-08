package com.origin.fractal.testauto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBasePage;
import com.origin.fractal.testauto.steps.InstructorBellNotificationSteps;
/*
 * File/Class name: InstructorCalendarModulePage.java
 * Created by: Vignesh 
 * Updated on: 8-Jun-2020
 * Purpose: This includes all the required xpath variables and page level functionalities for the following user stories -
 * FR1-2164 Instructor Module - Calendar - Event view, Search view 
 * FR1-2382 Instructor accepting event for the same day
 */
public class InstructorCalendarModulePage extends FractalBasePage  {
	ClassroomEventPage eventPage;
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

	public InstructorCalendarModulePage(WebDriver driver) {
		super(driver);
		eventPage=new ClassroomEventPage(driver);
	}

	/*
	 * Method name: deleteOldEventAndAddNewEvent()
	 * Created by: Vignesh 
	 * Created date: 4/May/2020
	 * Return type: void
	 * Desc: Admin adds an event in classroom
	 */	
	public void deleteOldEventAndAddNewEvent() {
		try {
			eventPage.clickClassroom();
//			eventPage.deleteEvent();
			eventPage.classroomEventCreation();
		}
		catch(Exception e) {
			print("Admin NOT able to create an event / Instructor already has an event on the selected date. So admin NOT able to create an event on same day ");
		}
	}

	/*
	 * Method name: adminDeleteEvent()
	 * Created by: Vignesh 
	 * Created date: 4/May/2020
	 * Return type: void
	 * Desc: Admin delete an event in classroom
	 */	
	public void adminDeleteEvent() {
		eventPage.clickClassroom();
		eventPage.deleteEvent();
	}

	/*
	 * Method name: gotoInstructorCalendar()
	 * Created by: Vignesh 
	 * Created date: 4/May/2020
	 * Return type: void
	 * Desc: goto Instructor Calendar 
	 */	
	public void gotoInstructorCalendar() {
		wait(3);
		click(instructorBurgerBtn);
		wait(2);
		click(instructorCalendar);
		//Waiting time increased on 4Sep20
		wait(3);
		//ends
	}

	/*
	 * Method name: verifyAdminInviteAndInstructorAcceptevent()
	 * Created by: Vignesh 
	 * Created date: 4/May/2020
	 * Return type: void
	 * Desc: Instructor Calendar Event- Invite notification and accept a notification
	 */	
	public boolean verifyAdminInviteAndInstructorAcceptevent() {
		By UpcomingDetailsInEventTab=By.xpath("//p[contains(@class,'ins_ins_ins_ins_name ins_classroom_invite_name ins_ins_ins_event_circle_upcoming')][text()='"+eventPage.eventSessionName+"']");
		By inviteDetailsInEventTab=By.xpath("//*[@class='ins_ins_ins_event_circle_invite ins_ins_ins_ins_name ins_classroom_invite_name'][text()='"+eventPage.eventSessionName+"']");
		click(searchIconEventInEventTab);
		enterData(eventPage.eventSessionName,searchDataInEventTab);
		//Waiting time increased on 4Sep20
		wait(5);
		//ends
		moveElementFocus(inviteDetailsInEventTab);
		/* To check and accept the event invite*/
		if(getAttributeValue(inviteDotOnSameDay,"title").contains(eventPage.classRoomName) && elementExist(inviteDetailsInEventTab) ) 
		{
			click(inviteDetailsInEventTab);
			wait(3);
			click(acceptBtn);
			wait(2);
			click(acceptOKBtn);
			wait(3);
			gotoInstructorCalendar();
			wait(2);
			return elementExist(UpcomingDetailsInEventTab);		
		}
		return false;
	}

	/*
	 * Method name: verifyAdminReAssignOrDeletetheEvent()
	 * Created by: Vignesh 
	 * Created date: 4/May/2020
	 * Return type: void
	 * Desc: Instructor Calendar Event- Verify Invite notification or accept notification is present
	 */	
	public boolean verifyAdminReAssignOrDeletetheEvent() {
		By inviteDetailsInEventTab=By.xpath("//p[contains(@class,'ins_ins_ins_event_circle_invite ins_ins_ins_ins_name ins_classroom_invite_name'][text()='"+eventPage.eventSessionName+"']");
		By UpcomingDetailsInEventTab=By.xpath("//p[contains(@class,'ins_ins_ins_ins_name ins_classroom_invite_name ins_ins_ins_event_circle_upcoming')][text()='"+eventPage.eventSessionName+"']");
		click(searchIconEventInEventTab);
		enterData(eventPage.eventSessionName,searchDataInEventTab);
		//Waiting time increased on 4Sep20
		wait(7);
		//ends
		if(verifyNonExistense(UpcomingDetailsInEventTab) && verifyNonExistense(inviteDetailsInEventTab)) {
			print("PASSED: Event details are NOT present in Instructor side when admin delete/reassign/Instructor reject an event");
			return true;
		}
		return false;	
	}

	/*
	 * Method name: verifyResucheduleTimeZoneInInstructorSide()
	 * Created by: Vignesh 
	 * Created date: 5/May/2020
	 * Return type: void
	 * Desc: Instructor Calendar Event- Verify Reschedule Invite notification or accept notification is present
	 */
	public boolean verifyRescheduleTimeZoneInInstructorSide() {
		if(elementExist(eventTabTimeZone)) {//Updated on 25-Nov-20
			print("PASSED: The Reschedule time Zone is shown in Instructor side");
			return true;
		}
		return false;
	}

	/*
	 * Method name: instructorRejectEvent()
	 * Created by: Vignesh 
	 * Created date: 5/May/2020
	 * Return type: void
	 * Desc: Instructor Calendar Event- Verify Reject the Invite notification 
	 */
	public void instructorRejectEvent() {
		gotoInstructorCalendar();
		By inviteDetailsInEventTab=By.xpath("//*[@class='ins_ins_ins_event_circle_invite ins_ins_ins_ins_name ins_classroom_invite_name'][text()='"+eventPage.eventSessionName+"']");
		click(searchIconEventInEventTab);
		enterData(eventPage.eventSessionName,searchDataInEventTab);
		wait(3);
		moveElementFocus(inviteDetailsInEventTab);
		wait(3);
		click(inviteDetailsInEventTab);
		wait(7);
		click(rejectBtn);
		wait(3);
		enterData(eventPage.eventSessionName,rejectCommentTextarea);
		click(rejectYesBtn);
		wait(7);
		driver.navigate().refresh();
		wait(3);
	}

	/*
	 * Method name: verifyAdminSeeInstructorWarningMessage()
	 * Created by: Vignesh 
	 * Created date: 8/May/2020
	 * Return type: boolean
	 * Desc: Admin able to see the Warning Message when Create an event Same time and Same Instructor 
	 */
	public boolean verifyAdminSeeInstructorWarningMessage() {
		eventPage.instructorWarningMessage();
		if(elementExist(warningMessage)) {
			print("PASSED: Admin able to see the Warning Message when Create an event Same time and Same Instructor");
			eventPage.ClickCloseXBtn();
			return true;
		}
		print("FAILED: Admin NOT able to see the Warning Message when Create an event Same time and Same Instructor");
		eventPage.ClickCloseXBtn();
		return false;
	}
}
