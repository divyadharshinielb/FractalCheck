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
		result ="PASSED";
		try{page.verifyAudioCreationPage();
		}	catch(Exception e) {
			result="FAILED";
		}
	}
	public void verifyMandatoryFieldsAlerMessage() {
		result ="PASSED";
		try{page.verifyMandatoryFieldsAlerMessage();
		}	catch(Exception e) {
			result="FAILED";
		}
	}
	public void verifyItemCode() {
		result ="PASSED";
		try{page.verifyItemCode();
		}	catch(Exception e) {
			result="FAILED";
		}
	}
	public void clickCatalog() {
		result ="PASSED";
		try{page.clickCatalog();
		}	catch(Exception e) {
			result="FAILED";
		}
	}
	public void validity() {
		result ="PASSED";
		try{page.validity();
		}	catch(Exception e) {
			result="FAILED";
		}
	}
	public void verifyReadMoreLessText() {
		result ="PASSED";
		try{page.verifyReadMoreLessText();
		}	catch(Exception e) {
			result="FAILED";
		}
	}
	public void verifyCatalogTitleValidation() {
		result ="PASSED";
		try{	page.verifyCatalogTitleValidation();
		}	catch(Exception e) {
			result="FAILED";
		}
	}
	public void clickOnCreateLobjButton() {
		result ="PASSED";
		try{page.clickOnCreateLobjButton();
		}	catch(Exception e) {
			result="FAILED";
		}
	}
}
