package com.origin.fractal.testauto.test.testsuites;


import java.io.IOException;

import org.testng.annotations.Test;

import com.origin.fractal.testauto.DataManager;
import com.origin.fractal.testauto.steps.MenuSteps;
import com.origin.fractal.testauto.steps.ClassroomCCSteps;
import com.origin.fractal.testauto.test.FractalBaseWebTest;
import com.wv.auto.framework.BrowserFactory;
import com.wv.auto.framework.utils.Reporter;

public class WebTestsClassroomCC extends FractalBaseWebTest {

	@Test(dataProviderClass=DataManager.class, dataProvider = "browers", groups = { "Phase1.0" }, enabled = true, 
			description = "TC_Admin_Classroom_CC_ 001 - 013: "
					+ "TC_Admin_ 001,Admin Login and open the classroom,"
					+ "TC_Admin_Add_Classroom and Edit_classroom_CC-002,Select/Unselect Participation all sessions in criteria,"
					+ "TC_Admin_Add_Classroom and Edit_classroom_CC-003,Select/Unselect Assignment Due date in criteria,"
					+ "TC_Admin_Add_Classroom and Edit_classroom_CC-004,Select/Unselect Qualifying Score in criteria,"
					+ "TC_Admin_Add_Classroom and Edit_classroom_CC-005,Select/Unselect Feedback Due date in criteria,"
					+ "TC_Admin_Add_Classroom and Edit_classroom_CC-006,Select/Unselect Manual Submission in criteria,"
					+ "TC_Admin_Add_Classroom and Edit_classroom_CC-007,Select/Unselect Participation all sessions & Assignment Due date  in criteria,"
					+ "TC_Admin_Add_Classroom and Edit_classroom_CC-008,Select/Unselect Assignment Due date & Qualifying Score in criteria,"
					+ "TC_Admin_Add_Classroom and Edit_classroom_CC-009,Select/Unselect Qualifying Score & Feedback Due date in criteria,"
					+ "TC_Admin_Add_Classroom and Edit_classroom_CC-010,Select/Unselect Feedback Due date & Manual Submission in criteria,"
					+ "TC_Admin_Add_Classroom and Edit_classroom_CC-011,Select/Unselect Manual Submission & Participation all sessions in criteria,"
					+ "TC_Admin_Add_Classroom and Edit_classroom_CC-012,All texts in completion criteria (overall)"
					+ "TC_Admin_Add_Classroom and Edit_classroom_CC-012a,Verify the text in CC -All Sessions,"
					+ "TC_Admin_Add_Classroom and Edit_classroom_CC-012b,Verify the text in CC-Assignment Due date,"
					+ "TC_Admin_Add_Classroom and Edit_classroom_CC-012c,Verify the text in CC-qualification percentage,"
					+ "TC_Admin_Add_Classroom and Edit_classroom_CC-012d,Verify the text in CC-Feedback Due date,"
					+ "TC_Admin_Add_Classroom and Edit_classroom_CC-012e,Verify the text in CC-Manual Submission,"
					+ "TC_Admin_Add_Classroom and Edit_classroom_013,Click Cancel button & logout,"
			)
	public void testClassroom(String row, String strBrowserName) throws IOException {
		driver = BrowserFactory.getBrowser(strBrowserName);
		loginToContentAdmin(driver);
		ClassroomCCSteps ClassroomSteps = new ClassroomCCSteps(driver);
			
		ClassroomSteps.GotoClassroom();
		Reporter.writeSummary("TC_Admin_ 001,Admin Login and open the classroom, " +  ClassroomSteps.getResult() );

//		ClassroomSteps.CClblAllsession();
		ClassroomSteps.GotoEditClassroom();
//		ClassroomSteps.EditCClblAllsession();
		Reporter.writeSummary("TC_Admin_Add_Classroom and Edit_classroom_CC-002,Select/Unselect Participation all sessions in criteria (on Add_Classroom and Edit_classroom), " +  ClassroomSteps.getResult() );

    	ClassroomSteps.CClblAssDuedate();
		ClassroomSteps.GotoEditClassroom();
		ClassroomSteps.EditCClblAssDuedate();
		Reporter.writeSummary("TC_Admin_Add_Classroom and Edit_classroom_CC-003,Select/Unselect Assignment Due date in criteria (on Add_Classroom and Edit_classroom), " +  ClassroomSteps.getResult() );

		ClassroomSteps.CClblQualifyPrecentage();
		ClassroomSteps.GotoEditClassroom();
		ClassroomSteps.EditCClblQualifyPrecentage();
		Reporter.writeSummary("TC_Admin_Add_Classroom and Edit_classroom_CC-004,Select/Unselect Qualifying Score in criteria (on Add_Classroom and Edit_classroom), " +  ClassroomSteps.getResult() );
		
		ClassroomSteps.CClblQualifySinglePrecentage();
		ClassroomSteps.GotoEditClassroom();
		ClassroomSteps.EditCClblQualifySinglePrecentage();
		Reporter.writeSummary("TC_Admin_Add_Classroom and Edit_classroom_CC-004a,The Qualifying Score is allowing the single digit in criteria (on Add_Classroom and Edit_classroom), " +  ClassroomSteps.getResult() );

		ClassroomSteps.CClblFeedbackDuedate();
		ClassroomSteps.GotoEditClassroom();
		ClassroomSteps.EditCClblFeedbackDuedate();
		Reporter.writeSummary("TC_Admin_Add_Classroom and Edit_classroom_CC-005,Select/Unselect Feedback Due date in criteria (on Add_Classroom and Edit_classroom), " +  ClassroomSteps.getResult() );

		ClassroomSteps.CClblManualCompletion();
		ClassroomSteps.GotoEditClassroom();
		ClassroomSteps.EditCClblManualCompletion();
		Reporter.writeSummary("TC_Admin_Add_Classroom and Edit_classroom_CC-006,Select/Unselect Manual Submission in criteria (on Add_Classroom and Edit_classroom), " +  ClassroomSteps.getResult() );

		ClassroomSteps.CClblAllSession_Subdate();
		ClassroomSteps.GotoEditClassroom();
		ClassroomSteps.EditCClblAllSession_Subdate();
		Reporter.writeSummary("TC_Admin_Add_Classroom and Edit_classroom_CC-007,Select/Unselect Participation all sessions & Assignment Due date in criteria (on Add_Classroom and Edit_classroom), " +  ClassroomSteps.getResult() );

		ClassroomSteps.CClblSubdate_Qualify();
		ClassroomSteps.GotoEditClassroom();
		ClassroomSteps.EditCClblSubdate_Qualify();
		Reporter.writeSummary("TC_Admin_Add_Classroom and Edit_classroom_CC-008,Select/Unselect Assignment Due date & Qualifying Score in criteria (on Add_Classroom and Edit_classroom), " +  ClassroomSteps.getResult() );

		ClassroomSteps.CClblQualify_feedbackdate();
		ClassroomSteps.GotoEditClassroom();
		ClassroomSteps.EditCClblQualify_feedbackdate();
		Reporter.writeSummary("TC_Admin_Add_Classroom and Edit_classroom_CC-009,Select/Unselect Qualifying Score & Feedback Due date in criteria (on Add_Classroom and Edit_classroom), " +  ClassroomSteps.getResult() );

		ClassroomSteps.CClblfeedbackdate_Manualcomp();
		ClassroomSteps.GotoEditClassroom();
		ClassroomSteps.EditCClblfeedbackdate_Manualcomp();
		Reporter.writeSummary("TC_Admin_Add_Classroom and Edit_classroom_CC-010,Select/Unselect Feedback Due date & Manual Submission in criteria (on Add_Classroom and Edit_classroom), " +  ClassroomSteps.getResult() );

		ClassroomSteps.CClblManualcomp_Allsession();
		ClassroomSteps.GotoEditClassroom();
		ClassroomSteps.EditCClblManualcomp_Allsession();
		Reporter.writeSummary("TC_Admin_Add_Classroom and Edit_classroom_CC-011,Select/Unselect Manual Submission & Participation all sessions in criteria (on Add_Classroom and Edit_classroom), " +  ClassroomSteps.getResult() );

		//Overall Completion Criteria text
		ClassroomSteps.verifyCCTexts(); 
		ClassroomSteps.GotoEditClassroom();
		ClassroomSteps.verifyEditCCTexts(); 
		Reporter.writeSummary("TC_Admin_Add_Classroom and Edit_classroom_CC-012,Verify ALL the Completion Criteria texts (on Add_Classroom and Edit_classroom), " +  ClassroomSteps.getResult() );


		// For all the five individual CC texts
//		ClassroomSteps.verifyCCsessionLabels();
		ClassroomSteps.GotoEditClassroom();
		ClassroomSteps.verifyEditCCsessionLabels();
		Reporter.writeSummary("TC_Admin_Add_Classroom and Edit_classroom_CC-012a,Verify the text in CC -All Sessions (on Add_Classroom and Edit_classroom), " +  ClassroomSteps.getResult() );

		ClassroomSteps.verifyCCAssDuedateLabels();
		ClassroomSteps.GotoEditClassroom();
		ClassroomSteps.verifyEditCCAssDuedateLabels();
		Reporter.writeSummary("TC_Admin_Add_Classroom and Edit_classroom_CC-012b,Verify the text in CC-Assignment Due date (on Add_Classroom and Edit_classroom), " +  ClassroomSteps.getResult() );

		ClassroomSteps.verifyCCQualifyPrecentageLabels();
		ClassroomSteps.GotoEditClassroom();
		ClassroomSteps.verifyEditCCQualifyPrecentageLabels();
		Reporter.writeSummary("TC_Admin_Add_Classroom and Edit_classroom_CC-012c,Verify the text in CC-qualification percentage (on Add_Classroom and Edit_classroom), " +  ClassroomSteps.getResult() );

		ClassroomSteps.verifyCCFeedbackDuedateLabels();
		ClassroomSteps.GotoEditClassroom();
		ClassroomSteps.verifyEditCCFeedbackDuedateLabels();
		Reporter.writeSummary("TC_Admin_Add_Classroom and Edit_classroom_CC-012d,Verify the text in CC-Feedback Due date (on Add_Classroom and Edit_classroom), " +  ClassroomSteps.getResult() );

		ClassroomSteps.verifyCCManualCompletionLabels();
		ClassroomSteps.GotoEditClassroom();
		ClassroomSteps.verifyEditCCManualCompletionLabels();
		Reporter.writeSummary("TC_Admin_Add_Classroom and Edit_classroom_CC-012e,Verify the text in CC-Manual Submission (on Add_Classroom and Edit_classroom), " +  ClassroomSteps.getResult() );

		ClassroomSteps.Clicklogout();
		Reporter.writeSummary("TC_Admin_Add_Classroom_013,Click Cancel button & Logout, " +  ClassroomSteps.getResult() );
	}
}