package com.origin.fractal.testauto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import com.origin.fractal.testauto.FractalBasePage;
import com.wv.auto.framework.BrowserFactory;

public class DeleteEventandClassroomPage extends FractalBasePage {
	private By searchField = By.xpath("//input[@id='searchClassroom']");
	private By dropDown1 = By.xpath("//div[@class='select-background learningobjectslist float-left select-180']");
	private By dropDown = By.xpath("//li[contains(text(),'LMS Admin')]");
	private By categoriesDropDown1 = By.xpath("//li[contains(text(),'Created By All')]");
	private By categoriesDropDown2=By.xpath("//li[contains(text(),'Content Admin')]");
	private By categoriesDropDown = By.xpath("//li[contains(text(),'All Categories')]");
	private By addClassroomBtn = By.xpath("//button[contains(text(),'Add Classroom')]");
	private By lblNoRecordsFoundText = By.xpath("//div[contains(text(),'No Records Found')]");
	private By closeBtn = By.xpath("//i[contains(@class,'text-right font-size-35 padding-r-30 padding-t-10')]");
	private By addEventBtn = By.xpath("//body[@id='target']//div//div//div[1]/div[1]/div[1]//i[@title='Add Event']");
	private By editBtn = By.xpath("//body[@id='target']//div//div//div[1]/div[1]/div[1]//i[@title='Edit']");
	private By deleteBtn = By.xpath("//body[@id='target']//div//div//div[1]/div[1]/div[1]//i[ @title='Delete']");
	private By cancelBtn = By.xpath("//span[contains(text(),'Cancel')]");
	private By continueBtn = By.xpath("//button[contains(text(),'Continue')]");
	private By classroomNameReqText = By.xpath("//div[contains(text(),'Classroom title required.')]");//div[contains(text(),'Classroom Title required')]
    private By venueNameReqText = By.xpath("//div[contains(text(),'Traditional classroom venue selection required')]");
    private By classroomCategoryReqText = By.xpath("//div[contains(text(),'Classroom category selection required')]");
    private By skillsetReqText = By.xpath("//div[contains(text(),'Skillset selection required.')]");
    private By InstructorSelectionReqText = By.xpath("//span[contains(text(),'Instructor(s) selection required.')]");
    private By classroomDescriptionReqText = By.xpath("//div[contains(text(),'Classroom description required')]");
    private By titleCaution = By.xpath("//input[@name='classroom_name']");
    private By classroomTitleCautionText = By.xpath("//div[contains(text(),'Classroom title must be 4 or more characters.')]");//div[contains(text(),'Classroom Title must be 4 or more characters')]
    private By completionCriteriaCheckUncheckOBj1 =By.xpath("//form[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[6]/div");
    private By completionCriteriaCheckUncheckOBj2 =By.xpath("]/label[1]");
    private By clickSingleInstructorBtn = By.xpath("//label[contains(text(),'Single Instructor')]");
    private By selectSingleInstructor = By.xpath("//div[@class='select-background form-group margin-all-0 cus_mar_b_30 select-180 padding-l-20']//span[@class='current'][contains(text(),'Select')]");
    private By clickMultipleInstructorBtn = By.xpath("//label[contains(text(),'Multiple Instructors')]");
    private By selectMultipleInstructor = By.xpath("//input[contains(@class,'ui-select-search input-xs ng-pristine ng-valid ng-empty ng-touched')]");
    private By clickClassroomPage = By.xpath(".//div[@class='col-lg-12 col-md-12 col-sm-12 col-xs-12 padding-all-0 ng-scope']//div[1]//div[1]//div[1]//div[4]//div[1]//span[1]");
    private By detail1 = By.xpath("//span[contains(text(),'Category:')]");
    private By detail2 = By.xpath("//div[contains(text(),'View Details')]");
    private By detail3 = By.xpath("//div[contains(text(),'Back to Classroom List')]");
    private By classroomDropDown = By.xpath("//div[@class='nice-select ng-pristine ng-untouched ng-isolate-scope ng-empty ng-invalid ng-invalid-required open']//li[@class='option'][contains(text(),'3D Animation')]");
    private By classroomDropDown1 = By.xpath("//li[contains(text(),'Origin Learning Solutions')]");//li[contains(text(),'Ramanujan Museum & Math Education Centre')]
    private By classroomDropDown3 = By.xpath("//span[contains(text(),'Classroom Organization.')]");
    private By classroomDropDown2 = By.xpath("//input[@placeholder='Select']");
    private By classroomDropDown4 = By.xpath("//li[contains(text(),'Automation directuser')]");//li[contains(text(),'prema jegan')]
    private By classroomDropDown5 = By.xpath("//div[contains(@class,'select-background form-group margin-all-0 cus_mar_b_30 select-180 padding-l-20')]//span[contains(@class,'current')][contains(text(),'Select')]");
    private By lblSelect =By.xpath("//md-input-container[@class='flex']//span[@class='current'][contains(text(),'Select')]");
    private By selectDropDown=By.xpath("//div[@class='nice-select ng-pristine ng-untouched ng-isolate-scope ng-empty ng-invalid ng-invalid-required open']//li[@class='option'][contains(text(),'General')]");
    private By lblSelectVenue= By.xpath("//form[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[7]/div[2]/div[1]/md-input-container[1]/div[1]/span[1]");
    private By lblVirtualClassroom= By.xpath("//label[contains(text(),'Zoom')]");
    private By lblAvgScore= By.xpath("//input[@type='number']");
  //classroompage  private By lblSession= By.xpath("//label[@id='session_expand']");
    private By lblDuration= By.xpath("//label[contains(text(),'Approx Duration')]");
    private By lblSessionRadioBtn= By.xpath("//li[@class='timeline__step cursor-pointer done']//i[@class='timeline__step-marker']");
    private By pre_eventRadioBtn= By.xpath("//label[@id='pre_event_assignment_checkbox']");
    private By post_eventRadioBtn= By.xpath("//label[@id='post_event_survey_checkbox']");
    private By post_eventTextLink= By.xpath("//input[@name='pre_event_survey_link']");
    private By pre_eventAssignmentCheckbox= By.xpath("//label[@id='pre_event_assignment_checkbox']");
    private By post_eventAssignmentCheckbox= By.xpath(".//label[@id='post_event_assignment_checkbox']");
    private By pre_eventAssignmentTitle= By.xpath("//label[contains(text(),'Assignment Title')]");
    private By pre_eventAssignmentDescription= By.xpath("//label[@class='font-size-14 text-bcbcbc font-weight-400 md-required'][contains(text(),'Description')]");//label[contains(text(),'Assignment Description')]
    private By pre_eventQualificationScore= By.xpath("//span[contains(text(),'Pass score')]");
    private By pre_eventScoring= By.xpath("//span[contains(text(),'Max score')]");
    private By pre_eventReleaseText= By.xpath("//label[contains(text(),'Release date')]");
    private By pre_eventSubmissionText= By.xpath("//label[contains(text(),'Submission due date')]");
    private By pre_eventUploadText= By.xpath("//label[contains(text(),'Upload File')]");
    private By eventCntBtn=By.xpath("//button[@id='Continue_event']");
    private By eventCautionText1=By.xpath("//div[contains(text(),'Venue selection required')]");
    private By eventCautionText2=By.xpath("//div[contains(text(),'Timezone selection required')]");
    private By eventCautionText3=By.xpath("//div[contains(text(),'Instructor selection required')]");
    private By clickClassroomCreationPage=By.xpath(".//span[contains(text(),'Added on')]/../..");
    private By editTextBtn=By.xpath("//div[@class='col-lg-12 col-md-12 col-sm-12 col-xs-12 padding-all-0 ng-scope']//div[1]//div[1]//div[1]//div[5]//i[2]");//button[@type='button'][contains(text(),'Edit')]
    private By viewDetails=By.xpath("//div[contains(text(),'View Details')]");
    private By categoryText=By.xpath("//span[contains(text(),'Category :')]");
    private By backToClassroomLink=By.xpath(".//div[contains(text(),'Back to Classroom')]");
    private By backToClassroomText=By.xpath(".//div[contains(text(),'Back to Classroom List')]");
    private By eventList=By.xpath("//div[@ng-click='viewEventDetails(event_list)']");
    private By mandatoryOkBtn=By.xpath("//span[contains(text(),'OK')]");
    private By lblDescription=By.xpath("//textarea[@name='classroom_description']");
  //added by divya
    private By btnhome = By.xpath(".//li[contains(@title, 'Home')]");
    private By btnclassroom = By.xpath(".//li[contains(@title, 'Classroom')]");
    private By FirstListItem = By.xpath(".//span[contains(text(),'Added on')]/../..");
	private By btnAddEvent = By.xpath(".//button[contains(text(),'Add Event')]");//.//h4[contains(text(),'Events')]/../../*//button[contains(text(),'Add Event')]
	private By eventPageTitle = By.xpath(".//h4[contains(text(),'New Event')]");
	private By btnContinue = By.xpath(".//button[contains(text(),'Continue')]");
	private By btnBack = By.xpath(".//button[contains(text(),'BACK')]");
	private By btnCancel = By.xpath("//button[@class='btn btn-cancel btn_radius ng-binding text-left']");//button[contains(text(),'CANCEL')]
	private By lblTraditionalClassroom = By.xpath(".//label[contains(text(),'Traditional Classroom')]");
	//event page xpathprivate By lblVirtualClassroom = By.xpath(".//label[contains(text(),'Virtual Classroom')]");
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
	
