package com.origin.fractal.testauto.test.testsuites;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.origin.fractal.testauto.steps.ManageContentSteps;
import com.origin.fractal.testauto.steps.MenuSteps;
import com.origin.fractal.testauto.test.FractalBaseWebTest;
import com.wv.auto.framework.BrowserFactory;
public class WebTestContentAdmin extends FractalBaseWebTest{
	@DataProvider
	public Object[][] browers() {
		return new Object[][] {
			new Object[] { "1", "chrome" }
//		, new Object[] { "2", "firefox" }
//		, new Object[] { "3", "msedge" } 
//		 new Object[] { "4", "ie11" }
		};
	}
	
	@Test(dataProvider = "browers", groups= {"pilot"}, enabled= true,
			description="TCID_61,62,64,63,66,67: "
			+ "Verify on clicking the Audio opens another pop-up to create an Audio object"
			+ "62: Verify  My Account Profile details,"
			+ "63:Verify the validation for all fields under profile"
			+ "64: verify the error message on leaving all the fields empty,"
			+ "66:Checking whether the new password is getting saved on changing and clicking the save button"
			+ "67: Verifying the changes should not be displayed on clciking Cancel")
	public void testMyAccountPage(String row, String strBrowserName) throws IOException {
		driver = BrowserFactory.getBrowser(strBrowserName);
		loginToContentAdmin(driver);
		MenuSteps menuSteps = new MenuSteps(driver);
		menuSteps.clickMenu();
		menuSteps.gotoManageContents();
		
		//Test moves to Manage Contents page
		//Verify on clicking the Audio opens another pop-up to create an Audio object
		ManageContentSteps mcSteps = new ManageContentSteps(driver);
		mcSteps.verifyAudioCreationPage();
		mcSteps.verifyMandatoryFieldsAlerMessage();
		wait(10);
		menuSteps.logout();
	}
@Test(dataProvider = "browers", groups= {"pilot"}, enabled= false, description = "")
	
	public void WebTestAdminSearch(String row, String strBrowserName) throws IOException {
		driver = BrowserFactory.getBrowser(strBrowserName);
		loginToContentAdmin(driver);
		MenuSteps menuSteps = new MenuSteps(driver);
		menuSteps.searchFieldAsset();
		menuSteps.searchFieldItemCode();	
   }

}
