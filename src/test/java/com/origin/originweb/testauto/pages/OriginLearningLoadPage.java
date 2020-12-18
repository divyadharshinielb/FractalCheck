package com.origin.originweb.testauto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.origin.originweb.testauto.OriginWebBasePage;
/* File Name: OriginLearningLoadPage.java
 * Purpose: https://originlearning.com/ - Verifying page loading time
 * Created by: Vigneshwaran R
 * Created on: 13-Oct-2020
 */
public class OriginLearningLoadPage extends OriginWebBasePage {
	private By cookiesBtn=By.xpath("//*[@aria-label='dismiss cookie message'][text()='Accept & Close']");
	private By topBanner=By.xpath("(//*[@class='tp-bgimg defaultimg'])[1]");
	private By banner = By.xpath("(//*[@class='column one column_column'])[1]");
	private By hederLogo=By.xpath("//header/div[@id='Top_bar']/div[1]/div[1]//*[@id='logo']");
	// Heading 
	private By headerCont	= By.xpath("//a[@href='https://originlearning.com/content/']");
	private By headerTech	= By.xpath("//a[@href='https://originlearning.com/technology/']");
	private By headerConsult= By.xpath("((//*[@class='menu-item menu-item-type-post_type menu-item-object-page menu-item-has-children submenu'])//*[contains(@href,'consulting')])[1]");
	private By headerResource = By.xpath("//*[@id='menu-item-166']");
	private By headerAbout 	= By.xpath("//*[@id='menu-item-312']");
	private By headerCareer = By.xpath("(//*[@class='menu-item menu-item-type-post_type menu-item-object-page'])//*[contains(@href,'career')]");
	private By headerContact = By.xpath("(//*[@class='menu-item menu-item-type-post_type menu-item-object-page'])//*[contains(@href,'contact-us')]");
	//	Content SubMenu
	private By contentSubMenu = By.xpath("//*[@id='menu-item-2020']");
	//	Technology SubMenu
	private By techSubMenu	= By.xpath("//*[@id='menu-item-156']");
	//	Consulting SubMenu
	private By consultSubMenu= By.xpath("//*[@id='menu-item-165']");
	//	Resources SubMenu
	private By resourceSubMenu = By.xpath("//*[@id='menu-item-365']//a");//Updated on 9-Dec-12
	//	AboutUs SubMenus
	private By AboutUsFirstSubMenu = By.xpath("//*[@id='menu-item-1552']");
	private By AboutUsSecSubMenu = By.xpath("//*[@id='menu-item-2356']");
	//Search
	private By searchIcon = By.xpath("//*[@class='icon_search icon']");
	private By searchTextArea=By.xpath("//*[@id='searchform']//input[@type='text']");
	private String searchKey="Origin";
	private By searchResult=By.xpath("(//*[@class='post-desc-wrapper'])[1]");
	//Ask Demo 
	private By askDemoBtn=By.xpath("//*[@class='items_group clearfix']//*[contains(@href,'demo')]");
	private By userName=By.xpath("//*[@name='your-name']");
	//Client
	private By viewBtn=By.xpath("(//*[@class='items_group clearfix'])[4]//a");
	private By whatsNewCTALink = By.xpath("(//*[@class='photo_mask'])[1]");
	private By resourcesCTALink = By.xpath("(//*[@class='photo photo_mask '])[1]");
	public OriginLearningLoadPage(WebDriver driver) {
		super(driver);
		pageName="originLearning";
	}	
	/* Function Name: goToURL()
	 * Purpose: Navigate the URL and close the cookies
	 */
	public void goToURL() {
	try {	goTo(getLabel("webUrl"));
		wait(10);
		if(elementExist(cookiesBtn)) {
			click(cookiesBtn);
		}
//		driver.manage().deleteAllCookies()
		wait(5);
	}catch(Exception e) {
		print("goToURL is problem");
	}
	}
	/*Function Name: gotoHome()
	 * purpose: Click on home icon
	 */
	public void ClickHome() {
	wait(3);
		click(hederLogo);
		wait(3);
	}

	/* Function Name: verifyHomeLogo()
	 * Purpose: Verify the page loading time
	 */
	public boolean verifyHomeLogo() {
		wait(3);//Added on 18-Dec-20
		return clickAndcheckLoading(hederLogo,topBanner);
	}


	/* Function Name: verifyHeaderContent()
	 * Purpose: Verify the page loading time
	 */
	public boolean verifyHeaderContent() {
		wait(3);//Added on 18-Dec-20
		return clickAndcheckLoading(headerCont,topBanner);
	}

	/* Function Name: verifyHeaderTechnology()
	 * Purpose: Verify the page loading time
	 */
	public boolean verifyHeaderTechnology() {
		wait(3);//Added on 18-Dec-20
		return clickAndcheckLoading(headerTech,topBanner);
	}

