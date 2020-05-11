package com.origin.fractal.testauto.test.testsuites;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.origin.fractal.testauto.DataManager;
import com.origin.fractal.testauto.steps.RolesManagementSteps;
import com.origin.fractal.testauto.test.FractalBaseWebTest;
import com.wv.auto.framework.BrowserFactory;
import com.wv.auto.framework.utils.Reporter;
public class WebTestRolesManagement extends FractalBaseWebTest {

	@DataProvider
	public Object[][] browers() {
		return new Object[][] { 
		new Object[] { "1", "chrome" }
//		 new Object[] { "2", "firefox" }
//		 new Object[] { "3", "msedge" } 
//	new Object[] { "4", "ie11" }
		};
	}
	@Test(dataProvider = "browers", groups= {"pilot"}, enabled= true, description = "")

	public void webTestRolesCheck(String row, String strBrowserName) throws IOException  {
		driver = BrowserFactory.getBrowser(strBrowserName);
	RolesManagementSteps rolesmngmtsteps = new RolesManagementSteps(driver);
	loginToContentAdmin(driver);
		rolesmngmtsteps.clickMenu();
		rolesmngmtsteps.clickClassroom();
		Reporter.writeSummary("TCID_RolesManagement_0013, Verify navigation of classroom page, " +  rolesmngmtsteps.getResult() );
		rolesmngmtsteps.addclassroomcheck();
		Reporter.writeSummary("TCID_RolesManagement_0014, Verify instructors present in Add classroom, " +  rolesmngmtsteps.getResult() );
		rolesmngmtsteps.editclassroomcheck();
		Reporter.writeSummary("TCID_RolesManagement_0015, Verify instructors present in Edit classroom, " +  rolesmngmtsteps.getResult() );
	/*	rolesmngmtsteps.editmanagerolefunctionality();*/
		rolesmngmtsteps.gotoManageUser();
		rolesmngmtsteps.BusinessUserRole();
		Reporter.writeSummary("TCID_RolesManagement_001, Verify roles mapped to business user in admin part, " +  rolesmngmtsteps.getResult() );
		rolesmngmtsteps.instructorUserRole();
		Reporter.writeSummary("TCID_RolesManagement_002, Verify roles mapped to instructor user in admin part, " +  rolesmngmtsteps.getResult() );
	    rolesmngmtsteps.businessAdminRole();
		Reporter.writeSummary("TCID_RolesManagement_003, Verify roles mapped to businessAdmin in admin part, " +  rolesmngmtsteps.getResult() );
		rolesmngmtsteps.siteAdminRole();
		Reporter.writeSummary("TCID_RolesManagement_004, Verify roles mapped to siteAdmin in admin part, " +  rolesmngmtsteps.getResult() );
		rolesmngmtsteps.directUserRole();
		Reporter.writeSummary("TCID_RolesManagement_005, Verify roles mapped to directUser in admin part, " +  rolesmngmtsteps.getResult() );
		rolesmngmtsteps.learningAdminRole();
		Reporter.writeSummary("TCID_RolesManagement_006, Verify roles mapped to learningAdmin in admin part, " +  rolesmngmtsteps.getResult() );
	
	}
	@Test(dataProviderClass=DataManager.class, dataProvider = "browers", groups = { "Phase1.0" }, enabled = true, description = "Roles")
	public void testroles(String row, String strBrowserName) {
		driver = BrowserFactory.getBrowser(strBrowserName);
		RolesManagementSteps rolesmngmtsteps = new RolesManagementSteps(driver);
       rolesmngmtsteps.DirectuserwithLearningadminandinsrole();
	   Reporter.writeSummary("TCID_RolesManagement_007, Verify direct user with learning admin and instructor role, " +  rolesmngmtsteps.getResult() );
		rolesmngmtsteps.Checkdirectuserinsandlearningadminmapping();
		Reporter.writeSummary("TCID_RolesManagement_008, Verify direct user mapping with learning admin and instructor role, " +  rolesmngmtsteps.getResult() );
	   rolesmngmtsteps.InstructorwithDirectuserrole();
		Reporter.writeSummary("TCID_RolesManagement_009, Verify Instructor with Directuser role mapping, " +  rolesmngmtsteps.getResult() );
		rolesmngmtsteps.SiteadminwithDirectuserRole();
		Reporter.writeSummary("TCID_RolesManagement_010, Verify siteadmin with direct role mapping, " + rolesmngmtsteps.getResult() );
		rolesmngmtsteps.LearningadminwithDirectuserrole();
		Reporter.writeSummary("TCID_RolesManagement_011, Verify learning admin with Direct role mapping, " +  rolesmngmtsteps.getResult() );
	//	rolesmngmtsteps.BusinessadminwithbusinessuserRole(); //11/5/2020
		Reporter.writeSummary("TCID_RolesManagement_012, Verify business admin with Business user, " +  rolesmngmtsteps.getResult() );
	//	rolesmngmtsteps.Businessuserwithinsrole();           //11/5/2020
		Reporter.writeSummary("TCID_RolesManagement_013, Verify Business user with Instructor role, " +  rolesmngmtsteps.getResult() );
		
	}
}
	