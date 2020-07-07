package com.origin.fractal.testauto.test.testsuites;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.origin.fractal.testauto.steps.ImportExportSteps;
import com.origin.fractal.testauto.steps.VenueSteps;
import com.origin.fractal.testauto.test.FractalBaseWebTest;
import com.wv.auto.framework.BrowserFactory;
import com.wv.auto.framework.utils.Reporter;

public class WebTestImportExport extends FractalBaseWebTest{
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
	public void importExportPage(String row, String strBrowserName) throws IOException {
		driver = BrowserFactory.getBrowser(strBrowserName);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		ImportExportSteps importExportSteps = new ImportExportSteps(driver);
		VenueSteps venueSteps = new VenueSteps(driver);
		loginToContentAdmin(driver);
		venueSteps.clickHomeMenu();
		js.executeScript("window.scrollBy(0,1000)");
		importExportSteps.GotoImportExport();
		importExportSteps.verifyImportExportText();
		Reporter.writeSummary("TCID_001, Verify that Site admin is able to see the Import/Export icon. and Breadcrumb, " +  importExportSteps.getResult() );
		importExportSteps.verifyUserTab();
		Reporter.writeSummary("TCID_002, Check for UserLabel, " +  importExportSteps.getResult() );
		importExportSteps.selectIndividualUser();
		importExportSteps.uploadBrowseFile();
		Reporter.writeSummary("TCID_003, Select individual user and upload file, " +  importExportSteps.getResult() );
		importExportSteps.selectGroups();
		Reporter.writeSummary("TCID_004, Verify that Users tab loads groups and upload file, " +  importExportSteps.getResult() );
		importExportSteps.selectBusinessUser();
		importExportSteps.SelectBusinessAdmin();
		importExportSteps.moreBusinessUsers();
		Reporter.writeSummary("TCID_005, Verify import button for business user and business admin after upload one file and multiple file, " +  importExportSteps.getResult() );

		//**20/5/2020**//
		importExportSteps.NotStartedStatus();
		Reporter.writeSummary("TCID_006, Verify that Site admin is be able to assign Catalog item with Not started status by clicking on Import button, " +  importExportSteps.getResult() );
		importExportSteps.InprogressStatus();
		Reporter.writeSummary("TCID_007, Verify that Site admin is be able to assign Catalog item with In progress status by clicking on Import button, " +  importExportSteps.getResult() );
		importExportSteps.CompletedStatus();
		Reporter.writeSummary("TCID_008, Verify that Site admin is be able to assign Catalog item with Completed status by clicking on Import button, " +  importExportSteps.getResult() );
		importExportSteps.allDirectUsers();
		Reporter.writeSummary("TCID_009, Verify that Site admin is be able to assign Catalog item for all direct users, " +  importExportSteps.getResult() );
		importExportSteps.ParticularGroupName();
		importExportSteps.allBusinessUsers();
		Reporter.writeSummary("TCID_010, Verify that when Site admin selects Business user under all business user groups, " +  importExportSteps.getResult() );
		//**21/5/2020**//
		importExportSteps.uploadFilesValidation();
		Reporter.writeSummary("TCID_011, Verify  error message on uploading files with invalid file formats, " +  importExportSteps.getResult() );
		importExportSteps.specialCharacters();
		Reporter.writeSummary("TCID_012, Verify error message on uploading files with special characters, " +  importExportSteps.getResult() );
		importExportSteps.LHwithInFirstSecondSheet();
		importExportSteps.LHwithInFirstSheet();
		Reporter.writeSummary("TCID_013, Verify error message for learning history in first and second sheet, " +  importExportSteps.getResult() );
		importExportSteps.clickHereLink();
		Reporter.writeSummary("TCID_014, Verify the presence of clickhere, " +  importExportSteps.getResult() );
		importExportSteps.InvalidCatalogTypNotStarted();
		Reporter.writeSummary("TCID_015, Verify that Site admin is able to assign Catalog type with Not started status by clicking on Import button, " +  importExportSteps.getResult() );
		importExportSteps.InvalidCatalogTypInprogress();
		Reporter.writeSummary("TCID_016, Verify that Site admin is able to assign Catalog type with In progress status by clicking on Import button, " +  importExportSteps.getResult() );
		importExportSteps.InvalidCatalogTypCompleted();
		Reporter.writeSummary("TCID_017, Verify that Site admin is able to assign Catalog type with Completed status by clicking on Import button, " +  importExportSteps.getResult() );
		importExportSteps.InvalidCatalogNameNotStarted();
		Reporter.writeSummary("TCID_018, Verify that Site admin is able to assign Catalog name with Not started status by clicking on Import button, " +  importExportSteps.getResult() );
		importExportSteps.InvalidCatalogNameInprogress();
		Reporter.writeSummary("TCID_019, Verify that Site admin is able to assign Catalog name with Not started status by clicking on Import button, " +  importExportSteps.getResult() );
		importExportSteps.InvalidCatalogNameCompleted();
		Reporter.writeSummary("TCID_020, Verify that Site admin is able to assign Catalog name with Not started status by clicking on Import button, " +  importExportSteps.getResult() );

	}
}
