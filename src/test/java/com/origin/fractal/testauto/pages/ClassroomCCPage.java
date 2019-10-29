package com.origin.fractal.testauto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBasePage;

public class ClassroomCCPage extends FractalBasePage {
	
	//Created by Vignesh(WVI) on 04-Oct-19 & Updated on 17-Oct-19 
		private By addClassroomBtn = By.xpath("//button[contains(text(),'Add Classroom')]");
		//add classroom
		private By lblCCAllsession = By.xpath("(//label[@id='completion_criteria_checkbox'])[1]");
		private By lblCCAssDuedate = By.xpath("(//label[@id='completion_criteria_checkbox'])[2]");
		private By lblCCQualifyPercentage = By.xpath("(//label[@id='completion_criteria_checkbox'])[3]");
		private By InputCCQualifyPercentage = By.xpath("(//label[@id='completion_criteria_checkbox'])[3]//input[@type='number']");
		private By lblCCFeedbackDuedate = By.xpath("(//label[@id='completion_criteria_checkbox'])[4]");
		private By lblCCManualCompletion = By.xpath("(//label[@id='completion_criteria_checkbox'])[5]");
		private By cancelbtn = By.xpath("//button[@class='btn btn-cancel btn_radius ng-binding text-left']");
		//Edit classrooom
		private By editclassroomicon = By.xpath("//*[@title='Edit']");
		private By editClasslblCCAllsession = By.xpath("(//label[@id='completion_criteria_checkbox'])[1]");
		private By editClasslblCCAssDuedate = By.xpath("(//label[@id='completion_criteria_checkbox'])[2]");
		private By editClasslblCCQualifyPercentage = By.xpath("(//label[@id='completion_criteria_checkbox'])[3]");
		private By editClassInputCCQualifyPercentage =  By.xpath("(//label[@id='completion_criteria_checkbox'])[3]//input[@type='number']");
		private By editClasslblCCFeedbackDuedate = By.xpath("(//label[@id='completion_criteria_checkbox'])[4]");
		private By editClasslblCCManualCompletion = By.xpath("(//label[@id='completion_criteria_checkbox'])[5]");
		private By editClasscancelBtn = By.xpath("//button[contains(@class,'btn btn-cancel btn_radius ng-binding text-left')]");
		private final int WaitSec = 3;
		public boolean booleanresult,booleanresult1,booleanresult2,booleanresult3,booleanresult4,booleanresult5;
		

