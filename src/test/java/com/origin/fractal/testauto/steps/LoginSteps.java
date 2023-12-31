package com.origin.fractal.testauto.steps;

import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBaseStep;
import com.origin.fractal.testauto.pages.LoginPage;

public class LoginSteps extends FractalBaseStep {
	
	private LoginPage page;

	public LoginSteps(WebDriver driver) {
		page = new LoginPage(driver);
		fBPage = page;
	}

	public void doLogin() {
		result ="Passed";
		   try {
			page.doLogin();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	public void loginToContentAdmin() {
		result ="Passed";
		   try {
			page.loginToContentAdmin();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	public void loginPageVerification() {
		result ="Passed";
		   try {
			page.loginPageVerification();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	//Starts - Added by Mahesh on Feb_06_19
		public void verifypasswordField() {
			result ="Passed";
			try {
				page.verifypasswordField();
			}
			catch(Exception e)
			{
				e.printStackTrace();   
				result="FAILED";
		  }
		}
		//end

	public void rememberMe() {
		result ="Passed";
		   try {
			page.rememberMe();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	public void registerFunction() {
		result ="Passed";
		   try {
			page.registerFunction();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	public void blankPasswordVerification() {
		result ="Passed";
		   try {
			page.blankPasswordVerification();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}

	public void blankUserName() {
		result ="Passed";
		   try {
		   page.blankUserName();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}

	public void inValid() {
		result ="Passed";
		   try {
		   page.inValid();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}

	public void doLogin1() {
		result ="Passed";
		   try {
		   page.doLogin1();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
		
	}

	public void inValidPassword() {
		result ="Passed";
		  try {
		  page.inValidPassword();
		  }
		  catch(Exception e)
		  {
		e.printStackTrace();   
		result="FAILED";
		  }
		
	}
	public void verifySearchLink() {
		result ="Passed";
		  try {
		  page.verifySearchLink();
		  }
		  catch(Exception e)
		  {
		e.printStackTrace();   
		result="FAILED";
		  }
	}
}
