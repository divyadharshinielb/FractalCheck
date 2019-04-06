package com.origin.fractal.testauto.test.testsuites;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.origin.fractal.testauto.DataManager;
import com.origin.fractal.testauto.steps.HomeSteps;
import com.origin.fractal.testauto.steps.LoginSteps;
import com.origin.fractal.testauto.steps.MenuSteps;
import com.origin.fractal.testauto.test.FractalBaseWebTest;
import com.wv.auto.framework.BrowserFactory;
import com.wv.auto.framework.utils.Reporter;
public class WebTestSettingsAdmin extends FractalBaseWebTest{
	
	@Test(dataProviderClass=DataManager.class, dataProvider = "browers", groups= {"pilot"}, enabled= true, description = "TCID_009:Dynamic payment configurations should appear in the User purchase page.")

public void WebTestSettingsAdminPaymentConfig(String row, String strBrowserName) {
		driver = BrowserFactory.getBrowser(strBrowserName);
		loginToContentAdmin(driver);
		MenuSteps menuSteps = new MenuSteps(driver);
		menuSteps.clickMenu();
		menuSteps.gotoPaymentConfiguration();
		Reporter.writeSummary("TCID_006, Verify we can able to add \"PAYTM/PAYPAL\" as a payment authentication., " +  menuSteps.getResult() );
		Reporter.writeSummary("TCID_007, Verify If there is one payment mode is available in admin ensure that payment mode is reflecting in user part.," +  menuSteps.getResult() );
	    menuSteps.logout();
		driver = BrowserFactory.getBrowser(strBrowserName);
		login(driver);
		HomeSteps homeSteps = new HomeSteps(driver);
		homeSteps.verifyCartItemBtn1();
		Reporter.writeSummary("TCID_008, Verify If there is one payment mode is available in admin ensure that payment mode is reflecting in user part., " +  homeSteps.getResult() );
		Reporter.writeSummary("TCID_009, Verify User should able to access the payment and it should redirect to payment section," +  homeSteps.getResult() );    
	}
}
