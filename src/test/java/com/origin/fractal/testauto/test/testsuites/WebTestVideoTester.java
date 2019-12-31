package com.origin.fractal.testauto.test.testsuites;

import java.io.IOException;

import org.testng.annotations.Test;

import com.origin.fractal.testauto.DataManager;
import com.origin.fractal.testauto.steps.VideoTesterSteps;
import com.origin.fractal.testauto.test.FractalBaseWebTest;
import com.wv.auto.framework.BrowserFactory;
import com.wv.auto.framework.utils.Reporter;

public class WebTestVideoTester extends FractalBaseWebTest {
	@Test(dataProviderClass=DataManager.class, dataProvider = "browers", groups = { "pilot" }, enabled = true, priority = 0 ,
			description = "video testing")
	public void verifyvideo(String row, String strBrowserName) throws InterruptedException {
		driver = BrowserFactory.getBrowser(strBrowserName);
		
		login(driver);
		VideoTesterSteps VideoTesterSteps=new VideoTesterSteps(driver);
		VideoTesterSteps.verifyVideoTester();
		Reporter.writeSummary("TCID_Video, Verify the video gets launched succesfully," +  VideoTesterSteps.getResult() );
	
	}
}

