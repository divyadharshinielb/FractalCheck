package com.origin.fractal.testauto.test.testsuites;
// This is the new class for Sprint 1 tests
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.origin.fractal.testauto.steps.AccountSteps;
import com.origin.fractal.testauto.steps.HomeSteps;
import com.origin.fractal.testauto.steps.MyLearningSteps;
import com.origin.fractal.testauto.steps.SettingsSteps;
import com.origin.fractal.testauto.test.FractalBaseWebTest;
import com.wv.auto.framework.BrowserFactory;

public class WebTestsSprint1 extends FractalBaseWebTest {

	@DataProvider
	public Object[][] browers() {
		return new Object[][] { new Object[] { "1", "chrome" }
//		, new Object[] { "2", "firefox" }
//		, new Object[] { "3", "msedge" } 
		};
	}
	
	@Test(dataProvider = "browers", groups = {
	"Phase1.2" }, enabled = false, description = "TCID_nnn : Verify Settings Page")
public void testSettings(String row, String strBrowserName) {

driver = BrowserFactory.getBrowser(strBrowserName);
login(driver);

// Test moves to next page
HomeSteps homeSteps = new HomeSteps(driver);
homeSteps.clickOnProfile();
homeSteps.clickOnsettings();

// Test moves to next page
SettingsSteps settingsSteps = new SettingsSteps(driver);
settingsSteps.printStatus();
settingsSteps.clickOnSwitch();
settingsSteps.clickOnSave();
}




@Test(dataProvider = "browers", groups= {"pilot"}, enabled= false, 
			description="TCID_61,62,64,63,67: "
			+ "61: Verify  My account page, "
			+ "62: Verify  My Account Profile details,"
			+ "63:Verify the validation for all fields under profile"
			+ "64: verify the error message on leaving all the fields empty,"
			+ "67: Verifying the changes should not be displayed on clciking Cancel")
public void testMyAccountPage(String row, String strBrowserName) {
	
	driver = BrowserFactory.getBrowser(strBrowserName);
	login(driver);
	AccountSteps accountSteps = new AccountSteps(driver);
	accountSteps.clickOnMyAccount();
	accountSteps.verifyAccountPageLabels();
	accountSteps.verifyProfileDetails();
	accountSteps.verifyEmptyProfileValidation();
	accountSteps.verifyAfterCancelValidation();
	accountSteps.verifyFieldValidation();//63

}



@Test(dataProvider = "browers", groups= {"pilot"}, enabled= false, 
	//description="Verify categories are available as expected"	)
	description="TCID_2,9,10,13,34: Verify  to My Home page datas,Verify progress of learnig item in Home"
			+ "Verify My Learning page details on clicking contnue d=from Home Page, Verification of Viewall page labels"
			+ "Verify Privacy, Terms and Contact links")
public void testDashboardPage(String row, String strBrowserName) {
	
	driver = BrowserFactory.getBrowser(strBrowserName);
	login(driver);
	
	// Test moves to Home page
	HomeSteps homeSteps = new HomeSteps(driver);

	/*Added by Manju Priya A on Nov-27-18*/
	homeSteps.verifyHomePageData();
	homeSteps.verifyLearningInprogress();
	homeSteps.verifyMyLearningLabeltext();//updated By Manju on Nov-28-18
	
	/*Added by Manju Priya A on Nov-28-18*/
	homeSteps.verifyViewAllPage();
	/*Added by Manju Priya A on Nov-29-18*/
	homeSteps.verifyFooterLinks();
	
	/*homeSteps.verifyAllFilterRcntAdded();
	homeSteps.verifyBundleFilterRcntAdded();
	homeSteps.verifyCourseFilterRcntAdded();
	homeSteps.verifyResourceFilterRcntAdded();
	homeSteps.verifyLearnPathFilterRcntAdded();

	homeSteps.verifyAllFilterRecommAdded();		    
	homeSteps.verifyCourseFilterRecommAdded();
	homeSteps.verifyResourceFilterRecommAdded();=>commented by manju on Nov-27-18*/

   /*** as of now there is No bundle and learning paths for recommended added- mahesh-23/11/2018***/
	/* homeSteps.verifyBundleFilterRecommAdded();
   homeSteps.verifyLearnPathFilterRecommAdded();*/
   //*****most popular***//
   /*homeSteps.verifyAllFilterMostAdded();
   homeSteps.verifyBundleFilterMostAdded();
   homeSteps.verifyLearnPathFilterMostAdded();=>commented by manju on Nov-27-18*/

  /*** as of now there is No course and resource for mostly added- mahesh-23/11/2018***/
/*homeSteps.verifyCourseFilterMostAdded();
   homeSteps.verifyResourceFilterMostAdded();*/
}
@Test(dataProvider = "browers", groups= {"pilot"}, enabled= true, 
	//description="Verify categories are available as expected"	)
	description="TCID_33:Checking whether the coverage percentage is shown with the text \"Coverage\""
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
			+ "TCID_79:Verify the function of  Cart  icon "
			+ "TCID_80:Verify the function of  Wishlist icon "
			+ "TCID_3:Verify My Learning page is displayed after logging to app. ")
public void testDashboardPage1(String row, String strBrowserName) {
	
	driver = BrowserFactory.getBrowser(strBrowserName);
	login(driver);
	
	// Test moves to Home page
	HomeSteps homeSteps = new HomeSteps(driver);
   System.out.println("***************************************Verify ViewAllRcntAddedBtn********************");
//	homeSteps.ViewAllRcntAddedBtn();
	System.out.println("***************************************Verify ComplStatus********************");
//    homeSteps.verifyComplStatus();
    System.out.println("***************************************Verify CoverageText********************");
//    homeSteps.verifyCoverageText();
    System.out.println("***************************************Verify ContinueText********************");
	homeSteps.verifyContinueText();
	System.out.println("***************************************Verify ContinueBtn********************");
//	homeSteps.clickContinueBtn();
	System.out.println("***************************************Verify RcntAdded_Courses********************");
//    homeSteps.RcntAdded_Courses();
    System.out.println("***************************************Verify RcntAdded_CoursesText********************");
	homeSteps.verifyRcntAdded_CoursesText();
	System.out.println("***************************************Verify TOP ARROW BUTTON '^'********************");
	homeSteps.verifyTopArrBtn();
	System.out.println("***************************************NextBtn'>'********************");
	homeSteps.verifyNextBtn();
	System.out.println("***************************************PreviousBtn'<'********************");
	homeSteps.verifyPreviousBtn();
	System.out.println("***************************************verify WishListBtn********************");
	homeSteps.verifyWishListBtn();
	System.out.println("***************************************verify CartItemBtn********************");
	homeSteps.verifyCartItemBtn();
	System.out.println("***************************************verify MyLearningPage********************");
     homeSteps.verifyMyLearningPage();
     System.out.println("***************************************verifyLogoImg********************");
     homeSteps.verifyLogoImg();
	wait(10);
/*******30/11/2018**********/
homeSteps.whatsNewSectionAttributes();
/******************/
	
	 homeSteps.verifyAllFilterWhatsNew();
  // homeSteps.verifyBundleFilterWhatsNew();
  // homeSteps.verifyCourseFilterWhatsNew();
   homeSteps.verifyResourceFilterWhatsNew();
   homeSteps.verifyLearnPathFilterWhatsNew();

   homeSteps.verifyAllFilterRecommAdded();		    
   homeSteps.verifyCourseFilterRecommAdded();
   homeSteps.verifyResourceFilterRecommAdded(); 

   /*** they are restrict bundle and learning paths for recommended added ***/
   homeSteps.verifyBundleFilterRecommAdded();
   homeSteps.verifyLearnPathFilterRecommAdded(); 
	
   homeSteps.verifyAllFilterMostAdded();
   homeSteps.verifyBundleFilterMostAdded();
   homeSteps.verifyLearnPathFilterMostAdded();

  /*** they are restrict course and resource for mostly added ***/
   homeSteps.verifyCourseFilterMostAdded();
   homeSteps.verifyResourceFilterMostAdded();
   wait(10);
}


}
