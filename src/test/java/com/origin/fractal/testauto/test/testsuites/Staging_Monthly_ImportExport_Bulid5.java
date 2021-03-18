package com.origin.fractal.testauto.test.testsuites;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.origin.fractal.testauto.DataManager;
import com.origin.fractal.testauto.steps.ImportExportSteps;
import com.origin.fractal.testauto.steps.UserInfoImportAndExportSteps;
import com.origin.fractal.testauto.steps.VenueSteps;
import com.origin.fractal.testauto.test.FractalBaseWebTest;
import com.wv.auto.framework.BrowserFactory;
import com.wv.auto.framework.utils.Reporter;

public class Staging_Monthly_ImportExport_Bulid5 extends FractalBaseWebTest{
	@DataProvider
	public Object[][] browers() {
		return new Object[][] {
			new Object[] { "1", "chrome" }
			//		 new Object[] { "2", "firefox" },
			//		 new Object[] { "3", "msedge" } ,
			//		 new Object[] { "4", "ie11" }
		};
	}
	@Test(dataProvider = "browers", groups = { "pilot", "Home" }, enabled = true,
			description = "")
	public void contentImportExportPage(String row, String strBrowserName) throws IOException {
		driver = BrowserFactory.getBrowser(strBrowserName);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		ImportExportSteps importExportSteps = new ImportExportSteps(driver);
		VenueSteps venueSteps = new VenueSteps(driver);
		loginToContentAdmin(driver);
		venueSteps.clickHomeMenu();
		importExportSteps.contentImport();
		Reporter.writeSummary("FR1-2355_ContentImportExport_TC-001,Verify admin is able to click Import button," +importExportSteps.getResult());
		importExportSteps.selectcatalog();
		Reporter.writeSummary("FR1-2355_ContentImportExport_TC-002,Verify admin is able to choose the catalog Item," +importExportSteps.getResult());
		importExportSteps.notStartedStatus();
		Reporter.writeSummary("FR1-2355_ContentImportExport_TC-003,Verify that Site admin is be able to assign Catalog item with Not started status by clicking on Import button," +importExportSteps.getResult());
		importExportSteps.inprogressStatus();
		Reporter.writeSummary("FR1-2355_ContentImportExport_TC-004,Verify that Site admin is be able to assign Catalog item with In progress status by clicking on Import button," +importExportSteps.getResult());
		importExportSteps.completedStatus();
		Reporter.writeSummary("FR1-2355_ContentImportExport_TC-005,Verify that Site admin is be able to assign Catalog item with Completed status by clicking on Import button," +importExportSteps.getResult());
		importExportSteps.invalidCatalogTypInprogress();
		Reporter.writeSummary("FR1-2355_ContentImportExport_TC-006,Verify that Site admin is able to assign Catalog type with In progress status by clicking on Import button," +importExportSteps.getResult());
		importExportSteps.invalidCatalogNameNotStarted();
		Reporter.writeSummary("FR1-2355_ContentImportExport_TC-007,Verify that Site admin is able to assign Catalog name with Not started status by clicking on Import button," +importExportSteps.getResult());
	}
	@Test(dataProviderClass=DataManager.class, dataProvider = "browers", groups = { "pilot"}, enabled = true,priority=0)
	public void AdminImportExport(String row, String strBrowserName) throws IOException {
		driver = BrowserFactory.getBrowser(strBrowserName);
		siteAdminLogin(driver);
		UserInfoImportAndExportSteps adminSteps=new UserInfoImportAndExportSteps(driver);
		adminSteps.verifyDownloadTemplate();
		Reporter.writeSummary("FR1-2356_AdminImportExport_TC-001,Verify admin is able to download the sample template .xlsx file," +adminSteps.getResult());
		adminSteps.verifyUserRadioBtn();
		Reporter.writeSummary("FR1-2356_AdminImportExport_TC-002,Verify admin is able to select the user type," +adminSteps.getResult());	
		adminSteps.verifyUploadTemplate();
		Reporter.writeSummary("FR1-2356_AdminImportExport_TC-003,Verify admin is able to upload the template .xlsx file," +adminSteps.getResult());	
		adminSteps.verifyInvalidUploadTemplate();
		Reporter.writeSummary("FR1-2356_AdminImportExport_TC-004,Verify admin is able to see the warning message. When upload the invalid template .xlsx file," +adminSteps.getResult());	
		adminSteps.verifyExportTemplate();
		Reporter.writeSummary("FR1-2356_AdminImportExport_TC-005,Verify admin is able to Export the template .xlsx file," +adminSteps.getResult());	
		adminSteps.verifyBtnExportTemplate();
		Reporter.writeSummary("FR1-2356_AdminImportExport_TC-006,Verify admin is NOT able to Export the template .xlsx file. when the users list is Zero," +adminSteps.getResult());	
		adminSteps.DeleteUser();
		Reporter.writeSummary("FR1-2356_AdminImportExport_TC-007,Verify admin is able to delete the imported user," +adminSteps.getResult());	

	}

}
