package com.origin.fractal.testauto.steps;

import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBaseStep;
import com.origin.fractal.testauto.pages.HomePage;
import com.origin.fractal.testauto.pages.HomePageNewUI;


public class HomeStepsNewUI extends FractalBaseStep {
	private HomePageNewUI page=null;


	public HomeStepsNewUI(WebDriver driver) {
		page = new HomePageNewUI(driver);
		fBPage = page;
	}
	public void verifyResumeLearningLabeltext() {
		   result ="Passed";
		   try {
				page.verifyResumeLearningLabeltext();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	public void verifyMyLearningPage() {
    	result ="Passed";
		   try {
	        	page.verifyMyLearningPage();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
    }
	public void verifyFooterLinks() {
		result ="Passed";
		   try {
	        	page.verifyFooterLinks();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
}


