package com.origin.fractal.testauto.test.testsuites;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.origin.fractal.testauto.DataManager;
import com.origin.fractal.testauto.FractalBaseStep;
import com.origin.fractal.testauto.steps.AdminPaginationSteps;
import com.origin.fractal.testauto.steps.AdminSettingSteps;
import com.origin.fractal.testauto.steps.CustomizationRolesSteps;
import com.origin.fractal.testauto.steps.DeleteEventandClassroomSteps;
import com.origin.fractal.testauto.steps.HomeSteps;
import com.origin.fractal.testauto.steps.LanguageDefaultSteps;
import com.origin.fractal.testauto.steps.MenuSteps;
import com.origin.fractal.testauto.steps.RolesManagementSteps;
import com.origin.fractal.testauto.test.FractalBaseWebTest;
import com.wv.auto.framework.BrowserFactory;
import com.wv.auto.framework.utils.Reporter;

import jxl.common.Assert;

public class Staging_Monthly_AdminSettings_Bulid1 extends FractalBaseWebTest{
	@DataProvider
	public  Object[][] browers() {
		return new Object[][] {
			new Object[] { "1", "chrome" }
		};
	}
	@Test(dataProvider = "browers", groups= {"pilot"}, enabled= true, description="")
	public void CustomizationOfRoles(String row, String strBrowserName) throws Exception {
		driver = BrowserFactory.getBrowser(strBrowserName);
		CustomizationRolesSteps rolestep = new CustomizationRolesSteps(driver);
		loginToContentAdmin(driver);
		rolestep.clickSettingsicon();
		rolestep.clickManageroles();
		Reporter.writeSummary("TC_CustomRole001, Click to manage roles in settings., "+ rolestep.getResult() );
		rolestep.addCustomRoleField();
		Reporter.writeSummary("TC_CustomRole002, Add custom role in Manageroles., "+ rolestep.getResult() );
		rolestep.roleNameValidation();
		Reporter.writeSummary("TC_CustomRole003, Custom role name validation with special characters.,"+ rolestep.getResult() );
		rolestep.roleCreationwithLearningadmin();
		Reporter.writeSummary("TC_CustomRole004, Creation of role with learning admin as parent role.,"+ rolestep.getResult() );
		rolestep.roleMappingToDirectUser();
		Reporter.writeSummary("TC_CustomRole005, Mapping the learningadmin role to Directuser., "+ rolestep.getResult() );
		rolestep.adminLogout();
		Reporter.writeSummary("TC_CustomRole006, Verify logout for admin after mapping the role to user., "+ rolestep.getResult() );	
		login(driver);
		rolestep.customRolemapForDirectUser();
		Reporter.writeSummary("TC_CustomRole007, Check for user with the custom role.,"+ rolestep.getResult() );
		rolestep.adminLogout();
		wait(5);
		loginToContentAdmin(driver);
		wait(10);
		rolestep.clickSettingsicon();
		rolestep.clickManageroles();
		rolestep.deleteAssignedRole();
		Reporter.writeSummary("TC_CustomRole008, Verify for deletion of role when it is assigned to a user., "+  rolestep.getResult() );
		rolestep.unassignRole();
		rolestep.clickSettingsicon();
		rolestep.clickManageroles();
		rolestep.deleteUnassignedRole();
		rolestep.adminLogout();
		Reporter.writeSummary("TC_CustomRole009,  Deletion of the created custom role after unassigning and logout of admin.,"+ rolestep.getResult() );

	}
	@Test(dataProvider = "browers", groups= {"pilot"}, enabled= true, description="")
	public void paginationAdmin(String row, String strBrowserName) throws Exception {
		driver = BrowserFactory.getBrowser(strBrowserName);
		AdminPaginationSteps adminstep = new AdminPaginationSteps(driver);
		loginToContentAdmin(driver);
		adminstep.paginationLearningObject();
		Reporter.writeSummary("FR1-2497_AdminPage_TC-001,Verify pagination for learning object page, " +  adminstep.getResult() );
		adminstep.learningobjectWithCategoryFilter();
		Reporter.writeSummary("FR1-2497_AdminPage_TC-002,Verify pagination for learning object page with filter, " +  adminstep.getResult() );
		adminstep.paginationCatalogPage();
		Reporter.writeSummary("FR1-2497_AdminPage_TC-003,Verify pagination for catalog object page, " +  adminstep.getResult() );
		adminstep.catalogpageWithCategoryFilter();
		Reporter.writeSummary("FR1-2497_AdminPage_TC-004,Verify pagination for catalog object page with filter, " +  adminstep.getResult() );
		DeleteEventandClassroomSteps delevnt = new DeleteEventandClassroomSteps(driver);
		delevnt.logoutAdmin();
		//wait(10); //added wait as it takes time to load
	
	}
	@Test(dataProvider = "browers", groups= {"pilot"}, enabled= true, description="")
	public void LanguageCheck(String row, String strBrowserName) throws Exception {
		driver = BrowserFactory.getBrowser(strBrowserName);
		loginToContentAdmin(driver);
		LanguageDefaultSteps langcheck = new LanguageDefaultSteps(driver);
		langcheck.learningitemLanguageCheck();
		Reporter.writeSummary("TCID_lang_001, Verify the default language in learning item page, " +  langcheck.getResult() );
		langcheck.catalogitemLanguageCheck();
		Reporter.writeSummary("TCID_lang_002, Verify the default language in catalog item page, " +  langcheck.getResult() );
		DeleteEventandClassroomSteps delevnt = new DeleteEventandClassroomSteps(driver);
		delevnt.logoutAdmin();
		wait(10); //added wait as it takes time to load
		login(driver);
		langcheck.whatsnewEnglishCheck();
		Reporter.writeSummary("TCID_lang_003, Verify the default language in whatsnew section, " +  langcheck.getResult() );
		langcheck.inprogressEnglishCheck();
		Reporter.writeSummary("TCID_lang_004, Verify the default language in in-progress section, " +  langcheck.getResult() );
		langcheck.completedEnglishCheck();
		Reporter.writeSummary("TCID_lang_005, Verify the default language in completed section, " +  langcheck.getResult() );
		//commented create Language function
		/*	langcheck.createLanguage();
		Reporter.writeSummary("TCID_lang_001, Verify clicking the Classroom icon displays the Classroom page, " +  langcheck.getResult() );
		langcheck.clickLanguageicon();*/
	}
	@Test(dataProvider = "browers", groups= {"pilot"}, enabled= true, description = "")

