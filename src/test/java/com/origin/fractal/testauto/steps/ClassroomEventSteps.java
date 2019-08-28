		package com.origin.fractal.testauto.steps;
		
		import org.openqa.selenium.WebDriver;
		
		import com.origin.fractal.testauto.FractalBaseStep;
		import com.origin.fractal.testauto.pages.ClassroomEventPage;
		
		public class ClassroomEventSteps extends FractalBaseStep {
		public ClassroomEventPage page;
		public ClassroomEventSteps(WebDriver driver) {
		page = new ClassroomEventPage(driver);
		fBPage = page;
		}
		public void clickOnClassroomItem() {
			result ="Passed";
			   try {
				page.clickOnClassroomItem();
			   }
			   catch(Exception e)
			   {
				e.printStackTrace();   
				result="FAILED";
			   }
		}
		public void closeLobjModel() {
			{
				result ="Passed";
				   try {
					page.closeLobjModel();
				   }
				   catch(Exception e)
				   {
					e.printStackTrace();   
					result="FAILED";
				   }
			}
		}
		public void verifyAddEventPageOpened() {
			{
				result ="Passed";
				   try {
					page.verifyAddEventPageOpened();
				   }
				   catch(Exception e)
				   {
					e.printStackTrace();   
					result="FAILED";
				   }
			}
		}
		public void verifyAlertForAllFieldsInPage1() {
			{
				result ="Passed";
				   try {
					page.verifyAlertForAllFieldsInPage1();
				   }
				   catch(Exception e)
				   {
					e.printStackTrace();   
					result="FAILED";
				   }
			}
		}
		public void verifySelectClassroomTypeAlertMsg() {
			{
				result ="Passed";
				   try {
					page.verifySelectClassroomTypeAlertMsg();
				   }
				   catch(Exception e)
				   {
					e.printStackTrace();   
					result="FAILED";
				   }
			}
		}
		public void verifySelectVenueDropdownAlertMsg() {
			{
				result ="Passed";
				   try {
					page.verifySelectVenueDropdownAlertMsg();
				   }
				   catch(Exception e)
				   {
					e.printStackTrace();   
					result="FAILED";
				   }
			}
		}
		public void verifySelectLinkDropdownAlertMsg() {
			{
				result ="Passed";
				   try {
					page.verifySelectLinkDropdownAlertMsg();
				   }
				   catch(Exception e)
				   {
					e.printStackTrace();   
					result="FAILED";
				   }
			}
		}
		public void verifyAverageScoreAlertMsg() {
			{
				result ="Passed";
				   try {
					page.verifyAverageScoreAlertMsg();
				   }
				   catch(Exception e)
				   {
					e.printStackTrace();   
					result="FAILED";
				   }
			}
		}
		public void verifySessionStartTimeAlertMsg() {
			{
				result ="Passed";
				   try {
					page.verifySessionStartTimeAlertMsg();
				   }
				   catch(Exception e)
				   {
					e.printStackTrace();   
					result="FAILED";
				   }
			}
		}
		public void verifySessionEndTimeAlertMsg() {
			{
				result ="Passed";
				   try {
					page.verifySessionEndTimeAlertMsg();
				   }
				   catch(Exception e)
				   {
					e.printStackTrace();   
					result="FAILED";
				   }
			}
		}
		public void verifySelectInstrtuctorAlertMsg() {
				{
					result ="Passed";
					   try {
						page.verifySelectInstrtuctorAlertMsg();
					   }
					   catch(Exception e)
					   {
						e.printStackTrace();   
						result="FAILED";
					   }
				}
		}
		public void verifySelectInstrtuctorAlertMsgDisappears() {
			{
				result ="Passed";
				   try {
					page.verifySelectInstrtuctorAlertMsgDisappears();
				   }
				   catch(Exception e)
				   {
					e.printStackTrace();   
					result="FAILED";
				   }
			}
		}
		public void verifyPhysicalClassroomDropdown() {
			{
				result ="Passed";
				   try {
					page.verifyPhysicalClassroomDropdown();
				   }
				   catch(Exception e)
				   {
					e.printStackTrace();   
					result="FAILED";
				   }
			}
		}
		public void verifyVirtualClassroomDropdown() {
			{
				result ="Passed";
				   try {
					page.verifyVirtualClassroomDropdown();
				   }
				   catch(Exception e)
				   {
					e.printStackTrace();   
					result="FAILED";
				   }
			}
		}
		public void verifyVenueDropdownAlertDisappears() {
			{
				result ="Passed";
				   try {
					page.verifyVenueDropdownAlertDisappears();
				   }
				   catch(Exception e)
				   {
					e.printStackTrace();   
					result="FAILED";
				   }
			}
		}
		public void verifyLinkDropdownAlertDisappears() {
			{
				result ="Passed";
				   try {
					page.verifyLinkDropdownAlertDisappears();
				   }
				   catch(Exception e)
				   {
					e.printStackTrace();   
					result="FAILED";
				   }
			}
		}
		public void verifyShowmapCheckbox() {
			{
				result ="Passed";
				   try {
					page.verifyShowmapCheckbox();
				   }
				   catch(Exception e)
				   {
					e.printStackTrace();   
					result="FAILED";
				   }
			}
		}
		public void verifyShowmapCheckboxChecked() {
			{
				result ="Passed";
				   try {
					page.verifyShowmapCheckboxChecked();
				   }
				   catch(Exception e)
				   {
					e.printStackTrace();   
					result="FAILED";
				   }
			}
		}
		public void verifyShowmapCheckboxUnchecked() {
			{
				result ="Passed";
				   try {
					page.verifyShowmapCheckboxUnchecked();
				   }
				   catch(Exception e)
				   {
					e.printStackTrace();   
					result="FAILED";
				   }
			}
		}
		public void verifyTimezoneAlertDisappeared() {
			{
				result ="Passed";
				   try {
					page.verifyTimezoneAlertDisappeared();
				   }
				   catch(Exception e)
				   {
					e.printStackTrace();   
					result="FAILED";
				   }
			}
		}
		public void verifyAvgScoreAlertDisappears() {
			{
				result ="Passed";
				   try {
					page.verifyAvgScoreAlertDisappears();
				   }
				   catch(Exception e)
				   {
					e.printStackTrace();   
					result="FAILED";
				   }
			}
		}
		public void verifyAvgScoreAcceptsAlphabets() {
			{
				result ="Passed";
				   try {
					page.verifyAvgScoreAcceptsAlphabets();
				   }
				   catch(Exception e)
				   {
					e.printStackTrace();   
					result="FAILED";
				   }
			}
		}
		public void verifyAvgScoreAcceptsSpecialChars() {
			{
				result ="Passed";
				   try {
					page.verifyAvgScoreAcceptsSpecialChars();
				   }
				   catch(Exception e)
				   {
					e.printStackTrace();   
					result="FAILED";
				   }
			}
		}
		public void verifyAvgScoreAcceptsAlphanumeric() {
			{
				result ="Passed";
				   try {
					page.verifyAvgScoreAcceptsAlphanumeric();
				   }
				   catch(Exception e)
				   {
					e.printStackTrace();   
					result="FAILED";
				   }
			}
		}
		public void verifyAvgScoreAcceptsMoretha2DIgits() {
			{
				result ="Passed";
				   try {
					page.verifyAvgScoreAcceptsMoretha2DIgits();
				   }
				   catch(Exception e)
				   {
					e.printStackTrace();   
					result="FAILED";
				   }
			}
		}
		public void verifyAssignDetailsDisplayed() {
			{
				result ="Passed";
				   try {
					page.verifyAssignDetailsDisplayed();
				   }
				   catch(Exception e)
				   {
					e.printStackTrace();   
					result="FAILED";
				   }
			}
		}
		public void verifyPreAssessmentCount() {
			{
				result ="Passed";
				   try {
					page.verifyPreAssessmentCount();
				   }
				   catch(Exception e)
				   {
					e.printStackTrace();   
					result="FAILED";
				   }
			}
		}
		public void verifyAddAssignmentBtn() {
			{
				result ="Passed";
				   try {
					page.verifyAddAssignmentBtn();
				   }
				   catch(Exception e)
				   {
					e.printStackTrace();   
					result="FAILED";
				   }
			}
		}
		public void verifyNewPreAssignmentForm() {
			{
				result ="Passed";
				   try {
					page.verifyNewPreAssignmentForm();
				   }
				   catch(Exception e)
				   {
					e.printStackTrace();   
					result="FAILED";
				   }
			}
		}
		public void verifySurveyDetailsDisplayed() {
			{
				result ="Passed";
				   try {
					page.verifySurveyDetailsDisplayed();
				   }
				   catch(Exception e)
				   {
					e.printStackTrace();   
					result="FAILED";
				   }
			}
		}
		public void verifyPreSurveyAddBtn() {
			{
				result ="Passed";
				   try {
					page.verifyPreSurveyAddBtn();
				   }
				   catch(Exception e)
				   {
					e.printStackTrace();   
					result="FAILED";
				   }
			}
		}
		public void verifyPreSurveyFormDetails() {
			{
				result ="Passed";
				   try {
					page.verifyPreSurveyFormDetails();
				   }
				   catch(Exception e)
				   {
					e.printStackTrace();   
					result="FAILED";
				   }
			}
		}
		public void verifySessionDetailsDisplayed() {
			{
				result ="Passed";
				   try {
					page.verifySessionDetailsDisplayed();
				   }
				   catch(Exception e)
				   {
					e.printStackTrace();   
					result="FAILED";
				   }
			}
		}
		public void verifyInstructorDropdownAlertMsg() {
			{
				result ="Passed";
				   try {
					page.verifyInstructorDropdownAlertMsg();
				   }
				   catch(Exception e)
				   {
					e.printStackTrace();   
					result="FAILED";
				   }
			}
		}
		public void verifyInstructorDropdownAlertDisappears() {
			{
				result ="Passed";
				   try {
					page.verifyInstructorDropdownAlertDisappears();
				   }
				   catch(Exception e)
				   {
					e.printStackTrace();   
					result="FAILED";
				   }
			}
		}
		public void verifyPostAssignmentDetails() {
			{
				result ="Passed";
				   try {
					page.verifyPostAssignmentDetails();
				   }
				   catch(Exception e)
				   {
					e.printStackTrace();   
					result="FAILED";
				   }
			}
		}
		public void verifyPostAssignmentCount() {
			{
				result ="Passed";
				   try {
					page.verifyPostAssignmentCount();
				   }
				   catch(Exception e)
				   {
					e.printStackTrace();   
					result="FAILED";
				   }
			}
		}
		public void verifyPostAddAssignmentBtn() {
			{
				result ="Passed";
				   try {
					page.verifyPostAddAssignmentBtn();
				   }
				   catch(Exception e)
				   {
					e.printStackTrace();   
					result="FAILED";
				   }
			}
		}
		public void verifyPostAddAssignmentDetails() {
			{
				result ="Passed";
				   try {
					page.verifyPostAddAssignmentDetails();
				   }
				   catch(Exception e)
				   {
					e.printStackTrace();   
					result="FAILED";
				   }
			}
		}
		public void verifyPostSurveyDetails() {
			{
				result ="Passed";
				   try {
					page.verifyPostSurveyDetails();
				   }
				   catch(Exception e)
				   {
					e.printStackTrace();   
					result="FAILED";
				   }
			}
		}
		public void verifyPostAddSurveyButton() {
			{
				result ="Passed";
				   try {
					page.verifyPostAddSurveyButton();
				   }
				   catch(Exception e)
				   {
					e.printStackTrace();   
					result="FAILED";
				   }
			}
		}
		public void verifyPostAddSurveyFormFields() {
			{
				result ="Passed";
				   try {
					page.verifyPostAddSurveyFormFields();
				   }
				   catch(Exception e)
				   {
					e.printStackTrace();   
					result="FAILED";
				   }
			}
		}
		public void verifyNotifAndReminder() {
			{
				result ="Passed";
				   try {
					page.verifyNotifAndReminder();
				   }
				   catch(Exception e)
				   {
					e.printStackTrace();   
					result="FAILED";
				   }
			}
		}
		public void verifyNotifAndReminderFieldsAcceptsAlphabets() {
			{
				result ="Passed";
				   try {
					page.verifyNotifAndReminderFieldsAcceptsAlphabets();
				   }
				   catch(Exception e)
				   {
					e.printStackTrace();   
					result="FAILED";
				   }
			}
		}
		public void verifyNotifAndReminderFieldsAcceptsAlphaNumerics() {
			{
				result ="Passed";
				   try {
					page.verifyNotifAndReminderFieldsAcceptsAlphaNumerics();
				   }
				   catch(Exception e)
				   {
					e.printStackTrace();   
					result="FAILED";
				   }
			}
		}
		public void verifyNotifAndReminderFieldsAcceptsSpecialChars() {
			{
				result ="Passed";
				   try {
					page.verifyNotifAndReminderFieldsAcceptsSpecialChars();
				   }
				   catch(Exception e)
				   {
					e.printStackTrace();   
					result="FAILED";
				   }
			}
		}
		public void verifyNotifAndReminderFieldsAcceptsNumbers() {
			{
				result ="Passed";
				   try {
					page.verifyNotifAndReminderFieldsAcceptsNumbers();
				   }
				   catch(Exception e)
				   {
					e.printStackTrace();   
					result="FAILED";
				   }
			}
		}
		public void verifyReferenceUploadBtn() {
			{
				result ="Passed";
				   try {
					page.verifyReferenceUploadBtn();
				   }
				   catch(Exception e)
				   {
					e.printStackTrace();   
					result="FAILED";
				   }
			}
		}
		public void verifyTermsConditions() {
			{
				result ="Passed";
				   try {
					page.verifyTermsConditions();
				   }
				   catch(Exception e)
				   {
					e.printStackTrace();   
					result="FAILED";
				   }
			}
		}
		public void verifySecondPageOpened() {
			{
				result ="Passed";
				   try {
					page.verifySecondPageOpened();
				   }
				   catch(Exception e)
				   {
					e.printStackTrace();   
					result="FAILED";
				   }
			}
		}
		public void verifySecondPageAlertMsgs() {
			{
				result ="Passed";
				   try {
					page.verifySecondPageAlertMsgs();
				   }
				   catch(Exception e)
				   {
					e.printStackTrace();   
					result="FAILED";
				   }
			}
		}
		public void verifyMaxNumParticipAcceptNum() {
			{
				result ="Passed";
				   try {
					page.verifyMaxNumParticipAcceptNum();
				   }
				   catch(Exception e)
				   {
					e.printStackTrace();   
					result="FAILED";
				   }
			}
		}
		public void verifyMaxNumParticipAcceptAlphaNumeric() {
			{
				result ="Passed";
				   try {
					page.verifyMaxNumParticipAcceptAlphaNumeric();
				   }
				   catch(Exception e)
				   {
					e.printStackTrace();   
					result="FAILED";
				   }
			}
		}
		public void verifyMaxNumParticipAcceptSpecialChars() {
			{
				result ="Passed";
				   try {
					page.verifyMaxNumParticipAcceptSpecialChars();
				   }
				   catch(Exception e)
				   {
					e.printStackTrace();   
					result="FAILED";
				   }
			}
		}
		public void verifyMaxNumParticipAcceptAlphabets() {
			{
				result ="Passed";
				   try {
					page.verifyMaxNumParticipAcceptAlphabets();
				   }
				   catch(Exception e)
				   {
					e.printStackTrace();   
					result="FAILED";
				   }
			}
		}
		public void verifyMaxParticipAlertDisappears() {
			{
				result ="Passed";
				   try {
					page.verifyMaxParticipAlertDisappears();
				   }
				   catch(Exception e)
				   {
					e.printStackTrace();   
					result="FAILED";
				   }
			}
		}
		public void verifyMinNumParticipAcceptNum() {
			{
				result ="Passed";
				   try {
					page.verifyMinNumParticipAcceptNum();
				   }
				   catch(Exception e)
				   {
					e.printStackTrace();   
					result="FAILED";
				   }
			}
		}
		public void verifyMinNumParticipAcceptAlphaNumeric() {
			{
				result ="Passed";
				   try {
					page.verifyMinNumParticipAcceptAlphaNumeric();
				   }
				   catch(Exception e)
				   {
					e.printStackTrace();   
					result="FAILED";
				   }
			}
		}
		public void verifyMinNumParticipAcceptSpecialChars() {
			{
				result ="Passed";
				   try {
					page.verifyMinNumParticipAcceptSpecialChars();
				   }
				   catch(Exception e)
				   {
					e.printStackTrace();   
					result="FAILED";
				   }
			}
		}
		public void verifyMinNumParticipAcceptAlphabets() {
			{
				result ="Passed";
				   try {
					page.verifyMinNumParticipAcceptAlphabets();
				   }
				   catch(Exception e)
				   {
					e.printStackTrace();   
					result="FAILED";
				   }
			}
		}
		public void verifyMinNumParticipAlertDisappears() {
			{
				result ="Passed";
				   try {
					page.verifyMinNumParticipAlertDisappears();
				   }
				   catch(Exception e)
				   {
					e.printStackTrace();   
					result="FAILED";
				   }
			}
		}
		public void  verifyCancellationPolicy() {
			{
				result ="Passed";
				   try {
					page.verifyCancellationPolicy();
				   }
				   catch(Exception e)
				   {
					e.printStackTrace();   
					result="FAILED";
				   }
			}
		}
		public void  verifyTickAndPlusMark() {
			{
				result ="Passed";
				   try {
					page.verifyTickAndPlusMark();
				   }
				   catch(Exception e)
				   {
					e.printStackTrace();   
					result="FAILED";
				   }
			}
		}
		public void verifyAlertAfterAddingMaximumNumberOfParticipants() {
			{
				result ="Passed";
				   try {
					page.verifyAlertAfterAddingMaximumNumberOfParticipants();
				   }
				   catch(Exception e)
				   {
					e.printStackTrace();   
					result="FAILED";
				   }
			}
		}
		public void verifyAlertAfterAddingMinimumNumberOfParticipants() {
			{
				result ="Passed";
				   try {
					page.verifyAlertAfterAddingMinimumNumberOfParticipants();
				   }
				   catch(Exception e)
				   {
					e.printStackTrace();   
					result="FAILED";
				   }
			}
		}
		public void verifyAddTheUsersInParticipantsList(){
			{
				result ="Passed";
				   try {
					page.verifyAddTheUsersInParticipantsList();
				   }
				   catch(Exception e)
				   {
					e.printStackTrace();   
					result="FAILED";
				   }
			}
		}
		public void verifyParticipantsDeletedFromParticipantsList() {
			{
				result ="Passed";
				   try {
					page.verifyParticipantsDeletedFromParticipantsList();
				   }
				   catch(Exception e)
				   {
					e.printStackTrace();   
					result="FAILED";
				   }
			}
		}
		public void verifyConfirmButtonDisplayed() {
			{
				result ="Passed";
				   try {
					page.verifyConfirmButtonDisplayed();
				   }
				   catch(Exception e)
				   {
					e.printStackTrace();   
					result="FAILED";
				   }
			}
		}
		public void verifyAutoUpdateWaitingList(){
			{
				result ="Passed";
				   try {
					page.verifyAutoUpdateWaitingList();
				   }
				   catch(Exception e)
				   {
					e.printStackTrace();   
					result="FAILED";
				   }
			}
		}	
		public void verifyParticipantsSearch() {
			{
				result ="Passed";
				   try {
					page.verifyParticipantsSearch();
				   }
				   catch(Exception e)
				   {
					e.printStackTrace();   
					result="FAILED";
				   }
			}
		}
		public void verifyAllFilterSearch() {
			{
				result ="Passed";
				   try {
					page.verifyAllFilterSearch();
				   }
				   catch(Exception e)
				   {
					e.printStackTrace();   
					result="FAILED";
				   }
			}
		}
		public void verifyPublishEventBtn() {
			{
				result ="Passed";
				   try {
					page.verifyPublishEventBtn();
				   }
				   catch(Exception e)
				   {
					e.printStackTrace();   
					result="FAILED";
				   }
			}
		}
		public void verifyAlertDisappearStartDateRegistartion() {
			{
				result ="Passed";
				   try {
					page.verifyAlertDisappearStartDateRegistartion();
				   }
				   catch(Exception e)
				   {
					e.printStackTrace();   
					result="FAILED";
				   }
			}
		   }
		public void verifyAlertDisappearLastDateRegistartion() {
			{
				result ="Passed";
				   try {
					page.verifyAlertDisappearLastDateRegistartion();
				   }
				   catch(Exception e)
				   {
					e.printStackTrace();   
					result="FAILED";
				   }
			}
		}
		}