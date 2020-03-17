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
		result ="PASSED";
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
		result ="PASSED";
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
		result ="PASSED";
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
		result ="PASSED";
		   try {
			page.cautionAlertsForMandatoryFields();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	public void cautionAlertsForClassroomTitle() {
		result ="PASSED";
		   try {
			page.cautionAlertsForClassroomTitle();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	public void cautionAlertsForClassroomVenue(){
		result ="PASSED";
		   try {
			page.cautionAlertsForClassroomVenue();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	public void  cautionAlertsForCategorySelection(){
		result ="PASSED";
		   try {
			page.cautionAlertsForCategorySelection();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	public void cautionAlertsForClassroomDescription(){
		result ="PASSED";
		   try {
			page.cautionAlertsForClassroomDescription();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	public void cautionAlertsForSkillsetSelection(){
		result ="PASSED";
		   try {
			page.cautionAlertsForSkillsetSelection();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	public void cautionAlertsForInstructorSelection(){
		result ="PASSED";
		   try {
			page.cautionAlertsForInstructorSelection();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	public void addEventPage() {
		result ="PASSED";
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
		result ="PASSED";
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
		result ="PASSED";
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
		result ="PASSED";
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
		result ="PASSED";
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
		result ="PASSED";
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
		result ="PASSED";
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
		result ="PASSED";
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
		result ="PASSED";
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
		result ="PASSED";
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
		result ="PASSED";
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
		result ="PASSED";
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
		result ="PASSED";
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
