package com.origin.fractal.testauto.test.testsuites;

import java.io.IOException;

import org.testng.annotations.Test;

import com.origin.fractal.testauto.DataManager;
import com.origin.fractal.testauto.pages.ClassroomEventPage;
import com.origin.fractal.testauto.pages.InstructorBellNotificationPage;
import com.origin.fractal.testauto.steps.InstructorBellNotificationSteps;
import com.origin.fractal.testauto.steps.InstructorCalendarModuleStepsNew;
import com.origin.fractal.testauto.test.FractalBaseWebTest;
import com.wv.auto.framework.BrowserFactory;
import com.wv.auto.framework.utils.Reporter;

/* File name: WebTestInstructorCalendarModule.java
 * Description: FR1-2164 -Instructor Calendar side test cases & FR1-2382 Instructor accepting event for the same day
 * Number of Test cases covered: 12
 * Developed By: Vigneshwaran R
 * Created Date: 8-June-20
 * Updated Date: 27-Mar-2021
 */
public class WebTestInstructorCalendarModuleNew extends FractalBaseWebTest {
		/*
	 * Test event same day and same time action & Test Instructor calendar actions
	 */
	@Test(dataProviderClass=DataManager.class, dataProvider = "browers", groups = { "pilot" }, enabled = true, priority = 0 )
	public void TestInstructorCalendar(String row, String strBrowserName) throws IOException {
		driver = BrowserFactory.getBrowser(strBrowserName);
		//		MenuSteps menuSteps = new MenuSteps(driver);
		ClassroomEventPage eventPage= new ClassroomEventPage(driver);
		InstructorBellNotificationPage instbellnotiPage=new InstructorBellNotificationPage(driver);
		InstructorCalendarModuleStepsNew InstructorModuleSteps=new InstructorCalendarModuleStepsNew(driver);
		InstructorBellNotificationSteps instbellnotiSteps=new InstructorBellNotificationSteps(driver);
		loginInstructor(driver,instbellnotiPage.instructor1EmailID,instbellnotiPage.instructor1Password);
		InstructorModuleSteps.verifyTradInviteNotification();
		Reporter.writeSummary("FR1-2164_InstrCalendar_TC-001,Verify the invite notification (blue dot) on the Instructor calendar (Traditional)," +InstructorModuleSteps.getResult());
		InstructorModuleSteps.verifyVirInviteNotification();
		Reporter.writeSummary("FR1-2164_InstrCalendar_TC-002,Verify the invite notification (blue dot) on the Instructor calendar (Virtual)," +InstructorModuleSteps.getResult());
		InstructorModuleSteps.verifyTredAcceptedEnvent();
		Reporter.writeSummary("FR1-2164_InstrCalendar_TC-003,Verify the accepted notification (Green dot) on the Instructor calendar (Traditional)," +InstructorModuleSteps.getResult());
		InstructorModuleSteps.verifyVirAcceptedEnvent();
		Reporter.writeSummary("FR1-2164_InstrCalendar_TC-004,Verify the accepted notification (Green dot) on the Instructor calendar (Virtual)," +InstructorModuleSteps.getResult());
		InstructorModuleSteps.verifyTredInviteAccepts();
		Reporter.writeSummary("FR1-2164_InstrCalendar_TC-005,Verify the instructor is able to accepts the invite notification (Traditional)," +InstructorModuleSteps.getResult());
		InstructorModuleSteps.verifyTredInviteReject();
		Reporter.writeSummary("FR1-2164_InstrCalendar_TC-006,Verify the instructor is able to Reject the invite notification (Traditional)," +InstructorModuleSteps.getResult());
		InstructorModuleSteps.verifyVirInviteAccepts();		
		Reporter.writeSummary("FR1-2164_InstrCalendar_TC-007,Verify the instructor is able to accepts the invite notification (Virtual)," +InstructorModuleSteps.getResult());
		InstructorModuleSteps.verifyTredInviteReject();
		Reporter.writeSummary("FR1-2164_InstrCalendar_TC-008,Verify the instructor is able to Reject the invite notification (Virtual)," +InstructorModuleSteps.getResult());
		instbellnotiSteps.instLogout();
		siteAdminLogin(driver);
		InstructorModuleSteps.adminRescheduledEvent("Tred");
		InstructorModuleSteps.adminRescheduledEvent("Vir");
		instbellnotiSteps.adminLogout();
		loginInstructor(driver,instbellnotiPage.instructor1EmailID,instbellnotiPage.instructor1Password);
		InstructorModuleSteps.verifyResucheduleTimeZoneTre();
		Reporter.writeSummary("FR1-2164_InstrCalendar_TC-009,Verify the instructor is able to see the reschedules the event (Traditional)," +InstructorModuleSteps.getResult());
		InstructorModuleSteps.verifyResucheduleTimeZoneVir();
		Reporter.writeSummary("FR1-2164_InstrCalendar_TC-010,Verify the instructor is able to see the reschedules the event (Virtual)," +InstructorModuleSteps.getResult());
		instbellnotiSteps.instLogout();
	}
}
