package com.origin.fractal.testauto.steps;

import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBaseStep;
import com.origin.fractal.testauto.pages.ClassroomSettingsInstructorPage;
import com.origin.fractal.testauto.pages.InstructorBellNotificationPage;

/* File/class name: InstructorBellNotificationSteps.java
 * Developed By: Vigneshwaran R
 * Updated Date: 5-June-20
 */
public class InstructorBellNotificationSteps extends FractalBaseStep  {
	InstructorBellNotificationPage instbellnoti;
	ClassroomSettingsInstructorPage classroomSettingsPage;
	public InstructorBellNotificationSteps(WebDriver driver) {
		instbellnoti = new InstructorBellNotificationPage(driver);
		classroomSettingsPage=new ClassroomSettingsInstructorPage(driver);
	}

	/* Function name: instLogout()
	 * Action: Instructor logout
	 * Return Type: void
	 */
	public void instLogout() {
		instbellnoti.instLogout();
		wait(5);
	}
	
	/* Function name: adminLogout()
	 * Action: admin logout
	 * Return Type: void
	 */
	public void adminLogout() {
		instbellnoti.adminLogout();
		wait(5);
	}
	
	/* Function name: verifyEmptyNotification()
	 * Action: Verify Instructor bell Notification- No notification found
	 * Return Type: void
	 */
	public void verifyEmptyNotification() {
		try{
			result="FAILED";
			if(instbellnoti.verifyEmptyNotification()) {
				result="PASSED";
			}
		}catch(Exception e) {
			result="FAILED";
		}
		instLogout();
	}
	
	/* Function name: verifyInviteNotification()
	 * Action: instructor side - Verify invite notification in bell icon
	 * Return Type: void
	 */
	public void verifyInviteNotification() {
		try{result="FAILED";
		if(instbellnoti.verifyInviteNotification()) {
			result="PASSED";
		}}catch(Exception e) {
			result="FAILED";
		}
	}
	
	/* Function name: verifyandclickMoreBtn()
	 * Action: instructor side -  click more button in bell icon
	 * Return Type: void
	 */
	public void verifyandclickMoreBtn() {
		try{result="FAILED";
		if(instbellnoti.verifyandclickMoreBtn()) {
			result="PASSED";
		}}catch(Exception e) {
			result="FAILED";
		}
	}
	
	/* Function name: verifyNotificationViewallPage()
	 * Action: instructor side -  Verify notification in view all notification details page
	 * Return Type: void
	 */
	public void verifyNotificationViewallPage() {
		try{result="FAILED";
		if(instbellnoti.verifyNotificationViewallPage()) {
			result="PASSED";
		}}catch(Exception e) {
			result="FAILED";
		}
	}
	
	/* Function name: verifyBreadcrumbMoreNotification()
	 *Action: instructor side -  Verify breadcrumb in event details page
	 * Return Type: void
	 */
	public void verifyBreadcrumbMoreNotification() {
		try{result="FAILED";
		if(instbellnoti.verifyBreadcrumbMoreNotification()) {
			result="PASSED";
		}}catch(Exception e) {
			result="FAILED";
		}
	}
	
	/* Function name: verifyRescheduledNotification()
	 *Action: instructor side - Verify rescheduled notification in bell icon
	 * Return Type: void
	 */
	public void verifyRescheduledNotification() {
		try{result="FAILED";
		if(instbellnoti.verifyRescheduledNotification()) {
			result="PASSED";
		}}catch(Exception e) {
			result="FAILED";
		}
	}
	
	/*Function name: verifyLastNoticationmatch()
	 *Action: instructor side -  Verify the latest notification details is matched
	 * Return Type: void
	 */
	public void verifyLastNoticationmatch() {
		try{result="FAILED";
		if(instbellnoti.verifyLastNoticationmatch()) {
			result="PASSED";
		}}catch(Exception e) {
			result="FAILED";
		}
	}
	
	/* Function name: verifyEmptyNotification()
	 * Action: Verify Instructor bell Notification- No notification found
	 * Return Type: void
	 */
	public void verifyclickHomeaction() {
		try{result="FAILED";
		if(instbellnoti.verifyclickHomeaction()) {
			result="PASSED";
		}}catch(Exception e) {
			result="FAILED";
		}
		instLogout();
	}
	
	/*Function name: verifyclickHomeaction()
	 *Action: instructor side - Click home in breadcrumb and verify land dashboard
	 * Return Type: void
	 */
	public void verifyClickNotification() {
		try{result="FAILED";
		if(instbellnoti.verifyClickNotification()) {
			result="PASSED";
		}}catch(Exception e) {
			result="FAILED";
		}		
	}
	
	/* Function name: adminCheckAndInvitesInstructor()
	 * Action: admin invites an instructor
	 * Return Type: void
	 */
	public void adminCheckAndInvitesInstructor(String mailID,String instName, String Instnumber, String Searchclassroom) {
		try{
			//classroomSettingsPage.gotoClassroomSettings();
			//		classroomSettingsPage.checkInstructorExists(mailID);
			instbellnoti.goToclassroom();
			//instbellnoti.editClassroom(instName);
			instbellnoti.editEvent(Searchclassroom,"editInstructor",Instnumber,"");
			adminLogout();
		}catch(Exception e) {
			result="FAILED";
		}
	}
	
	/* Function name: adminRescheduledEvent()
	 * Action: admin reschedules the event
	 * Return Type: void
	 */
	public void adminRescheduledEvent(String changezone, String Searchclassroom){
		try{instbellnoti.goToclassroom();
		instbellnoti.editEvent(Searchclassroom,"editTimeZone","",changezone);
		adminLogout();
		}catch(Exception e) { 
			result="FAILED";
		}
	}
	
	/* Function name: prerequisite()
	 * Action: prerequisite- change the function before start the execution
	 * Return Type: void
	 */
	public void prerequisite(String Instnumber,String changezone, String Searchclassroom) {
		instbellnoti.goToclassroom();
		instbellnoti.editEvent(Searchclassroom,"prerequisite",Instnumber,changezone);
		adminLogout();
	}
}