package com.origin.originweb.testauto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.origin.originweb.testauto.OriginFractalWebBasePage;
import com.wv.auto.framework.utils.TimeManager;
/* File Name: OriginFractalLoadPage.java
 * Purpose: https://originfractal.in/ - Verifying page loading time
 * Created by: Vigneshwaran R
 * Created on: 9-Dec-2020
 */
public class OriginFractalPage extends OriginFractalWebBasePage {
	private By headerLogo=By.xpath("(//*[@id='logo'])[2]/a");
	// Heading 
	private By headerPlatform	= By.xpath("(//*[@class='menu-item menu-item-type-post_type menu-item-object-page menu-item-538'])[2]//a");
	private By headerOPM	= By.xpath("(//*[@class='menu-item menu-item-type-post_type menu-item-object-page menu-item-615'])[2]//a");
	private By headerFutureWork	= By.xpath("(//*[@class='menu-item menu-item-type-post_type menu-item-object-page menu-item-614'])[2]//a");
	private By headerPhilosophy	= By.xpath("(//*[@class='menu-item menu-item-type-post_type menu-item-object-page menu-item-613'])[2]//a");
	private By headerContact	= By.xpath("(//*[@class='menu-item menu-item-type-post_type menu-item-object-page menu-item-687'])[2]//a");
	private By headerTryPlatform	= By.xpath("(//*[@class='signup_bt menu-item menu-item-type-custom menu-item-object-custom menu-item-583'])[2]//a");
	private By headerFutureWorkSignUp	= By.xpath("(//*[@class='signup_bt1 menu-item menu-item-type-custom menu-item-object-custom menu-item-589'])[2]//a");
	//Home page
	private By postedOption1 = By.xpath("(//*[@class='elementor-section elementor-top-section elementor-element elementor-element-bd6707f elementor-section-boxed elementor-section-height-default elementor-section-height-default']//div//a)[1]");
	private By postedOption2 = By.xpath("(//*[@class='elementor-section elementor-top-section elementor-element elementor-element-bd6707f elementor-section-boxed elementor-section-height-default elementor-section-height-default']//div//a)[2]");
	private By postedOption3 = By.xpath("(//*[@class='elementor-section elementor-top-section elementor-element elementor-element-bd6707f elementor-section-boxed elementor-section-height-default elementor-section-height-default']//div//a)[3]");
	//Footer
	private By btnPhysicalClassroomsKnowMore= By.xpath("(//*[@class='elementor-button-wrapper']//a)[1]");
	private By btnDigitalTransformationKnowMore	= By.xpath("(//*[@class='elementor-button-wrapper']//a)[2]");
	private By btnPrepareYourStudentsKnowMore = By.xpath("(//*[@class='elementor-button-wrapper']//a)[3]");
	private By footerOriginFractal = By.xpath("(//*[@class='f_credit']/a)[1]");
	private By footerOriginLearning	= By.xpath("(//*[@class='f_credit']/a)[2]");
	private By txtTalkToUs	= By.xpath("(//*[@class='hp_link']//*[text()='Talk to us'])[1]");
	private By appStore	= By.xpath("(//*[@class='elementor-widget-container'])[52]//a");
	private By playStore	= By.xpath("(//*[@class='elementor-widget-container'])[53]//a");
	boolean flag = true;

	public OriginFractalPage(WebDriver driver) {
		super(driver);
		pageName="originFractal";
	}	
	/* Function Name: goToURL()
	 * Purpose: Navigate the URL and close the cookies
	 */
	public void goToURL() {
		goTo(getLabel("webUrl"));
		wait(5);//Added on 18-Dec-20
	}
	/*Function Name: gotoHome()
	 * purpose: Click on home icon
	 */
	public void ClickHome() {
		moveElementFocusandClick(headerLogo);
		wait(2);
	}

	/* Function Name: verifyHeaderPlatform()
	 * Purpose: Verify the page loading time
	 */
	public boolean verifyHeaderPlatform() {
		return clickAndcheckLoading(headerPlatform,getLabel("platformUrl"));
	}

	/* Function Name: verifyHeaderOPM()
	 * Purpose: Verify the page loading time
	 */
	public boolean verifyHeaderOPM() {
		return clickAndcheckLoading(headerOPM,getLabel("opmUrl"));
	}

	/* Function Name: verifyFutureWork()
	 * Purpose: Verify the page loading time
	 */
	public boolean verifyFutureWork() {
		return clickAndcheckLoading(headerFutureWork,getLabel("futureworkUrl"));
	}

	/* Function Name: verifyHeaderPhilosophy()
	 * Purpose: Verify the page loading time
	 */
	public boolean verifyHeaderPhilosophy() {
		return clickAndcheckLoading(headerPhilosophy,getLabel("philosophyUrl"));
	}	

	/* Function Name: verifyHeaderContact()
	 * Purpose: Verify the page loading time
	 */
	public boolean verifyHeaderContact(){
		return clickAndcheckLoading(headerContact,getLabel("contactUrl"));
	}

