package com.origin.fractal.testauto.test.testsuites;

import java.io.IOException;

import org.testng.annotations.Test;

import com.origin.fractal.testauto.DataManager;
import com.origin.fractal.testauto.pages.ClassroomEventPage;
import com.origin.fractal.testauto.pages.InstructorBellNotificationPage;
import com.origin.fractal.testauto.steps.InstructorBellNotificationSteps;
import com.origin.fractal.testauto.steps.InstructorCalendarModuleSteps;
import com.origin.fractal.testauto.steps.MenuSteps;
import com.origin.fractal.testauto.test.FractalBaseWebTest;
import com.wv.auto.framework.BrowserFactory;
import com.wv.auto.framework.utils.Reporter;

/* File name: WebTestInstructorCalendarModule.java
 * Description: FR1-2164 -Instructor Calendar side test cases & FR1-2382 Instructor accepting event for the same day
 * Number of Test cases covered: 12
 * Developed By: Vigneshwaran R
 * Updated Date: 8-June-20
 */
public class WebTestInstructorCalendarModule extends FractalBaseWebTest {
	public int number=0;

	/*
	 * Test NG for Test Instructor Actions - Same day and same time events check and Calendar actions for Traditional and
	 * Virtual classrooms
	 */	
	@Test(dataProviderClass=DataManager.class, dataProvider = "browers", groups = { "pilot" }, enabled = true, priority = 0 )
	public void TestInstructorcalendarActions(String row, String strBrowserName)throws IOException  {
		ClassroomEventPage.EventType = "Traditional Classroom";
		TestInstructorCalendar(row,strBrowserName);
		ClassroomEventPage.EventType="Virtual Classroom";
		TestInstructorCalendar(row,strBrowserName);
	}

	/*
	 * Test event same day and same time action & Test Instructor calendar actions
	 */
	public void TestInstructorCalendar(String row, String strBrowserName) throws IOException {
		driver = BrowserFactory.getBrowser(strBrowserName);
		MenuSteps menuSteps = new MenuSteps(driver);
		ClassroomEventPage eventPage= new ClassroomEventPage(driver);
		InstructorBellNotificationPage instbellnotiPage=new InstructorBellNotificationPage(driver);
		InstructorCalendarModuleSteps InstructorModuleSteps=new InstructorCalendarModuleSteps(driver);
		InstructorBellNotificationSteps instbellnotiSteps=new InstructorBellNotificationSteps(driver);
		siteAdminLoginwithcookies(driver);
		menuSteps.clickMenu();
		menuSteps.gotoClassroomCreation();
		InstructorModuleSteps.deleteOldEventAndAddNewEvent();
		InstructorModuleSteps.verifyAdminSeeInstructorWarningMessage();
		Reporter.writeSummary("FR1-2382_InstrEvent_TC-"+(++number)+",Verify the Admin gets the warning message when he creates "+ClassroomEventPage.EventType+ " event on the same day & time," +InstructorModuleSteps.getResult());
		instbellnotiSteps.adminLogout();
		loginInstructor(driver,instbellnotiPage.instructor1EmailID,instbellnotiPage.instructor1Password);
		InstructorModuleSteps.verifyAdminInviteAndInstructorAcceptevent();
		//Added and updated on 14Sep20
		Reporter.writeSummary("FR1-113_InstrSessionDetails_"+ClassroomEventPage.EventType+",Verify the Admin is able to view the assigned session details in the calendar," +InstructorModuleSteps.getResult());
		Reporter.writeSummary("FR1-114_InstrSessionDetails & FR1-2164_InstrCalendar_TC-"+(++number)+",Verify the Admin invites the Instructor for a "+ClassroomEventPage.EventType+" event," +InstructorModuleSteps.getResult());
		//Ends
		instbellnotiSteps.instLogout();
		siteAdminLogin(driver);
		instbellnotiSteps.adminRescheduledEvent("ISTTime",eventPage.classRoomName);
		loginInstructor(driver,instbellnotiPage.instructor1EmailID,instbellnotiPage.instructor1Password);
		InstructorModuleSteps.verifyRescheduleTimeZoneInInstructorSide();
		Reporter.writeSummary("FR1-2164_InstrCalendar_TC-"+(++number)+",Verify the Admin Reschedules the event for a "+ClassroomEventPage.EventType+" event," +InstructorModuleSteps.getResult());
		instbellnotiSteps.instLogout();
		siteAdminLogin(driver);
		instbellnotiSteps.adminCheckAndInvitesInstructor("instructor2",eventPage.classRoomName);
		loginInstructor(driver,instbellnotiPage.instructor1EmailID,instbellnotiPage.instructor1Password);
		InstructorModuleSteps.verifyAdminReAssignOrDeletetheEvent();
		Reporter.writeSummary("FR1-2164_InstrCalendar_TC-"+(++number)+",Verify the action Admin changes the Instructor for a "+ClassroomEventPage.EventType+" event," +InstructorModuleSteps.getResult());
		instbellnotiSteps.instLogout();
		siteAdminLogin(driver);
		instbellnotiSteps.adminCheckAndInvitesInstructor("instructor1",eventPage.classRoomName);
		loginInstructor(driver,instbellnotiPage.instructor1EmailID,instbellnotiPage.instructor1Password);
		InstructorModuleSteps.instructorRejectEvent();
		InstructorModuleSteps.verifyAdminReAssignOrDeletetheEvent();
		Reporter.writeSummary("FR1-2164_InstrCalendar_TC-"+(++number)+",Verify the action Instructor rejects a "+ClassroomEventPage.EventType+" event," +InstructorModuleSteps.getResult());
		instbellnotiSteps.instLogout();
		siteAdminLogin(driver);
		menuSteps.clickMenu();
		menuSteps.gotoClassroomCreation();
		InstructorModuleSteps.adminDeleteEvent();
		instbellnotiSteps.adminLogout();
		loginInstructor(driver,instbellnotiPage.instructor1EmailID,instbellnotiPage.instructor1Password);
		InstructorModuleSteps.verifyAdminReAssignOrDeletetheEvent();
		Reporter.writeSummary("FR1-2164_InstrCalendar_TC-"+(++number)+",Verify the action Admin deletes a "+ClassroomEventPage.EventType+" event," +InstructorModuleSteps.getResult());
		driver.close();
	}
}
