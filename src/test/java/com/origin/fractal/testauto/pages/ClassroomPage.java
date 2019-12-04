package com.origin.fractal.testauto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.origin.fractal.testauto.FractalBasePage;
import com.wv.auto.framework.BrowserFactory;

public class ClassroomPage extends FractalBasePage {
	private By searchField = By.xpath("//input[@id='searchClassroom']");
	private By dropDown1 = By.xpath("//div[@class='select-background learningobjectslist float-left select-180']");
	private By dropDown = By.xpath("//li[contains(text(),'LMS Admin')]");
	private By categoriesDropDown1 = By.xpath("//li[contains(text(),'Created By All')]");
	private By categoriesDropDown2=By.xpath("//li[contains(text(),'Content Admin')]");
	private By categoriesDropDown = By.xpath("//li[contains(text(),'All Categories')]");
	private By addClassroomBtn = By.xpath("//button[contains(text(),'Add Classroom')]");
	private By lblNoRecordsFoundText = By.xpath("//div[contains(text(),'No Records Found')]");
	private By closeBtn = By.xpath("//html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/button[1]/i[1]");
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
    private By classroomDropDown4 = By.xpath("//li[contains(text(),'prema jegan')]");
    private By classroomDropDown5 = By.xpath("//div[contains(@class,'select-background form-group margin-all-0 cus_mar_b_30 select-180 padding-l-20')]//span[contains(@class,'current')][contains(text(),'Select')]");
    private By lblSelect =By.xpath("//md-input-container[@class='flex']//span[@class='current'][contains(text(),'Select')]");
    private By selectDropDown=By.xpath("//div[@class='nice-select ng-pristine ng-untouched ng-isolate-scope ng-empty ng-invalid ng-invalid-required open']//li[@class='option'][contains(text(),'General')]");
    private By lblSelectVenue= By.xpath("//form[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[7]/div[2]/div[1]/md-input-container[1]/div[1]/span[1]");
    private By lblVirtualClassroom= By.xpath("//label[contains(text(),'Zoom')]");
    private By lblAvgScore= By.xpath("//input[@type='number']");
    private By lblSession= By.xpath("//label[@id='session_expand']");
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
    private By clickClassroomCreationPage=By.xpath("//html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]");
    private By editTextBtn=By.xpath("//div[@class='col-lg-12 col-md-12 col-sm-12 col-xs-12 padding-all-0 ng-scope']//div[1]//div[1]//div[1]//div[5]//i[2]");//button[@type='button'][contains(text(),'Edit')]
    private By viewDetails=By.xpath("//div[contains(text(),'View Details')]");
    private By completionCriteriaText=By.xpath("//h3[contains(text(),'Completion Criteria')]");
    private By backToClassroomLink=By.xpath(".//div[contains(text(),'Back to Classroom')]");
    private By backToClassroomText=By.xpath(".//div[contains(text(),'Back to Classroom List')]");
    private By eventList=By.xpath("//div[@ng-click='viewEventDetails(event_list)']");
    private By mandatoryOkBtn=By.xpath("//span[contains(text(),'OK')]");
    private By lblDescription=By.xpath("//textarea[@name='classroom_description']");
  //added by divya
    private By btnhome = By.xpath(".//li[contains(@title, 'Home')]");
    private By btnclassroom = By.xpath(".//li[contains(@title, 'Classroom')]");
    public ClassroomPage(WebDriver driver) {
		super(driver);
	}
	public void fieldValidation() {
		wait(5);
		click(searchField);
		wait(5);
		enterData("ERTYFG",searchField);
		wait(5);
		verifyText("No Records Found",lblNoRecordsFoundText);
		wait(5);
		clear(searchField);
		wait(5);
		enterData("Java Programming",searchField);
		wait(10);
		clear(searchField);
		wait(5);
	/*	Actions builder = new Actions(driver);
	   builder.moveToElement((WebElement) dropDown).perform();
	*/	click(dropDown1);
		wait(5);
		click(dropDown);
		wait(5);
//		click(categoriesDropDown2);
//		wait(5);
//		click(categoriesDropDown1);
//		wait(5);
//		click(categoriesDropDown);
		
	}
	public void addClassroomPage() {
		wait(5);
	click(addClassroomBtn);
	wait(5);
	click(closeBtn);
	}
	public void editClassroomPage() {
		click(closeBtn);
		wait(5);
		click(editBtn);
		wait(5);
		click(closeBtn);
	}
	public void deleteClassroomPage() {
		wait(5);
		click(deleteBtn);
		wait(5);
		click(cancelBtn);
	}
	public void cautionAlertsForMandatoryFields() {
		wait(5);
		click(addClassroomBtn);
		wait(5);
		click(continueBtn);
		wait(5);
		click(mandatoryOkBtn);
		wait(5);
		verifyText("Classroom Title required",classroomNameReqText);
		verifyText("Traditional classroom venue selection required",venueNameReqText);
		verifyText("Classroom category selection required",classroomCategoryReqText);
		verifyText("Classroom description required",classroomDescriptionReqText);
		wait(5);	
		click(closeBtn);
		wait(5);
	}
	public void cautionAlertsForClassroomTitle() {
		wait(5);
		click(addClassroomBtn);
		wait(5);
		click(continueBtn);
		wait(5);
		click(mandatoryOkBtn);
		wait(5);
		verifyText("Classroom title required.",classroomNameReqText);
		wait(5);	
		click(closeBtn);
	}
	public void cautionAlertsForClassroomVenue(){
		wait(5);
		click(addClassroomBtn);
		wait(5);
		click(continueBtn);
		wait(5);
		click(mandatoryOkBtn);
		wait(5);
		verifyText("Traditional classroom venue selection required.",venueNameReqText);
		wait(5);	
		click(closeBtn);
	}
	public void cautionAlertsForCategorySelection(){
		wait(5);
		click(addClassroomBtn);
		wait(5);
		click(continueBtn);
		wait(5);
		click(mandatoryOkBtn);
		wait(5);
		verifyText("Classroom category selection required.",classroomCategoryReqText);
		wait(5);	
		click(closeBtn);
	}
	public void cautionAlertsForClassroomDescription(){
		wait(5);
		click(addClassroomBtn);
		wait(5);
		click(continueBtn);
		wait(5);
		click(mandatoryOkBtn);
		wait(5);
		verifyText("Classroom category selection required.",classroomCategoryReqText);
		wait(5);	
		click(closeBtn);
	}
	public void cautionAlertsForSkillsetSelection(){
	wait(5);
	click(addClassroomBtn);
	wait(5);
	click(continueBtn);
	wait(5);
	click(mandatoryOkBtn);
	wait(5);
	verifyText("Skillset selection required.",skillsetReqText);
	wait(5);	
	click(closeBtn);
}
	public void cautionAlertsForInstructorSelection(){
		wait(5);
		click(addClassroomBtn);
		wait(5);
		click(continueBtn);
		wait(5);
		click(mandatoryOkBtn);
		WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Instructor(s) selection required.')]")); Actions
		actions = new Actions(driver); actions.moveToElement(element);
		actions.perform();
		wait(5);
		verifyText("Instructor(s) selection required.",InstructorSelectionReqText);
		wait(5);	
		click(closeBtn);
	}
	public void addEventPage() {
		wait(5);
		click(addEventBtn);
		wait(5);
		click(closeBtn);
	}
	public void titleAcceptsCharater() {
		wait(5);
		click(addClassroomBtn);
		wait(5);
		enterData("qwe",titleCaution);
		wait(5);
		click(continueBtn);
		wait(5);
		click(mandatoryOkBtn);
		wait(5);
		verifyText("Classroom Title must be 4 or more characters",classroomTitleCautionText);
		wait(5);
		click(closeBtn);
		wait(5);
	}
	public void completionCriteriaCheckUncheck() {
	wait(5);
	click(addClassroomBtn);
	wait(5);
	int count = getItemsCount(completionCriteriaCheckUncheckOBj1);
	String wholeObjPath = "";
	String actualFilType= "";
	for(int i=2;i<count;i++) {
		wholeObjPath = completionCriteriaCheckUncheckOBj1+"["+i+completionCriteriaCheckUncheckOBj2;
		actualFilType=getText(By.xpath(wholeObjPath));
		elementExist(By.xpath(actualFilType));{
			wait(5);
			System.out.println("123466"+actualFilType);
			click(By.xpath(actualFilType));
		}
	}
    wait(5);
    click(By.xpath(actualFilType));
	}
	public void singleAndMultiInstructor() {
		wait(5);
		click(addClassroomBtn);
		wait(5);
		click(continueBtn);
		wait(2);
		click(mandatoryOkBtn);
		wait(2);
		WebElement element = driver.findElement(By.xpath("//label[contains(text(),'Single Instructor')]")); 
		if(BrowserFactory.getOS() == "win") {
		Actions actions = new Actions(driver); actions.moveToElement(element);
		actions.perform();
		}
		wait(2);
	   click(clickSingleInstructorBtn);
		wait(3);
		click(selectSingleInstructor);
	/*	wait(2);
		click(clickMultipleInstructorBtn);
		wait(2);
		click(selectMultipleInstructor);
	*/	wait(5);
		click(closeBtn);
	}
	public void classroomPageInformation() {
		wait(2);
		//added by divya
		click(btnhome);
		wait(5);
		click(btnclassroom);
		wait(5);
		//ended by divya
		click(clickClassroomPage);
		verifyText("Category :",detail1);
		verifyText("View Details",detail2);
		verifyText("Back To Classroom List",detail3);
		wait(5);
		click(detail3);
		
	}
	public void classroomCommonFunction() {
		wait(5);
		click(addClassroomBtn);
		wait(5);
		enterData("qwetewtwr",titleCaution);
		wait(5);
		click(lblSelect);
		wait(5);
		click(selectDropDown);
		wait(2);
		enterData("qwetewtwr",lblDescription);
		wait(2);
		click(lblSelectVenue);
		wait(5);
		click(classroomDropDown1);
	/*	wait(5);
		enterData("40",lblAvgScore);
	*/	wait(2);
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
		WebElement element1 = driver.findElement(By.xpath("//form[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[11]/div[1]/md-input-container[1]/div[1]/span[1]")); 
		if(BrowserFactory.getOS() == "win") {
		Actions actions1= new Actions(driver); actions1.moveToElement(element1);
		actions1.perform();
		}
		wait(2);
//		click(selectSingleInstructor);
//		wait(2);
//		click(classroomDropDown5);
//        wait(5);
    
		wait(2);
		click(classroomDropDown5);
		wait(2);
		click(classroomDropDown4);
		wait(5);
		click(continueBtn);
		wait(5);
	}
	public void	durationNumericValue() {
		classroomCommonFunction();
		wait(5);
		click(lblSession);
		wait(2);
		WebElement element = driver.findElement(By.xpath("//input[@type='number']")); 
		if(BrowserFactory.getOS() == "win") {
		Actions actions = new Actions(driver); actions.moveToElement(element);
		actions.perform();
		}
		wait(5);
		enterData("123",lblAvgScore);
		wait(5);
		click(closeBtn);
	}
	public void surveyLinks() {
		wait(5);
	/*	click(addClassroomBtn);
		wait(5);
		click(lblSessionRadioBtn);
		wait(2);
	*/	classroomCommonFunction();
	    wait(2);
		click(pre_eventRadioBtn);
		wait(2);
//		enterData("www.google.com",post_eventTextLink);
/*		WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Post-event Survey')]")); Actions
		actions = new Actions(driver); actions.moveToElement(element);
		actions.perform();
		wait(2);
		click(post_eventRadioBtn);
		wait(2);
*/		click(pre_eventRadioBtn);
		click(closeBtn);
	}
	public void	commonValidateFields() {
	wait(2);
	verifyText("Assignment Title",pre_eventAssignmentTitle);
	verifyText("Assignment Description",pre_eventAssignmentDescription);
	verifyText("Pass score",pre_eventQualificationScore);
	verifyText("Max score",pre_eventScoring);
	verifyText("Release date",pre_eventReleaseText);
	verifyText("Submission due",pre_eventSubmissionText);
	verifyText("UPLOAD FILE",pre_eventUploadText);
	wait(5);
	click(closeBtn);
	}
	public void	preEventValidateFields() {
	classroomCommonFunction();
	wait(5);
	click(pre_eventAssignmentCheckbox);	
	commonValidateFields();
	}
	
