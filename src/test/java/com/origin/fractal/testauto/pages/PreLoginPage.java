package com.origin.fractal.testauto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.origin.fractal.testauto.FractalBasePage;
/*
 * File: PreLoginPage.java
 * Purpose: pre-login page (FR1-2994) - Step level code
 * Created by: Mahesh G
 * Updated on: 5-11-2020
 */

public class PreLoginPage extends FractalBasePage {
	private By CategoriesText = By.xpath("//div//ul//li//a[contains(text(),'CATEGORIES')]");
	private By SearchField = By.xpath("//input[@name='searchterm']");
	private By BusinessLabel = By.xpath("//div//a[contains(text(),'FOR BUSINESS')]");
	private By WishList = By.xpath("//body[1]/div[2]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]");
	private By LoginLabel = By.xpath("//a[contains(text(),'LOGIN')]");
	private By SignUpLabel = By.xpath("//a[contains(text(),'SIGN UP')]");

	private By whatsNew = By.xpath("/html[1]/body[1]/div[2]/div[1]/main[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]");
	private By lblBundles = By.xpath("//button[contains(text(),'BUNDLES')]");
	private By lblLearningPath = By.xpath("//button[contains(text(),'LEARNING PATHS')]");
	private By lblCourses = By.xpath("//button[contains(text(),'COURSES')]");
	private By lblResources = By.xpath("//button[contains(text(),'RESOURCES')]");
	private By lblPodcasts = By.xpath("//button[contains(text(),'PODCASTS')]");
	//added by divya
	private By whileLblBtn = By.xpath("//li[contains(@title,'White Labeling')]");
	private By preloginBtn = By.xpath("//span[contains(text(),'Prelogin Home page')]");
	private By bannerImgTxt = By.xpath("//div[contains(text(),'Banner Image')]");
	private By bannerTitle = By.xpath("//div[contains(text(),'Banner Image')]/../div/div/*/label/../input");
	private By descriptionBanner = By.xpath("//html/body");
	private By widgetTxt = By.xpath("//div[contains(text(),'Widgets')]");
	private By titlesTxt = By.xpath("//div[contains(text(),'Titles')]");
	private By titleTxt = By.xpath("//div[contains(text(),'Titles')]/../div/*/label");
	private By addTitleBtn = By.xpath("//button[contains(text(),'Add Title')]");
	private By featureBtn = By.xpath("//div[contains(text(),'Features')]");
	private By addFeatureBtn = By.xpath("//button[contains(text(),'Add Feature')]");
	private By testimonyLbl = By.xpath("//div[contains(text(),'Testimonials')]");
	private By testimonyBtn = By.xpath("//button[contains(text(),'Add Testimonial')]");
	private By saveBtn = By.xpath("//button[contains(text(),'Save')]");
	private By cancelBtn = By.xpath("//button[contains(text(),'Cancel')]");
	private By wishlistIcon = By.xpath("//div[contains(@class,'log_wishlist')]/div/div/button");
	private By goToWishlistBtn = By.xpath("//button[contains(text(),'GO TO WISHLIST')]");
	private By catalogItemDiv = By.xpath("//body/div[@id='root']/div[@id='page-container']/main[@id='content-login-wrap']/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/div[1]/div[2]");
	private By buyNowBtn = By.xpath("//span[contains(text(),'Buy Now')]");
	private By loginText = By.xpath("//div[contains(text(),'LOGIN')]");
	private By loginBtn = By.xpath("//input[contains(@value,'LOGIN')]");
	private By userNameLbl = By.xpath("//label[contains(text(),'Username')]");
	private By passwordLbl = By.xpath("//label[contains(text(),'Password')]");
	
	public PreLoginPage(WebDriver driver) 
	{
		super(driver);
		pageName ="PreLoginPage"; 
	}
	/* Method: LoginPageElements();
	 * purpose:verify login page elements
	 */
	public void LoginPageElements() 
	{
		wait(5);
		verifyText("CATEGORIES",CategoriesText);
		verifyText("Search",SearchField);
		verifyText("FOR BUSINESS",BusinessLabel);
		elementExist(WishList);
		verifyText("LOGIN",LoginLabel);
		verifyText("SIGN UP",SignUpLabel);
	}
	/* Method: preLoginPageFiltersVerification();
	 * purpose:verify prelogin pagefilters
	 */
	public void preLoginPageFiltersVerification()
	{
		WebElement element = driver.findElement(whatsNew); Actions
		actions = new Actions(driver); actions.moveToElement(element);
		actions.perform();
		verifyText("BUNDLES",lblBundles);
		verifyText("LEARNING PATHS",lblLearningPath);
		verifyText("COURSES",lblCourses);
		verifyText("RESOURCES",lblResources);
		verifyText("PODCASTS",lblPodcasts);
	}
	/* Method: signUpFunction();
	 * purpose:verify signup function
	 */
	public void signUpFunction() {
		wait(5);
		click(SignUpLabel);
	}
	/* Method: forBusiness();
	 * purpose:verify business user function
	 */
	public void forBusiness() {
		wait(5);
		click(BusinessLabel);
	}
	/* Method: loginFunction();
	 * purpose:verify login page function
	 */
	public void loginFunction() {
		wait(5);
		click(LoginLabel);
	}
	/* Method: clickWhiteLabel();
	 * purpose:verify login page function
	 */
	public void clickWhiteLabel() {
		wait(2);
		click(whileLblBtn);
		wait(2);
	}
	public void preloginAdmin() {
		click(preloginBtn);
		elementExist(bannerImgTxt);
		elementExist(bannerTitle);
		int size = driver.findElements(By.tagName("iframe")).size();
		print("No of frames " +size);
		driver.switchTo().frame(0);
		wait(6);
		enterData("Check",descriptionBanner);
		driver.switchTo().defaultContent();
		wait(2);
		//widgets
		scrollToElement(widgetTxt);
		elementExist(widgetTxt);
		verifyText("Widgets",widgetTxt);
		scrollToElement(titlesTxt);
		elementExist(titlesTxt);
		elementExist(titleTxt);
		verifyText("ADD TITLE",addTitleBtn);
		verifyText("Features",featureBtn);
		verifyText("ADD FEATURE",addFeatureBtn);
		verifyText("Testimonials",testimonyLbl);
		verifyText("ADD TESTIMONAL",testimonyBtn);
		elementExist(saveBtn);
		elementExist(cancelBtn);
	}
	public void wishlistFlowCheck() {
		click(wishlistIcon);
		wait(2);
		click(goToWishlistBtn);
		wait(5);
		click(catalogItemDiv);
		wait(2);
		click(buyNowBtn);
		wait(7);
		elementExist(loginText);
		elementExist(loginBtn);
		elementExist(userNameLbl);
		elementExist(passwordLbl);
	}
}
