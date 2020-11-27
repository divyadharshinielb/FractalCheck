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
	public void userdeletion_google() {
		result ="PASSED";
		try {
			page.userdeletion_google();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}

	public void userdelete_facebook() {
		result ="PASSED";
		try {
			page.userdelete_facebook();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}

	// Added by vignesh on 5-Oct-20
	/* Function Name: assignContentsToGroup()
	 * purpose: Assign the catalog items to group
	 */
	public void assignContentsToGroup() {
		result="FAILED";
		try {
			page.assignContentsToGroup();
			result ="PASSED";
		}
		catch(Exception e)
		{
			result="FAILED";
		}
	}
	//End

}

