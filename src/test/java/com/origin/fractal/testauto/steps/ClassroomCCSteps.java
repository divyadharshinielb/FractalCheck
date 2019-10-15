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
	//Added by Vignesh (WVI) on 04-Oct-19 & Updated on 14-Oct-19 

			public void CClblAllsession() {
			result ="PASSED";
			try {
				page.ClickCClblAllsession();
			}
			catch(Exception e)
			{
				e.printStackTrace();   
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
				e.printStackTrace();   
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
				e.printStackTrace();   
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
				e.printStackTrace();   
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
				e.printStackTrace();   
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
				e.printStackTrace();   
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
				e.printStackTrace();   
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
				e.printStackTrace();   
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
				e.printStackTrace();   
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
				e.printStackTrace();   
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
				e.printStackTrace();   
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
				e.printStackTrace();   
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
				e.printStackTrace();   
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
				e.printStackTrace();   
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
				e.printStackTrace();   
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
				e.printStackTrace();   
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
				e.printStackTrace();   
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
				e.printStackTrace();   
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
				e.printStackTrace();   
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
				e.printStackTrace();   
				result="FAILED";
			}
		}

		// Overall CC text
		public void verifyCCTexts() {
			print("Result boolean : "+ page.booleanresult); //booleanresult
			try {
				page.verifyCCTexts();
				if (page.booleanresult == true) {
					result ="PASSED";

				}
				else {
					result ="FAILED";
				}
				
			}
			catch(Exception e)
			{
				e.printStackTrace();   
				result="FAILED";
			}

		}

		public void verifyEditCCTexts() {
			print("Result boolean : "+ page.booleanresult); //booleanresult
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
				e.printStackTrace();   
				result="FAILED";
			}

		}

		public void verifyCCsessionLabels() {

			try {
				page.verifyCCsessionLabels();
				if (page.booleanresult1 == true) {
					result ="PASSED";

				}
				else if (page.booleanresult1 == false){
					result ="FAILED";
				}
				else {
					result = "FAILED";
					// log - There is a problem in verifyCCTexts()
				}
			}

			catch(Exception e)
			{
				e.printStackTrace();   
				result="FAILED";
			}	}

		public void verifyEditCCsessionLabels() {

			try {
				page.verifyEditCCsessionLabels();
				if (page.booleanresult1 == true) {
					result ="PASSED";

				}
				else if (page.booleanresult1 == false){
					result ="FAILED";
				}
				else {
					result = "FAILED";
					// log - There is a problem in verifyCCTexts()
				}
			}

			catch(Exception e)
			{
				e.printStackTrace();   
				result="FAILED";
			}	}

		public void verifyCCAssDuedateLabels() {
			try {
				page.verifyCCAssDuedateLabels();
				if (page.booleanresult2 == true) {
					result ="PASSED";

				}
				else if (page.booleanresult2 == false){
					result ="FAILED";
				}
				else {
					result = "FAILED";
					// log - There is a problem in verifyCCTexts()
				}
			}

			catch(Exception e)
			{
				e.printStackTrace();   
				result="FAILED";
			}		}

		public void verifyEditCCAssDuedateLabels() {
			try {
				page.verifyEditCCAssDuedateLabels();
				if (page.booleanresult2 == true) {
					result ="PASSED";

				}
				else if (page.booleanresult2 == false){
					result ="FAILED";
				}
				else {
					result = "FAILED";
					// log - There is a problem in verifyCCTexts()
				}
			}

			catch(Exception e)
			{
				e.printStackTrace();   
				result="FAILED";
			}		}

		public void verifyCCQualifyPrecentageLabels() {
			try {
				page.verifyCCQualifyPrecentageLabels();
				if (page.booleanresult3 == true) {
					result ="PASSED";
				}
				else if (page.booleanresult3 == false){
					result ="FAILED";
				}
				else {
					result = "FAILED";
					// log - There is a problem in verifyCCTexts()
				}
			}

			catch(Exception e)
			{
				e.printStackTrace();   
				result="FAILED";
			}	}

		public void verifyEditCCQualifyPrecentageLabels() {
			try {
				page.verifyEditCCQualifyPrecentageLabels();
				if (page.booleanresult3 == true) {
					result ="PASSED";
				}
				else if (page.booleanresult3 == false){
					result ="FAILED";
				}
				else {
					result = "FAILED";
					// log - There is a problem in verifyCCTexts()
				}
			}

			catch(Exception e)
			{
				e.printStackTrace();   
				result="FAILED";
			}	}


		public void verifyCCFeedbackDuedateLabels() {
			try {
				page.verifyCCFeedbackDuedateLabels();
				if (page.booleanresult4 == true) {
					result ="PASSED";
				}
				else if (page.booleanresult4 == false){
					result ="FAILED";
				}
				else {
					result = "FAILED";
					// log - There is a problem in verifyCCTexts()
				}
			}

			catch(Exception e)
			{
				e.printStackTrace();   
				result="FAILED";
			}
		}

		public void verifyEditCCFeedbackDuedateLabels() {
			try {
				page.verifyEditCCFeedbackDuedateLabels();
				if (page.booleanresult4 == true) {
					result ="PASSED";
				}
				else if (page.booleanresult4 == false){
					result ="FAILED";
				}
				else {
					result = "FAILED";
					// log - There is a problem in verifyCCTexts()
				}
			}

			catch(Exception e)
			{
				e.printStackTrace();   
				result="FAILED";
			}
		}


		public void verifyCCManualCompletionLabels() {
			try {
				page.verifyCCManualCompletionLabels();
				if (page.booleanresult5 == true) {
					result ="PASSED";

				}
				else if (page.booleanresult5 == false){
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
				e.printStackTrace();   
				result="FAILED";
			}
		}

		public void verifyEditCCManualCompletionLabels() {
			try {
				page.verifyEditCCManualCompletionLabels();
				if (page.booleanresult5 == true) {
					result ="PASSED";

				}
				else if (page.booleanresult5 == false){
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
				e.printStackTrace();   
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
				e.printStackTrace();   
				result="FAILED";
			}
		}
		// End- here************************** Vignesh (WVI) on 14-Oct-19 ********************************
		

}