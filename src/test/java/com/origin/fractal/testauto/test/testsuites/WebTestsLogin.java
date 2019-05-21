package com.origin.fractal.testauto.test.testsuites;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.origin.fractal.testauto.DataManager;
import com.origin.fractal.testauto.steps.ForgotPasswordSteps;
import com.origin.fractal.testauto.steps.HomeSteps;
import com.origin.fractal.testauto.steps.LoginSteps;
import com.origin.fractal.testauto.test.FractalBaseWebTest;
import com.wv.auto.framework.BrowserFactory;
import com.wv.auto.framework.utils.Reporter;

public class WebTestsLogin extends FractalBaseWebTest {

	@Test(dataProviderClass=DataManager.class, dataProvider = "browers", groups = { "Phase1.0" }, enabled = true, description = "Login Page")
	public void testLogin(String row, String strBrowserName) {
		
		driver = BrowserFactory.getBrowser(strBrowserName);
		LoginSteps loginSteps = new LoginSteps(driver);
		Reporter.writeSummary("TCID_024,Verify the UI of the login page, " +  loginSteps.getResult() );
		Reporter.writeSummary("TCID_028, Verify the login page with valid username and valid password., " +  loginSteps.getResult() );
		//TCID_65:Verify whether the entered password is displayed in encrypted format in the Change password field
		loginSteps.verifypasswordField();
		Reporter.writeSummary("TCID_065, Verify whether the entered password is displayed in encrypted format in the Change password field, " +  loginSteps.getResult() );
		//TCID_26:Verify the UI of the login page. User name, Password, Remember me fields and Login button are available in the login page.
		loginSteps.loginPageVerification();
		Reporter.writeSummary("TCID_026, Verify the UI of the login page. User name Password Remember me fields and Login button are available in the login page, " +  loginSteps.getResult() );
		//TCID_36:Verify the login page with valid user name and blank password
		loginSteps.blankPasswordVerification();
		Reporter.writeSummary("TCID_036, Verify the login page with valid user name and blank password, " +  loginSteps.getResult() );
		//TCID_30:Verify the login page with blank user name and valid password
		loginSteps.blankUserName();
		Reporter.writeSummary("TCID_030, Verify the login page with blank user name and valid password, " + loginSteps.getResult() );
		Reporter.writeSummary("TCID_029, Verify whether the User name and Password are mandatory fields for login screen, " + loginSteps.getResult() );
		//TCID_38:Verify the login page with invalid user name and invalid password
		loginSteps.inValid();
		Reporter.writeSummary("TCID_038, Verify the login page with invalid user name and invalid password, " +  loginSteps.getResult() );
		//TCID_72:Verify the Remember me function
		loginSteps.rememberMe();
		Reporter.writeSummary("TCID_072,  Verify the Remember me function, " +  loginSteps.getResult() );
		Reporter.writeSummary("TCID_019,  Verify the Remember me function - By checking the radio button, " +  loginSteps.getResult() );
		//TCID_74:Verification of Register link  function 
		loginSteps.registerFunction();
		Reporter.writeSummary("TCID_074, Verification of Register link  function, " +  loginSteps.getResult() );
	 }
	
	@Test(dataProviderClass=DataManager.class, dataProvider = "browers", groups = { "Phase1.0" }, enabled = false, description = "Login Page")
	public void testLoginInvalid(String row, String strBrowserName) {
		
		driver = BrowserFactory.getBrowser(strBrowserName);
		LoginSteps loginSteps = new LoginSteps(driver);
		//Verify the login page with valid user name and invalid password
		loginSteps.inValidPassword();
		Reporter.writeSummary("TCID_070, Verify the login page with valid user name and invalid password, " +  loginSteps.getResult() );
		
	}
	/***added here**/
	@Test(dataProviderClass=DataManager.class, dataProvider = "browers", groups = { "Phase1.0" }, enabled = false, description = "Login Page")
	public void testLoginSearchLink(String row, String strBrowserName) {
		
		driver = BrowserFactory.getBrowser(strBrowserName);
		LoginSteps loginSteps = new LoginSteps(driver);
		login(driver);
		loginSteps.verifySearchLink();
		Reporter.writeSummary("TCID_075, Verify the function of  Search link , " +  loginSteps.getResult() );
	}
	//Added by Manju Priya A on Jan_21_19
	@Test(dataProviderClass=DataManager.class, dataProvider = "browers", groups = { "Phase1.0" }, enabled = false, description = "TCID_71: verification of Forgot Password Page"
			+ "TCID_73: Verification of Forgot Password function")
	public void forgotPassword(String row, String strBrowserName) {
			driver = BrowserFactory.getBrowser(strBrowserName);
			/****added from here***30/1**/
			LoginSteps loginSteps = new LoginSteps(driver);
			login(driver);
			HomeSteps homeSteps = new HomeSteps(driver);
			ForgotPasswordSteps fpassSteps = new ForgotPasswordSteps(driver);
			homeSteps.clickLogout();
			/****/
		fpassSteps.clickForgotPasswordLink();
		Reporter.writeSummary("TCID_071, verification of Forgot Password Page, " +  fpassSteps.getResult() );
		//TCID_73: Verification of Forgot Password function
		fpassSteps.verifyForgotPasswordLabels();
		Reporter.writeSummary("TCID_073, Verification of Forgot Password function, " +  fpassSteps.getResult() );
		/********mahesh added 17/05/2019**************/
		//fpassSteps.verifyOTPSentPopup();
		//fpassSteps.verifyOTPReceivedToEmail();
	}
}
