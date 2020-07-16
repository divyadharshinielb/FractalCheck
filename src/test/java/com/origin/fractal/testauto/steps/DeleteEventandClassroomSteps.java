package com.origin.fractal.testauto.steps;

import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBaseStep;
import com.origin.fractal.testauto.pages.DeleteEventandClassroomPage;
/* File Name: DeleteEventandClassroomSteps.java
 * Purpose: Check notification for instructor on deleting event and classroom -FR1-2078 -Step level codes
 * Created by: DivyaDharshini
 * Created on: 25-May-2020
 */

public class DeleteEventandClassroomSteps extends FractalBaseStep{
	public DeleteEventandClassroomPage page;
	public DeleteEventandClassroomSteps(WebDriver driver) {
		page = new DeleteEventandClassroomPage(driver);
		fBPage = page;
	}
	/*
	 * function: Classroomcreate()
	 * covers: It covers navigation of classroomcreate function in DeleteEventandClassroomPage
	 */
	public void Classroomcreate() {
		result ="PASSED";
		try {
			page.Classroomcreate();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	/*
	 * function:  eventCreation()
	 * covers: It covers navigation of eventCreation function in DeleteEventandClassroomPage
	 */
	public void eventCreation() {
		result ="PASSED";
		try {
			page.eventCreation();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	/*
	 * function: instructorLogin()
	 * covers: It covers navigation of instructorLogin function in DeleteEventandClassroomPage
	 */
	public void instructorLogin() {
		result ="PASSED";
		try {
			page.instructorLogin();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	/*
	 * function: instructorAccept()
	 * covers: It covers navigation of instructorAccept function in DeleteEventandClassroomPage
	 */
	public void instructorAccept() {
		result ="PASSED";
		try {
			page.instructorAccept();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}	
	}
	/*
	 * function: accepteventDelete()
	 * covers: It covers navigation of accepteventDelete function in DeleteEventandClassroomPage
	 */
	public void accepteventDelete() {
		result ="PASSED";
		try {
			page.accepteventDelete();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}		
	}
	/*
	 * function: eventDeletebeforeaccept()
	 * covers: It covers navigation of eventDeletebeforeaccept function in DeleteEventandClassroomPage
	 */
	public void eventDeletebeforeaccept() {
		result ="PASSED";
		try {
			page.eventDeletebeforeaccept();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}	
	}
	/*
	 * function : classroomDelete() 
	 * covers: It covers navigation of classroomDelete function in DeleteEventandClassroomPage
	 */
	public void classroomDelete() {

		result ="PASSED";
		try {
			page.classroomDelete();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}	

	}
	/*
	 * function:  logoutAdmin()
	 * covers: It covers navigation of logoutAdmin function in DeleteEventandClassroomPage
	 */
	public void logoutAdmin() {
		result ="PASSED";
		try {
			page.logoutAdmin();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}	


	}
}