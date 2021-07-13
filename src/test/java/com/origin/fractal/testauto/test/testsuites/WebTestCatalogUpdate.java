package com.origin.fractal.testauto.test.testsuites;

import java.io.IOException;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.origin.fractal.testauto.steps.CatalogUpdateSteps;
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
public class WebTestCatalogUpdate extends FractalBaseWebTest{
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
	@Test(dataProvider = "browers", groups = { "pilot", "Home" }, enabled = true,
			description = "")
	public void CatalogUpdatePhase1(String row, String strBrowserName) throws IOException {
		driver = BrowserFactory.getBrowser(strBrowserName);
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
	    /* already this code has included in updateEditCatalog function 13-04-2021*/
	//	catalogUpdateSteps.radioBtnchecked();
		Reporter.writeSummary("Catalog_TC_005, Verify the in-progress New user and all-user radio button while updation of catalog item , " +  catalogUpdateSteps.getResult() );
		catalogUpdateSteps.UpdateDetailsUserPart();
		Reporter.writeSummary("Catalog_TC_006, Verify the catalog title is updated in user part , " +  catalogUpdateSteps.getResult() );
		loginToContentAdmin(driver);
		venueSteps.clickHomeMenu();
		menuSteps.gotoManageContents();
		catalogUpdateSteps.saveValidation();
		Reporter.writeSummary("Catalog_TC_007, Verify updation of catalog item by unassigning content , " +  catalogUpdateSteps.getResult() );
	}
}

