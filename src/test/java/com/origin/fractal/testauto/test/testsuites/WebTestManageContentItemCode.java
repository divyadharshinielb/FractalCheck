// Created by Vignesh(WVI) 
// Last Updated on 26-Oct-19
package com.origin.fractal.testauto.test.testsuites;

import java.io.IOException;

import org.testng.annotations.Test;

import com.origin.fractal.testauto.DataManager;
import com.origin.fractal.testauto.steps.ManageContentItemCodesSteps;
import com.origin.fractal.testauto.test.FractalBaseWebTest;
import com.wv.auto.framework.BrowserFactory;
import com.wv.auto.framework.utils.Reporter;

public class WebTestManageContentItemCode extends FractalBaseWebTest  {
	@Test(dataProviderClass=DataManager.class, dataProvider = "browers", groups = { "Phase1.0" }, enabled = true, priority = 0 ,
			description = "TC_BothAU_ManageContent_LearnObj_Itemcode-01-07")
	public void verifyLearningObjectsItemcodes(String row, String strBrowserName) throws IOException {
		driver = BrowserFactory.getBrowser(strBrowserName);
		loginToContentAdmin(driver);
		ManageContentItemCodesSteps Itemcode= new ManageContentItemCodesSteps(driver);
		Itemcode.verifyAdminLearningObjects();
		login(driver);
		Itemcode.verifyUserLearningObjects();
		Reporter.writeSummary("------OVERALL TIME----- , Verify the Learning Objects Itemcode Both side (USER & ADMIN)," );
		//Learning Objects Itemcode verification -Both side
		Itemcode.verifyLOICeLearn();
		Reporter.writeSummary("TC_BothAU_ManageContent_LearnObj_Itemcode-01, Verify the eLearning Itemcode ," +  Itemcode.getResult());
		Itemcode.verifyLOICVideo();
		Reporter.writeSummary("TC_BothAU_ManageContent_LearnObj_Itemcode-02, Verify the Video Itemcode ," +  Itemcode.getResult());
		Itemcode.verifyLOICDocument();
		Reporter.writeSummary("TC_BothAU_ManageContent_LearnObj_Itemcode-03, Verify the Document Itemcode ," +  Itemcode.getResult());
		Itemcode.verifyLOICImage();
		Reporter.writeSummary("TC_BothAU_ManageContent_LearnObj_Itemcode-04, Verify the Image Itemcode ," +  Itemcode.getResult());
		Itemcode.verifyLOICAssessment();
		Reporter.writeSummary("TC_BothAU_ManageContent_LearnObj_Itemcode-05, Verify the Assessment Itemcode ," +  Itemcode.getResult());
		Itemcode.verifyLOICvLab();
		Reporter.writeSummary("TC_BothAU_ManageContent_LearnObj_Itemcode-06, Verify the vLab Itemcode ," +  Itemcode.getResult());
		Itemcode.verifyLOICAudio();
		Reporter.writeSummary("TC_BothAU_ManageContent_LearnObj_Itemcode-07, Verify the Audio Itemcode ," +  Itemcode.getResult());
	}

	@Test(dataProviderClass=DataManager.class, dataProvider = "browers", groups = { "Phase1.0" }, enabled = true, priority = 1 ,
			description = "TC_BothAU_ManageContent_Edited_LearnObj_Itemcode-08-14")
	public void editVerifyLearningObjectsItemcodes(String row, String strBrowserName) throws IOException {
		driver = BrowserFactory.getBrowser(strBrowserName);
		loginToContentAdmin(driver);
		ManageContentItemCodesSteps Itemcode= new ManageContentItemCodesSteps(driver);
		//Learning Objects Edited Itemcode verification -Both side
		Itemcode.editVerifyAdminLearningObjects();
		login(driver);
		Itemcode.editVerifyUserLearningObjects();
		Reporter.writeSummary("------OVERALL TIME----- , Edit & Verify the Learning Objects Itemcode Both side (USER & ADMIN)," );
		Itemcode.editVerifyLOICeLearn();
		Reporter.writeSummary("TC_BothAU_ManageContent_LearnObj_Itemcode-08, Edit & Verify the eLearning Itemcode ," +  Itemcode.getResult());
		Itemcode.editVerifyLOICVideo();
		Reporter.writeSummary("TC_BothAU_ManageContent_LearnObj_Itemcode-09, Edit & Verify the Video Itemcode ," +  Itemcode.getResult());
		Itemcode.editVerifyLOICDocument();
		Reporter.writeSummary("TC_BothAU_ManageContent_LearnObj_Itemcode-10, Edit & Verify the Document Itemcode ," +  Itemcode.getResult());
		Itemcode.editVerifyLOICImage();
		Reporter.writeSummary("TC_BothAU_ManageContent_LearnObj_Itemcode-11, Edit & Verify the Image Itemcode ," +  Itemcode.getResult());
		Itemcode.editVerifyLOICAssessment();
		Reporter.writeSummary("TC_BothAU_ManageContent_LearnObj_Itemcode-12, Edit & Verify the Assessment Itemcode ," +  Itemcode.getResult());
		Itemcode.editVerifyLOICvLab();
		Reporter.writeSummary("TC_BothAU_ManageContent_LearnObj_Itemcode-13, Edit & Verify the vLab Itemcode ," +  Itemcode.getResult());
		Itemcode.editVerifyLOICAudio();
		Reporter.writeSummary("TC_BothAU_ManageContent_LearnObj_Itemcode-14, Edit & Verify the Audio Itemcode ," +  Itemcode.getResult());
	}