	/* Function Name: verifyHeaderTryPlatform()
	 * Purpose: Verify the page loading time
	 */
	public boolean verifyHeaderTryPlatform(){
		wait(2);
		return clickAndcheckLoading(headerTryPlatform,getLabel("signupUrl"));
	}

	/* Function Name: verifyHeaderFutureWorkSignUp()
	 * Purpose: Verify the page loading time
	 */
	public boolean verifyHeaderFutureWorkSignUp(){
		moveElementFocus(headerFutureWorkSignUp);
		return clickAndcheckLoadingOtherTab(headerFutureWorkSignUp,getLabel("registerUrl"));
	}

	/* Function Name: verifyHomeIcon()
	 * Purpose: Verify the page loading time
	 */
	public boolean verifyHomeIcon() {
		moveElementFocus(headerLogo);
		return clickAndcheckLoading(headerLogo,getLabel("webUrl"));
	}

	/* Function Name: verifyHomePoster1()
	 * Purpose: Verify the page loading time
	 */
	public boolean verifyHomePoster1(){
		moveElementFocus(postedOption1);
		return clickAndcheckLoading(postedOption1,getLabel("platformUrl"));
	}

	/* Function Name: verifyHomePoster2()
	 * Purpose: Verify the page loading time
	 */
	public boolean verifyHomePoster2(){
		moveElementFocus(postedOption2);
		return clickAndcheckLoading(postedOption2,getLabel("opmUrl"));
	}

	/* Function Name: verifyHomePoster3()
	 * Purpose: Verify the page loading time
	 */
	public boolean verifyHomePoster3(){
		moveElementFocus(postedOption3);
		return clickAndcheckLoading(postedOption3,getLabel("futureworkUrl"));
	}

	/* Function Name: verfiyKnowMoreBtn()
	 * Purpose: Verify Button is clickable
	 */
	public boolean verfiyKnowMoreBtn() {
		moveElementFocus(btnPhysicalClassroomsKnowMore);
		flag = isClickable(btnPhysicalClassroomsKnowMore) && flag;
		moveElementFocus(btnDigitalTransformationKnowMore);
		flag = isClickable(btnDigitalTransformationKnowMore) && flag;
		moveElementFocus(btnPrepareYourStudentsKnowMore);
		flag =	isClickable(btnPrepareYourStudentsKnowMore) && flag;
		return flag;
	}

	/* Function Name: verfiyTryPlatForm()
	 * Purpose: Verify the page loading time
	 */
	public boolean verfiyTryPlatForm() {
		moveElementFocus(headerPlatform);
		return clickAndcheckLoading(headerTryPlatform,getLabel("signupUrl"));
	}

	/* Function Name: verifyiOSapp()
	 * Purpose: Verify the page loading time
	 */
	public boolean verifyiOSapp(){
		click(headerPlatform);
		moveElementFocus(appStore);
		return clickAndcheckLoadingOtherTab(appStore,getLabel("appStoreUrl"));
	}

	/* Function Name: verifyAndroidapp()
	 * Purpose: Verify the page loading time
	 */
	public boolean verifyAndroidapp(){
		moveElementFocus(playStore);
		return clickAndcheckLoadingOtherTab(playStore,getLabel("playStoreUrl"));
	}

	/* Function Name: verfiyTryAndContactBtn()
	 * Purpose: Verify Button is clickable
	 */
	public boolean verfiyTryAndContactBtn() {
		flag=true;
		moveElementFocusandClick(headerOPM);
		moveElementFocus(btnPhysicalClassroomsKnowMore);
		flag = isClickable(btnPhysicalClassroomsKnowMore) && flag;
		moveElementFocus(btnDigitalTransformationKnowMore);
		flag = isClickable(btnDigitalTransformationKnowMore) && flag;
		return flag;
	}

	/* Function Name: verifySignUpBtn()
	 * Purpose: Verify the page loading time
	 */
	public boolean verifySignUpBtn(){
		moveElementFocusandClick(headerFutureWork);
		return clickAndcheckLoadingOtherTab(btnPhysicalClassroomsKnowMore,getLabel("registerUrl"));
	}

	/* Function Name: verifyTalkToUs()
	 * Purpose: Verify the page loading time
	 */
	public boolean verifyTalkToUs(){
		moveElementFocusandClick(headerPhilosophy);
		moveElementFocus(txtTalkToUs);
		return clickAndcheckLoading(txtTalkToUs,getLabel("contactUrl"));
	}

	/* Function Name: verifyFooterFractalWeb()
	 * Purpose: Verify the page loading time
	 */
	public boolean verifyFooterFractalWeb(){
		moveElementFocus(footerOriginFractal);
		return clickAndcheckLoadingOtherTab(footerOriginFractal,getLabel("fractalUrl"));
	}

	/* Function Name: verifyFooterOriginWeb()
	 * Purpose: Verify the page loading time
	 */
	public boolean verifyFooterOriginWeb(){
		moveElementFocus(footerOriginLearning);
		return clickAndcheckLoadingOtherTab(footerOriginLearning,getLabel("originlearningUrl"));
	}

}