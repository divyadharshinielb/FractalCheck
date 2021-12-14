package com.origin.originweb.testauto.test.testsuites;

import java.io.IOException;

import org.testng.annotations.Test;

import com.origin.originweb.testauto.DataManager;
import com.origin.originweb.testauto.steps.OriginFractalLoadSteps;
import com.origin.originweb.testauto.test.WebTestOriginFractalWebBase;
import com.wv.auto.framework.BrowserFactory;
import com.wv.auto.framework.utils.Reporter;
import com.wv.auto.framework.utils.TimeManager;

/* File Name: WebTestOriginFractalLoad.java
 * Purpose: https://originfractal.com/ - Verifying page loading test
 * Number of Test Cases: 18
 * Created by: Vigneshwaran R
 * Created on: 10-Nov-2020
 * updated on: 12-Jan-21
 */
public class WebTestOriginFractalLoad extends WebTestOriginFractalWebBase {
	@Test(dataProviderClass=DataManager.class, dataProvider = "browsers", groups= {"pilot"}, enabled= true, 
			description="")
	public void TestHeaderElementPageLoading(String row, String strBrowserName) throws IOException  {
		driver = BrowserFactory.getBrowser(strBrowserName);
		OriginFractalLoadSteps Steps=new OriginFractalLoadSteps(driver);
		goToUrl(driver);
		Reporter.writeSummary("Url-Navigation,Open the URL(https://originfractal.com/) ,"+TimeManager.getTimeDiffFromPrevEventInSecs().intern()+","+Steps.getResult());
		Steps.verifyHeaderSolutionSub1();
		Reporter.writeSummary("TC-01_Header-Solution,Verifying the Fractal LXP for L&D under solution page loading time,"+TimeManager.seconds+"," +  Steps.getResult());
		Steps.verifyHeaderSolutionSub2();
		Reporter.writeSummary("TC-20_Header-Solution,Verifying the Fractal LXP for Sales Leaders under solution page loading time,"+TimeManager.seconds+"," +  Steps.getResult());
		Steps.verifyHeaderSolutionSub3();
		Reporter.writeSummary("TC-21_Header-Solution,Verifying the Fractal LXP for Customer Support under solution page loading time,"+TimeManager.seconds+"," +  Steps.getResult());
		Steps.verifyHeaderFeature();
		Reporter.writeSummary("TC-02_Header-Feature,Verifying the feature page loading time,"+TimeManager.seconds+"," +  Steps.getResult());
		Steps.verifyHeaderPricing();
		Reporter.writeSummary("TC-03_Header-Pricing,Verifying the pricing page loading time,"+TimeManager.seconds+"," +  Steps.getResult());
		//30-Dec-20: popup is NOT clickable in TrailsignUp sheet
		//		Steps.verifyHeaderTrail();
		//		Reporter.writeSummary("TC-03_Header-TrialSignUp,Verifying the trail sign Up page loading time,"+TimeManager.seconds+"," +  Steps.getResult());
		//Ends
		//Commented on 12-Jan-2020 (Blog is NOT presenting in the website)
		//		Steps.verifyHeaderBlog();
		//	Reporter.writeSummary("TC-04_Header-Blog,Verifying the Blog page loading time,"+TimeManager.seconds+"," +  Steps.getResult());
		//		Steps.verfiySearchFunction();
		//		Reporter.writeSummary("TC-05_Header-SearchBlog,Verifying the Search Blog loading time,"+TimeManager.seconds+"," +  Steps.getResult());
		// Ends
		//added on 13-Jan-21
    	Steps.verifyHeaderResources();
		Reporter.writeSummary("TC-04_Header-Resources,Verifying the Resources page loading time,"+TimeManager.seconds+"," +  Steps.getResult());
		Steps.verifyunpluggedBanner();
		Reporter.writeSummary("TC-05_Header-Resources,Verifying the Unplugged page loading time,"+TimeManager.seconds+"," +  Steps.getResult());
		//Ends
		Steps.verifyHeaderPhilosophy();
		Reporter.writeSummary("TC-06_Header-Philosophy,Verifying the Philosophy page loading time,"+TimeManager.seconds+"," +  Steps.getResult());
		Steps.verifyHeaderCareer();
		Reporter.writeSummary("TC-22_Header-Career,Verifying the career page loading time,"+TimeManager.seconds+"," +  Steps.getResult());
		Steps.verifyHeaderAbout();
		Reporter.writeSummary("TC-07_Header-About-Us,Verifying the About-Us page loading time,"+TimeManager.seconds+"," +  Steps.getResult());
		Steps.verifyHeaderContact();
		Reporter.writeSummary("TC-08_Header-Contact-Us,Verifying the contact page loading time,"+TimeManager.seconds+"," +  Steps.getResult());
		Steps.verifyHomeLogo();
		Reporter.writeSummary("TC-09_HomeLogo,Verifying the Home page loading time,"+TimeManager.seconds+"," +  Steps.getResult());
		Steps.verifyPostBlog1();
		Reporter.writeSummary("TC-10_PostedBlog-1,Verifying the PostedBlog-1 page loading time,"+TimeManager.seconds+"," +  Steps.getResult());
		Steps.verifyPostBlog2();
		Reporter.writeSummary("TC-11_PostedBlog-2,Verifying the PostedBlog-2 page loading time,"+TimeManager.seconds+"," +  Steps.getResult());
		Steps.verifyPostBlog3();
		Reporter.writeSummary("TC-12_PostedBlog-3,Verifying the PostedBlog-3 page loading time,"+TimeManager.seconds+"," +  Steps.getResult());
		Steps.verifylblHome();
		Reporter.writeSummary("TC-13_Footer - Home,Verifying the footer Home page loading time,"+TimeManager.seconds+"," +  Steps.getResult());
		Steps.verifylblLxpLearners();
		Reporter.writeSummary("TC-14_Footer - LXP Learner,Verifying the LXP learners loading time,"+TimeManager.seconds+"," +  Steps.getResult());
		Steps.verifylblLxpEnterprises();
		Reporter.writeSummary("TC-15_Footer - LXP Enterprises ,Verifying the LXP enterprises loading time,"+TimeManager.seconds+"," +  Steps.getResult());
		Steps.verifylblLxpDomain();
		Reporter.writeSummary("TC-16_Footer - LXP Domain  ,Verifying the LXP DomainExperts loading time,"+TimeManager.seconds+"," +  Steps.getResult());
		Steps.verifyAndroidPlayStore();
		Reporter.writeSummary("TC-17_ PlayStore Link,Verifying the play store link loading time,"+TimeManager.seconds+"," +  Steps.getResult());
		Steps.verifyiOSAppStore();
		Reporter.writeSummary("TC-18_ Appstore Link ,Verifying the app store link loading time,"+TimeManager.seconds+"," +  Steps.getResult());
	//	Steps.verifyBlog();
	//	Reporter.writeSummary("TC-19_ Blog Link ,Verifying the blog link loading time,"+TimeManager.seconds+"," +  Steps.getResult());
	}
}