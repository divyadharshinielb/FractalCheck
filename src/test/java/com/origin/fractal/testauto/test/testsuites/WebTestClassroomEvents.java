package com.origin.fractal.testauto.test.testsuites;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.origin.fractal.testauto.steps.ClassroomEventSteps;
import com.origin.fractal.testauto.steps.ManageContentSteps;
import com.origin.fractal.testauto.steps.MenuSteps;
import com.origin.fractal.testauto.test.FractalBaseWebTest;
import com.wv.auto.framework.BrowserFactory;
import com.wv.auto.framework.utils.MyScreenRecorder;
import com.wv.auto.framework.utils.Reporter;

public class WebTestClassroomEvents extends FractalBaseWebTest{
	@DataProvider
	public Object[][] browers() {
		return new Object[][] {
			new Object[] { "1", "chrome" }
//		, new Object[] { "2", "firefox" }
//		, new Object[] { "3", "msedge" } 
//		 new Object[] { "4", "ie11" }
		};
	}
	//Event
	@Test(dataProvider = "browers", groups= {"pilot"}, enabled= false, 
			description="TCID_01:"
			+ "TCID_01: Verify Add new event page is opened on clicking the Ads Event button"
			+ "TCID_02: Verify on clicking SAVE, throws the alert for all mandatory fields"
			+ "TCID_03: Verify whether the alert is thrown, when Venue dropdown is not selected."
			+ "TCID_04: Verify whether the alert is thrown, when Venue dropdown is not selected."
			+ "TCID_05: Verify whether the alert is thrown, when Link dropdown is not selected."
			+ "TCID_06: Verify whether the alert is thrown, when an Average score is not entered."
			+ "TCID_07: Verify whether the alert is thrown, when the Start Time is not entered under sessions"
			+ "TCID_08: Verify whether the alert is thrown, when the End Time is not entered under sessions"
			+ "TCID_09: Verify whether the alert is thrown, when the Instructor drop-down is not selected under sessions"
			+ "TCID_10: Verify whether the error message is disappered after Classroom selecting any of the classroom type.")
	public void verifyEvents(String row, String strBrowserName) throws Exception {
		driver = BrowserFactory.getBrowser(strBrowserName);
		loginToContentAdmin(driver);
		
		MenuSteps menuSteps = new MenuSteps(driver);
		MyScreenRecorder.startRecording("navigationTest");
		menuSteps.clickMenu();
		//Test moves to Manage Contents page
		menuSteps.gotoClassroomCreation();
		ClassroomEventSteps classSteps = new ClassroomEventSteps(driver);
		//To click on a particular classroom item
		classSteps.clickOnClassroomItem();
		Reporter.writeSummary("TCID_Event_001,  Verify Add new event page is opened on clicking the Add Event icon, " +  classSteps.getResult() );
		//TCID_01: Verify Add new event page is opened on clicking the Ads Event button
		classSteps.verifyAddEventPageOpened();
		Reporter.writeSummary("TCID_Event_002,  Verify on clicking SAVE throws the alert for all mandatory fields, " +  classSteps.getResult() );
		//TCID_02: Verify on clicking SAVE, throws the alert for all mandatory fields
		classSteps.verifyAlertForAllFieldsInPage1();
		Reporter.writeSummary("TCID_Event_003,  Verify whether the alert is thrown when provider drop-down is not selected, " +  classSteps.getResult() );
	  //Reporter.writeSummary("TCID_Event_29,  Verify on clicking SAVE throws the alert for all mandatory fields, " +  classSteps.getResult() );
		//TCID_03: Verify whether the alert is thrown, when Venue drop-down is not selected.
		//29:Verify on clicking SAVE, throws the alert for all mandatory fields
	//	classSteps.verifySelectClassroomTypeAlertMsg();
		//TCID_04: Verify whether the alert is thrown, when Venue drop-down is not selected.
		classSteps.verifySelectVenueDropdownAlertMsg();
		Reporter.writeSummary("TCID_Event_04,  Verify whether the alert is thrown when Venue drop-down is not selected, " +  classSteps.getResult() );
		//TCID_05: Verify whether the alert is thrown, when Link drop-down is not selected.
		classSteps.verifySelectLinkDropdownAlertMsg();
		Reporter.writeSummary("TCID_Event_05,  Verify whether the alert is thrown when Link drop-down is not selected, " +  classSteps.getResult() );
		//TCID_06: Verify whether the alert is thrown, when an Average score is not entered.
	/*	classSteps.verifyAverageScoreAlertMsg();
		//TCID_07: Verify whether the alert is thrown, when the Start Time is not entered under sessions
   */	classSteps.verifySessionStartTimeAlertMsg();
        Reporter.writeSummary("TCID_Event_008,  Verify whether the alert is thrown when the End Time is not entered under sessions, " +  classSteps.getResult() );
		//TCID_08: Verify whether the alert is thrown, when the End Time is not entered under sessions
		classSteps.verifySessionEndTimeAlertMsg();
		Reporter.writeSummary("TCID_Event_009,  Verify whether the alert is thrown when the Instructor drop-down is not selected under sessions, " +  classSteps.getResult() );
		//TCID_09: Verify whether the alert is thrown, when the Instructor drop-down is not selected under sessions
		classSteps.verifySelectInstrtuctorAlertMsg();
		Reporter.writeSummary("TCID_Event_010,  Verify whether the error message is disappeared after Classroom selecting any of the classroom type, " +  classSteps.getResult() );
		//TCID_10: Verify whether the error message is disappeared after Classroom selecting any of the classroom type.
		classSteps.verifySelectInstrtuctorAlertMsgDisappears();
		MyScreenRecorder.stopRecording();
		wait(10);
		menuSteps.logout();
	}
	