			public ClassroomCCPage(WebDriver driver) {
				super(driver);
			}
			public void ClickCClblAllsession() 
			{
				print("In Admin side, Classroom is opened");
				click(addClassroomBtn);
				wait(WaitSec);
				click(lblCCAllsession);
				wait(WaitSec);
				click(lblCCAllsession);
				wait(WaitSec);
			}
			public void ClickEditCClblAllsession() 
			{
				print("In Admin side, Edit Classroom is opened");
				click(editclassroomicon);
				wait(WaitSec);
				click(editClasslblCCAllsession);
				wait(WaitSec);
				click(editClasslblCCAllsession);
			}
			public void ClickCClblAssDuedate() 
			{
				click(lblCCAssDuedate);
				wait(WaitSec);
				click(lblCCAssDuedate);
				wait(WaitSec);
			}
			public void ClickEditCClblAssDuedate() 
			{
				click(editClasslblCCAssDuedate);
				wait(WaitSec);
				click(editClasslblCCAssDuedate);
				wait(WaitSec);
			}
			public void ClickCClblQualifyPercentage() 
			{
				click(lblCCQualifyPercentage);
				wait(WaitSec);
				enterData("5",InputCCQualifyPercentage);
				wait(WaitSec);
				clear(InputCCQualifyPercentage);
				click(lblCCQualifyPercentage);
				wait(WaitSec);
			}
			public void ClickEditCClblQualifyPercentage() 
			{
				click(editClasslblCCQualifyPercentage);
				wait(WaitSec);
				enterData("3",editClassInputCCQualifyPercentage);
				wait(WaitSec);
				clear(editClassInputCCQualifyPercentage);
				click(editClasslblCCQualifyPercentage);
				wait(WaitSec);
			}
			public void ClickCClblFeedbackDuedate() 
			{
				click(lblCCFeedbackDuedate);
				wait(WaitSec);
				click(lblCCFeedbackDuedate);
				wait(WaitSec);
			}
			public void ClickEditCClblFeedbackDuedate() 
			{
				click(editClasslblCCFeedbackDuedate);
				wait(WaitSec);
				click(editClasslblCCFeedbackDuedate);
				wait(WaitSec);
			}
			public void ClickCClblManualCompletion() 
			{
				click(lblCCManualCompletion);
				wait(WaitSec);
				click(lblCCManualCompletion);
				wait(WaitSec);
			}
			public void ClickEditCClblManualCompletion() 
			{
				click(editClasslblCCManualCompletion);
				wait(WaitSec);
				click(editClasslblCCManualCompletion);
				wait(WaitSec);
			}
			public void ClickCClblAllSession_Subdate() 
			{
				click(lblCCAllsession);
				wait(WaitSec);
				click(lblCCAssDuedate);
				wait(WaitSec);
				click(lblCCAllsession);
				wait(WaitSec);
				click(lblCCAssDuedate);
				wait(WaitSec);
			}
			public void ClickEditCClblAllSession_Subdate() 
			{

				click(editClasslblCCAllsession);
				wait(WaitSec);
				click(editClasslblCCAssDuedate);
				wait(WaitSec);
				click(editClasslblCCAllsession);
				wait(WaitSec);
				click(editClasslblCCAssDuedate);
				wait(WaitSec);
			}
			public void ClickCClblSubdate_Qualify() 
			{
				click(lblCCAssDuedate);
				wait(WaitSec);
				click(lblCCQualifyPercentage);
				wait(WaitSec);
				enterData("5",InputCCQualifyPercentage);
				wait(WaitSec);
				click(lblCCAssDuedate);
				wait(WaitSec);
				clear(InputCCQualifyPercentage);
				click(lblCCQualifyPercentage);
			}
			public void ClickEditCClblSubdate_Qualify() 
			{
				click(editClasslblCCAssDuedate);
				wait(WaitSec);
				click(editClasslblCCQualifyPercentage);
				wait(WaitSec);
				enterData("35",editClassInputCCQualifyPercentage);
				wait(WaitSec);
				clear(editClassInputCCQualifyPercentage);
				click(editClasslblCCQualifyPercentage);
				wait(WaitSec);
				click(editClasslblCCAssDuedate);
			}
			public void ClickCClblQualify_feedbackdate() 
			{
				click(lblCCQualifyPercentage);
				wait(WaitSec);
				enterData("35",InputCCQualifyPercentage);
				wait(WaitSec);
				click(lblCCFeedbackDuedate);
				wait(WaitSec);
				clear(InputCCQualifyPercentage);
				click(lblCCQualifyPercentage);
				wait(WaitSec);
				click(lblCCFeedbackDuedate);
			}
			public void ClickEditCClblQualify_feedbackdate() 
			{
				click(editClasslblCCQualifyPercentage);
				wait(WaitSec);
				enterData("5",editClassInputCCQualifyPercentage);
				wait(WaitSec);
				click(editClasslblCCFeedbackDuedate);
				click(editClasslblCCQualifyPercentage);
				clear(editClassInputCCQualifyPercentage);
				wait(WaitSec);
				click(editClasslblCCFeedbackDuedate);
			}
			public void ClickCClblfeedbackdate_Manualcomp() 
			{
				click(lblCCFeedbackDuedate);
				wait(WaitSec);
				click(lblCCManualCompletion);
				wait(WaitSec);
				click(lblCCFeedbackDuedate);
				wait(WaitSec);
				click(lblCCManualCompletion);
				wait(WaitSec);
			}
			public void ClickEditCClblfeedbackdate_Manualcomp() 
			{
				click(editClasslblCCFeedbackDuedate);
				wait(WaitSec);
				click(editClasslblCCManualCompletion);
				wait(WaitSec);
				click(editClasslblCCFeedbackDuedate);
				wait(WaitSec);
				click(editClasslblCCManualCompletion);
				wait(WaitSec);
			}
			public void ClickCClblManualcomp_Allsession() 
			{
				click(lblCCManualCompletion);
				wait(WaitSec);
				click(lblCCAllsession);
				wait(WaitSec);
				click(lblCCManualCompletion);
				wait(WaitSec);
				click(lblCCAllsession);
				wait(WaitSec);
				click(cancelbtn);
				wait(WaitSec);
			}
			public void ClickEditCClblManualcomp_Allsession() 
			{
				click(editClasslblCCManualCompletion);
				wait(WaitSec);
				click(editClasslblCCAllsession);
				wait(WaitSec);
				click(editClasslblCCManualCompletion);
				wait(WaitSec);
				click(editClasslblCCAllsession);
				wait(WaitSec);
				click(editClasscancelBtn);
				wait(WaitSec);
			}
			public boolean verifyCCTexts() {
				click(addClassroomBtn);
				wait(WaitSec);
				booleanresult= false;
				boolean  booleanresult1=false, booleanresult2=false, booleanresult3 =false, booleanresult4 =false, booleanresult5 =false;
				if (verifyText("Participation in all sessions",lblCCAllsession ) == true)
				{
					booleanresult1 = true;
				}
				if (verifyText("Submission of all assignments before due date",lblCCAssDuedate )==true)
				{
					booleanresult2 = true;
				}
				if(verifyText("% Qualifying score in graded assignments",lblCCQualifyPercentage ) == true)
				{
					booleanresult3 = true;
				}
				if(verifyText("Submission of session/event feedback before due date",lblCCFeedbackDuedate )== true)
				{
					booleanresult4 = true;
				}
				if(verifyText("Manual completion marking",lblCCManualCompletion )== true) {
					booleanresult5 = true;
				}

				booleanresult= booleanresult1 && booleanresult2 && booleanresult3 && booleanresult4 && booleanresult5;
				System.out.println("Boolean Result : "+booleanresult); // this is boolean result
				click(cancelbtn);
				wait(WaitSec);
				return booleanresult;
			}
			public boolean verifyEditCCTexts() {
				click(editclassroomicon);
				wait(WaitSec);
				booleanresult= false;
				boolean  booleanresult1=false, booleanresult2=false, booleanresult3 =false, booleanresult4 =false, booleanresult5 =false;
				if (verifyText("Participation in all sessions",editClasslblCCAllsession) == true)
				{
					booleanresult1 = true;
				}
				if (verifyText("Submission of all assignments before due date",editClasslblCCAssDuedate)==true)
				{
					booleanresult2 = true;
				}
				if(verifyText("% Qualifying score in graded assignments",editClasslblCCQualifyPercentage) == true)
				{
					booleanresult3 = true;
				}
				if(verifyText("Submission of session/event feedback before due date",editClasslblCCFeedbackDuedate)== true)
				{
					booleanresult4 = true;
				}
				if(verifyText("Manual completion marking",editClasslblCCManualCompletion)== true) {
					booleanresult5 = true;
				}
				booleanresult= booleanresult1 && booleanresult2 && booleanresult3 && booleanresult4 && booleanresult5;
				System.out.println("Boolean Result : "+booleanresult); // this is boolean result
				click(editClasscancelBtn);
				wait(WaitSec);
				return booleanresult;
			}
			public void addClassroomCClblSelection() {	
				ClickCClblAllsession();
				ClickCClblAssDuedate(); 
				ClickCClblQualifyPercentage();
				ClickCClblFeedbackDuedate();
				ClickCClblManualCompletion();
				ClickCClblAllSession_Subdate();
				ClickCClblSubdate_Qualify();
				ClickCClblQualify_feedbackdate();
				ClickEditCClblfeedbackdate_Manualcomp(); 
				ClickCClblManualcomp_Allsession();		
			}
			public void editClassroomCClblSelection() {
				ClickEditCClblAllsession();
				ClickEditCClblAssDuedate(); 
				ClickEditCClblQualifyPercentage();
				ClickEditCClblFeedbackDuedate();
				ClickEditCClblManualCompletion();
				ClickEditCClblAllSession_Subdate();
				ClickEditCClblSubdate_Qualify();
				ClickEditCClblQualify_feedbackdate();
				ClickEditCClblfeedbackdate_Manualcomp(); 
				ClickEditCClblManualcomp_Allsession();
			}
	}
