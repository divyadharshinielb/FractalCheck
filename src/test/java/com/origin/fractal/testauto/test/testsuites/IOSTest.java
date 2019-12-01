package com.origin.fractal.testauto.test.testsuites;

import com.origin.fractal.testauto.steps.mobile.*;
import com.origin.fractal.testauto.test.FractalBaseAppTest;
import com.wv.auto.framework.app.AppFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class IOSTest extends FractalBaseAppTest{

	private static AppiumDriver<MobileElement> appDriver;

	public static void main(String[] args) {
		try {

			appDriver = AppFactory.getiOSApp();
			
			
			MALoginSteps maLoginSteps = new MALoginSteps(appDriver);
			
			maLoginSteps.doLogin();
			
			
			// Select Instance Screen
			MASelectInstanceSteps mASIS = new MASelectInstanceSteps(appDriver);
			mASIS.validateInstanceSelectionPage();

			mASIS.selectFractal();
		
			// What's New Screen MAWhatsNewSteps
			//MAWhatsNewSteps mAWNS = new MAWhatsNewSteps(appDriver);
			//mAWNS.validateWhatsNewPage();
			//mAWNS.clickLater();

			
			
			// My Learning Screen
			MAMyLearningInProSteps mAMLS = new MAMyLearningInProSteps(appDriver);
			mAMLS.validateMyLearningTitle();
			mAMLS.clickCompleted();
//			mAMLS.clickMenu();
			
			// Menu Options Screen
			MAMenuOptionsSteps mAMnuSteps = new MAMenuOptionsSteps(appDriver);
//			mAMnuSteps.validateCategoryPresence();
//			mAMnuSteps.clickOnCategory();
			
			// Catalog Screen
//			MACatalogSteps mACatSteps = new MACatalogSteps(appDriver);
//			mACatSteps.validateCatalogPageTile();
//			mACatSteps.verifyBuyPresence();		
			
			mAMLS.clickMenu();
			mAMnuSteps.clickOnLogout();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			appDriver.closeApp();
		}

	}

}
