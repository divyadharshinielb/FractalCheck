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
 * Updated Date: 4-June-20
 */
public class WebTestInstructorBellNotification  extends FractalBaseWebTest {
	@Test(dataProviderClass=DataManager.class, dataProvider = "browers", groups = { "pilot" }, enabled = true, priority = 0 ,
			description = "")
	public void InstructorBellNotificationPrerequiredsite (String row, String strBrowserName) throws Exception {
		driver = BrowserFactory.getBrowser(strBrowserName);
		InstructorBellNotificationSteps instbellnotiSteps=new InstructorBellNotificationSteps(driver);
		InstructorBellNotificationPage instbellnotiPage=new InstructorBellNotificationPage(driver);
		siteAdminLoginwithcookies(driver);
		instbellnotiSteps.prerequisite("instructor2","rescheduleEvent2",instbellnotiPage.getLabel("classroomName"));
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
		loginInstructorwithCookies(driver,instbellnotiPage.getLabel("instructorEmailID"),instbellnotiPage.getLabel("instructorPassword"));
		instbellnotiSteps.verifyEmptyNotification(); 
		Reporter.writeSummary("FR1-2017 TC-01,Verify the text No notifications found," +instbellnotiSteps.getResult() );
		siteAdminLogin(driver);
		instbellnotiSteps.adminCheckAndInvitesInstructor("instructor1EmailID","instructor1Name","instructor1",instbellnotiPage.getLabel("classroomName"));
		loginInstructor(driver,instbellnotiPage.getLabel("instructor1EmailID"),instbellnotiPage.getLabel("instructor1Password"));
		instbellnotiSteps.verifyInviteNotification();	
		Reporter.writeSummary("FR1-2017 TC-02,Verify the instructor1 able to get invite notification (admin invites instructor1)," +instbellnotiSteps.getResult() );
		siteAdminLogin(driver);
		instbellnotiSteps.adminCheckAndInvitesInstructor("instructor2EmailID","instructor2Name","instructor2",instbellnotiPage.getLabel("classroomName"));
		loginInstructor(driver,instbellnotiPage.getLabel("instructor2EmailID"),instbellnotiPage.getLabel("instructor2Password"));
		instbellnotiSteps.verifyInviteNotification();
		Reporter.writeSummary("FR1-2017 TC-03,Verify the instructor2 able to get invite notification (admin invites instructor2)," +instbellnotiSteps.getResult() );
		siteAdminLogin(driver);
		instbellnotiSteps.adminRescheduledEvent("rescheduleEvent1",instbellnotiPage.getLabel("classroomName"));
		loginInstructor(driver,instbellnotiPage.getLabel("instructor2EmailID"),instbellnotiPage.getLabel("instructor2Password"));
		instbellnotiSteps.verifyRescheduledNotification();
		Reporter.writeSummary("FR1-2017 TC-04,Verify the instructor gets reschedule notification (admin changes the timezone)," +instbellnotiSteps.getResult() );
		instbellnotiSteps.verifyandclickMoreBtn();
		Reporter.writeSummary("FR1-2017 TC-05,Verify the instructor sees and clicks MORE notification (when more than 3 notifications)," +instbellnotiSteps.getResult() );
		instbellnotiSteps.verifyNotificationViewallPage();
		Reporter.writeSummary("FR1-2017 TC-06,Verify when instructor clicks MORE notification CTA it lands on View more notifications page," +instbellnotiSteps.getResult() );
		instbellnotiSteps.verifyBreadcrumbMoreNotification();
		Reporter.writeSummary("FR1-2017 TC-07,Verify the instructor sees all notifications page and breadcrumb," +instbellnotiSteps.getResult() );
		instbellnotiSteps.verifyLastNoticationmatch();
		Reporter.writeSummary("FR1-2017 TC-08,Verify the notification details are matching with view all notifications page," +instbellnotiSteps.getResult() );
		instbellnotiSteps.verifyClickNotification();
		Reporter.writeSummary("FR1-2017 TC-09,Verify the click notification details should redirect to Event page," +instbellnotiSteps.getResult() );
		instbellnotiSteps.verifyclickHomeaction();
		Reporter.writeSummary("FR1-2017 TC-10,Verify click Back or Home in breadcrumb- it should redirect to dashboard page," +instbellnotiSteps.getResult() );
	}
}  