package com.origin.fractal.testauto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.origin.fractal.testauto.FractalBasePage;
/*
 * File: AzureADPage.java
 * Purpose: Azure page (FR1-5236) - Step level code
 * Created by: Mahesh G
 * Updated on: 30-12-2021
 */
public class AzureADPage extends FractalBasePage  { 
private By lblSocialLogin = By.xpath("//div[contains(text(),'Enable/Disable Subscription')]");
private By lblSSOSwitch= By.xpath("//body/div[1]/div[1]/div[2]/div[3]/div[3]/div[1]/div[2]/div[1]/div[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[1]/div[1]/ng-include[1]/form[1]/div[1]/div[11]/div[1]/div[1]/span[3]/div[2]/div[1]/md-switch[1]/div[1]/div[2]/div[1]");
private By lblPrivacy= By.xpath("//a[contains(text(),'Privacy')]");	
private By btnSave= By.xpath("//body/div[1]/div[1]/div[2]/div[3]/div[3]/div[1]/div[2]/div[1]/div[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[1]/div[1]/ng-include[1]/form[1]/div[1]/div[22]/div[2]/button[1]");
private By ssoBtn= By.xpath("//button[@id='sso_button_color']");
public AzureADPage(WebDriver driver) {
		super(driver);
	}
/* Method: enableSSO();
 * purpose:verify enableSSO page
 */
	public void enableSSO() throws InterruptedException {
		WebElement element = driver.findElement(lblSocialLogin); 
		Actions actions = new Actions(driver); 
		actions.moveToElement(element);
		actions.perform();
		waitE(lblSocialLogin,15);
		click(lblSSOSwitch);
		WebElement element1 = driver.findElement(lblPrivacy); 
		Actions actions1 = new Actions(driver); 
		actions1.moveToElement(element1);
		actions1.perform();
		waitE(lblPrivacy,15);
		click(btnSave);
	}
	/* Method: verifySSOBtn();
	 * purpose:verify SSOBtn
	 */
	public void verifySSOBtn() throws InterruptedException {
		wait(6);
		if(elementExist(ssoBtn)) {
			click(ssoBtn);
			waitE(ssoBtn,15);
		}
		else {
			print("SSO button is in disbale mode");
			
		}
	}
	
}
