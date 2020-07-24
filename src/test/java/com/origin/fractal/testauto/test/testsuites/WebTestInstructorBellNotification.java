//Created by vignesh WVI on 7/April/20
package com.origin.fractal.testauto.test.testsuites;

import org.testng.annotations.Test;

import com.origin.fractal.testauto.DataManager;
import com.origin.fractal.testauto.pages.InstructorBellNotificationPage;
import com.origin.fractal.testauto.steps.InstructorBellNotificationSteps;
import com.origin.fractal.testauto.test.FractalBaseWebTest;
import com.wv.auto.framework.BrowserFactory;
import com.wv.auto.framework.utils.Reporter;

/*
 * Description: FR1-2017 -Instructor side test 
 * Number of Test cases covered: 10
 * Developed By: Vigneshwaran R
 * created Date: 4-June-20
 * Updated Date: 15-July-20
 */
public class WebTestInstructorBellNotification  extends FractalBaseWebTest {
	@Test(dataProviderClass=DataManager.class, dataProvider = "browers", groups = { "pilot" }, enabled = false, priority = 0 ,
			description = "")
	public void InstructorBellNotificationPrerequiredsite (String row, String strBrowserName) throws Exception {
		driver = BrowserFactory.getBrowser(strBrowserName);
		InstructorBellNotificationSteps instbellnotiSteps=new InstructorBellNotificationSteps(driver);
		InstructorBellNotificationPage instbellnotiPage=new InstructorBellNotificationPage(driver);
		siteAdminLoginwithcookies(driver);
		instbellnotiSteps.prerequisite("instructor2","ISTTime",instbellnotiPage.classroomName);
	}
	
	/*
	 * Test NG for Instructor side bell notifications
	 */
	@Test(dataProviderClass=DataManager.class, dataProvider = "browers", groups = { "pilot" }, enabled = true, priority = 1 ,
			description = "")
	public void InstructorBellNotification (String row, String strBrowserName) throws Exception {
		driver = BrowserFactory.getBrowser(strBrowserName);
		InstructorBellNotificationSteps instbellnotiSteps=new InstructorBellNotificationSteps(driver);
		InstructorBellNotificationPage instbellnotiPage=new InstructorBellNotificationPage(driver);
//		driver = BrowserFactory.getBrowser(strBrowserName);
//		InstructorBellNotificationSteps instbellnotiSteps=new InstructorBellNotificationSteps(driver);
//		InstructorBellNotificationPage instbellnotiPage=new InstructorBellNotificationPage(driver);
		siteAdminLoginwithcookies(driver);
		instbellnotiSteps.prerequisite("instructor2","ISTTime",instbellnotiPage.classroomName);
		loginInstructor(driver,instbellnotiPage.instructorEmailID,instbellnotiPage.instructorPassword);
		instbellnotiSteps.verifyEmptyNotification(); 
		Reporter.writeSummary("FR1-2017_InstrBell_TC01,Verify the text No notifications found," +instbellnotiSteps.getResult() );
		siteAdminLogin(driver);
		instbellnotiSteps.adminCheckAndInvitesInstructor("instructor1",instbellnotiPage.classroomName);
		loginInstructor(driver,instbellnotiPage.instructor1EmailID,instbellnotiPage.instructor1Password);
		instbellnotiSteps.verifyInviteNotification();	 
		instbellnotiSteps.instLogout();
		Reporter.writeSummary("FR1-2017_InstrBell_TC02,Verify the instructor1 able to get invite notification (admin invites instructor1)," +instbellnotiSteps.getResult() );
		siteAdminLogin(driver);
		instbellnotiSteps.adminCheckAndInvitesInstructor("instructor2",instbellnotiPage.classroomName);
		loginInstructor(driver,instbellnotiPage.instructor2EmailID,instbellnotiPage.instructor2Password);
		instbellnotiSteps.verifyInviteNotification();
		Reporter.writeSummary("FR1-2017_InstrBell_TC03,Verify the instructor2 able to get invite notification (admin invites instructor2)," +instbellnotiSteps.getResult() );
		instbellnotiSteps.instLogout();
		siteAdminLogin(driver);
		instbellnotiSteps.adminRescheduledEvent("CETTime",instbellnotiPage.classroomName);
		loginInstructor(driver,instbellnotiPage.instructor2EmailID,instbellnotiPage.instructor2Password); 
		instbellnotiSteps.verifyRescheduledNotification();
		Reporter.writeSummary("FR1-2017_InstrBell_TC04,Verify the instructor gets reschedule notification (admin changes the timezone)," +instbellnotiSteps.getResult() );
		instbellnotiSteps.verifyandclickMoreBtn();
		Reporter.writeSummary("FR1-2017_InstrBell_TC05,Verify the instructor sees and clicks MORE (when more than 3 notifications)," +instbellnotiSteps.getResult() );
		instbellnotiSteps.verifyNotificationViewallPage();
		Reporter.writeSummary("FR1-2017_InstrBell_TC06,Verify when instructor clicks MORE CTA it lands on View more notifications page," +instbellnotiSteps.getResult() );
		instbellnotiSteps.verifyBreadcrumbMoreNotification();
		Reporter.writeSummary("FR1-2017_InstrBell_TC07,Verify the instructor sees all notifications page and breadcrumb," +instbellnotiSteps.getResult() );
		instbellnotiSteps.verifyLastNoticationmatch();
		Reporter.writeSummary("FR1-2017_InstrBell_TC08,Verify the notification details are matching with view all notifications page," +instbellnotiSteps.getResult() );
		instbellnotiSteps.verifyClickNotification();
		Reporter.writeSummary("FR1-2017_InstrBell_TC09,Verify the click notification details should redirect to Event page," +instbellnotiSteps.getResult() );
		instbellnotiSteps.verifyclickHomeaction();
		Reporter.writeSummary("FR1-2017_InstrBell_TC10,Verify click Back or Home in breadcrumb- it should redirect to dashboard page," +instbellnotiSteps.getResult() );
	}
}  