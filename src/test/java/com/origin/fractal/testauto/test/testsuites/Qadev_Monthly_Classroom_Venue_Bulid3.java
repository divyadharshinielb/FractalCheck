package com.origin.fractal.testauto.test.testsuites;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.origin.fractal.testauto.DataManager;
import com.origin.fractal.testauto.steps.ClassroomCCSteps;
import com.origin.fractal.testauto.steps.ClassroomSteps;
import com.origin.fractal.testauto.steps.MenuSteps;
import com.origin.fractal.testauto.steps.VenueSteps;
import com.origin.fractal.testauto.test.FractalBaseWebTest;
import com.wv.auto.framework.BrowserFactory;
import com.wv.auto.framework.utils.Reporter;

public class Qadev_Monthly_Classroom_Venue_Bulid3 extends FractalBaseWebTest {

		@Test(dataProviderClass=DataManager.class, dataProvider = "browers", groups= {"pilot"}, priority=1,enabled= true, description = "Venue creation")
		public void ClassroomVenu(String row, String strBrowserName) throws Exception  {
			driver = BrowserFactory.getBrowser(strBrowserName);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			//MyScreenRecorder.startRecording("navigationTest");
			loginToContentAdmin(driver);
			VenueSteps venueSteps = new VenueSteps(driver);
			venueSteps.clickHomeMenu();
			js.executeScript("window.scrollBy(0,1000)");
			venueSteps.clickMenu();
			Reporter.writeSummary("Venue_001, Verify the navigation to the Menu page., " +  venueSteps.getResult() );
			venueSteps.createVenue();
			Reporter.writeSummary("Venue_002, Verify the Venue page., " +  venueSteps.getResult() );
			venueSteps.countrySelection();
			Reporter.writeSummary("Venue_006, Verify the country-selection in Add Venue page, " +  venueSteps.getResult() );
			venueSteps.citySelection();
			Reporter.writeSummary("Venue_007, Verify  that  City should be enabled  after selecting the Country," +  venueSteps.getResult() );
			venueSteps.validBuildingName();
			Reporter.writeSummary("Venue_008, Verify Venue with valid Building Block name., " +  venueSteps.getResult() );
			venueSteps.validVenueName();	
			Reporter.writeSummary("Venue_004, Verify Venue creation with valid name, " +  venueSteps.getResult() );
			venueSteps.validStreetName();
			Reporter.writeSummary("Venue_010, Verify Venue creation with valid street name," +  venueSteps.getResult() );
			venueSteps.mandatoryCheck();
			Reporter.writeSummary("Venue_003, Verify Venue creation for mandatory fields, " +  venueSteps.getResult() );
			venueSteps.saveButton();
		//	MyScreenRecorder.stopRecording();
			Reporter.writeSummary("Venue_012, Verify Venue is submitted.," +  venueSteps.getResult() );	
		}
		@Test(dataProviderClass=DataManager.class, dataProvider = "browers", groups= {"pilot"},priority=0, enabled= true, description = "Venue creation")
		public void invalidTests(String row, String strBrowserName) throws IOException  {
			driver = BrowserFactory.getBrowser(strBrowserName);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			VenueSteps venueSteps = new VenueSteps(driver);
			loginToContentAdmin(driver);
			//VenueSteps venueSteps = new VenueSteps(driver);
			venueSteps.clickHomeMenu();
			js.executeScript("window.scrollBy(0,1000)");
			venueSteps.clickMenu();
		venueSteps.invalidValidVenue();
		Reporter.writeSummary("Venue_005, Verify Venue creation with invalid venue., " +  venueSteps.getResult() );
		venueSteps.invalidBuildingName(); //11/5/2020
		Reporter.writeSummary("Venue_009, Verify Venue creation with blank building block name," +  venueSteps.getResult() );
		venueSteps.invalidStreetName();  //11/5/2020
		Reporter.writeSummary("Venue_011, Verify Venue creation with blank street area ," +  venueSteps.getResult() );
		venueSteps.cancelButton();       //11/5/2020
		Reporter.writeSummary("Venue_013, Verify the cancellation of Venue details on clicking Cancel button," +  venueSteps.getResult() );
		venueSteps.searchFunction();     //11/5/2020
		Reporter.writeSummary("Venue_014, Verify the Search functionality, " +  venueSteps.getResult() );
		venueSteps.editVenue();
		Reporter.writeSummary("Venue_016, verify whether the admin is able to edit the venue by clicking the edit icon., " +  venueSteps.getResult() );
		venueSteps.deleteVenue();
		Reporter.writeSummary("Venue_015, verify whether the admin is able to delete the venue by clicking the delete icon., " +  venueSteps.getResult() );
		}
		@Test(dataProviderClass = DataManager.class,dataProvider="browers", groups= {"pilot"}, enabled= true, description="")
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
	@Test(dataProviderClass = DataManager.class,dataProvider="browers", groups= {"pilot"}, enabled= true, description="")
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
	@Test(dataProviderClass=DataManager.class, dataProvider = "browers", groups = { "Phase1.0" }, enabled = true, priority=0,
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
//		Reporter.writeSummary("Admin_CompletionCriteria_TC-001,Select/Unselect Participation all sessions in criteria (on Add/Edit_classroom)," +  ClassroomSteps.getResult() );
		Reporter.writeSummary("Admin_CompletionCriteria_TC-001,Select/Unselect the completeion criteria (on Add/Edit_classroom)," +  ClassroomSteps.getResult() );

		ClassroomSteps.CClblAssDuedate();
		ClassroomSteps.GotoEditClassroom();
		ClassroomSteps.EditCClblAssDuedate();
		Reporter.writeSummary("Admin_CompletionCriteria_TC-002,Select/Unselect Assignment Due date in criteria (on Add/Edit_classroom)," +  ClassroomSteps.getResult() );
		
//		ClassroomSteps.GotoEditClassroom();
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
//		ClassroomSteps.GotoEditClassroom();
		ClassroomSteps.verifyCCAssDuedateLabels();
		ClassroomSteps.GotoEditClassroom();
		ClassroomSteps.verifyEditCCAssDuedateLabels();
		Reporter.writeSummary("Admin_CompletionCriteria_TC-012,Verify the text in CC-Assignment Due date (on Add/Edit_classroom)," +  ClassroomSteps.getResult() );

		ClassroomSteps.verifyCCQualifyPrecentageLabels();
		ClassroomSteps.GotoEditClassroom();
		ClassroomSteps.verifyEditCCQualifyPrecentageLabels();
		Reporter.writeSummary("Admin_CompletionCriteria_TC-013,Verify the text in CC-qualification percentage (on Add/Edit_classroom)," +  ClassroomSteps.getResult() );
		
//		ClassroomSteps.GotoEditClassroom();
		ClassroomSteps.verifyCCFeedbackDuedateLabels();
		ClassroomSteps.GotoEditClassroom();
		ClassroomSteps.verifyEditCCFeedbackDuedateLabels();
		Reporter.writeSummary("Admin_CompletionCriteria_TC-014,Verify the text in CC-Feedback Due date (on Add/Edit_classroom)," +  ClassroomSteps.getResult() );

		ClassroomSteps.verifyCCManualCompletionLabels();
		ClassroomSteps.GotoEditClassroom();
		ClassroomSteps.verifyEditCCManualCompletionLabels();
		Reporter.writeSummary("Admin_CompletionCriteria_TC-015,Verify the text in CC-Manual Submission (on Add/Edit_classroom)," +  ClassroomSteps.getResult() );

//		ClassroomSteps.Clicklogout();
//		Reporter.writeSummary("TC_Admin_Add_Classroom_013,Click Cancel button & Logout, " +  ClassroomSteps.getResult() ); //commented on 25-Nov-20
	}
}

