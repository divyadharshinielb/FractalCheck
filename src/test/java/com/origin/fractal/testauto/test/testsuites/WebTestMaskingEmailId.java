package com.origin.fractal.testauto.test.testsuites;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.origin.fractal.testauto.steps.CustomizationRolesSteps;
import com.origin.fractal.testauto.steps.MaskingEmailIdSteps;
import com.origin.fractal.testauto.steps.MenuSteps;
import com.origin.fractal.testauto.test.FractalBaseWebTest;
import com.wv.auto.framework.BrowserFactory;
import com.wv.auto.framework.utils.Reporter;
/* File Name: WebTestMaskingEmaildId.java
 * Purpose: Check for MaskingEmailId in admin and user part -FR1-3960
 * Number of Testcases: 4
 * Created by: Mahesh
 * Created on: 22/04/2021
 */
public class WebTestMaskingEmailId extends FractalBaseWebTest{
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

public void maskingEmailId(String row, String strBrowserName) throws IOException {
		driver = BrowserFactory.getBrowser(strBrowserName);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		loginToContentAdmin(driver);
		MenuSteps menuSteps = new MenuSteps(driver);
		MaskingEmailIdSteps maskingEmailIdSteps = new MaskingEmailIdSteps(driver);
		menuSteps.clickMenu();
		maskingEmailIdSteps.gotoWhiteLabel();
		Reporter.writeSummary("FR1-3960_MaskingEmail_TC-01,Verify whether the Email Masking option is present in settings under whitelabeling , " + maskingEmailIdSteps.getResult() );
		maskingEmailIdSteps.enableMasking();
		Reporter.writeSummary("FR1-3960_MaskingEmail_TC-02,Verify by enabling the Email Masking option, " + maskingEmailIdSteps.getResult() );
		maskingEmailIdSteps.adminMaskingVerify();
		Reporter.writeSummary("FR1-3960_MaskingEmail_TC-03,Verify the Email id in the Assign content under Manage users page, " + maskingEmailIdSteps.getResult() );
		CustomizationRolesSteps rolestep = new CustomizationRolesSteps(driver);
        rolestep.adminLogout();
        login(driver);
        maskingEmailIdSteps.userPartMailVerify();
        Reporter.writeSummary("FR1-3960_MaskingEmail_TC-04,Verify the Email id in user profile page , " + maskingEmailIdSteps.getResult() );
	}
}
