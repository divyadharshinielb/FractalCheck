package com.origin.fractal.testauto.test.testsuites;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.origin.fractal.testauto.steps.HomeSteps;
import com.origin.fractal.testauto.steps.MyLearningSteps;
import com.origin.fractal.testauto.test.FractalBaseWebTest;
import com.wv.auto.framework.BrowserFactory;
import com.wv.auto.framework.utils.Reporter;

public class WebTestsMyLearning extends FractalBaseWebTest {

/*	@DataProvider
	public Object[][] browers() {
		return new Object[][] { 
		new Object[] { "1", "chrome" }
//		 new Object[] { "2", "firefox" }
//		 new Object[] { "3", "msedge" } 
//	new Object[] { "4", "ie11" }
		};
	}*/
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

	@Test(dataProvider = "browers", groups = { "pilot" }, enabled = true, description = "TCID_1,4,11,12: "
			+ "Verify navigation to My Learning page, " + "1: verify COmpletion Status(% Coverage)"
			+ "4: Verify all links(All, Bundles, Courses, Learning Paths and resources)"
			+ "11: Verify learning item page is opened when any of the particular course catalog item is clicked"
			+ "12: Verify Learning item page contains Course Name,joined on date and time, Description,Validity,Duration")
	public void testMyLearningPage0(String row, String strBrowserName) {
		driver = BrowserFactory.getBrowser(strBrowserName);
		login(driver);

		// Test moves to Home page
		HomeSteps homeSteps = new HomeSteps(driver);
		homeSteps.clickOnMyLearning();
		wait(5);

		// Test moves to MyLearning page
		MyLearningSteps mLSteps = new MyLearningSteps(driver);
		mLSteps.verifyMyLearningPage();//newui
		//TCID_4: Verify all links(All, Bundles, Courses, Learning Paths and resources)
		mLSteps.verifySubMenu();//newui
		Reporter.writeSummary("TCID_004, Verify all links(All Bundles Courses Learning Paths and resources), " +  mLSteps.getResult() );
		//TCID_1: verify COmpletion Status(% Coverage)
		mLSteps.verifyComplStatus();//newui
		Reporter.writeSummary("TCID_001, Verify COmpletion Status(% Coverage), " +  mLSteps.getResult() );
		//TCID_11: Verify learning item page is opened when any of the particular course catalog item is clicked
		mLSteps.verifyCatalogname();//newui
		Reporter.writeSummary("TCID_011, Verify learning item page is opened when any of the particular course catalog item is clicked, " +  mLSteps.getResult() );
		//TCID_12: Verify Learning item page contains Course Name,joined on date and time, Description,Validity,Duration
		mLSteps.verifyCatalogDetails();//newui
		Reporter.writeSummary("TCID_012,Verify Learning item page contains Course Name joined on date and time Description Validity Duration, " +  mLSteps.getResult() );
		mLSteps.clickLogout();
	}

	@Test(dataProvider = "browers", groups = { "pilot" }, enabled = true, description = "TCID_16,20,21,22: "
			+ "16:Verify course name" + "20:Verify All filter" + "21:Verify Bundle filter" + "22:Verify Course filter")
	public void testMyLearningPage1(String row, String strBrowserName) {
		driver = BrowserFactory.getBrowser(strBrowserName);
		login(driver);
		
		// Test moves to Home page
		HomeSteps homeSteps = new HomeSteps(driver);
		homeSteps.clickOnMyLearning();
		wait(5);

		// Test moves to MyLearning page
		MyLearningSteps mLSteps = new MyLearningSteps(driver);
		// To Verify the bundleContents 
		mLSteps.verifyCourseInBundle();//newui
		Reporter.writeSummary("TCID_016,Verify course name, " + mLSteps.getResult() );
		homeSteps.clickOnMyLearning();//newui
		//TCID_20:Verify All filter
		mLSteps.verifyAllFilter();//newui
		Reporter.writeSummary("TCID_020,Verify All filter, " + mLSteps.getResult() );
		//TCID_21:verify Bundle filter
		mLSteps.verifyBundleFilter();//newui
		Reporter.writeSummary("TCID_021,verify Bundle filter, " +  mLSteps.getResult() );
		//TCID_22:verify Course filter
		mLSteps.verifyCourseFilter();//newui
		Reporter.writeSummary("TCID_022,verify Course filter, " +  mLSteps.getResult());
		// To verify Resource filter
		mLSteps.verifyResourceFilter();//newui
		homeSteps.clickOnMyLearning();
		mLSteps.clickLogout();

	}

