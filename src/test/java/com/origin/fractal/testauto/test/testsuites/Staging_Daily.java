package com.origin.fractal.testauto.test.testsuites;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.origin.fractal.testauto.DataManager;
import com.origin.fractal.testauto.pages.ClassroomEventPage;
import com.origin.fractal.testauto.pages.InstructorBellNotificationPage;
import com.origin.fractal.testauto.steps.ClassRoomRosterSteps;
import com.origin.fractal.testauto.steps.DownloadContentSteps;
import com.origin.fractal.testauto.steps.ForgotPasswordSteps;
import com.origin.fractal.testauto.steps.GlobalSteps;
import com.origin.fractal.testauto.steps.HomeSteps;
import com.origin.fractal.testauto.steps.InstructorBellNotificationSteps;
import com.origin.fractal.testauto.steps.InstructorCalendarModuleSteps;
import com.origin.fractal.testauto.steps.InstructorCalendarModuleStepsNew;
import com.origin.fractal.testauto.steps.InstructorModuleSteps;
import com.origin.fractal.testauto.steps.LoginSteps;
import com.origin.fractal.testauto.steps.MenuSteps;
import com.origin.fractal.testauto.steps.MyLearningSteps;
import com.origin.fractal.testauto.steps.RenewButtonSteps;
import com.origin.fractal.testauto.steps.UserCronSteps;
import com.origin.fractal.testauto.steps.UserPaginationSteps;
import com.origin.fractal.testauto.steps.VenueSteps;
import com.origin.fractal.testauto.steps.VideoTesterSteps;
import com.origin.fractal.testauto.test.FractalBaseWebTest;
import com.wv.auto.framework.BrowserFactory;
import com.wv.auto.framework.utils.Reporter;

