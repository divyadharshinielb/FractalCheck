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
		result ="Passed";
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
		result ="Passed";
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
		result ="Passed";
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
		result ="Passed";
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
		result ="Passed";
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
