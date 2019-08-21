package com.origin.fractal.testauto.steps;

import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBaseStep;
import com.origin.fractal.testauto.pages.ClassroomPage;
import com.origin.fractal.testauto.pages.VenuePage;

public class VenueSteps extends FractalBaseStep{
	public VenuePage page;
	public VenueSteps(WebDriver driver) {
		page = new VenuePage(driver);
		fBPage = page;
	}
	public void logout() {
		result ="Passed";
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
		result ="Passed";
		   try {
		     page.clickMenu();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}public void clickHomeMenu() {
		page.clickHomeMenu();
	}
	public void createVenue() {
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
