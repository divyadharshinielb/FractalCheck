package com.origin.fractal.testauto.test.testsuites;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.origin.fractal.testauto.DataManager;
import com.origin.fractal.testauto.steps.VenueSteps;
import com.origin.fractal.testauto.test.FractalBaseWebTest;
import com.wv.auto.framework.BrowserFactory;
import com.wv.auto.framework.utils.Reporter;

public class WebTestsVenueCreation extends FractalBaseWebTest {
	@Test(dataProviderClass=DataManager.class, dataProvider = "browers", groups= {"pilot"}, enabled= true, description = "Venue creation")
	public void ClassroomVenu(String row, String strBrowserName) throws IOException  {
		driver = BrowserFactory.getBrowser(strBrowserName);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		loginToContentAdmin(driver);
		VenueSteps venueSteps = new VenueSteps(driver);
		venueSteps.clickHomeMenu();
		js.executeScript("window.scrollBy(0,1000)");
		venueSteps.clickMenu();
		Reporter.writeSummary("Venue_001, Verify the whether the admin is able to navigate to menu page, " +  venueSteps.getResult() );
		venueSteps.createVenue();
		Reporter.writeSummary("Venue_002, Verify the admin is able to go to venue page., " +  venueSteps.getResult() );
		venueSteps.countrySelection();
		Reporter.writeSummary("Venue_006, Verify whether the admin is able to select the country from the country drop-down list., " +  venueSteps.getResult() );
		venueSteps.citySelection();
		Reporter.writeSummary("Venue_007,The city should be enabled only after selecting the country.," +  venueSteps.getResult() );
		venueSteps.validBuildingName();
		Reporter.writeSummary("Venue_008, Verify the venue creation page with the valid Building Block name., " +  venueSteps.getResult() );
		venueSteps.validVenueName();	
		Reporter.writeSummary("Venue_004, Verify the venue creation page with the valid venue name., " +  venueSteps.getResult() );
		venueSteps.validStreetName();
		Reporter.writeSummary("Venue_010,Verify the venue creation page with the valid street area name.," +  venueSteps.getResult() );
		venueSteps.mandatoryCheck();
		Reporter.writeSummary("Venue_003, Verify the mandatory check for all the fields, " +  venueSteps.getResult() );
		venueSteps.saveButton();
		Reporter.writeSummary("Venue_012,verify whether the admin is able to create a venue by clicking the SAVE button.," +  venueSteps.getResult() );	
	}
	@Test(dataProviderClass=DataManager.class, dataProvider = "browers", groups= {"pilot"}, enabled= true, description = "Venue creation")
	public void invalidTests(String row, String strBrowserName) throws IOException  {
		driver = BrowserFactory.getBrowser(strBrowserName);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		VenueSteps venueSteps = new VenueSteps(driver);
		loginToContentAdmin(driver);
		//VenueSteps venueSteps = new VenueSteps(driver);
		venueSteps.clickHomeMenu();
		js.executeScript("window.scrollBy(0,1000)");
		venueSteps.clickMenu();
	venueSteps.invalidValidVenue();
	Reporter.writeSummary("Venue_005, Verify the venue creation page with the Invalid venue name., " +  venueSteps.getResult() );
	venueSteps.invalidBuildingName();
	Reporter.writeSummary("Venue_009,Verify the venue creation page with the blank Building Block name.," +  venueSteps.getResult() );
	venueSteps.invalidStreetName();
	Reporter.writeSummary("Venue_011,Verify the venue creation page with the blank street area name.," +  venueSteps.getResult() );
	venueSteps.cancelButton();
	Reporter.writeSummary("Venue_013,verify whether the admin is able to cancel the venue details by clicking the CANCEL button.," +  venueSteps.getResult() );
	venueSteps.searchFunction();
	Reporter.writeSummary("Venue_014, Verify whether the search functionality., " +  venueSteps.getResult() );
	venueSteps.editVenue();
	Reporter.writeSummary("Venue_016, verify whether the admin is able to edit the venue by clicking the edit icon., " +  venueSteps.getResult() );
	venueSteps.deleteVenue();
	Reporter.writeSummary("Venue_015,verify whether the admin is able to delete the venue by clicking the delete icon., " +  venueSteps.getResult() );
	}
}
