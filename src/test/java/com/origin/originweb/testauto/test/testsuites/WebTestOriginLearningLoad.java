package com.origin.originweb.testauto.test.testsuites;

import java.io.IOException;

import org.testng.annotations.Test;

import com.origin.originweb.testauto.DataManager;
import com.origin.originweb.testauto.steps.OriginLearningLoadSteps;
import com.origin.originweb.testauto.test.WebTestOriginWebBase;
import com.wv.auto.framework.BrowserFactory;
import com.wv.auto.framework.utils.Reporter;
import com.wv.auto.framework.utils.TimeManager;

/* File Name: WebTestOriginLearningLoad.java
 * Purpose: https://originlearning.com/ - Verifying page loading test
 * Number of Test Cases: 18
 * Created by: Vigneshwaran R
 * 
 * Created on: 13-Oct-2020
 */
public class WebTestOriginLearningLoad extends WebTestOriginWebBase {
	@Test(dataProviderClass=DataManager.class, dataProvider = "browsers", groups= {"pilot"}, enabled= true, 
			description="")
	public void TestHeaderElementPageLoading(String row, String strBrowserName) throws IOException {
		driver = BrowserFactory.getBrowser(strBrowserName);
		goToUrl(driver);
		Reporter.writeSummary("URL-Navigation,Open the URL ,-"+"," );
		OriginLearningLoadSteps Steps=new OriginLearningLoadSteps(driver);
		Steps.verifyHeaderContent();
		Reporter.writeSummary("TC-01_Header-Content,Verifying the content page loading ,"+TimeManager.seconds+"," +  Steps.getResult());
		Steps.verifyHeaderTechnology();
		Reporter.writeSummary("TC-02_Header-Technology,Verifying the Technology page loading ,"+TimeManager.seconds+"," +  Steps.getResult());
		Steps.verifyHeaderConsulting();
		Reporter.writeSummary("TC-03_Header-Consulting,Verifying the Consulting page loading ,"+TimeManager.seconds+"," +  Steps.getResult());
		Steps.verifyHeaderResources();
		Reporter.writeSummary("TC-04_Header-Resources,Verifying the Resources page loading ,"+TimeManager.seconds+"," +  Steps.getResult());
		Steps.verifyHeaderAbout();
		Reporter.writeSummary("TC-05_Header-About-Us,Verifying the About-Us page loading ,"+TimeManager.seconds+"," +  Steps.getResult());
		Steps.verifyHeaderCareer();
		Reporter.writeSummary("TC-06_Header-Careers,Verifying the Careers page loading ,"+TimeManager.seconds+"," +  Steps.getResult());
		Steps.verifyHeaderContact();
		Reporter.writeSummary("TC-07_Header-Contact-Us,Verifying the Contact-Us page loading ,"+TimeManager.seconds+"," +  Steps.getResult());
		Steps.verifyHomeLogo();
		Reporter.writeSummary("TC-08_HomeLogo,Verifying the Home page loading ,"+TimeManager.seconds+"," +  Steps.getResult());
		Steps.verifyContentSubMenu();
		Reporter.writeSummary("TC-09_SubMenu - Content,Verifying the Content-SubMenu page loading ,"+TimeManager.seconds+"," +  Steps.getResult());
		Steps.verifyTechnologySubMenu();
		Reporter.writeSummary("TC-10_SubMenu - Technology,Verifying the Technology-SubMenu page loading ,"+TimeManager.seconds+"," +  Steps.getResult());
		Steps.verifyConsultingSubMenu();
		Reporter.writeSummary("TC-11_SubMenu - Consulting,Verifying the Consulting-SubMenu page loading ,"+TimeManager.seconds+"," +  Steps.getResult());
		Steps.verifyResourceSubMenu();
		Reporter.writeSummary("TC-12_SubMenu - Resource,Verifying the Resources-SubMenu page loading ,"+TimeManager.seconds+"," +  Steps.getResult());
		Steps.verifyAboutSubMenu();
		Reporter.writeSummary("TC-13_SubMenu - About-Us,Verifying the About Us-SubMenu page loading ,"+TimeManager.seconds+"," +  Steps.getResult());
		Steps.verifySearchFunction();
		Reporter.writeSummary("TC-14_Search ,Verifying the search function loading ,"+TimeManager.seconds+"," +  Steps.getResult());
		Steps.verifyAskDemo();
		Reporter.writeSummary("TC-15_AskDemo button ,Verifying the AskDemo button page loading ,"+TimeManager.seconds+"," +  Steps.getResult());
		Steps.verifyOurClintViewBtn();
		Reporter.writeSummary("TC-16_Clint View button ,Verifying the our clint page loading ,"+TimeManager.seconds+"," +  Steps.getResult());
		Steps.verifyWhatsNewCTALink();
		Reporter.writeSummary("TC-17_Whats New CTA ,Verifying the Whats New CTA link function loading ,"+TimeManager.seconds+"," +  Steps.getResult());
		Steps.verifyrRsourcesCTALink();
		Reporter.writeSummary("TC-18_Resources CTA ,Verifying the Resources CTA link function loading ,"+TimeManager.seconds+"," +  Steps.getResult());
	}
}