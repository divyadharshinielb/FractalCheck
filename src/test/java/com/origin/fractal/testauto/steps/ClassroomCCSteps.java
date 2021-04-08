package com.origin.fractal.testauto.steps;

import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBaseStep;
import com.origin.fractal.testauto.pages.ClassroomCCPage;

public class ClassroomCCSteps extends FractalBaseStep {
	private ClassroomCCPage page;

	public ClassroomCCSteps(WebDriver driver) {
		page = new ClassroomCCPage(driver);
		fBPage = page;
	}

	public void GotoClassroom() {
		result ="PASSED";
		try {
			page.GotoClassroom();
		}
		catch(Exception e)
		{
			   
			result="FAILED";
		}
	}

	public void GotoEditClassroom() {
		result ="PASSED";
		try {
			page.GotoEditClassroom();
		}
		catch(Exception e)
		{
			   
			result="FAILED";
		}
	}

	public void CClblAllsession() {
		result ="PASSED";
		try {
			page.ClickCClblAllsession();
		}
		catch(Exception e)
		{
			   
			result="FAILED";
		}
	}

	public void EditCClblAllsession() {
		result ="PASSED";
		try {
			page.ClickEditCClblAllsession();
		}
		catch(Exception e)
		{
			   
			result="FAILED";
		}
	}

	public void CClblAssDuedate() {
		result ="PASSED";
		try {
			page.ClickCClblAssDuedate();
		}
		catch(Exception e)
		{
			   
			result="FAILED";
		}
	}

	public void EditCClblAssDuedate() {
		result ="PASSED";
		try {
			page.ClickEditCClblAssDuedate();
		}
		catch(Exception e)
		{
			   
			result="FAILED";
		}
	}

	public void CClblQualifyPrecentage() {
		result ="PASSED";
		try {
			page.ClickCClblQualifyPrecentage();
		}
		catch(Exception e)
		{
			   
			result="FAILED";
		}
	}

	public void EditCClblQualifyPrecentage() {
		result ="PASSED";
		try {
			page.ClickEditCClblQualifyPrecentage();
		}
		catch(Exception e)
		{
			   
			result="FAILED";
		}
	}

	public void CClblFeedbackDuedate() {
		result ="PASSED";
		try {
			page.ClickCClblFeedbackDuedate();
		}
		catch(Exception e)
		{
			   
			result="FAILED";
		}
	}

	public void EditCClblFeedbackDuedate() {
		result ="PASSED";
		try {
			page.ClickEditCClblFeedbackDuedate();
		}
		catch(Exception e)
		{
			   
			result="FAILED";
		}
	}


	public void CClblManualCompletion() {
		result ="PASSED";
		try {
			page.ClickCClblManualCompletion();
		}
		catch(Exception e)
		{
			   
			result="FAILED";
		}
	}

	public void EditCClblManualCompletion() {
		result ="PASSED";
		try {
			page.ClickEditCClblManualCompletion();
		}
		catch(Exception e)
		{
			   
			result="FAILED";
		}
	}

	public void CClblAllSession_Subdate() {
		result ="PASSED";
		try {
			page.ClickCClblAllSession_Subdate();
		}
		catch(Exception e)
		{
			   
			result="FAILED";
		}
	}

	public void EditCClblAllSession_Subdate() {
		result ="PASSED";
		try {
			page.ClickEditCClblAllSession_Subdate();
		}
		catch(Exception e)
		{
			   
			result="FAILED";
		}
	}

	public void CClblSubdate_Qualify() {
		result ="PASSED";
		try {
			page.ClickCClblSubdate_Qualify();
		}
		catch(Exception e)
		{
			   
			result="FAILED";
		}
	}

	public void EditCClblSubdate_Qualify() {
		result ="PASSED";
		try {
			page.ClickEditCClblSubdate_Qualify();
		}
		catch(Exception e)
		{
			   
			result="FAILED";
		}
	}

	public void CClblQualify_feedbackdate() {
		result ="PASSED";
		try {
			page.ClickCClblQualify_feedbackdate();
		}
		catch(Exception e)
		{
			   
			result="FAILED";
		}
	}

	public void EditCClblQualify_feedbackdate() {
		result ="PASSED";
		try {
			page.ClickEditCClblQualify_feedbackdate();
		}
		catch(Exception e)
		{
			   
			result="FAILED";
		}
	}

	public void CClblfeedbackdate_Manualcomp() {
		result ="PASSED";
		try {
			page.ClickCClblfeedbackdate_Manualcomp();
		}
		catch(Exception e)
		{
			   
			result="FAILED";
		}
	}

	public void EditCClblfeedbackdate_Manualcomp() {
		result ="PASSED";
		try {
			page.ClickEditCClblfeedbackdate_Manualcomp();
		}
		catch(Exception e)
		{
			   
			result="FAILED";
		}
	}

	public void CClblManualcomp_Allsession() {
		result ="PASSED";
		try {
			page.ClickCClblManualcomp_Allsession();
		}
		catch(Exception e)
		{
			   
			result="FAILED";
		}
	}
	public void EditCClblManualcomp_Allsession() {
		result ="PASSED";
		try {
			page.ClickEditCClblManualcomp_Allsession();
		}
		catch(Exception e)
		{
			   
			result="FAILED";
		}
	}

	// Overall CC text
	public void verifyCCTexts() {
		System.out.println("Result boolean : "+ page.booleanresult); //booleanresult
		try {
			page.verifyCCTexts();
			if (page.booleanresult == true) {
				result ="PASSED";

			}
			else if (page.booleanresult == false){
				result ="FAILED";
			}
			else {
				result = "FAILED";
				// log - There is a problem in verifyCCTexts()
			}
		}
		catch(Exception e)
		{
			   
			result="FAILED";
		}

	}

