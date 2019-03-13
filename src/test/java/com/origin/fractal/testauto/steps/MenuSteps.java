package com.origin.fractal.testauto.steps;

import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBaseStep;
import com.origin.fractal.testauto.pages.MenuPage;

public class MenuSteps extends FractalBaseStep{
	public MenuPage page;
	public MenuSteps(WebDriver driver) {
		page = new MenuPage(driver);
		fBPage = page;
	}
	public void logout() {
		page.logout();
	}
	public void clickMenu() {
		page.clickMenu();
	}
	public void gotoManageContents() {
		page.gotoManageContents();
	}
	public void gotoPaymentConfiguration() {
		page.gotoPaymentConfiguration();
	}
	public void searchFieldAsset() {
		page.searchFieldAsset();
	}
	public void searchFieldItemCode() {
		page.searchFieldItemCode();
	}
}
