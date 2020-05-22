package com.origin.fractal.testauto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.FindFailed;
import com.origin.fractal.testauto.FractalBasePage;

public class DeleteEventandClassroomPage extends FractalBasePage {
	private By addClassroomBtn = By.xpath("//button[contains(text(),'Add Classroom')]");
	private By continueBtn = By.xpath("//button[contains(text(),'Continue')]");
    private By titleCaution = By.xpath("//input[@name='classroom_name']");
    private By clickSingleInstructorBtn = By.xpath("//label[contains(text(),'Single Instructor')]");
    private By selectSingleInstructor = By.xpath("//div[@class='select-background form-group margin-all-0 cus_mar_b_30 select-180 padding-l-20']//span[@class='current'][contains(text(),'Select')]");
    private By classroomDropDown1 = By.xpath("//li[contains(text(),'Origin Learning Solutions')]");//li[contains(text(),'Ramanujan Museum & Math Education Centre')]
    private By classroomDropDown3 = By.xpath("//span[contains(text(),'Classroom Organization.')]");
    private By classroomDropDown2 = By.xpath("//input[@placeholder='Select']");
    private By classroomDropDown4 = By.xpath("//li[contains(text(),'Automation directuser')]");//li[contains(text(),'prema jegan')]
    private By lblSelect =By.xpath("//md-input-container[@class='flex']//span[@class='current'][contains(text(),'Select')]");
    private By lblSelectVenue= By.xpath("//form[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[7]/div[2]/div[1]/md-input-container[1]/div[1]/span[1]");
    private By lblVirtualClassroom= By.xpath("//label[contains(text(),'Zoom')]");
    private By lblDescription=By.xpath("//textarea[@name='classroom_description']");
  //added by divya
    private By FirstListItem = By.xpath(".//span[contains(text(),'Added on')]/../..");
	private By btnAddEvent = By.xpath(".//button[contains(text(),'Add Event')]");//.//h4[contains(text(),'Events')]/../../*//button[contains(text(),'Add Event')]
	private By eventPageTitle = By.xpath(".//h4[contains(text(),'New Event')]");
	private By btnContinue = By.xpath(".//button[contains(text(),'Continue')]");
	private By lblTraditionalClassroom = By.xpath(".//label[contains(text(),'Traditional Classroom')]");
	//event page xpathprivate By lblVirtualClassroom = By.xpath(".//label[contains(text(),'Virtual Classroom')]");
	//private By lblSession = By.xpath(".//h4[contains(text(),'Session')]");
	private By venueDropdown = By.xpath("//h4[contains(text(),'Venue')]/../md-input-container/div/span[contains(text(),'Select')]");
	private By selectVenue = By.xpath(".//li[contains(text(),'Origin Learning Solutions')]");
	private By timezoneDropdown = By.xpath(".//form[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[4]/div[1]/md-input-container[1]/div[1]/span[1]");
	private By selectTimezone = By.xpath(".//li[contains(text(),'EET Eastern European Time (GMT+2:00)')]");
	private By lblSession = By.xpath(".//h4[@id='session_title']");//By.id("session_title")
	private By dropdownSelectInstructor1 =By.xpath("//li[contains(text(),'Select Instructor')]/../li[2]");//html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/md-dialog-content[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[3]/md-input-container[1]/div[1]/ul[1]/li[2]
	private By dropdownSelectInstructor	=By.xpath(".//span[contains(text(),'Select Instructor')]");
	private By lblSelectCalendar=By.xpath(".//button[contains(@class,'md-datepicker-button md-icon-button md-button md-ink-ripple')]");
	private By dropdownSelectCalendar=By.xpath("/html[1]/body[1]/div[6]/div[2]/md-calendar[1]/div[1]/md-calendar-month[1]/div[1]/md-virtual-repeat-container[1]/div[1]/div[2]/table[1]/tbody[1]/tr[4]/td[5]/span[1]");//td[@class='md-calendar-date md-calendar-date-today md-calendar-selected-date md-focus'](staging)
	private By lblCalendarHour=By.xpath("//div[contains(@class,'col-lg-12 col-md-12 col-sm-12 col-xs-12 padding-lr-0 display_inFlex11111111 margin-b-20')]//div[1]//input[1]");
	private By lblCalendarMinute=By.xpath("//div[contains(@class,'expand-collapse-content')]//div[1]//input[2]");
	private By lblCalenderClickStart = By.xpath("//md-datepicker[@id='startdate_registration']//button[contains(@class,'md-datepicker-button md-icon-button md-button md-ink-ripple')]");
	private By startDateSelecting = By.xpath("//span[contains(@class,'md-calendar-date-selection-indicator')]");
	private By lblCalenderClickLast = By.xpath("//md-datepicker[@id='lastdate_registration']//button[contains(@class,'md-datepicker-button md-icon-button md-button md-ink-ripple')]");
	private By lblCalenderClickCancellation = By.xpath(".//md-datepicker[@id='lastdate_cancellation']//button[contains(@class,'md-datepicker-button md-icon-button md-button md-ink-ripple')]");
	private By lastDateSelectingCancellation = By.xpath(".//span[@class='md-calendar-date-selection-indicator']");
	private By inpMaxParticipants = By.xpath("//input[contains(@name,'max_participants')]");//input[@id='input_27']
	private By inpMinParticipants = By.xpath("//input[contains(@name,'min_participants')]");//input[@id='input_28']
	private By inpWaitingThreshold = By.xpath("//input[contains(@name,'wait_threshold')]");//input[@id='input_29']
	public By instBellIcon = By.xpath("//*[contains(@class, 'click-hover')]");
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
	private By logOutButton = By.xpath(".//li[contains(text(),'Logout')]"); //li[contains(@class, 'jss29 jss95 jss98 jss103 jss104 jss92 jss93 popup-text padding-t-15 removelastspan')] //a[@class='pointer padding-l-15']
private By publisheventbtn = By.xpath("//i[contains(@title,'Publish')]");
private By afterpublisheventdeletebtn = By.xpath("//i[contains(@title,'Delete')]");
private By categoryoption = By.xpath("//div[@class='nice-select ng-pristine ng-untouched ng-isolate-scope ng-empty ng-invalid ng-invalid-required open']//li[@class='option'][contains(text(),'Financial Management')]");
private By session_name = By.xpath("//input[contains(@name,'session_name')]");
private By sessiondesc = By.xpath("//textarea[contains(@name,'session_description')]"); 
private By classhourlbl = By.xpath("//input[contains(@placeholder,'hh')]");
private By classminutelbl = By.xpath("//input[contains(@placeholder,'mm')]");
//private By browsebtn = By.xpath("//label[@class='btn btn-tertiary btn-file padding-lr-30']");
private By classroomdelete = By.xpath("//p[contains(text(),'Hi! The IOTCHECKCLASSROOM session  is cancelled.')]");
private By eventdelete = By.xpath("//p[contains(text(),'Hi! The IOTCHECKCLASSROOMneeww session scheduled on 21 May, 2020 is cancelled.')]");
private By browsecheck = By.xpath("//h4[contains(@class,'custm_tpo')]");
private By termscheck = By.xpath("//textarea[contains(@name,'terms_conditions')]");
private By browsebtn = By.xpath("//label[@class='btn btn-tertiary btn-file padding-lr-30']//input[@type='file']");
private By termsandconditionbtn = By.xpath("//h4[contains(text(),'Terms & Conditions')]");
public DeleteEventandClassroomPage(WebDriver driver) {
		super(driver);
	}
public void Classroomcreate() throws FindFailed {
	wait(5);
	click(addClassroomBtn);
	wait(3);
	enterData("AUTOMATIONCLASSROOM",titleCaution);
	wait(5);
	//scrollToElement(lblVirtualClassroom);
	wait(2);
	click(lblSelect);
	wait(5);
	click(categoryoption);
	wait(2);
	enterData("IOTCEHCK",lblDescription);
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
	scrollToElement(session_name);
	wait(5);
	enterData("IOTCHECK", session_name);
	wait(4);
	enterData("IOTCHECK",sessiondesc);
	wait(4);
	enterData("11",classhourlbl);
	wait(4);
	enterData("11",classminutelbl);
	wait(4);
	scrollToElement(browsebtn);
	wait(5);
	//click(By.xpath("//label[@class='btn btn-tertiary btn-file padding-lr-30']"));
	//WebElement element1 = driver.findElement(By.xpath("//label[@class='btn btn-tertiary btn-file padding-lr-30']"));
	wait(5);
	driver.findElement(browsebtn).sendKeys("C:\\Users\\Dharani Babu\\Music\\filetext.png");
scrollToElement(browsecheck);
 wait(5);
scrollToElement(termscheck);
enterData("IOTCHECK",termscheck);
wait(2);
click(classroomsavebtn);
     wait(5);
	print("Classroom has been created successfully");
	click(classroomclosebtn);
	wait(5);
/*click(deletebtnclassroom);
wait(5);
click(deleteokbtn);
//for logout 
click(lblProfileadmin);
wait(2);
click(logOutButtonadmin);*/
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
	scrollToElement(termsandconditionbtn);
	wait(5);
		scrollToElement(By.xpath("//div[contains(text(),'Start Time')]"));
			wait(5);
		//click(lblPm);
		enterData("10", lblCalendarHour);
		wait(5);
		scrollToElement(termsandconditionbtn);
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
}
public void logoutAdmin() {
	wait(5);
	click(lblProfileadmin);
	wait(2);
	click(logOutButtonadmin);
	wait(2);
}
public void eventDeletion() {
click(eventDeletebtn);
wait(2);
click(deleteokbtn);
wait(5);
click(lblProfileadmin);
wait(2);
click(logOutButtonadmin);
}
public void instructorLogin() {
		wait(5);
	click(lblProfile);
	wait(2);
	click(instructorroleBtn);
	wait(7);
	click(instBellIcon);
	wait(3);
	elementExist(By.xpath("//body[contains(@class,'nimbus-is-editor')]/div[@id='root']/div[@id='page-container']/main[@id='content-wrap']/div/div/div[contains(@class,'row white-bg ml-0 mr-0')]/div[contains(@class,'container logheader')]/div[contains(@class,'row')]/div[contains(@class,'col-lg-2 col-md-2 col-sm-2 col-xs-2 cart_area pl-0 mtop-5 ins_calendar_notify')]/div[contains(@class,'log_alert margin-r-0')]/div[contains(@class,'jss1')]/div[contains(@class,'pad-hover-67 notify-box')]/div[contains(@class,'zindex')]/div[@id='menu-list-grow']/ul[contains(@class,'jss141 jss142 popupunderline')]/li[1]/div[1]/p[1]"));
	print("The notification is found");
	click(lblProfile);
	wait(2);
	click(logOutButton);
}
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
//	click(By.xpath("//button[@class='styles_closeButton__20ID4']"));
	wait(2);
	click(insreviewbtn);wait(2);
	click(lblProfile);
	wait(2);
	click(logOutButton);
}
//function for deleting the accepted event 
public void accepteventDelete() {
	click(FirstListItem);
	wait(2);
	click(publisheventbtn);
	//driver.navigate().refresh();
	wait(10);
	click(afterpublisheventdeletebtn);
	wait(2);
	click(deleteokbtn);
	wait(3);
	click(lblProfileadmin);
	wait(2);
	click(logOutButtonadmin);
    wait(5);
}
public void eventDeletebeforeaccept() {
	wait(2);
	click(afterpublisheventdeletebtn);//eventDeletebtn
	wait(2);
	click(deleteokbtn);
	wait(3);
	click(lblProfileadmin);
	wait(2);
	click(logOutButtonadmin);

}
public void classroomDelete() {
	wait(2);
	click(By.xpath("//div[contains(text(),'Back to Classroom List')]"));
	wait(2);
	click(deletebtnclassroom);
	wait(5);
	click(deleteokbtn);
	//for logout 
	click(lblProfileadmin);
	wait(5);
	click(logOutButtonadmin);
	wait(5);
}
 } 