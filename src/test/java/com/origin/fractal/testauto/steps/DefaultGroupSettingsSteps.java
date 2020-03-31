package com.origin.fractal.testauto.steps;

import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBaseStep;
import com.origin.fractal.testauto.pages.DefaultGroupSettingsPage;
import com.origin.fractal.testauto.pages.InstructorModulePage;

public class DefaultGroupSettingsSteps extends FractalBaseStep {
	private DefaultGroupSettingsPage page=null;
	
	public DefaultGroupSettingsSteps(WebDriver driver) {
		page = new DefaultGroupSettingsPage(driver);
		fBPage = page;
	}
	public void verifyAssignUnassignUser() {
		 result ="PASSED";
		   try {
				page.verifyAssignUnassignUser();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	
}
	public void googleBtnRegistration() {
		 result ="PASSED";
		   try {
				page.googleBtnRegistration();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	
}
	public void facebookButton() {
	 result ="PASSED";
	   try {
			page.facebookButton();
	   }
	   catch(Exception e)
	   {
		e.printStackTrace();   
		result="FAILED";
	   }
}
}

