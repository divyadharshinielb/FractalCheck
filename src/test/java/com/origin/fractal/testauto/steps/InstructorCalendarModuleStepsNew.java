package com.origin.fractal.testauto.steps;

import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBaseStep;
import com.origin.fractal.testauto.pages.InstructorCalendarModulePageNew;

/* File/Class name: InstructorCalendarModuleSteps.java
 * Created by: Vignesh 
 * Updated on: 27-Mar-2021
 * Purpose: This includes all the required steps level functions for the following user stories -
 * FR1-2164 Instructor Module - Calendar - Event view, Search view 
 * FR1-2382 Instructor accepting event for the same day
 */
public class InstructorCalendarModuleStepsNew extends FractalBaseStep {
	InstructorCalendarModulePageNew InstructorModule;
	InstructorBellNotificationSteps bell;
	public InstructorCalendarModuleStepsNew(WebDriver driver) {
		InstructorModule=new InstructorCalendarModulePageNew(driver);
		bell = new InstructorBellNotificationSteps(driver);
	}

	/* Method name: verifyTradInviteNotification()
	 * Return type: void
	 * Desc: Instructor Calendar Event- Invite notification 
	 */	
	public void verifyTradInviteNotification() {
		try {
			result="FAILED";
		InstructorModule.gotoInstructorCalendar();
		if(InstructorModule.verifyTradInviteNotification()==true) {
			result="PASSED";
		}
		System.out.println("checking...."+result);
		}
		catch(Exception e){
			result="FAILED";
		}
	}

	/* Method name: verifyVirInviteNotification()
	 * Return type: void
	 * Desc: Instructor Calendar Event- Invite notification 
	 */	
	public void verifyVirInviteNotification() {
		try {
			result="FAILED";
		if(InstructorModule.verifyVirInviteNotification()==true) {
			result="PASSED";
		}
		System.out.println("checking...."+result);
		}
		catch(Exception e){
			result="FAILED";
		}
	}

	/*
	 * Method name: verifyTredAcceptedEnvent()
	 * Return type: void
	 * Desc: Instructor Calendar Event- Green dot on calendar
	 */	
	public void verifyTredAcceptedEnvent() {
		try {result="FAILED";
		if(InstructorModule.verifyTredAcceptedEnvent()==true) {
			result="PASSED";
		}
		System.out.println("checking...."+result);
		}
		catch(Exception e){
			result="FAILED";
		}
	}

	/*
	 * Method name: verifyVirAcceptedEnvent()
	 * Return type: void
	 * Desc: Instructor Calendar Event- Green dot on calendar
	 */	
	public void verifyVirAcceptedEnvent() {
		
		try {
			result="FAILED";
		if(InstructorModule.verifyVirAcceptedEnvent()==true) {
			result="PASSED";
		}
		System.out.println("checking...."+result);
		}
		catch(Exception e){
			result="FAILED";
		}
	}

	/*
	 * Method name: verifyTredInviteAccepts()
	 * Return type: void
	 * Desc: Instructor Calendar Event- Invite accepts 
	 */	
	public void verifyTredInviteAccepts() {
		try {result="FAILED";
		if(InstructorModule.verifyTredInviteAccepts()==true) {
			result="PASSED";
		}
		System.out.println("checking...."+result);
		}
		catch(Exception e){
			result="FAILED";
		}
	}

	/*
	 * Method name: verifyVirInviteAccepts()
	 * Return type: void
	 * Desc: Instructor Calendar Event- Invite accepts 
	 */	
	public void verifyVirInviteAccepts() {
	
		try {
			result="FAILED";
		if(InstructorModule.verifyVirInviteAccepts()==true) {
			result="PASSED";
		}
		System.out.println("checking...."+result);
		}
		catch(Exception e){
			result="FAILED";
		}
	}

	/*
	 * Method name: verifyTredInviteReject()
	 * Return type: void
	 * Desc: Instructor Calendar Event- Reject the event
	 */	
	public void verifyTredInviteReject() {
		try {result="FAILED";
		if(InstructorModule.verifyTredInviteReject()==true) {
			result="PASSED";
		}
		System.out.println("checking...."+result);
		}
		catch(Exception e){
			result="FAILED";
		}	

	}


	/* Function name: adminRescheduledEvent()
	 * Action: admin reschedules the event
	 * Return Type: void
	 */
	public void adminRescheduledEvent(String Check){
		
		try{result="PASSED";
			bell.gotoClassRoom(); 
		InstructorModule.editEvent(Check);
		System.out.println("checking...."+result);
		}catch(Exception e) { 
			result="FAILED";
		}
	}
	
	/*
	 * Method name: verifyResucheduleTimeZoneTre()
	 * Return type: void
	 * Desc: Instructor Calendar Event- Verify Reschedule Invite notification 
	 */
	public void verifyResucheduleTimeZoneTre() {
		try {result="FAILED";
		if(InstructorModule.verifyResucheduleTimeZoneTre()==true) {
			result="PASSED";
		}
		System.out.println("checking...."+result);
		}
		catch(Exception e){
			result="FAILED";
		}	
		
	}
	
	/*
	 * Method name: verifyResucheduleTimeZoneVir()
	 * Return type: void
	 * Desc: Instructor Calendar Event- Verify Reschedule Invite notification 
	 */
	public void verifyResucheduleTimeZoneVir() {
		try {result="FAILED";
		if(InstructorModule.verifyResucheduleTimeZoneVir()==true) {
			result="PASSED";
		}
		System.out.println("checking...."+result);
		}
		catch(Exception e){
			result="FAILED";
		}	
		
	}
	
}
