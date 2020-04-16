package com.origin.fractal.testauto.pages;
import org.openqa.selenium.WebDriver;
import com.origin.fractal.testauto.FractalBasePage;
import com.wv.auto.framework.BrowserFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.origin.fractal.testauto.FractalBasePage;

public class ClassroomEventPage extends FractalBasePage{

	//edited by divya on 1st Oct 2019
	//private By FirstListItem = By.xpath(".//span[contains(text(),'Added on')]");
	private By FirstListItem = By.xpath(".//span[contains(text(),'Added on')]/../..");
	private By btnAddEvent = By.xpath(".//button[contains(text(),'Add Event')]");//.//h4[contains(text(),'Events')]/../../*//button[contains(text(),'Add Event')]
	private By eventPageTitle = By.xpath(".//h4[contains(text(),'New Event')]");
	private By btnContinue = By.xpath(".//button[contains(text(),'Continue')]");
	private By btnBack = By.xpath(".//button[contains(text(),'BACK')]");
	private By btnCancel = By.xpath("//button[@class='btn btn-cancel btn_radius ng-binding text-left']");//button[contains(text(),'CANCEL')]
	private By lblTraditionalClassroom = By.xpath(".//label[contains(text(),'Traditional Classroom')]");
	private By lblVirtualClassroom = By.xpath(".//label[contains(text(),'Virtual Classroom')]");
	private By dropdownAlertVenue = By.xpath(".//div[contains(text(),'Venue selection required.')]");
	private By dropdownAlertLink = By.xpath(".//div[contains(text(),'Provider selection required.')]");
	private By timezoneAlertMsg = By.xpath(".//div[contains(text(),'Timezone selection required')]");
	private By avgScoreAlertMsg = By.xpath("//div[contains(text(),'Average score required')]");
	//private By lblSession = By.xpath(".//h4[contains(text(),'Session')]");
	private By selectClassroomTypeAlert = By.xpath("//div[contains(text(),'Select classroom type')]");
	private By startTimeAlertMsg = By.xpath(".//div[contains(text(),'Start Time Required')]");
	private By endimeAlertMsg = By.xpath(".//div[contains(text(),'End Time Required')]");
	private By dropdownSelectInstructorAlertMsg = By.xpath("//div[contains(text(),'Instructor selection required')]");
	private By closeModel = By.xpath("//button/i/..");//button/i/.., .//button [contains(@class,' list-catalog')]
	private By venueDropdown = By.xpath("//h4[contains(text(),'Venue')]/../md-input-container/div/span[contains(text(),'Select')]");
	private By linkDropdown = By.xpath(".//div[contains(@class,'col-lg-12 col-md-12 col-sm-12 col-xs-12 padding-t-15 ng-scope')]//span[contains(@class,'current')][contains(text(),'Select')]");
	private By selectVenue = By.xpath(".//li[contains(text(),'Origin Learning Solutions')]");
	private By venueAlertMsg = By.xpath(".//h4[contains(text(),'Venue')]/../md-input-container/div[contains(@class,'text-danger')]");
	private By linkAlertMsg = By.xpath("//div[contains(text(),'Provider selection required')]");
	private By selectLink = By.xpath(".//li[contains(text(),'Zoom Origin')]");
	private By checkboxShowmap = By.xpath(".//label[@id='show_map_checkbox']");
	private By lblShowmap = By.xpath(".//label[@id='show_map_checkbox']/span");
	private By checkboxShowmapUnchecked = By.xpath(".//label[@id='show_map_checkbox']/../input[contains(@class,'ng-empty')]");
	private By checkboxShowmapChecked = By.xpath(".//label[@id='show_map_checkbox']/../input[contains(@class,'ng-not-empty')]");
	private By timeZoneAlertMsg = By.xpath(".//h4[contains(text(),'Time Zone')]/../div[contains(@class,'text-danger')]");
	private By timezoneDropdown = By.xpath(".//form[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[4]/div[1]/md-input-container[1]/div[1]/span[1]");
	private By selectTimezone = By.xpath(".//li[contains(text(),'EET Eastern European Time (GMT+2:00)')]");
	private By inpAvgScore = By.xpath(".//input[contains(@name,'avg_score')]");
	private By lblAssignment = By.xpath("//h4[@id='pre_assignment_title']");//pre_assignment_title
	private By lblAddAssignment = By.xpath("//button[@id='pre_addAssignment']");
	private By lblPassScore = By.xpath(".//span[contains(text(),'Pass score')]");//span[contains(text(),'Pass score')]/../../p[1]
	private By lblMaxScore = By.xpath(".//span[contains(text(),'Max score')]");//span[contains(text(),'Max score:')]/../../p[1]
	private By lblReleaseDate = By.xpath(".//span[contains(text(),'Release Date')]");
	private By lblSubmissionDueDate = By.xpath(".//span[contains(text(),'Submission Due Date')]");
	private By lblEvalDueDate = By.xpath(".//span[contains(text(),'Evaluation Due Date')]");
	private By lblCloseBtn = By.xpath("//div[@class='col-lg-12 col-md-12 col-sm-12 col-xs-12']//i[@class='icon text-right font-size-35 padding-r-30 padding-t-10']");
	private By btnPreAssignment = By.xpath("//h4[@id='pre_assignment_title']");
	private By btnPreAddAssignment = By.xpath(".//button[@id='pre_addAssignment']");
	private By inpPreEventAssignTitle = By.xpath(".//input[contains(@name,'pre_event_assignment_title')]");
	private By inpPreEventAssignDesc = By.xpath(".//div//div//label[contains(text(),'Assignment Description')]");//input[contains(@name,'pre_event_assignment_description')]
	private By lblPreSurvey =By.xpath(".//h4[@id='pre_survey_title']");//By.id('pre_survey_title')
	private By btnPreAddSurvey = By.id("pre_addSurvey");//By.xpath("//button[@id='pre_addSurvey']")
	private By inpPreSurveyLink = By.xpath(".//input[contains(@name,'survey_link')]");
	private By lblPreSurveyRelDate = By.xpath(".//h4[@id='pre_survey_title']/../../div/*//span[contains(text(),'Release Date')]");
	private By lblPreSurveySubDueDate = By.xpath(".//h4[@id='pre_survey_title']/../../div/*//span[contains(text(),'Submission Due Date')]");
	private By lblPreSurveyEvalDueDate = By.xpath(".//h4[@id='pre_survey_title']/../../div/*//span[contains(text(),'Evaluation Due Date')]");
	private By lblSession = By.xpath(".//h4[@id='session_title']");//By.id("session_title")
	private By sessionDate = By.xpath("//h4[@id='session_title']/../../../*//span[contains(text(),'Date')]");
	private By surveyStartTime = By.xpath("//h4[@id='session_title']/../../*//div[contains(text(),'Start Time')]");
	private By surveyEndTime = By.xpath("//h4[@id='session_title']/../../*//div[contains(text(),'End Time')]");
	private By dropdownSelectInstructor1 =By.xpath("//li[contains(text(),'Select Instructor')]/../li[2]");//html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/md-dialog-content[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[3]/md-input-container[1]/div[1]/ul[1]/li[2]
	private By dropdownSelectInstructor	=By.xpath(".//span[contains(text(),'Select Instructor')]");
	private By lblSelectCalendar=By.xpath(".//button[contains(@class,'md-datepicker-button md-icon-button md-button md-ink-ripple')]");
	private By dropdownSelectCalendar=By.xpath("//td[@class='md-calendar-date md-calendar-date-today md-focus']//span[@class='md-calendar-date-selection-indicator']");//td[@class='md-calendar-date md-calendar-date-today md-calendar-selected-date md-focus'](staging)
	private By lblCalendarHour=By.xpath("//div[contains(@class,'col-lg-12 col-md-12 col-sm-12 col-xs-12 padding-lr-0 display_inFlex11111111 margin-b-20')]//div[1]//input[1]");
	private By lblCalendarMinute=By.xpath("//div[contains(@class,'expand-collapse-content')]//div[1]//input[2]");
	private By lblPm=By.xpath("//select[contains(@name,'starttime_zone')]//option[contains(text(),'AM')]");
	private By lblPm1=By.xpath("//select[contains(@name,'starttime_zone')]");
	//private By lblPm=By.xpath("//body[@id='target']//div[contains(text(),'Start Time')]/../select/option[@value='PM']");//select[contains(@name,'starttime_zone')]//option[contains(@value,'PM')]
	private By insDropdoenAlertMshg = By.xpath("//h4[@id='session_title']/../../*//div[contains(text(),'Instructor selection required')]");
	private By lblPostAssessment = By.id("postassignment_title");
	private By lblAddPostAssessment = By.xpath("//button[@id='post_addAssignment']");
	private By lblPostAssessQualScore = By.xpath("//h4[@id='postassignment_title']/../../*//span[contains(text(),'Pass score')]");
	private By lblPostAssessSocreOutOf = By.xpath("//h4[@id='postassignment_title']/../../*//span[contains(text(),'Max score')]");
	private By postAssignReleaseDate = By.xpath("//h4[@id='postassignment_title']/../../*//span[contains(text(),'Release Date')]");
	private By postAssignSunDueDate = By.xpath("//h4[@id='postassignment_title']/../../*//span[contains(text(),'Submission Due Date')]");
	private By postlblAddAssignmentBtn = By.xpath("//h4[@id='postassignment_title']");
	private By postAddAssignmentBtn = By.xpath("//button[@id='post_addAssignment']");//post_addAssignment
	private By inpPostAssignTitle = By.xpath("//h4[@id='postassignment_title']/../../*//input[contains(@name,'post_event_assignment_title')]");
	private By inpPostAssignDesc = By.xpath(".//h4[@id='postassignment_title']/../../*//label[contains(text(),'Assignment Description')]");
	private By lblPostSurvey = By.id("postsurvey_title");
	private By btnPostAddSurvey = By.xpath(".//button[@id='post_addSurvey']");
	private By inpPostSurveyLink = By.xpath("//h4[@id='postsurvey_title']/../../*//input[contains(@name,'postsurvey_link')]");
	private By postSurveyRelDate = By.xpath("//h4[@id='postsurvey_title']/../../*//span[contains(text(),'Release Date')]");
	private By postSurveySubDueDate = By.xpath("//h4[@id='postsurvey_title']/../../*//span[contains(text(),'Submission Due Date')]");
	private By postSurveyEvalDueDate = By.xpath("//h4[@id='postsurvey_title']/../../*//span[contains(text(),'Evaluation Due Date')]");
	private By lblSendNotif = By.id("send_notification");
	private By lblRepeatNotif = By.id("repeat_notification");
	private By lblStartReminder = By.id("Reminder_hours");
	private By lblReminderSubmission = By.id("Reminder_submission");
	private By lblReminderEval = By.id("Reminder_evaluation");
	private By inpSendNotif = By.xpath("//input[@name='sendnotification']");
	private By inpRepeatNotif = By.xpath("//input[@name='repeatnotification']");
	private By inpStartReminder = By.xpath("//input[@name='startremainder']");
	private By inpReminderSubmission = By.xpath("//input[@name='remainder_submission']");
	private By inpReminderEval = By.xpath("//input[@name='remainder_evaluation']");
	private By btnRefUpload = By.xpath("//input[@id='reference']/../../label");
	private By lblTermsConditions = By.xpath("//h4[contains(text(),'Terms & Conditions')]");
	private By lblCompletionCriteria = By.id("completion_criteria_checkbox");
	private By lblClose = By.xpath("//button[@class='close padding-t-20']//i[@class='icon text-right font-size-35 padding-r-30 padding-t-10']");

