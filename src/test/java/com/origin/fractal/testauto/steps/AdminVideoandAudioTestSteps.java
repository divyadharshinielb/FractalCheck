package com.origin.fractal.testauto.steps;

import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBaseStep;
import com.origin.fractal.testauto.pages.AdminVideoAndAudioTestPage;

/* ClassName: AdminVideoandAudioTestSteps.java 
 * Created by vignesh on 3-Aug-20
 * Purpose: Admin side audio/video pause/Play check - Step level code
 * Updated: Updated by vignesh on 30-Sep-20 (Added Admin audio test)
 */
public class AdminVideoandAudioTestSteps extends FractalBaseStep{
	public AdminVideoAndAudioTestPage page;
	public AdminVideoandAudioTestSteps(WebDriver driver) {
		page = new AdminVideoAndAudioTestPage(driver);

	} 

	/* Function Name: verifyVideoTester();
	 * Purpose: Video LO checking in admin side
	 */
	public void verifyVideoTester() throws InterruptedException {
		result="FAILED";
		try{
			page.verifyVideoTester();
			result="PASSED";
		}catch(Exception e) {
			print("Exception found in video player");
			result="FAILED";
		}
	}
	//Added on 30-Sep-20
	/* Function Name: verifyAudioTester();
	 * Purpose: Audio LO checking in Admin side (Inside catalog)
	 */
	public void verifyAudioTester()throws InterruptedException{
		result="FAILED";
		try{
			page.verifyAudioTester();
			result="PASSED";
		}catch(Exception e) {
			print("Exception found in Audio player");
			result="FAILED";
		}
	}
	//Ends
} 