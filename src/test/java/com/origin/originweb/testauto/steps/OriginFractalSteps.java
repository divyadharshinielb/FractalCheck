package com.origin.originweb.testauto.steps;

import org.openqa.selenium.WebDriver;

import com.origin.originweb.testauto.OriginFractalWebSteps;
import com.origin.originweb.testauto.pages.OriginFractalPage;
/* File Name: OriginFractalLoadSteps.java
 * Purpose: https://originFractal.in/ - Verifying page loading test -Step level codes
 * Created by: Vigneshwaran R
 * Created on: 9-Dec-2020
 */
public class OriginFractalSteps extends OriginFractalWebSteps{
	OriginFractalPage loadPage = null;

	public OriginFractalSteps(WebDriver driver) {
		loadPage = new OriginFractalPage(driver);

	}

	/* Function Name: verifyHeaderPlatform()
	 * Purpose: Verify the page loading time
	 */
	public void verifyHeaderPlatform() {
		result="FAILED";
		try{
			if(loadPage.verifyHeaderPlatform()==true) {
				result="PASSED";
			}
		}catch (Exception e) {
			result="FAILED";
			loadPage.ClickHome();
		}
	}

	/* Function Name: verifyHeaderOPM()
	 * Purpose: Verify the page loading time
	 */
	public void verifyHeaderOPM() {
		result="FAILED";
		try{
			if(loadPage.verifyHeaderOPM()==true) {
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
	public void verifyHeaderPhilosophy() {
		result="FAILED";
		try{
			if(loadPage.verifyHeaderPhilosophy()==true) {
				result="PASSED";
			}
		}catch (Exception e) {
			result="FAILED";
			loadPage.ClickHome();
		}
	}


	/* Function Name: verifyFutureWork()
	 * Purpose: Verify the page loading time
	 */
	public void verifyFutureWork() {
		result="FAILED";
		try{
			if(loadPage.verifyFutureWork()==true) {
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

	/* Function Name: verifyHeaderTryPlatform()
	 * Purpose: Verify the page loading time
	 */
	public void verifyHeaderTryPlatform() {
		result="FAILED";
		try{
			if(loadPage.verifyHeaderTryPlatform()==true) {
				result="PASSED";
			}
		}catch (Exception e) {
			result="FAILED";
			loadPage.ClickHome();
		}
	}

	/* Function Name: verifyHeaderFutureWorkSignUp()
	 * Purpose: Verify the page loading time
	 */
	public void verifyHeaderFutureWorkSignUp() {
		result="FAILED";
		try{
			if(loadPage.verifyHeaderFutureWorkSignUp()==true) {
				result="PASSED";
			}
		}catch (Exception e) {
			result="FAILED";
			loadPage.ClickHome();
		}
	}

	/* Function Name: verifyHomeIcon()
	 * Purpose: Verify the page loading time
	 */
	public void verifyHomeIcon() {
		result="FAILED";
		try{
			if(loadPage.verifyHomeIcon()==true) {
				result="PASSED";
			}
		}catch (Exception e) {
			result="FAILED";
			loadPage.ClickHome();
		}
	}

	/* Function Name: verifyHomePoster1()
	 * Purpose: Verify the page loading time
	 */
	public void verifyHomePoster1() {
		result="FAILED";
		try{
			if(loadPage.verifyHomePoster1()==true) {
				result="PASSED";
				loadPage.ClickHome();
			}
		}catch (Exception e) {
			result="FAILED";
			loadPage.ClickHome();
		}
	}


	/* Function Name: verifyHomePoster2()
	 * Purpose: Verify the page loading time
	 */
	public void verifyHomePoster2() {
		result="FAILED";
		try{
			if(loadPage.verifyHomePoster2()==true) {
				result="PASSED";
				loadPage.ClickHome();
			}
		}catch (Exception e) {
			result="FAILED";
			loadPage.ClickHome();
		}
	}

	/* Function Name: verifyHomePoster3()
	 * Purpose: Verify the page loading time
	 */
	public void verifyHomePoster3() {
		result="FAILED";
		try{
			if(loadPage.verifyHomePoster3()==true) {
				result="PASSED";
				loadPage.ClickHome();
			}
		}catch (Exception e) {
			result="FAILED";
			loadPage.ClickHome();
		}
	}

	/* Function Name: verfiyKnowMoreBtn()
	 * Purpose: Verify Button is clickable
	 */
	public void verfiyKnowMoreBtn() {
		result="FAILED";
		try{
			if(loadPage.verfiyKnowMoreBtn()==true) {
				result="PASSED";
			}
		}catch (Exception e) {
			result="FAILED";
			loadPage.ClickHome();
		}
	}

	/* Function Name: verfiyTryPlatForm()
	 * Purpose: Verify the page loading time
	 */
	public void verfiyTryPlatForm() {
		result="FAILED";
		try{
			if(loadPage.verfiyTryPlatForm()==true) {
				result="PASSED";
			}
		}catch (Exception e) {
			result="FAILED";
			loadPage.ClickHome();
		}
	}

	/* Function Name: verifyiOSapp()
	 * Purpose: Verify the page loading time
	 */
	public void verifyiOSapp() {
		result="FAILED";
		try{
			if(loadPage.verifyiOSapp()==true) {
				result="PASSED";
						}
		}catch (Exception e) {
			result="FAILED";
			loadPage.ClickHome();
		}
	}

	/* Function Name: verifyAndroidapp()
	 * Purpose: Verify the page loading time
	 */
	public void verifyAndroidapp() {
		result="FAILED";
		try{
			if(loadPage.verifyAndroidapp()==true) {
				result="PASSED";
				loadPage.ClickHome();
			}
		}catch (Exception e) {
			result="FAILED";
			loadPage.ClickHome();
		}
	}

	/* Function Name: verfiyTryAndContactBtn()
	 * Purpose: Verify Button is clickable
	 */
	public void verfiyTryAndContactBtn() {
		result="FAILED";
		try{
			if(loadPage.verfiyTryAndContactBtn()==true) {
				result="PASSED";
			}
		}catch (Exception e) {
			result="FAILED";
			loadPage.ClickHome();
		}
	}

	/* Function Name: verifySignUpBtn()
	 * Purpose: Verify the page loading time
	 */
	public void verifySignUpBtn(){
		result="FAILED";
		try{
			if(loadPage.verifySignUpBtn()==true) {
				result="PASSED";
			}
		}catch (Exception e) {
			result="FAILED";
			loadPage.ClickHome();
		}
	}

	/* Function Name: verifyTalkToUs()
	 * Purpose: Verify the page loading time
	 */
	public void verifyTalkToUs(){
		result="FAILED";
		try{
			if(loadPage.verifyTalkToUs()==true) {
				result="PASSED";
			}
		}catch (Exception e) {
			result="FAILED";
			loadPage.ClickHome();
		}
	}
	
	/* Function Name: verifyFooterFractalWeb()
	 * Purpose: Verify the page loading time
	 */
	public void verifyFooterFractalWeb(){
		result="FAILED";
		try{
			if(loadPage.verifyFooterFractalWeb()==true) {
				result="PASSED";
			}
		}catch (Exception e) {
			result="FAILED";
			loadPage.ClickHome();
		}
	}
	
	/* Function Name: verifyFooterOriginWeb()
	 * Purpose: Verify the page loading time
	 */
	public void verifyFooterOriginWeb(){
		result="FAILED";
		try{
			if(loadPage.verifyFooterOriginWeb()==true) {
				result="PASSED";
			}
		}catch (Exception e) {
			result="FAILED";
			loadPage.ClickHome();
		}
	}

}