	@Test(dataProvider = "browers", groups= {"pilot"}, enabled= false, 
			description="TCID_01:"
			+ "TCID_11: Verify whether the Venue drop-down is displayed after selecting Physical classroom"
			+ "TCID_12: Verify whether the Link drop-down is displayed after selecting Virtual classroom"
			+ "TCID_13: Verify whether the Venue drop-down alert is disappeared after selecting any Venue "
			+ "TCID_14: Verify whether the Link drop-down alert is disappeared after selecting any Link "
			+ "TCID_15: Verify whether the show map check-box is displayed under Select Venue dropdown"
			+ "TCID_16: Verify whether the Show map check-box is enabled on clicking Show map"
			+ "TCID_17: Verify whether the Show map check-box is disabled on clicking Show map"
			+ "TCID_18: Verify whether the timezone alert is disappeared after slecting any Time Zone"
			+ "TCID_19: Verify Whether the average score alert disappear after entering the score"
			+"TCID_20: Verify whether the Average score accepts alphabets"
			+ "TCID_21: Verify whether the Average score accepts Special characters"
			+ "TCID_22: Verify whether the Average score accepts Alpha numerics"
			+ "TCID_23: Verify whether the Average score accepts accepts more than 2 digis")
 	public void verifyEvents1(String row, String strBrowserName) throws Exception {
		driver = BrowserFactory.getBrowser(strBrowserName);
		loginToContentAdmin(driver);
		
		
		MenuSteps menuSteps = new MenuSteps(driver);
		MyScreenRecorder.startRecording("navigationTest");
		menuSteps.clickMenu();
		//Test moves to Manage Contents page
		menuSteps.gotoClassroomCreation();
		ClassroomEventSteps classSteps = new ClassroomEventSteps(driver);
		//To click on a particular classroom item
		classSteps.clickOnClassroomItem();
		Reporter.writeSummary("TCID_Event_011,  Verify whether the Venue drop-down is displayed after selecting Physical classroom, " +  classSteps.getResult() );
		//TCID_11: Verify whether the Venue drop-down is displayed after selecting Physical classroom
		classSteps.verifyPhysicalClassroomDropdown();
		Reporter.writeSummary("TCID_Event_012,  Verify whether the Link drop-down is displayed after selecting Virtual classroom, " +  classSteps.getResult() );
		//TCID_12: Verify whether the Link drop-down is displayed after selecting Virtual classroom
		classSteps.verifyVirtualClassroomDropdown();
		Reporter.writeSummary("TCID_Event_013,  Verify whether the Venue drop-down alert is disappeared after selecting any Venue , " +  classSteps.getResult() );
		//TCID_13: Verify whether the Venue drop-down alert is disappeared after selecting any Venue 
		classSteps.verifyVenueDropdownAlertDisappears();
		Reporter.writeSummary("TCID_Event_014,  Verify whether the Link drop-down alert is disappeared after selecting any Link, " +  classSteps.getResult() );
		//TCID_14: Verify whether the Link drop-down alert is disappeared after selecting any Link 
		classSteps.verifyLinkDropdownAlertDisappears();
		Reporter.writeSummary("TCID_Event_015,  Verify whether the show map check-box is displayed under Select Venue dropdown, " +  classSteps.getResult() );
		//TCID_15: Verify whether the show map check-box is displayed under Select Venue dropdown
//  	classSteps.verifyShowmapCheckbox();
		//TCID_16: Verify whether the Show map check-box is enabled on clicking Show map
//		classSteps.verifyShowmapCheckboxChecked();
		//TCID_17: Verify whether the Show map check-box is disabled on clicking Show map
//		classSteps.verifyShowmapCheckboxUnchecked();
		//TCID_18: Verify whether the timezone alert is disappeared after slecting any Time Zone
		classSteps.verifyTimezoneAlertDisappeared();
		Reporter.writeSummary("TCID_Event_019,   Verify Whether the average score alert disappear after entering the score, " +  classSteps.getResult() );
		//TCID_19: Verify Whether the average score alert disappear after entering the score
/*	classSteps.verifyAvgScoreAlertDisappears();
		//TCID_20: Verify whether the Average score accepts alphabets
		classSteps.verifyAvgScoreAcceptsAlphabets();
		//TCID_21: Verify whether the Average score accepts Special characters
		classSteps.verifyAvgScoreAcceptsSpecialChars();
		//TCID_22: Verify whether the Average score accepts Alpha numerics
		classSteps.verifyAvgScoreAcceptsAlphanumeric();
		//TCID_23: Verify whether the Average score accepts accepts more than 2 digis
		classSteps.verifyAvgScoreAcceptsMoretha2DIgits();
		
	*/	classSteps.closeLobjModel();
	MyScreenRecorder.stopRecording();
		wait(10);
		menuSteps.logout();
	}
	@Test(dataProvider = "browers", groups= {"pilot"}, enabled= false, 
			description="TCID_01:"
			+ "TCID_24: Verify whether the Assignment details are displayed when clicking assignments label"
			+ "TCID_25: Verify whether the assignment count maches with the number of assignments displayed"
			+ "TCID_26: Verify whether the Add Assignment button is displayed after expanding Assignments"
			+ "TCID_27: Verify whether the new assignment details fields are displayed after clicking the Add Assignment Button"
			+ "TCID_28: Verify Whether the Add survey details are displayed after clicking Survey label"
			+ "TCID_29: Verify whether the Add Survey button is displayed after expanding Survey"
			+ "TCID_30: Verify whether the new Survey form details fields are displayed after clicking the Add Assignment Button"
			+ "TCID_31: Verify Whether the Session details are displayed after clicking Session label"
			+ "TCID_32: Verify whether the error message is displayed if the instructor name is not selected from drop-down"
			+ "TCID_33: Verify whether the error message is disappeared after selecting any instructor from drop-down"
			+ "TCID_34: Verify whether the Assignment details are displayed when clicking Post event assignments label"
			+ "TCID_35: Verify whether the post event assignment count matches with the number of assignments displayed"
			+ "TCID_36: Verify whether the Add Assignment button is displayed after expanding Assignments under post event"
			+ "TCID_37: Verify whether the new assignment details fields are displayed after clicking the Add Assignment Button under post event"
			+ "TCID_38: Verify Whether the Add survey details are displayed after clicking Survey label under post event"
			+ "TCID_39: Verify whether the Add Survey button is displayed after expanding Survey under post event"
			+ "TCID_40: Verify whether the new Survey form details fields are displayed after clicking the Add Assignment Button under post event")
	public void verifyEvents2(String row, String strBrowserName) throws Exception {
		driver = BrowserFactory.getBrowser(strBrowserName);
		loginToContentAdmin(driver);
		
		MenuSteps menuSteps = new MenuSteps(driver);
		MyScreenRecorder.startRecording("navigationTest");
		menuSteps.clickMenu();
		//Test moves to Manage Contents page
		menuSteps.gotoClassroomCreation();
		ClassroomEventSteps classSteps = new ClassroomEventSteps(driver);
		//To click on a particular classroom item
		classSteps.clickOnClassroomItem();
		Reporter.writeSummary("TCID_Event_024,   Verify whether the Assignment details are displayed when clicking assignments label, " +  classSteps.getResult() );
		//TCID_24: Verify whether the Assignment details are displayed when clicking assignments label
		classSteps.verifyAssignDetailsDisplayed();
		Reporter.writeSummary("TCID_Event_025,  Verify whether the assignment count maches with the number of assignments displayed, " +  classSteps.getResult() );
		//TCID_25: Verify whether the assignment count maches with the number of assignments displayed
		classSteps.verifyPreAssessmentCount();
		Reporter.writeSummary("TCID_Event_026,   Verify whether the Add Assignment button is displayed after expanding Assignments, " +  classSteps.getResult() );
		//TCID_26: Verify whether the Add Assignment button is displayed after expanding Assignments
		classSteps.verifyAddAssignmentBtn();
		Reporter.writeSummary("TCID_Event_027,  Verify whether the new assignment details fields are displayed after clicking the Add Assignment Button, " +  classSteps.getResult() );
		//TCID_27: Verify whether the new assignment details fields are displayed after clicking the Add Assignment Button
		classSteps.verifyNewPreAssignmentForm();
		Reporter.writeSummary("TCID_Event_028,   Verify Whether the Add survey details are displayed after clicking Survey label, " +  classSteps.getResult() );
		//TCID_28: Verify Whether the Add survey details are displayed after clicking Survey label
		classSteps.verifySurveyDetailsDisplayed();
		Reporter.writeSummary("TCID_Event_029,   Verify whether the Add Survey button is displayed after expanding Survey, " +  classSteps.getResult() );
		//TCID_29: Verify whether the Add Survey button is displayed after expanding Survey
		classSteps.verifyPreSurveyAddBtn();
		Reporter.writeSummary("TCID_Event_030,   Verify whether the new Survey form details fields are displayed after clicking the Add Assignment Button, " +  classSteps.getResult() );
		//TCID_30: Verify whether the new Survey form details fields are displayed after clicking the Add Assignment Button
//		classSteps.verifyPreSurveyFormDetails();
		//TCID_31: Verify Whether the Session details are displayed after clicking Session label
		classSteps.verifySessionDetailsDisplayed();
		Reporter.writeSummary("TCID_Event_032,   Verify whether the error message is displayed if the instructor name is not selected from drop-down, " +  classSteps.getResult() );
		//TCID_32: Verify whether the error message is displayed if the instructor name is not selected from drop-down
		classSteps.verifyInstructorDropdownAlertMsg();
		Reporter.writeSummary("TCID_Event_033,   Verify whether the error message is disappeared after selecting any instructor from drop-down, " +  classSteps.getResult() );
		//TCID_33: Verify whether the error message is disappeared after selecting any instructor from drop-down
		classSteps.verifyInstructorDropdownAlertDisappears();
		//TCID_34: Verify whether the Assignment details are displayed when clicking Post event assignments label
		classSteps.verifyPostAssignmentDetails();
		Reporter.writeSummary("TCID_Event_035,   Verify whether the post event assignment count matches with the number of assignments displayed, " +  classSteps.getResult() );
		//TCID_35: Verify whether the post event assignment count matches with the number of assignments displayed
		classSteps.verifyPostAssignmentCount();
		Reporter.writeSummary("TCID_Event_036,  Verify whether the Add Assignment button is displayed after expanding Assignments under post event, " +  classSteps.getResult() );
		//TCID_36: Verify whether the Add Assignment button is displayed after expanding Assignments under post event
		classSteps.verifyPostAddAssignmentBtn();
		Reporter.writeSummary("TCID_Event_037,  Verify whether the new assignment details fields are displayed after clicking the Add Assignment Button under post event, " +  classSteps.getResult() );
		//TCID_37: Verify whether the new assignment details fields are displayed after clicking the Add Assignment Button under post event
		classSteps.verifyPostAddAssignmentDetails();
		Reporter.writeSummary("TCID_Event_038,  Verify Whether the Add survey details are displayed after clicking Survey label under post event, " +  classSteps.getResult() );
		//TCID_38: Verify Whether the Add survey details are displayed after clicking Survey label under post event
		classSteps.verifyPostSurveyDetails();
		Reporter.writeSummary("TCID_Event_039,  Verify whether the Add Survey button is displayed after expanding Survey under post event, " +  classSteps.getResult() );
		//TCID_39: Verify whether the Add Survey button is displayed after expanding Survey under post event
		MyScreenRecorder.stopRecording();
		classSteps.verifyPostAddSurveyButton();
		Reporter.writeSummary("TCID_Event_040,  Verify whether the new Survey form details fields are displayed after clicking the Add Assignment Button under post event, " +  classSteps.getResult() );
		//TCID_40: Verify whether the new Survey form details fields are displayed after clicking the Add Assignment Button under post event
//		classSteps.verifyPostAddSurveyFormFields();
		
		
		classSteps.closeLobjModel();
		wait(10);
		menuSteps.logout();
	}
	@Test(dataProvider = "browers", groups= {"pilot"}, enabled= true, 
			description="TCID_01:"
			+ "TCID_41: Verify Whether the Notifications days are displayed under 'Notifications & Reminders' section"
			+ "TCID_42: Verify whether the \"Notifications & Reminders\" fields accepts alphabets"
			+ "TCID_43: Verify whether the \"Notifications & Reminders\" fields accepts alpha numerics"
			+ "TCID_44: Verify whether the \"Notifications & Reminders\" fields accepts special charecters"
			+ "TCID_45: Verify whether the \"Notifications & Reminders\" fields accepts numbers"
			+ "TCID_46: Verify whether the Reference Material Upload button is displayed"
			+ "TCID_47: Verify whether the \"Terms & Conditions\" are displayed at the end of the page"
			+ "TCID_48: Verify whether the 2nd page is opened on clicking continue button after filling all the mandatory fields."
			+ "TCID_49: Verfy whether the alert message is thrown for all the Mandatory fields, if Save button is clicked without filling any fields"
			+ "TCID_50: Verify whether the \"Maximum no. of participants\" field accepts numbers")
	public void verifyEvents3(String row, String strBrowserName) throws Exception {
		driver = BrowserFactory.getBrowser(strBrowserName);
		loginToContentAdmin(driver);
		
		MenuSteps menuSteps = new MenuSteps(driver);
		MyScreenRecorder.startRecording("navigationTest");
		menuSteps.clickMenu();
		//Test moves to Manage Contents page
		menuSteps.gotoClassroomCreation();
		ClassroomEventSteps classSteps = new ClassroomEventSteps(driver);
		//To click on a pariculat classroom item
		classSteps.clickOnClassroomItem();
		Reporter.writeSummary("TCID_Event_041, Verify Whether the Notifications days are displayed under Notifications & Reminders section, " +  classSteps.getResult() );
		//TCID_41: Verify Whether the Notifications days are displayed under "Notifications & Reminders" section
		classSteps.verifyNotifAndReminder();
		Reporter.writeSummary("TCID_Event_042,  Verify whether the Notifications & Reminders fields accepts alphabets, " +  classSteps.getResult() );
		//TCID_42: Verify whether the "Notifications & Reminders" fields accepts alphabets
		classSteps.verifyNotifAndReminderFieldsAcceptsAlphabets();
		Reporter.writeSummary("TCID_Event_043,   Verify whether the Notifications & Reminders fields accepts alpha numerics, " +  classSteps.getResult() );
		//TCID_43: Verify whether the "Notifications & Reminders" fields accepts alpha numerics
		classSteps.verifyNotifAndReminderFieldsAcceptsAlphaNumerics();
		Reporter.writeSummary("TCID_Event_044,  Verify whether the  Notifications & Reminders fields accepts special charecters, " +  classSteps.getResult() );
		//TCID_44: Verify whether the "Notifications & Reminders" fields accepts special charecters
		classSteps.verifyNotifAndReminderFieldsAcceptsSpecialChars();
		Reporter.writeSummary("TCID_Event_045,  Verify whether the Notifications & Reminders fields accepts numbers, " +  classSteps.getResult() );
		//TCID_45: Verify whether the "Notifications & Reminders" fields accepts numbers
		classSteps.verifyNotifAndReminderFieldsAcceptsNumbers();
		Reporter.writeSummary("TCID_Event_046,   Verify whether the Reference Material Upload button is displayed, " +  classSteps.getResult() );
		//TCID_46: Verify whether the Reference Material Upload button is displayed
		classSteps.verifyReferenceUploadBtn();
		Reporter.writeSummary("TCID_Event_047, Verify whether the Terms & Conditions are displayed at the end of the page, " +  classSteps.getResult() );
		//TCID_47: Verify whether the "Terms & Conditions" are displayed at the end of the page
		classSteps.verifyTermsConditions();
		Reporter.writeSummary("TCID_Event_048,  Verify whether the 2nd page is opened on clicking continue button after filling all the mandatory fields, " +  classSteps.getResult() );
		//TCID_48: Verify whether the 2nd page is opened on clicking continue button after filling all the mandatory fields.
		classSteps.verifySecondPageOpened();
		Reporter.writeSummary("TCID_Event_049, Verfy whether the alert message is thrown for all the Mandatory fields if Save button is clicked without filling any fields, " +  classSteps.getResult() );
		//TCID_49: Verfy whether the alert message is thrown for all the Mandatory fields, if Save button is clicked without filling any fields
		classSteps.verifySecondPageAlertMsgs();
		Reporter.writeSummary("TCID_Event_050, Verify whether the Maximum no. of participants field accepts numbers, " +  classSteps.getResult() );
		//TCID_50: Verify whether the "Maximum no. of participants" field accepts numbers
		classSteps.verifyMaxNumParticipAcceptNum();
		
		classSteps.closeLobjModel();
		MyScreenRecorder.stopRecording();
		wait(10);
		menuSteps.logout();
	}
	@Test(dataProvider = "browers", groups= {"pilot"}, enabled= false, 
			description="TCID_01:"
			+ "TCID_51: Verify whether the \"Maximum no. of participants\" field accepts alphanumerics"
			+ "TCID_52: Verify whether the \"Maximum no. of participants\" field accepts special characters"
			+ "TCID_53: Verify whether the \"Maximum no. of participants\" field accepts alphabets"
			+ "TCID_54: Verify whether the alert messgae is disappeared after entering \"Maximum no. of participants\""
			+ "TCID_55: Verify whether the \"Minimum no. of participants\" field accepts numbers"
			+ "TCID_56: Verify whether the \"Minimum no. of participants\" field accepts alphanumerics"
			+ "TCID_57: Verify whether the \"Minimum no. of participants\" field accepts special characters"
			+ "TCID_58: Verify whether the \"Minimum no. of participants\" field accepts alphabets"
			+ "TCID_59: Verify whether the alert message is disappeared after entering 'Minimum no. of participants'"
			+ "TCID_60: Verify whether the 'Waiting List Threshold' field accepts numbers")
	public void verifyEvents4(String row, String strBrowserName) throws Exception {
		driver = BrowserFactory.getBrowser(strBrowserName);
		loginToContentAdmin(driver);
		
		MenuSteps menuSteps = new MenuSteps(driver);
		MyScreenRecorder.startRecording("navigationTest");
		menuSteps.clickMenu();
		//Test moves to Manage Contents page
		menuSteps.gotoClassroomCreation();
		ClassroomEventSteps classSteps = new ClassroomEventSteps(driver);
		//To click on a paricular classroom item
		classSteps.clickOnClassroomItem();
		wait(5);
		classSteps.verifyAddEventPageOpened();
		Reporter.writeSummary("TCID_Event_051, Verify whether the Maximum no. of participants field accepts alphanumerics, " +  classSteps.getResult() );
		//TCID_51: Verify whether the "Maximum no. of participants" field accepts alphanumerics
    	classSteps.verifyMaxNumParticipAcceptAlphaNumeric();
    	Reporter.writeSummary("TCID_Event_052,  Verify whether the Maximum no. of participants field accepts special characters, " +  classSteps.getResult() );
		//TCID_52: Verify whether the "Maximum no. of participants" field accepts special characters
		classSteps.verifyMaxNumParticipAcceptSpecialChars();
		Reporter.writeSummary("TCID_Event_053,  Verify whether the Maximum no. of participants field accepts alphabets, " +  classSteps.getResult() );
		//TCID_53: Verify whether the "Maximum no. of participants" field accepts alphabets
		classSteps.verifyMaxNumParticipAcceptAlphabets();
		Reporter.writeSummary("TCID_Event_054,  Verify whether the alert messgae is disappeared after entering Maximum no. of participants, " +  classSteps.getResult() );
		Reporter.writeSummary("TCID_Event_074,  Verify whether the alert messgae is disappeared after entering Maximum no. of participants, " +  classSteps.getResult() );
		//TCID_54,74: Verify whether the alert messgae is disappeared after entering "Maximum no. of participants" 
		classSteps.verifyMaxParticipAlertDisappears();
		Reporter.writeSummary("TCID_Event_055,  Verify whether the Minimum no. of participants field accepts numbers, " +  classSteps.getResult() );
		//TCID_55: Verify whether the "Minimum no. of participants" field accepts numbers
		classSteps.verifyMinNumParticipAcceptNum();
		Reporter.writeSummary("TCID_Event_056,  Verify whether the Minimum no. of participants field accepts alphanumerics, " +  classSteps.getResult() );
		//TCID_56: Verify whether the "Minimum no. of participants" field accepts alphanumerics
		classSteps.verifyMinNumParticipAcceptAlphaNumeric();
		Reporter.writeSummary("TCID_Event_057,  Verify whether the Minimum no. of participants field accepts special characters, " +  classSteps.getResult() );
		//TCID_57: Verify whether the "Minimum no. of participants" field accepts special characters
		classSteps.verifyMinNumParticipAcceptSpecialChars();
		Reporter.writeSummary("TCID_Event_058,  Verify whether the Minimum no. of participants field accepts alphabets, " +  classSteps.getResult() );
		//TCID_58: Verify whether the "Minimum no. of participants" field accepts alphabets
		classSteps.verifyMinNumParticipAcceptAlphabets();
		Reporter.writeSummary("TCID_Event_059,  Verify whether the alert message is disappeared after entering 'Minimum no. of participants', " +  classSteps.getResult() );
		//TCID_59: Verify whether the alert message is disappeared after entering 'Minimum no. of participants'
		classSteps.verifyMinNumParticipAlertDisappears();
		Reporter.writeSummary("TCID_Event_060,  Verify whether the 'Waiting List Threshold' field accepts numbers, " +  classSteps.getResult() );
		//TCID_60: Verify whether the 'Waiting List Threshold' field accepts numbers
		classSteps.verifyMinNumParticipAlertDisappears();
        classSteps.verifyCancellationPolicy();
        MyScreenRecorder.stopRecording();
        Reporter.writeSummary("TCID_Event_070,  Verify Whether the Cancellation Policy is displayed at the bottom of the page, " +  classSteps.getResult() );
     	//TCID_70: Verify Whether the Cancellation Policy is displayed at the bottom of the page
		
		classSteps.closeLobjModel();
		wait(10);
		menuSteps.logout();
	}
	@Test(dataProvider = "browers", groups= {"pilot"}, enabled= false, 
			description="")
	public void verifyEvents5(String row, String strBrowserName) throws Exception {
		driver = BrowserFactory.getBrowser(strBrowserName);
		loginToContentAdmin(driver);
		
		MenuSteps menuSteps = new MenuSteps(driver);
		MyScreenRecorder.startRecording("navigationTest");
		menuSteps.clickMenu();
		//Test moves to Manage Contents page
		menuSteps.gotoClassroomCreation();
		ClassroomEventSteps classSteps = new ClassroomEventSteps(driver);
		//To click on a paricular classroom item
		classSteps.clickOnClassroomItem();
		wait(5);
		classSteps.verifyAddEventPageOpened();
		Reporter.writeSummary("TCID_Event_20,  Verify whether the alert is disappearing after selection any value from the Select Instructor dropdown, " +  classSteps.getResult() );
		Reporter.writeSummary("TCID_Event_19,  Verify whether the alert is disappearing after entering valid Duration, " +  classSteps.getResult() );
		Reporter.writeSummary("TCID_Event_18,  Verify whether the alert is disappearing after entering valid Date, " +  classSteps.getResult() );
		Reporter.writeSummary("TCID_Event_19, Verify whether the alert is disappearing after entering valid completion percentage, " +  classSteps.getResult() );
		//20:Verify whether the alert is disappearing after selection any value from the Select Instructor dropdown
		//19:Verify whether the alert is disappearing after entering valid Duration
		//18:Verify whether the alert is disappearing after entering valid Date
		//19:Verify whether the alert is disappearing after entering valid completion percentage
		classSteps.verifyTickAndPlusMark();
		Reporter.writeSummary("TCID_Event_071,  Verify whether on clicking the Plus icon opens the Use list tab, " +  classSteps.getResult() );
		Reporter.writeSummary("TCID_Event_072,  Verify whether on clicking the Tick icon closes the Use list tab, " +  classSteps.getResult() );
		//TCID_71: Verify whether on clicking the Plus icon opens the Use list tab
		//TCID_72:Verify whether on clicking the Tick icon closes the Use list tab
		classSteps.verifyAlertAfterAddingMaximumNumberOfParticipants();
		Reporter.writeSummary("TCID_Event_30, Verify whether the alert is disappearing after entering Maximum no. of participants, " +  classSteps.getResult() );
		Reporter.writeSummary("TCID_Event_28, Verify whether the next page is loaded on clicking the continue button after entering all the mandatory form field, " +  classSteps.getResult() );
		//30:Verify whether the alert is disappearing after entering Maximum no. of participants
		//28:Verify whether the next page is loaded on clicking the continue button, after entering all the mandatory form field.
		classSteps.verifyAlertAfterAddingMinimumNumberOfParticipants();
		Reporter.writeSummary("TCID_Event_39,  Verify whether the alert is thrown when trying to save without adding minimum number of participants, " +  classSteps.getResult() );
		Reporter.writeSummary("TCID_Event_40,  Verify whether the alert is thrown when trying to save after adding minimum number of participants, " +  classSteps.getResult() );
		//39:Verify whether the alert is thrown when trying to save without adding minimum number of participants
		//40:Verify whether the alert is thrown when trying to save after adding minimum number of participants
		classSteps.verifyAddTheUsersInParticipantsList();
		Reporter.writeSummary("TCID_Event_37,  Verify whether the admin able to add the users in the participants list, " +  classSteps.getResult() );
		Reporter.writeSummary("TCID_Event_38, Verify whether the alert is thrown when trying to add the users in the participants list more than Maximum no. of participants, " +  classSteps.getResult() );
		//37:Verify whether the admin able to add the users in the participants list
		//38:Verify whether the alert is thrown when trying to add the users in the participants list more than Maximum no. of participants
		classSteps.verifyParticipantsDeletedFromParticipantsList();
		Reporter.writeSummary("TCID_Event_075,  Verify whether the participants are deleted from the participants list after clicking the delete icon, " +  classSteps.getResult() );
		Reporter.writeSummary("TCID_Event_076,  Verify whether the participants are deleted from the Waiting List after clicking the delete icon, " +  classSteps.getResult() );
		//TCID_75:Verify whether the participants are deleted from the participants list after clicking the delete icon
		//TCID_76:Verify whether the participants are deleted from the Waiting List after clicking the delete icon
		classSteps.verifyConfirmButtonDisplayed();
		Reporter.writeSummary("TCID_Event_077,  Verify whether the Confirm button is displayed for all the participants in the waiting list, " +  classSteps.getResult() );
		Reporter.writeSummary("TCID_Event_078,  Verify whether the Confirm button is removed for all the participants from the Waiting list after selecting the Auto update waiting list on cancellation radio button, " +  classSteps.getResult() );
		//TCID_77:Verify whether the Confirm button is displayed for all the participants in the waiting list
		//TCID_78:Verify whether the Confirm button is removed for all the participants from the Waiting list after selecting the Auto update waiting list on cancellation radio button
		classSteps.verifyAutoUpdateWaitingList();
		Reporter.writeSummary("TCID_Event_066,  Verify Auto update waiting List on Cancellation radio button is working fine, " +  classSteps.getResult() );
		//TCID_66:Verify Auto update waiting List on Cancellation radio button is working fine
		classSteps.verifyParticipantsSearch();
		Reporter.writeSummary("TCID_Event_080,  Verify whether the Select usere tab have Search box , " +  classSteps.getResult() );
		Reporter.writeSummary("TCID_Event_081,  Verify whether the search functionality is working fine, " +  classSteps.getResult() );
		//TCID_80:Verify whether the Select usere tab have Search box 
		//TCID_81:Verify whether the search functionality is working fine
		classSteps.verifyAllFilterSearch();
		Reporter.writeSummary("TCID_Event_082,  Verify whether the Filtes All Enterprise and Direct user types are displayed below the Search box, " +  classSteps.getResult() );
		Reporter.writeSummary("TCID_Event_083,  Verify whether the User type filters are working fine, " +  classSteps.getResult() );
		//TCID_82:Verify whether the Filtes All, Enterprise and Direct user types are displayed below the Search box
		//TCID_83:Verify whether the User type filters are working fine
		classSteps.verifyPublishEventBtn();
		Reporter.writeSummary("TCID_Event_45,  Verify whether the Publish Event button is disabled while creating, " +  classSteps.getResult() );
		//45:Verify whether the Publish Event button is disabled while creating
		classSteps.verifyAlertDisappearStartDateRegistartion();
		Reporter.writeSummary("TCID_Event_33,  Verify whether the alert is disappearing after selecting Start Date For Registration, " +  classSteps.getResult() );
		//33:Verify whether the alert is disappearing after selecting Start Date For Registration
		classSteps.verifyAlertDisappearLastDateRegistartion();
		MyScreenRecorder.stopRecording();
		Reporter.writeSummary("TCID_Event_34,  Verify whether the alert is disappearing after selecting Last Date For Registration, " +  classSteps.getResult() );
		//34:Verify whether the alert is disappearing after selecting Last Date For Registration
 
	}
	
}
