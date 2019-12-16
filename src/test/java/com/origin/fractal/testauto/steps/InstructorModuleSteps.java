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
		 result ="Passed";
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
		result ="Passed";
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
		 result ="Passed";
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
		 result ="Passed";
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
		 result ="Passed";
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
		 result ="Passed";
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
		result ="Passed";
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
		result ="Passed";
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
	result ="Passed";
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
	result ="Passed";
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
		result ="Passed";
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
	result ="Passed";
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
	  result ="Passed";
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
		result ="Passed";
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
		result ="Passed";
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
		result ="Passed";
		   try {
				page.verifyReviewButton();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
}
