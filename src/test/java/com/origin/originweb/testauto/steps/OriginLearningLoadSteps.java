package com.origin.originweb.testauto.steps;

import org.openqa.selenium.WebDriver;

import com.origin.originweb.testauto.OriginWebSteps;
import com.origin.originweb.testauto.pages.OriginLearningLoadPage;
/* File Name: OriginLearningLoadSteps.java
 * Purpose: https://originlearning.com/ - Verifying page loading test -Step level codes
 * Created by: Vigneshwaran R
 * Created on: 13-Oct-2020
 */
public class OriginLearningLoadSteps extends OriginWebSteps{
	OriginLearningLoadPage loadPage = null;

	public OriginLearningLoadSteps(WebDriver driver) {
		loadPage = new OriginLearningLoadPage(driver);

	}

	/* Function Name: verifyHomeLogo()
	 * Purpose: Verify the page loading time
	 */
	public void verifyHomeLogo() {
		result="FAILED";
		try{
			if(loadPage.verifyHomeLogo()==true) {
				result="PASSED";
			}
		}catch (Exception e) {
			result="FAILED";
			loadPage.ClickHome();
		}
	}

	/* Function Name: verifyHeaderContent()
	 * Purpose: Verify the page loading time
	 */
	public void verifyHeaderContent() {
		result="FAILED";
		try{
			if(loadPage.verifyHeaderContent()==true) {
				result="PASSED";
			}
		}catch (Exception e) {
			result="FAILED";
			loadPage.ClickHome();
		}
	}

	/* Function Name: verifyHeaderTechnology()
	 * Purpose: Verify the page loading time
	 */
	public void verifyHeaderTechnology() {
		result="FAILED";
		try{
			if(loadPage.verifyHeaderTechnology()==true) {
				result="PASSED";
			}
		}catch (Exception e) {
			result="FAILED";
			loadPage.ClickHome();
		}
	}

	/* Function Name: verifyHeaderConsulting()
	 * Purpose: Verify the page loading time
	 */
	public void verifyHeaderConsulting() {
		result="FAILED";
		try{
			if(loadPage.verifyHeaderConsulting()==true) {
				result="PASSED";
			}
		}catch (Exception e) {
			result="FAILED";
			loadPage.ClickHome();
		}
	}

	/* Function Name: verifyHeaderResources()
	 * Purpose: Verify the page loading time
	 */
	public void verifyHeaderResources() {
		result="FAILED";
		try{
			if(loadPage.verifyHeaderResources()==true) {
				result="PASSED";
			}
		}catch (Exception e) {
			result="FAILED";
			loadPage.ClickHome();
		}
	}

	/* Function Name: verifyHeaderAbout()
	 * Purpose: Verify the page loading time
	 */
	public void verifyHeaderAbout() {
		result="FAILED";
		try{
			if(loadPage.verifyHeaderAbout()==true) {
				result="PASSED";
			}
		}catch (Exception e) {
			result="FAILED";
			loadPage.ClickHome();
		}
	}

	/* Function Name: verifyHeaderCareer()
	 * Purpose: Verify the page loading time
	 */
	public void verifyHeaderCareer() {
		result="FAILED";
		try{
			if(loadPage.verifyHeaderCareer()==true) {
				result="PASSED";
			}
		}catch (Exception e) {
			result="FAILED";
			loadPage.ClickHome();
		}
	}

	/* Function Name: verifyHeaderContact()
	 * Purpose: Verify the page loading time
	 */
	public void verifyHeaderContact() {
		result="FAILED";
		try{
			if(loadPage.verifyHeaderContact()==true) {
				result="PASSED";
			}
		}catch (Exception e) {
			result="FAILED";
			loadPage.ClickHome();
		}
	}

	/* Function Name: verifyContentSubMenu()
	 * Purpose: Verify the page loading time
	 */
	public void verifyContentSubMenu() {
		result="FAILED";
		try{
			if(loadPage.verifyContentSubMenu()==true) {
				result="PASSED";
			}
		}catch (Exception e) {
			result="FAILED";
			loadPage.ClickHome();
		}
	}

	/* Function Name: verifyTechnologySubMenu()
	 * Purpose: Verify the page loading time
	 */
	public void verifyTechnologySubMenu() {
		result="FAILED";
		try{
			if(loadPage.verifyTechnologySubMenu()==true) {
				result="PASSED";
			}
		}catch (Exception e) {
			result="FAILED";
			loadPage.ClickHome();
		}
	}

	/* Function Name: verifyConsultingSubMenu()
	 * Purpose: Verify the page loading time
	 */
	public void verifyConsultingSubMenu() {
		result="FAILED";
		try{
			if(loadPage.verifyConsultingSubMenu()==true) {
				result="PASSED";
			}
		}catch (Exception e) {
			result="FAILED";
			loadPage.ClickHome();
		}
	}

	/* Function Name: verifyResourceSubMenu()
	 * Purpose: Verify the page loading time
	 */
	public void verifyResourceSubMenu() {
		result="FAILED";
		try{
			if(loadPage.verifyResourceSubMenu()==true) {
				result="PASSED";
			}
		}catch (Exception e) {
			result="FAILED";
			loadPage.ClickHome();
		}
	}

	/* Function Name: verifyAboutSubMenu()
	 * Purpose: Verify the page loading time
	 */
	public void verifyAboutSubMenu() {
		result="FAILED";
		try{
			if(loadPage.verifyAboutSubMenu1()==true && loadPage.verifyAboutSubMenu2()==true) {
				result="PASSED";
			}
		}catch (Exception e) {
			result="FAILED";
			loadPage.ClickHome();
		}
	}

	/* Function Name: verifySearchFunction()
	 * Purpose: Verify the Search loading time
	 */
	public void verifySearchFunction() {
		result="FAILED";
		try{
			if(loadPage.verifySearchFunction()==true) {
				result="PASSED";
			}
		}catch (Exception e) {
			result="FAILED";
			loadPage.ClickHome();
		}
	}

	/* Function Name: verifyAskDemo()
	 * Purpose: Verify the page loading time
	 */
	public void verifyAskDemo() {
		result="FAILED";
		try{
			if(loadPage.verifyAskDemo()==true) {
				result="PASSED";
			}
		}catch (Exception e) {
			result="FAILED";
			loadPage.ClickHome();
		}
	}

	/* Function Name: verifyOurClintViewBtn()
	 * Purpose: Verify the page loading time
	 */
	public void verifyOurClintViewBtn() {
		result="FAILED";
		try{
			if(loadPage.verifyOurClintViewBtn()==true) {
				result="PASSED";
			}
		}catch (Exception e) {
			result="FAILED";
			loadPage.ClickHome();
		}
	}

	/* Function Name: verifyWhatsNewCTALink()
	 * Purpose: Verify the page loading time
	 */
	public void verifyWhatsNewCTALink() {
		result="FAILED";
		try{
			if(loadPage.verifyWhatsNewCTALink()==true) {
				result="PASSED";
			}
		}catch (Exception e) {
			result="FAILED";
			loadPage.ClickHome();
		}
	}

	/* Function Name: verifyrRsourcesCTALink()
	 * Purpose: Verify the page loading time
	 */
	public void verifyrRsourcesCTALink() {
		result="FAILED";
		try{
			if(loadPage.verifyrRsourcesCTALink()==true) {
				result="PASSED";
			}
		}catch (Exception e) {
			result="FAILED";
			loadPage.ClickHome();
		}
	}
}