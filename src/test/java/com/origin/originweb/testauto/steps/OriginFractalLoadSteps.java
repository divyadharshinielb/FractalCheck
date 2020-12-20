package com.origin.originweb.testauto.steps;

import org.openqa.selenium.WebDriver;

import com.origin.originweb.testauto.OriginFractalWebSteps;
import com.origin.originweb.testauto.pages.OriginFractalLoadPage;
/* File Name: OriginFractalLoadSteps.java
 * Purpose: https://originFractal.com/ - Verifying page loading test -Step level codes
 * Created by: Vigneshwaran R
 * Created on: 10-Nov-2020
 */
public class OriginFractalLoadSteps extends OriginFractalWebSteps{
	OriginFractalLoadPage loadPage = null;

	public OriginFractalLoadSteps(WebDriver driver) {
		loadPage = new OriginFractalLoadPage(driver);

	}

	public void goToURL() {
		result="FAILED";
		try{
			loadPage.goToURL(); 
			result="PASSED";
		}catch (Exception e) {
			print("URL navigation is problem");
		}
	}
	public void ClickHome() {
		result="FAILED";
		try{
			loadPage.ClickHome();  
			result="PASSED";
		}catch (Exception e) {
			result="FAILED";
		}
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
			ClickHome(); 
		}
	}

	/* Function Name: verifyHeaderFeature()
	 * Purpose: Verify the page loading time
	 */
	public void verifyHeaderFeature() {
		result="FAILED";
		try{
			if(loadPage.verifyHeaderFeature()==true) {
				result="PASSED";
			}
		}catch (Exception e) {
			result="FAILED";
			ClickHome(); 
		}
	}

	/* Function Name: verifyHeaderPricing()
	 * Purpose: Verify the page loading time
	 */
	public void verifyHeaderPricing() {
		result="FAILED";
		try{
			if(loadPage.verifyHeaderPricing()==true) {
				result="PASSED";
			}
		}catch (Exception e) {
			result="FAILED";
			ClickHome(); 
		}
	}

	/* Function Name: verifyHeaderTrail()
	 * Purpose: Verify the page loading time
	 */
	public void verifyHeaderTrail() {
		result="FAILED";
		try{
			if(loadPage.verifyHeaderTrail()==true) {
				result="PASSED";
			}
		}catch (Exception e) {
			result="FAILED";
			ClickHome(); 
		}
	}

	/* Function Name: verifyHeaderBlog()
	 * Purpose: Verify the page loading time
	 */
	public void verifyHeaderBlog() {
		result="FAILED";
		try{
			if(loadPage.verifyHeaderBlog()==true) {
				result="PASSED";
			}
		}catch (Exception e) {
			result="FAILED";
			ClickHome(); 
		}
	}

	/* Function Name: verfiySearchFunction()
	 * Purpose: Search and Verify the page loading time
	 */
	public void verfiySearchFunction() {
		result="FAILED";
		try{
			if(loadPage.verfiySearchFunction()==true) {
				result="PASSED";
			}
		}catch (Exception e) {
			result="FAILED";
			ClickHome(); 
		}
	}

	/* Function Name: verifyHeaderCareer()
	 * Purpose: Verify the page loading time
	 */
	public void verifyHeaderPhilosophy() {
		result="FAILED";
		try{
			if(loadPage.verifyHeaderPhilosophy()==true) {
				result="PASSED";
			}
		}catch (Exception e) {
			result="FAILED";
			ClickHome(); 
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
			ClickHome(); 
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
			ClickHome(); 
		}
	}

	/* Function Name: verifyPostBlog1()
	 * Purpose: Verify the page loading time
	 */
	public void verifyPostBlog1() {
		result="FAILED";
		try{
			if(loadPage.verifyPostBlog1()==true) {
				result="PASSED";
				//ClickHome(); //Updated on 3-Dec-20
			}
			ClickHome(); //Updated on 3-Dec-20
		}catch (Exception e) {
			result="FAILED";
			ClickHome(); 
		}
	}

	/* Function Name: verifyPostBlog2()
	 * Purpose: Verify the page loading time
	 */
	public void verifyPostBlog2() {
		result="FAILED";
		try{
			if(loadPage.verifyPostBlog2()==true) {
				result="PASSED";
				//ClickHome(); //Updated on 3-Dec-20
			}
			ClickHome(); //Updated on 3-Dec-20
		}catch (Exception e) {
			result="FAILED";
			ClickHome(); 
		}
	}

	/* Function Name: verifyPostBlog3()
	 * Purpose: Verify the page loading time
	 */
	public void verifyPostBlog3() {
		result="FAILED";
		try{
			if(loadPage.verifyPostBlog3()==true) {
				result="PASSED";
				//ClickHome(); //Updated on 3-Dec-20
			}
			ClickHome(); //Updated on 3-Dec-20
		}catch (Exception e) {
			result="FAILED";
			ClickHome(); 
		}
	}

	/* Function Name: verifylblHome()
	 * Purpose: Verify the page loading time
	 */
	public void verifylblHome() {
		result="FAILED";
		try{
			if(loadPage.verifylblHome()==true) {
				result="PASSED";
			}
		}catch (Exception e) {
			result="FAILED";
			ClickHome(); 
		}
	}

	/* Function Name: verifylblLxpLearners()
	 * Purpose: Verify the page loading time
	 */
	public void verifylblLxpLearners() {
		result="FAILED";
		try{
			if(loadPage.verifylblLxpLearners()==true) {
				result="PASSED";
			}
		}catch (Exception e) {
			result="FAILED";
			ClickHome(); 
		}
	}

	/* Function Name: verifylblLxpEnterprises()
	 * Purpose: Verify the page loading time
	 */
	public void verifylblLxpEnterprises() {
		result="FAILED";
		try{
			if(loadPage.verifylblLxpEnterprises()==true) {
				result="PASSED";
			}
		}catch (Exception e) {
			result="FAILED";
			ClickHome(); 
		}
	}

	/* Function Name: verifylblLxpDomain()
	 * Purpose: Verify the page loading time
	 */
	public void verifylblLxpDomain() {
		result="FAILED";
		try{
			if(loadPage.verifylblLxpDomain()==true) {
				result="PASSED";
			}
		}catch (Exception e) {
			result="FAILED";
			ClickHome(); 
		}
	}

	/* Function Name: verifyAndroidPlayStore()
	 * Purpose: Verify the page loading time
	 */
	public void verifyAndroidPlayStore() {
		result="FAILED";
		try{
			if(loadPage.verifyAndroidPlayStore()==true) {
				result="PASSED";
			}
		}catch (Exception e) {
			result="FAILED";
			ClickHome(); 
		}
	}

	/* Function Name: verifyiOSAppStore()
	 * Purpose: Verify the page loading time
	 */
	public void verifyiOSAppStore() {
		result="FAILED";
		try{
			if(loadPage.verifyiOSAppStore()==true) {
				result="PASSED";
			}
		}catch (Exception e) {
			result="FAILED";
			ClickHome(); 
		}
	}


}