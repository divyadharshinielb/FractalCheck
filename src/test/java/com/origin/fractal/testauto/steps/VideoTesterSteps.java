package com.origin.fractal.testauto.steps;

import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBaseStep;
import com.origin.fractal.testauto.pages.videoTesterPage;


public class VideoTesterSteps extends FractalBaseStep{
	public videoTesterPage page;
	public VideoTesterSteps(WebDriver driver) {
		page = new videoTesterPage(driver);
		fBPage = page;
	} 
	public void verifyVideoTester()  {
		result ="PASSED";
		   try {
			page.verifyVideoTester();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
}
	public void verifyAdminVideoTester(){
	result ="PASSED";
	   try {
	//	page.verifyAdminVideoTester();
	   }
	   catch(Exception e)
	   {
		e.printStackTrace();   
		result="FAILED";
	   }
	}
}
