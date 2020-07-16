package com.origin.fractal.testauto.test.testsuites;




import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.origin.fractal.testauto.steps.DeleteEventandClassroomSteps;
import com.origin.fractal.testauto.steps.LanguageDefaultSteps;
import com.origin.fractal.testauto.test.FractalBaseWebTest;
import com.wv.auto.framework.BrowserFactory;
import com.wv.auto.framework.utils.Reporter;
/* File Name: WebTestLanguageDefault.java
 * Purpose: Check for Default language in admin and user part - FR1-2367
 * Number of Testcases: 5
 * Created by: DivyaDharshini
 * Created on: 25-June-2020
 */

public class WebTestLanguageDefault extends FractalBaseWebTest {
	@DataProvider
	public  Object[][] browers() {
		return new Object[][] {
			new Object[] { "1", "chrome" }
			//     ,  new Object[] { "2", "firefox" }
			//		, new Object[] { "3", "msedge" } 
			//		  new Object[] { "4", "ie11" }
		};
	}
	@Test(dataProvider = "browers", groups= {"pilot"}, enabled= true, description="")
	public void LanguageCheck(String row, String strBrowserName) throws Exception {
		driver = BrowserFactory.getBrowser(strBrowserName);
		loginToContentAdmin(driver);
		LanguageDefaultSteps langcheck = new LanguageDefaultSteps(driver);
		langcheck.learningitemLanguageCheck();
		Reporter.writeSummary("TCID_lang_001, Verify the default language in learning item page, " +  langcheck.getResult() );
		langcheck.catalogitemLanguageCheck();
		Reporter.writeSummary("TCID_lang_002, Verify the default language in catalog item page, " +  langcheck.getResult() );
		DeleteEventandClassroomSteps delevnt = new DeleteEventandClassroomSteps(driver);
		delevnt.logoutAdmin();
		wait(10); //added wait as it takes time to load
		login(driver);
		langcheck.whatsnewEnglishCheck();
		Reporter.writeSummary("TCID_lang_003, Verify the default language in whatsnew section, " +  langcheck.getResult() );
		langcheck.inprogressEnglishCheck();
		Reporter.writeSummary("TCID_lang_004, Verify the default language in in-progress section, " +  langcheck.getResult() );
		langcheck.completedEnglishCheck();
		Reporter.writeSummary("TCID_lang_005, Verify the default language in completed section, " +  langcheck.getResult() );
		//commented create Language function
		/*	langcheck.createLanguage();
		Reporter.writeSummary("TCID_lang_001, Verify clicking the Classroom icon displays the Classroom page, " +  langcheck.getResult() );
		langcheck.clickLanguageicon();*/


	}
}
