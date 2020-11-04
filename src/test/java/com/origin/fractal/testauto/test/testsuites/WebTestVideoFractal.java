package com.origin.fractal.testauto.test.testsuites;

import java.io.IOException;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.origin.fractal.testauto.steps.VideoFractalSteps;
import com.origin.fractal.testauto.test.FractalBaseWebTest;
import com.wv.auto.framework.BrowserFactory;
import com.wv.auto.framework.utils.Reporter;
/*
 * Description: FR1-2774 -Video Admin Part
 * Number of Test cases covered: 4
 * Developed By:Divya Dharshini R
 * created Date: 10-sep-2020
 */
//Mobile part for FR1-2774 - Unable to click the backbutton(Android Studio), hence Webpart only has been covered. 
public class WebTestVideoFractal extends FractalBaseWebTest{
	@DataProvider
	public Object[][] browers() {
		return new Object[][] {
			new Object[] { "1", "chrome" }
			//		, new Object[] { "2", "firefox" }
			//		, new Object[] { "3", "msedge" } 
			//		 new Object[] { "4", "ie11" }
		};
	}
	@Test(dataProvider = "browers", groups= {"pilot"}, enabled= true,
			description=""
			)
	public void testVideo(String row, String strBrowserName) throws IOException {
		driver = BrowserFactory.getBrowser(strBrowserName);
		loginToContentAdmin(driver);
		VideoFractalSteps videosteps = new VideoFractalSteps(driver);
		videosteps.goToVideoLO();
		Reporter.writeSummary("FR1-2774_VideoAdmin_TC_01,Verify navigation to creation of Video Learning Object.," +videosteps.getResult() );
		videosteps.videoFormatCheck();
		Reporter.writeSummary("FR1-2774_VideoAdmin_TC_02,Verify the fields in the video creation page.," +videosteps.getResult() );
		videosteps.linkFieldsCheck();
		Reporter.writeSummary("FR1-2774_VideoAdmin_TC_03,Verify the creation and validation of vide using link.," +videosteps.getResult() );
		videosteps.createVideoWithMP4();
		Reporter.writeSummary("FR1-2774_VideoAdmin_TC_04,Verify creation of video with mp4 format.," +videosteps.getResult() );
	}
}


