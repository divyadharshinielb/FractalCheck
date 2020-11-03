package com.origin.fractal.testauto.test.testsuites;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.origin.fractal.testauto.steps.DownloadContentSteps;
import com.origin.fractal.testauto.steps.MenuSteps;
import com.origin.fractal.testauto.steps.UserCronSteps;
import com.origin.fractal.testauto.steps.VenueSteps;
import com.origin.fractal.testauto.test.FractalBaseWebTest;
import com.wv.auto.framework.BrowserFactory;

public class WebTestsDownloadContent extends FractalBaseWebTest{
	@DataProvider
	public Object[][] browers() {
		return new Object[][] {
			new Object[] { "1", "chrome" }
			//		 new Object[] { "2", "firefox" },
			//		 new Object[] { "3", "msedge" } ,
			//		 new Object[] { "4", "ie11" }
		};
	}
	@Test(dataProvider = "browers", groups = { "pilot", "Home" }, enabled = false,
			description = "")
	public void DownloadContent(String row, String strBrowserName) throws IOException {
		driver = BrowserFactory.getBrowser(strBrowserName);
		VenueSteps venueSteps = new VenueSteps(driver);
		MenuSteps menuSteps = new MenuSteps(driver);
		DownloadContentSteps downloadContentSteps = new DownloadContentSteps(driver);
		
		loginToContentAdmin(driver);
		venueSteps.clickHomeMenu();
		menuSteps.gotoManageContents();
		UserCronSteps userCronSteps = new UserCronSteps(driver);
		userCronSteps.addLearningObjectBtn();
		downloadContentSteps.videoCreation();
		downloadContentSteps.imageCreation();
		downloadContentSteps.downloableOption();
		
		
		
	}
	@Test(dataProvider = "browers", groups = { "pilot", "Home" }, enabled = true,
			description = "")
	public void verifyvideo(String row, String strBrowserName) throws InterruptedException {
		driver = BrowserFactory.getBrowser(strBrowserName);
		DownloadContentSteps downloadContentSteps = new DownloadContentSteps(driver);
		login(driver);
		downloadContentSteps.verifyAudio();
		
	}

}