	public void	postEventValidateFields() {
	classroomCommonFunction();
	wait(5);
	WebElement element = driver.findElement(By.xpath(".//label[contains(text(),'Post-event Assignment')]")); 
	if(BrowserFactory.getOS() == "win") {
	Actions actions = new Actions(driver); actions.moveToElement(element);
	actions.perform();
	}
	click(post_eventAssignmentCheckbox);	
	commonValidateFields();
	}
	public void verifySessionTab() {
		classroomCommonFunction();
	}
	public void eventPageValidation() {
		wait(5);
		click(addEventBtn);
		wait(5);
		click(eventCntBtn);
		wait(2);
		verifyText("Venue selection required",eventCautionText1);
		verifyText("Timezone selection required",eventCautionText2);
	    verifyText("Instructor selection required",eventCautionText3);
	    wait(2);
	    click(closeBtn);
	}
	public void classroomListedPage() {
	click(clickClassroomCreationPage);
	wait(5);
/*	click(editTextBtn);
	wait(5);
	click(closeBtn);
	wait(5);
*/	click(viewDetails);
	wait(5);
	verifyText("Completion criteria",completionCriteriaText);
	wait(5);
	click(backToClassroomLink);
	wait(5);
	click(backToClassroomText);
	wait(3);
	}
	public void eventListedPage() {
	wait(10);
	click(clickClassroomCreationPage);
	wait(10);
	elementExist((eventList));
	
	}
}
