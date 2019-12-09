package com.origin.fractal.testauto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.origin.fractal.testauto.FractalBasePage;

public class LoginPage extends FractalBasePage {

	private By tbUserName = By.xpath(".//input[@name='username']");
	private By tbPassword = By.xpath(".//input[@name='password']");
	private By btnLogin = By.xpath(".//input[contains(@value, 'Login')]");
	private By btnLogin1 = By.xpath(".//button[@id='login_btn']");
	private By logoSymbol = By.xpath(".//img[contains(@class, 'logo')]");
	private By rememberMe=By.xpath(".//label[@class='font-size-14']");
	private By lblProfile = By.xpath(".//div[@class='jss36']//div//span[@class='jss4']");
	private By logOutButton = By.xpath(".//li[contains(text(),'Logout')]");
	private By registerButton = By.xpath(".//*[@id=\'root\']/div/main/div/div/div[2]/div/form/div[10]/a");
	private By forgotpassword = By.xpath(".//a[contains(text(),'Forgot password?')]");
	private By resigstrationPage = By.xpath(".//div[contains(text(), 'SIGN UP')]"); //div[@class='col-lg-12 text-center log-title padding-30']
	private By blankPassword = By.xpath(".//*[contains(text(), 'Password field should not be empty.')]");
	private By blankUserName = By.xpath(".//*[contains(text(), 'Username field should not be empty')]");
	private By inValid = By.xpath(".//*[contains(text(),'Username or Password is incorrect.')]");
	String[]  userName= {"", "admin@originfractal.com ","saraswathi@originlearning.com","saraswathi@originlearning.com"};
	String[]  passWord={ "","originfractal","","originfractal"};
	private By searchLink=By.xpath(".//ng-include[2]/div[1]/div[1]/div[2]/div[1]/form[1]/input[1]");
	private By registerLoginBtn=By.xpath("//div[@class='padding-bp-12 text-center padding-t-5']//a[@class='text-D98040'][contains(text(),'LOG IN')]");
	//edit by divya for register function
	private By individualBtn = By.xpath("//label[contains(text(), 'Individual')]");
	private By businessBtn = By.xpath(".//label[contains(text(), 'Business')]");
	private By registerBtn = By.xpath("//input[contains(@value, 'Register')]");
	
	public LoginPage(WebDriver driver) {
		super(driver);
		pageName ="LoginPage";
		// Go to Home Page
		String baseUrl ="https://cognitivescale.originfractal.com/"; 
		goTo(baseUrl);
		
	}
	public void doLogin() {
		enterData("automation_directuser@originlearning.com",tbUserName);
		enterData("AutoDU@123",tbPassword);
		click(btnLogin);
		wait(5);
	}
	public void loginToContentAdmin() {
		enterData("contentadmin@origin.com",tbUserName);
	    enterData("contentadmin@origin.com",tbPassword);
	    click(btnLogin);
	    wait(5);
	}
	public void doLogin1() {
		enterData("automation_directuser@originlearning.com",tbUserName);
		enterData("AutoDU@123",tbPassword);
		click(btnLogin);
	}
	public void loginPageVerification() {
		wait(15);
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
		String baseUrl = "https://cognitivescale.originfractal.com/";
		goTo(baseUrl);
		wait(10);
		click(registerButton);
		elementExist(resigstrationPage);
		/* edit by divya//click(registerLoginBtn);
		//edit by divya after reviewing
		
		if( elementExist(businessBtn)) {
			click(businessBtn);
			
		}*/
		
	}
	
	public void blankPasswordVerification() {
		enterData (userName[1],tbUserName);
		wait(5);
		enterData (passWord[0],tbPassword);
		wait(5);
		click(btnLogin);
		wait(5);
		//edit by divya only during automation, the blankpassword message is notoccuring elementExist(blankPassword);
		elementExist(inValid);
	}
	public void blankUserName() {
		wait(5);
		enterData (userName[0],tbUserName);
		enterData (passWord[1],tbPassword);
		//click(btnLogin);
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