public class Staging_Daily extends FractalBaseWebTest {
	@DataProvider
	public  Object[][] browers() {
		return new Object[][] {
			new Object[] { "1", "Chrome" }
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
		Reporter.writeSummary("TCID_HOME_037,  Verify  whether the dash board contains the heading Resume Learning, " +  homeSteps.getResult() );
		//TCID_37:Checking whether the dash board contains the heading Learning in Progress
//		homeSteps.verifyContinueText();//newui
//		Reporter.writeSummary("TCID_HOME_041,  Verify Continue button is displayed, " + homeSteps.getResult() );
//		homeSteps.clickContinueBtnRetToHome();//newui
		//TCID_02: Verify  to My Home page data
		homeSteps.verifyHomePageData();//newui
		Reporter.writeSummary("TCID_HOME_ 002,  Verify the existence of Home page elements, " + homeSteps.getResult() );
		//	homeSteps.verifyViewAllPage(); //newui
		Reporter.writeSummary("TCID_HOME_013, Verify View All page elements, " + homeSteps.getResult() );
		Reporter.writeSummary("TCID_HOME_035, Verify whether view all page elements and whether all the data are shown under the heading updates when view all button is clicked, " + homeSteps.getResult() );
		//TCID_60:The page should be moving upwards when ^ button is clicked
		homeSteps.verifyTopArrBtn();//newui
		Reporter.writeSummary("TCID_HOME_060, The page should be moving upwards when ^ button is clicked, " + homeSteps.getResult() );
		//Verify the Notifications page is getting displayed on clicking the Bell icon on the top right of the page next to profile icon. 
		//Verify the Notifications page is getting displayed on clicking the Bell icon on the top right of the page next to profile icon. 
		homeSteps.verifyBellNotification();//newui
		Reporter.writeSummary("TCID_HOME_070, Verify whether All the Notifications are getting listed on clicking the more button, " + homeSteps.getResult() ); 

		homeSteps.clickLogout();//newui

	}

	@Test(dataProvider = "browers", groups = { "pilot", "Home" }, enabled = true,
			description = "TC_nnnn Verify Home Page has Learning in progress text, completion status, Continue text and button, recently"
					+ "added courses and arrow button at the top")
	public void testHomePageVerifyRcntAddedCourseNavigation(String row, String strBrowserName) {
		driver = BrowserFactory.getBrowser(strBrowserName);
		login(driver);
		HomeSteps homeSteps = new HomeSteps(driver);
		// dhanu homeSteps.verifySubHeaders();//newui
		Reporter.writeSummary("TCID_HOME_031,  Verify navigation to Home page, " + homeSteps.getResult() );
		//TCID_15: Verify the functionality of "^" symbol
		//homeSteps.verifyTopArrBtn();//newui
		Reporter.writeSummary("TCID_HOME_015,  Verify the functionality of ^ > < symbol, " + homeSteps.getResult() );
		Reporter.writeSummary("TCID_HOME_080, Verify the function of  Wish list icon, " +  homeSteps.getResult() );
		//TCID_79:Verify the function of  Cart  icon
		homeSteps.verifyCartItemBtn();//newui
		Reporter.writeSummary("TCID_HOME_079,  Verify the function of  Cart  icon, " + homeSteps.getResult() );
		homeSteps.verifyMyLearningPage();//newui
		Reporter.writeSummary("TCID_HOME_003,   Verify Home page is Land after logging to app, " +  homeSteps.getResult());
		homeSteps.clickLogout(); 

	}

	@Test(dataProvider = "browers", groups = { "pilot", "Home" }, enabled = true,
			// description="Verify categories are available as expected" )
			description = "TCID_Verify filter in Home Page works for Recently Added and Recommeded Sections")
	public void testHomePageVerifyFiltersRcntRecommended(String row, String strBrowserName) {

		driver = BrowserFactory.getBrowser(strBrowserName);
		login(driver);

		HomeSteps homeSteps = new HomeSteps(driver);
		Reporter.writeSummary("TCID_HOME_082,  Verify the function of  What's New section attributes , " +   homeSteps.getResult() );
		homeSteps.verifyAllFilterWhatsNew();//newui
		homeSteps.verifyCourseFilterWhatsNew();//newui
		Reporter.writeSummary("TCID_HOME_045,  Verify  The courses should be shown under the What's New Added when the link courses is clicked, " + homeSteps.getResult() );
		//TCID_46:The resources should be shown under the topic Recently Added when the link resources is clicked
		homeSteps.verifyBundleFilterWhatsNew();//newui
		Reporter.writeSummary("TCID_HOME_043,  Verify  The Bundles should be shown under the What's New Added when the link Bundles is clicked, " + homeSteps.getResult() );
		//TCID_45:The courses should be shown under the topic Recently Added when the link courses is clicked
		homeSteps.verifyResourceFilterWhatsNew();//newui
		Reporter.writeSummary("TCID_HOME_046,  Verify The resources should be shown under the What's New Added when the link resources is clicked, " +   homeSteps.getResult() );
		//TCID_44:The Learning paths should be shown under the topic Recently Added when the link Learning paths is clicked
		homeSteps.verifyLearnPathFilterWhatsNew();//newui
		Reporter.writeSummary("TCID_HOME_044,  Verify The Learning paths should be shown under the What's New Added when the link Learning paths is clicked, " +   homeSteps.getResult() );
		homeSteps.verifyPodcastFilterWhatsNew();//newui
		Reporter.writeSummary("TCID_HOME_New_01,  Verify The Podcast should be shown under the What's New Added when the link Podcast is clicked, " +   homeSteps.getResult() );
		//TCID_47:The data should be shown under the topic Recommended content when All is clicked

		homeSteps.clickLogout();

	}
	@Test(dataProviderClass=DataManager.class, dataProvider = "browers", groups = { "Phase1.0" }, enabled = true, description = "")
	public void GoogleAndFacebook(String row, String strBrowserName) {
		driver = BrowserFactory.getBrowser(strBrowserName);
		LoginSteps loginSteps = new LoginSteps(driver);
		login(driver);
		HomeSteps homeSteps = new HomeSteps(driver);
		ForgotPasswordSteps fpassSteps = new ForgotPasswordSteps(driver);
		homeSteps.clickLogout();
		loginSteps.googleBtn();
		Reporter.writeSummary("TCID_SocialLogin_001, Verify the google login page function, " +  loginSteps.getResult() );
		loginSteps.facebookButton();
		Reporter.writeSummary("TCID_SocialLogin_002, Verify the face book login page function, " +  loginSteps.getResult() );
	}
	@Test(dataProvider = "browers", groups = { "pilot", "Home" }, enabled = true,
			description = "")
	public void verifyvideo(String row, String strBrowserName) throws InterruptedException {
		driver = BrowserFactory.getBrowser(strBrowserName);
		DownloadContentSteps downloadContentSteps = new DownloadContentSteps(driver);
		login(driver);
		downloadContentSteps.verifyAudio();
		Reporter.writeSummary("FR1-2773_DownloadContent_TC-002,In User Login Verify Download option visible in the Content Player Page for audio once enabled by admin," +downloadContentSteps.getResult());
	}
	@Test(dataProvider = "browers", groups = { "pilot", "Home" }, enabled = true,
			description = "")
	public void DownloadContent(String row, String strBrowserName) throws IOException {
		driver = BrowserFactory.getBrowser(strBrowserName);
		VenueSteps venueSteps = new VenueSteps(driver);
		MenuSteps menuSteps = new MenuSteps(driver);
		DownloadContentSteps downloadContentSteps = new DownloadContentSteps(driver);

		loginToContentAdmin(driver);
		venueSteps.clickHomeMenu();
		menuSteps.gotoManageContents();
		UserCronSteps userCronSteps = new UserCronSteps(driver);
		userCronSteps.addLearningObjectBtn();
		downloadContentSteps.videoCreation();
		downloadContentSteps.imageCreation();
		downloadContentSteps.downloableOption();
		Reporter.writeSummary("FR1-2773_DownloadContent_TC-001,Verify the User able to enable the download option in the creation of Video Learning Object," +downloadContentSteps.getResult());



	}
	@Test(dataProviderClass=DataManager.class, dataProvider = "browers", groups = { "pilot" }, enabled = true, priority = 1 ,
			description = "video testing")
	public void verifyAdminvideo(String row, String strBrowserName) throws InterruptedException, IOException {
		driver = BrowserFactory.getBrowser(strBrowserName);
		loginToContentAdmin(driver);
		MenuSteps menuSteps = new MenuSteps(driver);
		VideoTesterSteps VideoTesterSteps=new VideoTesterSteps(driver);
		menuSteps.clickMenu();
		VideoTesterSteps.verifyAdminVideoTester();
		Reporter.writeSummary("TCID_Video, Verify the Admin video gets launched succesfully," +  VideoTesterSteps.getResult() );
	}
	@Test(dataProviderClass = DataManager.class,dataProvider="browers", groups= {"pilot"}, enabled= true, description="")
	public void renewButtonCheck(String row, String strBrowserName) throws Exception {
		driver = BrowserFactory.getBrowser(strBrowserName);
		login(driver);
		RenewButtonSteps renew = new RenewButtonSteps(driver);
		renew.searchpageRenewButton();
		Reporter.writeSummary("FR1-2496_Renew_TC-01,Verify the presence of renew button in search page," + renew.getResult() );
		renew.inprogressRenewbtnCheck();
		Reporter.writeSummary("FR1-2496_Renew_TC-02,Verify renew button in InProgress Page," + renew.getResult() );
		/*	renew.completedRenewbtnCheck();
		Reporter.writeSummary("FR1-2496_Renew_TC-03,Verify renew button in  Completed page," + renew.getResult() );
		renew.whatsnewRenewBtnCheck();
		Reporter.writeSummary("FR1-2777_Renew_TC-01,Verify renew button in  WhatsNew and Dashboard page," + renew.getResult() );
		 */renew.categoryRenewBtnCheck();
		 Reporter.writeSummary("FR1-2777_Renew_TC-02,Verify renew button after selecting category," + renew.getResult() );
	}
	@Test(dataProviderClass=DataManager.class, dataProvider = "browers", groups = { "pilot" }, enabled = true,priority=0)
	public void CourseCompletionMail (String row, String strBrowserName) throws Exception {
		driver = BrowserFactory.getBrowser(strBrowserName);
		login(driver);
		MyLearningSteps steps= new MyLearningSteps(driver);
		steps.verifyCertification();
		Reporter.writeSummary("FR1_1574_Certificate_TC-001, Verify the Course completion certificate is present with download button," +steps.getResult() );
	}
	/*
	 * 04-Mar-2021  divya commenting
	 * commenting as global search results in blank page
	 * 11-03-2021 uncommenting
	 *
	 */
	@Test(dataProviderClass = DataManager.class,dataProvider="browers", groups = { "pilot", "Home" }, enabled = true,
			// description="Verify categories are available as expected" )
			description = "TCID_Verify Global Search with catalog Items and Learning Objects")
	public void GlobalSearchUsingCatalogandLearningObjects(String row, String strBrowserName) {
		driver = BrowserFactory.getBrowser(strBrowserName);
		login(driver);
		GlobalSteps globalSteps = new GlobalSteps(driver);
		//TCID_:Verify Global Search for classroom and classrooms
		globalSteps.GlobalSearchforClassroomandClassroomsKeyword();
		Reporter.writeSummary("TCID_Global_01,  Verify Global Search for classroom and classrooms," +  globalSteps.getResult() );
		//TCID_:Verify Global Search for Image and Images
		globalSteps.GlobalSearchforimageandimages();
		Reporter.writeSummary("TCI_Global_02,Verify Global Search for image and images,"+ globalSteps.getResult());
		//TCID_:Verify Global Search for Audio and Audios
		globalSteps.GlobalSearchforAudioandAudios();
		Reporter.writeSummary("TCI_Global_03,Verify Global Search for Audio and Audios,"+ globalSteps.getResult());
		//TCID_:Verify Global Search for video and videos
		globalSteps.GlobalSearchforVideoandVideos();
		Reporter.writeSummary("TCI_Global_04,Verify Global Search for video and videos,"+globalSteps.getResult());
		//TCID_:Verify Global Search for document and documents
		globalSteps.GlobalSearchforDocumentandDocuments();
		Reporter.writeSummary("TCI_Global_05,Verify Global Search for document and documents,"+globalSteps.getResult());
		//TCID_:Verify Global Search for vlab and vlabs
		globalSteps.GlobalSearchforVlabsandVlabs();
		Reporter.writeSummary("TCI_Global_06,Verify Global Search for vlab and vlabs,"+globalSteps.getResult());
		//TCID_:Verify Global Search for assessment and assessments
		//globalSteps.GlobalSearchforAssessmentandAssessments();
		Reporter.writeSummary("TCI_Global_07,Verify Global Search for assessment and assessments,"+globalSteps.getResult());
		//TCID_:Verify Global Search for elearning and elearnings
		globalSteps.GlobalSearchforElearningandElearnings();
		Reporter.writeSummary("TCI_Global_08,Verify Global Search for elearning and elearnings,"+globalSteps.getResult());
		//TCID_:Verify Global Search for bundles and bundles
		globalSteps.GlobalSearchforBundleandBundles();
		Reporter.writeSummary("TCI_Global_09,Verify Global Search for bundles and bundles,"+globalSteps.getResult());
		//TCID_:Verify Global Search for podcast and podcasts
		globalSteps.GlobalSearchforPodcastandPodcasts();
		Reporter.writeSummary("TCI_Global_10,Verify Global Search for podcast and podcasts,"+globalSteps.getResult());
		//TCID_:Verify Global Search for learningpath and learningpaths
		globalSteps.GlobalSearchforLearningpathandLearningpaths();
		Reporter.writeSummary("TCI_Global_11,Verify Global Search for learningpath and learningpaths,"+globalSteps.getResult());
		//TCID_:Verify Global Search for course and courses
		globalSteps.GlobalSearchforCourseandCourses();
		Reporter.writeSummary("TCI_Global_12,Verify Global Search for course and courses,"+globalSteps.getResult());
		//TCID_:Verify Global Search for resource  and resource 
		globalSteps.GlobalSearchforResourceandResources();
		Reporter.writeSummary("TCI_Global_13,Verify Global Search for resource and resources ,"+globalSteps.getResult());
		//TCID_:Verify Global Search with random characters and integers.
		globalSteps.GlobalSearchwithRandomcharacterandIntegers();
		Reporter.writeSummary("TCI_Global_14,Verify Global Serach with random characters and integers,"+globalSteps.getResult());
		//TCID_:Verify Global Search with Special characters
		globalSteps.GlobalSearchwithSpecialcharacters();
		Reporter.writeSummary("TCI_Global_15,Verify Global Search with Special characters,"+globalSteps.getResult());
		//TCID_: Verify Global Search with unavailable keyword
		globalSteps.GlobalSearchwithUnavailableKeyword();
		Reporter.writeSummary("TCI_Global_16,Verify Global Search with unavailable keyword,"+globalSteps.getResult());
		//TCID_: Verify Global Search with double and tab Space
		globalSteps.GlobalSearchwithDoubleandTabspace(); // 15/4/2020
		Reporter.writeSummary("TCI_Global_17,Verify Global Search with double and tab Space,"+globalSteps.getResult());

	}
	 
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
		mLSteps.verifyComplStatus();//newui
		mLSteps.verifyCatalogDetails();//newui
		Reporter.writeSummary("TCID_MY_LEARN__012,Verify Learning item page contains Course Name joined on date and time Description Validity Duration, " +  mLSteps.getResult() );
		//04-Mar-2021 Divya commenting this testcase as this testcase searches globally	
		//uncommenting -11-03-2021 by divya
		mLSteps.multiplecategorycheck();
			Reporter.writeSummary("TCID_MY_LEARNNEW__001, Verify MultipleCategory in My Learning page," +  mLSteps.getResult() );
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
		homeSteps.clickOnMyLearning();//newui
		//mLSteps.verifyAllFilter();//newui
		Reporter.writeSummary("TCID_MY_LEARN__020,Verify All filter, " + mLSteps.getResult() );
		mLSteps.verifyBundleFilter();//newui
		Reporter.writeSummary("TCID_MY_LEARN__021,verify Bundle filter, " +  mLSteps.getResult() );
		mLSteps.verifyCourseFilter();//newui
		Reporter.writeSummary("TCID_MY_LEARN__022,verify Course filter, " +  mLSteps.getResult());
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
		MyLearningSteps mLSteps = new MyLearningSteps(driver);
		mLSteps.verifyTickmark();//newui 11/9/19
		Reporter.writeSummary("TCID_MY_LEARN__025,Verify Tick mark for completed catalog item, " +  mLSteps.getResult() );
		homeSteps.clickOnMyLearning();
		mLSteps.verifyCategory();//newui
		Reporter.writeSummary("TCID_MY_LEARN__008,Verify Category items, " +  mLSteps.getResult() );
		//mLSteps.verifyGridView();//newui
		Reporter.writeSummary("TCID_MY_LEARN__006,Verify the Grid view items and functionality, " +  mLSteps.getResult() );
		mLSteps.verifyListView();//newui
		Reporter.writeSummary("TCID_MY_LEARN__007,Verify the List view items and functionality, " +  mLSteps.getResult() );
		mLSteps.verifyCategoryList();//newui
		Reporter.writeSummary("TCID_MY_LEARN__005,Verify Category drop down and Grid and List mode, " +  mLSteps.getResult() );
		mLSteps.verifyRatings();//newuui 12/9/19
		Reporter.writeSummary("TCID_MY_LEARN__014,verify  the Ratings of completed catalog item , " +  mLSteps.getResult());
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
		mLSteps.verifyBundleContents();//newui
		Reporter.writeSummary("TCID_MY_LEARN__017,Verify Labels of Bundles and courses, " +  mLSteps.getResult() );
		homeSteps.clickOnMyLearning();
		mLSteps.verifyCourseContents();//newui
		Reporter.writeSummary("TCID_MY_LEARN__018,Verify course Details after clicking, " +  mLSteps.getResult() );
		homeSteps.clickOnMyLearning();
		mLSteps.clickLogout();
	}
	@Test(dataProvider = "browers", groups = { "pilot" }, enabled = true, description ="")
	public void testMyLearningPageClassroom(String row, String strBrowserName) {
		driver = BrowserFactory.getBrowser(strBrowserName);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		login(driver);

		// Test moves to Home page
		HomeSteps homeSteps = new HomeSteps(driver);
		homeSteps.clickOnMyLearning();
		wait(5);
		MyLearningSteps mLSteps = new MyLearningSteps(driver);
		mLSteps.verifyClassroomDetails();
		mLSteps.verifyDetailsBtn();//newui
		Reporter.writeSummary("TC_MY_LEARN_:7,Checking whether the Details button are getting displayed on classroom asset, " +  mLSteps.getResult() );
		//mLSteps.verifyAssignedClassroom();//newui
		Reporter.writeSummary("TC_MY_LEARN_:5,The assigned calssrooms are getting displayed under bundle/course., " +  mLSteps.getResult() );
		//mLSteps.verifyEventDisplayClassroomObject();//newui
		Reporter.writeSummary("TC_MY_LEARN_:8,Checking whether the Event is displayed under classroom object, " +  mLSteps.getResult() );
		Reporter.writeSummary("TC_MY_LEARN_:9,Checking whether the below details are present inside Event Date&Time Location Instructor name Register button," +  mLSteps.getResult() );
		mLSteps.verifyChooseEventBtn();//newui
		Reporter.writeSummary("TC_MY_LEARN_:11,Checking whether the choose event button are getting displayed in calendar, " +  mLSteps.getResult() );
		mLSteps.verifyClassrooomLabels();//newui
		Reporter.writeSummary("TC_MY_LEARN_:12,Checking whether the below labels are present in classroom Pre-event Activities Reference Session Post-event Activities Terms & Conditions," +  mLSteps.getResult() );
	}

