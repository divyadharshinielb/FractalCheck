package com.origin.fractal.testauto.steps;

import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBaseStep;
import com.origin.fractal.testauto.pages.DownloadContentPage;


public class DownloadContentSteps extends FractalBaseStep {
		private DownloadContentPage page=null; 

	public DownloadContentSteps(WebDriver driver) {
			page = new DownloadContentPage(driver);
			fBPage = page;
		}
	public void videoCreation() {
		result ="PASSED";
		   try {
			page.videoCreation();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	public void imageCreation() {
		result ="PASSED";
		   try {
			page.imageCreation();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	public void downloableOption() {
		result ="PASSED";
		   try {
			page.downloableOption();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	
	public void verifyAudio() {
		result ="PASSED";
		   try {
			page.verifyAudio();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	

}
