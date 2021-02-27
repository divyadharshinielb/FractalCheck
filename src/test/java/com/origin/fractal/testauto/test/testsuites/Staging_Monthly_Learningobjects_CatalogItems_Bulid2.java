package com.origin.fractal.testauto.test.testsuites;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.origin.fractal.testauto.DataManager;
import com.origin.fractal.testauto.steps.AdminVideoandAudioTestSteps;
import com.origin.fractal.testauto.steps.CatalogItemSteps;
import com.origin.fractal.testauto.steps.CatalogVersioningSteps;
import com.origin.fractal.testauto.steps.CustomizationRolesSteps;
import com.origin.fractal.testauto.steps.DocumentValidationSteps;
import com.origin.fractal.testauto.steps.ELearningObjectWithScorm2004Steps;
import com.origin.fractal.testauto.steps.ElearningOrientationSteps;
import com.origin.fractal.testauto.steps.InstructorBellNotificationSteps;
import com.origin.fractal.testauto.steps.LearningObjectHTMLSteps;
import com.origin.fractal.testauto.steps.LoginSteps;
import com.origin.fractal.testauto.steps.ReorderingCatalogItemsSteps;
import com.origin.fractal.testauto.steps.VideoFractalSteps;
import com.origin.fractal.testauto.test.FractalBaseWebTest;
import com.wv.auto.framework.BrowserFactory;
import com.wv.auto.framework.utils.Reporter;

public class Staging_Monthly_Learningobjects_CatalogItems_Bulid2 extends FractalBaseWebTest{
	@DataProvider
	public  Object[][] browers() {
		return new Object[][] {
			new Object[] { "1", "chrome" }
		};
	}
	@Test(dataProviderClass = DataManager.class,dataProvider="browers", groups= {"pilot"}, enabled= true, description="")
	public void testCatalogCreation(String row, String strBrowserName) throws IOException {

		driver = BrowserFactory.getBrowser(strBrowserName);
		loginToContentAdmin(driver);
		CatalogItemSteps catalogsteps = new CatalogItemSteps(driver);
		CustomizationRolesSteps rolestep = new CustomizationRolesSteps(driver);
		catalogsteps.clickManageContents();
		catalogsteps.clickCatalogitem();
		//creation of Bundle
		catalogsteps.addBundle();
		catalogsteps.catalogTitle();
		catalogsteps.catalogCreation();
		catalogsteps.catalogSecondPage();
		Reporter.writeSummary("FR1-2770_CatalogitemTC_01,Creation of Bundle with duedate validation.,"+catalogsteps.getResult() );
		//creation of learning path with both lbl
		catalogsteps.addLearnPath();
		catalogsteps.catalogTitle();
		catalogsteps.catalogCreation();
		catalogsteps.clickBothlbl();
		catalogsteps.catalogSecondPage();
		Reporter.writeSummary("FR1-2770_CatalogitemTC_02,Creation of Learningpath(Both) with duedate validation.,"+catalogsteps.getResult() );

		//creation of resource
		catalogsteps.addResource();
		catalogsteps.catalogTitle();
		catalogsteps.catalogCreation();
		catalogsteps.catalogSecondPage();
		Reporter.writeSummary("FR1-2770_CatalogitemTC_03,Creation of Resource with duedate validation.,"+catalogsteps.getResult() );
		//creation of podcast
		catalogsteps.addPodcast();
		catalogsteps.catalogTitle();
		catalogsteps.catalogCreation();
		catalogsteps.catalogSecondPage();
		Reporter.writeSummary("FR1-2770_CatalogitemTC_04,Creation of Podcast with duedate validation.,"+catalogsteps.getResult() );
		//creation of course
		catalogsteps.addCourse();
		catalogsteps.catalogTitle();
		catalogsteps.courseCreation();
		Reporter.writeSummary("FR1-2770_CatalogitemTC_05,Creation of Course with duedate validation.,"+catalogsteps.getResult() );
		rolestep.adminLogout();
		//user part commented as due date validation (content) is not present as of now.
		/*	login(driver);
			catalogsteps.bundleDueDateCheck();
			Reporter.writeSummary("FR1-2770_CatalogitemTC_06,Check for duedate Popup in user side., "+catalogsteps.getResult() );
			catalogsteps.bellNotificationDueCheck();
			Reporter.writeSummary("FR1-2770_CatalogitemTC_07,Check for bell notification for due date., "+catalogsteps.getResult() );
		 */	
	}
	@Test(dataProvider = "browers", groups= {"pilot"}, enabled= true, description="")
	public void documentValidation(String row, String strBrowserName) throws Exception {
		driver = BrowserFactory.getBrowser(strBrowserName);
		loginToContentAdmin(driver);
		DocumentValidationSteps docstep = new DocumentValidationSteps(driver);
		docstep.emptyFieldValidation();
		Reporter.writeSummary("FR1-2775_Doc_TC_001,Verify Empty Field validation messages for Document, " +  docstep.getResult() );
		docstep.documentWithLinkValidation();
		Reporter.writeSummary("FR1-2775_Doc_TC_001,Verify link field validation for Document, " +  docstep.getResult() );
		docstep.documentCreationWithPDF();
		Reporter.writeSummary("FR1-2775_Doc_TC_002,Verify document with PDF and downloadable field validation, " +  docstep.getResult() );
		docstep.documentCreation();
		Reporter.writeSummary("FR1-2775_Doc_TC_003,Verify creation of document , " +  docstep.getResult() );
		docstep.documentCreationWithXLFile();
		Reporter.writeSummary("FR1-2776_Doc_TC_004,Verify creation of document with xl format , " +  docstep.getResult() );
		docstep.editDocument();
		Reporter.writeSummary("FR1-2775_Doc_TC_005,Verify edit of document, " +  docstep.getResult() );
		docstep.previewDocument();
		Reporter.writeSummary("FR1-2775_Doc_TC_006,Verify navigation of classroom icon in admin part , " +  docstep.getResult() );
		docstep.mapCatalogItem();
		Reporter.writeSummary("FR1-2775_Doc_TC_007,Verify mapping of created document while creating catalog item , " +  docstep.getResult() );
		docstep.podcastValidation();
		Reporter.writeSummary("FR1-2775_Doc_TC_008,Verify whether podcast does not allow to add document, " +  docstep.getResult() );
		/*	docstep.userDocumentCheck();
			Reporter.writeSummary("FR1-2775_Doc_TC_0012,Verify navigation of classroom icon in admin part , " +  docstep.getResult() );
		 */
	}

