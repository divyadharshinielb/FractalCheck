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
	
	//Created by Vignesh(WVI) on 04-Oct-19 & Updated on 17-Oct-19 
		@Test(dataProviderClass=DataManager.class, dataProvider = "browers", groups = { "Phase1.0" }, enabled = true, 
				description = "TC_Admin_Classroom_CC_ 01 - 04: Completion criteria Test cases")
		public void testClassroom(String row, String strBrowserName) throws IOException {
			driver = BrowserFactory.getBrowser(strBrowserName);
			loginToContentAdmin(driver);
			ClassroomCCSteps ClassroomCCSteps = new ClassroomCCSteps(driver);
			MenuSteps menuSteps = new MenuSteps(driver);
			menuSteps.clickMenu();
			menuSteps.gotoClassroomCreation();
			
			//Add classroom
			ClassroomCCSteps.addClassroomCClblSelection();
			Reporter.writeSummary("TC_Admin_Add_Classroom_CC-01,Select/Unselect the Completion Criteria _ All Sessions _ Assignment Due date_ Qualify Score _Feedback Due date_ Manual submission, " +  ClassroomCCSteps.getResult() );
			
			//Edit classroom
			ClassroomCCSteps.editClassroomCClblSelection();
			Reporter.writeSummary("TC_Admin_Edit_classroom_CC-02,Select/Unselect the Completion Criteria _ All Sessions _ Assignment Due date_ Qualify Score _Feedback Due date_ Manual submission, " +  ClassroomCCSteps.getResult() );
			
			//Add classroom text verification
			ClassroomCCSteps.verifyAddClassroomCCLabelstxt();
			Reporter.writeSummary("TC_Admin_Add_Classroom _CC-03,Verify the Completion Criteria texts in add classroom -CC-All Sessions -CC-Assignment Due date -CC-qualification percentage -CC-Feedback Due date -CC-Manual Submission, " +  ClassroomCCSteps.getResult() );

			//Edit classroom text verification
			ClassroomCCSteps.verifyEditClassroomCCLabelstxt(); 
			Reporter.writeSummary("TC_Admin_Edit_classroom_CC-04,Verify ALL the Completion Criteria texts in Edit classroom -CC-All Sessions -CC-Assignment Due date -CC-qualification percentage -CC-Feedback Due date -CC-Manual Submission, " +  ClassroomCCSteps.getResult() );
			
		}	}
