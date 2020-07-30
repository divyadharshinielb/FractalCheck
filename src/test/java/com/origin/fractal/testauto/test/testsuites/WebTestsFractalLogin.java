package com.origin.fractal.testauto.test.testsuites;

import java.io.IOException;

import org.testng.annotations.Test;

import com.origin.fractal.testauto.DataManager;
import com.origin.fractal.testauto.steps.FractalLoginSteps;
import com.origin.fractal.testauto.test.FractalBaseWebTest;
import com.wv.auto.framework.BrowserFactory;  
import com.wv.auto.framework.utils.Reporter;

import jxl.common.Assert;

public class WebTestsFractalLogin extends FractalBaseWebTest {
	String fractalInstance = "FractalWvfInstance";
	String fractalInstanceUrl = "Url"; 
	int runningIndex = 0;
	static short overallResult = 0;

	public void verifyInstanceLogin() throws IOException {

		FractalLoginSteps fractalLoginSteps = new FractalLoginSteps(driver, fractalInstance,fractalInstanceUrl);
		//fractalLoginSteps.verifyLogoandText();
		fractalLoginSteps.verifyUserNameAndPassword();

		if(fractalLoginSteps.getResult().equalsIgnoreCase("FAILED")) {
			overallResult++;
			print("Running index " + runningIndex);
		}
		Reporter.writeSummary("TC-0" + runningIndex + "-" + fractalInstance +","+ " Verify the " + fractalInstance + " URL and User Login," +  fractalLoginSteps.getResult()); 

	}

	@Test(dataProviderClass=DataManager.class, dataProvider = "browers", groups = { "Phase1.0", "pilot" }, enabled = true, description = "Fractal Login Page")
	public void testLogin(String row, String strBrowserName) throws IOException {
		
		driver = BrowserFactory.getBrowser(strBrowserName);
		fractalInstance = "FractalWvfInstance"; 
		runningIndex++;
		verifyInstanceLogin();
		driver.quit();
		
		driver = BrowserFactory.getBrowser(strBrowserName);
		fractalInstance = "FractalCogScaleInstance";
		runningIndex++;
		verifyInstanceLogin();
		driver.quit();
		
		driver = BrowserFactory.getBrowser(strBrowserName);
		fractalInstance = "FractaleWOWInstance";
		runningIndex++;
		verifyInstanceLogin();
		driver.quit();
		
		driver = BrowserFactory.getBrowser(strBrowserName);
		fractalInstance = "FractalFractalInstance";
		runningIndex++;
		verifyInstanceLogin();
		driver.quit();

		driver = BrowserFactory.getBrowser(strBrowserName);
		fractalInstance = "FractalEHSInstance";
		runningIndex++;
		verifyInstanceLogin();
		driver.quit();
		
		
		
		
		
	/*	driver = BrowserFactory.getBrowser(strBrowserName);
		fractalInstance = "FractalJuniperInstance";
		runningIndex++;
		verifyInstanceLogin();
		driver.quit();
	*/	
		
	    driver = BrowserFactory.getBrowser(strBrowserName);
		fractalInstance = "FractalFutureatWorkInstance";
		runningIndex++;
		verifyInstanceLogin();
		driver.quit();
		
		
		
		if(overallResult > 0) {
			Assert.verify(false);
		}
		
	}
}