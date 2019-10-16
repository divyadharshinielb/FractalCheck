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

	//Added by Vignesh (WVI) on 04-Oct-19 & Updated on 14-Oct-19 
		@Test(dataProviderClass=DataManager.class, dataProvider = "browers", groups = { "Phase1.0" }, enabled = true, 
				description = "TC_Admin_Classroom_CC_ 001 - 023: For Completion criteria Test case"

				)
		public void testClassroom(String row, String strBrowserName) throws IOException {
			driver = BrowserFactory.getBrowser(strBrowserName);
			loginToContentAdmin(driver);
			ClassroomCCSteps ClassroomCCSteps = new ClassroomCCSteps(driver);
			MenuSteps menuSteps = new MenuSteps(driver);
			menuSteps.clickMenu();
			menuSteps.gotoClassroomCreation();
			Reporter.writeSummary("TC_Admin_ 001,Admin Login and open the classroom, " +  menuSteps.getResult() );
			//Addclassroom
			/*ClassroomCCSteps.verifyCCsessionLabels();
			Reporter.writeSummary("TC_Admin_Add_Classroom _CC-024a,Verify the text in CC -All Sessions, " +  ClassroomCCSteps.getResult() );
			ClassroomCCSteps.verifyCCAssDuedateLabels();
			Reporter.writeSummary("TC_Admin_Add_Classroom _CC-024b,Verify the text in CC-Assignment Due date, " +  ClassroomCCSteps.getResult() );
			ClassroomCCSteps.verifyCCQualifyPrecentageLabels();
			Reporter.writeSummary("TC_Admin_Add_Classroom _CC-024c,Verify the text in CC-qualification percentage, " +  ClassroomCCSteps.getResult() );
			ClassroomCCSteps.verifyCCFeedbackDuedateLabels();
			Reporter.writeSummary("TC_Admin_Add_Classroom _CC-024d,Verify the text in CC-Feedback Due date, " +  ClassroomCCSteps.getResult() );
			ClassroomCCSteps.verifyCCManualCompletionLabels();
			Reporter.writeSummary("TC_Admin_Add_Classroom _CC-024e,Verify the text in CC-Manual Submission, " +  ClassroomCCSteps.getResult() );
			ClassroomCCSteps.verifyCCTexts();
			Reporter.writeSummary("TC_Admin_Add_Classroom _CC-024(overall),Verify ALL the Completion Criteria texts in add classroom, " +  ClassroomCCSteps.getResult() );
			*/
			//Editclassroom text verification
			/*ClassroomCCSteps.verifyEditCCsessionLabels();
			Reporter.writeSummary("TC_Admin_Edit_classroom_CC-025a,Verify the text in CC -All Sessions," +  ClassroomCCSteps.getResult() );
			ClassroomCCSteps.verifyEditCCAssDuedateLabels();
			Reporter.writeSummary("TC_Admin_Edit_classroom_CC-025b,Verify the text in CC-Assignment Due date, " +  ClassroomCCSteps.getResult() );
			ClassroomCCSteps.verifyEditCCQualifyPrecentageLabels();
			Reporter.writeSummary("TC_Admin_Edit_classroom_CC-025c,Verify the text in CC-qualification percentage, " +  ClassroomCCSteps.getResult() );
			ClassroomCCSteps.verifyEditCCFeedbackDuedateLabels();
			Reporter.writeSummary("TC_Admin_Edit_classroom_CC-025d,Verify the text in CC-Feedback Due date, " +  ClassroomCCSteps.getResult() );
			ClassroomCCSteps.verifyEditCCManualCompletionLabels();
			Reporter.writeSummary("TC_Admin_Edit_classroom_CC-025e,Verify the text in CC-Manual Submission, " +  ClassroomCCSteps.getResult() );
			ClassroomCCSteps.verifyEditCCTexts(); 
			Reporter.writeSummary("TC_Admin_Edit_classroom_CC-025(overall),Verify ALL the Completion Criteria texts in Edit classroom, " +  ClassroomCCSteps.getResult() );
			*/ 

			ClassroomCCSteps.verifyCCsessionLabels();
			ClassroomCCSteps.verifyCCAssDuedateLabels();
			ClassroomCCSteps.verifyCCQualifyPrecentageLabels();
			ClassroomCCSteps.verifyCCFeedbackDuedateLabels();
			ClassroomCCSteps.verifyCCManualCompletionLabels();
			ClassroomCCSteps.verifyCCTexts();
			Reporter.writeSummary("TC_Admin_Add_Classroom _CC-024,Verify the Completion Criteria texts in add classroom -CC-All Sessions -CC-Assignment Due date -CC-qualification percentage -CC-Feedback Due date -CC-Manual Submission, " +  ClassroomCCSteps.getResult() );

			//Editclassroom text verification
			ClassroomCCSteps.verifyEditCCsessionLabels();
			ClassroomCCSteps.verifyEditCCAssDuedateLabels();
			ClassroomCCSteps.verifyEditCCQualifyPrecentageLabels();
			ClassroomCCSteps.verifyEditCCFeedbackDuedateLabels();
			ClassroomCCSteps.verifyEditCCManualCompletionLabels();
			ClassroomCCSteps.verifyEditCCTexts(); 
			Reporter.writeSummary("TC_Admin_Edit_classroom_CC-025,Verify ALL the Completion Criteria texts in Edit classroom -CC-All Sessions -CC-Assignment Due date -CC-qualification percentage -CC-Feedback Due date -CC-Manual Submission, " +  ClassroomCCSteps.getResult() );
			ClassroomCCSteps.Clicklogout();
			Reporter.writeSummary("TC_Admin_026,Click My account & Logout, " +  ClassroomCCSteps.getResult() );
		}
		//End - Vignesh (WVI) on 04-Oct-19 & Updated on 15-Oct-19 
	}
