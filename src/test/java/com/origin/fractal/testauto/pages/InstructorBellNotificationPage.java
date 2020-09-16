//Created by vignesh WVI on 6/April/20
package com.origin.fractal.testauto.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.origin.fractal.testauto.FractalBasePage;
/* File/Class name: InstructorBellNotificationPage.java
 * Created by: Vignesh 
 * Created on: 06-Apr-2020
 * Updated Date: 15-July-20
 * Purpose: Check Instructor side Bell notification
 */
public class InstructorBellNotificationPage extends FractalBasePage{
	LoginPage loginpage;
	ClassroomSettingsInstructorPage classroomSettingsPage;
	public By instBellIcon = By.xpath("//*[contains(@class, 'click-hover')]");
	public By notificationNotFound = By.xpath("//ul[contains(@class,'popupunderline')]//li//div//p");
	public By spanNotification = By.xpath("(//*[@role=\"menuitem\"])[1]/div/p");
	public By IblMoreNotification = By.xpath("//p[text()='MORE']");
	public By breadcrumbHome= By.xpath("//button[text()='Home']");
	public By breadcrumbMoreNotification = By.xpath("//*[contains(@class, 'breadcrumbs')]/div[2]/button");
	public By lblDashboard=By.xpath("//span[text()='Dashboard']");
	public By btnMenu = By.xpath("//ng-include[@id='header1']/*//div[contains(@title,'Menu')]");
	public By classroomBtn = By.xpath("//span[contains(text(),'classroom')]");
	public By searchClassRoomName=By.xpath("//input[@id='searchClassroom']");
	public By editIcon=By.xpath("(//*[@title='Edit'])[1]");
	public By addInstructor=By.xpath("//div[@name='trainer_list']//div//input[@class='ui-select-search input-xs ng-pristine ng-untouched ng-valid ng-empty']");
	public By selectInstructor=By.xpath("(//*[contains(@class, 'ui-select-choices-row-inner')])[1]");
	public By btnContinue=By.xpath("//button[text()='Continue']");
	public By btnUpdate=By.xpath("//button[text()='Update']");
	public By btnBackToList=By.xpath("//button[text()='Back To Classroom List']");
	public By classRoomList=By.xpath("(//*[contains(@class, 'border-tb')])[1]");
	public By eventList=By.xpath("(//*[@ng-click=\"viewEventDetails($event,event_list,'all')\"])[1]");
	public By eventSession=By.xpath("//*[@id='session_title']/i");
	public By eventInstructor=By.xpath("//div[@class='col-lg-12 col-md-6 col-sm-6 col-xs-6 padding-t-0 padding-b-0 padding-l-5 padding-r-20 padding-l-10']//div[@class='nice-select ng-pristine ng-untouched ng-valid ng-isolate-scope ng-not-empty ng-valid-required']");
	public By selectedInstructor=By.xpath("(//*[@class='nice-select ng-pristine ng-untouched ng-valid ng-isolate-scope ng-not-empty ng-valid-required open'])[1]//span");
	public By selectEventInstructor1=By.xpath("(//*[@class='nice-select ng-pristine ng-untouched ng-valid ng-isolate-scope ng-not-empty ng-valid-required open'])[1]//li[text()='Instructor WVF 1']");//("//li[@class='option selected focus']");
	public By selectEventInstructor2=By.xpath("(//*[@class='nice-select ng-pristine ng-untouched ng-valid ng-isolate-scope ng-not-empty ng-valid-required open'])[1]//li[text()='QA TESTER Tester']");//("//div[@class='nice-select ng-pristine ng-untouched ng-valid ng-isolate-scope ng-not-empty ng-valid-required open']//li[@class='option'][1]");
	public By closeXIcon=By.xpath("//*[contains(@class, 'close')]");
	public By changeTimeZone=By.xpath("//*[@class='elearninglabel margin-b-20']//md-input-container/div");
	public By clickCETTime=By.xpath("//li[contains(text(), 'CET European Central Time (GMT+1:00)')]");
	public By clickISTTime=By.xpath("//li[contains(text(), 'IST India Standard Time (GMT+5:30)')]");
	public By detailedNotification=By.xpath("(//*[contains(@class, 'paddingnotify')])[1]//h1");
	public By allNotificationPage=By.xpath("//span[text()='NOTIFICATIONS']");
	public By eventDetailsPage=By.xpath("//span[text()='Event Details']");
	public By instAccountLogo=By.xpath("//*[@class='ci-hover user-account']");
	public By instLogout=By.xpath("(//*[contains(@class,'popupunderline')]//li)[3]");// Updated on 4/Jun/20
	public By adminAccountLogo =By.xpath("//*[@class='loggeduserbg ng-binding']"); 
	public By adminLogout =By.xpath("//*[contains(@class, 'Logout-wrapper')]/div[5]");
	Actions actions;
	WebElement element;
	public String classroomName="AUTO INSTRUCTOR BELL NOTIFICATION";
	public String emptyNotification="No notifications found";
	public String inviteNotification="Hi! Please indicate your availability";
	public String rescheduledNotification="rescheduled to";
	public String instructorEmailID="xxyz08614@gmail.com";
	public String instructorPassword="Welcome@123&";
	public String instructor1EmailID="guestOl1.user@winvinayafoundation.org";
	public String instructor1Password="Welcome@123";
	public String instructor2EmailID="fractalqaautomation@gmail.com";
	public String instructor2Password="Welcome@123&";