	/*private By eventPageTitle = By.xpath("");
	private By eventPageTitle = By.xpath("");
	private By eventPageTitle = By.xpath("");
	private By eventPageTitle = By.xpath("");*/
	public ClassroomEventPage(WebDriver driver) {
	super(driver);
	}
	public void closeLobjModel() {
	click(closeModel);
	}
	public void clickOnClassroomItem() {
		wait(5);
	click(FirstListItem);
	}
	public void verifyAddEventPageOpened() {
	wait(10);
	click(btnAddEvent);
	wait(2);
	verifyText("New Event",eventPageTitle);
	wait(5);
	commanFunctionEventPage();
	}
	public void verifyAlertForAllFieldsInPage1() {
	wait(5);
	click(lblClose);
	wait(10);
	click(btnAddEvent);
	verifyText("New Event",eventPageTitle);
	wait(5);
	click(btnContinue);
	//click(btnBack);//Should remove
//	verifyText("Select Classroom Type",selectClassroomTypeAlert);
	verifyText("Timezone selection required",timezoneAlertMsg);
	click(lblTraditionalClassroom);
	verifyText("Venue selection required",dropdownAlertVenue);
	click(lblVirtualClassroom);
//	verifyText("Link Required",dropdownAlertLink);
//	verifyText("Average Score Required",avgScoreAlertMsg);
	click(lblSession);
	verifyText("Start Time Required",startTimeAlertMsg);
//	verifyText("End Time Required",endimeAlertMsg);
	verifyText("Instructor selection required",dropdownSelectInstructorAlertMsg);
	}
	public void verifySelectVenueDropdownAlertMsg() {
		wait(5);
		click(lblClose);
		wait(5);
		click(btnAddEvent);
		wait(5);
	//click(lblTraditionalClassroom);
	click(btnContinue);
	WebElement element = driver.findElement( By.xpath(".//div[contains(text(),'Venue selection required.')]")); Actions
	actions = new Actions(driver); actions.moveToElement(element);
	actions.perform();
	verifyText("Venue selection required",dropdownAlertVenue);
	}
	public void verifySelectLinkDropdownAlertMsg() {
	click(lblVirtualClassroom);
	WebElement element = driver.findElement( By.xpath(".//div[contains(text(),'Provider selection required.')]")); Actions
	actions = new Actions(driver); actions.moveToElement(element);
	actions.perform();
	verifyText("Provider selection required.",dropdownAlertLink);

	}

