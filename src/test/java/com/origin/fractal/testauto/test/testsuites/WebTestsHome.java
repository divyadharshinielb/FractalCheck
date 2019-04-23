package com.origin.fractal.testauto.test.testsuites;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.origin.fractal.testauto.DataManager;
import com.origin.fractal.testauto.steps.HomeSteps;
import com.origin.fractal.testauto.steps.LoginSteps;
import com.origin.fractal.testauto.steps.MyLearningSteps;
import com.origin.fractal.testauto.test.FractalBaseWebTest;
import com.wv.auto.framework.BrowserFactory;
import com.wv.auto.framework.utils.Reporter;

public class WebTestsHome extends FractalBaseWebTest {
	
	@Test(dataProviderClass=DataManager.class, dataProvider = "browers", groups = { "pilot", "Home" }, enabled = true,
			// description="Verify categories are available as expected" )
			description = "TC_Verify Home Page has Learning in progress text, completion status, Continue text and button, recently"
					+ "added courses and arrow button at the top")
	public void testHomePage(String row, String strBrowserName) {
		driver = BrowserFactory.getBrowser(strBrowserName);
		login(driver);

		HomeSteps homeSteps = new HomeSteps(driver);
		//TCID_37:Checking whether the dash board contains the heading Learning in Progress
		homeSteps.verifyLearningInProgressText();
		Reporter.writeSummary("TCID_037,  Verify  whether the dash board contains the heading Learning in Progress, " +  homeSteps.getResult() );
		//TCID_40:Checking whether the button Continue is displayed under the heading Learning in Progress
		homeSteps.verifyComplStatus();
		Reporter.writeSummary("TCID_039,  whether the coverage percentage is shown with the text completed under Percentage, " +  homeSteps.getResult() );
      //TCID_33:The coverage percentage is shown with the text Coverage
        homeSteps.verifyCoverageText();
		Reporter.writeSummary("TCID_033,  Verify  The coverage percentage is shown with the text Coverage, " + homeSteps.getResult() );
		//TCID_41: Verify Continue Text are displayed
		homeSteps.verifyContinueText();
		Reporter.writeSummary("TCID_041,  Verify Continue Text are displayed, " + homeSteps.getResult() );
		Reporter.writeSummary("TCID_040,  Verify  whether the button Continue is displayed under the heading Learning in Progress, " +  homeSteps.getResult() );
		Reporter.writeSummary("TCID_032,  Verify  whether the button Continue is present for the text Learning in progress,"+ homeSteps.getResult() );
		homeSteps.clickContinueBtnRetToHome();
		//TCID_02: Verify  to My Home page data
		homeSteps.verifyHomePageData();
		Reporter.writeSummary("TCID_ 002,  Verify  to My Home page data, " + homeSteps.getResult() );
		//TCID_09:Verify progress of learning item in Home
		homeSteps.verifyLearningInprogress();
		Reporter.writeSummary("TCID_009, Verify progress of learning item in Home, " + homeSteps.getResult() );
		//TCID_10:Verify My Learning page details on clicking from Home Page
		homeSteps.verifyMyLearningLabeltext();
		Reporter.writeSummary("TCID_010,  Verify My Learning page details on clicking from Home Page, " + homeSteps.getResult() );
    	//TCID_13:Verification of View all page labels
		homeSteps.verifyViewAllPage(); 
		Reporter.writeSummary("TCID_013, Verification of View all page labels, " + homeSteps.getResult() );
		Reporter.writeSummary("TCID_035, Verify whether all the data are shown under the heading updates when view all button is clicked, " + homeSteps.getResult() );
		//TCID_34:Verify Privacy, Terms and Contact links
		homeSteps.verifyFooterLinks();
		Reporter.writeSummary("TCID_034, Verify Privacy Terms and Contact links, " + homeSteps.getResult() );
		//TCID_60:The page should be moving upwards when ^ button is clicked
		homeSteps.verifyTopArrBtn();
		Reporter.writeSummary("TCID_060, The page should be moving upwards when ^ button is clicked, " + homeSteps.getResult() );
		//Verify the Notifications page is getting displayed on clicking the Bell icon on the top right of the page next to profile icon. 
		homeSteps.verifyBellNotification();
		Reporter.writeSummary("TCID_069, Verify the Notifications page is getting displayed on clicking the Bell icon on the top right of the page next to profile icon, " + homeSteps.getResult() );
		Reporter.writeSummary("TCID_070, Verify whether All the Notifications are getting listed on clicking the All tab, " + homeSteps.getResult() ); 
		homeSteps.clickLogout();

	}

