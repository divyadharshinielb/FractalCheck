package com.origin.fractal.testauto.test.testsuites.mobile;

import org.testng.annotations.Test;

import com.origin.fractal.testauto.steps.mobile.MACatalogSteps;
import com.origin.fractal.testauto.steps.mobile.MAForgotPasswordSteps;
import com.origin.fractal.testauto.steps.mobile.MALoginSteps;
import com.origin.fractal.testauto.steps.mobile.MAMenuOptionsSteps;
import com.origin.fractal.testauto.steps.mobile.MAMyAccountSteps;
import com.origin.fractal.testauto.steps.mobile.MAMyLearningInProSteps;
import com.origin.fractal.testauto.steps.mobile.MASelectInstanceSteps;
import com.origin.fractal.testauto.steps.mobile.MAWhatsNewSteps;
import com.origin.fractal.testauto.test.FractalBaseAppTest;
import com.wv.auto.framework.app.AppFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class AndroidCatalogTests extends FractalBaseAppTest {

	private AppiumDriver<MobileElement> appDriver;

	@Test(groups = { "pilot" }, enabled = true, description = "TCID_42,43,50,45,47:Verification of catalog page"
			+ "42: Verify Popular categories are listed in the Catalog page"
			+ "43: Verify what's new contents are listed in the Catalog page"
			+ "45: Verify the BUY button for the paid catalog item"
			+ "50: Verify the filter icon is displayed"
			+ "47: Verify the Catalogs are displayed correspond to the selected Category under Popular category")
	public void verifyCatalogPage0() {
		appDriver = AppFactory.getAndroidApp();
		System.out.println("42");

		MALoginSteps maLoginSteps = new MALoginSteps(appDriver);
		maLoginSteps.doLogin();
		// Select Instance Screen
		MASelectInstanceSteps mASIS = new MASelectInstanceSteps(appDriver);
		//mASIS.selectFractal();
		mASIS.selectFractalDemo();
		// What's New Screen MAWhatsNewSteps
		MAWhatsNewSteps mAWNS = new MAWhatsNewSteps(appDriver);
		wait(5);
		mAWNS.clickLater();
		// My Learning Screen
		MAMyLearningInProSteps mAMLS = new MAMyLearningInProSteps(appDriver);
		mAMLS.clickMenu();
		// Menu Options Screen
		MAMenuOptionsSteps mAMnuSteps = new MAMenuOptionsSteps(appDriver);
		mAMnuSteps.clickOnCategory();
		// Catalog Screen
		MACatalogSteps mACatSteps = new MACatalogSteps(appDriver);
		/*Starts - Dec-03-18*/
		wait(5);
		mACatSteps.verifyPopularCategory();
		mACatSteps.verifyWhatsNewContents();
		/*Ends - Dec-03-18*/
		/*Starts - Dec-06-18*/
		mACatSteps.verifyFilterExist() ;
		/*Ends - Dec-06-18*/
		/*Starts - Dec-10-18*/
		mACatSteps.verifyBuyButton();
		mACatSteps.verifyCategory();
		/*Ends - Dec-10-18*/
		mAMLS.clickMenu();
		mAMnuSteps.clickOnLogout();
	}
	
	@Test(groups = { "pilot" }, enabled = true, description = "TCID_48,49,51,52,53,54,55,56:Verification of catalog page"
			+ "48: Verify LIST view"
			+ "49: Verify GRID view"
			+ "51: Verify bundle filter"
			+ "52: Verify learning path filter"
			+ "53: Verify course filter"
			+ "54: Verify resource filter"
			+ "55: Verify all the contents are displayed if the All Filter is applied"
			+ "56: Verify the Language filter is working fine")
	public void verifyCatalogPage1() {
		appDriver = AppFactory.getAndroidApp();
		System.out.println("51");

		MALoginSteps maLoginSteps = new MALoginSteps(appDriver);
		maLoginSteps.doLogin();
		// Select Instance Screen
		MASelectInstanceSteps mASIS = new MASelectInstanceSteps(appDriver);
		//mASIS.selectFractal();
		mASIS.selectFractalDemo();
		// What's New Screen MAWhatsNewSteps
		MAWhatsNewSteps mAWNS = new MAWhatsNewSteps(appDriver);
		wait(5);
		mAWNS.clickLater();
		// My Learning Screen
		MAMyLearningInProSteps mAMLS = new MAMyLearningInProSteps(appDriver);
		mAMLS.clickMenu();
		// Menu Options Screen
		MAMenuOptionsSteps mAMnuSteps = new MAMenuOptionsSteps(appDriver);
		mAMnuSteps.clickOnCategory();
		// Catalog Screen
		MACatalogSteps mACatSteps = new MACatalogSteps(appDriver);
		
		mACatSteps.verifyListView();
		mACatSteps.verifyGridView();
		/*Ends - Dec-10-18*/
		
		/*Starts - Dec-11-18*/
		mACatSteps.verifyBundleFilter();
		mACatSteps.verifyLpathFilter();
		mACatSteps.verifyCourseFilter();
		mACatSteps.verifyResourceFilter();
		/*Ends - Dec-11-18*/
		/*Starts - Dec-12-18*/
		mACatSteps.verifyAllFilter();
		mACatSteps.verifyLangFilter();
		/*Ends - Dec-12-18*/
		wait(5);
		mAMLS.clickMenu();
		mAMnuSteps.clickOnLogout();
		
	}
}
