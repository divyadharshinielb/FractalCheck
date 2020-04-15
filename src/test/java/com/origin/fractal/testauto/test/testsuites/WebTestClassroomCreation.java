package com.origin.fractal.testauto.test.testsuites;



import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.origin.fractal.testauto.steps.ClassroomSteps;
import com.origin.fractal.testauto.steps.MenuSteps;
import com.origin.fractal.testauto.test.FractalBaseWebTest;
import com.wv.auto.framework.BrowserFactory;
import com.wv.auto.framework.utils.Reporter;

public class WebTestClassroomCreation extends FractalBaseWebTest {
	@DataProvider
	public  Object[][] browers() {
		return new Object[][] {
			new Object[] { "1", "chrome" }
//		, new Object[] { "2", "firefox" }
//		, new Object[] { "3", "msedge" } 
//		 new Object[] { "4", "ie11" }
		};
	}
	@Test(dataProvider = "browers", groups= {"pilot"}, enabled= true, description="")
	public void testVerifyClassroomCreation(String row, String strBrowserName) throws IOException {
	
		driver = BrowserFactory.getBrowser(strBrowserName);
		loginToContentAdmin(driver);
		MenuSteps menuSteps = new MenuSteps(driver);
		Reporter.writeSummary("TCID_CLASS_001, Verify clicking the Classroom icon displays the Classroom page, " +  menuSteps.getResult() );
		menuSteps.clickMenu();
//		Reporter.writeSummary("TCID_CLASS_002, Verify whether Admin should be able to view the CLASS ROOM page , " +  menuSteps.getResult() );
		menuSteps.gotoClassroomCreation();
		Reporter.writeSummary("TCID_CLASS_003, Verify clicking the Add Classroom button displays Classroom creation page , " +  menuSteps.getResult() );
		ClassroomSteps cSteps=new ClassroomSteps(driver);
		cSteps.fieldValidation();
		Reporter.writeSummary("TCID_CLASS_004, Verify the Search functionality in View Classroom page without applying filters," +  cSteps.getResult() );
		Reporter.writeSummary("TCID_CLASS_008, Verify the Search functionality in View Classroom page with applying filters,"+ cSteps.getResult() );
		cSteps.addClassroomPage();
     // Reporter.writeSummary("TCID_CLASS_005, Verify whether Admin should be able to view the Classroom creation pop-up page," +  cSteps.getResult() );
        cSteps.cautionAlertsForMandatoryFields();
        Reporter.writeSummary("TCID_CLASS_006, Verify the caution alerts for mandatory fields.," +  cSteps.getResult() );
        Reporter.writeSummary("TCID_CLASS_016, Verify the caution alerts for all the fields," +  cSteps.getResult() );
        cSteps.cautionAlertsForClassroomTitle();
        Reporter.writeSummary("TCID_CLASS_NEW_01, Verify whether Admin should be able to view the caution alerts for ClassroomTitle," +  cSteps.getResult() );
         cSteps.cautionAlertsForClassroomVenue();
         Reporter.writeSummary("TCID_CLASS_NEW_02, Verify whether Admin should be able to view the caution alerts for ClassroomVenue," +  cSteps.getResult() );
         cSteps.cautionAlertsForCategorySelection();
         Reporter.writeSummary("TCID_CLASS_NEW_03, Verify whether Admin should be able to view the caution alerts for CategorySelection," +  cSteps.getResult() );
         cSteps.cautionAlertsForClassroomDescription();
         Reporter.writeSummary("TCID_CLASS_NEW_04, Verify whether Admin should be able to view the caution alerts for ClassroomDescription," +  cSteps.getResult() );
         cSteps.cautionAlertsForSkillsetSelection();
         Reporter.writeSummary("TCID_CLASS_NEW_05, Verify whether Admin should be able to view the caution alerts for SkillsetSelection," +  cSteps.getResult() );
         cSteps.cautionAlertsForInstructorSelection();
         Reporter.writeSummary("TCID_CLASS_NEW_06, Verify whether Admin should be able to view the caution alerts for InstructorSelection," +  cSteps.getResult() );
        cSteps.titleAcceptsCharater(); 
        Reporter.writeSummary("TCID_CLASS_007, Verify the Title field accepts only more than 4 characters.," +  cSteps.getResult() );
  //    cSteps.completionCriteriaCheckUncheck();
        cSteps.singleAndMultiInstructor();
        Reporter.writeSummary("TCID_CLASS_014, Verify whether the Admin should be able to view drop-down for Single Instructor and selection box for Multiple Instructors," +  cSteps.getResult() );
      cSteps.classroomPageInformation();
        Reporter.writeSummary("TCID_CLASS_028, Verify the user is able to view the Classroom details of a  Classroom," +  cSteps.getResult() );
	}
        
		@Test(dataProvider = "browers", groups = { "pilot"}, enabled = false,description="")
    	public void testClassroomCreation(String row, String strBrowserName) throws IOException {
    	
    		driver = BrowserFactory.getBrowser(strBrowserName);
    		loginToContentAdmin(driver);
    		MenuSteps menuSteps = new MenuSteps(driver);   
    		menuSteps.clickMenu();
    		menuSteps.gotoClassroomCreation();
    		ClassroomSteps cSteps=new ClassroomSteps(driver);
    		cSteps.addClassroomPage();
    		cSteps.cautionAlertsForMandatoryFields();
    		
    	cSteps.durationNumericValue();
        Reporter.writeSummary("TCID_CLASS_019,Verify whether the Admin should be able to add duration," +  cSteps.getResult() );
       cSteps.surveyLinks();
        Reporter.writeSummary("TCID_CLASS_022,Verify whether the Admin must be able to add the links in the given field," +  cSteps.getResult() );
        cSteps.preEventValidateFields();
       Reporter.writeSummary("TCID_CLASS_020,Verify whether the  Admin should be able to fill the valid fields," +  cSteps.getResult() );
       cSteps.postEventValidateFields();
       Reporter.writeSummary("TCID_CLASS_021,Verify whether the  Admin should be the same type fields of TC20 should be done for Pre-Event Assignment & Post-Event Assignment," +  cSteps.getResult() );
       cSteps.verifySessionTab();
        Reporter.writeSummary("TCID_CLASS_015,Verify whether the  Admin should be able to view the Sessions tab on filling all the details," +  cSteps.getResult() );
      cSteps.editClassroomPage();
        Reporter.writeSummary("TCID_CLASS_025, Verify whether admin should be able to edit the classroom listing page," +  cSteps.getResult() );
        cSteps.deleteClassroomPage();
        Reporter.writeSummary("TCID_CLASS_026, Verify whether admin should be able to Delete the classroom listing page," +  cSteps.getResult() );
	    cSteps.addEventPage();
	    Reporter.writeSummary("TCID_CLASS_027, Verify whether Admin must be able to perform Add Event Edit Classroom and Delete Classroom by clicking on its icons," +  cSteps.getResult() );
	    cSteps.eventPageValidation();
	    Reporter.writeSummary("TCID_CLASS_029, Verify whether Admin must be able to view  the completion criteria page," +  cSteps.getResult() );
	    cSteps.classroomListedPage();
	    cSteps.eventListedPage();
	    Reporter.writeSummary("TCID_CLASS_030, Verify whether Admin must be able to view the created EVENT and information," +  cSteps.getResult() );
	 }
}
