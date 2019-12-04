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
	/*public void verifyAudioCreationPage() {
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
	*/
	public void verifyAudioCreationPage() {
		page.verifyAudioCreationPage();
		
	}
	public void verifyMandatoryFieldsAlerMessage() {
		page.verifyMandatoryFieldsAlerMessage();
		
	}

}