	public By instBellIcon = By.xpath("//*[contains(@class, 'click-hover')]");
	private By lblDelete1= By.xpath(".//div[contains(@class,'col-lg-12 col-sm-6 col-md-6 col-xs-6 margin-l-30')]//i[contains(@class,'icon text-right font-size-14 gray-85')]");
	private By lblDelete2= By.xpath(".//div[contains(@class,'col-lg-12 col-sm-6 col-md-6 col-xs-6 margin111-l-30 margin-l-15')]//i[contains(@class,'icon text-right font-size-14 gray-85')]");
	private By lblAutoUpdate= By.xpath(".//label[@id='completion_criteria_checkbox']");
	private By lblParticipantsSearch= By.xpath(".//input[@id='participants_Search']");
	private By lblBusinessText= By.xpath(".//span[contains(text(),'Business')]");
	private By lblDirectText= By.xpath(".//span[contains(text(),'Direct')]");
	private By lblDurationScoreErr= By.xpath(".//div[contains(text(),'Start Time Required')]");
	private By BtnPublishEvent= By.xpath(".//button[contains(text(),'Publish Event')]");
	private By BtnSave= By.xpath(".//button[contains(text(),'SAVE')]");
    private By reviewEventBtn = By.xpath("//button[contains(text(),'Review Event')]");
    private By eventcreatedlbl = By.xpath("//div[contains(text(),'Event has been successfully created!')]");
    private By closeBtnevnt = By.xpath("//button[contains(@class,'close padding-t-20')]/i");
    private By lblProfileadmin = By.xpath(".//*[@id='dLabel']/span");
    private By logOutButton = By.xpath(".//a[@class='pointer padding-l-15']");
    private By lblProfile = By.xpath(".//div[contains(@class,'logout_pop')]/*//button[contains(@class,'circle-hover')]"); 
    private By instructorroleBtn = By.xpath("//button[contains(text(),'Instructor')]");
    private By tbUserName = By.xpath(".//input[@name='username']");//*[@name='uname']
	private By tbPassword = By.xpath(".//input[@name='password']");//*[@name='userpassword']
	private By btnLogin = By.xpath("//input[@type='submit']");//button[@id='login_btn']
    public DeleteEventandClassroomPage(WebDriver driver) {
		super(driver);
	}
public void Classroomcreate() throws FindFailed {
wait(5);
	click(addClassroomBtn);
	enterData("IOTCEHCxxxxK",titleCaution);
	wait(5);
	enterData("IOTCEHCK",lblDescription);
	wait(2);
	//scrollToElement(lblVirtualClassroom);
	wait(2);
	click(lblSelect);
	wait(2);
	click(By.xpath("//li[@class='option'][contains(text(),'Financial Management')]"));
	wait(2);
	click(lblSelectVenue);
	wait(5);
    scrollToElement(classroomDropDown1);
    wait(5);
	click(classroomDropDown1);
	click(lblVirtualClassroom);
	wait(5);
	WebElement element = driver.findElement(By.xpath("//div[@class='select-background form-group margin-all-0 cus_mar_b_30 select-180 padding-l-20']//span[@class='current'][contains(text(),'Select')]")); Actions
	actions = new Actions(driver); actions.moveToElement(element);
	actions.perform();
/*	if(BrowserFactory.getOS() == "win") {
	Actions actions = new Actions(driver); actions.moveToElement(element);
	actions.perform();
	}
*/	wait(2);
	click(classroomDropDown2);
	wait(2);
	click(classroomDropDown3);
	wait(2);
	click(clickSingleInstructorBtn);
	wait(2);
	click(selectSingleInstructor);
	wait(2);
	click(classroomDropDown4);
	wait(4);
	click(continueBtn);
	wait(5);
	/*scrollToElement(By.xpath("//input[contains(@name,'session_name')]"));
	wait(5);
	enterData("fafafsdadfdas", By.xpath("//input[contains(@name,'session_name')]"));
	wait(4);
	enterData("dafasdfasdf",By.xpath("//textarea[contains(@name,'session_description')]"));
	wait(4);
	enterData("11",By.xpath("//input[contains(@placeholder,'hh')]"));
	wait(4);
	enterData("11",By.xpath("//input[contains(@placeholder,'mm')]"));
	wait(4);*/
	scrollToElement(By.xpath("//label[@class='btn btn-tertiary btn-file padding-lr-30']"));
	wait(5);
	//click(By.xpath("//label[@class='btn btn-tertiary btn-file padding-lr-30']"));
	WebElement element1 = driver.findElement(By.xpath("//label[@class='btn btn-tertiary btn-file padding-lr-30']"));
	//To input the filename along with path
	click(By.xpath("//label[@class='btn btn-tertiary btn-file padding-lr-30']"));
/*	element1.sendKeys("C:\\Users\\Dharani Babu\\Downloads\\FR1-2027-BreadCrumb-Not-Correct.png");
	wait(5);
	driver.findElement(By.id("Value")).sendKeys(Keys.ENTER); 
	wait(5);;*/
	String filepath = "C:\\Users\\origin.automation\\Desktop";
	String inputfilepath = "C:\\Users\\origin.automation\\Desktop";
	Screen s = new Screen();
	Pattern fileInputTextBox = new Pattern(filepath + "filetext.png");
	Pattern openButton = new Pattern(filepath + "open.png");
	s.wait(fileInputTextBox, 20);
    s.type(fileInputTextBox, inputfilepath + "filetext.png");
    s.click(openButton);
scrollToElement(By.xpath("//h4[contains(@class,'custm_tpo')]"));
 wait(5);
scrollToElement(By.xpath("//textarea[contains(@name,'terms_conditions')]"));
enterData("dfadfddsafasdsf",By.xpath("//textarea[contains(@name,'terms_conditions')]"));
wait(2);
click(By.xpath("//button[contains(@class,'btn btn-default btn_radius margin-l-20 ng-binding')]"));
     wait(5);
	

}
public void eventCreation() {
	click(FirstListItem);
	click(btnAddEvent);
	wait(2);
	verifyText("New Event",eventPageTitle);
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
	scrollToElement(By.xpath("//h4[contains(text(),'Terms & Conditions')]"));
	wait(5);
		scrollToElement(By.xpath("//div[contains(text(),'Start Time')]"));
			wait(5);
		//click(lblPm);
		enterData("10", lblCalendarHour);
		wait(5);
		scrollToElement(By.xpath("//h4[contains(text(),'Terms & Conditions')]"));
		wait(5);
		scrollToElement(By.xpath("//div[contains(text(),'Start Time')]"));
		wait(5);
		enterData("50",lblCalendarMinute);
		wait(5);
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
		click(btnContinue);
		wait(2);
		enterData("12",inpMaxParticipants);
		wait(2);
		enterData("12",inpMinParticipants);
		wait(2);
enterData("12",inpWaitingThreshold);
wait(2);
click(lblCalenderClickStart);
wait(2);
click(startDateSelecting);
wait(2);
click(lblCalenderClickLast);
wait(3);
click(startDateSelecting);
wait(2);
click(lblCalenderClickCancellation);
wait(3);
click(lastDateSelectingCancellation);
wait(3);
click(BtnSave);
wait(10);
elementExist(reviewEventBtn);
wait(2);
elementExist(eventcreatedlbl);
print("Event has been created successfully");
click(closeBtnevnt);
wait(2);
click(lblProfileadmin);
wait(2);
click(logOutButton);
}
public void instructorLogin() {
	enterData("automation_directuser@originlearning.com",tbUserName);
	enterData("AutoDU@123",tbPassword);
	click(btnLogin);
	wait(2);

	click(lblProfile);
	wait(2);
	click(instructorroleBtn);
	wait(7);
	click(instBellIcon);
	wait(3);
	elementExist(By.xpath("//p[contains(@class,'noti-title-normal')][1]"));
	print("The notification is found");
}
} 