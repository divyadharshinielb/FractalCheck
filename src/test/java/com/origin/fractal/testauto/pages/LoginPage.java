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
	private By registerButton = By.xpath("//a[@href='/register']");//a[@class='cursor-pointer text-uppercase']
	/***here**/
	private By resigstrationPage = By.xpath(".//*[contains(text(), 'I want to register as')]");
	private By blankPassword = By.xpath(".//*[contains(text(), 'Password field should not be empty')]");
	private By blankUserName = By.xpath(".//*[contains(text(), 'Username field should not be empty')]");
	private By inValid = By.xpath(".//div[contains(text(),'User or Password are incorrect.')]");
	String[]  userName= {"", "admin@originfractal.com ","saraswathi@originlearning.com","saraswathi@originlearning.com"};
	String[]  passWord={ "","originfractal","","originfractal"};
	private By searchLink=By.xpath(".//input[contains(@id,'theInput')]");
	private By btnCookies = By.xpath("//button[@id='CookieAccept']");
	//ADDED by vignesh(wvi) on 8/Apr/20

	public By qaLoginBtn = By.xpath("//input[@type='submit']");
	//Ends

	//Added by vignesh on 16-Nov-20
	private By userAccountLogo=By.xpath("(//*[@class='logout_pop']//div)[1]");//Updated on 25-Nov-20
	private By userLogout=By.xpath("//*[@role='menu']//li[text()='Logout']");//Updated on 4-Nov-20
	private By adminAccountLogo =By.xpath("//*[@class='loggeduserbg ng-binding']"); 
	private By adminLogout =By.xpath("//*[contains(@class, 'Logout-wrapper')]//*[contains(text(),'Logout')]");
	//Ends
	private By prelogin = By.xpath("//a[contains(text(),'LOGIN')]");
	public LoginPage(WebDriver driver) {
		super(driver);
		// Go to Home Page
		String baseUrl = "https://staging-origin.originfractal.com/home";
		goTo(baseUrl);

	}
	public void doLogin() {
		wait(5);
		if(elementExist(prelogin)) {
			click(prelogin);
		}
		enterData("automation_directuser@originlearning.com",tbUserName);
		enterData("AutoDU@123",tbPassword);
		click(btnLogin1);
		wait(5);
	}
	public void loginToInstructor() {
		wait(5);
		if(elementExist(prelogin)) {
			click(prelogin);
		}
		enterData("automation_directuser@originlearning.com",tbUserName);//manjupriya.s@originlearning.com
		enterData("AutoDU@123",tbPassword);//5dd53f63cb8b2
		click(btnLogin1);
		wait(2);
//		if(elementExist(btnCookies)) {
//			click(btnCookies);
//		}
		wait(5);
		click(By.xpath("//img[contains(@class,'logout-height')]"));//img[@class='logout-height']
		wait(5);
		click(By.xpath("//button[contains(text(),'Instructor')]"));//button[@class='role-button']
	}
	public void loginToContentAdmin() {
		wait(5);
		if(elementExist(prelogin)) {
			click(prelogin);
			}
		enterData("contentadmin@origin.com",tbUserName);
		enterData("P@ssw0rd",tbPassword);
		click(btnLogin1);
		wait(5);
	}
	public void doLogin1() {
		wait(5);
		if(elementExist(prelogin)) {
			click(prelogin);
		}
		enterData("automation_directuser@originlearning.com",tbUserName);
		enterData("AutoDU@123",tbPassword);
		click(btnLogin1);
	}
	//Added by vignesh on 5-Nov-20 & updated on 23-Nov-20
	public void doLoginUser() {
		wait(5);
		if(elementExist(prelogin)) {
			click(prelogin);
		}
		enterData("wintestersbassvikianu01@gmail.com",tbUserName);
		enterData("Welcome@123&",tbPassword);
		click(btnLogin1);
		wait(3);
	}
	//Ends
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
		wait(5);
		if(elementExist(prelogin)) {
			click(prelogin);
		}
		String readPass = getAttributeValuePassword(tbPassword);
		verifyText("",readPass);
	}
	//Starts - Added by Mahesh on Feb_06_19

	public void registerFunction() {
		String baseUrl = "https://automation-origin.originfractal.com";
		goTo(baseUrl);
		wait(10);
		if(elementExist(btnCookies)) {
			click(btnCookies);
		}
		wait(5);
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
		wait(5);
		if(elementExist(prelogin)) {
			click(prelogin);
		}
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
	private By googleButton = By.xpath("//div[@class='login-with-google']");
	private By facebookButton = By.xpath("//div[@class='login-with-facebook']");

	public void googleBtn() {
		wait(5);
		if(elementExist(prelogin)) {
			click(prelogin);
		}
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
	//Added by vignesh(WVI) on 8-April-20
	public void siteAdminLoginwithcookies() {
		if(elementExist(btnCookies)) {
			click(btnCookies);
		}
		siteAdminLogin();
	}
	//Updated by vignesh on 19/June/20
	public void siteAdminLogin() {
		//Added on 23-Nov-20
//		wait(5);
//		if(elementExist(prelogin)) {
//			click(prelogin);
//		}
		wait(5);//Updated on 9-Dec-20
		goTo("https://staging-origin.originfractal.com/login");
		wait(10); //Updated on 9-Dec-20
		enterData("siteadmin@origin.com",tbUserName);
		enterData("P@ssw0rd",tbPassword);
		wait(3);
		click(qaLoginBtn);	
		wait(10);//Updated on 9-Dec-20
	}
	public void loginInstructorwithCookies(String instUserID,String instPassword){
		wait(5);
//		if(elementExist(prelogin)) {
//			click(prelogin);
//		}
		wait(5);//Updated on 9-Dec-20
		goTo("https://staging-origin.originfractal.com/login");
		wait(5);//Updated on 9-Dec-20
		if(elementExist(btnCookies)) {
			click(btnCookies);
		}
		loginInstructor(instUserID,instPassword);
	} 
	public void loginInstructor(String instUserID,String instPassword){
		wait(5);
//		if(elementExist(prelogin)) {
//			click(prelogin);
//		}
		wait(5);//Updated on 9-Dec-20
		goTo("https://staging-origin.originfractal.com/login");
		wait(10);//Updated on 9-Dec-20
		enterData(instUserID,tbUserName);
		wait(3);
		enterData(instPassword,tbPassword);
		wait(3);
		click(btnLogin);
		wait(10);
	} 
	//Ends
	//Added by vignesh on 16-Nov-20
	/* Function name: logOutUser()
	 * Action: User logout
	 * Return Type: void
	 */
	public void logOutUser(){
		wait(5);
		moveElementFocusandClick(userAccountLogo);
		wait(3);
		moveElementFocusandClick(userLogout);
		wait(5);
	} 

	/* Function name: adminLogout()
	 * Action: Do Log out admin page
	 * Return Type: void
	 */
	public void adminLogout() {
		wait(5);
		moveElementFocusandClick(adminAccountLogo);
		wait(3);
		moveElementFocusandClick(adminLogout);
		wait(5);
	}

	//Ends
}