	public void verifyEditCCTexts() {
		System.out.println("Result boolean : "+ page.booleanresult); //booleanresult
		try {
			page.verifyEditCCTexts();
			if (page.booleanresult == true) {
				result ="PASSED";

			}
			else if (page.booleanresult == false){
				result ="FAILED";
			}
			else {
				result = "FAILED";
				// log - There is a problem in verifyCCTexts()
			}
		}

		catch(Exception e)
		{
			   
			result="FAILED";
		}

	}

	public void verifyCCsessionLabels() {

		try {
			page.verifyCCsessionLabels();
			if (page.booleanresult == true) {
				result ="PASSED";

			}
			else if (page.booleanresult == false){
				result ="FAILED";
			}
			else {
				result = "FAILED";
				// log - There is a problem in verifyCCTexts()
			}
		}

		catch(Exception e)
		{
			   
			result="FAILED";
		}	}

	public void verifyEditCCsessionLabels() {

		try {
			page.verifyEditCCsessionLabels();
			if (page.booleanresult == true) {
				result ="PASSED";

			}
			else if (page.booleanresult == false){
				result ="FAILED";
			}
			else {
				result = "FAILED";
				// log - There is a problem in verifyCCTexts()
			}
		}

		catch(Exception e)
		{
			   
			result="FAILED";
		}	}

	public void verifyCCAssDuedateLabels() {
		try {
			page.verifyCCAssDuedateLabels();
			if (page.booleanresult == true) {
				result ="PASSED";

			}
			else if (page.booleanresult == false){
				result ="FAILED";
			}
			else {
				result = "FAILED";
				// log - There is a problem in verifyCCTexts()
			}
		}

		catch(Exception e)
		{
			   
			result="FAILED";
		}		}

	public void verifyEditCCAssDuedateLabels() {
		try {
			page.verifyEditCCAssDuedateLabels();
			if (page.booleanresult == true) {
				result ="PASSED";

			}
			else if (page.booleanresult == false){
				result ="FAILED";
			}
			else {
				result = "FAILED";
				// log - There is a problem in verifyCCTexts()
			}
		}

		catch(Exception e)
		{
			   
			result="FAILED";
		}		}

	public void verifyCCQualifyPrecentageLabels() {
		try {
			page.verifyCCQualifyPrecentageLabels();
			if (page.booleanresult == true) {
				result ="PASSED";
			}
			else if (page.booleanresult == false){
				result ="FAILED";
			}
			else {
				result = "FAILED";
				// log - There is a problem in verifyCCTexts()
			}
		}

		catch(Exception e)
		{
			   
			result="FAILED";
		}	}

	public void verifyEditCCQualifyPrecentageLabels() {
		try {
			page.verifyEditCCQualifyPrecentageLabels();
			if (page.booleanresult == true) {
				result ="PASSED";
			}
			else if (page.booleanresult == false){
				result ="FAILED";
			}
			else {
				result = "FAILED";
				// log - There is a problem in verifyCCTexts()
			}
		}

		catch(Exception e)
		{
			   
			result="FAILED";
		}	}


	public void verifyCCFeedbackDuedateLabels() {
		try {
			page.verifyCCFeedbackDuedateLabels();
			if (page.booleanresult == true) {
				result ="PASSED";
			}
			else if (page.booleanresult == false){
				result ="FAILED";
			}
			else {
				result = "FAILED";
				// log - There is a problem in verifyCCTexts()
			}
		}

		catch(Exception e)
		{
			   
			result="FAILED";
		}
	}

	public void verifyEditCCFeedbackDuedateLabels() {
		try {
			page.verifyEditCCFeedbackDuedateLabels();
			if (page.booleanresult == true) {
				result ="PASSED";
			}
			else if (page.booleanresult == false){
				result ="FAILED";
			}
			else {
				result = "FAILED";
				// log - There is a problem in verifyCCTexts()
			}
		}

		catch(Exception e)
		{
			   
			result="FAILED";
		}
	}


	public void verifyCCManualCompletionLabels() {
		try {
			page.verifyCCManualCompletionLabels();
			if (page.booleanresult == true) {
				result ="PASSED";

			}
			else if (page.booleanresult == false){
				result ="FAILED";
			}
			else {
				//page.Else();
				result = "FAILED";
				// log - There is a problem in verifyCCTexts()
			}
		}

		catch(Exception e)
		{
			   
			result="FAILED";
		}
	}

	public void verifyEditCCManualCompletionLabels() {
		try {
			page.verifyEditCCManualCompletionLabels();
			if (page.booleanresult == true) {
				result ="PASSED";

			}
			else if (page.booleanresult == false){
				result ="FAILED";
			}
			else {
				//page.Else();
				result = "FAILED";
				// log - There is a problem in verifyCCTexts()
			}
		}

		catch(Exception e)
		{
			   
			result="FAILED";
		}
	}


	public void Clicklogout() {
		result ="PASSED";
		try {
			page.Clicklogout();
		}
		catch(Exception e)
		{
			   
			result="FAILED";
		}
	}

	// 25th TC in manual testing
	public void CClblQualifySinglePrecentage() {
		result ="PASSED";
		try {
			page.ClickCClblQualifySinglePrecentage();
		}
		catch(Exception e)
		{
			   
			result="FAILED";
		}
	}
	// 25th TC in manual testing
	public void EditCClblQualifySinglePrecentage() {
		result ="PASSED";
		try {
			page.EditCClblQualifySinglePrecentage();
		}
		catch(Exception e)
		{
			   
			result="FAILED";
		}
	}
}
