package com.origin.fractal.testauto.test.testsuites;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.origin.fractal.testauto.steps.MenuSteps;
import com.origin.fractal.testauto.steps.NotificationSteps;
import com.origin.fractal.testauto.test.FractalBaseWebTest;
import com.wv.auto.framework.BrowserFactory;
import com.wv.auto.framework.utils.Reporter;
public class WebTestNotification extends FractalBaseWebTest{
	@DataProvider
	public Object[][] browers() {
		return new Object[][] {
			new Object[] { "1", "chrome" }
//		, new Object[] { "2", "firefox" }
//		, new Object[] { "3", "msedge" } 
//		 new Object[] { "4", "ie11" }
		};
	}
	
	
	@Test(dataProvider = "browers", groups= {"pilot"}, enabled= true, description = "")

	public void WebTestEmailNotification(String row, String strBrowserName) throws IOException {
		driver = BrowserFactory.getBrowser(strBrowserName);
		loginToContentAdmin(driver);
		MenuSteps menuSteps = new MenuSteps(driver);
		menuSteps.clickMenu();
		menuSteps.gotoNotification();
		NotificationSteps notificationSteps= new NotificationSteps(driver);
		notificationSteps.gotoEmailNotificationTab();
		notificationSteps.verifyPasswordChangedTemplate();
		Reporter.writeSummary("EmailTem_001, Verify whether password change template is working fine , " +  notificationSteps.getResult() );
		notificationSteps.verifyPurchaseMailTemplate();
		Reporter.writeSummary("EmailTem_002,Verify whether purchase mail template is working fine , " +  notificationSteps.getResult() );
	/*	notificationSteps.verifyUnAssignTemplate();
		Reporter.writeSummary("EmailTem_003, Verify whether Un assign template is working fine , " +  notificationSteps.getResult() );
		notificationSteps.verifyUsersForgotPasswordMail();
		Reporter.writeSummary("EmailTem_004, Verify whether users forgot password template is working fine , " +  notificationSteps.getResult() );
		notificationSteps.verifyTemplateForValidityExpired();
		Reporter.writeSummary("EmailTem_005, Verify whether template for validity expired template is working fine , " +  notificationSteps.getResult() );
        notificationSteps.verifyContentAssignment();
        Reporter.writeSummary("EmailTem_006,Verify whethercontent assignment template is working fine , " +  notificationSteps.getResult() );
        notificationSteps.verifyBusinessUserRegistration();
        Reporter.writeSummary("EmailTem_007, Verify whether business user template is working fine , " +  notificationSteps.getResult() );
   */ }


	
}