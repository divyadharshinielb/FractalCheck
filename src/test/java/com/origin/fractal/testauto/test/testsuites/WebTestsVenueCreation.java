package com.origin.fractal.testauto.test.testsuites;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.origin.fractal.testauto.DataManager;
import com.origin.fractal.testauto.steps.VenueSteps;
import com.origin.fractal.testauto.test.FractalBaseWebTest;
import com.wv.auto.framework.BrowserFactory;
//import com.wv.auto.framework.utils.MyScreenRecorder;
import com.wv.auto.framework.utils.Reporter;

public class WebTestsVenueCreation extends FractalBaseWebTest {
	@Test(dataProviderClass=DataManager.class, dataProvider = "browers", groups= {"pilot"}, enabled= false, description = "Venue creation")
	public void ClassroomVenu(String row, String strBrowserName) throws Exception  {
		driver = BrowserFactory.getBrowser(strBrowserName);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//MyScreenRecorder.startRecording("navigationTest");
		loginToContentAdmin(driver);
		VenueSteps venueSteps = new VenueSteps(driver);
		venueSteps.clickHomeMenu();
		js.executeScript("window.scrollBy(0,1000)");
		venueSteps.clickMenu();
		Reporter.writeSummary("Venue_001, Verify the navigation to the Menu page., " +  venueSteps.getResult() );
		venueSteps.createVenue();
		Reporter.writeSummary("Venue_002, Verify the Venue page., " +  venueSteps.getResult() );
		venueSteps.countrySelection();
		Reporter.writeSummary("Venue_006, Verify the country-selection in Add Venue page, " +  venueSteps.getResult() );
		venueSteps.citySelection();
		Reporter.writeSummary("Venue_007, Verify  that  City should be enabled  after selecting the Country," +  venueSteps.getResult() );
		venueSteps.validBuildingName();
		Reporter.writeSummary("Venue_008, Verify Venue with valid Building Block name., " +  venueSteps.getResult() );
		venueSteps.validVenueName();	
		Reporter.writeSummary("Venue_004, Verify Venue creation with valid name, " +  venueSteps.getResult() );
		venueSteps.validStreetName();
		Reporter.writeSummary("Venue_010, Verify Venue creation with valid street name," +  venueSteps.getResult() );
		venueSteps.mandatoryCheck();
		Reporter.writeSummary("Venue_003, Verify Venue creation for mandatory fields, " +  venueSteps.getResult() );
		venueSteps.saveButton();
	//	MyScreenRecorder.stopRecording();
		Reporter.writeSummary("Venue_012, Verify Venue is submitted.," +  venueSteps.getResult() );	
	}
	@Test(dataProviderClass=DataManager.class, dataProvider = "browers", groups= {"pilot"}, enabled= false, description = "Venue creation")
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
	Reporter.writeSummary("Venue_005, Verify Venue creation with invalid venue., " +  venueSteps.getResult() );
	venueSteps.invalidBuildingName(); //15/4/2020
	Reporter.writeSummary("Venue_009, Verify Venue creation with blank building block name," +  venueSteps.getResult() );
	venueSteps.invalidStreetName();
	Reporter.writeSummary("Venue_011, Verify Venue creation with blank street area ," +  venueSteps.getResult() );
	venueSteps.cancelButton();
	Reporter.writeSummary("Venue_013, Verify the cancellation of Venue details on clicking Cancel button," +  venueSteps.getResult() );
	venueSteps.searchFunction();
	Reporter.writeSummary("Venue_014, Verify the Search functionality, " +  venueSteps.getResult() );
	venueSteps.editVenue();
	Reporter.writeSummary("Venue_016, verify whether the admin is able to edit the venue by clicking the edit icon., " +  venueSteps.getResult() );
	venueSteps.deleteVenue();
	Reporter.writeSummary("Venue_015, verify whether the admin is able to delete the venue by clicking the delete icon., " +  venueSteps.getResult() );
	}
}
