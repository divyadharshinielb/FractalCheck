package com.origin.fractal.testauto.test.testsuites;

import java.io.IOException;

import org.testng.annotations.Test;

import com.origin.fractal.testauto.DataManager;
import com.origin.fractal.testauto.steps.UserSubscriptionSteps;
import com.origin.fractal.testauto.test.FractalBaseWebTest;
import com.wv.auto.framework.BrowserFactory;
import com.wv.auto.framework.utils.Reporter;
/* File name: WebTestUserSubscription.java
 * Purpose: FR1-3520 User subscription
 * Number of testcases: 05
 * Developed By: Vigneshwaran R
 * created on: 12-Mar-2021
 * Updated Date: 31-Mar-2021
 */
public class WebTestUserSubscription extends FractalBaseWebTest {
	@Test(dataProviderClass=DataManager.class, dataProvider = "browers", groups = { "pilot"}, enabled = true,priority=0)
	public void TestUserSubscription(String row, String strBrowserName) throws IOException {
		driver = BrowserFactory.getBrowser(strBrowserName);
		siteAdminLoginwithcookies(driver);
		UserSubscriptionSteps userSubscrip = new UserSubscriptionSteps(driver);
		userSubscrip.subscriptionStateChange();
		userSubscrip.verifySubscripBtn();
		Reporter.writeSummary("FR1-3520_UserSubscription_TC-001,Verify admin is enabling the subscription option and the subscription button is shown on prelogin page ," +userSubscrip.getResult());
		login1(driver);
		userSubscrip.verifyCartAndWishListBtn();
		Reporter.writeSummary("FR1-3520_UserSubscription_TC-002,Verify the cart and wishlist option is clickable in free subscription plan," +userSubscrip.getResult());
		userSubscrip.verifySubscripTryNowBtn();
		Reporter.writeSummary("FR1-3520_UserSubscription_TC-003,Verify the Try Now option in free-Subscription Plan and terms and condetion popup," +userSubscrip.getResult());
		userSubscrip.verifySubscripMonthlyBtn();
		Reporter.writeSummary("FR1-3520_UserSubscription_TC-004,Verify the monthly Subscription Plan and checkout page," +userSubscrip.getResult());
		userSubscrip.verifySubscripYearlyBtn();
		Reporter.writeSummary("FR1-3520_UserSubscription_TC-005,Verify the yearly Subscription Plan and checkout page," +userSubscrip.getResult());
	}

}
