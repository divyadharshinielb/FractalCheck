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
		Reporter.writeSummary("URL-Navigation,Open the URL(https://originlearning.com/) ,-"+"," );
		OriginLearningLoadSteps Steps=new OriginLearningLoadSteps(driver);
/*		Steps.verifyHeaderContent();
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
//		Steps.verifyResourceSubMenu();
		Reporter.writeSummary("TC-12_SubMenu - Resource,Verifying the Resources-SubMenu page loading ,"+TimeManager.seconds+"," +  Steps.getResult());
		Steps.verifyAboutSubMenu();
		Reporter.writeSummary("TC-13_SubMenu - About-Us,Verifying the About Us-SubMenu page loading ,"+TimeManager.seconds+"," +  Steps.getResult());
		Steps.verifySearchFunction();
		Reporter.writeSummary("TC-14_Search ,Verifying the search function loading ,"+TimeManager.seconds+"," +  Steps.getResult());
		Steps.verifyAskDemo();
		Reporter.writeSummary("TC-15_AskDemo button ,Verifying the AskDemo button page loading ,"+TimeManager.seconds+"," +  Steps.getResult());
		Steps.verifyOurClintViewBtn();
		Reporter.writeSummary("TC-16_Clint View button ,Verifying the our clint page loading ,"+TimeManager.seconds+"," +  Steps.getResult());
//		Steps.verifyWhatsNewCTALink();
		Reporter.writeSummary("TC-17_Whats New CTA ,Verifying the Whats New CTA link function loading ,"+TimeManager.seconds+"," +  Steps.getResult());
		Steps.verifyrRsourcesCTALink();
		Reporter.writeSummary("TC-18_Resources CTA ,Verifying the Resources CTA link function loading ,"+TimeManager.seconds+"," +  Steps.getResult());
*/
		//** Newly Added scripts due to Site Enhancement 16-12-2021*//By Mahesh 
		Steps.verifyheaderSolutions();
		Reporter.writeSummary("TC-01_Solution_OriginLearningLink,Verify the solution link loading time,"+TimeManager.seconds+"," +  Steps.getResult());
		Steps.verifyHeaderService();
		Reporter.writeSummary("TC-02_Service_OriginLearningLink,Verifying the Service link loading time,"+TimeManager.seconds+"," +  Steps.getResult());
		Steps.verifyheaderProducts();
		Reporter.writeSummary("TC-03_Product_OriginLearningLink,Verifying the Products link loading time,"+TimeManager.seconds+"," +  Steps.getResult());	
		Steps.verifyheaderIndustryExpertise();
		Reporter.writeSummary("TC-04_IndustryExpertise_OriginLearningLink,Verifying the IndustryExpertise link loading time,"+TimeManager.seconds+"," +  Steps.getResult());		
		Steps.verifyheaderLearningModalities();
		Reporter.writeSummary("TC-05_LearningModalities_OriginLearningLink,Verifying the LearningModalities link loading time,"+TimeManager.seconds+"," +  Steps.getResult());
		Steps.verifyheaderResources();
		Reporter.writeSummary("TC-06_Resources_OriginLearningLink,Verifying the Resources link loading time,"+TimeManager.seconds+"," +  Steps.getResult());
		Steps.verifyheaderAbtOrigin();
		Reporter.writeSummary("TC-07_AboutOrigin_OriginLearningLink,Verifying the AbtOrigin link loading time,"+TimeManager.seconds+"," +  Steps.getResult());
		Steps.servicesSubMenuLearningConsulting();
		Reporter.writeSummary("TC-08_LearningConsulting_OriginLearningLink,Verifying the Services > LearningConsulting link loading time,"+TimeManager.seconds+"," +  Steps.getResult());
		Steps.servicesSubMenuLearningTechnologies(); 
		Reporter.writeSummary("TC-09_ElearningTechnology_OriginLearningLink,Verifying the Services > LearningTechnologies link loading time,"+TimeManager.seconds+"," +  Steps.getResult());
		Steps.servicesSubmenuSupport();
		Reporter.writeSummary("TC-10_Support_OriginLearningLink,Verifying the Services > Support link loading time,"+TimeManager.seconds+"," +  Steps.getResult());
		Steps.solutionsSubmenuCustomerEnablement();
		Reporter.writeSummary("TC-11_CustomerEnablement_OriginLearningLink,Verifying the Solutions > CustomerEnablement link loading time,"+TimeManager.seconds+"," +  Steps.getResult());
		Steps.solutionsSubmenuFieldEnablement();
		Reporter.writeSummary("TC-12_FieldEnablement_OriginLearningLink,Verifying the Solutions > FieldEnablement link loading time,"+TimeManager.seconds+"," +  Steps.getResult());
		Steps.solutionsSubmenuWorkforceEnablement();
		Reporter.writeSummary("TC-13_WorkforceEnablement_OriginLearningLink,Verifying the Solutions > WorkforceEnablement link loading time,"+TimeManager.seconds+"," +  Steps.getResult());
		Steps.productsSubmenuOriginFractalLXP(); 
		Reporter.writeSummary("TC-14_OriginFractalLXP_OriginLearningLink,Verifying the Products > OriginFractalLXP link loading time,"+TimeManager.seconds+"," +  Steps.getResult());
		Steps.productsSubmenuOriginFractalEdu();
		Reporter.writeSummary("TC-15_OriginFractalEdu_OriginLearningLink,Verifying the Products > OriginFractalEdu link loading time,"+TimeManager.seconds+"," +  Steps.getResult());
		Steps.learningModalitiesSubmenuInstructorLedtraining();
		Reporter.writeSummary("TC-16_InstructorLedtraining_OriginLearningLink,Verifying the LearningModalities > InstructorLedtraining link loading time,"+TimeManager.seconds+"," +  Steps.getResult());
		Steps.learningModalitiesSubmenuNewMedia();
		Reporter.writeSummary("TC-17_NewMedia_OriginLearningLink,Verifying the LearningModalities > NewMedia link loading time,"+TimeManager.seconds+"," +  Steps.getResult());
		Steps.resourcesSubmenuGrowwithOrigin();
		Reporter.writeSummary("TC-18_GrowwithOrigin_OriginLearningLink,Verifying the Resources > GrowwithOrigin link loading time,"+TimeManager.seconds+"," +  Steps.getResult());
		Steps.aboutOriginSubmenuWhyOrigin();
		Reporter.writeSummary("TC-19_WhyOrigin_OriginLearningLink,Verifying the AboutOrigin > WhyOrigin link loading time,"+TimeManager.seconds+"," +  Steps.getResult());
		Steps.aboutOriginSubmenuOurTeam();
		Reporter.writeSummary("TC-20_OurTeam_OriginLearningLink,Verifying the AboutOrigin > OurTeam link loading time,"+TimeManager.seconds+"," +  Steps.getResult());
		Steps.aboutOriginSubmenuCareers();
		Reporter.writeSummary("TC-21_Careers_OriginLearningLink,Verifying the AboutOrigin > Careers link loading time,"+TimeManager.seconds+"," +  Steps.getResult());
		Steps.aboutOriginSubmenuGetinTouch();
		Reporter.writeSummary("TC-22_GetinTouch_OriginLearningLink,Verifying the AboutOrigin > GetinTouch link loading time,"+TimeManager.seconds+"," +  Steps.getResult());
			}
}