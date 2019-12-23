package com.origin.fractal.testauto.steps;

import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBaseStep;
import com.origin.fractal.testauto.pages.ReportPage;

public class ReportSteps extends FractalBaseStep{
	public ReportPage page;
	public ReportSteps(WebDriver driver) {
		page = new ReportPage(driver);
		fBPage = page;
	}
	
	public void verifyGroupName() {
		 result ="PASSED";
		   try {
		     page.verifyGroupName();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   };
			
	}

}
