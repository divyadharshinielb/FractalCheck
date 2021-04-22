package com.origin.fractal.testauto.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.origin.fractal.testauto.FractalBasePage;

public class PricingPlanPage extends FractalBasePage{
	private By lblPlanText= By.xpath("//p[contains(text(),'Choose a plan that’s right for you')]");
	private By switchTrainer= By.xpath("//a[@id='trainer']");
	private By switchBusiness= By.xpath("//a[@id='business']");
	private By btnTry= By.xpath("//body/main/article/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/ul[1]/li[1]/a[2]");
	private By btnTermsCondtions= By.xpath("//body/main/article/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/ul[1]/li[1]/div[1]/p[1]/a[2]");
	private By closeBtn= By.xpath("//button[contains(text(),'×')]");
	private By lblBillingDetails= By.xpath("//h3[contains(text(),'Billing details')]");
	private By lblOrderText= By.xpath("//h3[@id='order_review_heading']");
	private By subscribeBtn= By.xpath("//button[@id='place_order']");
	private By switchYearly= By.xpath("//body/main[@id='site-content']/article[@id='post-578']/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/label[1]/span");
	private By lblFirstName= By.xpath("//input[@id='billing_first_name']");
	private By lblLastName= By.xpath("//input[@id='billing_last_name']");
	private By lblCompany= By.xpath("//input[@id='billing_company']");
	private By lblAddress= By.xpath("//input[@id='billing_address_1']");
	private By lblBilling= By.xpath("//input[@id='billing_city']");
	private By lblPost= By.xpath("//input[@id='billing_postcode']");
	private By lblPhone= By.xpath("//input[@id='billing_phone']");
	private By lblEmail= By.xpath("//input[@id='billing_email']");
	
	public PricingPlanPage(WebDriver driver) {
		super(driver);
		pageName = "PricingPlanPage";
	}
	/* Method: pricingPlanePageLaunch();
	 * purpose: user able to launch the plan page
	 */
	public void pricingPlanePageLaunch() throws IOException {
		String baseUrl= "https://devecom.wpengine.com/pricing/";
		goTo(baseUrl);
		wait(10);
	}
	/* Method: choosePlan();
	 * purpose: user able to choose the plan
	 */
	public void choosePlan() {
		verifyText("Choose a plan that’s right for you",lblPlanText);
		wait(2);
		click(switchBusiness);
		wait(2);
		click(switchTrainer);
		wait(2);
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(btnTermsCondtions); 
		js.executeScript("arguments[0].scrollIntoView();",element );
		wait(2);
		click(btnTermsCondtions);
		wait(2);
		click(closeBtn);
		wait(2);
		click(btnTry);
		wait(5);
	}
	/* Method: checkoutPage();
	 * purpose: user able to check the lables for check out page
	 */
	public void checkoutPage() {
		verifyText("Billing details",lblBillingDetails);
		wait(5);
		verifyText("Your order",lblOrderText);
		wait(5);
		verifyText("SUBSCRIBE",subscribeBtn);
        wait(5);	
	}
	/*Method: chooseBusinessPlan();
	 * purpose: user able to choose the busines plan
	 */
	public void chooseBusinessPlan() throws IOException {
		pricingPlanePageLaunch();
		wait(2);
		click(switchBusiness);
		wait(2);
		click(switchYearly);
		wait(5);
	}
	/* Method: fillingBill();
	 * purpose: user able to fill the details for subscription page
	 */
	public void fillingBill() {
		wait(2);
		click(switchBusiness);
		wait(2);
		click(switchTrainer);
		wait(2);
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(btnTermsCondtions); 
		js.executeScript("arguments[0].scrollIntoView();",element );
		wait(2);
		click(btnTry);
		wait(5);
		enterData("Automation",lblFirstName);
		wait(2);
		enterData("Directuser",lblLastName);
		wait(2);
		enterData("Origin",lblCompany);
		wait(2);
		enterData("RR3,chennai",lblAddress);
		wait(2);
		enterData("floor4",lblBilling);
		wait(2);
		enterData("560089",lblPost);
		wait(2);
		enterData("9876543210",lblPhone);
		wait(2);
		enterData("automation_directuser@originlearning.com",lblEmail);
		wait(2);
		
	}
	}
