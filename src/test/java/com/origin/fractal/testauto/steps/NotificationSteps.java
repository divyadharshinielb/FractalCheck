package com.origin.fractal.testauto.steps;

import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBaseStep;
import com.origin.fractal.testauto.pages.MenuPage;
import com.origin.fractal.testauto.pages.NotificationPage;

public class NotificationSteps extends FractalBaseStep{
	public NotificationPage page;
	public NotificationSteps(WebDriver driver) {
		page = new NotificationPage(driver);
		fBPage = page;
}
	public void	gotoEmailNotificationTab() {
		page.gotoEmailNotificationTab();
	}
	public void verifyPasswordChangedTemplate() {
		page.verifyPasswordChangedTemplate();
	}
	public void verifyPurchaseMailTemplate() {
		page.verifyPurchaseMailTemplate();
	}
	public void verifyUnAssignTemplate() {
		result ="PASSED";
		try {
			page.verifyUnAssignTemplate();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}	
	}
	public void verifyCourseCompletionTemplate() {
		page.verifyCourseCompletionTemplate();
	}
	public void verifyUsersForgotPasswordMail() {
		page.verifyUsersForgotPasswordMail();
	}
	public void verifyTemplateForValidityExpired() {
		page.verifyTemplateForValidityExpired();
	}
	public void verifyContentAssignment() {
		page.verifyContentAssignment();
	}
	public void verifyBusinessUserRegistration() {
		page.verifyBusinessUserRegistration();
	}
}
