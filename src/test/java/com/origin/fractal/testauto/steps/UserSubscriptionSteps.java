package com.origin.fractal.testauto.steps;

import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBaseStep;
import com.origin.fractal.testauto.pages.UserSubscriptionPage;
/* File name: UserSubscriptiongPage.java
 * Purpose: FR1-3520 User subscription - step level code
 * Developed By: Vigneshwaran R
 * created on: 12-Mar-2021
 * Updated Date: 15-Mar-2021
 */
public class UserSubscriptionSteps extends FractalBaseStep {
	UserSubscriptionPage UserSubscri = null;
	public UserSubscriptionSteps(WebDriver driver) {
		UserSubscri = new UserSubscriptionPage(driver);
	}

	/* Function Name: subscriptionStateChange();
	 * Purpose: Admin is enabling the subscription
	 */
	public void subscriptionStateChange() {
		try{UserSubscri.subscriptionStateChange();
		}catch(Exception e) {
			print("Error: Admin is NOT able to turn on/off the subscription option");
		}
	}

	/* Function Name: verifySubscripBtn();
	 * Purpose: verify the subscription button on the perlogin page
	 */
	public void verifySubscripBtn() {
		result="FAILED";
		try{UserSubscri.verifySubscripBtn();
		result="PASSED";
		}catch(Exception e) {
			result="FAILED";
			print("Error: The subscription button is NOT shown and exception happends");
		}
	}

	/* Function Name: verifySubscripTryNowBtn();
	 * Purpose: verify the subscription Try Now button 
	 */
	public void verifySubscripTryNowBtn() {
		result="FAILED";
		try{UserSubscri.verifySubscripTryNowBtn();
			result="PASSED";
		}catch(Exception e) {
			result="FAILED";
		}
	}
	
	/* Function Name: verifyCartAndWishListBtn();
	 * Purpose: verify the Cart And Wish List button
	 */
	public void verifyCartAndWishListBtn() {
		result="FAILED";
		try{UserSubscri.verifyCartAndWishListBtn();
			result="PASSED";
		}catch(Exception e) {
			result="FAILED";
		}
	}
	
	/* Function Name: verifySubscripMonthlyBtn();
	 * Purpose: verify the Monthly subscription button 
	 */
	public void verifySubscripMonthlyBtn() {
		result="FAILED";
		try{UserSubscri.verifySubscripMonthlyBtn();
			result="PASSED";
		}catch(Exception e) {
			result="FAILED";
		}
	}
	
	/* Function Name: verifySubscripYearlyBtn();
	 * Purpose: verify the Yearly subscription button 
	 */
	public void verifySubscripYearlyBtn() {
		result="FAILED";
		try{UserSubscri.verifySubscripYearlyBtn();
			result="PASSED";
		}catch(Exception e) {
			result="FAILED";
		}
	}
}
