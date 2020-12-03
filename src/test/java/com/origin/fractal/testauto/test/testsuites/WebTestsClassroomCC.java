package com.origin.fractal.testauto.test.testsuites;


import java.io.IOException;

import org.testng.annotations.Test;

import com.origin.fractal.testauto.DataManager;
import com.origin.fractal.testauto.steps.ClassroomCCSteps;
import com.origin.fractal.testauto.test.FractalBaseWebTest;
import com.wv.auto.framework.BrowserFactory;
import com.wv.auto.framework.utils.Reporter;

public class WebTestsClassroomCC extends FractalBaseWebTest {

	@Test(dataProviderClass=DataManager.class, dataProvider = "browers", groups = { "Phase1.0" }, enabled = true,
			description = "TC_Admin_Classroom_CC_ 001 - 015 ")
	public void testClassroom(String row, String strBrowserName) throws IOException {
		driver = BrowserFactory.getBrowser(strBrowserName);
		siteAdminLogin(driver); //Updated on 3-Dec-20
		ClassroomCCSteps ClassroomSteps = new ClassroomCCSteps(driver);
			
		ClassroomSteps.GotoClassroom();
//		Reporter.writeSummary("TC_Admin_ 001,Admin Login and open the classroom, " +  ClassroomSteps.getResult() );//commented on 25-Nov-20

//		ClassroomSteps.CClblAllsession();
		ClassroomSteps.GotoEditClassroom();
//		ClassroomSteps.EditCClblAllsession();
		Reporter.writeSummary("Admin_CompletionCriteria_TC-001,Select/Unselect Participation all sessions in criteria (on Add/Edit_classroom)," +  ClassroomSteps.getResult() );

		ClassroomSteps.CClblAssDuedate();
		ClassroomSteps.GotoEditClassroom();
		ClassroomSteps.EditCClblAssDuedate();
		Reporter.writeSummary("Admin_CompletionCriteria_TC-002,Select/Unselect Assignment Due date in criteria (on Add/Edit_classroom)," +  ClassroomSteps.getResult() );
		
		ClassroomSteps.GotoEditClassroom();
		ClassroomSteps.CClblQualifyPrecentage();
		ClassroomSteps.GotoEditClassroom();
		ClassroomSteps.EditCClblQualifyPrecentage();
		Reporter.writeSummary("Admin_CompletionCriteria_TC-003,Select/Unselect Qualifying Score in criteria (on Add/Edit_classroom)," +  ClassroomSteps.getResult() );
		
		ClassroomSteps.CClblQualifySinglePrecentage();
		ClassroomSteps.GotoEditClassroom();
		ClassroomSteps.EditCClblQualifySinglePrecentage();
		Reporter.writeSummary("Admin_CompletionCriteria_TC-004,The Qualifying Score is allowing the single digit in criteria (on Add/Edit_classroom)," +  ClassroomSteps.getResult() );

		ClassroomSteps.CClblFeedbackDuedate();
		ClassroomSteps.GotoEditClassroom();
		ClassroomSteps.EditCClblFeedbackDuedate();
		Reporter.writeSummary("Admin_CompletionCriteria_TC-005,Select/Unselect Feedback Due date in criteria (on Add/Edit_classroom)," +  ClassroomSteps.getResult() );

		ClassroomSteps.CClblManualCompletion();
		ClassroomSteps.GotoEditClassroom();
		ClassroomSteps.EditCClblManualCompletion();
		Reporter.writeSummary("Admin_CompletionCriteria_TC-006,Select/Unselect Manual Submission in criteria (on Add/Edit_classroom)," +  ClassroomSteps.getResult() );

		ClassroomSteps.CClblAllSession_Subdate();
		ClassroomSteps.GotoEditClassroom();
		ClassroomSteps.EditCClblAllSession_Subdate();
		Reporter.writeSummary("Admin_CompletionCriteria_TC-007,Select/Unselect Participation all sessions & Assignment Due date in criteria (on Add/Edit_classroom)," +  ClassroomSteps.getResult() );

		ClassroomSteps.CClblSubdate_Qualify();
		ClassroomSteps.GotoEditClassroom();
		ClassroomSteps.EditCClblSubdate_Qualify();
		Reporter.writeSummary("Admin_CompletionCriteria_TC-008,Select/Unselect Assignment Due date & Qualifying Score in criteria (on Add/Edit_classroom)," +  ClassroomSteps.getResult() );

		ClassroomSteps.CClblQualify_feedbackdate();
		ClassroomSteps.GotoEditClassroom();
		ClassroomSteps.EditCClblQualify_feedbackdate();
		Reporter.writeSummary("Admin_CompletionCriteria_TC-009,Select/Unselect Qualifying Score & Feedback Due date in criteria (on Add/Edit_classroom)," +  ClassroomSteps.getResult() );

		ClassroomSteps.CClblfeedbackdate_Manualcomp();
		ClassroomSteps.GotoEditClassroom();
		ClassroomSteps.EditCClblfeedbackdate_Manualcomp();
		Reporter.writeSummary("Admin_CompletionCriteria_TC-010,Select/Unselect Feedback Due date & Manual Submission in criteria (on Add/Edit_classroom)," +  ClassroomSteps.getResult() );

		ClassroomSteps.CClblManualcomp_Allsession();
		ClassroomSteps.GotoEditClassroom();
		ClassroomSteps.EditCClblManualcomp_Allsession();
		Reporter.writeSummary("Admin_CompletionCriteria_TC-011,Select/Unselect Manual Submission & Participation all sessions in criteria (on Add/Edit_classroom)," +  ClassroomSteps.getResult() );

		//Overall Completion Criteria text
		/*currently this functionality is not there start here*/
	/*	ClassroomSteps.verifyCCTexts(); 
		ClassroomSteps.GotoEditClassroom();
		ClassroomSteps.verifyEditCCTexts(); 
		Reporter.writeSummary("Admin_CompletionCriteria_TC-0012,Verify ALL the Completion Criteria texts (on Add/Edit_classroom), " +  ClassroomSteps.getResult() );


		// For all the five individual CC texts
	//	ClassroomSteps.verifyCCsessionLabels();
	//	ClassroomSteps.GotoEditClassroom();
	//	ClassroomSteps.verifyEditCCsessionLabels();
	//	Reporter.writeSummary("Admin_CompletionCriteria_TC-0012a,Verify the text in CC -All Sessions (on Add/Edit_classroom), " +  ClassroomSteps.getResult() );
      /*end here*/
		ClassroomSteps.GotoEditClassroom();
		ClassroomSteps.verifyCCAssDuedateLabels();
		ClassroomSteps.GotoEditClassroom();
		ClassroomSteps.verifyEditCCAssDuedateLabels();
		Reporter.writeSummary("Admin_CompletionCriteria_TC-012,Verify the text in CC-Assignment Due date (on Add/Edit_classroom)," +  ClassroomSteps.getResult() );

		ClassroomSteps.verifyCCQualifyPrecentageLabels();
		ClassroomSteps.GotoEditClassroom();
		ClassroomSteps.verifyEditCCQualifyPrecentageLabels();
		Reporter.writeSummary("Admin_CompletionCriteria_TC-013,Verify the text in CC-qualification percentage (on Add/Edit_classroom)," +  ClassroomSteps.getResult() );
		
		ClassroomSteps.GotoEditClassroom();
		ClassroomSteps.verifyCCFeedbackDuedateLabels();
		ClassroomSteps.GotoEditClassroom();
		ClassroomSteps.verifyEditCCFeedbackDuedateLabels();
		Reporter.writeSummary("Admin_CompletionCriteria_TC-014,Verify the text in CC-Feedback Due date (on Add/Edit_classroom)," +  ClassroomSteps.getResult() );

		ClassroomSteps.verifyCCManualCompletionLabels();
		ClassroomSteps.GotoEditClassroom();
		ClassroomSteps.verifyEditCCManualCompletionLabels();
		Reporter.writeSummary("Admin_CompletionCriteria_TC-015,Verify the text in CC-Manual Submission (on Add/Edit_classroom)," +  ClassroomSteps.getResult() );

		ClassroomSteps.Clicklogout();
//		Reporter.writeSummary("TC_Admin_Add_Classroom_013,Click Cancel button & Logout, " +  ClassroomSteps.getResult() ); //commented on 25-Nov-20
	}
}