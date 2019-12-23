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
		page.doLogin();
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
		result ="PASSED";
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

	public void loginToContentAdmin() {
		result ="PASSED";
		  try {
		  page.loginToContentAdmin();
		  }
		  catch(Exception e)
		  {
		e.printStackTrace();   
		result="FAILED";
		  }
		
	}
	public void loginToInstructor() {
		result ="PASSED";
		  try {
		  page.loginToInstructor();
		  }
		  catch(Exception e)
		  {
		e.printStackTrace();   
		result="FAILED";
		  }
		
	}

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
}
