package com.origin.originweb.testauto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.origin.originweb.testauto.OriginFractalWebBasePage;
import com.wv.auto.framework.utils.TimeManager;
/* File Name: OriginFractalLoadPage.java
 * Purpose: https://originfractal.com/ - Verifying page loading time
 * Created by: Vigneshwaran R
 * Created on: 10-Nov-2020
 */
public class OriginFractalLoadPage extends OriginFractalWebBasePage {
	private By cookiesBtn=By.xpath("//a[text()='Accept']");//Updated on 26-Nov-20
	private By btnUnderstand=By.xpath("//button[text()='I Understand']"); //Added on 26-Nov-20
	private By headerLogo=By.xpath("//*[@class='logo']");
	private By newsSlider=By.xpath("//*[@id='normal-slidedown']");//Added on 26-Nov-20
	private By btnCancelnewsSlider=By.xpath("//*[@id='normal-slidedown']//button[text()='Cancel']");//Added on 26-Nov-20
	// Heading 
	private By headerFeature	= By.xpath("(//UL[@class='navigation clearfix']//a)[1]");
	private By headerPricing	= By.xpath("(//UL[@class='navigation clearfix']//a)[2]");
	private By headerTrailSign	= By.xpath("(//UL[@class='navigation clearfix']//a)[3]");
	private By headerBlog		= By.xpath("(//UL[@class='navigation clearfix']//a)[4]");
	private By headerPhilosophy	= By.xpath("(//UL[@class='navigation clearfix']//a)[5]");
	private By headerAboutUs	= By.xpath("(//UL[@class='navigation clearfix']//a)[6]");
	private By headerContact	= By.xpath("(//UL[@class='navigation clearfix']//a)[7]");
	//Home page
	private By postedBlog1		= By.xpath("(//*[@class='entry-thumb-wrapper'])[1]");
	private By postedBlog2		= By.xpath("(//*[@class='entry-thumb-wrapper'])[2]");
	private By postedBlog3 		= By.xpath("(//*[@class='entry-thumb-wrapper'])[3]");
	private By banner 			= By.xpath("//*[@class='page-title page-titlex']");
	//Blog page
	private By search 			= By.xpath("//*[@placeholder='Search Here..']");//Added on 14-Dec-12
	//Footer
	private By lblHome			= By.xpath("(//*[@class='widgets_wrapper']//a)[1]");
	private By lblLXPLearner	= By.xpath("(//*[@class='widgets_wrapper']//a)[7]");
	private By lblLXPEnterPrises= By.xpath("(//*[@class='widgets_wrapper']//a)[8]");
	private By lblLXPDomainExp  = By.xpath("(//*[@class='widgets_wrapper']//a)[9]");
	private By txtLearner		= By.xpath("//h2//strong[text()='Learner']");
	private By txtEnterPrise	= By.xpath("//h2//strong[text()='Enterprise']");
	private By txtDomain		= By.xpath("//h2//strong[text()='Domain Expert or']");
	private By linkAppAndroid	= By.xpath("(//*[@class='social-app']//a)[1]");
	private By linkAppiOS		= By.xpath("(//*[@class='social-app']//a)[2]");
	public OriginFractalLoadPage(WebDriver driver) {
		super(driver);
		pageName="originFractal";
	}	
	/* Function Name: goToURL()
	 * Purpose: Navigate the URL and close the cookies
	 */
	public void goToURL() {
		goTo(getLabel("webUrl"));
		if(elementExist(cookiesBtn)) {
			click(cookiesBtn);
			wait(2);
			click(btnUnderstand);
		}
		//Added on 26-Nov-20
		if(elementExist(newsSlider)) {
			click(btnCancelnewsSlider);
		}
		wait(2);
	}
	/*Function Name: gotoHome()
	 * purpose: Click on home icon
	 */
	public void ClickHome() {
		click(headerLogo);
		wait(2);
	}

	/* Function Name: verifyHomeLogo()
	 * Purpose: Verify the page loading time
	 */
	public boolean verifyHomeLogo() {
		return clickAndcheckLoading(headerLogo,getLabel("webUrl"));
	}

	/* Function Name: verifyHeaderFeature()
	 * Purpose: Verify the page loading time
	 */
	public boolean verifyHeaderFeature() {
		return clickAndcheckLoading(headerFeature,getLabel("fraturesUrl"));
	}

