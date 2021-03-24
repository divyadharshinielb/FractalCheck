package com.origin.fractal.testauto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBasePage;

public class ClassroomCCPage extends FractalBasePage {

	private By Classroomicon = By.xpath("//div[@class='icon-Classroom-icon icon']");
	private By AddClassbtn = By.xpath("//button[contains(text(),'Add Classroom')]");//html/body/div/div/div[2]/div[3]/div[3]/div/div/div/div[2]/button

	//Add classroom
	private By lblCCAllsession = By.xpath("(//*[@id='completion_criteria_checkbox'])[1]");
	private By lblCCAssDuedate = By.xpath("(//*[@id='completion_criteria_checkbox'])[1]");
	private By lblCCQualifyPrecentage = By.xpath("(//*[@id='completion_criteria_checkbox'])[2]");//html/body/div[3]/div/div/div/md-dialog-content/div/div/form/div/div[4]/div/div[2]/div[4]/label
	private By InputCCQualifyPrecentage = By.xpath("(//*[@id='completion_criteria_checkbox'])[2]//div//input");//Updated pn 7-Dec-20
	private By lblCCFeedbackDuedate = By.xpath("//div[contains(@class,'col-lg-5 col-sm-5 col-xs-5 col-md-5 float-right padding-l-0 padding-t-60')]//div[5]//label[1]");
	private By lblCCManualCompletion= By.xpath("//div[6]//label[1]");
	private By Cancelbtn= By.xpath("//button[@class='btn btn-cancel btn_radius ng-binding text-left']");

	//Add classroom cc text
	private By lblCCAllsessiontxt= By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/md-dialog-content[1]/div[1]/div[1]/form[1]/div[1]/div[4]/div[1]/div[2]/div[2]/label[1]");
	private By lblCCAssDuedatetxt = By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/md-dialog-content[1]/div[1]/div[1]/form[1]/div[1]/div[4]/div[1]/div[2]/div[3]/label[1]");
	private By lblCCQualifyPrecentagetxt = By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/md-dialog-content[1]/div[1]/div[1]/form[1]/div[1]/div[4]/div[1]/div[2]/div[4]/label[1]");
	private By lblCCFeedbackDuedatetxt = By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/md-dialog-content[1]/div[1]/div[1]/form[1]/div[1]/div[4]/div[1]/div[2]/div[5]/label[1]");
	private By lblCCManualCompletiontxt= By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/md-dialog-content[1]/div[1]/div[1]/form[1]/div[1]/div[4]/div[1]/div[2]/div[6]/label[1]");

	//Edit classroom
	private By EditClassroomicon = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[5]/i[2]");
	private By EditclasslblCCAllsession = By.xpath("(//*[@id='completion_criteria_checkbox'])[1]");
	private By EditclasslblCCAssDuedate = By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/md-dialog-content[1]/div[1]/div[1]/form[1]/div[1]/div[4]/div[1]/div[2]/div[3]/label[1]");
	private By EditclasslblCCQualifyPrecentage = By.xpath("(//*[@id='completion_criteria_checkbox'])[2]");
	private By EditclassInputCCQualifyPrecentage = By.xpath("(//*[@id='completion_criteria_checkbox'])[2]//div//input");//Updated pn 7-Dec-20
	private By EditclasslblCCFeedbackDuedate = By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/md-dialog-content[1]/div[1]/div[1]/form[1]/div[1]/div[4]/div[1]/div[2]/div[5]/label[1]");
	private By EditclasslblCCManualCompletion= By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/md-dialog-content[1]/div[1]/div[1]/form[1]/div[1]/div[4]/div[1]/div[2]/div[6]/label[1]");
	private By EditclassCancelbtn= By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/md-dialog-content[1]/div[1]/div[1]/form[1]/div[1]/div[5]/div[2]/span[1]/div[1]/button[1]");


	private By HeaderAClogo= By.xpath("//span[contains(@class,'loggeduserbg ng-binding')]");
	private By logout= By.xpath("//html/body/div/div/div/ng-include/div/div/div[2]/div/div/ul/div/div[3]");
	public boolean booleanresult;

	public ClassroomCCPage(WebDriver driver) 
	{
		super(driver);
		pageName ="ClassroomPage"; 
	}

	public void GotoClassroom() 
	{
		wait(25);//Updated on 7-Dec-20
		click(Classroomicon);
		wait(15);
		print("In Admin side, Classroom is opened");
	}

	public void GotoEditClassroom() 
	{
		wait(10);
		click(EditClassroomicon);
		wait(10);
		print("In Admin side, Edit Classroom is opened");
	}

