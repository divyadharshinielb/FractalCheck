		package com.origin.fractal.testauto.steps;
		
		import org.openqa.selenium.WebDriver;
		
		import com.origin.fractal.testauto.FractalBaseStep;
		import com.origin.fractal.testauto.pages.ClassroomEventPage;
		import com.origin.fractal.testauto.pages.VenuePage;
		
		public class ClassroomEventSteps extends FractalBaseStep {
		public ClassroomEventPage page;
		public ClassroomEventSteps(WebDriver driver) {
		page = new ClassroomEventPage(driver);
		fBPage = page;
		}
		public void clickOnClassroomItem() {
			result ="PASSED";
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
				result ="PASSED";
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
				result ="PASSED";
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
				result ="PASSED";
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
				result ="PASSED";
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
				result ="PASSED";
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
				result ="PASSED";
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
				result ="PASSED";
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
				result ="PASSED";
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
				result ="PASSED";
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
					result ="PASSED";
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
				result ="PASSED";
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
				result ="PASSED";
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
				result ="PASSED";
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
				result ="PASSED";
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
				result ="PASSED";
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
				result ="PASSED";
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
				result ="PASSED";
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
				result ="PASSED";
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
				result ="PASSED";
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
				result ="PASSED";
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
				result ="PASSED";
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
				result ="PASSED";
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
				result ="PASSED";
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
				result ="PASSED";
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
				result ="PASSED";
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
				result ="PASSED";
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
				result ="PASSED";
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
				result ="PASSED";
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
				result ="PASSED";
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
				result ="PASSED";
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
				result ="PASSED";
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
				result ="PASSED";
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
				result ="PASSED";
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
				result ="PASSED";
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
				result ="PASSED";
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
				result ="PASSED";
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
				result ="PASSED";
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
				result ="PASSED";
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
				result ="PASSED";
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
				result ="PASSED";
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
				result ="PASSED";
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
				result ="PASSED";
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
				result ="PASSED";
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
				result ="PASSED";
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
				result ="PASSED";
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
				result ="PASSED";
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
				result ="PASSED";
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
				result ="PASSED";
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
				result ="PASSED";
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
				result ="PASSED";
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
				result ="PASSED";
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
				result ="PASSED";
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
				result ="PASSED";
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
				result ="PASSED";
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
				result ="PASSED";
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
				result ="PASSED";
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
				result ="PASSED";
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
				result ="PASSED";
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
				result ="PASSED";
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
				result ="PASSED";
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
				result ="PASSED";
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
				result ="PASSED";
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
				result ="PASSED";
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
				result ="PASSED";
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
				result ="PASSED";
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
				result ="PASSED";
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
				result ="PASSED";
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
				result ="PASSED";
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
				result ="PASSED";
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
				result ="PASSED";
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
				result ="PASSED";
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
				result ="PASSED";
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
				result ="PASSED";
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