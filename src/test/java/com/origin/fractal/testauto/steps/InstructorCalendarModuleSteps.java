package com.origin.fractal.testauto.steps;

import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBaseStep;
import com.origin.fractal.testauto.pages.InstructorCalendarModulePage;

/* File/Class name: InstructorCalendarModuleSteps.java
 * Created by: Vignesh 
 * Updated on: 4-Jun-2020
 * Purpose: This includes all the required steps level functions for the following user stories -
 * FR1-2164 Instructor Module - Calendar - Event view, Search view 
 * FR1-2382 Instructor accepting event for the same day
 */
public class InstructorCalendarModuleSteps extends FractalBaseStep {
	InstructorCalendarModulePage InstructorModule;
	public InstructorCalendarModuleSteps(WebDriver driver) {
		InstructorModule=new InstructorCalendarModulePage(driver);
	}

	/* Method name: deleteOldEventAndAddNewEvent()
	 * Created by: Vignesh 
	 * Created date: 4/Jun/2020
	 * Return type: void
	 * Desc: Admin adds an event in classroom
	 */	
	public void deleteOldEventAndAddNewEvent() {
		InstructorModule.deleteOldEventAndAddNewEvent();
	}

	/* Method name: adminDeleteEvent()
	 * Created by: Vignesh 
	 * Created date: 4/Jun/2020
	 * Return type: void
	 * Desc: Admin delete an event in classroom
	 */	
	public void adminDeleteEvent() {
		InstructorModule.adminDeleteEvent();
	}

	/* Method name: verifyAdminInviteAndInstructorAcceptevent()
	 * Created by: Vignesh 
	 * Created date: 4/Jun/2020
	 * Return type: void
	 * Desc: Instructor Calendar Event- Invite notification and accept a notification
	 */	
	public void verifyAdminInviteAndInstructorAcceptevent() {
		result="FAILED";
		InstructorModule.gotoInstructorCalendar();
		try {
			if(InstructorModule.verifyAdminInviteAndInstructorAcceptevent()==true) {
				result="PASSED";
			}}
		catch(Exception e){
			result="FAILED";
		}
	}

	/* Method name: verifyAdminReAssignOrDeletetheEvent()
	 * Created by: Vignesh 
	 * Created date: 4/Jun/2020
	 * Return type: void
	 * Desc: Instructor Calendar Event- Verify Invite notification or accept a notification is present
	 */	
	public void verifyAdminReAssignOrDeletetheEvent() {
		result="FAILED";
		InstructorModule.gotoInstructorCalendar();
		try {
			if(InstructorModule.verifyAdminReAssignOrDeletetheEvent()==true) {
				result="PASSED";
			}}
		catch(Exception e){
			result="FAILED";
		}
	}

	/* Method name: verifyRescheduleTimeZoneInInstructorSide() 
	 * Created by: Vignesh 
	 * Created date: 5/Jun/2020
	 * Return type: void
	 * Desc: Instructor Calendar Event- Verify Resuchedule Invite notification or accept a notification is present
	 */
	public void verifyRescheduleTimeZoneInInstructorSide() {
		result="FAILED";
		InstructorModule.gotoInstructorCalendar();
		try {
			if(InstructorModule.verifyRescheduleTimeZoneInInstructorSide()==true) {
				result="PASSED";
			}}
		catch(Exception e){
			result="FAILED";
		}
	}

	/* Method name: instructorRejectEvent()
	 * Created by: Vignesh 
	 * Created date: 5/Jun/2020
	 * Return type: void
	 * Desc: Instructor Calendar Event- Verify Reject the Invite notification 
	 */
	public void instructorRejectEvent() {
		InstructorModule.instructorRejectEvent();
	}

	/* Method name: verifyAdminSeeInstructorWarningMessage()
	 * Desc: Admin able to see the Warning Message when Create an event Same time and Same Instructor 
	 * Return type: boolean
	 * Created by: Vignesh 
	 * Created date: 8/Jun/2020
	 */
	public void verifyAdminSeeInstructorWarningMessage() {
		result="FAILED";
		try {
			if(InstructorModule.verifyAdminSeeInstructorWarningMessage()==true) {
				result="PASSED";
			}}
		catch(Exception e){
			result="FAILED";
		}
	}
}
