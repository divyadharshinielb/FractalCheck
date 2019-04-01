package com.origin.fractal.testauto.steps;

import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBaseStep;
import com.origin.fractal.testauto.pages.ValidityContentAdminPage;

public class ValidityContentAdminSteps extends FractalBaseStep{
	public ValidityContentAdminPage page;
	public ValidityContentAdminSteps(WebDriver driver) {
		page = new ValidityContentAdminPage(driver);
		fBPage = page;
	}
	public void unLimited() {
		page.unLimited();
	}
	public void validity() {
		page.validity();
	}
	public void UserLogin() {
		page.UserLogin();	
	}
	
	public void editCatalog() {
		page.editCatalog();
	}
	public void deleteCatalog() {
		page.deleteCatalog();
	}
}
