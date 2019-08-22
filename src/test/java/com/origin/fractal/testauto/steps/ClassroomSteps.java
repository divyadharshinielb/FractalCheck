package com.origin.fractal.testauto.steps;

import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBaseStep;
import com.origin.fractal.testauto.pages.ClassroomPage;

public class ClassroomSteps extends FractalBaseStep{
	public ClassroomPage page;
	public ClassroomSteps(WebDriver driver) {
		page = new ClassroomPage(driver);
		fBPage = page;
	}
	public void fieldValidation() {
		result ="Passed";
		   try {
			page.fieldValidation();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	public void addClassroomPage() {
		result ="Passed";
		   try {
			page.addClassroomPage();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	public void editClassroomPage() {
		result ="Passed";
		   try {
			page.editClassroomPage();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	public void deleteClassroomPage() {
		result ="Passed";
		   try {
			page.deleteClassroomPage();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	public void cautionAlertsForMandatoryFields() {
		result ="Passed";
		   try {
			page.cautionAlertsForMandatoryFields();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	public void addEventPage() {
		result ="Passed";
		   try {
			page.addEventPage();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	public void titleAcceptsCharater(){
		result ="Passed";
		   try {
			page.titleAcceptsCharater();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	public void completionCriteriaCheckUncheck() {
		result ="Passed";
		   try {
			page.completionCriteriaCheckUncheck();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }	
	}
	public void singleAndMultiInstructor() {
		result ="Passed";
		   try {
			page.singleAndMultiInstructor();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	public void classroomPageInformation() {
		result ="Passed";
		   try {
			page.classroomPageInformation();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	public void durationNumericValue() {
		result ="Passed";
		   try {
			page.durationNumericValue();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	public void surveyLinks() {
		result ="Passed";
		   try {
			page.surveyLinks();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	public void preEventValidateFields() {
		result ="Passed";
		   try {
			page.preEventValidateFields();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	public void postEventValidateFields() {
		result ="Passed";
		   try {
			page.postEventValidateFields();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	public void verifySessionTab() {
		result ="Passed";
		   try {
			page.verifySessionTab();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	public void eventPageValidation() {
		result ="Passed";
		   try {
			page.eventPageValidation();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	public void classroomListedPage() {
		result ="Passed";
		   try {
			page.classroomListedPage();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	public void eventListedPage() {
		result ="Passed";
		   try {
			page.eventListedPage();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
}
