package com.origin.fractal.testauto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBasePage;

public class NotificationPage extends FractalBasePage{
	private By lblEmailNotification=By.xpath("//span[@id='step-9']");
	private By lblPasswordChangedTemplate=By.xpath("//span[contains(text(),'Password Changed Template')]");
	private By lblPurchaseMailTemplate=By.xpath("//span[contains(text(),'Purchase Mail Template')]");
	private By lblCourseCompletionTemplate=By.xpath("//span[contains(text(),'Course Completion Template')]");
	private By lblUnAssignTemplate=By.xpath("//span[contains(text(),'Unassign Template')]");
	private By lblUnassignText=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[3]/div[1]/form[1]/div[2]/div[3]/div[1]/span[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/h3[1]");
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
	private By lblCourseCompletionText=By.xpath("//h3[contains(text(),'Course Completion')]");
	private By lblRelaunchBtn=By.xpath("//a[contains(text(),'RELAUNCH')]");
	private By lblforgotPasswordText=By.xpath("//h3[contains(text(),'Looks like you forgot your password!')]");
	private By lblResetYourPasswordBtn=By.xpath("//a[contains(text(),'RESET YOUR PASSWORD')]");
	private By lblHiNameText=By.xpath("//p[contains(text(),'Hi NAME!')]");
	private By lblValidityExpiredText=By.xpath("//h3");
	private By lblExploreBtn=By.xpath("//a[contains(text(),'EXPLORE')]");
	private By lblContentAssignText=By.xpath("//h3[contains(text(),'A new learning journey awaits you!')]");
	private By lblLaunchBtn=By.xpath("//a[contains(text(),'LAUNCH')]");
	private By lblRegistrationText=By.xpath("//h3");
	private By lblWelcomHiNameText=By.xpath("//p[contains(text(),'Welcome NAME!')]");
	public NotificationPage(WebDriver driver) {
			super(driver);
		}
	 public void  gotoEmailNotificationTab() {
		 click(lblEmailNotification);
		 
	 }
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
	 public void verifyCourseCompletionTemplate() {
		wait(5);
		click(lblCourseCompletionTemplate);
		wait(5);
		click(lblPreview);
		verifyText("Course Completion",lblCourseCompletionText);
		wait(5);
		 verifyText("Hi NAME!",lblHiNameText);
		 wait(5);
		String expectedString=getText(lblTemplateName);
		verifyText(expectedString,lblTemplateName);
	    wait(5);
	    verifyText("RELAUNCH",lblRelaunchBtn);
	    verifyText("Keep Learning!",lblKeepLearningText);
		templateFooterText(lblFooterText);
		wait(5);
	    click(lblBack);
	 }
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
}
