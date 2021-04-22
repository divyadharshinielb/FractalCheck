package com.origin.fractal.testauto.steps;

import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBaseStep;
import com.origin.fractal.testauto.pages.MyLearningPage;
import com.origin.fractal.testauto.pages.PricingPlanPage;

public class PricingPlanSteps extends FractalBaseStep{
	private PricingPlanPage page;
	public PricingPlanSteps(WebDriver driver) {
		page = new PricingPlanPage(driver);
		fBPage = page;
	}
	/* Method: pricingPlanePageLaunch();
	 * purpose: user able to launch the plan page
	 */
	public void pricingPlanePageLaunch() {
		result ="PASSED";
		   try {
			   page.pricingPlanePageLaunch();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	/* Method: choosePlan();
	 * purpose: user able to choose the plan
	 */
	public void choosePlan() {
		result ="PASSED";
		   try {
			   page.choosePlan();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	/* Method: checkoutPage();
	 * purpose: user able to check the lables for check out page
	 */
	public void checkoutPage() {
		result ="PASSED";
		   try {
			   page.checkoutPage();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	/* Method: chooseBusinessPlan();
	 * purpose: user able to choose the busines plan
	 */
	public void chooseBusinessPlan() {
		result ="PASSED";
		   try {
			   page.chooseBusinessPlan();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	/* Method: fillingBill();
	 * purpose: user able to fill the details for subscription page
	 */
	public void fillingBill() {
		result ="PASSED";
		   try {
			   page.fillingBill();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	
 }
	

