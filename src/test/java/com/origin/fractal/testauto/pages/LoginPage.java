package com.origin.fractal.testauto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBasePage;

public class LoginPage extends FractalBasePage {

	private By tbUserName = By.xpath(".//input[@name='username']");//*[@name='uname']
	private By tbPassword = By.xpath(".//input[@name='password']");//*[@name='userpassword']
	private By btnLogin = By.xpath("//input[@type='submit']");//button[@id='login_btn']
	private By btnLogin1 = By.xpath(".//input[contains(@type,'submit')]");  //button[@id='btn']
	private By logoSymbol = By.id("logo");
	//edit by divya
	//	private By rememberMe=By.xpath(".//*[contains(text(),'Remember me')]");
	//private By lblProfile = By.xpath(".//*[@id='dLabel']/span");
	//private By logOutButton = By.xpath(".//a[@class='pointer padding-l-15']");
	private By rememberMe=By.xpath(".//label[@class='font-size-14']");
	private By lblProfile = By.xpath(".//div[contains(@class,'logout_pop')]/*//button[contains(@class,'circle-hover')]");  //*[@id='dLabel']/span
	private By logOutButton = By.xpath(".//li[contains(text(),'Logout')]"); //li[contains(@class, 'jss29 jss95 jss98 jss103 jss104 jss92 jss93 popup-text padding-t-15 removelastspan')] //a[@class='pointer padding-l-15']
	/***added on 08/02/19***/
	//edited by divya on 23rd sept 2019
	private By registerButton = By.xpath("//a[contains(@class, 'reg_btn font-size-18 reg')]");  //a[@class='cursor-pointer text-uppercase']
	/***here**/
	private By resigstrationPage = By.xpath(".//*[contains(text(), 'I want to register as')]");
	private By blankPassword = By.xpath(".//*[contains(text(), 'Password field should not be empty')]");
	private By blankUserName = By.xpath(".//*[contains(text(), 'Username field should not be empty')]");
	private By inValid = By.xpath(".//*[contains(text(),'Username/Password is incorrect')]");
	String[]  userName= {"", "admin@originfractal.com ","saraswathi@originlearning.com","saraswathi@originlearning.com"};
	String[]  passWord={ "","originfractal","","originfractal"};
	private By btnCookies = By.xpath("//button[@id='CookieAccept']");
	//edit by divya 
	// 	private By searchLink=By.xpath(".//ng-include[2]/div[1]/div[1]/div[2]/div[1]/form[1]/input[1]");

	private By searchLink = By.xpath(".//input[contains(@id, 'theInput')]"); //ng-include[2]/div[1]/div[1]/div[2]/div[1]/form[1]/input[1]
	
	public LoginPage(WebDriver driver) {
		super(driver);
		// Go to Home Page
		String baseUrl = "https://automation-origin.originfractal.com/"; //https://automation-origin.originfractal.com/#/login
		goTo(baseUrl);
		
	}
	public void doLogin() {
		enterData("automation_directuser@originlearning.com",tbUserName);
		enterData("AutoDU@123",tbPassword);
		click(btnLogin);
		wait(2);
		if(elementExist(btnCookies)) {
			click(btnCookies);
			}
		wait(5);
	}
	public void loginToInstructor() {
		enterData("automation_directuser@originlearning.com",tbUserName);//manjupriya.s@originlearning.com
	    enterData("AutoDU@123",tbPassword);//5dd53f63cb8b2
	    click(btnLogin1);
	    wait(2);
		if(elementExist(btnCookies)) {
		click(btnCookies);
		}
	    wait(5);
	    click(By.xpath("//div[@class='ci-hover']//button[@class='jss29 jss3 jss5 jss8 circle-hover']"));
	    wait(5);
	    click(By.xpath("//button[@class='role-button']"));
	}
	public void loginToContentAdmin() {
		enterData("contentadmin@origin.com",tbUserName);
	    enterData("P@ssw0rd",tbPassword);
	    click(btnLogin1);
	    wait(5);
	}
	public void doLogin1() {
		enterData("automation_directuser@originlearning.com",tbUserName);
		enterData("AutoDU@123",tbPassword);
		click(btnLogin1);
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
		enterData("AutoDU@123",tbPassword);
		wait(10);
		click(rememberMe);
		wait(10);
		click(btnLogin);
		wait(10);
		click(lblProfile);
		wait(10);
		click(logOutButton);
		wait(5);
		click(rememberMe);
		wait(5);
		//edit by divya
		// click(btnLogin);
		click(btnLogin);
		wait(10);
		click(lblProfile);
		wait(10);
		click(logOutButton);
		wait(10);
		click(btnLogin);	
		elementExist(blankPassword);
		}
	//Starts - Added by Mahesh on Feb_06_19
		public void verifypasswordField() {	
			String readPass = getAttributeValuePassword(tbPassword);
			verifyText("",readPass);
		}
		//Starts - Added by Mahesh on Feb_06_19

	public void registerFunction() {
		String baseUrl = "https://origin.originfractal.com/";
		goTo(baseUrl);
		wait(10);
		click(registerButton);
		elementExist(resigstrationPage);
	}
	
	public void blankPasswordVerification() {
		enterData (userName[1],tbUserName);
		enterData (passWord[0],tbPassword);
		click(btnLogin1);
		wait(5);
		elementExist(blankPassword);
		
	}
	public void blankUserName() {
		enterData (userName[0],tbUserName);
		enterData (passWord[1],tbPassword);
		click(btnLogin1);
		wait(5);
		elementExist(blankUserName);
	}
	public void mandatoryField() {
		enterData (userName[0],tbUserName);
		enterData (passWord[0],tbPassword);
		click(btnLogin1);
		wait(5);
		elementExist(blankUserName);
	}
	public void inValid() {
		enterData (userName[2],tbUserName);
		enterData (passWord[2],tbPassword);
		click(btnLogin1);
		wait(5);
		elementExist(inValid);
		}

	public void inValidPassword() {
		enterData("automation_directuser@originlearning.com",tbUserName);
		enterData("Origin",tbPassword);
		click(btnLogin1);
		wait(5);
		elementExist(inValid);
		
	}
	public void verifySearchLink() {
		enterData ("abcdef",searchLink);
	}
	private By googleButton = By.xpath("//div[@class='login-with-google']");
	private By facebookButton = By.xpath("//div[@class='login-with-facebook']");
	
	public void googleBtn() {
	wait(2);
	elementExist(googleButton);
	wait(5);
	click(googleButton);
	
	}
	public void facebookButton() {
		wait(5);
		elementExist(facebookButton);
		wait(5);
		click(facebookButton);
		}
}
