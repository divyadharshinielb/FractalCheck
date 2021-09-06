package com.origin.fractal.testauto.pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBasePage;

/*
 * File: NotificationPage.java
 * Purpose: The Admin able to  check Notification
 * Created by: Mahesh.G
 * Updated on: 30-Sep-2021
 */

public class NotificationPage extends FractalBasePage{
	private By lblEmailNotification=By.xpath("//span[@id='step-9']");
	private By lblPasswordChangedTemplate=By.xpath("//span[contains(text(),'Password Changed Template')]");
	private By lblPurchaseMailTemplate=By.xpath("//span[contains(text(),'Purchase Mail Template')]");
	private By lblUnAssignTemplate=By.xpath("//span[contains(text(),'Unassign Template')]");
	private By lblUsersForgotPasswordMail=By.xpath("//span[contains(text(),'Users Forgot Password Mail')]");
	private By lblTemplateForValidityExpired=By.xpath("//span[contains(text(),'Template for Validity Expired')]");
	private By lblContentAssignment=By.xpath("//span[contains(text(),'Content Assignment')]");
	private By lblBusinessUseReg=By.xpath("//span[contains(text(),'Business User Registration')]");
	private By lblPreview=By.xpath("//button[@id='popover']");
	private By lblBack=By.xpath("//div[contains(text(),'Back To List')]");
	private By lblLoginBtn=By.xpath("//a[contains(text(),'LOGIN')]");
	private By lblNewPasswordText=By.xpath("//h3[contains(text(),'You’ve got a new password!')]");
	private By lblKeepLearningText=By.xpath("//p[contains(text(),'Keep Learning!')]");
	private String lblFooterText="//p[contains(text(),'This is an auto-generated email. Please do not rep')]";
	private By lblTemplateName=By.xpath("//p[2]");
	private By lblPurchaseText=By.xpath("//h3[contains(text(),'Here’s your Purchase Statement.')]");
	private By lblPurchaseItem=By.xpath("//td[contains(text(),'ITEM_PURCHASED')]");
	private By lblUnassignText=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[3]/div[1]/form[1]/div[2]/div[3]/div[1]/span[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/h3[1]");
	private By lblRelaunchBtn=By.xpath("//a[contains(text(),'EXPLORE')]");
	private By lblforgotPasswordText=By.xpath("//h3[contains(text(),'Looks like you forgot your password!')]");
	private By lblResetYourPasswordBtn=By.xpath("//a[contains(text(),'RESET YOUR PASSWORD')]");
	private By lblHiNameText=By.xpath("//p[contains(text(),'Hi NAME!')]");
	private By lblValidityExpiredText=By.xpath("//h3");
	private By lblExploreBtn=By.xpath("//a[contains(text(),'EXPLORE')]");
	private By lblContentAssignText=By.xpath("//h3[contains(text(),'A new learning journey awaits you!')]");
	private By lblLaunchBtn=By.xpath("//a[contains(text(),'LAUNCH')]");
	private By lblRegistrationText=By.xpath("//h3");
	private By lblWelcomHiNameText=By.xpath("//p[contains(text(),'Welcome NAME!')]");
	
	private By lblAccessEnabled=By.xpath("//span[contains(text(),'Access Enabled')]");
	private By lblBusinessAdminDirectUser=By.xpath("//span[contains(text(),'Business Admin and Direct User Registration Confi')]");
	private By lblInstructorConfirmation=By.xpath("//span[contains(text(),'Instructor Availability Confirmation')]");
	private By lblInstructorEventNotification=By.xpath("//span[contains(text(),'Instructor Event Notification')]");
	private By lblUserRegistrationForInstructor=By.xpath("//span[contains(text(),'Wait List User Registration for Event')]");
	private By lblRemainderEvent=By.xpath("//span[contains(text(),'Remainder for Event')]");
	public NotificationPage(WebDriver driver) {
			super(driver);
		}
	 public void  gotoEmailNotificationTab() {
		 click(lblEmailNotification);
		 
	 }
	 /* Method: verifyPasswordChangedTemplate();
		 * purpose: check admin verifyPasswordChangedTemplate
		 */
	 public void  verifyPasswordChangedTemplate() {
		 wait(5);
		 click(lblPasswordChangedTemplate);
		 wait(5);
		 click(lblPreview);
		 wait(5);
		 verifyText("You’ve got a new password!",lblNewPasswordText);
		 wait(5);
		 verifyText("Hi NAME!",lblHiNameText);
		 wait(5);
		String expectedString=getText(lblTemplateName);
		verifyText(expectedString,lblTemplateName);
		wait(5);
		verifyText("LOGIN",lblLoginBtn);
		verifyText("Keep Learning!",lblKeepLearningText);
		templateFooterText(lblFooterText);
		wait(5);
		click(lblBack);
	 }
	 /* Method: verifyPurchaseMailTemplate();
		 * purpose: check admin verifyPurchaseMailTemplate
		 */
	 public void verifyPurchaseMailTemplate() {
		 wait(5);
		 click(lblPurchaseMailTemplate);
		 wait(5);
		 click(lblPreview);
		 verifyText("Here’s your Purchase Statement.",lblPurchaseText);
		 wait(5);
		 verifyText("Hi NAME!",lblHiNameText);
		 wait(5);
		 String expectedString=getText(lblTemplateName);
		 verifyText(expectedString,lblTemplateName);
		 wait(5);
		 verifyText("ITEM_PURCHASED",lblPurchaseItem);
		 verifyText("Keep Learning!",lblKeepLearningText);
		 templateFooterText(lblFooterText);
		 wait(5);
		 click(lblBack);
	 }
	 /* Method: verifyUnAssignTemplate();
		 * purpose: check admin verifyUnAssignTemplate
		 */
	 public void verifyUnAssignTemplate() {
		wait(5);
		click(lblUnAssignTemplate);
		wait(5);
		click(lblPreview);
		verifyText("Here's what happened...",lblUnassignText);
		wait(5);
		 verifyText("Hi NAME!",lblHiNameText);
		 wait(5);
		String expectedString=getText(lblTemplateName);
		verifyText(expectedString,lblTemplateName);
	    wait(5);
	    verifyText("EXPLORE",lblExploreBtn);
	    verifyText("Keep Learning!",lblKeepLearningText);
		templateFooterText(lblFooterText);
		wait(5);
	    click(lblBack);
	 }
	 /* Method: verifyUsersForgotPasswordMail();
		 * purpose: check admin verifyUsersForgotPasswordMail
		 */
	 public void verifyUsersForgotPasswordMail() {
		 wait(5);
		 click(lblUsersForgotPasswordMail);
		 wait(5);
		 click(lblPreview);
		 verifyText("Looks like you forgot your password!",lblforgotPasswordText);
		 wait(5);
		 verifyText("Hi NAME!",lblHiNameText);
		 wait(5);
		 String expectedString=getText(lblTemplateName);
		 verifyText(expectedString,lblTemplateName);
		 wait(5);
		 verifyText("RESET YOUR PASSWORD",lblResetYourPasswordBtn);
		 verifyText("Keep Learning!",lblKeepLearningText);
		 templateFooterText(lblFooterText);
		 wait(5);
		 click(lblBack);
	 }
	 /* Method: verifyTemplateForValidityExpired();
		 * purpose: check admin verifyTemplateForValidityExpired
		 */
	 public void verifyTemplateForValidityExpired() {
		 wait(5);
		 click(lblTemplateForValidityExpired);
		 wait(5);
		 click(lblPreview);
		 verifyText("Here's what happened...",lblValidityExpiredText);
		 wait(5);
		 verifyText("Hi NAME!",lblHiNameText);
		 wait(5);
		 String expectedString=getText(lblTemplateName);
		 verifyText(expectedString,lblTemplateName);
		 wait(5);
		 verifyText("EXPLORE",lblExploreBtn);
		 verifyText("Keep Learning!",lblKeepLearningText);
		 templateFooterText(lblFooterText);
		 wait(5);
		 click(lblBack);
	 }
	 /* Method: verifyContentAssignment();
		 * purpose: check admin verifyContentAssignment
		 */
	 public void verifyContentAssignment() {
		 wait(5);
		 click(lblContentAssignment);
		 wait(5);
		 click(lblPreview);
		 verifyText("A new learning journey awaits you!",lblContentAssignText);
		 wait(5);
		 verifyText("Hi NAME!",lblHiNameText);
		 wait(5);
		 String expectedString=getText(lblTemplateName);
		 verifyText(expectedString,lblTemplateName);
		 wait(5);
		 verifyText("LAUNCH",lblLaunchBtn);
		 verifyText("Keep Learning!",lblKeepLearningText);
		 templateFooterText(lblFooterText);
		 wait(5);
		 click(lblBack);
		 
	 }
	 /* Method: verifyBusinessUserRegistration();
		 * purpose: check admin verifyBusinessUserRegistration
		 */
	 public void  verifyBusinessUserRegistration() {
		 wait(5);
		 click(lblBusinessUseReg);
		 wait(5);
		 click(lblPreview);
		 wait(5);
		 verifyText("You're in! Registration confirmed...",lblRegistrationText);
		 wait(5);
		 verifyText("Welcome NAME!",lblWelcomHiNameText);
		 wait(5);
		 String expectedString=getText(lblTemplateName);
		 verifyText(expectedString,lblTemplateName);
		 wait(5);
		 verifyText("LAUNCH",lblLaunchBtn);
		 verifyText("Keep Learning!",lblKeepLearningText);
		 templateFooterText(lblFooterText);
		 wait(5);
		 click(lblBack);
	 }
	 /* Method: verifyAccessEnable();
		 * purpose: check admin verifyAccessEnable
		 */
	 public void verifyAccessEnable() {
		 wait(5);
		 click(lblAccessEnabled);
		 wait(6);
		 click(lblPreview);
		 wait(5);
		 verifyText("You're in! Registration confirmed...",lblRegistrationText);
		 wait(5);
	//	 verifyText("Welcome NAME!",lblWelcomHiNameText);
		 wait(5);
		 String expectedString=getText(lblTemplateName);
		 verifyText(expectedString,lblTemplateName);
		 wait(5);
		 verifyText("LAUNCH",lblLaunchBtn);
		 verifyText("Keep Learning!",lblKeepLearningText);
		 templateFooterText(lblFooterText);
		 wait(5);
		 click(lblBack);

	 }
	 /* Method: lblBusinessAdminDirectUser();
		 * purpose: check admin lblBusinessAdminDirectUser
		 */
	 public void lblBusinessAdminDirectUser() {
		 wait(8);
		 click(lblBusinessAdminDirectUser);
		 wait(6);
		 click(lblPreview);
		 wait(5);
		 verifyText("You're in! Registration confirmed...",lblRegistrationText);
		 wait(5);
	//	 verifyText("Welcome NAME!",lblWelcomHiNameText);
		 wait(5);
		 String expectedString=getText(lblTemplateName);
		 verifyText(expectedString,lblTemplateName);
		 wait(5);
		 verifyText("LAUNCH",lblLaunchBtn);
		 verifyText("Keep Learning!",lblKeepLearningText);
		 templateFooterText(lblFooterText);
		 wait(5);
		 click(lblBack);
	 }
	 /* Method: lblInstructorConfirmation();
		 * purpose: check admin lblInstructorConfirmation
		 */
	 public void lblInstructorConfirmation() {
		wait(5);
	    click(lblInstructorConfirmation);
	    wait(6);
		 click(lblPreview);
		 wait(5);
		 verifyText("You're in! Registration confirmed...",lblRegistrationText);
		 wait(5);
	//	 verifyText("Welcome NAME!",lblWelcomHiNameText);
		 wait(5);
		 String expectedString=getText(lblTemplateName);
		 verifyText(expectedString,lblTemplateName);
		 wait(5);
		 templateFooterText(lblFooterText);
		 wait(5);
		 click(lblBack);  
	 }
	 /* Method: lblInstructorEventNotification();
		 * purpose: check admin lblInstructorEventNotification
		 */
	 public void lblInstructorEventNotification() {
		 wait(5);
		 click(lblInstructorEventNotification);
		 wait(6);
		 click(lblPreview);
		 wait(5);
		 verifyText("You're in! Registration confirmed...",lblRegistrationText);
		 wait(5);
	//	 verifyText("Welcome NAME!",lblWelcomHiNameText);
		 wait(5);
		 String expectedString=getText(lblTemplateName);
		 verifyText(expectedString,lblTemplateName);
		 wait(5);
		 templateFooterText(lblFooterText);
		 wait(5);
		 click(lblBack);
	 }
	 /* Method: lblUserRegistrationForInstructor();
		 * purpose: check admin lblUserRegistrationForInstructor
		 */
	 public void lblUserRegistrationForInstructor() {
		 wait(5);
		 click(lblUserRegistrationForInstructor);
		 wait(6);
		 click(lblPreview);
		 wait(5);
		 verifyText("You're in! Registration confirmed...",lblRegistrationText);
		 wait(5);
	//	 verifyText("Welcome NAME!",lblWelcomHiNameText);
		 wait(5);
		 String expectedString=getText(lblTemplateName);
		 verifyText(expectedString,lblTemplateName);
		 wait(5);
		 templateFooterText(lblFooterText);
		 wait(5);
		 click(lblBack);
	 }
	 /* Method: lblRemainderEvent();
		 * purpose: check admin lblRemainderEvent
		 */
	 public void lblRemainderEvent() {
		 wait(5);
		 click(lblRemainderEvent);
		 wait(6);
		 click(lblPreview);
		 wait(5);
		 verifyText("You're in! Registration confirmed...",lblRegistrationText);
		 wait(5);
	//	 verifyText("Welcome NAME!",lblWelcomHiNameText);
		 wait(5);
		 String expectedString=getText(lblTemplateName);
		 verifyText(expectedString,lblTemplateName);
		 wait(5);
		 templateFooterText(lblFooterText);
		 wait(5);
		 click(lblBack);
		 
	 }
	 
}
