package com.origin.fractal.testauto;

import com.wv.auto.framework.BaseStep;

public class FractalBaseStep extends BaseStep {
	protected FractalBasePage fBPage=null; 
	public String result= "PASSED";
	public static int overallTestNGResult=0;
	public String getResult() {
		if(result.equalsIgnoreCase("FAILED")) {
			overallTestNGResult++;
		}
		return result;
		}


	public void clickOnMyLearning() {
		result ="PASSED";
		   try {
			   fBPage.clickOnMyLearning();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	public void clickOnProfile() {
		result ="PASSED";
		   try {
			   fBPage.clickOnProfile();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	
	public void clickOnMyAccount() {
		result ="PASSED";
		   try {
			   fBPage.clickOnMyAccount();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	

	public void clickOnsettings() {
		result ="PASSED";
		   try {
			   fBPage.clickOnsettings();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	
	public void clickLogout() {
		result ="PASSED";
		   try {
			   fBPage.clickLogout();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	

}