	/* Function Name: verifyHeaderPricing()
	 * Purpose: Verify the page loading time
	 */
	public boolean verifyHeaderPricing() {
		return clickAndcheckLoading(headerPricing,getLabel("pricingUrl"));
	}

	/* Function Name: verifyHeaderTrail()
	 * Purpose: Verify the page loading time
	 */
	public boolean verifyHeaderTrail() {
		return clickAndcheckLoading(headerTrailSign,getLabel("trialUrl"));
	}

	/* Function Name: verifyHeaderBlog()
	 * Purpose: Verify the page loading time
	 */
	public boolean verifyHeaderBlog(){
		return clickAndcheckLoading(headerBlog,getLabel("blogUrl"));
	}

	/* Function Name: verfiySearchFunction()
	 * Purpose: Search and Verify the page loading time
	 */
	public boolean verfiySearchFunction() {
		wait(3);//Added on 14-Dec-12
		enterData("Fractal",search);
		driver.findElement(search).sendKeys(Keys.RETURN);
		return elementExist(banner) && TimeManager.seconds<=20; //Updated on 3-Dec-20
	}

	/* Function Name: verifyHeaderPhilosophy()
	 * Purpose: Verify the page loading time
	 */
	public boolean verifyHeaderPhilosophy() {
		return clickAndcheckLoading(headerPhilosophy,getLabel("philosophyUrl"));
	}	

	/* Function Name: verifyHeaderAbout()
	 * Purpose: Verify the page loading time
	 */
	public boolean verifyHeaderAbout(){
		return clickAndcheckLoading(headerAboutUs,getLabel("aboutUsUrl"));
	}

	/* Function Name: verifyHeaderContact()
	 * Purpose: Verify the page loading time
	 */
	public boolean verifyHeaderContact(){
		return clickAndcheckLoading(headerContact,getLabel("contactUrl"));
	}

	/* Function Name: verifyPostBlog1()
	 * Purpose: Verify the page loading time
	 */
	public boolean verifyPostBlog1() {
		moveElementFocus(postedBlog1);
		return clickAndcheckLoading(postedBlog1,banner);
	}

	/* Function Name: verifyPostBlog2()
	 * Purpose: Verify the page loading time
	 */
	public boolean verifyPostBlog2() {
		moveElementFocus(postedBlog2);
		return clickAndcheckLoading(postedBlog2,banner);
	}
	/* Function Name: verifyConsultingSubManu()
	 * Purpose: Verify the page loading time
	 */
	public boolean verifyPostBlog3() {
		moveElementFocus(postedBlog3);
		return clickAndcheckLoading(postedBlog3,banner);
	}

	/* Function Name: verifylblHome()
	 * Purpose: Verify the page loading time
	 */
	public boolean verifylblHome() {
		moveElementFocus(lblHome);
		return clickAndcheckLoading(lblHome,getLabel("webUrl"));
	}

	/* Function Name: verifylblLxpLearners()
	 * Purpose: Verify the page loading time
	 */
	public boolean verifylblLxpLearners() {
		moveElementFocus(lblLXPLearner);
		return clickAndcheckLoading(lblLXPLearner,txtLearner);
	}

	/* Function Name: verifylblLxpEnterprises()
	 * Purpose: Verify the page loading time
	 */
	public boolean verifylblLxpEnterprises() {
		wait(1);
		moveElementFocus(lblLXPEnterPrises);
		return clickAndcheckLoading(lblLXPEnterPrises,txtEnterPrise);
	}

	/* Function Name: verifylblLxpDomain()
	 * Purpose: Verify the page loading time
	 */
	public boolean verifylblLxpDomain() {
		wait(1);
		moveElementFocus(lblLXPDomainExp);
		return clickAndcheckLoading(lblLXPDomainExp,txtDomain);
	}

	/* Function Name: verifyAndroidPlayStore()
	 * Purpose: Verify the page loading time
	 */
	public boolean verifyAndroidPlayStore(){
		moveElementFocus(linkAppAndroid);
		return clickAndcheckLoadingOtherTab(linkAppAndroid,getLabel("playStoreUrl"));
	}

	/* Function Name: verifyiOSAppStore()
	 * Purpose: Verify the page loading time
	 */
	public boolean verifyiOSAppStore(){
		moveElementFocus(linkAppiOS);
		return clickAndcheckLoadingOtherTab(linkAppiOS,getLabel("appStoreUrl"));
	}
}