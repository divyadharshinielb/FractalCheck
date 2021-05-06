package com.origin.fractal.testauto.test.testsuites;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.origin.fractal.testauto.DataManager;
import com.origin.fractal.testauto.steps.CatalogUpdateSteps;
import com.origin.fractal.testauto.steps.DeleteEventandClassroomSteps;
import com.origin.fractal.testauto.steps.ForgotPasswordSteps;
import com.origin.fractal.testauto.steps.HomeSteps;
import com.origin.fractal.testauto.steps.LoginSteps;
import com.origin.fractal.testauto.steps.MenuSteps;
import com.origin.fractal.testauto.steps.NotificationSteps;
import com.origin.fractal.testauto.steps.ReportSteps;
import com.origin.fractal.testauto.steps.VenueSteps;
import com.origin.fractal.testauto.test.FractalBaseWebTest;
import com.wv.auto.framework.BrowserFactory;
import com.wv.auto.framework.utils.Reporter;

public class Automation_Weekly extends FractalBaseWebTest{
	
	@Test(dataProviderClass = DataManager.class,dataProvider = "browers", groups= {"pilot"}, enabled= true, description = "")

	public void WebTestEmailNotification(String row, String strBrowserName) throws IOException {
		driver = BrowserFactory.getBrowser(strBrowserName);
		loginToContentAdmin(driver);
		MenuSteps menuSteps = new MenuSteps(driver);
		menuSteps.clickMenu();
		menuSteps.gotoNotification();
		NotificationSteps notificationSteps= new NotificationSteps(driver);
		notificationSteps.gotoEmailNotificationTab();
		notificationSteps.verifyPasswordChangedTemplate();
		Reporter.writeSummary("EmailTem_001, Verify whether password change template is working fine , " +  notificationSteps.getResult() );
		notificationSteps.verifyPurchaseMailTemplate();
		Reporter.writeSummary("EmailTem_002,Verify whether purchase mail template is working fine , " +  notificationSteps.getResult() );
	//	notificationSteps.verifyUnAssignTemplate();
		Reporter.writeSummary("EmailTem_003, Verify whether Un assign template is working fine , " +  notificationSteps.getResult() );
		notificationSteps.verifyUsersForgotPasswordMail();
		Reporter.writeSummary("EmailTem_004, Verify whether users forgot password template is working fine , " +  notificationSteps.getResult() );
	/*	notificationSteps.verifyTemplateForValidityExpired();
		Reporter.writeSummary("EmailTem_005, Verify whether template for validity expired template is working fine , " +  notificationSteps.getResult() );
        notificationSteps.verifyContentAssignment();
        Reporter.writeSummary("EmailTem_006,Verify whethercontent assignment template is working fine , " +  notificationSteps.getResult() );
        notificationSteps.verifyBusinessUserRegistration();
        Reporter.writeSummary("EmailTem_007, Verify whether business user template is working fine , " +  notificationSteps.getResult() );
   */ }
	@Test(dataProviderClass=DataManager.class, dataProvider = "browers", groups = { "Phase1.0" }, enabled = true, description = "Verify whether a group name is present in the reports.")