	@Test(dataProviderClass=DataManager.class, dataProvider = "browers", groups = { "pilot", "Home" }, enabled = false,
			description = "TC_nnnn Verify Home Page has Learning in progress text, completion status, Continue text and button, recently"
					+ "added courses and arrow button at the top")
	public void testHomePageVerifyRcntAddedCourseNavigation(String row, String strBrowserName) {
		driver = BrowserFactory.getBrowser(strBrowserName);
		login(driver);
		HomeSteps homeSteps = new HomeSteps(driver);
		homeSteps.verifyNavTORcntAddedCoursesRtnToHome();
		//TCID_43: Verify Recently Added courses displayed
		homeSteps.verifyRcntAdded_CoursesText();
		Reporter.writeSummary("TCID_043,  Verify  Recently Added courses displayed, " + homeSteps.getResult() );
		//TCID_31: Verify navigation to Home page
		homeSteps.verifySubHeaders();
		Reporter.writeSummary("TCID_031,  Verify navigation to Home page, " + homeSteps.getResult() );
		//TCID_15: Verify the functionality of "^" symbol
		homeSteps.verifyTopArrBtn();
		Reporter.writeSummary("TCID_015,  Verify the functionality of ^ > < symbol, " + homeSteps.getResult() );
		//TCID_15: Verify the functionality of ">" symbol
		homeSteps.verifyNextBtn();
		Reporter.writeSummary("TCID_015,  Verify the functionality of > symbol, " + homeSteps.getResult()  );
		//TCID_15: Verify the functionality of "<" symbol
		homeSteps.verifyPreviousBtn();
		Reporter.writeSummary("TCID_015,  Verify the functionality of < symbol, " +  homeSteps.getResult()  );
		//TCID_80:Verify the function of  Wish list icon
		homeSteps.verifyWishListBtn();
		Reporter.writeSummary("TCID_080, Verify the function of  Wish list icon, " +  homeSteps.getResult() );
		//TCID_79:Verify the function of  Cart  icon
		homeSteps.verifyCartItemBtn();
		Reporter.writeSummary("TCID_079,  Verify the function of  Cart  icon, " + homeSteps.getResult() );
		//TCID_3:Verify My Learning page is displayed after logging to app.
		homeSteps.verifyMyLearningPage();
		Reporter.writeSummary("TCID_003,  Verify My Learning page is displayed after logging to app, " +  homeSteps.getResult());
		//Verify LogoImage is displayed after logging to app
		homeSteps.verifyLogoImg();
		Reporter.writeSummary("TCID_084, Verify the functionality of the Logo displayed on the top left corner of the page., " +  homeSteps.getResult());
		homeSteps.clickLogout(); 

	}

