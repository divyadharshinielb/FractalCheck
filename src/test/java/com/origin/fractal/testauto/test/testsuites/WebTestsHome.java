package com.origin.fractal.testauto.test.testsuites;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.origin.fractal.testauto.steps.HomeSteps;
import com.origin.fractal.testauto.test.FractalBaseWebTest;
import com.wv.auto.framework.BrowserFactory;
import com.wv.auto.framework.utils.Reporter;

public class WebTestsHome extends FractalBaseWebTest {

//edit by divya on 23rd sept 2019
	/*@DataProvider
	public Object[][] browers() {
		return new Object[][] {
		new Object[] { "1", "chrome" }
//		 ,new Object[] { "2", "firefox" },
//		 new Object[] { "3", "msedge" } ,
//		 new Object[] { "4", "ie11" }
		};
	}*/
	//added by divya on 23rd sept 2019
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
		}//ended by divya on 23rd sept 2019
	
	@Test(dataProvider = "browers", groups = { "pilot", "Home" }, enabled = true,
			// description="Verify categories are available as expected" )
			description = "TC_Verify Home Page has Learning in progress text, completion status, Continue text and button, recently"
					+ "added courses and arrow button at the top")
	public void testHomePage(String row, String strBrowserName) {
		driver = BrowserFactory.getBrowser(strBrowserName);
		login(driver);

		HomeSteps homeSteps = new HomeSteps(driver);
		//TCID_37:Checking whether the dash board contains the heading Learning in Progress
		homeSteps.verifyResumeLearningText();//newui
		Reporter.writeSummary("TCID_037,  Verify  whether the dash board contains the heading Learning in Progress, " +  homeSteps.getResult() );
		//TCID_40:Checking whether the button Continue is displayed under the heading Learning in Progress
/*      homeSteps.verifyComplStatus();
		Reporter.writeSummary("TCID_039,  whether the coverage percentage is shown with the text completed under Percentage, " +  homeSteps.getResult() );
      //TCID_33:The coverage percentage is shown with the text Coverage
        homeSteps.verifyCoverageText();
		Reporter.writeSummary("TCID_033,  Verify  The coverage percentage is shown with the text Coverage, " + homeSteps.getResult() );
		//TCID_41: Verify Continue Text are displayed
*/		homeSteps.verifyContinueText();//newui
		Reporter.writeSummary("TCID_041,  Verify Continue Text are displayed, " + homeSteps.getResult() );
		Reporter.writeSummary("TCID_040,  Verify  whether the button Continue is displayed under the heading Learning in Progress, " +  homeSteps.getResult() );
		Reporter.writeSummary("TCID_032,  Verify  whether the button Continue is present for the text Learning in progress,"+ homeSteps.getResult() );
		homeSteps.clickContinueBtnRetToHome();//newui
		//TCID_02: Verify  to My Home page data
		homeSteps.verifyHomePageData();//newui
		Reporter.writeSummary("TCID_ 002,  Verify  to My Home page data, " + homeSteps.getResult() );
		//TCID_09:Verify progress of learning item in Home
/*		homeSteps.verifyLearningInprogress();
		Reporter.writeSummary("TCID_009, Verify progress of learning item in Home, " + homeSteps.getResult() );
		//TCID_10:Verify My Learning page details on clicking from Home Page
		homeSteps.verifyMyLearningLabeltext();
		Reporter.writeSummary("TCID_010,  Verify My Learning page details on clicking from Home Page, " + homeSteps.getResult() );
*/   	//TCID_13:Verification of View all page labels
		homeSteps.verifyViewAllPage(); //newui
		Reporter.writeSummary("TCID_013, Verification of View all page labels, " + homeSteps.getResult() );
		Reporter.writeSummary("TCID_035, Verify whether all the data are shown under the heading updates when view all button is clicked, " + homeSteps.getResult() );
		//TCID_34:Verify Privacy, Terms and Contact links
		homeSteps.verifyFooterLinks();//newui
		Reporter.writeSummary("TCID_034, Verify Privacy Terms and Contact links, " + homeSteps.getResult() );
		//TCID_60:The page should be moving upwards when ^ button is clicked
		homeSteps.verifyTopArrBtn();//newui
		Reporter.writeSummary("TCID_060, The page should be moving upwards when ^ button is clicked, " + homeSteps.getResult() );
		//Verify the Notifications page is getting displayed on clicking the Bell icon on the top right of the page next to profile icon. 
		homeSteps.verifyBellNotification();//newui
		Reporter.writeSummary("TCID_069, Verify the Notifications page is getting displayed on clicking the Bell icon on the top right of the page next to profile icon, " + homeSteps.getResult() );
		Reporter.writeSummary("TCID_070, Verify whether All the Notifications are getting listed on clicking the All tab, " + homeSteps.getResult() ); 
		homeSteps.clickLogout();//newui
	
	}

	@Test(dataProvider = "browers", groups = { "pilot", "Home" }, enabled = true,
			description = "TC_nnnn Verify Home Page has Learning in progress text, completion status, Continue text and button, recently"
					+ "added courses and arrow button at the top")
	public void testHomePageVerifyRcntAddedCourseNavigation(String row, String strBrowserName) {
		driver = BrowserFactory.getBrowser(strBrowserName);
		login(driver);
		HomeSteps homeSteps = new HomeSteps(driver);
//		homeSteps.verifyNavTORcntAddedCoursesRtnToHome();
		//TCID_31: Verify navigation to Home page
		homeSteps.verifySubHeaders();//newui
		Reporter.writeSummary("TCID_031,  Verify navigation to Home page, " + homeSteps.getResult() );
		//TCID_15: Verify the functionality of "^" symbol
//		homeSteps.verifyTopArrBtn();//newui
		Reporter.writeSummary("TCID_015,  Verify the functionality of ^ > < symbol, " + homeSteps.getResult() );
		//TCID_15: Verify the functionality of ">" symbol
		homeSteps.verifyNextBtn();//newui
	//	Reporter.writeSummary("TCID_015,  Verify the functionality of > symbol, " +  result );
		//TCID_15: Verify the functionality of "<" symbol
		homeSteps.verifyPreviousBtn();//newui
   //	Reporter.writeSummary("TCID_015,  Verify the functionality of < symbol, " +  result );
		//TCID_43: Verify Recently Added courses displayed
/*		homeSteps.verifyRcntAdded_CoursesText();
		Reporter.writeSummary("TCID_043,  Verify  Recently Added courses displayed, " + homeSteps.getResult() );
*/		//TCID_80:Verify the function of  Wish list icon
		homeSteps.verifyWishListBtn();//newui
		Reporter.writeSummary("TCID_080, Verify the function of  Wish list icon, " +  homeSteps.getResult() );
		//TCID_79:Verify the function of  Cart  icon
		homeSteps.verifyCartItemBtn();//newui
		Reporter.writeSummary("TCID_079,  Verify the function of  Cart  icon, " + homeSteps.getResult() );
		//TCID_3:Verify My Learning page is displayed after logging to app.
		homeSteps.verifyMyLearningPage();//newui
		Reporter.writeSummary("TCID_003,  Verify My Learning page is displayed after logging to app, " +  homeSteps.getResult());
		//Verify LogoImage is displayed after logging to app
		homeSteps.verifyLogoImg();//newui
		Reporter.writeSummary("TCID_084, Verify the functionality of the Logo displayed on the top left corner of the page., " +  homeSteps.getResult());
		homeSteps.clickLogout(); 

	}

	@Test(dataProvider = "browers", groups = { "pilot", "Home" }, enabled = true,
			// description="Verify categories are available as expected" )
			description = "TCID_Verify filter in Home Page works for Recently Added and Recommeded Sections")
	public void testHomePageVerifyFiltersRcntRecommended(String row, String strBrowserName) {

		driver = BrowserFactory.getBrowser(strBrowserName);
		login(driver);

		HomeSteps homeSteps = new HomeSteps(driver);
        homeSteps.firstTwoCatalogItemsTitleCompare();//newui
		Reporter.writeSummary("TCID_055, Checking whether two catalog items displayed in whats new section matches with the first 2 items in the Most popular content section, " +   homeSteps.getResult() );
		//Verify the function of  Recently Added section attributes 
		homeSteps.whatsNewSectionAttributes();//newui
		Reporter.writeSummary("TCID_082,  Verify the function of  Recently Added section attributes , " +   homeSteps.getResult() );
		// rep.report(strTCID, Severity, Module, strTCDesc, strResult);TCID_33:Checking whether the coverage percentage is shown with the text \"Coverage\"
		//TCID_42:The data should be shown under the topic Recently Added when All is clicked
		homeSteps.verifyAllFilterWhatsNew();//newui
		Reporter.writeSummary("TCID_042,  Verify The data should be shown under the topic Recently Added when All is clicked, " +   homeSteps.getResult() );
		Reporter.writeSummary("TCID_057,  Verify whether Content Bundle Course Video and Learning path are shown  under Recently Added when All link is clicked, " +   homeSteps.getResult() );
		//TCID_43:The Bundles should be shown under the topic Recently Added when the link Bundles is clicked
		homeSteps.verifyCourseFilterWhatsNew();//newui
		Reporter.writeSummary("TCID_045,  Verify  The courses should be shown under the topic Recently Added when the link courses is clicked, " + homeSteps.getResult() );
		//TCID_46:The resources should be shown under the topic Recently Added when the link resources is clicked
		homeSteps.verifyBundleFilterWhatsNew();//newui
		Reporter.writeSummary("TCID_043,  Verify  The Bundles should be shown under the topic Recently Added when the link Bundles is clicked, " + homeSteps.getResult() );
		//TCID_45:The courses should be shown under the topic Recently Added when the link courses is clicked
		homeSteps.verifyResourceFilterWhatsNew();//newui
		Reporter.writeSummary("TCID_046,  Verify The resources should be shown under the topic Recently Added when the link resources is clicked, " +   homeSteps.getResult() );
    	//TCID_44:The Learning paths should be shown under the topic Recently Added when the link Learning paths is clicked
		homeSteps.verifyLearnPathFilterWhatsNew();//newui
		Reporter.writeSummary("TCID_044,  Verify The Learning paths should be shown under the topic Recently Added when the link Learning paths is clicked, " +   homeSteps.getResult() );
		//TCID_47:The data should be shown under the topic Recommended content when All is clicked
/*		homeSteps.verifyAllFilterRecommAdded();
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
	*/	homeSteps.clickLogout();
	
	}
	@Test(dataProvider = "browers", groups = { "pilot", "Home" }, enabled = true,
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
//		homeSteps.verifyResourceFilterMostAdded(); //Data not present
		Reporter.writeSummary("TCID_056,  Verify The Resources should be shown under the topic Most consumed content when the link Resources is clicked, " +  homeSteps.getResult() );
		homeSteps.clickLogout();
	}
	@Test(dataProvider = "browers", groups = { "pilot" }, enabled = false,
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
	//Added by dhanushiya.k
		@Test(dataProvider = "browers", groups = { "pilot", "Home" }, enabled = false,
				// description="Verify categories are available as expected" )
				description = "TCID_Verify Global Search with catalog Items and Learning Objects")
		public void GlobalSearchUsingCatalogandLearningObjects(String row, String strBrowserName) {
			driver = BrowserFactory.getBrowser(strBrowserName);
			login(driver);
			HomeSteps homeSteps = new HomeSteps(driver);
			//TCID_:Verify Global Search for classroom,classrooms and Verify whether the count and the number of elements displayed are same.
			homeSteps.GlobalSearchforClassroomandClassroomsKeyword();
			Reporter.writeSummary("TCID_Globalsearch_1,  Verify Global Search for classroom,classrooms and Verify whether the count and the number of elements displayed are same," +  homeSteps.getResult() );
			//TCID_:Verify Global Search for Image,Images and Verify whether the count and the number of elements displayed are same.
			homeSteps.GlobalSearchforimageandimages();
			Reporter.writeSummary("TCI_Globalsearch_2, Verify Global Search for image,images and Verify whether the count and the number of elements displayed are same,"+ homeSteps.getResult());
			//TCID_:Verify Global Search for Audio,Audios and Verify whether the count and the number of elements displayed are same.
			homeSteps.GlobalSearchforAudioandAudios();
			Reporter.writeSummary("TCI_Globalsearch_3,Verify Global Search for Audio,Audios and Verify whether the count and the number of elements displayed are same,"+ homeSteps.getResult());
			//TCID_:Verify Global Search for video ,videos and Verify whether the count and the number of elements displayed are same.
			homeSteps.GlobalSearchforVideoandVideos();
			Reporter.writeSummary("TCI_Globalsearch_4,Verify Global Search for video, videos and Verify whether the count and the number of elements displayed are same,"+homeSteps.getResult());
			//TCID_:Verify Global Search for document,documents and Verify whether the count and the number of elements displayed are same.
			homeSteps.GlobalSearchforDocumentandDocuments();
			Reporter.writeSummary("TCI_Globalsearch_5,Verify Global Search for document,documents and Verify whether the count and the number of elements displayed are same,"+homeSteps.getResult());
			//TCID_:Verify Global Search for vlab, vlabs and Verify whether the count and the number of elements displayed are same.
			homeSteps.GlobalSearchforVlabsandVlabs();
			Reporter.writeSummary("TCI_Globalsearch_6,Verify Global Search for vlab,vlabs and Verify whether the count and the number of elements displayed are same,"+homeSteps.getResult());
			//TCID_:Verify Global Search for assessment,assessments and Verify whether the count and the number of elements displayed are same.
			homeSteps.GlobalSearchforAssessmentandAssessments();
			Reporter.writeSummary("TCI_Globalsearch_7,Verify Global Search for assessment,assessments and Verify whether the count and the number of elements displayed are same,"+homeSteps.getResult());
			//TCID_:Verify Global Search for elearning ,elearnings and Verify whether the count and the number of elements displayed are same.
			homeSteps.GlobalSearchforElearningandElearnings();
			Reporter.writeSummary("TCI_Globalsearch_8,Verify Global Search for elearning,elearnings and Verify whether the count and the number of elements displayed are same,"+homeSteps.getResult());
			//TCID_:Verify Global Search for bundles,bundles and Verify whether the count and the number of elements displayed are same.
			homeSteps.GlobalSearchforBundleandBundles();
			Reporter.writeSummary("TCI_Globalsearch_9,Verify Global Search for bundles and bundles,"+homeSteps.getResult());
			//TCID_:Verify Global Search for podcast,podcasts and Verify whether the count and the number of elements displayed are same.
			homeSteps.GlobalSearchforPodcastandPodcasts();
			Reporter.writeSummary("TCI_Globalsearch_10,Verify Global Search for podcast,podcasts and Verify whether the count and the number of elements displayed are same,"+homeSteps.getResult());
			//TCID_:Verify Global Search for learningpath,learningpaths and Verify whether the count and the number of elements displayed are same.
			homeSteps.GlobalSearchforLearningpathandLearningpaths();
			Reporter.writeSummary("TCI_Globalsearch_11,Verify Global Search for learningpath and learningpaths,"+homeSteps.getResult());
			//TCID_:Verify Global Search for course,courses and Verify whether the count and the number of elements displayed are same.
			homeSteps.GlobalSearchforCourseandCourses();
			Reporter.writeSummary("TCI_Globalsearch_12,Verify Global Search for course,courses and Verify whether the count and the number of elements displayed are same,"+homeSteps.getResult());
			//TCID_:Verify Global Search for resource ,resource and Verify whether the count and the number of elements displayed are same. 
			homeSteps.GlobalSearchforResourceandResources();
			Reporter.writeSummary("TCI_Globalsearch_13,Verify Global Search for resource,resources and Verify whether the count and the number of elements displayed are same,"+homeSteps.getResult());
			//TCID_:Verify Global Search with random characters and integers.
			homeSteps.GlobalSearchwithRandomcharacterandIntegers();
			Reporter.writeSummary("TCI_Globalsearch_14,Verify Global Serach with random characters and integers,"+homeSteps.getResult());
			//TCID_:Verify Global Search with Special characters
			homeSteps.GlobalSearchwithSpecialcharacters();
			Reporter.writeSummary("TCI_Globalsearch_15,Verify Global Search with Special characters,"+homeSteps.getResult());
			//TCID_: Verify Global Search with unavailable keyword
			homeSteps.GlobalSearchwithUnavailableKeyword();
			Reporter.writeSummary("TCI_Globalsearch_16, Verify Global Search with unavailable keyword,"+homeSteps.getResult());
			//TCID_: Verify Global Search with double and tab Space
			homeSteps.GlobalSearchwithDoubleandTabspace();
			Reporter.writeSummary("TCI_Globalsearch_17, Verify Global Search with double and tab Space,"+homeSteps.getResult()); 
			
			
			}
		//Added by mahesh
		@Test(dataProvider = "browers", groups = { "pilot" }, enabled = false,
				description = "")
		public void testDynamicCatalogFilterCheck(String row, String strBrowserName) {

			driver = BrowserFactory.getBrowser(strBrowserName);
			login(driver);
			
			HomeSteps homeSteps = new HomeSteps(driver);
			homeSteps.verifyCatalogFilterDashboard();
			homeSteps.verifyCatalogFilterMylearning();
			homeSteps.verifyCatalogFilterCategories();
			homeSteps.verifyCatalogFilterSearch();
	}

}