	@Test(dataProviderClass=DataManager.class, dataProvider = "browers", groups = { "Phase1.0" }, enabled = true, priority = 2 ,
			description = "TC_BothAU_ManageContent_CatItem_Itemcode-15-19")
	public void verifyCatalogItemcodes(String row, String strBrowserName) throws IOException {
		driver = BrowserFactory.getBrowser(strBrowserName);
		loginToContentAdmin(driver);
		ManageContentItemCodesSteps Itemcode= new ManageContentItemCodesSteps(driver);
		//Catalog Itemcode verification -Both side
		Itemcode.verifyAdminCatalogItems();
		login(driver);
		Itemcode.verifyUserCatalogItems();
		Reporter.writeSummary("------OVERALL TIME----- ,Verify the Catalogs Itemcode Both side (USER & ADMIN)," );
		Itemcode.verifyCIICContBundle();
		Reporter.writeSummary("TC_BothAU_ManageContentCatItemItemcode-15, Verify the Content Bundle Itemcode," +  Itemcode.getResult());
		Itemcode.verifyCIICLearningPath();
		Reporter.writeSummary("TC_BothAU_ManageContentCatItemItemcode-16, Verify the Learning Path Itemcode," +  Itemcode.getResult());
		Itemcode.verifyCIICCourse();
		Reporter.writeSummary("TC_BothAU_ManageContentCatItemItemcode-17, Verify the Course Itemcode ," +  Itemcode.getResult());
		Itemcode.verifyCIICResource();
		Reporter.writeSummary("TC_BothAU_ManageContentCatItemItemcode-18, Verify the Resource Itemcode ," +  Itemcode.getResult());
		Itemcode.verifyCIICPodcast();
		Reporter.writeSummary("TC_BothAU_ManageContentCatItemItemcode-19, Verify the Podcast Itemcode ," +  Itemcode.getResult());
	}

	@Test(dataProviderClass=DataManager.class, dataProvider = "browers", groups = { "Phase1.0" }, enabled = true, priority = 3 ,
			description = "TC_BothAU_ManageContent_Edited_CatItem_Itemcode-20-24")
	public void editVerifyCatalogItemcodes(String row, String strBrowserName) throws IOException {
		driver = BrowserFactory.getBrowser(strBrowserName);
		loginToContentAdmin(driver);
		ManageContentItemCodesSteps Itemcode= new ManageContentItemCodesSteps(driver);
		//Catalog Edited Itemcode verification -Both side
		Itemcode.editVerifyAdminCatalogItems();
		login(driver);
		Itemcode.editVerifyUserCatalogItems();
		Reporter.writeSummary("------OVERALL TIME----- , Edit & Verify the Catalogs Itemcode Both side (USER & ADMIN)," );
		Itemcode.editVerifyCIICContBundle();
		Reporter.writeSummary("TC_BothAU_ManageContentCatItemItemcode-20, Edit & Verify the Content Bundle Itemcode ," +  Itemcode.getResult());
		Itemcode.editVerifyCIICLearningPath();
		Reporter.writeSummary("TC_BothAU_ManageContentCatItemItemcode-21, Edit & Verify the Learning Path Itemcode," +  Itemcode.getResult());
		Itemcode.editVerifyCIICCourse();
		Reporter.writeSummary("TC_BothAU_ManageContentCatItemItemcode-22, Edit & Verify the Course Itemcode ," +  Itemcode.getResult());
		Itemcode.editVerifyCIICResource();
		Reporter.writeSummary("TC_BothAU_ManageContentCatItemItemcode-23, Edit & Verify the Resource Itemcode ," +  Itemcode.getResult());
		Itemcode.editVerifyCIICPodcast();
		Reporter.writeSummary("TC_BothAU_ManageContentCatItemItemcode-24, Edit & Verify the Podcast Itemcode, " +  Itemcode.getResult());
	}
	
	@Test(dataProviderClass=DataManager.class, dataProvider = "browers", groups = { "Phase1.0" }, enabled = true, priority = 4 ,
			description = "Rename_ReEdit the itemcodes")
	public void renameItemCodes_LO_CI(String row, String strBrowserName) throws IOException {
		driver = BrowserFactory.getBrowser(strBrowserName);
		loginToContentAdmin(driver);
		ManageContentItemCodesSteps Itemcode= new ManageContentItemCodesSteps(driver);
		//ReEdit Learning Object & Catalog Items
		Itemcode.itemcoderenameLearningObject();
		Itemcode.itemcoderenameCatalog();
	}
}