	//click(btnCancel);
	public void verifySelectClassroomTypeAlertMsg() {
	wait(5);
	click(btnAddEvent);
	click(btnContinue);
	//click(btnBack);//Should remove
//		verifyText("Select Classroom Type",selectClassroomTypeAlert);
	}
//		public void verifySelectVenueDropdownAlertMsg() {
	/*	WebElement element = driver.findElement( By.xpath(".//label[contains(text(),'Traditional Classroom')]")); Actions
	actions = new Actions(driver); actions.moveToElement(element);
	actions.perform();
	click(lblVirtualClassroom);
	wait(2);
	click(lblTraditionalClassroom);
	*/	
//		verifyText("Venue selection required",dropdownAlertVenue);
//		}

	public void verifyAverageScoreAlertMsg() {
//		verifyText("Average Score Required",avgScoreAlertMsg);
	}
	public void verifySessionStartTimeAlertMsg() {
		wait(5);
	click(lblSession);
	verifyText("Start Time Required",startTimeAlertMsg);
	}
	public void verifySessionEndTimeAlertMsg() {
//		verifyText("End Time Required",endimeAlertMsg);
	}
	public void verifySelectInstrtuctorAlertMsg() {
	verifyText("Select Instructor",dropdownSelectInstructorAlertMsg);
	print("*************************************************************");
	wait(30);
	}
	public void verifySelectInstrtuctorAlertMsgDisappears() {
	elementExist(dropdownSelectInstructorAlertMsg);
	closeLobjModel();
	}
	public void verifyPhysicalClassroomDropdown() {
	click(btnAddEvent);
	click(lblTraditionalClassroom);

	wait(5);
	//edited by divya on 30th sept 2019
	//verifyText("Select Venue",venueDropdown);
	verifyText("Select",venueDropdown);
	wait(10);

	wait(2);
	verifyText("Select Venue",venueDropdown);
	}
	public void verifyVirtualClassroomDropdown() {
		wait(5);
	click(lblVirtualClassroom);
	//edited by divya on 30th sept 2019
	//verifyText("select Link",linkDropdown);
	verifyText("Select",linkDropdown);
	wait(2);
	verifyText("select Link",linkDropdown);
	}
	public void verifyVenueDropdownAlertDisappears() {
	click(btnContinue);
	//click(btnBack);//Should remove
	click(lblTraditionalClassroom);
//edited by divya on 30th sept 2019
//verifyText("Venue Required",venueAlertMsg);
	verifyText("Venue selection required.",venueAlertMsg);
	click(venueDropdown);wait(5);
	click(selectVenue);
	wait(5);
	}
	public void verifyLinkDropdownAlertDisappears() {
	click(lblVirtualClassroom);wait(10);
	verifyText("Provider selection required.",linkAlertMsg);
	click(linkDropdown);wait(5);
//		click(selectLink);
	}
	public void verifyShowmapCheckbox() {
	click(lblTraditionalClassroom);
	verifyText("Show map",lblShowmap);
	}
	public void verifyShowmapCheckboxChecked() {
	click(checkboxShowmap);
	elementExist(checkboxShowmapChecked);
	}
	public void verifyShowmapCheckboxUnchecked() {
	click(checkboxShowmap);
	elementExist(checkboxShowmapUnchecked);
	}
	public void verifyTimezoneAlertDisappeared() {
	click(btnContinue);
	verifyText("Timezone Required",timeZoneAlertMsg);
	click(timezoneDropdown);
	click(selectTimezone);
	elementExist(timeZoneAlertMsg);
	}
	public void verifyAvgScoreAlertDisappears() {
	verifyText("Average score Required",avgScoreAlertMsg);
	enterData("35",inpAvgScore);
	elementExist(avgScoreAlertMsg);
	}
	public void verifyAvgScoreAcceptsAlphabets() {
	clear(inpAvgScore);
	enterData("abc",inpAvgScore);
	elementExist(avgScoreAlertMsg);
	}
	public void verifyAvgScoreAcceptsSpecialChars() {
	clear(inpAvgScore);
	enterData("%^&",inpAvgScore);
	elementExist(avgScoreAlertMsg);
	}
	public void verifyAvgScoreAcceptsAlphanumeric() {
	clear(inpAvgScore);
	enterData("9am",inpAvgScore);
	elementExist(avgScoreAlertMsg);
	}
	public void verifyAvgScoreAcceptsMoretha2DIgits() {
	clear(inpAvgScore);
	enterData("777",inpAvgScore);
	getAttributeValue(inpAvgScore);
	verifyText("777",inpAvgScore);
	}
	public void verifyAssignDetailsDisplayed() {
	click(btnAddEvent);
	wait(2);
	click(lblAssignment);
	wait(2);
	//click(lblAssignment);
	wait(2);
	WebElement element1 = driver.findElement(By.xpath("//button[contains(text(),'Add Assignment')]")); Actions
	actions1 = new Actions(driver); actions1.moveToElement(element1);
	actions1.perform();
	wait(5);
	click(By.xpath("//button[@id='pre_addAssignment']"));
	verifyText("Pass score: 50%",lblPassScore);
	verifyText("Max score: 100",lblMaxScore);

	wait(2);
	WebElement element = driver.findElement(lblAddAssignment); Actions
	actions = new Actions(driver); actions.moveToElement(element);
	actions.perform();
	click(lblAddAssignment);
	wait(2);
	verifyText("Pass score",lblPassScore);
	verifyText("Max score",lblMaxScore);

	verifyText("Release Date",lblReleaseDate);
	verifyText("Submission Due Date",lblSubmissionDueDate);
	verifyText("Evaluation Due Date",lblEvalDueDate);
	}
	public void verifyPreAssessmentCount() {
	String getText = getText(lblAssignment);
//	String count = getSubString(getText, getText.length()-2, getText.length()-1);
	//int assignCount = getNumber(count);
//	verifyText(count,"2");
	}
	public void verifyAddAssignmentBtn() {
	verifyText("Add Assignment", btnPreAddAssignment);
	}
	public void verifyNewPreAssignmentForm() {
		wait(5);
	/*	scrollToElement(btnPreAddAssignment);wait(5);
		click(btnPreAddAssignment);
		verifyText("Assignment Title",getAttributeValue(inpPreEventAssignTitle));
		verifyText("Assignment Description",getAttributeValue(inpPreEventAssignDesc));
		verifyText("Add Assignment", btnPreAddAssignment);
	*/}
	public void verifySurveyDetailsDisplayed() {
	wait(5);
	scrollToElement(lblPreSurvey);
	wait(5);
//		click(lblPreSurvey);
//		verifyText("Add Survey",btnPreAddSurvey);
	}
	public void verifyPreSurveyAddBtn() {
	verifyText("Add Survey",btnPreAddSurvey);
	}
	public void verifyPreSurveyFormDetails() {
	scrollToElement(btnPreAddSurvey);
	wait(5);
	click(btnPreAddSurvey);
	wait(2);
	verifyText("survey Link",getAttributeValue(inpPreSurveyLink));
	verifyText("Release Date",lblPreSurveyRelDate);
	verifyText("Submission Due Date",lblPreSurveySubDueDate);
	verifyText("Evaluation Due Date",lblPreSurveyEvalDueDate);
	}
	public void verifySessionDetailsDisplayed() {
	wait(5);
	scrollToElement(lblSession);wait(5);
	/*	click(lblSession);
	verifyText("Date",sessionDate);
	verifyText("Start Time",surveyStartTime);
	verifyText("End Time",surveyEndTime);
	*/	verifyText("Select Instructor",dropdownSelectInstructor);
	}
	public void verifyInstructorDropdownAlertMsg() {
	verifyText("Select Instructor",dropdownSelectInstructor);
	click(btnCancel);
	}
	public void verifyInstructorDropdownAlertDisappears() {
	elementExist(dropdownSelectInstructor);
	}
	public void verifyPostAssignmentDetails() {
	wait(2);
	click(btnAddEvent);
	scrollToElement(lblPostAssessment);wait(5);
	click(lblPostAssessment);
	wait(2);
	scrollToElement(lblAddPostAssessment);
	click(lblAddPostAssessment);
	verifyText("Qualification score: ",lblPostAssessQualScore);
	verifyText("Scoring out of: ",lblPostAssessSocreOutOf);
	verifyText("Release Date",postAssignReleaseDate);
	verifyText("Submission Due Date",postAssignSunDueDate);
	}
	public void verifyPostAssignmentCount() {
	String getText = getText(lblPostAssessment);
//	String count = getSubString(getText, getText.length()-2, getText.length()-1);
//  int assignCount = getNumber(count);
	verifyText("Assignment ()",getText);
	}
	public void verifyPostAddAssignmentBtn() {
	verifyText("Add Assignment", postAddAssignmentBtn);
	}
	public void verifyPostAddAssignmentDetails() {
	wait(2);
	scrollToElement(postlblAddAssignmentBtn);
	wait(2);
/*	click(postlblAddAssignmentBtn);
	wait(2);
	click(postAddAssignmentBtn);
	wait(5);
	verifyText("Assignment Title",getAttributeValue(inpPostAssignTitle));
	wait(5);
	verifyText("Assignment Description",getAttributeValue(inpPostAssignDesc));
*/	}
	public void verifyPostSurveyDetails() {
	wait(2);
	scrollToElement(By.id("postsurvey_title"));
	//WebElement element = driver.findElement( By.id("postsurvey_title")); 
	//edited by divya on 1st Oct 2019
//	if(BrowserFactory.getOS() == "win") {
//	Actions actions = new Actions(driver); actions.moveToElement(element);
//	actions.perform();
	//}
	wait(2);
	click(By.id("postsurvey_title"));
	wait(2);
	verifyText("Add Survey",btnPostAddSurvey);
	}
	public void verifyPostAddSurveyButton() {
	verifyText("Add Survey",btnPostAddSurvey);
	}
	public void verifyPostAddSurveyFormFields() {
	wait(5);
	click(lblPostSurvey);
	wait(2);
	click(btnPostAddSurvey);
	verifyText("Assignment Title",getAttributeValue(inpPostSurveyLink));
	verifyText("Release Date",postSurveyRelDate);
	verifyText("Submission Due Date",postSurveySubDueDate);
	verifyText("Evaluation Due Date",postSurveyEvalDueDate);
	}
	public void verifyNotifAndReminder() {
	click(btnAddEvent);
	scrollToElement(lblSendNotif);
	wait(5);
	verifyText("Send Notification days before the event",lblSendNotif);
	verifyText("Repeat every days(s)",lblRepeatNotif);
	verifyText("Start Reminder Hours before the event",lblStartReminder);
	verifyText("Start Reminder for assignment submission days before due date",lblReminderSubmission);
	verifyText("Start Reminder for assignment evaluation days before due date",lblReminderEval);
	}
	public void verifyNotifAndReminderFieldsAcceptsAlphabets() {
		wait(10);
	enterData("abc",inpSendNotif);
	enterData("abc",inpRepeatNotif);
	enterData("abc",inpStartReminder);
	enterData("abc",inpReminderSubmission);
	enterData("abc",inpReminderEval);
	}
	public void verifyNotifAndReminderFieldsAcceptsAlphaNumerics() {
	enterData("a2b",inpSendNotif);
	enterData("a2b",inpRepeatNotif);
	enterData("a2b",inpStartReminder);
	enterData("a2b",inpReminderSubmission);
	enterData("a2b",inpReminderEval);
	}
	public void verifyNotifAndReminderFieldsAcceptsSpecialChars() {
	enterData("1@#",inpSendNotif);
	enterData("1@#",inpRepeatNotif);
	enterData("1@#",inpStartReminder);
	enterData("1@#",inpReminderSubmission);
	enterData("1@#",inpReminderEval);
	}
	public void verifyNotifAndReminderFieldsAcceptsNumbers() {
		wait(10);
	enterData("123",inpSendNotif);
	enterData("123",inpRepeatNotif);
	enterData("123",inpStartReminder);
	enterData("123",inpReminderSubmission);
	enterData("123",inpReminderEval);
	}
	public void verifyReferenceUploadBtn() {
//		verifyText("Attachment",btnRefUpload);
	}
	public void verifyTermsConditions() {
		wait(5);
	verifyText("Terms & Conditions",lblTermsConditions);
	//edit by divya on 1st oct 2019
	wait(5);
	//edit by divya on 1st oct 2019
	closeLobjModel();
	wait(5);
	}
	public void verifySecondPageOpened() {
	wait(5);
	//commented by divya as I have updated
	click(btnAddEvent);
	//fillFirstPage();
//		wait(5);
//		click(lblSelectCalendar);
//		wait(2);
//		click(dropdownSelectCalendar);
//		wait(2);
//		WebElement element = driver.findElement(dropdownSelectInstructor); Actions
//		actions = new Actions(driver); actions.moveToElement(element);
//		actions.perform();
//	//dd	actions.sendKeys(Keys.PAGE_UP).build().perform();
//actions.build().perform();
//		wait(5);
//	
//		//click(dropdownSelectInstructor1);
//		wait(5);
//		enterData("10",lblCalendarHour);
//		wait(5);
//		enterData("50",lblCalendarMinute);
//		wait(5);
//		click(lblPm);
//		click(dropdownSelectInstructor);
//		wait(5);
//		click(dropdownSelectInstructor1);
//		wait(5);
//	/*dd	WebElement element1 = driver.findElement(By.xpath("//span[contains(text(),'Date')]")); Actions
//			actions1 = new Actions(driver); actions1.moveToElement(element1);
//			actions1.perform();
//			wait(5);
//		click(lblSelectCalendar);
//		wait(2);
//		click(dropdownSelectCalendar);dd*/
//	//	h4[contains(text(),'Pre-event Activities')]
//		/*enterData("10",lblCalendarHour);
//		enterData("50",lblCalendarMinute);
//		click(lblPm);*/
//		wait(2);
	//edi by divya
	click(lblTraditionalClassroom);wait(10);
	click(venueDropdown);wait(5);
	WebElement element = driver.findElement(By.xpath(".//li[contains(text(),'Origin Learning Solutions')]")); Actions
	actions = new Actions(driver); actions.moveToElement(element);
	actions.perform();
	wait(5);
	click(selectVenue);
	wait(5);
	click(timezoneDropdown);
	wait(5);
	click(selectTimezone);
//	enterData("35",inpAvgScore);
	click(lblSession);
	wait(10);
	click(lblSelectCalendar);
	wait(5);
	click(dropdownSelectCalendar);
    JavascriptExecutor js = (JavascriptExecutor) driver;
    WebElement Element = driver.findElement(By.xpath("//h4[contains(text(),'Terms & Conditions')]"));

    js.executeScript("arguments[0].scrollIntoView();", Element);

	wait(5);	
	JavascriptExecutor js1 = (JavascriptExecutor) driver;
	WebElement element1 = driver.findElement(By.xpath("//h4[contains(text(),'Terms & Conditions')]")); 
	js1.executeScript("arguments[0].scrollIntoView();", element1);
   // js.executeScript("window.scrollBy(0,100)");

	wait(5);
	//Actions
//	actions1 = new Actions(driver); actions1.moveToElement(element1);
//	actions1.perform();
	wait(5);
	scrollToElement(By.xpath("//div[contains(text(),'Start Time')]"));
	wait(5);
	enterData("10", lblCalendarHour);
	wait(5);
	scrollToElement(By.xpath("//h4[contains(text(),'Post-event Activities')]"));
	wait(5);
	JavascriptExecutor js2 = (JavascriptExecutor) driver;
    WebElement Element1 = driver.findElement(By.xpath("//div[contains(text(),'Start Time')]"));
    js2.executeScript("arguments[0].scrollIntoView();", Element1);
    wait(4);
	enterData("50",lblCalendarMinute);
	wait(2);
//	click(By.xpath("//select[contains(@name,'starttime_zone')]//option[2]"));
	WebElement element3= driver.findElement(By.xpath("//select[@name='starttime_zone']"));
	Actions builder= new Actions(driver);
	builder.moveToElement(element3).click(element3);
	builder.perform();
	wait(2);
	click(lblPm);
	wait(2);
	click(dropdownSelectInstructor);
/*	verifyText("Select Instructor",insDropdoenAlertMshg);
*/	wait(5);
	click(dropdownSelectInstructor1);
	wait(5);
	click(btnContinue);
		wait(5);
		verifyText("Auto update waiting list on cancellation",lblCompletionCriteria);
	}
	public void fillFirstPage() {
	wait(2);
	click(btnContinue);
	wait(2);
	click(lblTraditionalClassroom);
	wait(10);
	click(venueDropdown);wait(5);
	click(selectVenue);
	wait(5);
	click(timezoneDropdown);
	click(selectTimezone);
//	enterData("35",inpAvgScore);
//	click(lblSession);
	wait(2);
	WebElement element = driver.findElement(By.xpath("//h4[contains(text(),'Pre-event Activities')]")); Actions
	actions = new Actions(driver); actions.moveToElement(element);
	actions.perform();
	//click(dropdownSelectInstructor);
	verifyText("Instructor selection required.",insDropdoenAlertMshg);
	}
	public void verifySecondPageAlertMsgs() {
		wait(2);
	click(btnSave);
	wait(5);
	elementExist(maxParticipantErr);
	wait(2);
	verifyText("Maximum participants required.",maxParticipantErr);
	wait(2);
	verifyText("Minimum participants required.",minParticipantErr);
	wait(2);
	verifyText("Start Date For registration required.",startDateRegistErr);
	wait(2);
	verifyText("Last Date For registration required.",lastDateRegistErr);
	wait(2);
	scrollToElement(lastDateCancelErr);
	wait(2);
	verifyText("Last Date For cancellation required.",lastDateCancelErr);
	}
	public void verifyMaxNumParticipAcceptNum() {
	enterData("12",inpMaxParticipants);
	elementExist(maxParticipantErr);
	}
	public void verifyMaxNumParticipAcceptAlphaNumeric() {
		wait(5);
		elementExist(inpMaxParticipants);
	enterData("1a@",inpMaxParticipants);
	elementExist(maxParticipantErr);
	}
	public void verifyMaxNumParticipAcceptSpecialChars() {
	click(btnSave);
	clear(inpMaxParticipants);
	enterData("@#!",inpMaxParticipants);
	verifyText("Maximum Participants Required",maxParticipantErr);
	}
	public void verifyMaxNumParticipAcceptAlphabets() {
	clear(inpMaxParticipants);
	enterData("aBc",inpMaxParticipants);
	verifyText("Maximum Participants Required",maxParticipantErr);
	}
	public void verifyMaxParticipAlertDisappears() {
	enterData("2",inpMaxParticipants);
	elementExist(maxParticipantErr);
	}
	public void verifyMinNumParticipAcceptNum() {
	enterData("12",inpMinParticipants);
	elementExist(minParticipantErr);
	}
	public void verifyMinNumParticipAcceptAlphaNumeric() {
	enterData("1a@",inpMinParticipants);
	elementExist(minParticipantErr);
	}
	public void verifyMinNumParticipAcceptSpecialChars() {
	clear(inpMinParticipants);
	enterData("@#!",inpMinParticipants);
	verifyText("Minimum Participants Required",minParticipantErr);
	}
	public void verifyMinNumParticipAcceptAlphabets() {
	clear(inpMinParticipants);
	enterData("aBc",inpMinParticipants);
	verifyText("Maximum Participants Required",minParticipantErr);
	}
	public void verifyMinNumParticipAlertDisappears() {
	clear(inpMinParticipants);
	enterData("2",inpMinParticipants);
	elementExist(minParticipantErr);
	}
	public void verifyCancellationPolicy(){
	verifyText("Cancellation Policy",lblCancellationPolicy);

	}

