package com.origin.fractal.testauto.test.testsuites;

import org.testng.annotations.Test;

import com.origin.fractal.testauto.steps.mobile.*;
import com.origin.fractal.testauto.test.FractalBaseAppTest;
import com.wv.auto.framework.app.AppFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class AndroidTest extends FractalBaseAppTest {

	private AppiumDriver<MobileElement> appDriver;

	public static void main(String[] args) {

		new AndroidTest().mobileTest();

	}

	@Test(groups = { "pilot" }, enabled = false, description = "Combined mobile test")
	public void mobileTest() {
		try {
			appDriver = AppFactory.getAndroidApp();

			MALoginSteps maLoginSteps = new MALoginSteps(appDriver);
			maLoginSteps.doLogin();

			// Select Instance Screen
			MASelectInstanceSteps mASIS = new MASelectInstanceSteps(appDriver);
			mASIS.validateInstanceSelectionPage();

			mASIS.swipeInstances();

			mASIS.selectFractal();

			// What's New Screen MAWhatsNewSteps
			//MAWhatsNewSteps mAWNS = new MAWhatsNewSteps(appDriver);
			//mAWNS.validateWhatsNewPage();
			//mAWNS.clickLater();

			// My Learning Screen
			MAMyLearningInProSteps mAMLS = new MAMyLearningInProSteps(appDriver);
			mAMLS.validateMyLearningTitle();
			mAMLS.clickCompleted();
			mAMLS.clickMenu();

			// Menu Options Screen
			MAMenuOptionsSteps mAMnuSteps = new MAMenuOptionsSteps(appDriver);
			mAMnuSteps.validateCategoryPresence();
			mAMnuSteps.clickOnCategory();

			// Catalog Screen
			MACatalogSteps mACatSteps = new MACatalogSteps(appDriver);
			mACatSteps.validateCatalogPageTile();
			mACatSteps.verifyBuyPresence();

			mAMLS.clickMenu();
			mAMnuSteps.clickOnLogout();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			appDriver.closeApp();
//			appDriver.resetApp();
		}

	}

	@Test
	public void verifHomePage() {
		appDriver = AppFactory.getAndroidApp();

		MALoginSteps maLoginSteps = new MALoginSteps(appDriver);
		maLoginSteps.doLogin();
		// Select Instance Screen
		MASelectInstanceSteps mASIS = new MASelectInstanceSteps(appDriver);
		mASIS.validateInstanceSelectionPage();

		mASIS.swipeInstances();

		mASIS.selectFractal();

		// What's New Screen MAWhatsNewSteps
		//MAWhatsNewSteps mAWNS = new MAWhatsNewSteps(appDriver);
		//mAWNS.validateWhatsNewPage();
		//mAWNS.clickLater();
		
		MAMyLearningInProSteps mAMLS = new MAMyLearningInProSteps(appDriver);
		mAMLS.validateMyLearningTitle();
		mAMLS.verifyInProgress();
		mAMLS.clickMenu();
		
		MAMenuOptionsSteps mAMnuSteps = new MAMenuOptionsSteps(appDriver);
		mAMnuSteps.clickOnLogout();
		
	}

}
