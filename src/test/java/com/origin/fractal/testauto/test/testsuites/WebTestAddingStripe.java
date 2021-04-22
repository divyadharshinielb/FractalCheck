package com.origin.fractal.testauto.test.testsuites;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.origin.fractal.testauto.steps.AddingStripeSteps;
import com.origin.fractal.testauto.steps.CustomizationRolesSteps;
import com.origin.fractal.testauto.steps.MenuSteps;
import com.origin.fractal.testauto.test.FractalBaseWebTest;
import com.wv.auto.framework.BrowserFactory;
import com.wv.auto.framework.utils.Reporter;
/* File Name: WebTestAddingStripe.java
 * Purpose: Check for Stripe Account in admin and user part -FR1-4129
 * Number of Testcases: 4
 * Created by: Mahesh
 * Created on: 16/04/2021
 */
public class WebTestAddingStripe extends FractalBaseWebTest{
		@DataProvider
		public Object[][] browers() {
			return new Object[][] {
				new Object[] { "1", "chrome" }
//			, new Object[] { "2", "firefox" }
//			, new Object[] { "3", "msedge" } 
//			 new Object[] { "4", "ie11" }
			};
		}
		
		@Test(dataProvider = "browers", groups= {"pilot"}, enabled= true, description = "TCID_009:Dynamic payment configurations should appear in the User purchase page.")

	public void WebTestAddingStripe(String row, String strBrowserName) throws IOException {
			driver = BrowserFactory.getBrowser(strBrowserName);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			loginToContentAdmin(driver);
			MenuSteps menuSteps = new MenuSteps(driver);
			AddingStripeSteps addingStripeSteps = new AddingStripeSteps(driver);
			menuSteps.clickMenu();
			js.executeScript("window.scrollBy(0,2000)");
			addingStripeSteps.gotoStripePayment();
             Reporter.writeSummary("FR1-4129_StripeAcc_TC-01,Verify navigation of Stripe Payment in Admin Setting, " +  addingStripeSteps.getResult() );
		    addingStripeSteps.validationStripeFields();
            Reporter.writeSummary("FR1-4129_StripeAcc_TC-02,Verify validation of fields in admin setting, " +  addingStripeSteps.getResult() );
		    CustomizationRolesSteps rolestep = new CustomizationRolesSteps(driver);
           rolestep.adminLogout();
			login(driver);
			addingStripeSteps.userCheckoutPage();
            Reporter.writeSummary("FR1-4129_StripeAcc_TC-03,Verify the navigation of stripe account checkout page in user part, " +  addingStripeSteps.getResult() );
			addingStripeSteps.userCheckoutPageDetails();
            Reporter.writeSummary("FR1-4129_StripeAcc_TC-04,Verify the fields in checkout page in user part, " +  addingStripeSteps.getResult() );
		
		}
		}