	public void webTestRolesCheck(String row, String strBrowserName) throws IOException  {
		driver = BrowserFactory.getBrowser(strBrowserName);
	RolesManagementSteps rolesmngmtsteps = new RolesManagementSteps(driver);
	loginToContentAdmin(driver);
		rolesmngmtsteps.clickMenu();
		rolesmngmtsteps.clickClassroom();
		Reporter.writeSummary("TCID_RolesManagement_0013, Verify navigation of classroom page, " +  rolesmngmtsteps.getResult() );
		rolesmngmtsteps.addclassroomcheck();
		Reporter.writeSummary("TCID_RolesManagement_0014, Verify instructors present in Add classroom, " +  rolesmngmtsteps.getResult() );
		rolesmngmtsteps.editclassroomcheck();
		Reporter.writeSummary("TCID_RolesManagement_0015, Verify instructors present in Edit classroom, " +  rolesmngmtsteps.getResult() );
	/*	rolesmngmtsteps.editmanagerolefunctionality();*/
		rolesmngmtsteps.gotoManageUser();
	//	rolesmngmtsteps.BusinessUserRole();
		Reporter.writeSummary("TCID_RolesManagement_001, Verify roles mapped to business user in admin part, " +  rolesmngmtsteps.getResult() );
	//	rolesmngmtsteps.instructorUserRole();
		Reporter.writeSummary("TCID_RolesManagement_002, Verify roles mapped to instructor user in admin part, " +  rolesmngmtsteps.getResult() );
	  //  rolesmngmtsteps.businessAdminRole();
		Reporter.writeSummary("TCID_RolesManagement_003, Verify roles mapped to businessAdmin in admin part, " +  rolesmngmtsteps.getResult() );
		rolesmngmtsteps.siteAdminRole();
		Reporter.writeSummary("TCID_RolesManagement_004, Verify roles mapped to siteAdmin in admin part, " +  rolesmngmtsteps.getResult() );
		rolesmngmtsteps.directUserRole();
		Reporter.writeSummary("TCID_RolesManagement_005, Verify roles mapped to directUser in admin part, " +  rolesmngmtsteps.getResult() );
		//rolesmngmtsteps.learningAdminRole();
		Reporter.writeSummary("TCID_RolesManagement_006, Verify roles mapped to learningAdmin in admin part, " +  rolesmngmtsteps.getResult() );
	
	}
	@Test(dataProviderClass=DataManager.class, dataProvider = "browers", groups = { "Phase1.0" }, enabled = true, description = "Roles")
	public void testroles(String row, String strBrowserName) {
		driver = BrowserFactory.getBrowser(strBrowserName);
		RolesManagementSteps rolesmngmtsteps = new RolesManagementSteps(driver);
       rolesmngmtsteps.DirectuserwithLearningadminandinsrole();
	   Reporter.writeSummary("TCID_RolesManagement_007, Verify direct user with learning admin and instructor role, " +  rolesmngmtsteps.getResult() );
		rolesmngmtsteps.Checkdirectuserinsandlearningadminmapping();
		Reporter.writeSummary("TCID_RolesManagement_008, Verify direct user mapping with learning admin and instructor role, " +  rolesmngmtsteps.getResult() );
	//   rolesmngmtsteps.InstructorwithDirectuserrole();
		Reporter.writeSummary("TCID_RolesManagement_009, Verify Instructor with Directuser role mapping, " +  rolesmngmtsteps.getResult() );
		rolesmngmtsteps.SiteadminwithDirectuserRole();
		Reporter.writeSummary("TCID_RolesManagement_010, Verify siteadmin with direct role mapping, " + rolesmngmtsteps.getResult() );
	/*	commenting as there is no learning adminrolesmngmtsteps.LearningadminwithDirectuserrole();
		Reporter.writeSummary("TCID_RolesManagement_011, Verify learning admin with Direct role mapping, " +  rolesmngmtsteps.getResult() );*/
	//	rolesmngmtsteps.BusinessadminwithbusinessuserRole(); //11/5/2020
		Reporter.writeSummary("TCID_RolesManagement_012, Verify business admin with Business user, " +  rolesmngmtsteps.getResult() );
	//	rolesmngmtsteps.Businessuserwithinsrole();           //11/5/2020
		Reporter.writeSummary("TCID_RolesManagement_013, Verify Business user with Instructor role, " +  rolesmngmtsteps.getResult() );
		
	}
	@Test(dataProviderClass=DataManager.class, dataProvider = "browers", groups = { "Phase1.0" }, enabled = true, description = "Login Page")
	public void checkOverallTestNGResult(String row, String strBrowserName) {
		print("Number of Test cases Failed ="+ FractalBaseStep.overallTestNGResult );
		if(FractalBaseStep.overallTestNGResult > 0) {
			Assert.verify(false);
		}
	}
	@Test(dataProviderClass=DataManager.class, dataProvider = "browers", groups = { "pilot" }, enabled = true,priority=0)
	public void AdminSetting(String row, String strBrowserName) throws InterruptedException {
		driver = BrowserFactory.getBrowser(strBrowserName);
		AdminSettingSteps adminsettings=new AdminSettingSteps(driver);
		siteAdminLogin(driver); 
		adminsettings.verifyCreateandDeleteCategory();
		Reporter.writeSummary("FR-55_Admin_ManageCategory_TC-001, Verify Admin is able to create and delete the categories," +  adminsettings.getResult()); 
		adminsettings.checkClassroomSettings();
		Reporter.writeSummary("FR-121_Admin_ClassroomSettings_TC-001, Verify Admin is configuring the details for classroom.," +  adminsettings.getResult()); 
		adminsettings.verifyCurrency();
		Reporter.writeSummary("OKA32-8_Admin_Currency_TC-001, Verify Admin is able to configure the currency for application from currency section," +  adminsettings.getResult()); 
		adminsettings.verifyAddandDeleteLanguage();
		Reporter.writeSummary("OKA32-7_Admin_Language_TC-001, Verify Admin is able to add and delete language in application," +  adminsettings.getResult()); 
		adminsettings.verifyNotificationSettings();
		Reporter.writeSummary("OKA32-6_Admin_Notification_TC-001, Verify Admin is able to configure the notifications from settings," +  adminsettings.getResult()); 
		adminsettings.verifyAddandDeleteManageRole();
		Reporter.writeSummary("FR1-2019_Admin_Create Role_TC-001, Verify Admin is able to create a new role.," +  adminsettings.getResult()); 
		adminsettings.verifyWhiteLabel();
		Reporter.writeSummary("OKA32-4_Admin_White labeling_TC-001, Verify Admin is able to configure the branding details in white labeling," +  adminsettings.getResult());	
		
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
		/*	homeSteps.verifyCartItemBtn1(); 15/4/2020
			//removing test case number 008 as per Sara mam comment
			//Reporter.writeSummary("TCID_008, Verify If there is one payment mode is available in admin ensure that payment mode is reflecting in user part., " +  homeSteps.getResult() );
			Reporter.writeSummary("TCID_paymentconfigure_009, Verify User should able to access the payment and it should redirect to payment section," +  homeSteps.getResult() );    
		*/}
}
