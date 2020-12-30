package com.origin.fractal.testauto.test.testsuites;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.origin.fractal.testauto.DataManager;
import com.origin.fractal.testauto.steps.DownloadContentSteps;
import com.origin.fractal.testauto.steps.ForgotPasswordSteps;
import com.origin.fractal.testauto.steps.GlobalSteps;
import com.origin.fractal.testauto.steps.HomeSteps;
import com.origin.fractal.testauto.steps.LoginSteps;
import com.origin.fractal.testauto.steps.MenuSteps;
import com.origin.fractal.testauto.steps.MyLearningSteps;
import com.origin.fractal.testauto.steps.RenewButtonSteps;
import com.origin.fractal.testauto.steps.UserPaginationSteps;
import com.origin.fractal.testauto.steps.VideoTesterSteps;
import com.origin.fractal.testauto.test.FractalBaseWebTest;
import com.wv.auto.framework.BrowserFactory;
import com.wv.auto.framework.utils.Reporter;

public class Staging_Daily extends FractalBaseWebTest {
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
	@Test(dataProvider = "browers", groups = { "pilot", "Home" }, enabled = true,
			// description="Verify categories are available as expected" )
			description = "TC_Verify Home Page has Learning in progress text, completion status, Continue text and button, recently"
					+ "added courses and arrow button at the top")
	public void testHomePage(String row, String strBrowserName) {
		driver = BrowserFactory.getBrowser(strBrowserName);
		login(driver);

		HomeSteps homeSteps = new HomeSteps(driver);
		//TCID_37:Checking whether the dash board contains the heading Learning in Progress
	    homeSteps.verifyContinueText();//newui
		Reporter.writeSummary("TCID_HOME_041,  Verify Continue button is displayed, " + homeSteps.getResult() );
	    homeSteps.clickContinueBtnRetToHome();//newui
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
		renew.completedRenewbtnCheck();
		Reporter.writeSummary("FR1-2496_Renew_TC-03,Verify renew button in  Completed page," + renew.getResult() );
		renew.whatsnewRenewBtnCheck();
		Reporter.writeSummary("FR1-2777_Renew_TC-01,Verify renew button in  WhatsNew and Dashboard page," + renew.getResult() );
		renew.categoryRenewBtnCheck();
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
}
