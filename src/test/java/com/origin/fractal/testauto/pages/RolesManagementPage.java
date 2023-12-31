package com.origin.fractal.testauto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.origin.fractal.testauto.FractalBasePage;

public class RolesManagementPage extends FractalBasePage {
	private By tbUserName = By.xpath(".//input[@name='username']");//*[@name='uname']
	private By tbPassword = By.xpath(".//input[@name='password']");//*[@name='userpassword']
	private By btnLogin = By.xpath("//input[@type='submit']");//button[@id='login_btn']
	private By btnLogin1 = By.xpath(".//input[contains(@type,'submit')]");  //button[@id='btn']
	private By lblProfile = By.xpath(".//div[contains(@class,'logout_pop')]/*//button[contains(@class,'circle-hover')]");
	private By instructorroleBtn = By.xpath("//button[contains(text(),'Instructor')]");
	private By learningadminroleBtn = By.xpath("//button[contains(text(),'Learning Admin')]");
	private By siteadminroleBtn = By.xpath("//button[contains(text(),'Site Admin')]");
	private By businessadminroleBtn = By.xpath("//button[contains(text(),'Bussiness Admin')]");
	private By instructorcheck = By.xpath("//span[contains(text(),'Total events')]");
	private By learnerrolecheckbtn = By.xpath("//button[contains(text(),'Learner')]");
	private By mylearningcheck = By.xpath("//a[contains(text(),'MY LEARNING')]");
	private By btnMenu = By.xpath("//ng-include[@id='header1']/*//div[contains(@title,'Menu')]");
	private By userIcon = By.xpath(".//div[contains(@class, 'pull-right padding-r-0 ng-scope')]");
	private By logOutButton = By.xpath(".//li[contains(text(),'Logout')]");
	private By adminlogout = By.xpath("//a[contains(text(),'Logout')]");
	private By wishlisticon = By.xpath("//i[contains(@class,'text-right font-size-23 text-icon-bcbcbc')]");
	//for admin  
	private By manageUser = By.xpath("//li[@title='Manage Users']//a//span[contains(text(),'Manage Users')]");
	    private By businessUser = By.xpath("//span[contains(text(),'Businessuser Automation')]");
	    private By buInstructor = By.xpath("//div[contains(@class,'col-lg-12 col-md-12 col-sm-12 col-xs-12 padding-all-0 padding-b-40 padding-t-20 min-height-500 ng-scope')]//div[contains(@class,'ng-scope')]//div[1]//div[1]//div[1]//div[4]//div[2]");
	    private By instructorUser = By.xpath("//span[contains(text(),'Automation Instructor')]");
	    private By instructorDirectUser = By.xpath("//div[contains(text(),'Direct User')]");
	    private By businessAdmin = By.xpath("//span[contains(text(),'Automation Business Admin')]");
	    private By businessAdminBusinessUser = By.xpath("//div[contains(text(),'Business User')]");
	    private By siteAdmin = By.xpath("//span[contains(@class,'cursor-pointer version-bubble font-size-18 height_25 title_name text-capitalize ng-binding ng-scope')][contains(text(),'Automation Siteadmin')]");
	    private By siteAdminDirectUser = By.xpath("//div[contains(text(),'Direct User')]");
	    private By directUser = By.xpath("//div[contains(@class,'line-height-0-5 col-lg-4 col-md-4 col-xs-3 col-sm-3 padding-lr-0')]//span[contains(@class,'cursor-pointer version-bubble font-size-18 height_25 title_name text-capitalize ng-binding ng-scope')][contains(text(),'Automation directuser')]");
	    private By directInstructorUser = By.xpath("//div[contains(text(),'Instructor')]");
	    private By directLearningAdmin = By.xpath("//div[contains(text(),'Learning Adminstrator')]");
	    private By learningAdmin= By.xpath("//div[@class='line-height-0-5 col-lg-4 col-md-4 col-xs-3 col-sm-3 padding-lr-0']//span[@class='cursor-pointer version-bubble font-size-18 height_25 title_name text-capitalize ng-binding ng-scope'][contains(text(),'LMS Admin')]");
	    private By learningAdminDirectUser= By.xpath("//div[contains(text(),'Direct User')]");
	    private By classroomBtn = By.xpath("//span[contains(text(),'classroom')]");
	    private By addClassroomBtn = By.xpath("//button[contains(text(),'Add Classroom')]");
	    private By selectSingleInstructor = By.xpath("//div[@class='select-background form-group margin-all-0 cus_mar_b_30 select-180 padding-l-20']//span[@class='current'][contains(text(),'Select')]");
	   private By insdropdown1 = By.xpath("//li[contains(text(),'Businessuser Automation')]");
	   private By insdropdown2 = By.xpath("//li[contains(text(),'Automation directuser')]");
	   private By insdropdown3 = By.xpath("//li[contains(text(),'Automation Instructor')]");
	   private By closeBtn = By.xpath("//html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/button[1]/i[1]");
	   private By classroomediticon = By.xpath("//div[contains(@class,'col-lg-12 col-md-12 col-sm-12 col-xs-12 padding-all-0 ng-scope')]//div[1]//div[1]//div[1]//div[5]//i[2]");
	  private By editselectSingleInstructor  = By.xpath("//div[contains(@class,'col-lg-2 col-md-2 col-sm-2 col-xs-2 padding-tb-15')]//div[contains(@class,'nice-select ng-pristine ng-untouched ng-valid ng-isolate-scope ng-not-empty ng-valid-required')]");
	  private By settingsIcon =By.xpath("//div[@class='icon dripicons-gear']"); 
	private By adminmanagerolebtn = By.xpath("//span[contains(text(),'Manage Roles')]");
	private By siteadminrolebtn = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[3]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div/h3/span");
	private By roleediticon = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[3]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[4]/i[1]");
	private By rolenameedit = By.xpath("//label[contains(text(),'Role name')]/../input");
	private By submitbtn = By.xpath("//button[contains(text(),'Submit')]");
	//eyt to use after discussion with team
	private By searchfielduser = By.xpath("//input[@id='searchAllUsersName']");
	private By usernameforLEarningadmin = By.xpath("//div[contains(text(),'contentadmin@origin.com')]");
	public RolesManagementPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		String baseUrl = "https://automation-origin.originfractal.com/"; //https://automation-origin.originfractal.com/#/login
		goTo(baseUrl);
	}
	//direct user with learning admin role and instructor role
	public void DirectuserwithLearningadminandinsrole() {
		enterData("automation_directuser@originlearning.com",tbUserName);
		enterData("AutoDU@123",tbPassword);
		wait(2);
		click(btnLogin);
		wait(2);
		elementExist(mylearningcheck);
		click(mylearningcheck);
		wait(2);
		click(lblProfile);
		wait(5);
		elementExist(instructorroleBtn);
		elementExist(learningadminroleBtn);
	}
	public void Checkdirectuserinsandlearningadminmapping() {
		click(lblProfile);
		click(instructorroleBtn);
		wait(10);
		elementExist(instructorcheck);
		click(lblProfile);
		elementExist(learnerrolecheckbtn);
		elementExist(learningadminroleBtn);
		wait(2);
		click(learnerrolecheckbtn);
		wait(10);
		elementExist(mylearningcheck);
		click(mylearningcheck);
		Checkdirectuserandlearningadminmapping();
	}
		public void Checkdirectuserandlearningadminmapping() {
			wait(2);
			click(lblProfile);
			elementExist(instructorroleBtn);
			elementExist(learningadminroleBtn);
			click(learningadminroleBtn);
			wait(15);
			elementExist(btnMenu);
			click(btnMenu);
			click(userIcon);
			elementExist(learnerrolecheckbtn);
			elementExist(instructorroleBtn);
			click(learnerrolecheckbtn);
			wait(10);
			elementExist(mylearningcheck);
			click(mylearningcheck);
			wait(2);
			click(lblProfile);
			wait(2);
			click(logOutButton);
			
		}
		//instructor mapping to directuser check
		public void InstructorwithDirectuserrole() {
			enterData("automation_instructor@origin.com",tbUserName);
			enterData("P@ssw0rd",tbPassword);
			click(btnLogin);
			wait(5);
			elementExist(instructorcheck);
			click(lblProfile);
			elementExist(learnerrolecheckbtn);
			wait(2);
			click(learnerrolecheckbtn);
			wait(2);
			wait(15);
			elementExist(mylearningcheck);
			click(mylearningcheck);
			wait(2);
			click(lblProfile);
			click(logOutButton);
		}
		//learningadmin mapping to directuser role check
		public void LearningadminwithDirectuserrole() {
			wait(2);
			enterData("contentadmin@origin.com",tbUserName);
			enterData("P@ssw0rd",tbPassword);
			click(btnLogin);
			wait(5);
			elementExist(btnMenu);
			click(btnMenu);
			click(userIcon);
			elementExist(learnerrolecheckbtn);
			click(learnerrolecheckbtn);
			wait(10);
			elementExist(mylearningcheck);
			click(mylearningcheck);
			click(lblProfile);
			wait(2);
			elementExist(learningadminroleBtn);
			click(logOutButton);
		}
		//siteadmin with directuserrole
		public void SiteadminwithDirectuserRole() {
			wait(2);
			enterData("automation_siteadmin@origin.com",tbUserName);
			enterData("AutoSA@123",tbPassword);
			click(btnLogin);
			wait(5);
			elementExist(btnMenu);
			click(btnMenu);
			click(userIcon);
			elementExist(learnerrolecheckbtn);
			click(learnerrolecheckbtn);
			wait(5);
			elementExist(mylearningcheck);
			click(mylearningcheck);
			wait(2);
			click(lblProfile);
			elementExist(siteadminroleBtn);
			click(siteadminroleBtn);
			elementExist(btnMenu);
			click(userIcon);
			click(adminlogout);
		}
		//businessadmin with  business user role
		public void BusinessadminwithbusinessuserRole() {
			enterData("automation_businessadmin@origin.com",tbUserName);
			enterData("P@ssw0rd",tbPassword);
			click(btnLogin);
			wait(2);
			elementExist(wishlisticon);
			click(userIcon);
			elementExist(learnerrolecheckbtn);
			click(learnerrolecheckbtn);
			wait(10);
			elementExist(mylearningcheck);
			click(mylearningcheck);
			click(lblProfile);
			elementExist(businessadminroleBtn);
			//click(businessadminroleBtn);
			elementExist(logOutButton);
			click(logOutButton);
		}
		//businessuser with instructor role
		public void Businessuserwithinsrole() {
			wait(2);
			enterData("automation_businessuser@origin.com",tbUserName);
			enterData("AutoDU@123",tbPassword);
			click(btnLogin);
			wait(2);
			click(lblProfile);
			wait(2);
			click(instructorroleBtn);
			wait(10);
			elementExist(instructorcheck);
			wait(2);
			click(lblProfile);
			wait(2);
			elementExist(learnerrolecheckbtn);
			wait(2);
			click(logOutButton);
		}
		public void gotoManageUser() {
			click(manageUser);
		}
		public void BusinessUserRole() {
			wait(2);
			click(searchfielduser);
			enterData("Businessuser Automation", searchfielduser);
			wait(2);
			verifyText("Businessuser Automation",businessUser);
			wait(2);
			verifyText("Instructor",buInstructor);
		}
		public void instructorUserRole() {
			click(searchfielduser);
			enterData("Automation Instructor", searchfielduser);
			wait(2);
			verifyText("Automation Instructor",instructorUser);
			wait(2);
			verifyText("Direct User",instructorDirectUser);
		}
		public void businessAdminRole() {
			click(searchfielduser);
			enterData("Automation Business Admin", searchfielduser);
			wait(2);
			verifyText("Automation Business Admin",businessAdmin);
			wait(2);
			verifyText("Business User",businessAdminBusinessUser);
		}
		public void siteAdminRole() {
			/* WebElement element = driver.findElement( By.xpath("//div[@class='line-height-0-5 col-lg-4 col-md-4 col-xs-3 col-sm-3 padding-lr-0']//span[@class='cursor-pointer version-bubble font-size-18 height_25 title_name text-capitalize ng-binding ng-scope'][contains(text(),'LMS Admin')]")); Actions
			    actions = new Actions(driver); actions.moveToElement(element);
			    actions.perform();*/
			click(searchfielduser);
			enterData("Automation Siteadmin", searchfielduser);
			wait(2);
			verifyText("Automation Siteadmin",siteAdmin);
			wait(2);
			verifyText("Direct User",siteAdminDirectUser);
		}
		public void directUserRole() {
			click(searchfielduser);
			enterData("Automation Directuser", searchfielduser);
			wait(2);
			verifyText("Automation Directuser",directUser);
			wait(2);
			verifyText("Instructor",directInstructorUser);
			wait(2);
			verifyText("Learning Adminstrator",directLearningAdmin);
		}
		public void learningAdminRole() {
			click(searchfielduser);
			enterData("LMS Admin", searchfielduser);
			wait(2);
			verifyText("LMS Admin",learningAdmin);
			wait(2);
			verifyText("Direct User",learningAdminDirectUser);
		}
		public void clickMenu() {
			wait(2);
			click(btnMenu);
		}
		public void editclassroomcheck() {
			click(classroomediticon);
			wait(2);
			WebElement element = driver.findElement(By.xpath("//div[contains(@class,'col-lg-2 col-md-2 col-sm-2 col-xs-2 padding-tb-15')]//div[contains(@class,'nice-select ng-pristine ng-untouched ng-valid ng-isolate-scope ng-not-empty ng-valid-required')]")); 
			Actions actions = new Actions(driver); actions.moveToElement(element);
			actions.perform();
			click(editselectSingleInstructor);
			elementExist(insdropdown1);
			elementExist(insdropdown2);
			elementExist(insdropdown3);
			click(closeBtn);
		}
		public void addclassroomcheck() {
			click(addClassroomBtn);
			wait(2);
			WebElement element = driver.findElement(By.xpath("//div[@class='select-background form-group margin-all-0 cus_mar_b_30 select-180 padding-l-20']//span[@class='current'][contains(text(),'Select')]")); 
		    Actions actions = new Actions(driver); actions.moveToElement(element);
			actions.perform(); 
			click(selectSingleInstructor);
			elementExist(insdropdown1);
			elementExist(insdropdown2);
			elementExist(insdropdown3);
			click(closeBtn);
		}
		public void clickClassroom() {
			click(classroomBtn);
			wait(10);
		}
		public void editmanagerolefunctionality() {
			wait(5);
			click(settingsIcon);
			wait(5);
			click(adminmanagerolebtn);
		//	click(siteadminrolebtn);
			click(roleediticon);
			enterData("siteadmin",rolenameedit);
			click(submitbtn);
			wait(2);
			verifyText("siteadmin",siteadminrolebtn);
		}
}