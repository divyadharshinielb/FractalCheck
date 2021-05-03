package com.origin.fractal.testauto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBasePage;

public class ForgotPasswordPage extends FractalBasePage{
	private By forgotPasswordLink  = By.xpath("//a[contains(text(),'Forgot password?')]");//div/*//form/*//div[contains(@id,'forgot_password')]
	private By txtInputEmail  = By.xpath(".//div/*//form/*//md-input-container/input");
	private By btnSend  = By.xpath("//input[@value='SEND']");//button[contains(@id,'button')]/span
	//private By forgotPasswordLink  = By.xpath("");
	//private By forgotPasswordLink  = By.xpath("");
	public By preloginBtn = By.xpath("//a[contains(text(),'LOGIN')]");
	public ForgotPasswordPage(WebDriver driver) {
		super(driver);
		pageName ="ForgotPasswordPage";
	}
	public void clickForgotPasswordLink() {
		wait(5);
		click(preloginBtn);
		wait(15);
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