	private By btnSave = By.xpath(".//button[contains(@value,'Create')]");
	private By maxParticipantErr = By.xpath(".//div[@id='max_participants_err']");
	private By minParticipantErr = By.id("min_participants_err");
	private By startDateRegistErr = By.id("startdate_registration_err");
	private By lastDateRegistErr = By.id("lastdate_registration_err");
	private By lastDateCancelErr = By.id("lastdate_cancellation_err");
	private By lblCalenderClickStart = By.xpath("//md-datepicker[@id='startdate_registration']//button[contains(@class,'md-datepicker-button md-icon-button md-button md-ink-ripple')]");
	private By startDateSelecting = By.xpath("//span[contains(@class,'md-calendar-date-selection-indicator')]");
	private By lblCalenderClickLast = By.xpath("//md-datepicker[@id='lastdate_registration']//button[contains(@class,'md-datepicker-button md-icon-button md-button md-ink-ripple')]");
	private By lastDateSelecting = By.xpath(".//td[@id='md-4-month-2019-6-8']//span[contains(text(),'8')]");//td[@id='md-6-month-2019-6-8']
	private By lblCalenderClickCancellation = By.xpath(".//md-datepicker[@id='lastdate_cancellation']//button[contains(@class,'md-datepicker-button md-icon-button md-button md-ink-ripple')]");
	private By lastDateSelectingCancellation = By.xpath(".//span[@class='md-calendar-date-selection-indicator']");
	private By minExceedMaxErr = By.id("errMinExceedLength");//Minimum limit Should not Exceed the Maximum Limit
	private By inpMaxParticipants = By.xpath("//input[contains(@name,'max_participants')]");//input[@id='input_27']
	private By inpMinParticipants = By.xpath("//input[contains(@name,'min_participants')]");//input[@id='input_28']
	private By inpWaitingThreshold = By.xpath("//input[contains(@name,'wait_threshold')]");//input[@id='input_29']

