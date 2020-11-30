package com.origin.fractal.testauto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBasePage;

public class LoginPage extends FractalBasePage {

	private By tbUserName = By.xpath(".//input[@name='username']");
	private By tbPassword = By.xpath(".//input[@name='password']");
	private By btnLogin = By.xpath(".//input[@class='w100 login_btn login']");
	private By btnLogin1 = By.xpath(".//button[@id='login_btn']");
	private By logoSymbol = By.id("logo");
	private By rememberMe=By.xpath(".//label[@class='font-size-14']");
	private By lblProfile = By.xpath(".//img[@class='logout-height']");
	private By logOutButton = By.xpath(".//li[contains(text(),'Logout')]");
	private By registerButton = By.xpath(".//a[@class='reg_btn font-size-18 reg']");
	private By forgotpassword = By.xpath(".//a[@class='font-size-14 fgt-btn']");
	private By resigstrationPage = By.xpath(".//div[@class='col-lg-12 text-center log-title padding-30']");
	private By blankPassword = By.xpath(".//*[contains(text(), 'Password field should not be empty')]");
	private By blankUserName = By.xpath(".//*[contains(text(), 'Username field should not be empty')]");
	private By inValid = By.xpath(".//*[contains(text(),'Username/Password is incorrect')]");
	String[]  userName= {"", "admin@originfractal.com ","saraswathi@originlearning.com","saraswathi@originlearning.com"};
	String[]  passWord={ "","originfractal","","originfractal"};
	private By searchLink=By.xpath(".//ng-include[2]/div[1]/div[1]/div[2]/div[1]/form[1]/input[1]");
	private By registerLoginBtn=By.xpath("//div[@class='padding-bp-12 text-center padding-t-5']//a[@class='text-D98040']");
	private By lblUser = By.xpath("//img[@class='logout-height']");
	private By lblAdmin = By.xpath("//span[@title='Origin']");
	private By lblAdminLogout = By.xpath("//a[@href='#'][contains(text(),'Logout')]");
	private By prelogin = By.xpath("//a[contains(text(),'LOGIN')]");
	private By lblSubscriptionPage= By.xpath("//p[@class='choose-right-plan']");
	public LoginPage(WebDriver driver) {
		super(driver);
		pageName ="LoginPage";
		// Go to Home Page
		String baseUrl ="https://staging-origin.originfractal.com"; //https://origin.originfractal.com/
		goTo(baseUrl);
		
	}
	public void doLogin() {
		wait(10);
		click(prelogin);
		wait(6);
		enterData("automation_directuser@originlearning.com",tbUserName);
		enterData("AutoDU@123",tbPassword);
		click(btnLogin);
		wait(5);
	}
	public void verifyLogin() {
		if (elementExist(lblUser)) {
		wait(5);
		click(lblUser);
	}
	else{
		wait(2);
		elementExist(lblSubscriptionPage);
	}
	}
	public void verifyAdminLogin() {
		elementExist(lblAdmin);
		wait(5);
		click(lblAdmin);
		wait(5);
		click(lblAdminLogout);
		wait(10);
	}
	public void loginToContentAdmin() {
		wait(10);
		click(prelogin);
		wait(6);
		enterData("siteadmin@origin.com",tbUserName);//contentadmin@origin.com
	    enterData("P@ssw0rd",tbPassword);//contentadmin@origin.com
	    wait(5);
	    click(btnLogin);
	    wait(10);
	}
	public void doLogin1() {
		enterData("automation_directuser@originlearning.com",tbUserName);
		enterData("AutoDU@123",tbPassword);
		click(btnLogin);
	}
	public void loginPageVerification() {
		wait(5);
		elementExist(logoSymbol);
		elementExist(btnLogin);
		elementExist(tbPassword);
		elementExist(tbUserName);
		elementExist(rememberMe);
		elementExist(forgotpassword);
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
			wait(5);
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
		//click(registerLoginBtn);
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
	public void mandatoryField() {
		enterData (userName[0],tbUserName);
		enterData (passWord[0],tbPassword);
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
	public void bothBlank() {
		enterData (userName[0],tbUserName);
		enterData (passWord[0],tbPassword);
		click(btnLogin);
		wait(5);
		elementExist(blankPassword);
	}
}