	public void ClickCClblAllsession() 
	{
		click(AddClassbtn);
		wait(5);
		click(lblCCAllsession);
		wait(3);
		click(Cancelbtn);
		wait(5);
		
	}

	public void ClickEditCClblAllsession() 
	{
		click(EditclasslblCCAllsession);
		wait(5);
		click(EditclassCancelbtn);
		wait(5);
		
	}


	public void ClickCClblAssDuedate() 
	{
//		click(AddClassbtn);
		wait(5);
		click(lblCCAssDuedate);
		wait(3);
		click(Cancelbtn);
		wait(5);
	
	}

	public void ClickEditCClblAssDuedate() 
	{
		wait(5);
		click(EditclasslblCCAssDuedate);
		wait(3);
		click(EditclassCancelbtn);
		wait(5);
		
	}


	public void ClickCClblQualifyPrecentage() 
	{
		click(AddClassbtn);
		wait(6);
		print("clicked");
		click(lblCCQualifyPrecentage);
		wait(3);
		enterData("35",InputCCQualifyPrecentage);
		wait(5);
		click(Cancelbtn);
		wait(5);
		
	}

	public void ClickEditCClblQualifyPrecentage() 
	{
		wait(3);
		click(EditclasslblCCQualifyPrecentage);
		wait(3);
//		click(lblCCQualifyPrecentage);
//		wait(3);
//		clear(EditclassInputCCQualifyPrecentage);//Updated on 7-Dec-20
		enterData("35",EditclassInputCCQualifyPrecentage);
		wait(3);
		click(EditclassCancelbtn);
		wait(5);
	
	}

	public void ClickCClblFeedbackDuedate() 
	{
		click(AddClassbtn);
		wait(5);
		click(lblCCFeedbackDuedate);
		wait(3);
		click(Cancelbtn);
		wait(5);
		
	}
	public void ClickEditCClblFeedbackDuedate() 
	{
		wait(5);
		click(EditclasslblCCFeedbackDuedate);
		wait(3);
		click(EditclassCancelbtn);
		wait(5);
	
	}

	public void ClickCClblManualCompletion() 
	{
		click(AddClassbtn);
		wait(5);
		click(lblCCManualCompletion);
		wait(3);
		click(Cancelbtn);
		wait(5);
		
	}
	public void ClickEditCClblManualCompletion() 
	{
		wait(5);
		click(EditclasslblCCManualCompletion);
		wait(3);
		click(EditclassCancelbtn);
		wait(5);
	}

	public void ClickCClblAllSession_Subdate() 
	{
		click(AddClassbtn);
		wait(5);
//		click(lblCCAllsession);
		wait(5);
		click(lblCCAssDuedate);
		wait(3);
		click(Cancelbtn);
		wait(5);
		
	}

	public void ClickEditCClblAllSession_Subdate() 
	{
//		click(EditclasslblCCAllsession);
		wait(5);
		click(EditclasslblCCAssDuedate);
		wait(3);
		click(EditclassCancelbtn);
		wait(5);
		
	}

	public void ClickCClblSubdate_Qualify() 
	{   
	    wait(2);
		click(AddClassbtn);
		wait(5);
		click(lblCCAssDuedate);
		wait(3);
		click(lblCCQualifyPrecentage);
		wait(3);
		enterData("35",EditclassInputCCQualifyPrecentage);
		wait(3);
		click(Cancelbtn);
		wait(5);
		
	}

	public void ClickEditCClblSubdate_Qualify() 
	{
	    wait(2);
		click(EditclasslblCCAssDuedate);
		wait(5);
	//	click(EditclasslblCCQualifyPrecentage);
		click(lblCCQualifyPrecentage);
		wait(3);
		enterData("35",InputCCQualifyPrecentage);
		wait(3);
		click(EditclassCancelbtn);
		wait(5);
		
	}


	public void ClickCClblQualify_feedbackdate() 
	{   
	    wait(2);
		click(AddClassbtn);
		wait(5);
		click(lblCCQualifyPrecentage);
		wait(3);
		enterData("35",InputCCQualifyPrecentage);
		wait(3);
		click(lblCCFeedbackDuedate);
		wait(3);
		click(Cancelbtn);
		wait(5);
		
	}

	public void ClickEditCClblQualify_feedbackdate() 
	{   
	    wait(5);
		click(EditclasslblCCQualifyPrecentage);
		wait(3);
	//    click(lblCCQualifyPrecentage);
//		wait(5);
		enterData("35",InputCCQualifyPrecentage);
		wait(3);
		click(EditclasslblCCFeedbackDuedate);
		wait(3);
		click(Cancelbtn);
		wait(5);
		
	}