	@Test(dataProviderClass=DataManager.class, dataProvider = "browers", groups = { "pilot", "Home" }, enabled = false,
			// description="Verify categories are available as expected" )
			description = "TCID_Verify filter in Home Page works for Recently Added and Recommeded Sections")
	public void testHomePageVerifyFiltersRcntRecommended(String row, String strBrowserName) {

		driver = BrowserFactory.getBrowser(strBrowserName);
		login(driver);

		HomeSteps homeSteps = new HomeSteps(driver);
        homeSteps.firstTwoCatalogItemsTitleCompare();
		Reporter.writeSummary("TCID_055, Checking whether two catalog items displayed in Recommended section matches with the first 2 items in the Most recently added section, " +   homeSteps.getResult() );
		//Verify the function of  Recently Added section attributes 
		homeSteps.recentlyAddedsectionAttributes();
		Reporter.writeSummary("TCID_082,  Verify the function of  Recently Added section attributes , " +   homeSteps.getResult() );
		// rep.report(strTCID, Severity, Module, strTCDesc, strResult);TCID_33:Checking whether the coverage percentage is shown with the text \"Coverage\"
		//TCID_42:The data should be shown under the topic Recently Added when All is clicked
		homeSteps.verifyAllFilterRcntAdded();
		Reporter.writeSummary("TCID_042,  Verify The data should be shown under the topic Recently Added when All is clicked, " +   homeSteps.getResult() );
		Reporter.writeSummary("TCID_057,  Verify whether Content Bundle Course Video and Learning path are shown  under Recently Added when All link is clicked, " +   homeSteps.getResult() );
		//TCID_43:The Bundles should be shown under the topic Recently Added when the link Bundles is clicked
		homeSteps.verifyBundleFilterRcntAdded();
		Reporter.writeSummary("TCID_043,  Verify  The Bundles should be shown under the topic Recently Added when the link Bundles is clicked, " + homeSteps.getResult() );
		//TCID_45:The courses should be shown under the topic Recently Added when the link courses is clicked
		homeSteps.verifyCourseFilterRcntAdded();
		Reporter.writeSummary("TCID_045,  Verify  The courses should be shown under the topic Recently Added when the link courses is clicked, " + homeSteps.getResult() );
		//TCID_46:The resources should be shown under the topic Recently Added when the link resources is clicked
		homeSteps.verifyResourceFilterRcntAdded();
		Reporter.writeSummary("TCID_046,  Verify The resources should be shown under the topic Recently Added when the link resources is clicked, " +   homeSteps.getResult() );
    	//TCID_44:The Learning paths should be shown under the topic Recently Added when the link Learning paths is clicked
		homeSteps.verifyLearnPathFilterRcntAdded();
		Reporter.writeSummary("TCID_044,  Verify The Learning paths should be shown under the topic Recently Added when the link Learning paths is clicked, " +   homeSteps.getResult() );
		//TCID_47:The data should be shown under the topic Recommended content when All is clicked
		homeSteps.verifyAllFilterRecommAdded();
		Reporter.writeSummary("TCID_047,  Verify The data should be shown under the topic Recommended content when All is clicked, " +   homeSteps.getResult() );
		//TCID_50:The courses should be shown under the topic Recommended content when the link courses is clicked
		homeSteps.verifyCourseFilterRecommAdded();
		Reporter.writeSummary("TCID_050,  Verify  The courses should be shown under the topic Recommended content when the link courses is clicked, " +   homeSteps.getResult() );
		//TCID_58:The Bundles should be shown under the topic Recommended content when the link Bundles is clicked
		homeSteps.mostPopularCount();
		Reporter.writeSummary("TCID_058,  Check whether only 4 catalog items are shown under \"Most Popular\" section, " +   homeSteps.getResult() );
		homeSteps.recentlyCount();
		Reporter.writeSummary("TCID_056,  Checking whether only 2 catalog items  are shown under the topic \"Recommended\" , " +   homeSteps.getResult() );
		homeSteps.verifyBundleFilterRecommAdded();
		Reporter.writeSummary("TCID_048,  Verify The Bundles should be shown under the topic Recommended content when the link Bundles is clicked, " +   homeSteps.getResult() );
		//TCID_51:The resources should be shown under the topic Recommended content when the link resources is clicked
		homeSteps.verifyResourceFilterRecommAdded();// Data not present
		Reporter.writeSummary("TCID_051,  Verify The resources should be shown under the topic Recommended content when the link resources is clicked, " +   homeSteps.getResult() );
		//TCID_49:The LearnPaths should be shown under the topic Recommended content when the link LearnPaths is clicked
		homeSteps.verifyLearnPathFilterRecommAdded(); // Data not present
		Reporter.writeSummary("TCID_049,  Verify The LearnPaths should be shown under the topic Recommended content when the link LearnPaths is clicked, " +   homeSteps.getResult() );
		homeSteps.recentlyAddedsectionAttributes();
		homeSteps.clickLogout();
	
	}
	@Test(dataProviderClass=DataManager.class, dataProvider = "browers", groups = { "pilot", "Home" }, enabled = false,
			// description="Verify categories are available as expected" )
			description = "TCID_Verify filter in Home Page works for Recently Added and Recommeded Sections")
	public void testHomePageVerifyFiltersForKOandMostAdded(String row, String strBrowserName) {
		driver = BrowserFactory.getBrowser(strBrowserName);
		login(driver);

		HomeSteps homeSteps = new HomeSteps(driver);

		//TCID_52:The data should be shown under the topic Most consumed content when All is clicked
		homeSteps.verifyAllFilterMostAdded();
		Reporter.writeSummary("TCID_052,  Verify The data should be shown under the topic Most consumed content when All is clicked, " +  homeSteps.getResult() );
		//TCID_53:The Bundles should be shown under the topic Most consumed content when the link Bundles is clicked
		homeSteps.verifyBundleFilterMostAdded();
		Reporter.writeSummary("TCID_053,  Verify The Bundles should be shown under the topic Most consumed content when the link Bundles is clicked, " + homeSteps.getResult() );
		//TCID_54:The LearnPaths should be shown under the topic Most consumed content when the link  LearnPaths is clicked
		homeSteps.verifyLearnPathFilterMostAdded();
		Reporter.writeSummary("TCID_054,  Verify The LearnPaths should be shown under the topic Most consumed content when the link  LearnPaths is clicked, " + homeSteps.getResult() );
		//TCID_55:The Courses should be shown under the topic Most consumed content when the link  Courses is clicked
		homeSteps.verifyCourseFilterMostAdded(); //Data not present
		Reporter.writeSummary("TCID_055,  Verify The Courses should be shown under the topic Most consumed content when the link  Courses is clicked, " +  homeSteps.getResult() );
		//TCID_56:The Resources should be shown under the topic Most consumed content when the link Resources is clicked
		homeSteps.verifyResourceFilterMostAdded(); //Data not present
		Reporter.writeSummary("TCID_056,  Verify The Resources should be shown under the topic Most consumed content when the link Resources is clicked, " +  homeSteps.getResult() );
		homeSteps.clickLogout();
	}
	@Test(dataProviderClass=DataManager.class, dataProvider = "browers", groups = { "pilot" }, enabled = false,
			// description="Verify categories are available as expected" )
			description = "TCID_33:Checking whether the coverage percentage is shown with the text \"Coverage\""
					+ "TCID_35:All the data should be shown under the heading \"Recently Added\" when \"view all\" button is clicked"
					+ "TCID_37:Checking whether the dashboard contains the heading \"Learning in Progress\" "
					+ "TCID_39:Checking whether the coverage percentage is shown with the  \"Percentage\""
					+ "TCID_40:Checking whether the button \"Continue\" is displayed under the heading \"Learning in Progress\""
					+ "TCID_41:The course details page should be displayed when \"Continue\" button is clicked under the heading \"Content in Progress\""
					+ "TCID_42:The \" Bundle\",\"Course\",\"Resources\" and \"Learning path\" should be shown under the topic \"Recently Added\" when \"All\" is clicked"
					+ "TCID_43:The \"Bundles\" should be shown under the topic \"Recently Added\" when the link \" Bundles\" is clicked"
					+ "TCID_44:The \"Learning paths\" should be shown under the topic \"Recently Added\" when the link \"Learning paths\" is clicked"
					+ "TCID_45:The \"courses\" should be shown under the topic \"Recently Added\" when the link \"courses\" is clicked"
					+ "TCID_46:The \"resources\" should be shown under the topic \"Recently Added\" when the link \"resources\" is clicked"
					+ "TCID_47:Checking whether the \"Content Bundle\",\"Course\",\"Resources\" and \"Learning path\" are shown under the topic \"Recommended content\" when \"All\" is clicked"
					+ "TCID_48:Checking whether only the \"Content Bundles\" are shown under the topic \"Recommended \" when the link \"Content Bundles\" is clicked"
					+ "TCID_49:The \"Learning paths\" should be shown under the topic \"Recommended content\" when the link \"Learning paths\" is clicked"
					+ "TCID_50:The \"courses\" should be shown under the topic \"Recommended content\" when the link \"courses\" is clicked"
					+ "TCID_51:The \"resources\" should be shown under the topic \"Recommended content\" when the link \"resources\" is clicked"
					+ "TCID_52:The \"Content Bundle\",\"Course\",\"Video\" and \"Learning path\" should be shown under the topic \"Most consumed content\" when \"All\" is clicked"
					+ "TCID_60:The page should be moving upwards when \"^\" button is clicked"
					+ "TCID_15:Verify the functionality of \"<\", \">\" and \"^\" symbols."
					+ "TCID_79:Verify the function of  Cart  icon " + "TCID_80:Verify the function of  Wishlist icon "
					+ "TCID_3:Verify My Learning page is displayed after logging to app. ")
	public void testHomePageX(String row, String strBrowserName) {
		driver = BrowserFactory.getBrowser(strBrowserName);
		login(driver);
		
	}
  /*****New features added for this build 2/2/19****/
	@Test(dataProviderClass=DataManager.class, dataProvider = "browers", groups = { "pilot" }, enabled = false,description ="")
	public void testHome1(String row, String strBrowserName) {
		driver = BrowserFactory.getBrowser(strBrowserName);
		login(driver);

		HomeSteps homeSteps = new HomeSteps(driver);
    	homeSteps.verifyEnrolledText();
    	Reporter.writeSummary("TCID_085,  Check whether the Enrolled text is displayed in free item , " +  homeSteps.getResult() );
		homeSteps.verifyAllLanguage();
		Reporter.writeSummary("TCID_086,  Check whether the All language is present in my learning section, " +  homeSteps.getResult() );
	//	homeSteps.lastFourCatalogItemsTitleCompare();
		Reporter.writeSummary("TCID_059,  Check whether the last 4 items in the Recently Added lists gets displayed in the \"Most Popular\" section, " +  homeSteps.getResult() );
	}
	//*****This feature will be working only in future as of now it will not work********//
			@Test(dataProviderClass=DataManager.class, dataProvider = "browers", groups = { "pilot" }, enabled = false,description ="")
			public void testHomeItemSearch(String row, String strBrowserName) {
				driver = BrowserFactory.getBrowser(strBrowserName);
				login(driver);

				HomeSteps homeSteps = new HomeSteps(driver);
				homeSteps.searchFieldItemCodeUser();
		  /*  	homeSteps.verifyEnrolledText();
				homeSteps.verifyAllLanguage();
				homeSteps.lastFourCatalogItemsTitleCompare();
				
		*/	}
			//*****added by mahesh******//
		@Test(dataProviderClass=DataManager.class, dataProvider = "browers", groups= {"pilot"}, enabled= false, description = "")
		public void testAccessTheCatalogpage(String row, String strBrowserName) {
			driver = BrowserFactory.getBrowser(strBrowserName);
			login(driver);
			HomeSteps homeSteps = new HomeSteps(driver);
			homeSteps.AccessCatalogItemEnrolledOutside();
			Reporter.writeSummary("TCID_April_1, Checking whether the contents are accessible independently ," +  homeSteps.getResult());
			homeSteps.AccessCatalogItemEnrolledInside();
			Reporter.writeSummary("TCID_April_2, Checking whether the contents are accessible inside the bundle that is enrolled," +  homeSteps.getResult());
		//	homeSteps.AccessCatalogItemEnrollInside();
		//	Reporter.writeSummary("TCID_April_3, Checking whether the contents are accessible inside the bundle that is not yet Enrolled," +  homeSteps.getResult());
		}
		//**************************//
		@Test(dataProviderClass=DataManager.class, dataProvider = "browers", groups= {"pilot"}, enabled= false, description = "")
		public void testTimeline(String row, String strBrowserName) {
			driver = BrowserFactory.getBrowser(strBrowserName);
			login(driver);
			HomeSteps homeSteps = new HomeSteps(driver);
		    homeSteps.TimelineCompletionCriteriaOption();
		    homeSteps.verifyReadMoreLessText();
		    Reporter.writeSummary("TCID_April_4, Checking whether the read more works fine," +  homeSteps.getResult());
		}
		@Test(dataProviderClass=DataManager.class, dataProvider = "browers", groups= {"pilot"}, enabled= false)
		public void testMyAccountPage(String row, String strBrowserName) {
			driver = BrowserFactory.getBrowser(strBrowserName);
			LoginSteps loginSteps = new LoginSteps(driver);
			MyLearningSteps mLSteps = new MyLearningSteps(driver);
			loginSteps.doLogin();
			mLSteps.globalSearchCount();
			Reporter.writeSummary("TCID_April_5, Checking whether the global search works fine," +  mLSteps.getResult());
			mLSteps.clickLogout();		
		}
}
