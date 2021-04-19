//Created by vignesh WVI on 7/April/20
package com.origin.fractal.testauto.test.testsuites;

import org.testng.annotations.Test;

import com.origin.fractal.testauto.DataManager;
import com.origin.fractal.testauto.pages.InstructorBellNotificationPage;
import com.origin.fractal.testauto.steps.ClassRoomRosterSteps;
import com.origin.fractal.testauto.steps.InstructorBellNotificationSteps;
import com.origin.fractal.testauto.test.FractalBaseWebTest;
import com.wv.auto.framework.BrowserFactory;
import com.wv.auto.framework.utils.Reporter;

/*
 * Description: FR1-2017 -Instructor side test 
 * Number of Test cases covered: 10
 * Developed By: Vigneshwaran R
 * created Date: 4-June-20
 * Updated Date: 25-Nov-20
 */
public class WebTestInstructorBellNotification  extends FractalBaseWebTest {
	/*
	 * Test NG for Instructor side bell notifications
	 */
	@Test(dataProviderClass=DataManager.class, dataProvider = "browers", groups = { "pilot" }, enabled = true,priority =0,
			description = "")
	public void InstructorBellNotification (String row, String strBrowserName) throws Exception {
		driver = BrowserFactory.getBrowser(strBrowserName);
		InstructorBellNotificationSteps instbellnotiSteps=new InstructorBellNotificationSteps(driver);
		InstructorBellNotificationPage instbellnotiPage=new InstructorBellNotificationPage(driver);
		siteAdminLoginwithcookies(driver);//Updated on 3-Dec-20
		//Added by vignesh 26-Sep-20 This for Roster test 
		ClassRoomRosterSteps classroomRoster=new ClassRoomRosterSteps(driver);
		instbellnotiSteps.gotoClassRoom();//Updated on 3-Dec-20
		classroomRoster.verifyClassroomRoster();
		Reporter.writeSummary("FR-145_Scoring-ClassRoomRoster_TC-001, Admin can manage the roster.," +classroomRoster.getResult() );
		Reporter.writeSummary("FR-2365_ClassRoomRoster_TC-001, Classroom admin roster page fixes," +classroomRoster.getResult() );
		classroomRoster.verifyAssignmentDetails();
		Reporter.writeSummary("FR-531_Event_TC-001, Verify admin manages assignments," +classroomRoster.getResult() );
		classroomRoster.verifyAssignmentScore();
		Reporter.writeSummary("FR-147_Scoring_TC-001, Admin can give scores to the assignment.," +classroomRoster.getResult() );
		//ends		
		instbellnotiSteps.prerequisite("instructor2","ISTTime",instbellnotiPage.classroomName);
		loginInstructor(driver,instbellnotiPage.instructorEmailID,instbellnotiPage.instructorPassword);
		instbellnotiSteps.verifyEmptyNotification(); 
		//Added on 15-Sep-20
		Reporter.writeSummary("FR-111_InstrLogin,Verify the Instructor login," +instbellnotiSteps.getResult() );
		//ends
		Reporter.writeSummary("FR1-2017_InstrBell_TC-001,Verify the text No notifications found," +instbellnotiSteps.getResult() );
		siteAdminLogin(driver);
		instbellnotiSteps.adminCheckAndInvitesInstructor("instructor1",instbellnotiPage.classroomName);
		loginInstructor(driver,instbellnotiPage.instructor1EmailID,instbellnotiPage.instructor1Password);
		instbellnotiSteps.verifyInviteNotification();	 
		instbellnotiSteps.instLogout();
		Reporter.writeSummary("FR1-2017_InstrBell_TC-002,Verify the instructor1 able to get invite notification (admin invites instructor1)," +instbellnotiSteps.getResult() );
		siteAdminLogin(driver);
		instbellnotiSteps.adminCheckAndInvitesInstructor("instructor2",instbellnotiPage.classroomName);
		loginInstructor(driver,instbellnotiPage.instructor2EmailID,instbellnotiPage.instructor2Password);
		instbellnotiSteps.verifyInviteNotification();
		Reporter.writeSummary("FR1-2017_InstrBell_TC-003,Verify the instructor2 able to get invite notification (admin invites instructor2)," +instbellnotiSteps.getResult() );
		instbellnotiSteps.instLogout();
		siteAdminLogin(driver);
		instbellnotiSteps.adminRescheduledEvent("CETTime",instbellnotiPage.classroomName);
		loginInstructor(driver,instbellnotiPage.instructor2EmailID,instbellnotiPage.instructor2Password); 
		instbellnotiSteps.verifyRescheduledNotification();
		Reporter.writeSummary("FR1-2017_InstrBell_TC-004,Verify the instructor gets reschedule notification (admin changes the timezone)," +instbellnotiSteps.getResult() );
		instbellnotiSteps.verifyandclickMoreBtn();
		Reporter.writeSummary("FR1-2017_InstrBell_TC-005,Verify the instructor sees and clicks MORE (when more than 3 notifications)," +instbellnotiSteps.getResult() );
		instbellnotiSteps.verifyNotificationViewallPage();
		Reporter.writeSummary("FR1-2017_InstrBell_TC-006,Verify when instructor clicks MORE CTA it lands on View more notifications page," +instbellnotiSteps.getResult() );
		instbellnotiSteps.verifyBreadcrumbMoreNotification();
		Reporter.writeSummary("FR1-2017_InstrBell_TC-007,Verify the instructor sees all notifications page and breadcrumb," +instbellnotiSteps.getResult() );
		instbellnotiSteps.verifyLastNoticationmatch();
		Reporter.writeSummary("FR1-2017_InstrBell_TC-008,Verify the notification details are matching with view all notifications page," +instbellnotiSteps.getResult() );
		instbellnotiSteps.verifyClickNotification();
		Reporter.writeSummary("FR1-2017_InstrBell_TC-009,Verify the click notification details should redirect to Event page," +instbellnotiSteps.getResult() );
		instbellnotiSteps.verifyclickHomeaction();
		Reporter.writeSummary("FR1-2017_InstrBell_TC-010,Verify click Back or Home in breadcrumb- it should redirect to dashboard page," +instbellnotiSteps.getResult() );
	}
}  