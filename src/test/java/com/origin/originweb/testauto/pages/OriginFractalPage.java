package com.origin.originweb.testauto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.origin.originweb.testauto.OriginFractalWebBasePage;
/* File Name: OriginFractalLoadPage.java
 * Purpose: https://originfractal.in/ - Verifying page loading time
 * Created by: Vigneshwaran R
 * Created on: 9-Dec-2020
 * Updated on: 20_Dec-20
 */
public class OriginFractalPage extends OriginFractalWebBasePage {
	private By headerLogo=By.xpath("(//*[@class='container']//*[@id='logo'])[2]");//Updated on 20-Dec-20
	// Heading - Updated on 18-Dec-20
	private By headerPlatform	= By.xpath("(//header//*[text()='Platform'])[2]");
	private By headerOPM	= By.xpath("(//header//*[text()='OPM'])[2]");
	private By headerFutureWork	= By.xpath("(//header//*[text()='Future@Work'])[2]");
	private By headerPhilosophy	= By.xpath("(//header//*[text()='Philosophy'])[2]");
	private By headerContact	= By.xpath("(//header//*[text()='Contact'])[2]");
	private By headerTryPlatform	= By.xpath("(//header//*[text()='Try Platform'])[2]");
	private By headerFutureWorkSignUp	= By.xpath("(//header//*[text()='Future@Work Signup'])[2]");
	//Home page
	private By postedOption1 = By.xpath("(//*[@class='elementor-column-wrap elementor-element-populated'])[3]//a");
	private By postedOption2 = By.xpath("(//*[@class='elementor-column-wrap elementor-element-populated'])[7]//a");
	private By postedOption3 = By.xpath("(//*[@class='elementor-column-wrap elementor-element-populated'])[11]//a");
	//ends
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
		goTo("https://originfractal.in/");
		wait(20);//Added on 18-Dec-20
	}
	/*Function Name: gotoHome()
	 * purpose: Click on home icon
	 */
	public void ClickHome() {
//		driver.navigate().refresh();
		wait(5);//Added on 18-Dec-20
		moveElementFocusandClick(headerLogo);
		wait(3);
	}

	/* Function Name: verifyHeaderPlatform()
	 * Purpose: Verify the page loading time
	 */
	public boolean verifyHeaderPlatform() {
		wait(5);//Added on 18-Dec-20
		return clickAndcheckLoading(headerPlatform,getLabel("platformUrl"));
	}

	/* Function Name: verifyHeaderOPM()
	 * Purpose: Verify the page loading time
	 */
	public boolean verifyHeaderOPM() {
		wait(5);//Added on 18-Dec-20
		return clickAndcheckLoading(headerOPM,getLabel("opmUrl"));
	}

	/* Function Name: verifyFutureWork()
	 * Purpose: Verify the page loading time
	 */
	public boolean verifyFutureWork() {
		wait(5);//Added on 18-Dec-20
		return clickAndcheckLoading(headerFutureWork,getLabel("futureworkUrl"));
	}

	/* Function Name: verifyHeaderPhilosophy()
	 * Purpose: Verify the page loading time
	 */
	public boolean verifyHeaderPhilosophy() {
		wait(5);//Added on 18-Dec-20
		return clickAndcheckLoading(headerPhilosophy,getLabel("philosophyUrl"));
	}	

	/* Function Name: verifyHeaderContact()
	 * Purpose: Verify the page loading time
	 */
	public boolean verifyHeaderContact(){
		wait(5);//Added on 18-Dec-20
		return clickAndcheckLoading(headerContact,getLabel("contactUrl"));
	}

	/* Function Name: verifyHeaderTryPlatform()
	 * Purpose: Verify the page loading time
	 */
	public boolean verifyHeaderTryPlatform(){
		wait(5);//Added on 18-Dec-20
		return clickAndcheckLoading(headerTryPlatform,getLabel("signupUrl"));
	}

	/* Function Name: verifyHeaderFutureWorkSignUp()
	 * Purpose: Verify the page loading time
	 */
	public boolean verifyHeaderFutureWorkSignUp(){
		wait(5);//Added on 18-Dec-20
		moveElementFocus(headerFutureWorkSignUp);
		return clickAndcheckLoadingOtherTab(headerFutureWorkSignUp,getLabel("registerUrl"));
	}

	/* Function Name: verifyHomeIcon()
	 * Purpose: Verify the page loading time
	 */
	public boolean verifyHomeIcon() {
		wait(5);//Added on 18-Dec-20
		moveElementFocus(headerLogo);
		return clickAndcheckLoading(headerLogo,getLabel("webUrl"));
	}

	/* Function Name: verifyHomePoster1()
	 * Purpose: Verify the page loading time
	 */
	public boolean verifyHomePoster1(){
		wait(5);//Added on 18-Dec-20
		moveElementFocus(postedOption1);
		return clickAndcheckLoading(postedOption1,getLabel("platformUrl"));
	}

	/* Function Name: verifyHomePoster2()
	 * Purpose: Verify the page loading time
	 */
	public boolean verifyHomePoster2(){
		wait(5);//Added on 18-Dec-20
		moveElementFocus(postedOption2);
		return clickAndcheckLoading(postedOption2,getLabel("opmUrl"));
	}

	/* Function Name: verifyHomePoster3()
	 * Purpose: Verify the page loading time
	 */
	public boolean verifyHomePoster3(){
		wait(5);//Added on 18-Dec-20
		moveElementFocus(postedOption3);
		return clickAndcheckLoading(postedOption3,getLabel("futureworkUrl"));
	}

	/* Function Name: verfiyKnowMoreBtn()
	 * Purpose: Verify Button is clickable
	 */
	public boolean verfiyKnowMoreBtn() {
		flag=true;
		wait(5);//Added on 18-Dec-20
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
		wait(5);//Added on 18-Dec-20
		moveElementFocusandClick(headerPlatform);
		return clickAndcheckLoading(headerTryPlatform,getLabel("signupUrl"));
	}

	/* Function Name: verifyiOSapp()
	 * Purpose: Verify the page loading time
	 */
	public boolean verifyiOSapp(){
		wait(5);//Added on 18-Dec-20
		moveElementFocusandClick(headerPlatform);
		wait(5);//Added on 18-Dec-20
		moveElementFocus(appStore);
		return clickAndcheckLoadingOtherTab(appStore,getLabel("appStoreUrl"));
	}

	/* Function Name: verifyAndroidapp()
	 * Purpose: Verify the page loading time
	 */
	public boolean verifyAndroidapp(){
		wait(5);//Added on 18-Dec-20
		moveElementFocus(playStore);
		wait(5);//Added on 18-Dec-20
		return clickAndcheckLoadingOtherTab(playStore,getLabel("playStoreUrl"));
	}

	/* Function Name: verfiyTryAndContactBtn()
	 * Purpose: Verify Button is clickable
	 */
	public boolean verfiyTryAndContactBtn() {
		flag=true;
		wait(5);//Added on 18-Dec-20
		moveElementFocusandClick(headerOPM);
		wait(5);//Added on 18-Dec-20
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
		wait(5);//Added on 18-Dec-20
		moveElementFocusandClick(headerFutureWork);
		return clickAndcheckLoadingOtherTab(btnPhysicalClassroomsKnowMore,getLabel("registerUrl"));
	}

	/* Function Name: verifyTalkToUs()
	 * Purpose: Verify the page loading time
	 */
	public boolean verifyTalkToUs(){
		wait(5);//Added on 18-Dec-20
		moveElementFocusandClick(headerPhilosophy);
		moveElementFocus(txtTalkToUs);
		return clickAndcheckLoading(txtTalkToUs,getLabel("contactUrl"));
	}

	/* Function Name: verifyFooterFractalWeb()
	 * Purpose: Verify the page loading time
	 */
	public boolean verifyFooterFractalWeb(){
		wait(5);//Added on 18-Dec-20
		moveElementFocus(footerOriginFractal);
		return clickAndcheckLoadingOtherTab(footerOriginFractal,getLabel("fractalUrl"));
	}

	/* Function Name: verifyFooterOriginWeb()
	 * Purpose: Verify the page loading time
	 */
	public boolean verifyFooterOriginWeb(){
		wait(5);//Added on 18-Dec-20
		moveElementFocus(footerOriginLearning);
		return clickAndcheckLoadingOtherTab(footerOriginLearning,getLabel("originlearningUrl"));
	}

}