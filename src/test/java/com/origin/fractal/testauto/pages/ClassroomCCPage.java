package com.origin.fractal.testauto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBasePage;

public class ClassroomCCPage extends FractalBasePage {

	private By Classroomicon = By.xpath("//div[@class='icon-Classroom-icon icon']");
	private By AddClassbtn = By.xpath("//button[contains(text(),'Add Classroom')]");//html/body/div/div/div[2]/div[3]/div[3]/div/div/div/div[2]/button

	//Add classroom
	private By lblCCAllsession = By.xpath("//div[@class='col-lg-5 col-sm-5 col-xs-5 col-md-5 float-right padding-l-0 padding-t-60']//div[2]//label[1]");
	private By lblCCAssDuedate = By.xpath("//*[contains(@class, 'col-sm-5')]/div[3]/label");
	private By lblCCQualifyPrecentage = By.xpath("//div[contains(@class,'col-lg-5 col-sm-5 col-xs-5 col-md-5 float-right padding-l-0 padding-t-60')]//div[4]//label[1]");
	private By InputCCQualifyPrecentage = By.xpath("//div[contains(@class,'col-lg-5 col-sm-5 col-xs-5 col-md-5 float-right padding-l-0 padding-t-60')]//div[4]//label[1]/div/div/md-input-container/input");
	private By lblCCFeedbackDuedate = By.xpath("//div[contains(@class,'col-lg-5 col-sm-5 col-xs-5 col-md-5 float-right padding-l-0 padding-t-60')]//div[5]//label[1]");
	private By lblCCManualCompletion= By.xpath("//div[6]//label[1]");
	private By Cancelbtn= By.xpath("//i[contains(@class,'text-right font-size-35 padding-r-30 padding-t-10')]");

	//Add classroom cc text
	private By lblCCAllsessiontxt= By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/md-dialog-content[1]/div[1]/div[1]/form[1]/div[1]/div[4]/div[1]/div[2]/div[2]/label[1]");
	private By lblCCAssDuedatetxt = By.xpath("//div[contains(@class,'col-lg-5 col-sm-5 col-xs-5 col-md-5 float-right padding-l-0 padding-t-60')]//div[3]//label[1]");
	private By lblCCQualifyPrecentagetxt = By.xpath("//div[contains(@class,'col-lg-5 col-sm-5 col-xs-5 col-md-5 float-right padding-l-0 padding-t-60')]//div[4]//label[1]");
	private By lblCCFeedbackDuedatetxt = By.xpath("//div[contains(@class,'col-lg-5 col-sm-5 col-xs-5 col-md-5 float-right padding-l-0 padding-t-60')]//div[5]//label[1]");
	private By lblCCManualCompletiontxt= By.xpath("//div[contains(@class,'col-lg-5 col-sm-5 col-xs-5 col-md-5 float-right padding-l-0 padding-t-60')]//div[6]//label[1]");

	//Edit classroom
	private By EditClassroomicon = By.xpath("//div[@class='col-lg-12 col-md-12 col-sm-12 col-xs-12 padding-all-0 ng-scope']//div[1]//div[1]//div[1]//div[5]//i[2]");
	private By EditclasslblCCAllsession = By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/md-dialog-content[1]/div[1]/div[1]/form[1]/div[1]/div[4]/div[1]/div[2]/div[2]/label[1]");
	private By EditclasslblCCAssDuedate = By.xpath("//div[contains(@class,'col-lg-5 col-sm-5 col-xs-5 col-md-5 float-right padding-l-0 padding-t-60')]//div[3]//label[1]");
	private By EditclasslblCCQualifyPrecentage = By.xpath("//div[contains(@class,'col-lg-5 col-sm-5 col-xs-5 col-md-5 float-right padding-l-0 padding-t-60')]//div[4]//label[1]");
	private By EditclassInputCCQualifyPrecentage = By.xpath("//div[contains(@class,'col-lg-5 col-sm-5 col-xs-5 col-md-5 float-right padding-l-0 padding-t-60')]//div[4]//label[1]/div/div/md-input-container/input");
	private By EditclasslblCCFeedbackDuedate = By.xpath("//div[contains(@class,'col-lg-5 col-sm-5 col-xs-5 col-md-5 float-right padding-l-0 padding-t-60')]//div[5]//label[1]");
	private By EditclasslblCCManualCompletion= By.xpath("//div[contains(@class,'col-lg-5 col-sm-5 col-xs-5 col-md-5 float-right padding-l-0 padding-t-60')]//div[6]//label[1]");
	private By EditclassCancelbtn= By.xpath("//i[contains(@class,'text-right font-size-35 padding-r-30 padding-t-10')]");


