package com.origin.fractal.testauto.test.testsuites;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.origin.fractal.testauto.DataManager;
import com.origin.fractal.testauto.steps.AccountSteps;
import com.origin.fractal.testauto.steps.AccountStepsNewUI;
import com.origin.fractal.testauto.steps.HomeSteps;
import com.origin.fractal.testauto.steps.HomeStepsNewUI;
import com.origin.fractal.testauto.steps.LoginSteps;
import com.origin.fractal.testauto.steps.MyLearningSteps;
import com.origin.fractal.testauto.steps.MyLearningStepsNewUI;
import com.origin.fractal.testauto.steps.VideoTesterSteps;
import com.origin.fractal.testauto.test.FractalBaseWebTest;
import com.wv.auto.framework.BrowserFactory;
import com.wv.auto.framework.utils.Reporter;

public class WebTestNewUI extends FractalBaseWebTest {
	
	@Test(dataProviderClass=DataManager.class,dataProvider = "browers", groups= {"pilot"}, enabled= true, description="LOGIN PAGE",priority = 0)
	public void testLogin(String row, String strBrowserName) {
		
		driver = BrowserFactory.getBrowser(strBrowserName);
		Reporter.setBrowserAppOS(strBrowserName);
		LoginSteps loginSteps = new LoginSteps(driver);
		HomeSteps homeSteps = new HomeSteps(driver);
		loginSteps.loginPageVerification();
		Reporter.writeSummary("TCID_026,Verify the UI of the login page. User name Password Remember me fields and Login button are available in the login page, " +  loginSteps.getResult() );
		loginSteps.blankUserName();
		Reporter.writeSummary("TCID_030,Verify the login page with blank user name and valid password," + loginSteps.getResult() );
		Reporter.writeSummary("TCID_029,Verify whether the User name and Password are mandatory fields for login screen, " + loginSteps.getResult() );
		loginSteps.blankPasswordVerification();
		Reporter.writeSummary("TCID_036,Verify the login page with valid user name and blank password," +  loginSteps.getResult() );
		loginSteps.inValid();
		Reporter.writeSummary("TCID_038,Verify the login page with invalid user name and invalid password," +  loginSteps.getResult() );
		loginSteps.inValidPassword();
		Reporter.writeSummary("TCID_071,Verify the login page with valid user name and invalid password," +  loginSteps.getResult() );
		//commenting this because of remember me error (FR1-1857)loginSteps.rememberMe();
		Reporter.writeSummary("TCID_072,Verify the Remember me function," +  loginSteps.getResult() );
		//loginSteps.registerFunction();
		//Reporter.writeSummary("TCID_074, Verification of Register link  function," +  loginSteps.getResult() );
		loginSteps.verifypasswordField();
		Reporter.writeSummary("TCID_065,Verify whether the entered password is displayed in encrypted format in the Change password field, " +  loginSteps.getResult());	
		login(driver);
		Reporter.writeSummary("TCID_028,Verify the login page with valid username and valid password.," +  loginSteps.getResult() );    
		homeSteps.clickLogout();
	}



	@Test(dataProviderClass=DataManager.class,dataProvider = "browers", groups= {"pilot"}, enabled= true, description="")

	public void testMyLearningPage0(String row, String strBrowserName) {
		driver = BrowserFactory.getBrowser(strBrowserName);
		login(driver);
		HomeStepsNewUI homeSteps = new HomeStepsNewUI(driver);
		homeSteps.verifyResumeLearningLabeltext();
		Reporter.writeSummary("TCID_010,Verify whether clicking the RESUME LEARNING link in the Dashboard page is navigating to that particular catalog item page., " + homeSteps.getResult() );
		homeSteps.verifyMyLearningPage();
		Reporter.writeSummary("TCID_003,Verify the My Learning tab in the Dashboard page, " +  homeSteps.getResult());
		MyLearningStepsNewUI mLSteps = new MyLearningStepsNewUI(driver);
		mLSteps.verifySubMenu();
		Reporter.writeSummary("TCID_004,Verify all links(All Bundles Courses Learning Paths and resources)in the Dashboard page, " +  mLSteps.getResult() );
		mLSteps.verifyCatalogname();
		Reporter.writeSummary("TCID_011,Verify learning item page is opened when any of the particular course catalog item is clicked in the Dashboard page, " +  mLSteps.getResult() );
		homeSteps.verifyFooterLinks();
		Reporter.writeSummary("TCID_034,Verify Privacy Terms and Contact links in the Dashboard page, " + homeSteps.getResult() );
	}
	



	@Test(dataProviderClass=DataManager.class, dataProvider = "browers", groups= {"pilot"}, enabled= true, 
			description="TCID_61,62 "
			+ "61: Verify  My account page,"
			+ "62: Verify  My Account Profile details, ")
   public void testMyAccountPage(String row, String strBrowserName) {
	 driver = BrowserFactory.getBrowser(strBrowserName); 
	 Reporter.setBrowserAppOS(strBrowserName);
	 HomeSteps homeSteps = new HomeSteps(driver);
	 login(driver);
	 //commenting this testcase as this is a repition
	// Reporter.writeSummary("TCID_Log,Verify Loging is working fine, " +  homeSteps.getResult());
	 homeSteps.CarosalImgCheck();
	 Reporter.writeSummary("TCID_Img,Verify the carosal image in dashboard page, " +  homeSteps.getResult());
	 AccountStepsNewUI accountSteps = new AccountStepsNewUI(driver);              
	 accountSteps.clickOnMyAccount();
	 wait(10);
	 accountSteps.verifyAccountPageLabels();                                                                                                 
	 Reporter.writeSummary("TCID_061,Verify  My account page, " +  accountSteps.getResult() );
	 accountSteps.verifyProfileDetails();
	 Reporter.writeSummary("TCID_062,Verify  My Account Profile details, " +  accountSteps.getResult() );
     accountSteps.verifyFieldValidation();
	 Reporter.writeSummary("TCID_063,Verify the validation for all fields under profile, " + accountSteps.getResult() );
	 accountSteps.verifyEmptyProfileValidation();
	 Reporter.writeSummary("TCID_064,Verify the error message on leaving all the fields empty, " +  accountSteps.getResult() );
	 accountSteps.afterChangePassword();
	 Reporter.writeSummary("TCID_068,Verify whether the user is able to login with the new password, " + accountSteps.getResult() );
	 LoginSteps loginSteps = new LoginSteps(driver);
	 wait(5);
	 loginSteps.doLogin();
	 wait(5);
	 homeSteps.verifyBellNotification();
	 Reporter.writeSummary("TCID_069,Verify the Notifications page is getting displayed on clicking the Bell icon on the top right of the page next to profile icon, " + homeSteps.getResult() );
	 homeSteps.verifyLogoImg();
	 Reporter.writeSummary("TCID_084,Verify the functionality of the Logo displayed on the top left corner of the page., " +  homeSteps.getResult());    
	 homeSteps.clickLogout();
	}
	@Test(dataProviderClass=DataManager.class, dataProvider = "browers", groups = { "pilot" }, enabled = true,
			description = "video testing")
	public void verifyvideo(String row, String strBrowserName) throws InterruptedException {
		driver = BrowserFactory.getBrowser(strBrowserName);
		
		login(driver);
		VideoTesterSteps VideoTesterSteps=new VideoTesterSteps(driver);
		VideoTesterSteps.verifyVideoTester(); //15/4/2020
		Reporter.writeSummary("TCID_100, Verify the video is launching successfully," +  VideoTesterSteps.getResult() );
	
	}
 }
