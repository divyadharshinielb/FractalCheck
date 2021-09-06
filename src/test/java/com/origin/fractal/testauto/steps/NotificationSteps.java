package com.origin.fractal.testauto.steps;

import org.openqa.selenium.WebDriver;


import com.origin.fractal.testauto.FractalBaseStep;
import com.origin.fractal.testauto.pages.MenuPage;
import com.origin.fractal.testauto.pages.NotificationPage;

/*
 * File: NotificationSteps.java
 * Purpose: The Admin able to  check Notification
 * Created by: Mahesh.G
 * Updated on: 30-Sep-2021
 */

public class NotificationSteps extends FractalBaseStep{
	public NotificationPage page;
	public NotificationSteps(WebDriver driver) {
		page = new NotificationPage(driver);
		fBPage = page;
}
	public void	gotoEmailNotificationTab() {
		page.gotoEmailNotificationTab();
	}
	/* Method: verifyPasswordChangedTemplate();
	 * purpose: check verifyPasswordChangedTemplate
	 */
	public void verifyPasswordChangedTemplate() {
		result ="PASSED";
	try {
		page.verifyPasswordChangedTemplate();
	}
	catch(Exception e)
	{
		e.printStackTrace();   
		result="FAILED";
	}
  }
	/* Method: verifyPurchaseMailTemplate();
	 * purpose: check admin verifyPurchaseMailTemplate
	 */
	public void verifyPurchaseMailTemplate() {
		result ="PASSED";
		try {
			page.verifyPurchaseMailTemplate();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	/* Method: verifyUnAssignTemplate();
	 * purpose: check admin verifyUnAssignTemplate
	 */
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
	/* Method: verifyUsersForgotPasswordMail();
	 * purpose: check admin verifyUsersForgotPasswordMail
	 */
	public void verifyUsersForgotPasswordMail() {
		result ="PASSED";
		try {
			page.verifyUsersForgotPasswordMail();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}	
	}
	/* Method: verifyTemplateForValidityExpired();
	 * purpose: check admin verifyTemplateForValidityExpired
	 */
	public void verifyTemplateForValidityExpired() {
		result ="PASSED";
		try {
			page.verifyTemplateForValidityExpired();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}	
	}
	/* Method: verifyContentAssignment();
	 * purpose: check admin verifyContentAssignment
	 */
	public void verifyContentAssignment() {
		result ="PASSED";
		try {
			page.verifyContentAssignment();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}	
	}
	/* Method: verifyBusinessUserRegistration();
	 * purpose: check admin verifyBusinessUserRegistration
	 */
	public void verifyBusinessUserRegistration() {
		result ="PASSED";
		try {
			page.verifyBusinessUserRegistration();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}	
	}
	/* Method: verifyAccessEnable();
	 * purpose: check admin verifyAccessEnable
	 */
	public void verifyAccessEnable(){
		result ="PASSED";
		try {
			page.verifyAccessEnable();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}	
	}
	/* Method: verifyBusinessAdminDirectUser();
	 * purpose: check admin verifyBusinessAdminDirectUser
	 */
	public void verifyBusinessAdminDirectUser() {
		result ="PASSED";
		try {
			page.lblBusinessAdminDirectUser();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}	
	}
	/* Method: VerifyInstructorConfirmation();
	 * purpose: check admin VerifyInstructorConfirmation
	 */
	public void VerifyInstructorConfirmation() {
	result ="PASSED";
	try {
		page.lblInstructorConfirmation();
	}
	catch(Exception e)
	{
		e.printStackTrace();   
		result="FAILED";
	}	
	}
	/* Method: verifyInstructorEventNotification();
	 * purpose: check admin verifyInstructorEventNotification
	 */
	public void verifyInstructorEventNotification() {
		result ="PASSED";
		try {
			page.lblInstructorEventNotification();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}	
	}
	/* Method: verifyUserRegistrationForInstructor();
	 * purpose: check admin verifyUserRegistrationForInstructor
	 */
	public void verifyUserRegistrationForInstructor() {
		result ="PASSED";
		try {
			page.lblUserRegistrationForInstructor();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}	
	}
	/* Method: verifyRemainderEvent();
	 * purpose: check admin verifyRemainderEvent
	 */
	public void verifyRemainderEvent() {
		result ="PASSED";
		try {
			page.lblRemainderEvent();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}	
	}
}
