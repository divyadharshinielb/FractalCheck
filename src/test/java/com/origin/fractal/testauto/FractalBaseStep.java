package com.origin.fractal.testauto;

import com.wv.auto.framework.BaseStep;

public class FractalBaseStep extends BaseStep {
	protected FractalBasePage fBPage=null; 
	public String result= "Passed";
	public static int overallTestNGResult=0;
	public String getResult() {
		if(result.equalsIgnoreCase("FAILED")) {
			overallTestNGResult++;
		}
		return result;
		}
	public void clickOnMyLearning() {
		fBPage.clickOnMyLearning();
	}
	public void clickOnProfile() {
		fBPage.clickOnProfile();
	}
	
	public void clickOnMyAccount() {
		fBPage.clickOnMyAccount();
	}
	

	public void clickOnsettings() {
		fBPage.clickOnsettings();
	}
	
	public void clickLogout() {
		fBPage.clickLogout();
	}
	

}
