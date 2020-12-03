package com.origin.fractal.testauto.test.testsuites;

import org.testng.annotations.Test;

import com.origin.fractal.testauto.DataManager;
import com.origin.fractal.testauto.steps.AdminVideoandAudioTestSteps;
import com.origin.fractal.testauto.test.FractalBaseWebTest;
import com.wv.auto.framework.BrowserFactory;
import com.wv.auto.framework.utils.Reporter;
/* ClassName: WebTestAdminVideoandAudioTest.java 
 * Created by vignesh on 3-Aug-20
 * Purpose: Admin side audio/video pause/Play check
 * Updated: Updated by vignesh on 30-Nov-20 (Added Admin audio test)
 */
public class WebTestAdminVideoandAudioTest extends FractalBaseWebTest {
	@Test(dataProviderClass=DataManager.class, dataProvider = "browers", groups = { "pilot" }, enabled = true, priority = 1 ,
			description = "Admin video and audio player testing")
	public void verifyvideo(String row, String strBrowserName) throws InterruptedException {
		driver = BrowserFactory.getBrowser(strBrowserName);
		siteAdminLogin(driver);
		AdminVideoandAudioTestSteps AdminVideoTestSteps=new AdminVideoandAudioTestSteps(driver);
//		AdminVideoTestSteps.verifyVideoTester();
//		print("Admin side video is working fine");
		AdminVideoTestSteps.verifyAudioTester();
		Reporter.writeSummary("FR-17_Admin_PodcastAudioPlayer_TC-001, Verify WebApp - Able to play audio files (MP3) and do podcasts.," +  AdminVideoTestSteps.getResult()); 
	}
}
	