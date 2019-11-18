package com.origin.fractal.testauto.test.testsuites;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.origin.fractal.testauto.steps.HomeSteps;
import com.origin.fractal.testauto.steps.LoginSteps;
import com.origin.fractal.testauto.steps.ManageContentSteps;
import com.origin.fractal.testauto.steps.MenuSteps;
import com.origin.fractal.testauto.test.FractalBaseWebTest;
import com.wv.auto.framework.BrowserFactory;
import com.wv.auto.framework.utils.Reporter;
public class WebTestSettingsAdmin extends FractalBaseWebTest{
	@DataProvider
	public Object[][] browers() {
		return new Object[][] {
			new Object[] { "1", "chrome" }
//		, new Object[] { "2", "firefox" }
//		, new Object[] { "3", "msedge" } 
//		 new Object[] { "4", "ie11" }
		};
	}
	
	@Test(dataProvider = "browers", groups= {"pilot"}, enabled= true, description = "TCID_009:Dynamic payment configurations should appear in the User purchase page.")

public void WebTestSettingsAdminPaymentConfig(String row, String strBrowserName) throws IOException {
		driver = BrowserFactory.getBrowser(strBrowserName);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		loginToContentAdmin(driver);	
		MenuSteps menuSteps = new MenuSteps(driver);
		menuSteps.clickMenu();
		js.executeScript("window.scrollBy(0,2000)");
		menuSteps.gotoPaymentConfiguration();
		Reporter.writeSummary("TCID_006, Verify we are able to configure Paytm as a payment authentication, " +  menuSteps.getResult() );
		Reporter.writeSummary("TCID_007, Verify If there is one payment mode is available in admin ensure that payment mode is reflecting in user part.," +  menuSteps.getResult() );
	    menuSteps.logout();
		driver = BrowserFactory.getBrowser(strBrowserName);
		login(driver);
		HomeSteps homeSteps = new HomeSteps(driver);
		homeSteps.verifyCartItemBtn1();
		Reporter.writeSummary("TCID_008, Verify the payment configured in admin only is available to the user., " +  homeSteps.getResult() );
		Reporter.writeSummary("TCID_009, Verify User should able to access the payment and it should redirect to payment section," +  homeSteps.getResult() );    
	}
}