	public void ClickCClblfeedbackdate_Manualcomp() 
	{   
	    wait(5);
		click(AddClassbtn);
		wait(3);
		click(lblCCFeedbackDuedate);
		wait(3);
		click(lblCCManualCompletion);
		wait(3);
		click(Cancelbtn);
		wait(5);
		
	}

	public void ClickEditCClblfeedbackdate_Manualcomp() 
	{   
	    wait(2);
		click(EditclasslblCCFeedbackDuedate);
		wait(3);
		click(EditclasslblCCManualCompletion);
		wait(3);
		click(EditclassCancelbtn);
		wait(5);
		
	}

	public void ClickCClblManualcomp_Allsession() 
	{   
	    wait(2);
		click(AddClassbtn);
		wait(5);
		click(lblCCManualCompletion);
		wait(3);
//		click(lblCCAllsession);
//		wait(5);
		click(Cancelbtn);
		wait(5);
		
	}

	public void ClickEditCClblManualcomp_Allsession() 
	{   
	    wait(2);
		click(EditclasslblCCManualCompletion);
		wait(3);
//		click(EditclasslblCCAllsession);
//		wait(5);
		click(EditclassCancelbtn);
		wait(5);
		
	}

	public boolean verifyCCTexts() {
		click(AddClassbtn);
		wait(5);
		boolean  boleanresult1=false, boleanresult2=false, boleanresult3 =false, boleanresult4 =false, boleanresult5 =false;
/*		if (verifyText("Participation in all sessions",lblCCAllsessiontxt) == true)
		{
			boleanresult1 = true;
		}
*/		if (verifyText("Submission of all assignments before due date",lblCCAssDuedatetxt)==true)
		{
			boleanresult2 = true;
		}
		if(verifyText("% Qualifying score in graded assignments",lblCCQualifyPrecentagetxt) == true)
		{
			boleanresult3 = true;
		}
		if(verifyText("Submission of session/event feedback before due date",lblCCFeedbackDuedatetxt)== true)
		{
			boleanresult4 = true;
		}
		if(verifyText("Manual completion marking",lblCCManualCompletiontxt)== true) {
			boleanresult5 = true;
		}

		booleanresult= boleanresult1 && boleanresult2 && boleanresult3 && boleanresult4 && boleanresult5;
		System.out.println("Boolean Result : "+booleanresult); // this is boolean result
		click(Cancelbtn);
		wait(5);
		return booleanresult;
	}

	public boolean verifyEditCCTexts() {
		
		booleanresult= false;
		boolean  boleanresult1=false, boleanresult2=false, boleanresult3 =false, boleanresult4 =false, boleanresult5 =false;
/*		if (verifyText("Participation in all sessions",EditclasslblCCAllsession) == true)
		{
			boleanresult1 = true;
		}
*/		if (verifyText("Submission of all assignments before due date",EditclasslblCCAssDuedate)==true)
		{
			boleanresult2 = true;
		}
		if(verifyText("% Qualifying score in graded assignments",EditclasslblCCQualifyPrecentage) == true)
		{
			boleanresult3 = true;
		}
		if(verifyText("Submission of session/event feedback before due date",EditclasslblCCFeedbackDuedate)== true)
		{
			boleanresult4 = true;
		}
		if(verifyText("Manual completion marking",EditclasslblCCManualCompletion)== true) {
			boleanresult5 = true;
		}

		booleanresult= boleanresult1 && boleanresult2 && boleanresult3 && boleanresult4 && boleanresult5;
		System.out.println("Boolean Result : "+booleanresult); // this is boolean result
		click(EditclassCancelbtn);
		wait(5);
		return booleanresult;
	}



	public boolean verifyCCsessionLabels() {
		wait(5);
		click(AddClassbtn);
		wait(5);
		booleanresult = false;
		if (verifyText("Participation in all sessions",lblCCAllsessiontxt) == true)
		{
			booleanresult = true;
		}
		click(Cancelbtn);
		wait(5);
		return booleanresult;
	}
	
	public boolean verifyEditCCsessionLabels() {
		booleanresult = false;
/*		if (verifyText("Participation in all sessions",EditclasslblCCAllsession) == true)
		{
			booleanresult = true;
		}
*/		click(EditclassCancelbtn);
		wait(5);
		return booleanresult;
	}