	@Test(dataProvider = "browers", groups = { "pilot" }, enabled = true, description = "TCID_25,5,8,14,6,7: "
			+ "25: Verify Tickmark for completed catalog item" + "5: Verify Category dropdown and Grid and List mode"
			+ "8: Verify Category items" + "14: Verify Rating for completed catalog item"
			+ "6,7: verify the Grid and List view items and functionality")
	public void testMyLearningPage2(String row, String strBrowserName) {
		driver = BrowserFactory.getBrowser(strBrowserName);
		login(driver);

		// Test moves to Home page
		HomeSteps homeSteps = new HomeSteps(driver);
		homeSteps.clickOnMyLearning();
		wait(5);
		// Test moves to MyLearning page
		MyLearningSteps mLSteps = new MyLearningSteps(driver);
		//TCID_25:Verify Tick mark for completed catalog item
		mLSteps.verifyTickmark();//newui 11/9/19
		Reporter.writeSummary("TCID_025,Verify Tick mark for completed catalog item, " +  mLSteps.getResult() );
		homeSteps.clickOnMyLearning();
		//TCID_8: Verify Category items
	    mLSteps.verifyCategory();//newui
		Reporter.writeSummary("TCID_008,Verify Category items, " +  mLSteps.getResult() );
		//TCID_6:verify the Grid view items and functionality
		mLSteps.verifyGridView();//newui
		Reporter.writeSummary("TCID_006,Verify the Grid view items and functionality, " +  mLSteps.getResult() );
	    //TCID_7:verify the List view items and functionality
		mLSteps.verifyListView();//newui
		Reporter.writeSummary("TCID_007,Verify the List view items and functionality, " +  mLSteps.getResult() );
		//TCID_5: Verify Category drop down and Grid and List mode
		mLSteps.verifyCategoryList();//newui
		Reporter.writeSummary("TCID_005,Verify Category drop down and Grid and List mode, " +  mLSteps.getResult() );
		//TCID_14:To verify the Ratings of completed catalog item 
		mLSteps.verifyRatings();//newuui 12/9/19
		Reporter.writeSummary("TCID_014,verify  the Ratings of completed catalog item , " +  mLSteps.getResult());
		mLSteps.clickLogout();
	}

	@Test(dataProvider = "browers", groups = { "pilot" }, enabled = true, description = "TCID_17,18,23,27 : "
			+ "17: Verify Bundle Details after clicking" + "18: Verify course Details after clicking"
			+ "23: Verify the learnig objeck launch" + "27: Verify the top arrow button")
	public void testMyLearningPage3(String row, String strBrowserName) {
		driver = BrowserFactory.getBrowser(strBrowserName);
		login(driver);

		// Test moves to Home page
		HomeSteps homeSteps = new HomeSteps(driver);
		homeSteps.clickOnMyLearning();
		wait(5);

		// Test moves to MyLearning page
		MyLearningSteps mLSteps = new MyLearningSteps(driver);
		//TCID_17:verify Labels of Bundles and courses
		mLSteps.verifyBundleContents();//newui
		Reporter.writeSummary("TCID_017,Verify Labels of Bundles and courses, " +  mLSteps.getResult() );
		homeSteps.clickOnMyLearning();
		//TCID_18:Verify course Details after clicking
		mLSteps.verifyCourseContents();//newui
		Reporter.writeSummary("TCID_018,Verify course Details after clicking, " +  mLSteps.getResult() );
		homeSteps.clickOnMyLearning();
		//TCID_23:verify Launch learning object launch
//		mLSteps.verifyLaunch();
		Reporter.writeSummary("TCID_023,verify Launch learning object launch , " +  mLSteps.getResult() );
		//TCID_27:Verify the top arrow button
//		mLSteps.verifyTopArrowBtn();
		Reporter.writeSummary("TCID_027,Checking whether the page is moving upwards when ^ button is clicked , " +  mLSteps.getResult() );
		mLSteps.clickLogout();
	}
	@Test(dataProvider = "browers", groups = { "pilot" }, enabled = true, description ="")
	public void testMyLearningPageClassroom(String row, String strBrowserName) {
		driver = BrowserFactory.getBrowser(strBrowserName);
		login(driver);

		// Test moves to Home page
		HomeSteps homeSteps = new HomeSteps(driver);
		homeSteps.clickOnMyLearning();
		wait(5);
	MyLearningSteps mLSteps = new MyLearningSteps(driver);
	mLSteps.verifyClassroomDetails();
	//dd mLSteps.verifyCancelRegistrationBtn();//newui
	Reporter.writeSummary("TC:6,Checking whether the cancel registration button are getting displayed on classroom asset, " +  mLSteps.getResult() );
	mLSteps.verifyDetailsBtn();//newui
	Reporter.writeSummary("TC:7,Checking whether the Details button are getting displayed on classroom asset, " +  mLSteps.getResult() );
	mLSteps.verifyAssignedClassroom();//newui
	Reporter.writeSummary("TC:5,The assigned calssrooms are getting displayed under bundle/course., " +  mLSteps.getResult() );
	mLSteps.verifyEventDisplayClassroomObject();//newui
	Reporter.writeSummary("TC:8,Checking whether the Event is displayed under classroom object, " +  mLSteps.getResult() );
	Reporter.writeSummary("TC:9,Checking whether the below details are present inside Event Date&Time Location Instructor name Register button," +  mLSteps.getResult() );
//	mLSteps.verifyTraditionalClassBtn();//newui
	Reporter.writeSummary("TC:10,The traditional class events should be displayed when clicking traditional class., " +  mLSteps.getResult() );
	mLSteps.verifyChooseEventBtn();//newui
	Reporter.writeSummary("TC:11,Checking whether the choose event button are getting displayed in calendar, " +  mLSteps.getResult() );
//dd	mLSteps.verifyEventRegistrationBtn();//newui
	Reporter.writeSummary("TC:13,the register button should be showing you are accepting the Terms & Conditions for this event by clicking on register.," +  mLSteps.getResult() );
	mLSteps.verifyClassrooomLabels();//newui
	Reporter.writeSummary("TC:12,Checking whether the below labels are present in classroom Pre-event Activities Reference Session Post-event Activities Terms & Conditions," +  mLSteps.getResult() );
}
}
