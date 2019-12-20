package com.origin.fractal.testauto.test.testsuites;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import com.origin.fractal.testauto.test.FractalBaseWebTest;
import com.wv.auto.framework.BrowserFactory;
import com.origin.fractal.testauto.DataManager;
import com.origin.fractal.testauto.steps.AccountSteps;
import com.origin.fractal.testauto.steps.GlobalSteps;
import com.wv.auto.framework.utils.Reporter;

public class WebTestGlobalSearch extends FractalBaseWebTest {
	@DataProvider
	public  Object[][] browers() {
		return new Object[][] {
			new Object[] { "1", "chrome" }
//		, new Object[] { "2", "firefox" }
//		, new Object[] { "3", "msedge" } 
//		 new Object[] { "4", "ie11" }
		};
	}

	
	@Test(dataProvider = "browers", groups = { "pilot", "Home" }, enabled = true,
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
		Reporter.writeSummary("TCI_Global_02, Verify Global Search for image and images,"+ globalSteps.getResult());
		//TCID_:Verify Global Search for Audio and Audios
		globalSteps.GlobalSearchforAudioandAudios();
		Reporter.writeSummary("TCI_Global_03, Verify Global Search for Audio and Audios,"+ globalSteps.getResult());
		//TCID_:Verify Global Search for video and videos
		globalSteps.GlobalSearchforVideoandVideos();
		Reporter.writeSummary("TCI_Global_04, Verify Global Search for video and videos,"+globalSteps.getResult());
		//TCID_:Verify Global Search for document and documents
		globalSteps.GlobalSearchforDocumentandDocuments();
		Reporter.writeSummary("TCI_Global_05, Verify Global Search for document and documents,"+globalSteps.getResult());
		//TCID_:Verify Global Search for vlab and vlabs
		globalSteps.GlobalSearchforVlabsandVlabs();
		Reporter.writeSummary("TCI_Global_06, Verify Global Search for vlab and vlabs,"+globalSteps.getResult());
		//TCID_:Verify Global Search for assessment and assessments
		//globalSteps.GlobalSearchforAssessmentandAssessments();
		Reporter.writeSummary("TCI_Global_07, Verify Global Search for assessment and assessments,"+globalSteps.getResult());
		//TCID_:Verify Global Search for elearning and elearnings
		globalSteps.GlobalSearchforElearningandElearnings();
		Reporter.writeSummary("TCI_Global_08, Verify Global Search for elearning and elearnings,"+globalSteps.getResult());
		//TCID_:Verify Global Search for bundles and bundles
		globalSteps.GlobalSearchforBundleandBundles();
		Reporter.writeSummary("TCI_Global_09, Verify Global Search for bundles and bundles,"+globalSteps.getResult());
		//TCID_:Verify Global Search for podcast and podcasts
		globalSteps.GlobalSearchforPodcastandPodcasts();
		Reporter.writeSummary("TCI_Global_10, Verify Global Search for podcast and podcasts,"+globalSteps.getResult());
		//TCID_:Verify Global Search for learningpath and learningpaths
		globalSteps.GlobalSearchforLearningpathandLearningpaths();
		Reporter.writeSummary("TCI_Global_11, Verify Global Search for learningpath and learningpaths,"+globalSteps.getResult());
		//TCID_:Verify Global Search for course and courses
		globalSteps.GlobalSearchforCourseandCourses();
		Reporter.writeSummary("TCI_Global_12, Verify Global Search for course and courses,"+globalSteps.getResult());
		//TCID_:Verify Global Search for resource  and resource 
		globalSteps.GlobalSearchforResourceandResources();
		Reporter.writeSummary("TCI_Global_13, Verify Global Search for resource and resources ,"+globalSteps.getResult());
		//TCID_:Verify Global Search with random characters and integers.
		globalSteps.GlobalSearchwithRandomcharacterandIntegers();
		Reporter.writeSummary("TCI_Global_14, Verify Global Serach with random characters and integers,"+globalSteps.getResult());
		//TCID_:Verify Global Search with Special characters
		globalSteps.GlobalSearchwithSpecialcharacters();
		Reporter.writeSummary("TCI_Global_15, Verify Global Search with Special characters,"+globalSteps.getResult());
		//TCID_: Verify Global Search with unavailable keyword
		globalSteps.GlobalSearchwithUnavailableKeyword();
		Reporter.writeSummary("TCI_Global_16, Verify Global Search with unavailable keyword,"+globalSteps.getResult());
		//TCID_: Verify Global Search with double and tab Space
		globalSteps.GlobalSearchwithDoubleandTabspace();
		Reporter.writeSummary("TCI_Global_17, Verify Global Search with double and tab Space,"+globalSteps.getResult());
		
		}
}
