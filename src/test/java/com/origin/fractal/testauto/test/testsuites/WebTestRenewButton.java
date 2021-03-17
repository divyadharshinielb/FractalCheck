package com.origin.fractal.testauto.test.testsuites;
import org.testng.annotations.Test;

import com.origin.fractal.testauto.DataManager;
import com.origin.fractal.testauto.steps.RenewButtonSteps;
import com.origin.fractal.testauto.test.FractalBaseWebTest;
import com.wv.auto.framework.BrowserFactory;
import com.wv.auto.framework.utils.Reporter;
/* File Name: WebTestRenewButton.java
 * Purpose: Renew Button  -FR1-2777,FR1-2496
 * Number of Testcases: 5
 * Created by: DivyaDharshini
 * Created on: 03-July-2020
 * Data setup required: Automation_renew, Renew Check1
 */
public class WebTestRenewButton extends FractalBaseWebTest {
	/*@DataProvider
	public  Object[][] browers() {
		return new Object[][] {
			new Object[] { "1", "chrome" }
		};
	} 	*/
	@Test(dataProviderClass = DataManager.class,dataProvider="browers", groups= {"pilot"}, enabled= true, description="")
	public void renewButtonCheck(String row, String strBrowserName) throws Exception {
		driver = BrowserFactory.getBrowser(strBrowserName);
		login(driver);
		RenewButtonSteps renew = new RenewButtonSteps(driver);
	//	renew.searchpageRenewButton();
		Reporter.writeSummary("FR1-2496_Renew_TC-01,Verify the presence of renew button in search page," + renew.getResult() );
/*		renew.inprogressRenewbtnCheck();
		Reporter.writeSummary("FR1-2496_Renew_TC-02,Verify renew button in InProgress Page," + renew.getResult() );
		renew.completedRenewbtnCheck();*/
		Reporter.writeSummary("FR1-2496_Renew_TC-03,Verify renew button in  Completed page," + renew.getResult() );
		renew.whatsnewRenewBtnCheck();
		Reporter.writeSummary("FR1-2777_Renew_TC-01,Verify renew button in  WhatsNew and Dashboard page," + renew.getResult() );
		renew.categoryRenewBtnCheck();
		Reporter.writeSummary("FR1-2777_Renew_TC-02,Verify renew button after selecting category," + renew.getResult() );
	}
}