	@Test(dataProviderClass=DataManager.class, dataProvider = "browers", groups = { "pilot"}, enabled = true,priority=0)
	public void TestELearningOrientation(String row, String strBrowserName) throws IOException {
		driver = BrowserFactory.getBrowser(strBrowserName);
		siteAdminLogin(driver); 	
		ElearningOrientationSteps eLearningOrientation= new ElearningOrientationSteps(driver);
		eLearningOrientation.verifyELearningOrientation();
		Reporter.writeSummary("FR1-2539_eLearnOrient_TC-001, Verify the admin able to see orientation Modes Auto/Landscape/Portrait in elearning," +  eLearningOrientation.getResult()); 
		eLearningOrientation.verifyOrientationSelection();
		Reporter.writeSummary("FR1-2539_eLearnOrient_TC-002, Verify the admin able to select the orientation Auto/Landscape/Portrait in elearning," +  eLearningOrientation.getResult()); 
		//Added the comments due to the edit LO bug 		
		// Added on 22-Sep-20
		//		eLearningOrientation.preRequisite();
		//		//ends
		//		eLearningOrientation.verifyScormOrientation();
		//		Reporter.writeSummary("FR1-2539_eLearnOrient_TC-003, Verify the admin able to select the orientation Auto/Landscape/Portrait and save the elearning with Scrome1.2 package," +  eLearningOrientation.getResult()); 
		////		eLearningOrientation.verifyXapiOrientation();
		//		Reporter.writeSummary("FR1-2539_eLearnOrient_TC-004, Verify the admin able to select the orientation Auto/Landscape/Portrait and save the elearning with Xapi package," +  eLearningOrientation.getResult()); 
	}
	@Test(dataProviderClass=DataManager.class, dataProvider = "browers", groups = { "pilot"}, enabled = true,priority=0)
	public void Testscorme2004(String row, String strBrowserName) throws IOException {
		driver = BrowserFactory.getBrowser(strBrowserName);
		siteAdminLogin(driver);
		LoginSteps login= new LoginSteps(driver);
		ELearningObjectWithScorm2004Steps scorm2004= new ELearningObjectWithScorm2004Steps(driver);
		scorm2004.verifyCreateELearningObjectWithscorm2004();
		Reporter.writeSummary("FR1-2364_eLearnScorm2004_TC-001,Verify that Site admin is able to Create an eLearning object with Scorm 2004," +scorm2004.getResult());
		//Edit Learning object issue - Similar issue was reported during the debugging in QADEV. The same code has been moved to Staging. Once the latest code moved to Staging, we can check.
		//		scorm2004.verifyEditAndCancelELearningObjectWithscorm2004();
		//		Reporter.writeSummary("FR1-2364_eLearnScorm2004_TC-002,Verify that Site admin is able to click Cancel and Edit the eLearning object with Scorm 2004," +scorm2004.getResult());
		//Ends
		scorm2004.verifyPreviewscorm2004();
		Reporter.writeSummary("FR1-2364_eLearnScorm2004_TC-003,Verify that Site admin is able to Preview the eLearning object with Scorm 2004," +scorm2004.getResult());
		scorm2004.verifyInvalidscorm2004();
		Reporter.writeSummary("FR1-2364_eLearnScorm2004_TC-004,Verify that Site admin is Not able to Upload the invalid Scorm file," +scorm2004.getResult());
		login.adminLogout();		
		siteAdminLogin(driver);
		scorm2004.createandEditCatalogBundleWitheLearningWithscorm2004("Add scorm2004");
		Reporter.writeSummary("FR1-2364_eLearnScorm2004_TC-005,Verify that Site admin is able to map the eLearning Object with Scorm 2004 to Bundle Catalog item," +scorm2004.getResult());
		login.adminLogout();
		login1(driver);
		scorm2004.userSearchElearningobjectWithscorm2004AndLaunch();
		Reporter.writeSummary("FR1-2364_eLearnScorm2004_TC-006,Verify that User is able to see the Scorm 2004 eLearning Object in Bundle Catalog item," +scorm2004.getResult());
		login.logOutUser();
		siteAdminLogin(driver); 
		scorm2004.verifyDeleteELearnignobjectWithscorm2004();
		Reporter.writeSummary("FR1-2364_eLearnScorm2004_TC-007,Verify that Site admin is able Delete an eLearning object with Scorm 2004," +scorm2004.getResult());
	}

