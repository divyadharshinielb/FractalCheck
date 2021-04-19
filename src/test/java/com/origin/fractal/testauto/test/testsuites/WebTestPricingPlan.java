package com.origin.fractal.testauto.test.testsuites;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import com.origin.fractal.testauto.steps.PricingPlanSteps;
import com.origin.fractal.testauto.test.FractalBaseWebTest;
import com.wv.auto.framework.BrowserFactory;
import com.wv.auto.framework.utils.Reporter;
/*
 * File: PricingPlan.java
 * Number of Test cases: 05
 * Created by: Mahesh G
 * Created on: 01-03-2021
 */
public class WebTestPricingPlan extends FractalBaseWebTest{
		@DataProvider
		public Object[][] browers() {
			return new Object[][] {
				new Object[] { "1", "chrome" }
//			, new Object[] { "2", "firefox" }
//			, new Object[] { "3", "msedge" } 
//			 new Object[] { "4", "ie11" }
			};
		}
		@Test(dataProvider = "browers", groups= {"pilot"}, enabled= true, description = "")
		public void pricingPlan(String row, String strBrowserName) {
			
			driver = BrowserFactory.getBrowser(strBrowserName);
			PricingPlanSteps pricingPlanSteps = new PricingPlanSteps(driver);
			pricingPlanSteps.pricingPlanePageLaunch();
			Reporter.writeSummary("Verify the pricingPlanePageLaunch," +  pricingPlanSteps.getResult() );
			pricingPlanSteps.choosePlan();
			Reporter.writeSummary("Verify the choosePlan page," +  pricingPlanSteps.getResult() );
			pricingPlanSteps.checkoutPage();
			Reporter.writeSummary("Verify the check out page," +  pricingPlanSteps.getResult() );
			pricingPlanSteps.chooseBusinessPlan();
			Reporter.writeSummary("Verify the choosebusiness paln page," +  pricingPlanSteps.getResult() );
			pricingPlanSteps.fillingBill();
			Reporter.writeSummary("Verify the deatils for filling form, " +  pricingPlanSteps.getResult() );
			
		}

}
