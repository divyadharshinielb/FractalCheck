package com.origin.fractal.testauto.steps;

import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBaseStep;
import com.origin.fractal.testauto.pages.ManageContentPage;

public class ManageContentSteps  extends FractalBaseStep{
	public ManageContentPage page;
	public ManageContentSteps(WebDriver driver) {
		page = new ManageContentPage(driver);
		fBPage = page;
	}
	public void verifyAudioCreationPage() {
		page.verifyAudioCreationPage();
	}
	public void verifyMandatoryFieldsAlerMessage() {
		page.verifyMandatoryFieldsAlerMessage();
	}
	public void verifyItemCode() {
		page.verifyItemCode();
	}
	public void clickCatalog() {
		page.clickCatalog();
	}
	public void validity() {
		page.validity();
	}
	public void verifyReadMoreLessText() {
		page.verifyReadMoreLessText();
	}
	public void verifyCatalogTitleValidation() {
		page.verifyCatalogTitleValidation();
	}
	//Added by vignesh (WVI) on 03-Oct-19 & updated on 07-Oct-19(item codes related)
	public void clickOnCreateLobjButton() {
		page.clickOnCreateLobjButton();
	}
	public void checkelearningitemcode() {
		try {
			page.Clickelearning();
			if(page.boolresult ==true) {
				if(page.textresult==true) {
					result="PASSED";
				}
				else
				{
					result="FAILED";

				}
			}

			else
			{
				result="FAILED"; 
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	public void checkvideoitemcode() {

		try {
			page.ClickVideo();
			if(page.boolresult ==true) {
				if(page.textresult==true) {
					result="PASSED";
				}
				else
				{
					result="FAILED";

				}
			}

			else
			{
				result="FAILED"; 
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	public void checkdocumentitemcode() {

		try {
			page.ClickDocument();
			if(page.boolresult ==true) {
				if(page.textresult==true) {
					result="PASSED";
				}
				else
				{
					result="FAILED";

				}
			}

			else
			{
				result="FAILED"; 
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	public void checkimageitemcode() {
		try {
			page.ClickImage();
			if(page.boolresult ==true) {
				if(page.textresult==true) {
					result="PASSED";
				}
				else
				{
					result="FAILED";

				}
			}

			else
			{
				result="FAILED"; 
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	public void checkassessmentitemcode() {
		try {
			page.ClickAssessment();
			if(page.boolresult ==true) {
				if(page.textresult==true) {
					result="PASSED";
				}
				else
				{
					result="FAILED";

				}
			}

			else
			{
				result="FAILED"; 
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}	public void checkvlabitemcode() {

		try {
			page.ClickVlab();
			if(page.boolresult ==true) {
				if(page.textresult==true) {
					result="PASSED";
				}
				else
				{
					result="FAILED";

				}
			}

			else
			{
				result="FAILED"; 
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	public void checkaudioitemcode() {

		try {
			page.ClickAudio();
			if(page.boolresult ==true) {
				if(page.textresult==true) {
					result="PASSED";
				}
				else
				{
					result="FAILED";

				}
			}

			else
			{
				result="FAILED"; 
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}


	//Added by Vignesh (WVI) on 09-Oct-19(item codes related)

	public void clickOnCreatecatalogButton()
	{
		page.clickOnCreatecatalogButton();
		result="PASSED";
	}

	public void checkBundleitemcode() {
		try {
			page.ClickBundle();
			if(page.boolresult ==true) {
				if(page.textresult==true) {
					result="PASSED";
				}
				else
				{
					result="FAILED"; 
				}
			}
			else
			{
				result="FAILED"; 
			}

		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}

	public void checkLearningPathitemcode() {
		try {
			page.ClickLearningPath();
			if(page.boolresult ==true) {
				if(page.textresult==true) {
					result="PASSED";
				}
				else
				{
					result="FAILED";

				}
			}

			else
			{
				result="FAILED"; 
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}

	public void checkCourseitemcode() {
		try {
			page.ClickCourse();
			if(page.boolresult ==true) {
				if(page.textresult==true) {
					result="PASSED";
				}
				else
				{
					result="FAILED";

				}
			}

			else
			{
				result="FAILED"; 
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}

	public void checkResourceitemcode() {
		try {
			page.ClickResource();
			if(page.boolresult ==true) {
				if(page.textresult==true) {
					result="PASSED";
				}
				else
				{
					result="FAILED";

				}
			}

			else
			{
				result="FAILED"; 
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	public void checkPodcastitemcode() {
		try {
			page.ClickPodcast();
			if(page.boolresult ==true) {
				if(page.textresult==true) {
					result="PASSED";
				}
				else
				{
					result="FAILED";
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	public void Usersearchitemcode() {
		try
		{
			page.Usersearchitemcode();
			result="PASSED";
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
		
	}


	//Ended by vignesh (WVI) on 14-oct-19

}
