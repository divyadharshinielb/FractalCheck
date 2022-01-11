package com.origin.fractal.testauto.test.testsuites;

import java.io.IOException;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.origin.fractal.testauto.steps.AttachmentDownloadFromAssignmentSteps;
import com.origin.fractal.testauto.steps.MenuSteps;
import com.origin.fractal.testauto.steps.VenueSteps;
import com.origin.fractal.testauto.test.FractalBaseWebTest;
import com.wv.auto.framework.BrowserFactory;
import com.wv.auto.framework.utils.Reporter;

/*
 * File/class Name:WebTestCatalogUpdate.java
 * covers:This page covers all Test files functions of CatalogUpdatePage and CatalogUpdatestep 
 * Name of developer:Mahesh G
 * Completed date:25/6/2020
 */
public class WebTestAssignmentDownload extends FractalBaseWebTest{
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
	public void DownloadAssignment(String row, String strBrowserName) throws IOException {
		driver = BrowserFactory.getBrowser(strBrowserName);
		AttachmentDownloadFromAssignmentSteps attachmentDownloadSteps = new AttachmentDownloadFromAssignmentSteps(driver);
		VenueSteps venueSteps = new VenueSteps(driver);
		MenuSteps menuSteps = new MenuSteps(driver);
		loginToContentAdmin(driver);
		venueSteps.clickHomeMenu();
		menuSteps.gotoManageContents();
		attachmentDownloadSteps.catalogTab();
		attachmentDownloadSteps.viewCatalog();
		attachmentDownloadSteps.viewAssignment();
		attachmentDownloadSteps.downloadAttachment();
		attachmentDownloadSteps.verifyDownloadAttachment();
		Reporter.writeSummary("Assignment_Download_TC_001, Verify the download of assignment's attachment , " +  attachmentDownloadSteps.getResult() );

	}
}

