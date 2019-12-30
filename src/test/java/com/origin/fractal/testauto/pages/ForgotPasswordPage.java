package com.origin.fractal.testauto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBasePage;

public class ForgotPasswordPage extends FractalBasePage{
	private By forgotPasswordLink  = By.xpath(".//a[contains(text(), 'Forgot password')]");
	private By txtInputEmail  = By.xpath(".//div/*//form/*//md-input-container/input");
	private By btnSend  = By.xpath(".//input[contains(@type, 'submit')]");
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
