package com.origin.fractal.testauto.test.testsuites;

import java.io.IOException;

import org.testng.annotations.Test;

import com.origin.fractal.testauto.DataManager;
import com.origin.fractal.testauto.steps.FractalLoginSteps;
import com.origin.fractal.testauto.test.FractalBaseWebTest;
import com.wv.auto.framework.BrowserFactory;
import com.wv.auto.framework.utils.Reporter;

public class WebTestsFractalLogin extends FractalBaseWebTest {

	@Test(dataProviderClass=DataManager.class, dataProvider = "browers", groups = { "Phase1.0", "pilot" }, enabled = true, description = "Fractal Login Page")
	public void testLogin(String row, String strBrowserName) throws IOException {
		driver = BrowserFactory.getBrowser(strBrowserName);
		FractalLoginSteps fractalLoginSteps = new FractalLoginSteps(driver);
		/*fractalLoginSteps.verifyLogoandText();
		Reporter.writeSummary("TC-01-FractalWVFInstanceURL, Verify the Fractal WVF Instance URL for presence of Logo and Text," +  fractalLoginSteps.getResult()); 
		*/fractalLoginSteps.verifyUserNameAndPassword();
		Reporter.writeSummary("TC-01-FractalWVFInstanceLogin, Verify the Fractal WVF Instance URL: User Login," +  fractalLoginSteps.getResult()); 
		driver.close(); 
	}
	
}
