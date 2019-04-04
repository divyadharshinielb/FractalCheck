package com.origin.fractal.testauto.test.testsuites;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.origin.fractal.testauto.steps.AccountSteps;
import com.origin.fractal.testauto.test.FractalBaseWebTest;
import com.wv.auto.framework.BrowserFactory;
import com.wv.auto.framework.utils.Reporter;

public class WebTestsAccount extends FractalBaseWebTest {

	@DataProvider
	public Object[][] browers() {
		return new Object[][] {
//			new Object[] { "1", "chrome" }
		 new Object[] { "2", "firefox" }
//		, new Object[] { "3", "msedge" } 
//		 new Object[] { "4", "ie11" }
//		 new Object[] { "4", "safari" }
		};
	}
	
	@Test(dataProvider = "browers", groups= {"pilot"}, enabled= true, 
			description="TCID_61,62,64,63,66,67: "
			+ "61: Verify  My account page, "
			+ "62: Verify  My Account Profile details,"
			+ "63:Verify the validation for all fields under profile"
			+ "64: verify the error message on leaving all the fields empty,"
			+ "66:Checking whether the new password is getting saved on changing and clicking the save button"
			+ "67: Verifying the changes should not be displayed on clciking Cancel")
public void testMyAccountPage(String row, String strBrowserName) {
	driver = BrowserFactory.getBrowser(strBrowserName);
	login(driver);
	AccountSteps accountSteps = new AccountSteps(driver);
	//TCID_61: Verify  My account page
	accountSteps.clickOnMyAccount();
	//TCID_61: Verify  My account page
	accountSteps.verifyAccountPageLabels();
	Reporter.writeSummary("TCID_061,  Verify  My account page, " +  accountSteps.getResult() );
	//TCID_62: Verify  My Account Profile details
	accountSteps.verifyProfileDetails();
	Reporter.writeSummary("TCID_062,  Verify  My Account Profile details, " +  accountSteps.getResult() );
	//TCID_64: verify the error message on leaving all the fields empty
	accountSteps.verifyEmptyProfileValidation();
	Reporter.writeSummary("TCID_064,  Verify the error message on leaving all the fields empty, " +  accountSteps.getResult() );
	//TCID_67: Verifying the changes should not be displayed on clicking Cancel
	accountSteps.verifyAfterCancelValidation();
	Reporter.writeSummary("TCID_067,  Verify the changes should not be displayed on clicking Cancel, " +  accountSteps.getResult() );
	//TCID_63:Verify the validation for all fields under profile
	accountSteps.verifyFieldValidation();//63
	Reporter.writeSummary("TCID_063,  Verify the validation for all fields under profile, " + accountSteps.getResult() );
	//TCID_66:Verify whether the new password is getting saved on changing and clicking the save button
	//accountSteps.changePassword();
	//Reporter.writeSummary("TCID_066,  Verify whether the new password is getting saved on changing and clicking the save button, " + accountSteps.getResult() );
}
	@Test(dataProvider = "browers", groups= {"pilot"}, enabled= true, 
			description="TCID_68:"
					+ "68:Checking whether the user is able to login with the new password")
	public void testMyAccountPage1(String row, String strBrowserName) {
		
		driver = BrowserFactory.getBrowser(strBrowserName);
		login1(driver);
		AccountSteps accountSteps = new AccountSteps(driver);
	//	accountSteps.clickOnMyAccount();
		//TCID_68:Checking whether the user is able to login with the new password
	//	accountSteps.afterChangePassword();
		Reporter.writeSummary("TCID_068,  Verify whether the user is able to login with the new password, " + accountSteps.getResult() );
	}

}
