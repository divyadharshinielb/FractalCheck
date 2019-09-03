package com.origin.fractal.testauto.steps;
import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBaseStep;
import com.origin.fractal.testauto.pages.LoginPage;
import com.origin.fractal.testauto.pages.VersionPage;


public class VersionSteps extends FractalBaseStep {
	
	private VersionPage page;

	public VersionSteps(WebDriver driver) {
		page = new VersionPage(driver);
		fBPage = page;
	}

	public void VersionCheck1() {
		result ="Passed";
		   try {
			page.VersionCheck1();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
		
	}
	public void VersionCheck() {
		result ="Passed";
		   try {
			page.VersionCheck();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
		
	}
}