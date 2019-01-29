package com.origin.fractal.testauto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBasePage;

public class LoginPage extends FractalBasePage {

	private By tbUserName = By.xpath(".//*[@name='uname']");
	private By tbPassword = By.xpath(".//*[@name='userpassword']");
	private By btnLogin = By.xpath(".//*[@id='btn']");
	private By btnLogin1 = By.xpath(".//button[@id='login_btn']");
	private By logoSymbol = By.id("logo");
	private By rememberMe=By.xpath(".//*[contains(text(),'Remember me')]");
	private By lblProfile = By.xpath(".//*[@id='dLabel']/span");
	private By logOutButton = By.xpath(".//a[@class='pointer padding-l-15']");
	private By registerButton = By.xpath(".//a[@class='cursor-pointer']");
	private By resigstrationPage = By.xpath(".//*[contains(text(), 'I want to register as')]");
	private By blankPassword = By.xpath(".//*[contains(text(), 'Password field should not be empty')]");
	private By blankUserName = By.xpath(".//*[contains(text(), 'Username field should not be empty')]");
	private By inValid = By.xpath(".//*[contains(text(),'Username/Password is incorrect')]");
	String[]  userName= {"", "admin@originfractal.com ","saraswathi@originlearning.com","saraswathi@originlearning.com"};
	String[]  passWord={ "","originfractal","","originfractal"};
	
	public LoginPage(WebDriver driver) {
		super(driver);
		// Go to Home Page
		String baseUrl = "https://automation-origin.originfractal.com";
		goTo(baseUrl);
		
	}
	
	public void doLogin() {
		enterData("automation_directuser@originlearning.com",tbUserName);
		enterData("P@ssw0rd1",tbPassword);
		click(btnLogin);
		wait(5);
	}
	public void doLogin1() {
		enterData("automation_directuser@originlearning.com",tbUserName);
		enterData("Origin@123",tbPassword);
		click(btnLogin);
	}
	public void loginPageVerification() {
		wait(5);
		elementExist(logoSymbol);
		elementExist(btnLogin);
		elementExist(tbPassword);
		elementExist(tbUserName);
		elementExist(rememberMe);
	}
	public void rememberMe() {
		enterData("automation_directuser@originlearning.com",tbUserName);
		enterData("Origin@123",tbPassword);
		click(rememberMe);
		click(btnLogin);
		click(lblProfile);
		click(logOutButton);
		wait(5);
		click(rememberMe);
		wait(5);
		click(btnLogin1);
		click(lblProfile);
		click(logOutButton);
		click(btnLogin1);	
		elementExist(blankPassword);
		}

	public void registerFunction() {
		String baseUrl = "https://automation-origin.originfractal.com";
		goTo(baseUrl);
		click(registerButton);
		elementExist(resigstrationPage);
	}
	
	public void blankPasswordVerification() {
		enterData (userName[1],tbUserName);
		enterData (passWord[0],tbPassword);
		click(btnLogin);
		wait(5);
		elementExist(blankPassword);
		
	}
	public void blankUserName() {
		enterData (userName[0],tbUserName);
		enterData (passWord[1],tbPassword);
		click(btnLogin);
		wait(5);
		elementExist(blankUserName);
	}
	public void inValid() {
		enterData (userName[2],tbUserName);
		enterData (passWord[2],tbPassword);
		click(btnLogin);
		wait(5);
		elementExist(inValid);
		}

	public void inValidPassword() {
		enterData("automation_directuser@originlearning.com",tbUserName);
		enterData("Origin",tbPassword);
		click(btnLogin);
		wait(5);
		elementExist(inValid);
		
	}
}