	@Test(dataProviderClass=DataManager.class, dataProvider = "browers", groups = { "pilot"}, enabled = true,priority=0)
	public void TestHTMLlearningObjectCreation(String row, String strBrowserName) throws IOException{
		driver = BrowserFactory.getBrowser(strBrowserName);
		siteAdminLogin(driver); 
		LoginSteps login= new LoginSteps(driver);
		LearningObjectHTMLSteps HTMLSteps= new LearningObjectHTMLSteps(driver);
		HTMLSteps.verifyCreateHtmlLearningObject();
		Reporter.writeSummary("FR1-2207_HTMLLO_TC-001,Verify that Site admin is able to Create HTML Learning object," +HTMLSteps.getResult());
		//commented on 25-Feb-21 HTML LO edit is NOT working
		//		HTMLSteps.verifyEditAndCancelHTMLLearningObject();
		//		Reporter.writeSummary("FR1-2207_HTMLLO_TC-002,Verify that Site admin is able to click cancel and Edit the HTML Learning object," +HTMLSteps.getResult());
		//ends
		HTMLSteps.verifyFilterAndSearchHtmlLO();	
		Reporter.writeSummary("FR1-2207_HTMLLO_TC-003,Verify that Site admin is able to filter and search the HTML Learning object," +HTMLSteps.getResult());
		login.adminLogout();		
		siteAdminLogin(driver);
		HTMLSteps.createandEditCatalogBundleWithHTML("ADD HTML");
		Reporter.writeSummary("FR1-2207_HTMLLO_TC-004,Verify that Site admin is able to map the HTML Learning Object to Bundle Catalog item," +HTMLSteps.getResult());
		login.adminLogout();
		login1(driver); 
		HTMLSteps.userSearchHTMLLOAndLaunchHTML();
		Reporter.writeSummary("FR1-2207_HTMLLO_TC-005,Verify that Users able to see the HTML Learning Object in Bundle Catalog item," +HTMLSteps.getResult());
		login.logOutUser();
		//		wait(3);
		siteAdminLogin(driver); 
		//		wait(5);
		HTMLSteps.verifyDeleteHTMLLearnignobject();
		Reporter.writeSummary("FR1-2207_HTMLLO_TC-006,Verify that Site admin is able to Delete HTML Learning object," +HTMLSteps.getResult());
	}
	//commented on 25-Feb-21 HTML LO edit is NOT working
	//	@Test(dataProviderClass=DataManager.class, dataProvider = "browers", groups = { "pilot"}, enabled = true,priority=0)
	//	public void TestCatalogVersioning(String row, String strBrowserName) throws IOException{
	//		driver = BrowserFactory.getBrowser(strBrowserName);
	//		siteAdminLogin(driver); 
	//		LoginSteps login= new LoginSteps(driver);
	//		CatalogVersioningSteps steps = new CatalogVersioningSteps(driver);
	//		steps.createLearningObject();
	//		steps.createVersioningLearningObject();
	//		Reporter.writeSummary("FR1-2772_LearnObjVersion_TC-001,Verify the learning object creation and add new version," +steps.getResult());
	//		login.adminLogout();
	//		siteAdminLogin(driver); 
	//		steps.editCatalogToIncludeLearningObject("ADD","Ver");
	//		Reporter.writeSummary("FR1-2772_LearnObjVersion_TC-002,Verify the admin is able to map the Learning object to Independent option Catalog item," +steps.getResult());
	//		Reporter.writeSummary("FR1-2772_LearnObjVersion_TC-003,Verify the admin is able to map the Learning object to part of Catalog item," +steps.getResult());
	//		steps.verifyAssignedCatalogDetails(); 
	//		Reporter.writeSummary("FR1-2772_LearnObjVersion_TC-004,Verify the alert Pop-up while edit Mapped Learning Object," +steps.getResult());
	//		steps.deleteVersionLearningObject("","Ver1");
	//		Reporter.writeSummary("FR1-2772_LearnObjVersion_TC-005,Verify the admin is able to delete the Learning object (Ver1)," +steps.getResult());
	//		steps.deleteLearningObject("","Ver2");
	//		Reporter.writeSummary("FR1-2772_LearnObjVersion_TC-006,Verify the admin is able to delete the Learning object (Ver2)," +steps.getResult());
	//	}
	//Ends
	@Test(dataProviderClass=DataManager.class, dataProvider = "browers", groups = { "pilot" }, enabled = true, priority = 0 ,
			description = "")
	public void TestReOrdering (String row, String strBrowserName) throws Exception {
		driver = BrowserFactory.getBrowser(strBrowserName);
		InstructorBellNotificationSteps bellSteps = new InstructorBellNotificationSteps(driver);
		ReorderingCatalogItemsSteps reorder= new ReorderingCatalogItemsSteps(driver);
		siteAdminLogin(driver);
		reorder.verifyDragAndDrop();
		Reporter.writeSummary("FR1-2771_Reordering_TC-001,Verify the admin is able to Drag and drop the items for changing the order of the Catalog items," +reorder.getResult());
		reorder.verifyExistedandNewOrder();
		Reporter.writeSummary("FR1-2771_Reordering_TC-002,Verify the existing order is NOT affected other than the updated new order," +reorder.getResult());
		reorder.verifySuccessfullyUpdated();
		Reporter.writeSummary("FR1-2771_Reordering_TC-003,Verify the notification successful Pop-up Message after updating order of the catalog item," +reorder.getResult());
		wait(5);
		bellSteps.adminLogout();
		//Add the comment on 27-Feb-2021 Due to the subscription bug
		//		wait(5);
		//		doLoginUser(driver);
		//		reorder.verifyReorderUserMyLearning();
		//		Reporter.writeSummary("FR1-2771_Reordering_TC-004,Verify the user is able to see the latest order items in My Learning tab," +reorder.getResult());
		//Ends
	}	

