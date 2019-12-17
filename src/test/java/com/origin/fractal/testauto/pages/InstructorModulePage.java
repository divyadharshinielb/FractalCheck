package com.origin.fractal.testauto.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.origin.fractal.testauto.FractalBasePage;

public class InstructorModulePage extends FractalBasePage {
	private By lblTotalEventsText= By.xpath("//span[contains(text(),'Total Events')]");
	private By lblUpdatesText= By.xpath("//h2[contains(text(),'Updates')]");
	private By lblInvitesRemindersText= By.xpath("//h2[contains(text(),'Invites & Reminders')]");
	private By lblSkillsText= By.xpath("//span[contains(text(),'Skills')]");
	private By lblUpcomingLabel= By.xpath("//p[contains(text(),'upcoming')]");
	private By lblInprogressLabel= By.xpath("//p[contains(text(),'In Progress')]");
	private By lblCompletedLabel= By.xpath("//p[contains(text(),'Completed')]");
	private By btnAccept= By.xpath("//li[@class='slider-slide slide-visible']//button[@class='btn btn-success margin-r-0 margin-tb-5'][contains(text(),'ACCEPT')]");
	private By btnCancel= By.xpath("//li[@class='slider-slide slide-visible']//button[@class='btn btn-warning margin-r-0 margin-tb-5 btn-reject-effect'][contains(text(),'REJECT')]");
	private By btnReschedule= By.xpath("//li[@class='slider-slide slide-visible']//button[contains(text(),'Request to reschedule')]");
	private By lblReschedulePopupText= By.xpath("//h4[contains(text(),'Request to Reschedule')]");
	private By lblRejectPopupText= By.xpath("//p[contains(text(),'Are you sure you want to Reject the Event Invite')]");
	private By lblcloseBtn= By.xpath("//button[@class='styles_closeButton__20ID4']");
	private By lblEventInsideClick= By.xpath("//li[@class='slider-slide slide-visible']//div[@class='row br padding-lr-10 padding-t-10']");
	private By lblPreEvent= By.xpath("//span[contains(text(),'Pre - Event')]");
	private By lblSessions= By.xpath("//span[contains(@class,'bstyle')][contains(text(),'Sessions')]");
	private By lblPostEvent= By.xpath("//span[contains(text(),'Post - Event')]");
	private By lblReference= By.xpath("//span[contains(text(),'References')]");
	private By lblTermsAndConditions= By.xpath("//span[contains(text(),'Terms & Conditions')]");
	private By lblUpcomingEvent= By.xpath("//div[contains(@class,'ins_eve_div')]");
	private By lblInprogressEvent= By.xpath("//div[contains(@class,'ins_eve_div bdr_live')]");//div[contains(@class,'ins_eve_div bdr_postevent')](automation)
	private By lblInprogressSessions= By.xpath("//span[contains(@class,'bstyle')][contains(text(),'Session')]");
	private By lblInprogressPostEvent= By.xpath("//span[contains(text(),'Post-Event')]");
	private By lblInprogressReference= By.xpath("//span[contains(text(),'References')]");
	private By lblInprogressTermsAndConditions= By.xpath("//span[contains(text(),'Terms & Conditions')]");
	private By lblCompeletdEvent= By.xpath("//div[contains(@class,'ins_eve_div')]");
	private By dashBoardIcon= By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[1]/nav[1]/div[1]/div[1]/div[1]/div[1]");
	private By eventTab= By.xpath("//i[contains(text(),';')]");
	private By lblInprogress= By.xpath("//li[@id='react-tabs-0']");
	private By lblUpcoming= By.xpath("//li[@id='react-tabs-2']");
	private By lblCompleted= By.xpath("//li[@id='react-tabs-4']");
	private String SkillSetBox1 ="//select[@name='skillfilter']//option";
    private String SkillSetBox2 ="]";
    private By lblActivitiesText= By.xpath("//li[contains(text(),'Activities & Materials')]");
    private By lblRosterText= By.xpath("//li[contains(text(),'Roster')]");
    private By preEventDetailsBtn= By.xpath("//div[contains(@class,'col-lg-12 col-md-12 col-sm-12 col-xs-12')]//div[2]//dl[1]//div[1]//div[2]//div[1]//div[1]//div[1]//div[3]//p[1]//button[1]");
    private By sessionDetailsBtn= By.xpath("//div[4]//dl[1]//div[1]//div[2]//div[1]//div[1]//div[1]//div[3]//p[1]//button[1]");
    private By invitesReminderViewallBtn= By.xpath("//h2[contains(text(),'Invites & Reminders')]//a[@class='filter-link cursor-pointer font-size-14 text-capitalize margin-r-0'][contains(text(),'View all')]");
    private By breadCrumLink= By.xpath("//button[contains(@class,'btn btn active cp pl-0')]//a[1]");
    private By reviewButton= By.xpath("//body//div[contains(@class,'maindiv insdash container')]//div//div[3]//a[1]//div[1]//div[4]//button[1]");
    private By nextEventViewAll= By.xpath("//h2[@class='nxtevt']//a[@class='filter-link cursor-pointer font-size-14 text-capitalize margin-r-0'][contains(text(),'View all')]");
    private By lblAll= By.xpath(" //button[contains(text(),'ALL')]");
    private By lblReviewCompleted= By.xpath("//button[contains(text(),'REVIEW COMPLETED')]");
    private By lblReviewPending= By.xpath("//button[contains(text(),'REVIEW PENDING')]");
    private By lblDescription= By.xpath("//span[contains(text(),'Description')]");
    public InstructorModulePage(WebDriver driver) {
		super(driver);
		pageName ="InstructorModulePage"; 
	}
	public void verifyDashboardSubHeaders() {
		verifyText("Total Events",lblTotalEventsText );
		verifyText("Updates",lblUpdatesText );
		verifyText("Invites & Reminders", lblInvitesRemindersText);
		verifyText("Skills", lblSkillsText);
	}
	public void verifyEventSectionLabels(){
		verifyText("upcoming",lblUpcomingLabel);
		verifyText("In Progress",lblInprogressLabel);
		verifyText("Completed",lblCompletedLabel);
	}
	public void verifyButtons() {
		verifyText("ACCEPT",btnAccept );
		verifyText("REJECT",btnCancel );
		verifyText("Request To Reschedule",btnReschedule );
	}
	public void verifyPopupButtons() {
		click(btnReschedule);
		wait(2);
		verifyText("Request to Reschedule",lblReschedulePopupText);
		wait(2);
		click(lblcloseBtn);
		wait(2);
		click(btnCancel);
		wait(2);
		verifyText("Are you sure you want to Reject the Event Invite",lblRejectPopupText);
		wait(2);
		click(lblcloseBtn);
	}
	public void verifyNextEventSectionViewAll() {
		wait(2);
		click(nextEventViewAll);
	}
	public void verifyInvitesReminderViewAll() {
		wait(2);
		click(dashBoardIcon);
		wait(2);
		click(invitesReminderViewallBtn);
	}
	public void verifyEventsPageLabels() {
		click(eventTab);
		wait(2);
		verifyText("IN PROGRESS (1)",lblInprogress);
		verifyText("UPCOMING(0)",lblUpcoming);
		verifyText("COMPLETED(1)",lblCompleted);
	}
	public void verifyEventsInvitesClick() {
		wait(2);
		click(dashBoardIcon);
		wait(2);
		click(lblEventInsideClick);
    }
	public void verifyLabelsInsideEventDetailsPage(){
		wait(2);
		verifyText("Pre - Event",lblPreEvent);
		wait(2);
		verifyText("Sessions",lblSessions);
		wait(2);
		verifyText("Post - Event",lblPostEvent);
		wait(2);
		verifyText("References",lblReference);
		wait(2);
		WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Terms & Conditions')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		wait(2);
		verifyText("Terms & Conditions",lblTermsAndConditions);
	
	}
	public void verifyInprogressEvent() {
		WebElement element = driver.findElement(By.xpath("//i[contains(text(),';')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		wait(2);
		click(eventTab);
		wait(2);
		click(lblInprogress);
		wait(2);
		click(lblInprogressEvent);
		verifyText("Pre - Event",lblPreEvent);
		wait(2);
		verifyText("Session",lblInprogressSessions);
		wait(2);
		verifyText("Post-Event",lblInprogressPostEvent);
		wait(2);
		verifyText("References",lblInprogressReference);
		wait(2);
		verifyText("Terms & Conditions",lblInprogressTermsAndConditions);
	}
	public void verifyUpcomingEvent(){
		WebElement element = driver.findElement(By.xpath("//i[contains(text(),';')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		wait(2);
		click(eventTab);
		wait(2);
		click(lblUpcoming);
		wait(2);
		click(lblUpcomingEvent);
		verifyText("Pre - Event",lblPreEvent);
		wait(2);
		verifyText("Session",lblInprogressSessions);
		wait(2);
		verifyText("Post-Event",lblInprogressPostEvent);
		wait(2);
		verifyText("References",lblInprogressReference);
		wait(2);
//		verifyText("Terms & Conditions",lblInprogressTermsAndConditions);
	}
	public void verifyCompletedEvent() {
		WebElement element= driver.findElement(By.xpath("//i[contains(text(),';')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		wait(2);
		click(eventTab);
		wait(2);
		click(lblCompleted);
		wait(2);
		click(lblCompeletdEvent);
		verifyText("Pre - Event",lblPreEvent);
		wait(2);
		verifyText("Session",lblInprogressSessions);
		wait(2);
		verifyText("Post-Event",lblInprogressPostEvent);
		wait(2);
		verifyText("References",lblInprogressReference);
		wait(2);
		verifyText("Terms & Conditions",lblInprogressTermsAndConditions);
	}
	public void verifyActivitiesAndRosterTab(){
		wait(2);
		WebElement element= driver.findElement(By.xpath("//li[contains(text(),'Activities & Materials')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		verifyText("ACTIVITIES & MATERIALS",lblActivitiesText);
		verifyText("ROSTER",lblRosterText);
	}
	public void verifySkillsetList() {
		WebElement element= driver.findElement(By.xpath("//i[contains(text(),';')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		wait(2);
		click(eventTab);
		wait(2);
		click(By.xpath("//select[@name='skillfilter']"));
		wait(2);
		String[] SkillTypes =verifySearchCataloItems(SkillSetBox1,SkillSetBox2);
		for(String a:SkillTypes) {
			System.out.println("---->"+a);
	    }
	
	}
	public void verifyEvalutionDueDateReachingEvent(){
		wait(2);
		click(dashBoardIcon);
		wait(2);
		click(invitesReminderViewallBtn);
		wait(2);
		click(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[1]/div[2]/a[1]/div[1]"));
		wait(2);
		WebElement element= driver.findElement(By.xpath("//div[contains(@class,'col-lg-12 col-md-12 col-sm-12 col-xs-12')]//div[2]//dl[1]//div[1]//div[2]//div[1]//div[1]//div[1]//div[3]//p[1]//button[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		verifyText("VIEW DETAILS",preEventDetailsBtn);
		wait(2);
		click(preEventDetailsBtn);
		wait(2);
		click(breadCrumLink);
		wait(2);
		WebElement element1= driver.findElement(By.xpath("//div[4]//dl[1]//div[1]//div[2]//div[1]//div[1]//div[1]//div[3]//p[1]//button[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		verifyText("VIEW DETAILS",sessionDetailsBtn);
		wait(2);
		click(sessionDetailsBtn);
	}
	public void verifyReviewButton() {
		wait(2);
		click(dashBoardIcon);
		wait(2);
		click(invitesReminderViewallBtn);
		wait(2);
		verifyText("REVIEW",reviewButton);
	}
	public void verifyReviewInsideLabels() {
		wait(2);
		click(dashBoardIcon);
		wait(2);
		click(invitesReminderViewallBtn);
		wait(2);
		click(By.xpath("//div[5]//a[1]//div[1]//div[4]//button[1]//a[1]"));
		wait(2);
		verifyText("ALL",lblAll);
		wait(2);
		verifyText("REVIEW COMPLETED",lblReviewCompleted);
		wait(2);
		verifyText("REVIEW PENDING",lblReviewPending);
		wait(2);
		verifyText("Description",lblDescription);
		
	}
}
	
