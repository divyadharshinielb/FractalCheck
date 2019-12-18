package com.origin.fractal.testauto.steps;

import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBaseStep;
import com.origin.fractal.testauto.pages.MyLearningPage;
import com.origin.fractal.testauto.pages.MyLearningPageNewUI;

public class MyLearningStepsNewUI extends FractalBaseStep {
	private MyLearningPageNewUI page;
	public MyLearningStepsNewUI(WebDriver driver) {
		page = new MyLearningPageNewUI(driver);
		fBPage = page;
	}
	public void verifySubMenu() {
		page.verifySubMenu();
	}
	public void verifyCatalogname() {
		page.verifyCatalogname();
	}

}