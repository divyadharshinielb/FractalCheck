package com.origin.fractal.testauto.steps;

import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBaseStep;
import com.origin.fractal.testauto.pages.VenuePage;

public class VenueSteps extends FractalBaseStep{
	public VenuePage page;
	public VenueSteps(WebDriver driver) {
		page = new VenuePage(driver);
		fBPage = page;
	}
	public void logout() {
		result ="PASSED";
		   try {
		     page.logout();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	public void clickMenu() {
		result ="PASSED";
		   try {
		     page.clickMenu();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}public void clickHomeMenu() {
		result ="PASSED";
		   try {
		     page.clickHomeMenu();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	public void createVenue() {
		result ="PASSED";
		   try {
			     page.createVenue();
			   }
			   catch(Exception e)
			   {
				e.printStackTrace();   
				result="FAILED";
			   }
		
	}
	public void mandatoryCheck() {
		result ="PASSED"; 
		try {
		     page.mandatoryCheck();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
		
	}
	public void invalidValidVenue() {
		result ="PASSED";
		try {
		     page.invalidValidVenue();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
		
	}
	public void editVenue() {
		result ="PASSED";
		try {
		     page.editVenue();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	public void deleteVenue() {
		result ="PASSED";
		try {
		     page.deleteVenue();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
		
	}
	public void validVenueName() {
		result ="PASSED";
		try {
		     page.validVenueName();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
		
	}
	public void countrySelection() {
		result ="PASSED";
		try {
		     page.countrySelection();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
		
	}
	public void citySelection() {
		result ="PASSED";
		try {
		     page.citySelection();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
		
	}
	public void validBuildingName() {
		result ="PASSED";
		try {
		     page.validBuildingName();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
		
	}
	public void invalidBuildingName() {
		result ="PASSED";
		try {
		     page.invalidBuildingName();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
		
	}
	public void validStreetName() {
		result ="PASSED";
		try {
		     page.validStreetName();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
		
	}
	public void invalidStreetName() {
		result ="PASSED";
		try {
		     page.invalidStreetName();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	public void saveButton() {
		result ="PASSED";
		try {
		     page.saveButton();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
		
	}
	public void cancelButton() {
		result ="PASSED";
		try {
		     page.cancelButton();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
		
	}
	public void searchFunction() {
		result ="PASSED";
		try {
		     page.searchFunction();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
		
	}
	
	

}
