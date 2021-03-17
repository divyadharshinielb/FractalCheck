package com.origin.fractal.testauto.steps;
import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBaseStep;
import com.origin.fractal.testauto.pages.VideoFractalPage;
/*
 * Description: FR1-2774 -Video Admin Part
 * Number of Test cases covered: 4
 * Developed By:Divya Dharshini R
 * created Date: 10-sep-2020
 */

public class VideoFractalSteps extends FractalBaseStep{
	public VideoFractalPage page;
	public VideoFractalSteps(WebDriver driver) {
		page = new VideoFractalPage(driver);
		fBPage = page;
	}
	/*
	 * function: goToVideoLO()
	 * covers: It covers navigation of goToVideoLO() in VideoFractalPage
	 */
	public void goToVideoLO() {
		result ="PASSED";
		try {
			page.goToVideoLO();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	/*
	 * function: videoFormatCheck()
	 * covers: It covers navigation of videoFormatCheck() in VideoFractalPage
	 */
	public void videoFormatCheck() {
		result ="PASSED";
		try {
			page.videoFormatCheck();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	/*
	 * function: linkFieldsCheck()
	 * covers: It covers navigation of linkFieldsCheck() in VideoFractalPage
	 */
	public void linkFieldsCheck() {
		result ="PASSED";
		try {
			page.linkFieldsCheck();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	/*
	 * function: createVideoWithMP4()
	 * covers: It covers navigation of createVideoWithMP4() in VideoFractalPage
	 */
	public void createVideoWithMP4() {
		result ="PASSED";
		try {
			page.createVideoWithMP4();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
}