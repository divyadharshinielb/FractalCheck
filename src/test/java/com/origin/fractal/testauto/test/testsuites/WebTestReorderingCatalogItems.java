package com.origin.fractal.testauto.test.testsuites;

import org.testng.annotations.Test;

import com.origin.fractal.testauto.DataManager;
import com.origin.fractal.testauto.steps.InstructorBellNotificationSteps;
import com.origin.fractal.testauto.steps.ReorderingCatalogItemsSteps;
import com.origin.fractal.testauto.test.FractalBaseWebTest;
import com.wv.auto.framework.BrowserFactory;
import com.wv.auto.framework.utils.Reporter;
/* File name: WebTestReorderingCatalogItems.java
 * Purpose: FR1-2772 catalog item reordering 
 * Number of Testcases: 04
 * Developed By: Vigneshwaran R
 * created on: 23-Sep-20
 * Updated Date: 25-Nov-20
 */
public class WebTestReorderingCatalogItems extends FractalBaseWebTest {
	@Test(dataProviderClass=DataManager.class, dataProvider = "browers", groups = { "pilot" }, enabled = true, priority = 0 ,
			description = "")
	public void TestReOrdering (String row, String strBrowserName) throws Exception {
		driver = BrowserFactory.getBrowser(strBrowserName);
		InstructorBellNotificationSteps bellSteps = new InstructorBellNotificationSteps(driver);
		ReorderingCatalogItemsSteps reorder= new ReorderingCatalogItemsSteps(driver);
		siteAdminLogin(driver);
		reorder.verifyDragAndDrop();
		Reporter.writeSummary("FR1-2771_Reordering_TC-001,Verify the admin is able to Drag and drop the items for changing the order of the Catalog items," +reorder.getResult());
		reorder.verifyExistedandNewOrder();
		Reporter.writeSummary("FR1-2771_Reordering_TC-002,Verify the existing order is NOT affected other than the updated new order," +reorder.getResult());
		reorder.verifySuccessfullyUpdated();
		Reporter.writeSummary("FR1-2771_Reordering_TC-003,Verify the notification successful Pop-up Message after updating order of the catalog item," +reorder.getResult());
		wait(5);
		bellSteps.adminLogout();
		//Add the comment on 27-Feb-2021 Due to the subscription bug
		//		wait(5);
		//		doLoginUser(driver);
		//		reorder.verifyReorderUserMyLearning();
		//		Reporter.writeSummary("FR1-2771_Reordering_TC-004,Verify the user is able to see the latest order items in My Learning tab," +reorder.getResult());
		//Ends
	}	

}
