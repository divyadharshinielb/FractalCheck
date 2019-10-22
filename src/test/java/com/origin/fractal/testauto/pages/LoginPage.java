package com.origin.fractal.testauto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBasePage;

public class LoginPage extends FractalBasePage {

	private By tbUserName = By.xpath(".//input[contains(@name,'username')]");//edit by dhanushiya
	private By tbPassword = By.xpath(".//input[contains(@name,'password')]");//edit by dhanushiya
	private By btnLogin = By.xpath(".//input[contains(@class,'w100 login_btn login')]");//edit by dhanushiya
	private By btnLogin1 = By.xpath(".//input[contains(@class,'w100 login_btn login')]");//edit by dhanushiya
	private By logoSymbol = By.xpath(".//img[contains(@class,'logo')]");
	private By rememberMe=By.xpath(".//label[contains(@class,'font-size-14')]");
	private By lblProfile = By.xpath(".//img[contains(@class,'logout-height')]");
	private By logOutButton = By.xpath(".//li[contains(text(),'Logout')]");
	/***added on 08/02/19***/
	private By registerButton = By.xpath("//a[@class='cursor-pointer text-uppercase']");
	/***here**/
	private By resigstrationPage = By.xpath(".//*[contains(text(), 'I want to register as')]");
	private By blankPassword = By.xpath(".//*[contains(text(), 'Password field should not be empty')]");
	private By blankUserName = By.xpath(".//*[contains(text(), 'Username field should not be empty')]");
	private By inValid = By.xpath(".//div[contains(text(),'User or Password are incorrect.')]");
	String[]  userName= {"", "admin@originfractal.com ","saraswathi@originlearning.com","saraswathi@originlearning.com"};
	String[]  passWord={ "","originfractal","","originfractal"};
	private By searchLink=By.xpath(".//input[contains(@id,'theInput')]");
	
	public LoginPage(WebDriver driver) {
		super(driver);
		// Go to Home Page
		String baseUrl = "https://staging-origin.originfractal.com";
		goTo(baseUrl);
		
	}
	public void doLogin() {
		wait(5);
		enterData("automation_directuser@originlearning.com",tbUserName);
		enterData("AutoDU@123",tbPassword);
		click(btnLogin1);
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
		click(btnLogin1);
		wait(10);
		click(lblProfile);
		wait(10);
		click(logOutButton);
		wait(10);
		click(rememberMe);
		wait(10);
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
		String baseUrl = "https://automation-origin.originfractal.com/admin/index.php";
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
		wait(5);
		clear(tbUserName);
	}
	public void blankUserName() {
		driver.navigate().refresh();
		wait(10);
		enterData (userName[0],tbUserName);
		wait(5);
		enterData (passWord[1],tbPassword);
		wait(5);
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
		driver.findElement(By.id("theInput")).sendKeys(Keys.ENTER);
		
	}
}
