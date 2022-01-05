package com.origin.fractal.testauto.test.testsuites;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.origin.fractal.testauto.DataManager;
import com.origin.fractal.testauto.steps.AzureADSteps;
import com.origin.fractal.testauto.steps.CustomizationRolesSteps;
import com.origin.fractal.testauto.steps.MaskingEmailIdSteps;
import com.origin.fractal.testauto.steps.MenuSteps;
import com.origin.fractal.testauto.test.FractalBaseWebTest;
import com.wv.auto.framework.BrowserFactory;
import com.wv.auto.framework.utils.Reporter;
/* File Name: WebTestAzureAD.java
 * Purpose: Check for AzureAD -FR1-5236
 * Number of Testcases: 2
 * Created by: Mahesh
 * Created on: 30-12-2021
 */
public class WebTestAzureAD  extends FractalBaseWebTest {
	@Test(dataProviderClass=DataManager.class, dataProvider = "browers", groups = { "pilot" }, enabled = true,priority=0)
	public void AzureAD(String row, String strBrowserName) throws InterruptedException, IOException {
		driver = BrowserFactory.getBrowser(strBrowserName);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		loginToContentAdmin(driver);
		MenuSteps menuSteps = new MenuSteps(driver);
		MaskingEmailIdSteps maskingEmailIdSteps = new MaskingEmailIdSteps(driver);
		menuSteps.clickMenu();
		maskingEmailIdSteps.gotoWhiteLabel();
		AzureADSteps azureADSteps = new AzureADSteps(driver);
		azureADSteps.enableSSO();
		Reporter.writeSummary("FR1-5236_Azure_AD_integration_01,verify Admin will be able to view SSO Login enabling button.," +azureADSteps.getResult() );
		CustomizationRolesSteps rolestep = new CustomizationRolesSteps(driver);
		rolestep.adminLogout();
		azureADSteps.verifySSOBtn();
		Reporter.writeSummary("FR1-5236_Azure_AD_integration_02,verify Admin will be able to view SSO Login icon in login page.," +azureADSteps.getResult() );
}
}