	private By HeaderAClogo= By.xpath("//span[contains(@class,'loggeduserbg ng-binding')]");
	private By logout= By.xpath("//a[contains(text(),'Logout')]");
	public boolean booleanresult;

	public ClassroomCCPage(WebDriver driver) 
	{
		super(driver);
		pageName ="ClassroomPage"; 
	}

	public void GotoClassroom() 
	{
		click(Classroomicon);
		wait(5);
		print("In Admin side, Classroom is opened");
	}

	public void GotoEditClassroom() 
	{
		wait(5);
		click(EditClassroomicon);
		wait(5);
		print("In Admin side, Edit Classroom is opened");
	}

	public void ClickCClblAllsession() 
	{
		click(AddClassbtn);
		wait(5);
		click(lblCCAllsession);
		wait(5);
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
		wait(5);
		click(Cancelbtn);
		wait(5);
	
	}

	public void ClickEditCClblAssDuedate() 
	{
		click(EditclasslblCCAssDuedate);
		wait(5);
		click(EditclassCancelbtn);
		wait(5);
		
	}


	public void ClickCClblQualifyPrecentage() 
	{
		click(AddClassbtn);
		wait(5);
		click(lblCCQualifyPrecentage);
		wait(5);
		enterData("35",InputCCQualifyPrecentage);
		wait(5);
		click(Cancelbtn);
		wait(5);
		
	}

	public void ClickEditCClblQualifyPrecentage() 
	{
		click(EditclasslblCCQualifyPrecentage);
		wait(5);
		click(lblCCQualifyPrecentage);
		wait(5);
	/*	clear(EditclassInputCCQualifyPrecentage);
		enterData("35",EditclassInputCCQualifyPrecentage);
		wait(5);
		click(EditclassCancelbtn);
		wait(5);
	
	*/}

	public void ClickCClblFeedbackDuedate() 
	{
		click(AddClassbtn);
		wait(5);
		click(lblCCFeedbackDuedate);
		wait(5);
		click(Cancelbtn);
		wait(5);
		
	}
	public void ClickEditCClblFeedbackDuedate() 
	{
		click(EditclasslblCCFeedbackDuedate);
		wait(5);
		click(EditclassCancelbtn);
		wait(5);
	
	}

	public void ClickCClblManualCompletion() 
	{
		click(AddClassbtn);
		wait(5);
		click(lblCCManualCompletion);
		wait(5);
		click(Cancelbtn);
		wait(5);
		
	}
	public void ClickEditCClblManualCompletion() 
	{
		click(EditclasslblCCManualCompletion);
		wait(5);
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
		wait(5);
		click(Cancelbtn);
		wait(5);
		
	}

	public void ClickEditCClblAllSession_Subdate() 
	{
//		click(EditclasslblCCAllsession);
		wait(5);
		click(EditclasslblCCAssDuedate);
		wait(5);
		click(EditclassCancelbtn);
		wait(5);
		
	}

	public void ClickCClblSubdate_Qualify() 
	{
		click(AddClassbtn);
		wait(5);
		click(lblCCAssDuedate);
		wait(5);
		click(lblCCQualifyPrecentage);
		wait(5);
		enterData("35",EditclassInputCCQualifyPrecentage);
		wait(5);
		click(Cancelbtn);
		wait(5);
		
	}

	public void ClickEditCClblSubdate_Qualify() 
	{
		click(EditclasslblCCAssDuedate);
		wait(5);
		click(lblCCQualifyPrecentage);
		wait(2);
		click(lblCCQualifyPrecentage);
		wait(2);
		enterData("35",EditclassInputCCQualifyPrecentage);
		wait(5);
		click(EditclassCancelbtn);
		wait(5);
		
	}


	public void ClickCClblQualify_feedbackdate() 
	{
		click(AddClassbtn);
		wait(5);
		click(lblCCQualifyPrecentage);
		wait(5);
		enterData("35",InputCCQualifyPrecentage);
		wait(5);
		click(lblCCFeedbackDuedate);
		wait(5);
		click(Cancelbtn);
		wait(5);
		
	}