	/* Function Name: verifyHeaderConsulting()
	 * Purpose: Verify the page loading time
	 */
	public boolean verifyHeaderConsulting() {
		wait(3);//Added on 18-Dec-20
		return clickAndcheckLoading(headerConsult,topBanner);
	}

	/* Function Name: verifyHeaderResources()
	 * Purpose: Verify the page loading time
	 */
	public boolean verifyHeaderResources() {
		wait(3);//Added on 18-Dec-20
		return clickAndcheckLoading(headerResource,topBanner);
	}

	/* Function Name: verifyHeaderAbout()
	 * Purpose: Verify the page loading time
	 */
	public boolean verifyHeaderAbout(){
		wait(3);//Added on 18-Dec-20
		return clickAndcheckLoading(headerAbout,topBanner);
	}

	/* Function Name: verifyHeaderCareer()
	 * Purpose: Verify the page loading time
	 */
	public boolean verifyHeaderCareer(){
		wait(3);//Added on 18-Dec-20
		return clickAnd40SecLoading(headerCareer,topBanner);
	}

	/* Function Name: verifyHeaderContact()
	 * Purpose: Verify the page loading time
	 */
	public boolean verifyHeaderContact(){
		wait(3);//Added on 18-Dec-20
		return clickAndcheckLoading(headerContact,topBanner);
	}

	/* Function Name: verifyContentSubMenu()
	 * Purpose: Verify the page loading time
	 */
	public boolean verifyContentSubMenu() {
		wait(3);//Added on 18-Dec-20
		moveElementFocus(headerCont);
		return clickAndcheckLoading(contentSubMenu,banner);
	}

	/* Function Name: verifyTechnologySubMenu()
	 * Purpose: Verify the page loading time
	 */
	public boolean verifyTechnologySubMenu() {
		wait(3);//Added on 18-Dec-20
		moveElementFocus(headerTech);
		return clickAndcheckLoading(techSubMenu,banner);
	}
	/* Function Name: verifyConsultingSubMenu()
	 * Purpose: Verify the page loading time
	 */
	public boolean verifyConsultingSubMenu() {
		wait(3);//Added on 18-Dec-20
		moveElementFocus(headerConsult);
		return clickAndcheckLoading(consultSubMenu,banner);
	}
	/* Function Name: verifyResourceSubMenu()
	 * Purpose: Verify the page loading time
	 */
	public boolean verifyResourceSubMenu() {
		wait(3);//Added on 18-Dec-20
		moveElementFocus(headerResource);
		return clickAndcheckLoadingOtherTab(resourceSubMenu,cookiesBtn);
	}

	/* Function Name: verifyAboutSubMenu()
	 * Purpose: Verify the page loading time
	 */
	public boolean verifyAboutSubMenu1() {
		wait(3);//Added on 18-Dec-20
		moveElementFocus(headerAbout);
		return clickAndcheckLoading(AboutUsFirstSubMenu,By.xpath("(//h4)[1]"));
	}

	/* Function Name: verifyAboutSubMenu()
	 * Purpose: Verify the page loading time
	 */
	public boolean verifyAboutSubMenu2() {
		wait(3);//Added on 18-Dec-20
		moveElementFocus(headerAbout);
		return clickAndcheckLoading(AboutUsSecSubMenu,By.xpath("(//h3)[1]"));
	}
	/* Function Name: verifySearchFunction()
	 * Purpose: Verify the Search loading time
	 */
	public boolean verifySearchFunction() {
		wait(3);//Added on 18-Dec-20
		return searchKeyWordAndcheckLoading(searchIcon,searchKey,searchTextArea,searchResult);
	}

	/* Function Name: verifyAskDemo()
	 * Purpose: Verify the page loading time
	 */
	public boolean verifyAskDemo(){
		ClickHome();
		return clickAndcheckLoading(askDemoBtn,userName);
	}

	/* Function Name: verifyOurClintViewBtn()
	 * Purpose: Verify the page loading time
	 */
	public boolean verifyOurClintViewBtn() {
		ClickHome();
		return clickAndcheckLoading(viewBtn,By.xpath("(//h3)[1]"));
	}

	/* Function Name: verifyWhatsNewCTALink()
	 * Purpose: Verify the page loading time
	 */
	public boolean verifyWhatsNewCTALink() {
		ClickHome();
		return clickAndcheckLoadingOtherTab(whatsNewCTALink,cookiesBtn);
	}
	
	/* Function Name: verifyrRsourcesCTALink()
	 * Purpose: Verify the page loading time
	 */
	public boolean verifyrRsourcesCTALink() {
		wait(3);//Added on 18-Dec-20
		moveElementFocus(resourcesCTALink);
		return clickAndcheckLoading(resourcesCTALink,userName);
	}

}