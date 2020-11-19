package com.origin.fractal.testauto.steps;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBaseStep;
import com.origin.fractal.testauto.pages.AdminLoginPage;
import com.origin.fractal.testauto.pages.LoginPage;

public class AdminLoginSteps extends FractalBaseStep {
	
	private AdminLoginPage page;

	public AdminLoginSteps(WebDriver driver) throws IOException {
		page = new AdminLoginPage(driver);
		fBPage = page;
	}

	public void doLogin() throws IOException {
		page.doLogin();
	}
	public void doLoginNewUI() {
		page.doLoginNewUI();
	}
	public void loginToContentAdmin() throws IOException {
		page.loginToContentAdmin();
	}
	public void loginPageVerification() {
		result ="PASSED";
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
			result ="PASSED";
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
		result ="PASSED";
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
		result ="PASSED";
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
		result ="PASSED";
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
		result ="PASSED";
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
		result ="PASSED";
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
		result ="PASSED";
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
		result ="PASSED";
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
