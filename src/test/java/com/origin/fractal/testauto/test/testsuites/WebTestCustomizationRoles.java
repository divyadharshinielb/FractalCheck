package com.origin.fractal.testauto.test.testsuites;



import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.origin.fractal.testauto.steps.CustomizationRolesSteps;
import com.origin.fractal.testauto.test.FractalBaseWebTest;
import com.wv.auto.framework.BrowserFactory;
import com.wv.auto.framework.utils.Reporter;
/* File Name: WebTestCustomizationRoles.java
 * Purpose: Check for creation and mapping of custom roles to user -FR1-2361
 * Number of Testcases: 9
 * Created by: DivyaDharshini
 * Created on: 02-June-2020
 */

public class WebTestCustomizationRoles extends FractalBaseWebTest {
	@DataProvider
	public  Object[][] browers() {
		return new Object[][] {
			new Object[] { "1", "chrome" }
		};
	}
	@Test(dataProvider = "browers", groups= {"pilot"}, enabled= true, description="")
	public void CustomizationOfRoles(String row, String strBrowserName) throws Exception {
		driver = BrowserFactory.getBrowser(strBrowserName);
		CustomizationRolesSteps rolestep = new CustomizationRolesSteps(driver);
		loginToContentAdmin(driver);
		rolestep.clickSettingsicon();
		rolestep.clickManageroles();
		Reporter.writeSummary("TC_CustomRole001, Click to manage roles in settings., "+ rolestep.getResult() );
		rolestep.addCustomRoleField();
		Reporter.writeSummary("TC_CustomRole002, Add custom role in Manageroles., "+ rolestep.getResult() );
		rolestep.roleNameValidation();
		Reporter.writeSummary("TC_CustomRole003, Custom role name validation with special characters.,"+ rolestep.getResult() );
		rolestep.roleCreationwithLearningadmin();
		Reporter.writeSummary("TC_CustomRole004, Creation of role with learning admin as parent role.,"+ rolestep.getResult() );
		rolestep.roleMappingToDirectUser();
		Reporter.writeSummary("TC_CustomRole005, Mapping the learningadmin role to Directuser., "+ rolestep.getResult() );
		rolestep.adminLogout();
		Reporter.writeSummary("TC_CustomRole006, Verify logout for admin after mapping the role to user., "+ rolestep.getResult() );	
		login(driver);
		rolestep.customRolemapForDirectUser();
		Reporter.writeSummary("TC_CustomRole007, Check for user with the custom role.,"+ rolestep.getResult() );
		rolestep.adminLogout();
		wait(5);
		loginToContentAdmin(driver);
		wait(10);
		rolestep.clickSettingsicon();
		rolestep.clickManageroles();
		rolestep.deleteAssignedRole();
		Reporter.writeSummary("TC_CustomRole008, Verify for deletion of role when it is assigned to a user., "+  rolestep.getResult() );
		rolestep.unassignRole();
		rolestep.clickSettingsicon();
		rolestep.clickManageroles();
		rolestep.deleteUnassignedRole();
		rolestep.adminLogout();
		Reporter.writeSummary("TC_CustomRole009,  Deletion of the created custom role after unassigning and logout of admin.,"+ rolestep.getResult() );

	}
}