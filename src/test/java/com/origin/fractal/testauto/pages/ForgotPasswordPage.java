package com.origin.fractal.testauto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBasePage;

public class ForgotPasswordPage extends FractalBasePage{
	private By forgotPasswordLink  = By.xpath(".//a[contains(text(),'Forgot password?')]");
	private By txtInputEmail  = By.xpath("//input[@name='emailid']");
	private By btnSend  = By.xpath("//input[@value='SEND']");
	//private By forgotPasswordLink  = By.xpath("");
	//private By forgotPasswordLink  = By.xpath("");
	private By prelogin = By.xpath("//a[contains(text(),'LOGIN')]");
	public ForgotPasswordPage(WebDriver driver) {
		super(driver);
		pageName ="ForgotPasswordPage";
	}
	public void clickForgotPasswordLink() {
		wait(5);
		if(elementExist(prelogin)) {
			click(prelogin);
		}
		wait(5);
		String ForgotPasswordLink=getText(forgotPasswordLink);
		verifyText(ForgotPasswordLink,forgotPasswordLink);
		click(getObj(forgotPasswordLink));
		wait(5);
	}
	public void verifyForgotPasswordLabels() {
		wait(5);
		elementExist(txtInputEmail);
		wait(5);
		verifyText("SEND", btnSend);
	}
}
