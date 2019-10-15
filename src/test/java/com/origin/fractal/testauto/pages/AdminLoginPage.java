package com.origin.fractal.testauto.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBasePage;
import com.origin.fractal.testauto.FractalUtils;

public class AdminLoginPage extends FractalBasePage {
	private By tbUserNameNewUI = By.xpath("//input[@name='username']");
	private By tbPasswordNewUI = By.xpath("//input[@name='password']");
	private By btnLoginNewUI = By.xpath("//input[@value='Login']");
	private By tbUserName = By.xpath(".//input[@id='uname']");//*[@name='uname']
	private By tbPassword = By.xpath(".//*[@name='userpassword']");//*[@name='userpassword']
	private By btnLogin = By.xpath(".//*[@id='login_btn']");//*[@id='login_btn']
	private By btnLogin1 = By.xpath(".//button[@id='btn']");
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
	String[]  passWord= {"","originfractal","","originfractal"};
	private By searchLink=By.xpath(".//ng-include[2]/div[1]/div[1]/div[2]/div[1]/form[1]/input[1]");
	public AdminLoginPage(WebDriver driver) throws IOException {
		super(driver);
		pageName ="LoginPage"; 
		// Go to Home Page
//*******************************added by mahesh 08/04/2019****************************//	
	//	String baseUrl=getGobal("webtesturl");
		String baseUrl = "https://staging-origin.originfractal.com/admin/index.php#/login"; //https://dev-huron.originfractal.com;
		goTo(baseUrl);
		
	}
	public void doLogin() throws IOException {
		enterData(getGobal("user"),tbUserName);
		enterData(getGobal("password"),tbPassword);
		click(btnLogin);
		wait(5);
	}
	public void doLoginNewUI() {
		enterData("automation_directuser@originlearning.com",tbUserNameNewUI);
		enterData("AutoDU@123",tbPasswordNewUI);
		click(btnLoginNewUI);
		wait(5);
	}
	public void loginToContentAdmin() throws IOException{
		enterData("contentadmin@origin.com",tbUserName);
	    enterData("P@ssw0rd",tbPassword);
	    click(btnLogin1);
	    wait(5);
	}
	public void doLogin1() throws IOException {
		enterData(getGobal("user"),tbUserName);
		enterData(getGobal("password"),tbPassword);
		click(btnLogin);
	}
	//**************************************here*********************************************//
	public void loginPageVerification() {
		wait(5);
		elementExist(logoSymbol);
		elementExist(btnLogin);
		elementExist(tbPassword);
		elementExist(tbUserName);
		elementExist(rememberMe);
	}
	public void rememberMe() throws IOException {
		enterData(getGobal("user"),tbUserName);
		enterData(getGobal("password"),tbPassword);
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
	//Starts - Added by Mahesh on Feb_06_19
		public void verifypasswordField() {
			String password =getLabel("enteredPassword");
			enterData(password, tbPassword);		
			String readPass = getAttributeValuePassword(tbPassword);
			verifyText(password,readPass);
		}
		//Starts - Added by Mahesh on Feb_06_19

	public void registerFunction() throws IOException {
		String baseUrl= getGobal("webtesturl");
		goTo(baseUrl);
		wait(10);
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
	public void verifySearchLink() {
		enterData ("abcdef",searchLink);
	}
}