	public void ClickEditCClblQualify_feedbackdate() 
	{
		click(EditclasslblCCQualifyPrecentage);
		wait(5);
		click(lblCCQualifyPrecentage);
		wait(2);
		enterData("35",InputCCQualifyPrecentage);
		wait(5);
		click(EditclasslblCCFeedbackDuedate);
		wait(5);
		click(Cancelbtn);
		wait(5);
		
	}

	public void ClickCClblfeedbackdate_Manualcomp() 
	{
		click(AddClassbtn);
		wait(5);
		click(lblCCFeedbackDuedate);
		wait(5);
		click(lblCCManualCompletion);
		wait(5);
		click(Cancelbtn);
		wait(5);
		
	}

	public void ClickEditCClblfeedbackdate_Manualcomp() 
	{
		click(EditclasslblCCFeedbackDuedate);
		wait(5);
		click(EditclasslblCCManualCompletion);
		wait(5);
		click(EditclassCancelbtn);
		wait(5);
		
	}

	public void ClickCClblManualcomp_Allsession() 
	{
		click(AddClassbtn);
		wait(5);
		click(lblCCManualCompletion);
		wait(5);
//		click(lblCCAllsession);
		wait(5);
		click(Cancelbtn);
		wait(5);
		
	}

	public void ClickEditCClblManualcomp_Allsession() 
	{
		click(EditclasslblCCManualCompletion);
		wait(5);
	//	click(EditclasslblCCAllsession);
		wait(5);
		click(EditclassCancelbtn);
		wait(5);
		
	}

	public boolean verifyCCTexts() {
		click(AddClassbtn); /**added by mahesh 20-12-19**/
		wait(5);
		boolean  boleanresult2=false, boleanresult3 =false, boleanresult4 =false, boleanresult5 =false;
/*		if (verifyText("Participation in all sessions",lblCCAllsessiontxt) == false)
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

		booleanresult= boleanresult2 && boleanresult3 && boleanresult4 && boleanresult5;
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
		wait(5);
		click(AddClassbtn);
		wait(5);
		booleanresult = false;
		if (verifyText("% Qualifying score in graded assignments",lblCCQualifyPrecentagetxt) == true)
		{
			booleanresult = true;
		}
		click(Cancelbtn);
		wait(5);
		return booleanresult;
	}
	
	public boolean verifyEditCCQualifyPrecentageLabels() {
		
		booleanresult = false;
		if (verifyText("% qualifying score in graded assignments",EditclasslblCCQualifyPrecentage) == true)
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
		booleanresult = false;
		wait(2);
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
	//	click(AddClassbtn);
		wait(5);
		click(lblCCQualifyPrecentage);
		wait(5);
		click(lblCCQualifyPrecentage);
		wait(2);
		enterData("5",InputCCQualifyPrecentage);
		wait(5);
		click(Cancelbtn);
		wait(5);
		click(AddClassbtn);
		wait(5);
		click(lblCCQualifyPrecentage);
		wait(5);
		enterData("5",InputCCQualifyPrecentage);
		wait(5);
		click(lblCCQualifyPrecentage);
		wait(5);
		click(Cancelbtn);
		wait(5);
	}
	
	// Qualifying score allows single digit
	public void EditCClblQualifySinglePrecentage() 
	{
		
	//	click(EditclasslblCCQualifyPrecentage);
		wait(5);
		click(lblCCQualifyPrecentage);
		wait(5);
		click(lblCCQualifyPrecentage);
		wait(2);
		enterData("5",EditclassInputCCQualifyPrecentage);
		wait(5);
		click(EditclassCancelbtn);
		wait(5);
		click(EditClassroomicon);
		wait(5);
		click(EditclasslblCCQualifyPrecentage);
		wait(2);
		click(lblCCQualifyPrecentage);
		wait(2);
		enterData("5",EditclassInputCCQualifyPrecentage);
		wait(5);
		click(EditclasslblCCQualifyPrecentage);
		wait(5);
		click(EditclassCancelbtn);
		wait(5);
		
	}

	public void Clicklogout() 
	{
		click(HeaderAClogo);
		wait(5);
		click(logout);
		wait(5);
	}
}
