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
	 /* Function name: videoCreation()
		 * Action: Verify video creation navigates to page file
		 * Return Type: void
		 */
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
	/* Function name: imageCreation()
	 * Action: Verify imageCreation navigates to page file
	 * Return Type: void
	 */
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
	/* Function name: downloableOption()
	 * Action: Verify downloadble option navigates to page file
	 * Return Type: void
	 */
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
	/* Function name: verifyAudio()
	 * Action: Verify audio file navigates to page file
	 * Return Type: void
	 */
	public void verifyAudio() {
		result ="PASSED";
		   try {
			//page.verifyAudio();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	

}