	public void WebTestAdminReports(String row, String strBrowserName) throws IOException {
			driver = BrowserFactory.getBrowser(strBrowserName);
			loginToContentAdmin(driver);
			MenuSteps menuSteps = new MenuSteps(driver);
			wait(10);//added on august 16 2019
			menuSteps.clickMenu();
			ReportSteps reportSteps= new ReportSteps(driver);
			reportSteps.verifyGroupName();
			Reporter.writeSummary("TCID_017, Verify Groups name in the reports., " +  reportSteps.getResult() );
			
	   }
	@Test(dataProviderClass=DataManager.class,dataProvider = "browers", groups = { "pilot", "Home" }, enabled = true,
			description = "")
	public void CatalogUpdatePhase2(String row, String strBrowserName) throws IOException {
		driver = BrowserFactory.getBrowser(strBrowserName);
		CatalogUpdateSteps catalogUpdateSteps = new CatalogUpdateSteps(driver);
		VenueSteps venueSteps = new VenueSteps(driver);
		MenuSteps menuSteps = new MenuSteps(driver);
		loginToContentAdmin(driver);
		venueSteps.clickHomeMenu();
		menuSteps.gotoManageContents();
		catalogUpdateSteps.catalogTab();
		Reporter.writeSummary("Catalog_TC_001, Verify navigation to catalog tab , " +  catalogUpdateSteps.getResult() );
		catalogUpdateSteps.editCatalog();
		Reporter.writeSummary("Catalog_TC_002, Verify the edit icon for catalog item , " +  catalogUpdateSteps.getResult() );
		catalogUpdateSteps.updateEditCatalog();
		Reporter.writeSummary("Catalog_TC_003, Verify the admin should able to see the Alert message with count (User details) , " +  catalogUpdateSteps.getResult() );
		catalogUpdateSteps.radioBtnchecked();
		Reporter.writeSummary("Catalog_TC_004, Verify the in-progress and all-user radio button while updation of catalog item , " +  catalogUpdateSteps.getResult() );

	}
	@Test(dataProviderClass=DataManager.class,dataProvider = "browers", groups = { "pilot", "Home" }, enabled = true,
			description = "")
	public void CatalogUpdatePhase1(String row, String strBrowserName) throws IOException {
		driver = BrowserFactory.getBrowser(strBrowserName);
		CatalogUpdateSteps catalogUpdateSteps = new CatalogUpdateSteps(driver);
		VenueSteps venueSteps = new VenueSteps(driver);
		MenuSteps menuSteps = new MenuSteps(driver);
		loginToContentAdmin(driver);
		venueSteps.clickHomeMenu();
		menuSteps.gotoManageContents();
		catalogUpdateSteps.catalogTab();
		catalogUpdateSteps.editCatalog();
		catalogUpdateSteps.updateEditCatalog();
		catalogUpdateSteps.radioBtnchecked();
		Reporter.writeSummary("Catalog_TC_005, Verify the in-progress New user and all-user radio button while updation of catalog item , " +  catalogUpdateSteps.getResult() );
		catalogUpdateSteps.UpdateDetailsUserPart();
		Reporter.writeSummary("Catalog_TC_006, Verify the catalog title is updated in user part , " +  catalogUpdateSteps.getResult() );
		loginToContentAdmin(driver);
		venueSteps.clickHomeMenu();
		menuSteps.gotoManageContents();
		catalogUpdateSteps.saveValidation();
		Reporter.writeSummary("Catalog_TC_007, Verify updation of catalog item by unassigning content , " +  catalogUpdateSteps.getResult() );
	}
	@Test(dataProviderClass = DataManager.class,dataProvider="browers", groups= {"pilot"}, enabled= true, description="")
	public void ClassroomCreation(String row, String strBrowserName) throws Exception {
		driver = BrowserFactory.getBrowser(strBrowserName);
		loginToContentAdmin(driver);
		MenuSteps menuSteps = new MenuSteps(driver);
		DeleteEventandClassroomSteps delevnt = new DeleteEventandClassroomSteps(driver);
		Reporter.writeSummary("TCID_DELNOTI_001, Verify clicking the Classroom icon displays the Classroom page, "+  menuSteps.getResult() );
		menuSteps.clickMenu();
		Reporter.writeSummary("TCID_DELNOTI_002, Verify whether Admin should be able to view the CLASS ROOM page , "+  menuSteps.getResult() );
		menuSteps.gotoClassroomCreation();
		Reporter.writeSummary("TCID_DELNOTI_003, Verify clicking the Add Classroom button displays Classroom creation page , "+  menuSteps.getResult() );
		delevnt.Classroomcreate();
		Reporter.writeSummary("TCID_DELNOTI_004, Verify whether classroom is created or not , "+  delevnt.getResult() );
		delevnt.eventCreation();
		Reporter.writeSummary("TCID_DELNOTI_005, Verify whether event is created or not , "+  delevnt.getResult() );
		delevnt.logoutAdmin();
		wait(10); //added wait as it takes time to load
		login(driver);
		delevnt.instructorAccept();
		Reporter.writeSummary("TCID_DELNOTI_006, Check whether the instructor accepts the event , "+  delevnt.getResult() );
		loginToContentAdmin(driver);
		menuSteps.clickMenu();
		menuSteps.gotoClassroomCreation();
		delevnt.accepteventDelete();
		Reporter.writeSummary("TCID_DELNOTI_007, Event gets deleted after accepted by instructor , "+  delevnt.getResult() );
		login(driver);
		delevnt.instructorLogin();
		Reporter.writeSummary("TCID_DELNOTI_008, The notification for event deletion occurs , "+  delevnt.getResult() );
		loginToContentAdmin(driver);
		menuSteps.clickMenu();
		menuSteps.gotoClassroomCreation();
		delevnt.eventCreation();
		delevnt.eventDeletebeforeaccept();
		Reporter.writeSummary("TCID_DELNOTI_009, The event is deleted before accepstance of instructor , "+  delevnt.getResult() );
		login(driver);
		delevnt.instructorLogin();
		wait(10); //added as it takes time to load 
		Reporter.writeSummary("TCID_DELNOTI_010, Check for the notification for event deletion occurs before accepted , "+  delevnt.getResult() );
		loginToContentAdmin(driver);
		menuSteps.clickMenu();
		menuSteps.gotoClassroomCreation();
		delevnt.eventCreation();
		delevnt.classroomDelete();
		Reporter.writeSummary("TCID_DELNOTI_011, The Classroom is deleted after creating one event , "+  delevnt.getResult() );
		login(driver);
		delevnt.instructorLogin();
		Reporter.writeSummary("TCID_DELNOTI_012, Check for the notification for classroom deletion , "+  delevnt.getResult() );
	}
	@Test(dataProviderClass = DataManager.class,dataProvider = "browers", groups= {"pilot"}, enabled= true, description = "TCID_009:Dynamic payment configurations should appear in the User purchase page.")