	private By lblCancellationPolicy = By.xpath("//textarea[@name='cancellation_policy']");
	private By tickMarkBtn = By.xpath(".//i[@id='icon_tick']");
	private By plusBtn = By.xpath("//i[@id='icon_plus']");
	private By selectUser1 = By.xpath("//form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/span[1]");//div[@class='row title_name']/span[contains(text(),'soumyaranjan.d@originlearning.com')]
	private By selectUser2= By.xpath("//form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/span[1]");//div[@class='row title_name']/span[contains(text(),'automation_directuser@originlearning.com')]
	private By lblSeatsFullWaitingListText= By.xpath("//p[contains(@class,'ng-binding')]");
	private By lblOk= By.xpath("//span[contains(text(),'OK')]");
	private By lblConfirm= By.xpath("//button[contains(text(),'SAVE')]");
	
	
	private By lblDelete1= By.xpath(".//div[contains(@class,'col-lg-12 col-sm-6 col-md-6 col-xs-6 margin-l-30')]//i[contains(@class,'icon text-right font-size-14 gray-85')]");
	private By lblDelete2= By.xpath(".//div[contains(@class,'col-lg-12 col-sm-6 col-md-6 col-xs-6 margin111-l-30 margin-l-15')]//i[contains(@class,'icon text-right font-size-14 gray-85')]");
	private By lblAutoUpdate= By.xpath(".//label[@id='completion_criteria_checkbox']");
	private By lblParticipantsSearch= By.xpath(".//input[@id='participants_Search']");
	private By lblBusinessText= By.xpath(".//span[contains(text(),'Business')]");
	private By lblDirectText= By.xpath(".//span[contains(text(),'Direct')]");
	private By lblDurationScoreErr= By.xpath(".//div[contains(text(),'Start Time Required')]");
	private By BtnPublishEvent= By.xpath(".//button[contains(text(),'Publish Event')]");
	private By BtnSave= By.xpath(".//button[contains(text(),'SAVE')]");
	public void commanFunctionEventPage() {
	click(lblTraditionalClassroom);wait(10);
	click(venueDropdown);wait(5);
	WebElement element = driver.findElement(By.xpath(".//li[contains(text(),'Origin Learning Solutions')]")); Actions
	actions = new Actions(driver); actions.moveToElement(element);
	actions.perform();
	wait(5);
	click(selectVenue);
	wait(5);
	click(timezoneDropdown);
	wait(10);
	click(selectTimezone);
//	enterData("35",inpAvgScore);
	click(lblSession);
	wait(10);
   click(lblSelectCalendar);
	wait(5);
	click(dropdownSelectCalendar);
//    JavascriptExecutor js = (JavascriptExecutor) driver;
//    WebElement Element = driver.findElement(By.xpath("//h4[contains(text(),'Terms & Conditions')]"));
//
//    js.executeScript("arguments[0].scrollIntoView();", Element);
//
//	wait(5);	
//	JavascriptExecutor js1 = (JavascriptExecutor) driver;
//	WebElement element1 = driver.findElement(By.xpath("//h4[contains(text(),'Terms & Conditions')]")); 
//	js1.executeScript("arguments[0].scrollIntoView();", element1);
   // js.executeScript("window.scrollBy(0,100)");

	wait(5);
	//Actions
//	actions1 = new Actions(driver); actions1.moveToElement(element1);
//	actions1.perform();
	wait(5);
//dd	scrollToElement(By.xpath("//div[contains(text(),'Start Time')]"));
scrollToElement(By.xpath("//h4[contains(text(),'Terms & Conditions')]"));
wait(5);
	scrollToElement(By.xpath("//div[contains(text(),'Start Time')]"));
		wait(5);
	//click(lblPm);
	enterData("10", lblCalendarHour);
	wait(5);
	enterData("50",lblCalendarMinute);
	wait(5);
	//click(lblPm1);
	wait(2);
	//click(By.className("custm_time ng-pristine ng-empty ng-invalid ng-invalid-required ng-touched"));
	wait(5);
	click(By.xpath("//select[contains(@name,'starttime_zone')]"));
	wait(2);
	click(By.xpath("//select[contains(@name,'starttime_zone')]//option[contains(@value,'AM')]"));
	wait(2);
	click(dropdownSelectInstructor);
/*	verifyText("Select Instructor",insDropdoenAlertMshg);
*/	wait(5);
	click(dropdownSelectInstructor1);
	wait(5);
	/*ddenterData("10",lblCalendarHour);
	wait(5);
	enterData("50",lblCalendarMinute);
	wait(2);
	click(lblPm);
	wait(2);dd*/
	/*
    	*/

	click(btnContinue);
	wait(2);
	}
	public void verifyTickAndPlusMark() {
	wait(2);
	click(tickMarkBtn);
	wait(2);
	click(plusBtn);
	}
	public void verifyAlertAfterAddingMaximumNumberOfParticipants(){
	click(BtnSave);
	wait(2);
	enterData("1",inpMaxParticipants);
	wait(2);
	}
	public void verifyAlertAfterAddingMinimumNumberOfParticipants() {
	enterData("1",inpMinParticipants);
	wait(2);
	enterData("1",inpWaitingThreshold);
	wait(2);
	click(tickMarkBtn);
	}
	public void  verifyAddTheUsersInParticipantsList() {
	wait(2);
	elementExist(By.xpath("//div[@class='row title_name']/span[contains(text(),'soumyaranjan.d@originlearning.com')]"));{
	click(selectUser1);
	}
	click(selectUser2);
	verifyText("Seats are full, users will be moved to the wait list.",lblSeatsFullWaitingListText);
	click(lblOk);
	}
	public void verifyParticipantsDeletedFromParticipantsList() {
	wait(2);
	click(lblDelete1);
	wait(2);
	click(lblDelete2);
	}
	public void verifyConfirmButtonDisplayed() {
	wait(2);
	click(selectUser1);
	click(selectUser2);
	verifyText("Seats are full, users will be moved to the wait list.",lblSeatsFullWaitingListText);
	click(lblOk);
	wait(2);
	verifyText("SAVE",lblConfirm);
	wait(2);
	elementExist(lblAutoUpdate);

	}
	public void verifyAutoUpdateWaitingList() {
	wait(5);
	click(lblAutoUpdate);
	}
	public void verifyParticipantsSearch() {
	elementExist(lblParticipantsSearch);
	wait(5);
	enterData("vel@winvinaya.com",lblParticipantsSearch);
	}
	public void verifyAllFilterSearch() {
	wait(2);
	verifyText("Business",lblBusinessText);
	verifyText("Direct",lblDirectText);
	wait(2);
	click(lblBusinessText);
	wait(2);
	click(lblDirectText);
	}
	public void verifyPublishEventBtn() {
	wait(2);
//	verifyText("PUBLISH EVENT",BtnPublishEvent);
	}
	public void verifyAlertDisappearStartDateRegistartion() {
	click(btnSave);
	verifyText("Start date for registration required",startDateRegistErr);
	wait(2);
	click(lblCalenderClickStart);
	wait(2);
	click(startDateSelecting);
	elementExist(startDateRegistErr);

	}
	public void verifyAlertDisappearLastDateRegistartion() {
	wait(2);
	verifyText("Last date for registration required",lastDateRegistErr);
	wait(2);
	click(lblCalenderClickLast);
	wait(3);
//		click(lastDateSelecting);
	elementExist(lastDateRegistErr);
	}
	public void verifyAlertDisappearStartDateCancellation() {
	wait(2);
	verifyText("Last date for registration required",lastDateRegistErr);
	wait(2);
	click(lblCalenderClickCancellation);
	wait(3);
	click(lastDateSelectingCancellation);
	elementExist(lastDateRegistErr);
	}


}
