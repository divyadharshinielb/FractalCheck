package com.origin.fractal.testauto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import com.origin.fractal.testauto.FractalBasePage;
/* File Name: AdaptIntegrationPage.java
 * Purpose: Check for adapt icon in admin side 
 * Number of Test cases: 1
 * Created by: DivyaDharshini
 * Created on: 30-sept-2020
 */

public class AdaptIntegrationPage extends FractalBasePage {
	public By adaptIcon = By.xpath("//span[contains(text(),'Create Content')]");
	public By launchbtn = By.xpath("//button[@id='modalBtn']");
	private By btnMenu = By.xpath("//ng-include[@id='header1']/*//div[contains(@title,'Menu')]");
	public By continueBtn = By.xpath("//button[contains(@class,'cc-continue_btn ')]");
	public By closeBtn = By.xpath("//div[contains(@ng-click,'closeAdaptModal()')]");
	public AdaptIntegrationPage(WebDriver driver) {
		super(driver);

	}
	/*
	 *function: iconVerification()
	 * cause: Check for create content(adapticon) in admin side
	 */
	public void iconVerification() {
		wait(5);
		click(btnMenu);
		wait(5);
		click(adaptIcon);
		wait(2);
		elementExist(launchbtn);
		isClickable(launchbtn);
		verifyText("LAUNCH",launchbtn);
		click(launchbtn);
		wait(3);
		elementExist(continueBtn);
		isClickable(continueBtn);
		click(closeBtn);
		wait(3);
	}


}
