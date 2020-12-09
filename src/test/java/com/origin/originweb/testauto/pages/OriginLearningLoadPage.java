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
	private By cookiesBtn=By.xpath("(//*[@class='cc-window cc-banner cc-type-info cc-theme-block cc-top cc-color-override-358643213 ']//a)[2]");
	private By topBanner=By.xpath("(//*[@class='tp-bgimg defaultimg'])[1]");
	private By banner = By.xpath("(//*[@class='column one column_column'])[1]");
	private By hederLogo=By.xpath("//header/div[@id='Top_bar']/div[1]/div[1]//*[@id='logo']");
	// Heading 
	private By headerCont	= By.xpath("((//*[@class='menu-item menu-item-type-post_type menu-item-object-page menu-item-has-children submenu'])//*[contains(@href,'content')])[1]");
	private By headerTech	= By.xpath("((//*[@class='menu-item menu-item-type-post_type menu-item-object-page menu-item-has-children submenu'])//*[contains(@href,'technology')])[1]");
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
		goTo(getLabel("webUrl"));
		if(elementExist(cookiesBtn)) {
			click(cookiesBtn);
		}
		wait(2);
	}
	/*Function Name: gotoHome()
	 * purpose: Click on home icon
	 */
	public void ClickHome() {
		click(hederLogo);
		wait(2);
	}

	/* Function Name: verifyHomeLogo()
	 * Purpose: Verify the page loading time
	 */
	public boolean verifyHomeLogo() {
		return clickAndcheckLoading(hederLogo,topBanner);
	}


	/* Function Name: verifyHeaderContent()
	 * Purpose: Verify the page loading time
	 */
	public boolean verifyHeaderContent() {
		return clickAndcheckLoading(headerCont,topBanner);
	}

	/* Function Name: verifyHeaderTechnology()
	 * Purpose: Verify the page loading time
	 */
	public boolean verifyHeaderTechnology() {
		return clickAndcheckLoading(headerTech,topBanner);
	}

	/* Function Name: verifyHeaderConsulting()
	 * Purpose: Verify the page loading time
	 */
	public boolean verifyHeaderConsulting() {
		return clickAndcheckLoading(headerConsult,topBanner);
	}

	/* Function Name: verifyHeaderResources()
	 * Purpose: Verify the page loading time
	 */
	public boolean verifyHeaderResources() {
		return clickAndcheckLoading(headerResource,topBanner);
	}

	/* Function Name: verifyHeaderAbout()
	 * Purpose: Verify the page loading time
	 */
	public boolean verifyHeaderAbout(){
		return clickAndcheckLoading(headerAbout,topBanner);
	}

	/* Function Name: verifyHeaderCareer()
	 * Purpose: Verify the page loading time
	 */
	public boolean verifyHeaderCareer(){
		return clickAnd40SecLoading(headerCareer,topBanner);
	}

	/* Function Name: verifyHeaderContact()
	 * Purpose: Verify the page loading time
	 */
	public boolean verifyHeaderContact(){
		return clickAndcheckLoading(headerContact,topBanner);
	}

	/* Function Name: verifyContentSubMenu()
	 * Purpose: Verify the page loading time
	 */
	public boolean verifyContentSubMenu() {
		moveElementFocus(headerCont);
		return clickAndcheckLoading(contentSubMenu,banner);
	}

	/* Function Name: verifyTechnologySubMenu()
	 * Purpose: Verify the page loading time
	 */
	public boolean verifyTechnologySubMenu() {

		moveElementFocus(headerTech);
		return clickAndcheckLoading(techSubMenu,banner);
	}
	/* Function Name: verifyConsultingSubMenu()
	 * Purpose: Verify the page loading time
	 */
	public boolean verifyConsultingSubMenu() {
		moveElementFocus(headerConsult);
		return clickAndcheckLoading(consultSubMenu,banner);
	}
	/* Function Name: verifyResourceSubMenu()
	 * Purpose: Verify the page loading time
	 */
	public boolean verifyResourceSubMenu() {
		moveElementFocus(headerResource);
		return clickAndcheckLoadingOtherTab(resourceSubMenu,cookiesBtn);
	}

	/* Function Name: verifyAboutSubMenu()
	 * Purpose: Verify the page loading time
	 */
	public boolean verifyAboutSubMenu1() {
		moveElementFocus(headerAbout);
		return clickAndcheckLoading(AboutUsFirstSubMenu,By.xpath("(//h4)[1]"));
	}

	/* Function Name: verifyAboutSubMenu()
	 * Purpose: Verify the page loading time
	 */
	public boolean verifyAboutSubMenu2() {
		moveElementFocus(headerAbout);
		return clickAndcheckLoading(AboutUsSecSubMenu,By.xpath("(//h3)[1]"));
	}
	/* Function Name: verifySearchFunction()
	 * Purpose: Verify the Search loading time
	 */
	public boolean verifySearchFunction() {
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
//		moveElementFocus(resourcesCTALink);
		return clickAndcheckLoading(resourcesCTALink,userName);
	}

}