	@Test(dataProviderClass=DataManager.class, dataProvider = "browers", groups = { "pilot" }, enabled = true, priority = 0 ,
			description = "Admin video and audio player testing")
	public void verifyvideo(String row, String strBrowserName) throws InterruptedException {
		driver = BrowserFactory.getBrowser(strBrowserName);
		siteAdminLogin(driver);
		AdminVideoandAudioTestSteps AdminVideoTestSteps=new AdminVideoandAudioTestSteps(driver);
		//		AdminVideoTestSteps.verifyVideoTester();
		//		print("Admin side video is working fine");
		AdminVideoTestSteps.verifyAudioTester();
		Reporter.writeSummary("FR-17_Admin_PodcastAudioPlayer_TC-001, Verify WebApp - Able to play audio files (MP3) and do podcasts.," +  AdminVideoTestSteps.getResult()); 
	}

	@Test(dataProvider = "browers", groups= {"pilot"}, enabled= true,
			description=""
			)
	public void testVideo(String row, String strBrowserName) throws IOException {
		driver = BrowserFactory.getBrowser(strBrowserName);
		loginToContentAdmin(driver);
		VideoFractalSteps videosteps = new VideoFractalSteps(driver);
		videosteps.goToVideoLO();
		Reporter.writeSummary("FR1-2774_VideoAdmin_TC_01,Verify navigation to creation of Video Learning Object.," +videosteps.getResult() );
		videosteps.videoFormatCheck();
		Reporter.writeSummary("FR1-2774_VideoAdmin_TC_02,Verify the fields in the video creation page.," +videosteps.getResult() );
		videosteps.linkFieldsCheck();
		Reporter.writeSummary("FR1-2774_VideoAdmin_TC_03,Verify the creation and validation of vide using link.," +videosteps.getResult() );
		videosteps.createVideoWithMP4();
		Reporter.writeSummary("FR1-2774_VideoAdmin_TC_04,Verify creation of video with mp4 format.," +videosteps.getResult() );
	}
}
