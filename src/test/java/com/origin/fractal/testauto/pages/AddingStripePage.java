package com.origin.fractal.testauto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBasePage;
/* File Name: AddingStripePage.java
 * Purpose: Check for Stripe Account in admin and user part -FR1-4129
 * Number of Testcases: 4
 * Created by: Mahesh
 * Created on: 16/04/2021
 */
public class AddingStripePage extends FractalBasePage  { 
	
private By btnSettings=By.xpath("//div[@class='icon dripicons-gear']");
private By btnPayment = By.xpath("//a[@href='#payment/settings']//i[@data-icon='P']");
private By btnDropDownStripe =By.xpath("//li[contains(text(),'Stripe')]");
private By clientText=By.xpath("//input[@id='input_1']");
private By clientSecretText=By.xpath("//input[@id='input_2']");
private By btnSave =By.xpath("//button[@id='submit']");
private By selectDropDown =By.xpath("//body/div[1]/div[1]/div[2]/div[3]/div[3]/div[1]/form[1]/div[1]/div[1]/md-input-container[1]/div[1]");
private By selectDropDown2 =By.xpath("//body/div[1]/div[1]/div[2]/div[3]/div[3]/div[1]/form[1]/div[1]/div[2]/md-input-container[1]/div[1]");
private By lblProduction =By.xpath("//li[contains(text(),'Production')]");
private By iconCart = By.xpath(".//div[@class='log_cart']");
private By lblIcon = By.xpath("//span[@title='Automation']");
private By lblLogout = By.xpath("//div//a[contains(text(),'Logout')]");
private By lblGotocart = By.xpath("//button[contains(text(),'GO TO CART')]");
private By lblCheckout = By.xpath("//p[contains(text(),'CHECKOUT')]");
private By lblPrice = By.xpath("//body/div[@id='root']/div[@id='page-container']/main[@id='content-wrap']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/span[3]");
public AddingStripePage(WebDriver driver) {
	super(driver);
}
/*
	 *function:gotoStripePayment() 
	 *cause: Check for stripe payment and fields in admin part
	 */
public void gotoStripePayment() {
	wait(5);
	click(btnSettings);
	//	click(btnScroll);
	  wait(2);
//	    WebElement element = driver.findElement( By.xpath("//a[@href='#payment/settings']//i[@data-icon='P']")); Actions
//	    actions = new Actions(driver); actions.moveToElement(element);
//	    actions.perform();
	    wait(2);
	    scrollToElement(By.xpath("//a[@href='#payment/settings']//i[@data-icon='P']"));
	    wait(2);
		click(btnPayment);
		wait(2);
		click(selectDropDown);
		wait(10);
		click(btnDropDownStripe);
		wait(10);
		enterData("AYgAXxd1WKn1QKyhdpesNV2jqY5eQqIyN7f5ywO3dy4eRAoQSvXwIKajXkw6ZFlFBvaixe56TKa-RFz8",clientText);
	   wait(5);
	    enterData("EMKzG8XxRDcFb0ckn4raTWnJde9JG_LQVgzYOeFw7a2O7fLM_PoFu7cXlqZ53PsgmozsVINVPEN_UknH",clientSecretText);
		wait(5);
		scrollToElement(btnSave);
		wait(5);
	    click(btnSave);
}
/*
	 *function:validationStripeFields() 
	 *cause: Check for validation for fields in admin part
	 */
public void validationStripeFields() {
	wait(5);
	click(selectDropDown);
	wait(10);
	click(btnDropDownStripe);
	wait(5);
	click(selectDropDown2);
	wait(2);
	click(lblProduction);
	wait(2);
	click(btnSave);
}
/*
	 *function:userCheckoutPage() 
	 *cause: Check for usercheckout page  in user part
	 */
public void userCheckoutPage() {
	wait(2);
	click(iconCart);
	wait(2);
	click(lblGotocart);
	wait(2);
	click(lblCheckout);
	wait(2);
}
/*
	 *function:userCheckoutPageDetails() 
	 *cause: Check for usercheckout page details in user part
	 */
public void userCheckoutPageDetails() {
	wait(2);
	String s;
	s=getText(lblPrice);
	verifyText("300",s);
	
}
}
