package com.origin.fractal.testauto.steps;

import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBaseStep;
import com.origin.fractal.testauto.pages.ClassroomPage;
import com.origin.fractal.testauto.pages.DeleteEventandClassroomPage;

public class DeleteEventandClassroomSteps extends FractalBaseStep{
	public DeleteEventandClassroomPage page;
	public DeleteEventandClassroomSteps(WebDriver driver) {
		page = new DeleteEventandClassroomPage(driver);
		fBPage = page;
	}
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
	public void instructorLogin() {
		result ="PASSED";
		   try {
			page.instructorLogin();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }	// TODO Auto-generated method stub
		
	}
	public void instructorAccept() {
		result ="PASSED";
		   try {
			page.instructorAccept();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }	// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub
		
	}
	public void accepteventDelete() {
		result ="PASSED";
		   try {
			page.accepteventDelete();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }	// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub
		
	}
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