	public boolean verifyCCAssDuedateLabels() {
		wait(5);
		click(AddClassbtn);
		wait(5);
		booleanresult = false;
		if (verifyText("Submission of all assignments before due date",lblCCAssDuedatetxt) == true)
		{
			booleanresult = true;
		}
		click(Cancelbtn);
		wait(5);
		return booleanresult;
	}
	
	public boolean verifyEditCCAssDuedateLabels() {
		wait(2);
		booleanresult = false;
		if (verifyText("Submission of all assignments before due date",EditclasslblCCAssDuedate) == true)
		{
			booleanresult = true;
		}
		click(EditclassCancelbtn);
		wait(5);
		return booleanresult;
	}
	
	public boolean verifyCCQualifyPrecentageLabels() {
		wait(2);
		click(AddClassbtn);
		wait(5);
		booleanresult = false;
		if (verifyText("% Obtaining qualifying scores in all graded assignments",lblCCQualifyPrecentagetxt) == true)
		{
			booleanresult = true;
		}
		click(Cancelbtn);
		wait(5);
		return booleanresult;
	}
	
	public boolean verifyEditCCQualifyPrecentageLabels() {
		wait(2);
		booleanresult = false;
		if (verifyText("% Obtaining qualifying scores in all graded assignments",EditclasslblCCQualifyPrecentage) == true)
		{
			booleanresult = true;
		}
		click(EditclassCancelbtn);
		wait(5);
		return booleanresult;
	}
	
	public boolean verifyCCFeedbackDuedateLabels() {
		wait(5);
		click(AddClassbtn);
		wait(5);
		booleanresult = false;
		if (verifyText("Submission of session/event feedback before due date",lblCCFeedbackDuedatetxt) == true)
		{
			booleanresult = true;
		}
		click(Cancelbtn);
		wait(5);
		return booleanresult;
	}
	
	public boolean verifyEditCCFeedbackDuedateLabels() {
		wait(2);
		booleanresult = false;
		if (verifyText("Submission of session/event feedback before due date",EditclasslblCCFeedbackDuedate) == true)
		{
			booleanresult = true;
		}
		click(EditclassCancelbtn);
		wait(5);
		return booleanresult;
	}
	
	public boolean verifyCCManualCompletionLabels() {
		wait(2);
		click(AddClassbtn);
		wait(5);
		booleanresult = false;
		if (verifyText("Manual completion marking",lblCCManualCompletiontxt) == true)
		{
			booleanresult = true;
		}
		click(Cancelbtn);
		wait(5);
		return booleanresult;
	}
	
	public boolean verifyEditCCManualCompletionLabels() {
		wait(2);
		booleanresult = false;
		if (verifyText("Manual completion marking",EditclasslblCCManualCompletion) == true)
		{
			booleanresult = true;
		}
		click(EditclassCancelbtn);
		wait(5);
		return booleanresult;
	}

	// Qualifying score allows single digit
	public void ClickCClblQualifySinglePrecentage() 
	{
		click(AddClassbtn);
		wait(8);
		click(lblCCQualifyPrecentage); //Updated on 3-Dec-20
		wait(2);
		enterData("5",InputCCQualifyPrecentage);
		wait(2);
		click(Cancelbtn);
		wait(5);
		click(AddClassbtn);
		wait(5);
		click(lblCCQualifyPrecentage);
		wait(3);
		enterData("5",InputCCQualifyPrecentage);
		wait(3);
		click(lblCCQualifyPrecentage);
		wait(3);
		click(Cancelbtn);
		wait(5);
	}
	
	// Qualifying score allows single digit
	public void EditCClblQualifySinglePrecentage() 
	{
		
		click(EditclasslblCCQualifyPrecentage);
//			wait(5);
		//dd	click(lblCCQualifyPrecentage);
			wait(5);
//			click(lblCCQualifyPrecentage);
			wait(2);
			enterData("5",EditclassInputCCQualifyPrecentage);
			wait(3);
			click(EditclassCancelbtn);
			wait(5);
			click(EditClassroomicon);
			wait(5);
			click(EditclasslblCCQualifyPrecentage);
			wait(3);
		//dd	click(lblCCQualifyPrecentage);
//			wait(2);
			enterData("5",EditclassInputCCQualifyPrecentage);
			wait(3);
			click(EditclasslblCCQualifyPrecentage);
			wait(3);
			click(EditclassCancelbtn);
			wait(5);
		
	}

	public void Clicklogout() 
	{
		click(HeaderAClogo);
		wait(3);
		click(logout);
		wait(5);
	}
}
