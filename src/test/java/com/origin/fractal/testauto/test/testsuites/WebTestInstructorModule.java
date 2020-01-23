package com.origin.fractal.testauto.test.testsuites;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.origin.fractal.testauto.steps.HomeSteps;
import com.origin.fractal.testauto.steps.InstructorModuleSteps;
import com.origin.fractal.testauto.test.FractalBaseWebTest;
import com.wv.auto.framework.BrowserFactory;
import com.wv.auto.framework.utils.Reporter;

public class WebTestInstructorModule extends FractalBaseWebTest {


	@DataProvider
	public Object[][] browers() {
		return new Object[][] {
		new Object[] { "1", "chrome" }
//		 new Object[] { "2", "firefox" },
//		 new Object[] { "3", "msedge" } ,
//		 new Object[] { "4", "ie11" }
		};
	}
	@Test(dataProvider = "browers", groups = { "pilot", "Home" }, enabled = true,
			// description="Verify categories are available as expected" )
			description = "")
	public void testInstructorPage(String row, String strBrowserName) {
		driver = BrowserFactory.getBrowser(strBrowserName);
		loginToInstructor(driver);
		InstructorModuleSteps instructorModuleSteps = new InstructorModuleSteps(driver);
		instructorModuleSteps.verifyDashboardSubHeaders();
		Reporter.writeSummary("TCID_Instructor_001,the below labels should be able to present in the Instructor Dashboard: TotalEvents NextEven Skills  Updates Invites & Reminders,"+  instructorModuleSteps.getResult() );
		instructorModuleSteps.verifyEventSectionLabels();
		Reporter.writeSummary("TCID_Instructor_002,Verify whether the below labels are present in the Event Section: Upcoming In Progress Completed,"+  instructorModuleSteps.getResult() );
		instructorModuleSteps.verifyButtons();
		Reporter.writeSummary("TCID_Instructor_003,Verify whether the below buttons are present under invites&Reminders: Accept Reject Request to Reschedule,"+  instructorModuleSteps.getResult() );
		instructorModuleSteps.verifyPopupButtons();
		Reporter.writeSummary("TCID_Instructor_004,Verify whether the Request to Reschedule popup shown while clicking Request to Reschedule button.,"+  instructorModuleSteps.getResult() );
		instructorModuleSteps.verifyNextEventSectionViewAll();
		Reporter.writeSummary("TCID_Instructor_005,Verify whether the View All link is shown in NextEvent Section.,"+  instructorModuleSteps.getResult() );
		instructorModuleSteps.verifyInvitesReminderViewAll();
		Reporter.writeSummary("TCID_Instructor_006,Verify whether the View All link is shown in Invites & Reminders Section.,"+  instructorModuleSteps.getResult() );
		instructorModuleSteps.verifyEventsPageLabels();
		Reporter.writeSummary("TCID_Instructor_007,Verify whether the below labels are present in the Event Section: Upcoming In Progress Completed,"+  instructorModuleSteps.getResult() );
		instructorModuleSteps.verifyEventsInvitesClick();
		Reporter.writeSummary("TCID_Instructor_016,verify whether the events inside the invites section redirect to event details page while clicking events,"+  instructorModuleSteps.getResult() );
		instructorModuleSteps.verifyLabelsInsideEventDetailsPage();
		Reporter.writeSummary("TCID_Instructor_008,Verify whether the below labels are present in the Event details page:Pre-EventSession Post-Event Reference Terms&Conditions,"+  instructorModuleSteps.getResult() );
		instructorModuleSteps.verifyInprogressEvent();
		Reporter.writeSummary("TCID_Instructor_009,Verify whether the below labels are present in the Inprogress Event details page:Pre-Event Session Post-Event Reference Terms&Conditions,"+  instructorModuleSteps.getResult() );
		instructorModuleSteps.verifyUpcomingEvent();
		Reporter.writeSummary("TCID_Instructor_010,Verify whether the below labels are present in the Upcoming Event details page:Pre-Event Session Post-Event Reference Terms&Conditions,"+  instructorModuleSteps.getResult() );
		instructorModuleSteps.verifyCompletedEvent();
		Reporter.writeSummary("TCID_Instructor_011,Verify whether the below labels are present in the Completed Event details page:Pre-Event Session Post-Event Reference Terms&Conditions,"+  instructorModuleSteps.getResult() );
		instructorModuleSteps.verifyActivitiesAndRosterTab();
		Reporter.writeSummary("TCID_Instructor_012,Verify whether the below tabs are present in the Completed and Inprogress Event details page:Activities and materials Roster,"+  instructorModuleSteps.getResult() );
		instructorModuleSteps.verifySkillsetList();
		Reporter.writeSummary("TCID_Instructor_013,Verify whether the  labels are present in the Skill drop-down,"+  instructorModuleSteps.getResult() );
   // 	instructorModuleSteps.verifyEvalutionDueDateReachingEvent();
		Reporter.writeSummary("TCID_Instructor_014,Verify whether the view details buttons  are present in the Evalution Due Date Reaching Event.,"+  instructorModuleSteps.getResult() );
		instructorModuleSteps.verifyReviewButton();
		Reporter.writeSummary("TCID_Instructor_015,Verify whether the Review buttons  are present in the INVITES AND REMAINDERS page while we clicking view all button,"+  instructorModuleSteps.getResult() );
		instructorModuleSteps.verifyReviewInsideLabels();
	    Reporter.writeSummary("TCID_Instructor_017,Verify whether the  below labels are present in the Review details page:ALL REVIEW COMPLETED REVIEW PENDING Description,"+  instructorModuleSteps.getResult() );
	}
}