	@Test(dataProviderClass=DataManager.class, dataProvider = "browers", groups = { "pilot" }, enabled=true,priority =0,
			description = "")
	public void InstructorBellNotification (String row, String strBrowserName) throws Exception {
		driver = BrowserFactory.getBrowser(strBrowserName);
		InstructorBellNotificationSteps instbellnotiSteps=new InstructorBellNotificationSteps(driver);
		InstructorBellNotificationPage instbellnotiPage=new InstructorBellNotificationPage(driver);
		siteAdminLogin(driver);//Updated on 3-Dec-20
		//Added by vignesh 26-Sep-20 This for Roster test 
		ClassRoomRosterSteps classroomRoster=new ClassRoomRosterSteps(driver);
		 instbellnotiSteps.gotoClassRoom();//Updated on 3-Dec-20
			classroomRoster.verifyClassroomRoster();
			Reporter.writeSummary("FR-145_Scoring-ClassRoomRoster_TC-001, Admin can manage the roster.," +classroomRoster.getResult() );
			Reporter.writeSummary("FR-2365_ClassRoomRoster_TC-001, Classroom admin roster page fixes," +classroomRoster.getResult() );
			classroomRoster.verifyAssignmentDetails();
			Reporter.writeSummary("FR-531_Event_TC-001, Verify admin manages assignments," +classroomRoster.getResult() );
			classroomRoster.verifyAssignmentScore();
			Reporter.writeSummary("FR-147_Scoring_TC-001, Admin can give scores to the assignment.," +classroomRoster.getResult() );
			//ends	
		instbellnotiSteps.prerequisite("instructor2","ISTTime",instbellnotiPage.classroomName);
		loginInstructor(driver,instbellnotiPage.instructorEmailID,instbellnotiPage.instructorPassword);
		instbellnotiSteps.verifyEmptyNotification(); 
		//Added on 15-Sep-20
		Reporter.writeSummary("FR-111_InstrLogin,Verify the Instructor login," +instbellnotiSteps.getResult() );

		//ends

		Reporter.writeSummary("FR1-2017_InstrBell_TC-001,Verify the text No notifications found," +instbellnotiSteps.getResult() );
		instbellnotiSteps.instLogout();//Added on 20-Jan-21
		siteAdminLogin(driver);
		instbellnotiSteps.adminCheckAndInvitesInstructor("instructor1",instbellnotiPage.classroomName);
		loginInstructor(driver,instbellnotiPage.instructor1EmailID,instbellnotiPage.instructor1Password);
		instbellnotiSteps.verifyInviteNotification();	 
		instbellnotiSteps.instLogout();
		Reporter.writeSummary("FR1-2017_InstrBell_TC-002,Verify the instructor1 able to get invite notification (admin invites instructor1)," +instbellnotiSteps.getResult() );
		siteAdminLogin(driver);
		instbellnotiSteps.adminCheckAndInvitesInstructor("instructor2",instbellnotiPage.classroomName);
		loginInstructor(driver,instbellnotiPage.instructor2EmailID,instbellnotiPage.instructor2Password);
		instbellnotiSteps.verifyInviteNotification();
		Reporter.writeSummary("FR1-2017_InstrBell_TC-003,Verify the instructor2 able to get invite notification (admin invites instructor2)," +instbellnotiSteps.getResult() );
		instbellnotiSteps.instLogout();
		siteAdminLogin(driver);
		instbellnotiSteps.adminRescheduledEvent("CETTime",instbellnotiPage.classroomName);
		loginInstructor(driver,instbellnotiPage.instructor2EmailID,instbellnotiPage.instructor2Password); 
		instbellnotiSteps.verifyRescheduledNotification();
		Reporter.writeSummary("FR1-2017_InstrBell_TC-004,Verify the instructor gets reschedule notification (admin changes the timezone)," +instbellnotiSteps.getResult() );
		instbellnotiSteps.verifyandclickMoreBtn();
		Reporter.writeSummary("FR1-2017_InstrBell_TC-005,Verify the instructor sees and clicks MORE (when more than 3 notifications)," +instbellnotiSteps.getResult() );
		instbellnotiSteps.verifyNotificationViewallPage();
		Reporter.writeSummary("FR1-2017_InstrBell_TC-006,Verify when instructor clicks MORE CTA it lands on View more notifications page," +instbellnotiSteps.getResult() );
		instbellnotiSteps.verifyBreadcrumbMoreNotification();
		Reporter.writeSummary("FR1-2017_InstrBell_TC-007,Verify the instructor sees all notifications page and breadcrumb," +instbellnotiSteps.getResult() );
		instbellnotiSteps.verifyLastNoticationmatch();
		Reporter.writeSummary("FR1-2017_InstrBell_TC-008,Verify the notification details are matching with view all notifications page," +instbellnotiSteps.getResult() );
		instbellnotiSteps.verifyClickNotification();
		Reporter.writeSummary("FR1-2017_InstrBell_TC-009,Verify the click notification details should redirect to Event page," +instbellnotiSteps.getResult() );
		instbellnotiSteps.verifyclickHomeaction();
		Reporter.writeSummary("FR1-2017_InstrBell_TC-010,Verify click Back or Home in breadcrumb- it should redirect to dashboard page," +instbellnotiSteps.getResult() );
	}
	public class WebTestInstructorCalendarModule extends FractalBaseWebTest {
		/*
		 * Test event same day and same time action & Test Instructor calendar actions
		 */
		@Test(dataProviderClass=DataManager.class, dataProvider = "browers", groups = { "pilot" }, enabled = false, priority = 0 )
		public void TestInstructorCalendar(String row, String strBrowserName) throws IOException {
			driver = BrowserFactory.getBrowser(strBrowserName);
			//		MenuSteps menuSteps = new MenuSteps(driver);
			ClassroomEventPage eventPage= new ClassroomEventPage(driver);
			InstructorBellNotificationPage instbellnotiPage=new InstructorBellNotificationPage(driver);
			InstructorCalendarModuleStepsNew InstructorModuleSteps=new InstructorCalendarModuleStepsNew(driver);
			InstructorBellNotificationSteps instbellnotiSteps=new InstructorBellNotificationSteps(driver);
			loginInstructorwithCookies(driver,instbellnotiPage.instructor1EmailID,instbellnotiPage.instructor1Password);
			InstructorModuleSteps.verifyTradInviteNotification();
			Reporter.writeSummary("FR1-2164_InstrCalendar_TC-001,Verify the invite notification (blue dot) on the Instructor calendar (Traditional)," +InstructorModuleSteps.getResult());
			InstructorModuleSteps.verifyVirInviteNotification();
			Reporter.writeSummary("FR1-2164_InstrCalendar_TC-002,Verify the invite notification (blue dot) on the Instructor calendar (Virtual)," +InstructorModuleSteps.getResult());
			InstructorModuleSteps.verifyTredAcceptedEnvent();
			Reporter.writeSummary("FR1-2164_InstrCalendar_TC-003,Verify the accepted notification (Green dot) on the Instructor calendar (Traditional)," +InstructorModuleSteps.getResult());
			InstructorModuleSteps.verifyVirAcceptedEnvent();
			Reporter.writeSummary("FR1-2164_InstrCalendar_TC-004,Verify the accepted notification (Green dot) on the Instructor calendar (Virtual)," +InstructorModuleSteps.getResult());
			InstructorModuleSteps.verifyTredInviteAccepts();
			Reporter.writeSummary("FR1-2164_InstrCalendar_TC-005,Verify the instructor is able to accepts the invite notification (Traditional)," +InstructorModuleSteps.getResult());
			InstructorModuleSteps.verifyTredInviteReject();
			Reporter.writeSummary("FR1-2164_InstrCalendar_TC-006,Verify the instructor is able to Reject the invite notification (Traditional)," +InstructorModuleSteps.getResult());
			InstructorModuleSteps.verifyVirInviteAccepts();		
			Reporter.writeSummary("FR1-2164_InstrCalendar_TC-007,Verify the instructor is able to accepts the invite notification (Virtual)," +InstructorModuleSteps.getResult());
			InstructorModuleSteps.verifyTredInviteReject();
			Reporter.writeSummary("FR1-2164_InstrCalendar_TC-008,Verify the instructor is able to Reject the invite notification (Virtual)," +InstructorModuleSteps.getResult());
			instbellnotiSteps.instLogout();
			siteAdminLogin(driver);
			InstructorModuleSteps.adminRescheduledEvent("Tred");
			InstructorModuleSteps.adminRescheduledEvent("Vir");
			instbellnotiSteps.adminLogout();
			loginInstructor(driver,instbellnotiPage.instructor1EmailID,instbellnotiPage.instructor1Password);
			InstructorModuleSteps.verifyResucheduleTimeZoneTre();
			Reporter.writeSummary("FR1-2164_InstrCalendar_TC-009,Verify the instructor is able to see the reschedules the event (Traditional)," +InstructorModuleSteps.getResult());
			InstructorModuleSteps.verifyResucheduleTimeZoneVir();
			Reporter.writeSummary("FR1-2164_InstrCalendar_TC-010,Verify the instructor is able to see the reschedules the event (Virtual)," +InstructorModuleSteps.getResult());
			instbellnotiSteps.instLogout();
		}
	}
	@Test(dataProvider = "browers", groups = { "pilot", "Home" }, enabled = true,
			// description="Verify categories are available as expected" )
			description = "")
	public void testInstructorPage(String row, String strBrowserName) {
		driver = BrowserFactory.getBrowser(strBrowserName);
		loginToInstructor(driver);
		InstructorModuleSteps instructorModuleSteps = new InstructorModuleSteps(driver);
		instructorModuleSteps.verifyDashboardSubHeaders();
		Reporter.writeSummary("TCID_Instructor_001,the below labels should be able to present in the Instructor Dashboard: TotalEvents NextEven Skills  Updates Invites & Reminders,"+  instructorModuleSteps.getResult() );
		instructorModuleSteps.verifyEventSectionLabels();
		Reporter.writeSummary("TCID_Instructor_002,Verify whether the below labels are present in the Event Section: Upcoming In Progress Completed,"+  instructorModuleSteps.getResult() );
		instructorModuleSteps.verifyButtons();
		Reporter.writeSummary("TCID_Instructor_003,Verify whether the below buttons are present under invites&Reminders: Accept Reject Request to Reschedule,"+  instructorModuleSteps.getResult() );
		instructorModuleSteps.verifyPopupButtons();
		Reporter.writeSummary("TCID_Instructor_004,Verify whether the Request to Reschedule popup shown while clicking Request to Reschedule button.,"+  instructorModuleSteps.getResult() );
		instructorModuleSteps.verifyNextEventSectionViewAll();
		Reporter.writeSummary("TCID_Instructor_005,Verify whether the View All link is shown in NextEvent Section.,"+  instructorModuleSteps.getResult() );
		instructorModuleSteps.verifyInvitesReminderViewAll();
		Reporter.writeSummary("TCID_Instructor_006,Verify whether the View All link is shown in Invites & Reminders Section.,"+  instructorModuleSteps.getResult() );
		instructorModuleSteps.verifyEventsPageLabels();
		Reporter.writeSummary("TCID_Instructor_007,Verify whether the below labels are present in the Event Section: Upcoming In Progress Completed,"+  instructorModuleSteps.getResult() );
		instructorModuleSteps.verifyEventsInvitesClick();
		Reporter.writeSummary("TCID_Instructor_016,verify whether the events inside the invites section redirect to event details page while clicking events,"+  instructorModuleSteps.getResult() );
		instructorModuleSteps.verifyLabelsInsideEventDetailsPage();
		Reporter.writeSummary("TCID_Instructor_008,Verify whether the below labels are present in the Event details page:Pre-EventSession Post-Event Reference Terms&Conditions,"+  instructorModuleSteps.getResult() );
		instructorModuleSteps.verifyInprogressEvent();
		Reporter.writeSummary("TCID_Instructor_009,Verify whether the below labels are present in the Inprogress Event details page:Pre-Event Session Post-Event Reference Terms&Conditions,"+  instructorModuleSteps.getResult() );
		instructorModuleSteps.verifyUpcomingEvent();
		Reporter.writeSummary("TCID_Instructor_010,Verify whether the below labels are present in the Upcoming Event details page:Pre-Event Session Post-Event Reference Terms&Conditions,"+  instructorModuleSteps.getResult() );
		instructorModuleSteps.verifyCompletedEvent();
		Reporter.writeSummary("TCID_Instructor_011,Verify whether the below labels are present in the Completed Event details page:Pre-Event Session Post-Event Reference Terms&Conditions,"+  instructorModuleSteps.getResult() );
		instructorModuleSteps.verifyActivitiesAndRosterTab();
		Reporter.writeSummary("TCID_Instructor_012,Verify whether the below tabs are present in the Completed and Inprogress Event details page:Activities and materials Roster,"+  instructorModuleSteps.getResult() );
		instructorModuleSteps.verifySkillsetList();
		Reporter.writeSummary("TCID_Instructor_013,Verify whether the  labels are present in the Skill drop-down,"+  instructorModuleSteps.getResult() );
		// 	instructorModuleSteps.verifyEvalutionDueDateReachingEvent();
		Reporter.writeSummary("TCID_Instructor_014,Verify whether the view details buttons  are present in the Evalution Due Date Reaching Event.,"+  instructorModuleSteps.getResult() );
		instructorModuleSteps.verifyReviewButton();
		Reporter.writeSummary("TCID_Instructor_015,Verify whether the Review buttons  are present in the INVITES AND REMAINDERS page while we clicking view all button,"+  instructorModuleSteps.getResult() );
		instructorModuleSteps.verifyReviewInsideLabels();
		Reporter.writeSummary("TCID_Instructor_017,Verify whether the  below labels are present in the Review details page:ALL REVIEW COMPLETED REVIEW PENDING Description,"+  instructorModuleSteps.getResult() );

	}
}
