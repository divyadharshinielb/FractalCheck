package com.origin.fractal.testauto.test.testsuites;

import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.origin.fractal.testauto.DataManager;
import com.origin.fractal.testauto.steps.MenuSteps;
import com.origin.fractal.testauto.steps.NotificationSteps;
import com.origin.fractal.testauto.test.FractalBaseWebTest;
import com.wv.auto.framework.BrowserFactory;
import com.wv.auto.framework.utils.Reporter;
/*
 * File: WebTestNotification.java
 * Purpose: The Admin able to check all templates
 * Number of Test cases: 07
 * Created by: Mahesh.G
 * Updated on: 30-Sep-2021
 */
public class WebTestNotification extends FractalBaseWebTest{
	
	
	@Test(dataProviderClass = DataManager.class,dataProvider = "browers", groups= {"pilot"}, enabled= true, description = "")

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
		notificationSteps.verifyUnAssignTemplate();
		Reporter.writeSummary("EmailTem_003, Verify whether Un assign template is working fine , " +  notificationSteps.getResult() );
		notificationSteps.verifyUsersForgotPasswordMail();
		Reporter.writeSummary("EmailTem_004, Verify whether users forgot password template is working fine , " +  notificationSteps.getResult() );
		notificationSteps.verifyTemplateForValidityExpired();
		Reporter.writeSummary("EmailTem_005, Verify whether template for validity expired template is working fine , " +  notificationSteps.getResult() );
        notificationSteps.verifyContentAssignment();
        Reporter.writeSummary("EmailTem_006,Verify whethercontent assignment template is working fine , " +  notificationSteps.getResult() );
        notificationSteps.verifyBusinessUserRegistration();
        Reporter.writeSummary("EmailTem_007, Verify whether business user template is working fine , " +  notificationSteps.getResult() );
   
		notificationSteps.verifyAccessEnable();
		Reporter.writeSummary("EmailTem_008, Verify whether AccessEnable template is working fine , " +  notificationSteps.getResult() );
		notificationSteps.verifyBusinessAdminDirectUser();
		Reporter.writeSummary("EmailTem_009, Verify whether BusinessAdminDirectUser template is working fine , " +  notificationSteps.getResult() );
		notificationSteps.VerifyInstructorConfirmation();
		Reporter.writeSummary("EmailTem_010, Verify whether InstructorConfirmation template is working fine , " +  notificationSteps.getResult() );
	    notificationSteps.verifyInstructorEventNotification();
	    Reporter.writeSummary("EmailTem_011, Verify whether InstructorEventNotification template is working fine , " +  notificationSteps.getResult() );
	    notificationSteps.verifyUserRegistrationForInstructor();
	    Reporter.writeSummary("EmailTem_012, Verify whether UserRegistrationForInstructor template is working fine , " +  notificationSteps.getResult() );
	    notificationSteps.verifyRemainderEvent();
	    Reporter.writeSummary("EmailTem_013, Verify whether RemainderEvent template is working fine , " +  notificationSteps.getResult() );
	    }


	
}