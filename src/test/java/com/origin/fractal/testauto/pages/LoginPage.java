package com.origin.fractal.testauto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBasePage;

public class LoginPage extends FractalBasePage {

	private By tbUserName = By.xpath(".//input[@name='username']");//*[@name='uname']
	private By tbPassword = By.xpath(".//input[@name='password']");//*[@name='userpassword']
	private By btnLogin = By.xpath("//input[@class='w100 login_btn login']");//button[@id='login_btn']
	private By btnLogin1 = By.xpath(".//button[@id='btn']");  //button[@id='btn']
	private By logoSymbol = By.id("logo");
	//edit by divya
	//	private By rememberMe=By.xpath(".//*[contains(text(),'Remember me')]");
	//private By lblProfile = By.xpath(".//*[@id='dLabel']/span");
	//private By logOutButton = By.xpath(".//a[@class='pointer padding-l-15']");
	private By rememberMe=By.xpath(".//label[@class='font-size-14']");
	private By lblProfile = By.xpath(".//img[@class='logout-height']");  //*[@id='dLabel']/span
	private By logOutButton = By.xpath(".//li[contains(@class, 'jss29 jss95 jss98 jss103 jss104 jss92 jss93 popup-text padding-t-15 removelastspan')]");  //a[@class='pointer padding-l-15']
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
	//added by vignesh on 24/Oct/19
	private By tbUserName1 = By.xpath(".//input[@id='uname']");
	private By tbPassword1 = By.xpath(".//*[@name='userpassword']");
	//end - vignesh
			
				//Added By vignesh on 23/Oct/19
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
		click(btnCookies);
		wait(5);
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
		click(btnLogin1);
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
	
		public void reUsersidelogin()
		{
			String baseUrl = "https://automation-origin.originfractal.com/";
			goTo(baseUrl);
			wait(5);
			click(btnCookies);
			wait(2);
			enterData("automation_directuser@originlearning.com",tbUserName);
			enterData("AutoDU@123",tbPassword);
			click(btnLogin);
			wait(5);
		}
		public void reUsersidelogin1()
		{
			String baseUrl = "https://automation-origin.originfractal.com/";
			goTo(baseUrl);
			wait(5);
			enterData("automation_directuser@originlearning.com",tbUserName);
			enterData("AutoDU@123",tbPassword);
			click(btnLogin);
			wait(5);
		}
		public void reAdminsidelogin()
		{
			String baseUrl = "https://automation-origin.originfractal.com/admin";
			goTo(baseUrl);
			wait(5);
			enterData("contentadmin@origin.com",tbUserName1);
			enterData("P@ssw0rd",tbPassword1);
			click(btnLogin1);
			wait(5);
		}
		//End- vignesh
}