	public InstructorBellNotificationPage(WebDriver driver) {
		super(driver);
		loginpage= new LoginPage(driver);
		classroomSettingsPage=new ClassroomSettingsInstructorPage(driver);
		pageName="InstructorBellNotification";
	}

	/* Function name: instLogout()
	 * Action: Do Log out instructor page
	 * Return Type: void
	 */
	public void instLogout() {
		element=driver.findElement(instAccountLogo);
		actions=new Actions(driver);
		actions.moveToElement(element).click().perform();
		wait(3);
		element=driver.findElement(instLogout);
		actions.moveToElement(element).click().perform();
		wait(3);
	}

	/* Function name: adminLogout()
	 * Action: Do Log out admin page
	 * Return Type: void
	 */
	public void adminLogout() {
		element = driver.findElement(adminAccountLogo); 
		actions = new Actions(driver); 
		actions.moveToElement(element).click().perform();
		wait(3);
		element = driver.findElement(adminLogout); 
		actions.moveToElement(element).click().perform();
		wait(3);
	}

	/* Function name: goToclassroom()
	 * Action: click the classroom icon in menu
	 * Return Type: void
	 */
	public void goToclassroom() {
		click(btnMenu);
		wait(3);
		click(classroomBtn);
		wait(2);
	}


	/* Function name: selectInstructor()
	 * Action: change the instructor1 to instructor2 in classroom
	 * Return Type: void
	 */
	public void selectInstructor(String instructor) {
		click(eventSession);
		wait(2);
		moveElementFocusandClick(eventInstructor);
		wait(2);
		if (instructor.equalsIgnoreCase("instructor2")) {
			moveElementFocusandClick(selectEventInstructor2);

		}
		else if (instructor.equalsIgnoreCase("instructor1")) {
			moveElementFocusandClick(selectEventInstructor1);
		}
	}

	/* Function name: selectTimeZone()
	 * Action: change the timezone1 to timezone2 in classroom
	 * Return Type: void
	 */
	public void selectTimeZone(String timeZone) {
		moveElementFocusandClick(changeTimeZone);
		wait(2);
		if( timeZone.equalsIgnoreCase("CETTime")){
			element=driver.findElement(clickCETTime);
			Actions actions= new Actions(driver);
			actions.moveToElement(element).perform();
			wait(2);
			click(clickCETTime);
		}
		else if( timeZone.equalsIgnoreCase("ISTTime")){
			element=driver.findElement(clickISTTime);
			Actions actions= new Actions(driver);
			actions.moveToElement(element).perform();
			wait(2);
			click(clickISTTime);
		}
	}

	/* Function name: preRequired()
	 * Action: Select suitable instructor and timezone before execution starts
	 * Return Type: void
	 */
	public void prerequisite(String instructor,String timeZone) {
		selectInstructor(instructor);
		selectTimeZone(timeZone);
	}

	/* Function name: editEvent()
	 * Action: Admin search specific classroom and add a instructor & time zone in classroom
	 * Return Type: void
	 */
	public void editEvent(String searchclassroom, String edit,String instructor,String timeZone) {
		enterData(searchclassroom,searchClassRoomName);
		wait(5);
		click(classRoomList);
		wait(5);
		click(editIcon);
		wait(5);
		switch (edit) {
		case "editInstructor": 
			selectInstructor(instructor);
			break;
		case "editTimeZone":
			selectTimeZone(timeZone);
			break;
		case "prerequisite":
			prerequisite(instructor,timeZone);
			break;
		default: break;
		}
		click(btnContinue);
		wait(2);
		click(btnUpdate);
		wait(10);
		click(closeXIcon);
		wait(1);
	}

	/* Function name: clickInstBellIcon()
	 * Action: To click bell icon in instructor side
	 * Return Type: void
	 */
	public void clickInstBellIcon() {
		//Wating time added on 3-Sep-20
		wait(2);
		//ends
		element=driver.findElement(instBellIcon); 
		actions=new Actions(driver);
		actions.moveToElement(element).perform();
		click(instBellIcon);
		wait(2);
	}

