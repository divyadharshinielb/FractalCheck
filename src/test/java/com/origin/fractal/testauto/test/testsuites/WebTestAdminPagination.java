package com.origin.fractal.testauto.test.testsuites;



import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.origin.fractal.testauto.steps.AdminPaginationSteps;
import com.origin.fractal.testauto.steps.DeleteEventandClassroomSteps;
import com.origin.fractal.testauto.test.FractalBaseWebTest;
import com.wv.auto.framework.BrowserFactory;
import com.wv.auto.framework.utils.Reporter;
/* File Name: WebTestAdminPagination.java
 * Purpose: Check for pagination in admin side -FR1-2497
 * Number of Testcases: 4
 * Created by: DivyaDharshini
 * Created on: 28-July-2020
 */

public class WebTestAdminPagination extends FractalBaseWebTest {
	@DataProvider
	public  Object[][] browers() {
		return new Object[][] {
			new Object[] { "1", "chrome" }
		};
	}
	@Test(dataProvider = "browers", groups= {"pilot"}, enabled= true, description="")
	public void paginationAdmin(String row, String strBrowserName) throws Exception {
		driver = BrowserFactory.getBrowser(strBrowserName);
		AdminPaginationSteps adminstep = new AdminPaginationSteps(driver);
		loginToContentAdmin(driver);
		adminstep.paginationLearningObject();
		Reporter.writeSummary("FR1-2497_AdminPage_TC-001,Verify pagination for learning object page, " +  adminstep.getResult() );
		adminstep.learningobjectWithCategoryFilter();
		Reporter.writeSummary("FR1-2497_AdminPage_TC-002,Verify pagination for learning object page with filter, " +  adminstep.getResult() );
		adminstep.paginationCatalogPage();
		Reporter.writeSummary("FR1-2497_AdminPage_TC-003,Verify pagination for catalog object page, " +  adminstep.getResult() );
		adminstep.catalogpageWithCategoryFilter();
		Reporter.writeSummary("FR1-2497_AdminPage_TC-004,Verify pagination for catalog object page with filter, " +  adminstep.getResult() );
		DeleteEventandClassroomSteps delevnt = new DeleteEventandClassroomSteps(driver);
		delevnt.logoutAdmin();
		//wait(10); //added wait as it takes time to load
	
	}
}
