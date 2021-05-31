package com.origin.fractal.testauto.test.testsuites;



import java.io.IOException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.origin.fractal.testauto.DataManager;
import com.origin.fractal.testauto.steps.ClassLearningObjectSteps;
import com.origin.fractal.testauto.steps.CustomizationRolesSteps;
import com.origin.fractal.testauto.test.FractalBaseWebTest;
import com.wv.auto.framework.BrowserFactory;
import com.wv.auto.framework.utils.Reporter;
/* File Name: WebTestClassLearningObject.java
 * Purpose: FR1-3774 - Class Learning object creation and deletion
 * Number of Testcases: 3
 * Created by: DivyaDharshini R
 * Created on: 05-03-2021
 * updated on: 25-03-2021
 */
public class WebTestClassLearningObject extends FractalBaseWebTest {
	//edited by divya from here
	@DataProvider
	public Object[][] browers() {
		if(BrowserFactory.getOS().equalsIgnoreCase("win")) {
			return new Object[][] {
				//new Object[] { "1", "msedge" }, 
				new Object[] { "2", "Chrome" },
				//new Object[] { "3", "Firefox" }
			};
		}

		if(BrowserFactory.getOS().equalsIgnoreCase("mac")) {
			return new Object[][] {
				new Object[] { "1", "safari" }
			};
		}
		return null;
	}//ended by divya

	@Test(dataProviderClass = DataManager.class,dataProvider="browers", groups= {"pilot"}, enabled= true, description="")
	public void testCatalogCreation(String row, String strBrowserName) throws IOException {
		driver = BrowserFactory.getBrowser(strBrowserName);
		loginToContentAdmin(driver);
		ClassLearningObjectSteps classSteps = new ClassLearningObjectSteps(driver);
		CustomizationRolesSteps rolestep = new CustomizationRolesSteps(driver);
		classSteps.classLOEmptyFieldValidation();
		Reporter.writeSummary("FR1-3774_TCID_class_01,Verify the empty field validation of class , " +  classSteps.getResult() );
		classSteps.classLOInvalidLinkValidation();
		Reporter.writeSummary("FR1-3774_TCID_class_02,Verify the invalid link of class , " +  classSteps.getResult() );
		classSteps.classLOCreation();
		Reporter.writeSummary("FR1-3774_TCID_class_03,Verify the creation of Class LO  , " +  classSteps.getResult() );
		classSteps.editAndDeleteClassLO();
		Reporter.writeSummary("FR1-3774_TCID_class_04,Verify Edit and Delete of Class LO  , " +  classSteps.getResult() );
		rolestep.adminLogout();
		//userpart
		login(driver);
		classSteps.userPartClassLO();
		Reporter.writeSummary("FR1-3774_TCID_class_05,Verify the presence of Class LO in User part , " +  classSteps.getResult() );
	}
}