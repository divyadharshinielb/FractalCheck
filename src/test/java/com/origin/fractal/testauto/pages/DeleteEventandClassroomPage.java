package com.origin.fractal.testauto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.origin.fractal.testauto.FractalBasePage;
/* File Name: DeleteEventandClassroomPage.java
 * Purpose: Check notification for instructor on deleting event and classroom -FR1-2078
 * Created by: DivyaDharshini
 * Created on: 25-May-2020
 */

public class DeleteEventandClassroomPage extends FractalBasePage {
	private By addClassroomBtn = By.xpath("//button[contains(text(),'Add Classroom')]");
	private By continueBtn = By.xpath("//button[contains(text(),'Continue')]");
	private By titleCaution = By.xpath("//input[@name='classroom_name']");
	private By clickSingleInstructorBtn = By.xpath("//label[contains(text(),'Single Instructor')]");
	private By selectSingleInstructor = By.xpath("//div[@class='select-background form-group margin-all-0 cus_mar_b_30 select-180 padding-l-20']//span[@class='current'][contains(text(),'Select')]");
	private By classroomvenuedropdown = By.xpath("//li[contains(text(),'Origin Learning Solutions')]");
	private By classroomskillsetdropdown = By.xpath("//span[text()[normalize-space()='Classroom Management.']]");
	private By classroomskillsetselect = By.xpath("//input[@placeholder='Select']");
	private By classroominstructorselect = By.xpath("//li[contains(text(),'Automation Directuser')]");
	private By lblSelect =By.xpath("//md-input-container[@class='flex']//span[@class='current'][contains(text(),'Select')]");
	private By lblSelectVenue= By.xpath("//form[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[7]/div[2]/div[1]/md-input-container[1]/div[1]/span[1]");
	private By lblDescription=By.xpath("//textarea[@name='classroom_description']");
	private By FirstListItem = By.xpath(".//span[contains(text(),'Added on')]/../..");
	private By btnAddEvent = By.xpath(".//button[contains(text(),'Add Event')]");
	private By eventPageTitle = By.xpath(".//h4[contains(text(),'New Event')]");
	private By btnContinue = By.xpath(".//button[contains(text(),'Continue')]");
	private By lblTraditionalClassroom = By.xpath(".//label[contains(text(),'Traditional Classroom')]");
	private By venueDropdown = By.xpath("//h4[contains(text(),'Venue')]/../md-input-container/div/span[contains(text(),'Select')]");
	private By selectVenue = By.xpath(".//li[contains(text(),'Origin Learning Solutions')]");
	private By timezoneDropdown = By.xpath(".//form[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[4]/div[1]/md-input-container[1]/div[1]/span[1]");
	private By selectTimezone = By.xpath(".//li[contains(text(),'EET Eastern European Time (GMT+2:00)')]");
	private By lblSession = By.xpath(".//h4[@id='session_title']");
	private By dropdownSelectInstructor1 =By.xpath("//li[contains(text(),'Select Instructor')]/../li[2]");
	private By dropdownSelectInstructor	=By.xpath(".//span[contains(text(),'Select Instructor')]");
	private By lblSelectCalendar=By.xpath(".//button[contains(@class,'md-datepicker-button md-icon-button md-button md-ink-ripple')]");
	private By dropdownSelectCalendar=By.xpath("//td[@class='md-calendar-date md-calendar-date-today md-focus']//span[@class='md-calendar-date-selection-indicator']");
	private By lblCalendarHour=By.xpath("//div[contains(@class,'col-lg-12 col-md-12 col-sm-12 col-xs-12 padding-lr-0 display_inFlex11111111 margin-b-20')]//div[1]//input[1]");
	private By lblCalendarMinute=By.xpath("//div[contains(@class,'expand-collapse-content')]//div[1]//input[2]");
	private By lblCalenderClickStart = By.xpath("//md-datepicker[@id='startdate_registration']//button[contains(@class,'md-datepicker-button md-icon-button md-button md-ink-ripple')]");
	private By startDateSelecting = By.xpath("//span[contains(@class,'md-calendar-date-selection-indicator')]");
	private By lblCalenderClickLast = By.xpath("//md-datepicker[@id='lastdate_registration']//button[contains(@class,'md-datepicker-button md-icon-button md-button md-ink-ripple')]");
	private By lblCalenderClickCancellation = By.xpath(".//md-datepicker[@id='lastdate_cancellation']//button[contains(@class,'md-datepicker-button md-icon-button md-button md-ink-ripple')]");
	private By lastDateSelectingCancellation = By.xpath(".//span[@class='md-calendar-date-selection-indicator']");
	private By inpMaxParticipants = By.xpath("//input[contains(@name,'max_participants')]");
	private By inpMinParticipants = By.xpath("//input[contains(@name,'min_participants')]");
	private By inpWaitingThreshold = By.xpath("//input[contains(@name,'wait_threshold')]");
	private By instBellIcon = By.xpath("//*[contains(@class, 'click-hover')]");
	private By BtnSave= By.xpath(".//button[contains(text(),'SAVE')]");
	private By reviewEventBtn = By.xpath("//button[contains(text(),'Review Event')]");
	private By eventcreatedlbl = By.xpath("//div[contains(text(),'Event has been successfully created!')]");
	private By closeBtnevnt = By.xpath("//button[contains(@class,'close padding-t-20')]/i");
	private By lblProfileadmin = By.xpath(".//*[@id='dLabel']/span");
	private By logOutButtonadmin = By.xpath(".//a[@class='pointer padding-l-15']");
	private By lblProfile = By.xpath(".//div[contains(@class,'logout_pop')]/*//button[contains(@class,'circle-hover')]"); 
	private By instructorroleBtn = By.xpath("//button[contains(text(),'Instructor')]");
	private By deletebtnclassroom = By.xpath("//div[@class='col-lg-12 col-md-12 col-sm-12 col-xs-12 padding-all-0 ng-scope']//div[1]//div[1]//div[1]//div[5]//i[3]");
	private By deleteokbtn  = By.xpath("//span[contains(text(),'OK')]/..");
	private By classroomclosebtn = By.xpath("//button[@class='md-raised btn btn-lg btn-secondary text-uppercase']");
	private By classroomsavebtn = By.xpath("//button[contains(@class,'btn btn-default btn_radius margin-l-20 ng-binding')]");
	private By eventDeletebtn = By.xpath("//i[contains(@class,'padding-r-20 icon text-right font-size-16 bold cursor-pointer gray-85 ng-scope')]");
	private By insacceptbtn = By.xpath("//button[contains(text(),'ACCEPT')]");
	private By insokbtn = By.xpath("//button[@class='blue-button-bg-font-border padding-lr-30 f-s-16 margin-r-10 ins_acceptok']");
	private By insreviewbtn = By.xpath("//button[contains(text(),'Review')]");
	private By logOutButton = By.xpath(".//li[contains(text(),'Logout')]"); 
	private By publisheventbtn = By.xpath("//i[contains(@title,'Publish')]");
	private By afterpublisheventdeletebtn = By.xpath("//i[contains(@title,'Delete')]");
	private By categoryoption = By.xpath("//span[contains(text(),'Select')]/../ul/li[contains(text(),'General')]");
	private By session_name = By.xpath("//input[contains(@name,'session_name')]");
	private By sessiondesc = By.xpath("//textarea[contains(@name,'session_description')]"); 
	private By classhourlbl = By.xpath("//input[contains(@placeholder,'hh')]");
	private By classminutelbl = By.xpath("//input[contains(@placeholder,'mm')]");
	private By browsecheck = By.xpath("//h4[contains(@class,'custm_tpo')]");
	private By termscheck = By.xpath("//textarea[contains(@name,'terms_conditions')]");
	private By browsebtn = By.xpath("//label[@class='btn btn-tertiary btn-file padding-lr-30']//input[@type='file']");
	private By termsandconditionbtn = By.xpath("//h4[contains(text(),'Terms & Conditions')]");
	private By notifytext = By.xpath("//div[contains(@class,'margin-t-30')]//div[1]//div[3]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[2]//h1[1]");
	private By lblstarttime = By.xpath("//div[contains(text(),'Start Time')]");
	private By lbldurationsel = By.xpath("//select[contains(@name,'starttime_zone')]");
	private By lblPM = By.xpath("//select[contains(@name,'starttime_zone')]//option[contains(@value,'PM')]");
	private By venueoption = By.xpath(".//li[contains(text(),'Origin Learning Solutions')]");
	private By instructorselectdropdown = By.xpath("//div[@class='select-background form-group margin-all-0 cus_mar_b_30 select-180 padding-l-20']//span[@class='current'][contains(text(),'Select')]");
	private By instructornotification = By.xpath("//p[contains(@class,'mb-0 mt-0')]");
	private By instructornotificationcheck = By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/h1[1]");
	private By backtoclasslbl = By.xpath("//div[contains(text(),'Back to Classroom List')]");
	String filename = "C:\\sample file\\Sample.xlsx";
	public DeleteEventandClassroomPage(WebDriver driver) {
		super(driver);
		pageName = "DeleteEventandClassroomPage";
	}
	/*
	 * Function name:Classroomcreate()
	 * Covers:It covers creation of a classroom
	 */
	public void Classroomcreate()  {
		wait(5);
		click(addClassroomBtn);
		wait(3);
		enterData(getLabel("title"),titleCaution);
		wait(5);
		click(lblSelect);
		wait(5);
		click(categoryoption);
		wait(2);
		enterData(getLabel("description"),lblDescription);
		wait(2);
		WebElement element = driver.findElement(lblSelectVenue); 
		Actions actions = new Actions(driver); 
		actions.moveToElement(element);
		wait(2);
		click(lblSelectVenue);
		wait(5);
		scrollToElement(classroomvenuedropdown);
		wait(5);
		click(classroomvenuedropdown);
		//click(lblVirtualClassroom);
		wait(5);
		WebElement element1 = driver.findElement(instructorselectdropdown); 
		Actions actions1 = new Actions(driver); 
		actions1.moveToElement(element1);
		actions1.perform();
		wait(2);
		click(classroomskillsetselect);
		wait(2);
		click(classroomskillsetdropdown);
		wait(2);
		click(clickSingleInstructorBtn);
		wait(2);
		click(selectSingleInstructor);
		wait(2);
		click(classroominstructorselect);
		wait(4);
		click(continueBtn);
		wait(5);
		scrollToElement(session_name);
		wait(5);
		enterData(getLabel("title"), session_name);
		wait(4);
		enterData(getLabel("title"),sessiondesc);
		wait(4); 
		enterData(getLabel("durationhr"),classhourlbl);
		wait(4);
		elementExist(classminutelbl);
		enterData(getLabel("durationmin"),classminutelbl);
		scrollToElement(browsebtn);
		wait(5);
		driver.findElement(browsebtn).sendKeys(filename);
		scrollToElement(browsecheck);
		wait(5);
		scrollToElement(termscheck);
		enterData(getLabel("title"),termscheck);
		wait(2);
		click(classroomsavebtn);
		wait(5);
		print("Classroom has been created successfully");
		click(classroomclosebtn);
		wait(5);
	}
	/*
	 * Function: eventCreation()
	 * Covers: Creation of a event
	 */
	public void eventCreation() {
		click(FirstListItem);
		click(btnAddEvent);
		wait(2); 
		verifyText(getLabel("neweventtext"),eventPageTitle);
		click(lblTraditionalClassroom);
		wait(10);
		click(venueDropdown);wait(5);
		WebElement element = driver.findElement(venueoption); 
		Actions actions = new Actions(driver); 
		actions.moveToElement(element);
		actions.perform();
		wait(5);
		click(selectVenue);
		wait(5);
		click(timezoneDropdown);
		wait(10);
		click(selectTimezone);
		click(lblSession);
		wait(10);
		click(lblSelectCalendar);
		wait(5);
		click(dropdownSelectCalendar);
		wait(5);
		scrollToElement(termsandconditionbtn);
		wait(5);
		scrollToElement(lblstarttime);
		wait(5);
		enterData(getLabel("durationhr"), lblCalendarHour);
		wait(5);
		scrollToElement(termsandconditionbtn);
		wait(5);
		scrollToElement(lblstarttime);
		wait(5);
		enterData(getLabel("durationmin"),lblCalendarMinute);
		wait(5);
		click(lbldurationsel);
		wait(2);
		click(lblPM);
		wait(2);
		click(dropdownSelectInstructor);
		click(dropdownSelectInstructor1);
		wait(5);
		click(btnContinue);
		wait(2);
		enterData(getLabel("participants"),inpMaxParticipants);
		wait(2); 
		enterData(getLabel("participants"),inpMinParticipants);
		wait(2);
		enterData(getLabel("participants"),inpWaitingThreshold);
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
	}
	/*
	 * Function: logoutAdmin()
	 * Covers: It covers  admin logout
	 */

