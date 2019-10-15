package com.origin.fractal.testauto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBasePage;

public class ClassroomCCPage extends FractalBasePage {
	
	private By addClassroomBtn = By.xpath("//button[contains(text(),'Add Classroom')]");
	//Added by Vignesh (WVI) on 04-Oct-19 & Updated on 14-Oct-19 
	
		//classroom
		private By classroomicon = By.xpath("//div[@class='icon-Classroom-icon icon']");
		//add classroom
		private By lblCCAllsession = By.xpath("//*[contains(@class, 'col-sm-5')]/div[2]//label[1]");
		private By lblCCAssDuedate = By.xpath("//*[contains(@class, 'col-sm-5')]//div[3]//label[1]");
		private By lblCCQualifyPrecentage = By.xpath("//*[contains(@class, 'col-sm-5')]//div[4]//label[1]");
		private By InputCCQualifyPrecentage = By.xpath("//*[contains(@class, 'col-sm-5')]//div[4]//input[@type='number']");
		private By lblCCFeedbackDuedate = By.xpath("//*[contains(@class, 'col-sm-5')]//div[5]//label[1]");
		private By lblCCManualCompletion = By.xpath("//*[contains(@class, 'col-sm-5')]//div[6]//label[1]");
		private By cancelbtn = By.xpath("//button[@class='btn btn-cancel btn_radius ng-binding text-left']");
		//Edit classrooom
		private By editclassroomicon = By.xpath("//*[@title='Edit']");
		private By editClasslblCCAllsession = By.xpath("//div[contains(@class,'col-sm-5')]//div[2]//label[1]");
		private By editClasslblCCAssDuedate = By.xpath("//div[contains(@class,'col-sm-5')]//div[3]//label[1]");
		private By editClasslblCCQualifyPrecentage = By.xpath("//div[contains(@class,'col-sm-5')]//div[4]//label[1]");
		private By editClassInputCCQualifyPrecentage =  By.xpath("//div[contains(@class,'col-sm-5')]//div[4]//input[@type='number']");
		private By editClasslblCCFeedbackDuedate = By.xpath("//div[contains(@class,'col-sm-5')]//div[5]//label[1]");
		private By editClasslblCCManualCompletion = By.xpath("//div[contains(@class,'col-sm-5')]//div[6]//label[1]");
		private By editClasscancelBtn = By.xpath("//button[contains(@class,'btn btn-cancel btn_radius ng-binding text-left')]");
		// my account & logout
		private By headerAClogo= By.xpath("//span[@class='loggeduserbg ng-binding']");
		private By logout= By.xpath("//ul[contains(@class,'dropdown-menu menu-myaccount')]//div[3]");
		private final int WaitSec = 3;
		public boolean booleanresult,booleanresult1,booleanresult2,booleanresult3,booleanresult4,booleanresult5;
		
		// End- here************************** Vignesh (WVI) on 14-Oct-19 ********************************

		public ClassroomCCPage(WebDriver driver) {
			super(driver);
		}
		//Added by Vignesh (WVI) on 04-Oct-19 & Updated on 14-Oct-19 

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


		public void ClickCClblQualifyPrecentage() 
		{
			click(lblCCQualifyPrecentage);
			wait(WaitSec);
			enterData("5",InputCCQualifyPrecentage);
			wait(WaitSec);
			clear(InputCCQualifyPrecentage);
			click(lblCCQualifyPrecentage);
			wait(WaitSec);
		}

		public void ClickEditCClblQualifyPrecentage() 
		{
			click(editClasslblCCQualifyPrecentage);
			wait(WaitSec);
			enterData("3",editClassInputCCQualifyPrecentage);
			wait(WaitSec);
			clear(editClassInputCCQualifyPrecentage);
			click(editClasslblCCQualifyPrecentage);
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
			click(lblCCQualifyPrecentage);
			wait(WaitSec);
			enterData("5",InputCCQualifyPrecentage);
			wait(WaitSec);
			click(lblCCAssDuedate);
			wait(WaitSec);
			clear(InputCCQualifyPrecentage);
			click(lblCCQualifyPrecentage);
		}

		public void ClickEditCClblSubdate_Qualify() 
		{
			click(editClasslblCCAssDuedate);
			wait(WaitSec);
			click(editClasslblCCQualifyPrecentage);
			wait(WaitSec);
			enterData("35",editClassInputCCQualifyPrecentage);
			wait(WaitSec);
			clear(editClassInputCCQualifyPrecentage);
			click(editClasslblCCQualifyPrecentage);
			wait(WaitSec);
			click(editClasslblCCAssDuedate);
		}