	public void WebTestSettingsAdminPaymentConfig(String row, String strBrowserName) throws IOException {
			driver = BrowserFactory.getBrowser(strBrowserName);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			loginToContentAdmin(driver);	
			MenuSteps menuSteps = new MenuSteps(driver);
			menuSteps.clickMenu();
			js.executeScript("window.scrollBy(0,2000)");
			menuSteps.gotoPaymentConfiguration();
			Reporter.writeSummary("TCID_paymentconfigure_006, Verify we are able to configure Paytm as a payment authentication, " +  menuSteps.getResult() );
			Reporter.writeSummary("TCID_paymentconfigure_007, Verify the payment configured in admin only is available to the user," +  menuSteps.getResult() );
		    menuSteps.logout();
			driver = BrowserFactory.getBrowser(strBrowserName);
			login(driver);
			HomeSteps homeSteps = new HomeSteps(driver);
		}
	@Test(dataProviderClass=DataManager.class, dataProvider = "browers", groups = { "Phase1.0" }, enabled = true, description = "Login Page")
	public void testLoginSearchLink(String row, String strBrowserName) {
		
		driver = BrowserFactory.getBrowser(strBrowserName);
		LoginSteps loginSteps = new LoginSteps(driver);
		login(driver);
		loginSteps.verifySearchLink();
		Reporter.writeSummary("TCID_LOGIN_075, Verify the function of  Search link , " +  loginSteps.getResult() );
	}
	//Added by Manju Priya A on Jan_21_19
	@Test(dataProviderClass=DataManager.class, dataProvider = "browers", groups = { "Phase1.0" }, enabled = true, description = "TCID_71: verification of Forgot Password Page"
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
		Reporter.writeSummary("TCID_LOGIN_071, verification of Forgot Password Page, " +  fpassSteps.getResult() );
		//TCID_73: Verification of Forgot Password function
		fpassSteps.verifyForgotPasswordLabels();
		Reporter.writeSummary("TCID_LOGIN_073, Verification of Forgot Password function, " +  fpassSteps.getResult() );
		
	}
}