	/* Function name: verifyEmptyNotification()
	 * Action: instructor side - Verify No notification found text in bell icon
	 * Return Type: boolean
	 */
	public boolean verifyEmptyNotification() {
		clickInstBellIcon();
		if(getText(notificationNotFound).equalsIgnoreCase(emptyNotification)) {
			print("PASSED: The NO NOTIFICATION FOUND text is present.");
			return true;
		}
		print("FAILED: The NO NOTIFICATION FOUND text is NOT present.");
		return false;
	}

	/* Function name: verifyInviteNotification()
	 *Action: instructor side - Verify invite notification in bell icon
	 * Return Type: boolean
	 */
	public boolean verifyInviteNotification() {
		clickInstBellIcon();
		String rescheduledNotitificationText = getText(spanNotification);
		print("Actual Notitification Text: "+rescheduledNotitificationText);
		if(getText(spanNotification).contains(inviteNotification)) {
			print("PASSED: The instructor got a invite notification.");
			return true;
		}
		print("FAILED: The instructor NOT got any invite notification");
		return false;
	}

	/* Function name: verifyRescheduledNotification()
	 *Action: instructor side - Verify rescheduled notification in bell icon
	 * Return Type: boolean
	 */
	public boolean verifyRescheduledNotification() {
		clickInstBellIcon();
		String rescheduledNotitificationText = getText(spanNotification);
		print("Actual Notitification Text: "+rescheduledNotitificationText);
		if(getText(spanNotification).contains(rescheduledNotification)) {
			print("PASSED: The instructor got a rescheduled notification.");
			return true;
		}
		print("FAILED: The instructor NOT got any rescheduled notification.");
		return false;
	}

	/* Function name: verifyandclickMoreBtn()
	 *Action: instructor side -  click more button in bell icon
	 * Return Type: boolean
	 */
	public boolean verifyandclickMoreBtn() {
		if (elementExist(IblMoreNotification)) {
			click(IblMoreNotification);
			wait(3);
			return true;
		}
		print("FAILED: The MORE notification button is NOT found.");
		return false;
	}

	/* Function name: verifyNotificationViewallPage()
	 *Action: instructor side -  Verify notification in view all notification details page
	 * Return Type: boolean
	 */
	public boolean verifyNotificationViewallPage() {
		if(elementExist(allNotificationPage)) {
			print("PASSED: After clicked MORE Notification, The Notification View All page is opened");
			return true;
		}
		print("FAILED: After clicked MORE Notification, The Notification View All page is NOT opened");
		return false;
	}

	/* Function name: verifyBreadcrumbMoreNotification()
	 *Action: instructor side -  Verify breadcrumb in event details page
	 * Return Type: boolean
	 */
	public boolean verifyBreadcrumbMoreNotification() {
		if(elementExist(breadcrumbMoreNotification)) {
			print("PASSED: The required breadcrumb is found");
			return true;
		}
		print("PASSED: The required breadcrumb is NOT found");
		return false;
	}

	/* Function name: verifyLastNoticationmatch()
	 *Action: instructor side -  Verify the latest notification details is matched
	 * Return Type: boolean
	 */
	public boolean verifyLastNoticationmatch() {
		if(getText(detailedNotification).equals(inviteNotification) || getText(detailedNotification).contains(rescheduledNotification)) {
			print("PASSED: The latest notification details are matching");
			return true;
		}
		print("FAILED: The latest notification details are NOT matching");
		return false;
	}

	/* Function name: verifyClickNotification()
	 *Action: instructor side - Click a notification and Verify the action
	 * Return Type: boolean
	 */
	public boolean verifyClickNotification() {
		click(detailedNotification);
		wait(10);
		if(elementExist(eventDetailsPage)) {
			print("PASSED: After clicked the notification, the page redirect to event details page.");
			return true;
		}
		print("FAILED: After clicked the notification, the page NOT redirect to event details page.");
		return false;
	}

	/* Function name: verifyclickHomeaction()
	 *Action: instructor side - Click home in breadcrumb and verify land dashboard
	 * Return Type: boolean
	 */
	public boolean verifyclickHomeaction() {
		//Wating time added on 3-Sep-20
		wait(2);
		//ends
		click(breadcrumbHome);
		wait(5);
		if(elementExist(lblDashboard)){
			print("PASSED: After clicked home, the page redirect to Dashboard page.");
			return true;
		}
		print("FAILED: After clicked home, the page NOT redirect to Dashboard page.");
		return false;
	}

	/*Added on 16-Sep-20
	 * Function name: VerifyEventCancellationNotification()
	 * Action: instructor side - Verify cancelled notification in bell icon
	 * Return Type: boolean
	 */
	public boolean VerifyEventCancellationNotification(By Notification) {
		clickInstBellIcon();
		if(elementExist(Notification)) {
			print("PASSED: The instructor got event cancellation notification.");
			return true;
		}
		print("FAILED: The instructor Not got event cancellation notification.");
		return false;
	}
	//Ends
}