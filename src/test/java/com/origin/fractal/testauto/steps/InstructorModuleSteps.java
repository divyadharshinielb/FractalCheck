package com.origin.fractal.testauto.steps;
import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBaseStep;
import com.origin.fractal.testauto.pages.InstructorModulePage;

public class InstructorModuleSteps extends FractalBaseStep {
	private InstructorModulePage page=null;


	public InstructorModuleSteps(WebDriver driver) {
		page = new InstructorModulePage(driver);
		fBPage = page;
	}
	public void verifyDashboardSubHeaders() {
		 result ="PASSED";
		   try {
				page.verifyDashboardSubHeaders();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	public void verifyEventSectionLabels(){
		result ="PASSED";
		   try {
				page.verifyEventSectionLabels();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	public void verifyButtons() {
		 result ="PASSED";
		   try {
				page.verifyButtons();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	public void verifyPopupButtons() {
		 result ="PASSED";
		   try {
				page.verifyPopupButtons();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	public void verifyNextEventSectionViewAll() {
		 result ="PASSED";
		   try {
				page.verifyNextEventSectionViewAll();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	public void verifyInvitesReminderViewAll() {
		 result ="PASSED";
		   try {
				page.verifyInvitesReminderViewAll();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	
	public void verifyEventsPageLabels() {
		result ="PASSED";
		   try {
				page.verifyEventsPageLabels();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	public void verifyEventsInvitesClick(){
		result ="PASSED";
		   try {
				page.verifyEventsInvitesClick();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	public void verifyLabelsInsideEventDetailsPage(){
	result ="PASSED";
	   try {
			page.verifyLabelsInsideEventDetailsPage();
	   }
	   catch(Exception e)
	   {
		e.printStackTrace();   
		result="FAILED";
	   }
    }
	public void verifyInprogressEvent(){
	result ="PASSED";
	   try {
			page.verifyInprogressEvent();
	   }
	   catch(Exception e)
	   {
		e.printStackTrace();   
		result="FAILED";
	   }
    }
	public void  verifyUpcomingEvent() {
		result ="PASSED";
		   try {
				page.verifyUpcomingEvent();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	public void verifyCompletedEvent(){
	result ="PASSED";
	   try {
			page.verifyCompletedEvent();
	   }
	   catch(Exception e)
	   {
		e.printStackTrace();   
		result="FAILED";
	   }
    }
	public void verifySkillsetList() {
	  result ="PASSED";
		   try {
				page.verifySkillsetList();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	public void verifyActivitiesAndRosterTab() {
		result ="PASSED";
		   try {
				page.verifyActivitiesAndRosterTab();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	public void verifyEvalutionDueDateReachingEvent() {
		result ="PASSED";
		   try {
				page.verifyEvalutionDueDateReachingEvent();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	public void verifyReviewButton(){
		result ="PASSED";
		   try {
				page.verifyReviewButton();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	public void verifyReviewInsideLabels() {
		result ="PASSED";
		   try {
				page.verifyReviewInsideLabels();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
}
