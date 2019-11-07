package com.origin.fractal.testauto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBasePage;

public class ForgotPasswordPage extends FractalBasePage{
//edit by divya 
	//private By forgotPasswordLink  = By.xpath(".//div/*//form/*//div[contains(@id,'forgot_password')]");
    private By forgotPasswordLink  = By.xpath(".//a[contains(text(), 'Forgot password')] "); //div/*//form/*//div[contains(@id,'forgot_password')]
	private By txtInputEmail  = By.xpath(".//div/*//form/*//md-input-container/input");
	//edit by divya
	//	private By btnSend  = By.xpath(".//button[contains(@id,'button')]/span");
	private By btnSend  = By.xpath(".//input[contains(@type, 'submit')]"); //button[contains(@id,'button')]/span
	//private By forgotPasswordLink  = By.xpath("");
	//private By forgotPasswordLink  = By.xpath("");
	public ForgotPasswordPage(WebDriver driver) {
		super(driver);
		pageName ="ForgotPasswordPage";
	}
	public void clickForgotPasswordLink() {
		wait(5);
		String ForgotPasswordLink=getText(forgotPasswordLink);
		verifyText(ForgotPasswordLink,forgotPasswordLink);
		click(getObj(forgotPasswordLink));
		wait(5);
	}
	public void verifyForgotPasswordLabels() {
		elementExist(txtInputEmail);
		verifyText("SEND", btnSend);
	}
}
