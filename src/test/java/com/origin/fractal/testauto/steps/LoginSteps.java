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
	//Added by vignesh on 5-Nov-20
	public void doLoginUser() {
		result ="FAILED";
		try {
			page.doLoginUser();
			result="PASSED";
		}
		catch(Exception e)
		{
			result="FAILED";
		}
	}
	//Ends
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

	//Added by vignesh (WVI) on 10/April/20 and updated on 17-Dec-20
	public void siteAdminLoginwithcookies() {
		try {	page.siteAdminLoginwithcookies();
		}catch(Exception e) {
			print("Login issue found");
		}
	}
	public void siteAdminLogin() {
		try {page.siteAdminLogin();
		}catch(Exception e) {
			print("Login issue found");
		}
	}
	public void loginInstructorwithCookies(String instUserID,String instPassword) {
		try {page.loginInstructorwithCookies(instUserID,instPassword);
		}catch(Exception e) {
			print("Login issue found");
		}
	}
	public void loginInstructor(String instUserID,String instPassword) {
		try {page.loginInstructor(instUserID,instPassword);
		}catch(Exception e) {
			print("Login issue found");
		}
	}
	public void googleBtn() {
		result ="PASSED";
		try {
			page.googleBtn();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	public void facebookButton() {
		result ="PASSED";
		try {
			page.facebookButton();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	//Ends
	//Added by vignesh (WVI) on 16-Nov-20
	public void logOutUser() {
		try {
			page.logOutUser();
		}catch(Exception e) {
			print("Logout issue found");
		}
		wait(3);
	}

	/* Function name: adminLogout()
	 * Action: admin logout
	 * Return Type: void
	 */
	public void adminLogout() {
		try{page.adminLogout();
		wait(5);
		}catch(Exception e){
			result="FAILED";
		}
	}
	//Ends
}