		public void ClickCClblQualify_feedbackdate() 
		{
			click(lblCCQualifyPrecentage);
			wait(WaitSec);
			enterData("35",InputCCQualifyPrecentage);
			wait(WaitSec);
			click(lblCCFeedbackDuedate);
			wait(WaitSec);
			clear(InputCCQualifyPrecentage);
			click(lblCCQualifyPrecentage);
			wait(WaitSec);
			click(lblCCFeedbackDuedate);

		}

		public void ClickEditCClblQualify_feedbackdate() 
		{

			click(editClasslblCCQualifyPrecentage);
			wait(WaitSec);
			enterData("5",editClassInputCCQualifyPrecentage);
			wait(WaitSec);
			click(editClasslblCCFeedbackDuedate);
			click(editClasslblCCQualifyPrecentage);
			clear(editClassInputCCQualifyPrecentage);
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
			if (verifyText("Participation in all sessions",lblCCAllsession ) == true)
			{
				booleanresult1 = true;
			}
			if (verifyText("Submission of all assignments before due date",lblCCAssDuedate )==true)
			{
				booleanresult2 = true;
			}
			if(verifyText("% Qualifying score in graded assignments",lblCCQualifyPrecentage ) == true)
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
			if(verifyText("% Qualifying score in graded assignments",editClasslblCCQualifyPrecentage) == true)
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
		public boolean verifyCCsessionLabels() {
			click(addClassroomBtn);
			wait(WaitSec);
			booleanresult1 = false;
			if (verifyText("Participation in all sessions",lblCCAllsession ) == true)
			{
				booleanresult1 = true;
			}
			return booleanresult1;
		}

		public boolean verifyEditCCsessionLabels() {
			click(editclassroomicon);
			wait(WaitSec);
			booleanresult1 = false;
			if (verifyText("Participation in all sessions",editClasslblCCAllsession) == true)
			{
				booleanresult1 = true;
			}
			return booleanresult1;
		}

		public boolean verifyCCAssDuedateLabels() {
			booleanresult2 = false;
			if (verifyText("Submission of all assignments before due date",lblCCAssDuedate ) == true)
			{
				booleanresult2 = true;
			}
			return booleanresult2;
		}

		public boolean verifyEditCCAssDuedateLabels() {
			booleanresult2= false;
			if (verifyText("Submission of all assignments before due date",editClasslblCCAssDuedate) == true)
			{
				booleanresult2 = true;
			}
			return booleanresult2;
		}

		public boolean verifyCCQualifyPrecentageLabels() {
			booleanresult3 = false;
			if (verifyText("% Qualifying score in graded assignments",lblCCQualifyPrecentage ) == true)
			{
				booleanresult3 = true;
			}
			return booleanresult3;
		}

		public boolean verifyEditCCQualifyPrecentageLabels() {
			booleanresult3 = false;
			if (verifyText("% Qualifying score in graded assignments",editClasslblCCQualifyPrecentage) == true)
			{
				booleanresult3 = true;
			}

			return booleanresult3;
		}

		public boolean verifyCCFeedbackDuedateLabels() {
			booleanresult4 = false;
			if (verifyText("Submission of session/event feedback before due date",lblCCFeedbackDuedate ) == true)
			{
				booleanresult4 = true;
			}
			return booleanresult4;
		}

		public boolean verifyEditCCFeedbackDuedateLabels() {
			booleanresult4 = false;
			if (verifyText("Submission of session/event feedback before due date",editClasslblCCFeedbackDuedate) == true)
			{
				booleanresult4 = true;
			}
			return booleanresult4;
		}

		public boolean verifyCCManualCompletionLabels() {

			booleanresult5 = false;
			if (verifyText("Manual completion marking",lblCCManualCompletion ) == true)
			{
				booleanresult5 = true;
			}

			return booleanresult5;
		}

		public boolean verifyEditCCManualCompletionLabels() {
			booleanresult5 = false;
			if (verifyText("Manual completion marking",editClasslblCCManualCompletion) == true)
			{
				booleanresult5 = true;
			}
			return booleanresult5;
		}


		public void Clicklogout() 
		{
			click(headerAClogo);
			wait(WaitSec);
			click(logout);
			wait(WaitSec);
		}
		// End- here************************** Vignesh (WVI) on 14-Oct-19 ********************************
	}
