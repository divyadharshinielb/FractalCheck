package com.origin.originweb.testauto.test.testsuites;

import java.io.IOException;

import org.testng.annotations.Test;

import com.origin.originweb.testauto.DataManager;
import com.origin.originweb.testauto.steps.OriginFractalSteps;
import com.origin.originweb.testauto.test.WebTestOriginFractalWebBase;
import com.wv.auto.framework.BrowserFactory;
import com.wv.auto.framework.utils.Reporter;
import com.wv.auto.framework.utils.TimeManager;

/* File Name: WebTestOriginFractalLoad.java
 * Purpose: https://originfractal.in/ - Verifying page loading test
 * Number of Test Cases: 20
 * Created by: Vigneshwaran R
 * Created on: 9-Dec-2020
 */
public class WebTestOriginFractal extends WebTestOriginFractalWebBase {
	@Test(dataProviderClass=DataManager.class, dataProvider = "browsers", groups= {"pilot"}, enabled= true, 
			description="")
	public void TestwebPageLoading(String row, String strBrowserName) throws IOException {
		driver = BrowserFactory.getBrowser(strBrowserName);
		OriginFractalSteps Steps=new OriginFractalSteps(driver);
		goToUrl(driver);
		Reporter.writeSummary("Url-Navigation,Open the URL ,"+TimeManager.getTimeDiffFromPrevEventInSecs().intern()+","+Steps.getResult());
		Steps.verifyHeaderOPM();
		Reporter.writeSummary("TC-02_Header-OPM,Verifying the OPM page loading time,"+TimeManager.seconds+"," +  Steps.getResult());
		Steps.verifyHeaderPlatform();
		Reporter.writeSummary("TC-01_Header-Platform,Verifying the Platform page loading time,"+TimeManager.seconds+"," +  Steps.getResult());
		Steps.verifyHeaderPhilosophy();
		Reporter.writeSummary("TC-03_Header-Philosophy,Verifying the Philosophy page loading time,"+TimeManager.seconds+"," +  Steps.getResult());
		Steps.verifyFutureWork();
		Reporter.writeSummary("TC-04_Header-FutureWork,Verifying the Future Work page loading time,"+TimeManager.seconds+"," +  Steps.getResult());
		Steps.verifyHeaderContact();
		Reporter.writeSummary("TC-05_Header-Contact,Verifying the Contact page loading time,"+TimeManager.seconds+"," +  Steps.getResult());
		Steps.verifyHeaderTryPlatform();
		Reporter.writeSummary("TC-06_Header-TryPlatform,Verifying the Try Platform page loading time,"+TimeManager.seconds+"," +  Steps.getResult());
		Steps.verifyHeaderFutureWorkSignUp();
		Reporter.writeSummary("TC-07_Header-FutureWorkSignUp,Verifying the FutureWork Sign-up page loading time,"+TimeManager.seconds+"," +  Steps.getResult());
		Steps.verifyHomeIcon();
		Reporter.writeSummary("TC-08_HomeLogo,Verifying the Home page loading time,"+TimeManager.seconds+"," +  Steps.getResult());	
		Steps.verifyHomePoster1();
		Reporter.writeSummary("TC-09_HomePage_Poster1,Verifying the Poster-1 page loading time,"+TimeManager.seconds+"," +  Steps.getResult());
		Steps.verifyHomePoster2();
		Reporter.writeSummary("TC-10_HomePage_Poster2,Verifying the Poster-2 page loading time,"+TimeManager.seconds+"," +  Steps.getResult());
		Steps.verifyHomePoster3();
		Reporter.writeSummary("TC-11_HomePage_Poster3,Verifying the Poster-3 page loading time,"+TimeManager.seconds+"," +  Steps.getResult());
		Steps.verfiyKnowMoreBtn();
		Reporter.writeSummary("TC-12_HomePage_BtnKnowMore,Verifying the Know more button is Clickable,"+TimeManager.seconds+"," +  Steps.getResult());
		Steps.verfiyTryPlatForm();
		Reporter.writeSummary("TC-13_PlatformPage_TryBtn,Verifying the Try button-PlatForm page loading time,"+TimeManager.seconds+"," +  Steps.getResult());
		Steps.verifyiOSapp();
		Reporter.writeSummary("TC-14_PlatformPage_Appstore Link ,Verifying the app store link loading time,"+TimeManager.seconds+"," +  Steps.getResult());
		Steps.verifyAndroidapp();
		Reporter.writeSummary("TC-15_PlatformPage_PlayStore Link,Verifying the play store link loading time,"+TimeManager.seconds+"," +  Steps.getResult());
		Steps.verfiyTryAndContactBtn();
		Reporter.writeSummary("TC-16_OPMPage_Btn,Verifying the Try and Contact button are Clickable,"+TimeManager.seconds+"," +  Steps.getResult());
		Steps.verifySignUpBtn();
		Reporter.writeSummary("TC-17_FeatureWorkPage_SignUpbtn,Verifying the SignUp button -FeatureWork page loading time,"+TimeManager.seconds+"," +  Steps.getResult());
		Steps.verifyTalkToUs();
		Reporter.writeSummary("TC-18_PhilosophyPage_Link,Verifying the Talk To Us link-Philosophy page loading time,"+TimeManager.seconds+"," +  Steps.getResult());
		Steps.verifyFooterFractalWeb();
		Reporter.writeSummary("TC-19_Footer_OriginFractalLink,Verifying the OriginFractal link loading time,"+TimeManager.seconds+"," +  Steps.getResult());
		Steps.verifyFooterOriginWeb();
		Reporter.writeSummary("TC-20_Footer_OriginLearningLink,Verifying the OriginLearning link loading time,"+TimeManager.seconds+"," +  Steps.getResult());
	}
}