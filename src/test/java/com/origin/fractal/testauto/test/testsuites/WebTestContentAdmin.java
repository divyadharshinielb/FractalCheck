package com.origin.fractal.testauto.test.testsuites;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.origin.fractal.testauto.steps.ManageContentSteps;
import com.origin.fractal.testauto.steps.MenuSteps;
import com.origin.fractal.testauto.test.FractalBaseWebTest;
import com.wv.auto.framework.BrowserFactory;
import com.wv.auto.framework.utils.Reporter;
public class WebTestContentAdmin extends FractalBaseWebTest{
	@DataProvider
	public Object[][] browers() {
		return new Object[][] {
			new Object[] { "1", "chrome" }
//		, new Object[] { "2", "firefox" }
//		, new Object[] { "3", "msedge" } 
//		 new Object[] { "4", "ie11" }
		};
	}
	
	@Test(dataProvider = "browers", groups= {"pilot"}, enabled= false, 
			description="TCID_61,62,64,63,66,67: "
			+ "Verify on clicking the Audio opens another pop-up to create an Audio object"
			+ "62: Verify  My Account Profile details,"
			+ "63:Verify the validation for all fields under profile"
			+ "64: verify the error message on leaving all the fields empty,"
			+ "66:Checking whether the new password is getting saved on changing and clicking the save button"
			+ "67: Verifying the changes should not be displayed on clciking Cancel")
	public void testMyAccountPage(String row, String strBrowserName) throws IOException {
		driver = BrowserFactory.getBrowser(strBrowserName);
		loginToContentAdmin(driver);
		MenuSteps menuSteps = new MenuSteps(driver);
		menuSteps.clickMenu();
		menuSteps.gotoManageContents();
		
		//Test moves to Manage Contents page
		//Verify on clicking the Audio opens another pop-up to create an Audio object
		ManageContentSteps mcSteps = new ManageContentSteps(driver);
		mcSteps.verifyAudioCreationPage();
		mcSteps.verifyMandatoryFieldsAlerMessage();
		wait(10);
		menuSteps.logout();
	}
	@Test(dataProvider = "browers", groups= {"pilot"}, enabled= false, description = "")
	
	public void WebTestAdminSearch(String row, String strBrowserName) throws IOException {
		driver = BrowserFactory.getBrowser(strBrowserName);
		loginToContentAdmin(driver);
		MenuSteps menuSteps = new MenuSteps(driver);
		menuSteps.searchFieldAsset();
		menuSteps.searchFieldItemCode();	
   }
	//Added By Vignesh (WVI) on 07-Oct-19 

	@Test(dataProvider = "browers", groups= {"pilot"}, enabled= true, description = "Manage content==>learning objects & Catalog items==>item codes")
	public void WebTestManageContentAdmin(String row, String strBrowserName) throws IOException {
		driver = BrowserFactory.getBrowser(strBrowserName);
		loginToContentAdmin(driver);
		MenuSteps menuSteps = new MenuSteps(driver);
		//Test moves to Manage Contents page
		ManageContentSteps mcSteps = new ManageContentSteps(driver);
		menuSteps.clickMenu();
		menuSteps.gotoManageContents();
		Reporter.writeSummary("TC_Admin_Managecontent_001,Login as admin & goto Manage content, " +  menuSteps.getResult());
		mcSteps.clickOnCreateLobjButton();
		mcSteps.checkelearningitemcode();
		Reporter.writeSummary("TC_Admin_Managecontent_Learningobj_itemcode_002,Test/Check on itemcode in elearning (used 5 different text values & label text verification), " +  mcSteps.getResult());
		mcSteps.checkvideoitemcode();
		Reporter.writeSummary("TC_Admin_Managecontent_Learningobj_itemcode_003,Test/Check on itemcode in video (used 5 different text values & label text verification), " +  mcSteps.getResult());
		mcSteps.checkdocumentitemcode();
		Reporter.writeSummary("TC_Admin_Managecontent_Learningobj_itemcode_004,Test/Check on itemcode in document (used 5 different text values  & label text verification), " +  mcSteps.getResult());
		mcSteps.checkimageitemcode();
		Reporter.writeSummary("TC_Admin_Managecontent_Learningobj_itemcode_005,Test/Check on itemcode in image (used 5 different text values & label text verification & label text verification), " +  mcSteps.getResult());
		mcSteps.checkassessmentitemcode();
		Reporter.writeSummary("TC_Admin_Managecontent_Learningobj_itemcode_006,Test/Check on itemcode in assessment (used 5 different text values & label text verification), " +  mcSteps.getResult());
		mcSteps.checkvlabitemcode();
		Reporter.writeSummary("TC_Admin_Managecontent_Learningobj_itemcode_007,Test/Check on itemcode in vlab (used 5 different text values & label text verification), " +  mcSteps.getResult());
		mcSteps.checkaudioitemcode();
		Reporter.writeSummary("TC_Admin_Managecontent_Learningobj_itemcode_008,Test/Check on itemcode in audio (used 5 different text values & label text verification), " +  mcSteps.getResult());

		//Catalog items added by Vignesh on 09-Oct-19 updated on 10-Oct-19
		mcSteps.clickOnCreatecatalogButton();
		Reporter.writeSummary("TC_Admin_Managecontent_Catalog items_009,Select/Goto catalog item, " +  mcSteps.getResult());
		mcSteps.checkBundleitemcode();
		Reporter.writeSummary("TC_Admin_Managecontent_Catalog items_itemcode_010,Test/Check on itemcode in Bundle (used 5 different text values & label text verification), " +  mcSteps.getResult());
		mcSteps.checkLearningPathitemcode();
		Reporter.writeSummary("TC_Admin_Managecontent_Catalog items_itemcode_011,Test/Check on itemcode in LearningPath (used 5 different text values & label text verification), " +  mcSteps.getResult());
		mcSteps.checkCourseitemcode();
		Reporter.writeSummary("TC_Admin_Managecontent_Catalog items_itemcode_012,Test/Check on itemcode in Course (used 5 different text values), " +  mcSteps.getResult());
		mcSteps.checkResourceitemcode();
		Reporter.writeSummary("TC_Admin_Managecontent_Catalog items_itemcode_013,Test/Check on itemcode in Resource (used 5 different text values & label text verification), " +  mcSteps.getResult());
		mcSteps.checkPodcastitemcode();
		Reporter.writeSummary("TC_Admin_Managecontent_Catalog items_itemcode_014,Test/Check on itemcode in Podcast (used 5 different text values & label text verification), " +  mcSteps.getResult());
		menuSteps.logout();
		Reporter.writeSummary("TC_Admin_Managecontent_015,close learning object in Manage content & logout, " +  mcSteps.getResult());

	}
	//Added By Vignesh (WVI) on 14-Oct-19 
	@Test(dataProvider = "browers", groups= {"pilot"}, enabled= true, description = "Search the catalog item codes in user side")
	public void WebTestCataloguser(String row, String strBrowserName) throws IOException {
		driver = BrowserFactory.getBrowser(strBrowserName);
		login(driver);
		ManageContentSteps mcSteps = new ManageContentSteps(driver);
		mcSteps.Usersearchitemcode();
		Reporter.writeSummary("TC_User_016,Login as User, " +  mcSteps.getResult());
		Reporter.writeSummary("TC_User_Search_017,Search the product item codes, " +  mcSteps.getResult());
		Reporter.writeSummary("TC_User_018,Logout, " +  mcSteps.getResult());

	}

	// End- here************************** Vignesh (WVI) on 14-Oct-19 ********************************
}
