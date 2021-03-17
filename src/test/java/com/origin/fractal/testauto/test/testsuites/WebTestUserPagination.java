package com.origin.fractal.testauto.test.testsuites;



import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.origin.fractal.testauto.steps.UserPaginationSteps;
import com.origin.fractal.testauto.test.FractalBaseWebTest;
import com.wv.auto.framework.BrowserFactory;
import com.wv.auto.framework.utils.Reporter;
/* File Name: WebTestUserPagination.java
 * Purpose: Check for pagination in user side -FR1-2498
 * Number of Test cases: 5
 * Created by: DivyaDharshini
 * Created on: 08-Aug-2020
 */

public class WebTestUserPagination extends FractalBaseWebTest {
	@DataProvider
	public  Object[][] browers() {
		return new Object[][] {
			new Object[] { "1", "chrome" }
		};
	}
	@Test(dataProvider = "browers", groups= {"pilot"}, enabled= true, description="")
	public void paginationUser(String row, String strBrowserName) throws Exception {
		driver = BrowserFactory.getBrowser(strBrowserName);
		login(driver);
		UserPaginationSteps userstep = new UserPaginationSteps(driver);
		userstep.categoryLoadMore();
		Reporter.writeSummary("FR1-2498_UserPage_TC-001,Verify pagination for category in user part, " +  userstep.getResult() );
		userstep.categoryLoadMoreWithFilter();
		Reporter.writeSummary("FR1-2498_UserPage_TC-002,Verify pagination for category with filter in user part , " +  userstep.getResult() );
		userstep.whatsnewLoadMore();
		Reporter.writeSummary("FR1-2498_UserPage_TC-003,Verify pagination for whatsnew in user part, " +  userstep.getResult() );
		userstep.whatsnewWithFilter();
		Reporter.writeSummary("FR1-2498_UserPage_TC-004,Verify pagination for whatsnew with filter in user part, " +  userstep.getResult() );
		userstep.globalsearchLoadMore();
		Reporter.writeSummary("FR1-2498_UserPage_TC-005,Verify pagination for Global search, " +  userstep.getResult() );

	}
}
