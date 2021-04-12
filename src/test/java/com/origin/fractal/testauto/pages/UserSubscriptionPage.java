package com.origin.fractal.testauto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBasePage;
import com.origin.fractal.testauto.steps.LoginSteps;
/* File name: UserSubscriptiongPage.java
 * Purpose: FR1-3520 User subscription
 * Developed By: Vigneshwaran R
 * created on: 12-Mar-2021
 * Updated Date: 31-Mar-2021
 */
public class UserSubscriptionPage extends FractalBasePage {
	LoginSteps LoginSteps=null;
	private By btnSettings=By.xpath("//div[@class='icon dripicons-gear']");
	private By btnWhiteLabel=By.xpath("//div[@data-icon='B']");
	private By lblSubscription=By.xpath("//div[contains(text(),'Enable/Disable Subscription')]");
	private By lblSwitch=By.xpath("//div[contains(text(),'Enable/Disable Subscription')]//..//div//..//md-switch//div//div//div[@class='md-thumb md-ink-ripple']");
	private By lblSwitchState=By.xpath("//div[contains(text(),'Enable/Disable Subscription')]//..//div//..//md-switch[@aria-checked='true']");
	private By btnSave=By.xpath("(//*[text()='Save'])[1]");
	private By btnSubscrip=By.xpath("//a[text()='SUBSCRIBE']");
	private By userAccountLogo=By.xpath("//div[@class='ci-hover user-account']//button");
	private By lblSubscrip=By.xpath("//*[text()='Subscription']");
	private By btnTryNow=By.xpath("//button[normalize-space()='TRY NOW']");
	private By ctaTearmsAndCondition=By.xpath("//*[@id=\"modal-ready\"]/div[2]/ul/li[3]/div/div/a[2]");
	private By popupTearmsAndCondition=By.xpath("//*[@class='kc-row-container  kc-container']");
	private By btnCloseTearmsAndCondition=By.xpath("//*[@class='close-modal']");
	private By lblCart=By.xpath("//*[@class='log_cart']//div//div//button");
	private By lblwishList=By.xpath("//*[@class='log_wishlist']//div//div//button");
	private By btnMonthlySubscrip=By.xpath("(//*[text()='MONTHLY'])[1]");
	private By btnYearlySubscrip=By.xpath("(//*[text()='ANNUAL'])[1]");

	private boolean flag; 
	public UserSubscriptionPage(WebDriver driver) {
		super(driver);
		LoginSteps=new LoginSteps(driver);
	}

	/* Function Name: subscriptionStateChange();
	 * Purpose: Admin is enabling the subscription
	 */
	public void subscriptionStateChange() {
		wait(5);
		moveElementFocusandClick(btnSettings);
		wait(3);
		moveElementFocusandClick(btnWhiteLabel);
		wait(5);
		moveElementFocus(lblSubscription);
		wait(2);
		if(elementExist(lblSwitchState)) {
			System.out.println("Subscription is Enabled");
		}
		else {
			moveElementFocusandClick(lblSwitch);
			wait(2);
			moveElementFocusandClick(btnSave);
			wait(10);
			System.out.println("Subscription is Enabled");
		}
		LoginSteps.adminLogout();
	}

	/* Function Name: verifySubscripBtn();
	 * Purpose: verify the subscription button on the perlogin page
	 */
	public boolean verifySubscripBtn() {
		return elementExist(btnSubscrip);
	}

	/* Function Name: verifySubscripTryNowBtn();
	 * Purpose: verify the subscription Try Now button 
	 */
	public boolean verifySubscripTryNowBtn() {
		moveElementFocusandClick(userAccountLogo);
		wait(5);
		moveElementFocusandClick(lblSubscrip);
		wait(5);
		if (elementExist(btnTryNow)) {
			flag = true;
		}
		click(ctaTearmsAndCondition);
		wait(2);
		if(elementExist(popupTearmsAndCondition) && flag == true) {
			flag = true;
		}
		click(btnCloseTearmsAndCondition);
		click(btnTryNow);
		wait(10);
		return flag==true;
	}

	/* Function Name: verifyCartAndWishListBtn();
	 * Purpose: verify the Cart And Wish List button
	 */
	public boolean verifyCartAndWishListBtn() {
		wait(5);
		return isClickable(lblCart) && isClickable(lblwishList);		
	}

	/* Function Name: verifySubscripMonthlyBtn();
	 * Purpose: verify the Monthly subscription button 
	 */
	public boolean verifySubscripMonthlyBtn() {
		moveElementFocusandClick(userAccountLogo);
		wait(5);
		moveElementFocusandClick(lblSubscrip);
		wait(5);
		if (elementExist(btnMonthlySubscrip)) {
			return true;
		}
		return false;
	}


	/* Function Name: verifySubscripYearlyBtn();
	 * Purpose: verify the Yearly subscription button 
	 */
	public boolean verifySubscripYearlyBtn() {
		if (elementExist(btnYearlySubscrip)) {
			return true;

		}
		return false;
	}

}