	public void logoutAdmin() {
		wait(5);
		click(lblProfileadmin);
		wait(2);
		click(logOutButtonadmin);
		wait(2);
	}
	/*
	 * Function: eventDeletion()
	 * Covers: It covers deletion of an event
	 */

	public void eventDeletion() {
		click(eventDeletebtn);
		wait(2);
		click(deleteokbtn);
		logoutAdmin();
	}
	/*
	 * Function: instructorLogin()
	 * Covers: Login as a instructor and check for new notification
	 */

	public void instructorLogin() {
		wait(5);
		click(lblProfile);
		wait(2);
		click(instructorroleBtn);
		wait(7);
		click(instBellIcon);
		wait(3);
		click(instructornotification);
		String notifytextcheck = getText(instructornotificationcheck);
		verifyText(notifytextcheck,notifytext);
		print("The notification is found");
		click(lblProfile);
		wait(2);
		click(logOutButton);
	}
	/*
	 * Function: instructorAccept()
	 * Covers: Login as instructor and accept the event
	 */

	public void instructorAccept() {
		wait(2);
		click(lblProfile);
		wait(2);
		click(instructorroleBtn);
		wait(7);
		scrollToElement(insacceptbtn);
		wait(2);
		click(insacceptbtn);
		wait(2);
		click(insokbtn);
		wait(2);
		wait(2);
		click(insreviewbtn);wait(2);
		click(lblProfile);
		wait(2);
		click(logOutButton);
	}
	/*
	 * Function: accepteventDelete()
	 * Covers: Publish and delete the accepted event
	 */

	public void accepteventDelete() {
		click(FirstListItem);
		wait(2);
		click(publisheventbtn);
		wait(10);
		click(afterpublisheventdeletebtn);
		wait(2);
		click(deleteokbtn);
		logoutAdmin();
	}
	/*
	 * Function: eventDeletebeforeaccept()
	 * Covers: Delete the event and logout 
	 */

	public void eventDeletebeforeaccept() {
		wait(2);
		click(afterpublisheventdeletebtn);
		wait(2);
		click(deleteokbtn);
		logoutAdmin();
	}
	/*
	 * Function: classroomDelete()
	 * Covers: Delete the classroom 
	 */

	public void classroomDelete() {
		wait(2);
		click(backtoclasslbl);
		wait(7);
		click(deletebtnclassroom);
		wait(5);
		click(deleteokbtn);
		logoutAdmin();
		
	}
} 