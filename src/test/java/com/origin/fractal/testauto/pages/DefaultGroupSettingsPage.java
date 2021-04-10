package com.origin.fractal.testauto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.origin.fractal.testauto.FractalBasePage;

public class DefaultGroupSettingsPage extends FractalBasePage {
	private By lblmanageUserIcon= By.xpath("//li//a[@href='#manageusers']");//li[@class='menu_li ng-scope active']//div[@class='icon']
	private By lblgroup= By.xpath("//a[contains(text(),'Groups')]");
	private By lblgeneral= By.xpath("//span[contains(text(),'General')]"); //span[contains(text(),'General')]
	private By editIcon= By.xpath("//div[13]//div[1]//div[1]//div[1]//div[1]//div[3]//div[2]//i[1]");
	private By plusIcon= By.xpath("//span[@class='icon dripicons-plus icon-circle-fill pointer']");
	private By lbladdedUser= By.xpath("//span[contains(text(),'qadev_socialuser@originlearning.com')]");
	private By lbldeleteUser= By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/md-dialog-content[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/i[1]");
	//Added by vignesh on 5-Oct-20
	private By iconAssign= By.xpath("(//*[@title='Assign Content'])");
	private By selectAssignItem= By.xpath("(//*[@ng-if1='(groupusernames <= list.user_left_count) && (username.length <= list.user_left_count)']//div[contains(@class,'row')])[1]");
	private By okBtn= By.xpath("//*[text()='OK']");
	private By saveBtn=  By.xpath("//*[text()='Save']");
	//Ends
	public DefaultGroupSettingsPage(WebDriver driver) { 
		super(driver);
		pageName ="DefaultGroupSettingsPage"; 
	}
	public void verifyAssignUnassignUser() {
		click(lblmanageUserIcon);
		wait(5);
		click(lblgroup);
		wait(5);
		WebElement element = driver.findElement(lblgeneral);
		Actions actions = new Actions(driver);
		actions.moveToElement(element);
		actions.perform();
		wait(5); 
		click(editIcon);
		wait(2);
		click(plusIcon);
		wait(2);
		click(lbladdedUser);
		wait(2);
		click(lbldeleteUser);
		wait(2);
		click(By.xpath("//i[@class='icon']"));
	}
	private By googleButton = By.xpath("//div[@class='login-with-google']");//div[contains(text(),'GOOGLE')]
	private By facebookButton = By.xpath("//div[@class='login-with-facebook']");//div[contains(text(),'FACEBOOK')]
	private By btnCookies = By.xpath("//button[@id='CookieAccept']");
	private By lblgoogleUsername= By.xpath("//div//input[@type='email']");
	private By lblgooglePassword= By.xpath("//div//input[@type='password']");
	private By BtnNext=By.xpath("//span[contains(text(),'Next')]");
	private By lblfacebookUsername= By.xpath(".//input[@id='email']");
	private By lblfacebookPassword= By.xpath(".//input[@id='pass']");
	private By lblfacebookLogin= By.xpath("//input[@id='u_0_0']");
	private By tbUserName = By.xpath(".//input[@name='username']");//*[@name='uname'].//input[@id='uname']
	private By tbPassword = By.xpath(".//input[@name='password']");
	private By btnLogin1 = By.xpath(".//input[@class='w100 login_btn login']");
	private By logOut=By.xpath("//li[contains(text(),'Logout')]");
	private By lblProfile = By.xpath(".//div[contains(@class,'logout_pop')]/*//button[contains(@class,'circle-hover')]");
	private By searchName = By.xpath("//input[@id='searchAllUsersName']");
	private By lblfbdeleteUser=By.xpath("//div[contains(@class,'aside minwidth-aside-70 ng-scope right am-slide-right')]//div[@class='col-lg-12 col-sm-12 col-md-12 col-xs-12 padding-lr-0']//div[1]//div[1]//div[1]//div[2]//div[1]//div[1]");
	public void googleBtnRegistration() {
		wait(2);
		click(By.xpath("//span[@title='SiteAdmin']"));
		wait(10);
		click(By.xpath("//div//a[contains(text(),'Logout')]"));
		wait(10);
		elementExist(googleButton);
		wait(5);

		click(googleButton);
		wait(2);
		for (String handle : driver.getWindowHandles()) {
			driver.switchTo().window(handle);}
		enterData("sendhilkumar.m@originlearning.com",lblgoogleUsername);//subhashreddy.v@originlearning.com  divyaravzz97@gmail.com
		wait(2);
		click(BtnNext);
		wait(5);
		enterData("9677661324",lblgooglePassword);//weareMESSI10! Daisy@1997
		wait(2);
		click(BtnNext);
		wait(25);
		for (String handle : driver.getWindowHandles()) {
			driver.switchTo().window(handle);}
		wait(2);
		click(By.xpath("//body//button[contains(text(),'AGREE')]"));
		wait(5);
	}
	public void userdeletion_google() {
		wait(5);
		enterData("qasiteadmin@origin.com",tbUserName);//contentadmin@origin.com
		enterData("P@ssw0rd",tbPassword);//P@ssw0rd
		click(btnLogin1);
		wait(20);
		click(lblmanageUserIcon);
		wait(5);
		click(lblgroup);
		click(lblgroup);
		//	 print("checkkckckckckkckckckkckckckc");
		wait(10);
		WebElement element = driver.findElement(lblgeneral);
		Actions actions = new Actions(driver);
		actions.moveToElement(element);
		actions.perform();
		wait(5); 
		click(editIcon);
		wait(2);
		verifyText("sendhilkumar.m@originlearning.com",By.xpath("//div[contains(@class,'col-lg-12 col-md-12 col-xs-12 col-sm-12 padding-tb-10 border-tb pointer')]//span[contains(@class,'font-size-12 text-bcbcbc ng-binding')][contains(text(),'sendhilkumar.m@originlearning.com')]"));
		wait(2);
		click(By.xpath("//i[@class='icon']"));
		wait(2);
		click(By.xpath("//a[contains(text(),'All Users')]"));
		wait(2);	 click(searchName);
		wait(2);
		enterData("Sendhilkumar M",searchName);
		wait(10);
		click(By.xpath("//div[@class='col-lg-3 col-md-3 col-xs-3 col-sm-3']//i[@class='padding-lr-10 icon text-left font-size-18 bold cursor-pointer gray-85 ng-scope']"));
		wait(5);
		click(By.xpath("//button//span[contains(text(),'OK')]"));
		wait(2);
	}
	public void facebookButton() {
		wait(5);
		click(By.xpath("//span[@title='SiteAdmin']"));
		wait(2);
		click(By.xpath("//div//a[contains(text(),'Logout')]"));
		wait(5);
		elementExist(facebookButton);
		wait(5);
		click(facebookButton);
		for (String handle : driver.getWindowHandles()) {
			driver.switchTo().window(handle);}
		wait(5);
		wait(10);
		enterData("gaddammahesh286@gmail.com",lblfacebookUsername);//divyaravzz97@gmail.com
		wait(5);
		enterData("9177850761",lblfacebookPassword);//Divya12345
		wait(5);
		click(lblfacebookLogin);
		wait(25);
		for (String handle : driver.getWindowHandles()) {
			driver.switchTo().window(handle);}
		wait(2);
		click(By.xpath("//body//button[contains(text(),'AGREE')]"));
		wait(5);
	}
	public void userdelete_facebook() {
		wait(4);
		enterData("qasiteadmin@origin.com",tbUserName);//contentadmin@origin.com
		enterData("P@ssw0rd",tbPassword);//P@ssw0rd
		click(btnLogin1);
		wait(5);
		click(lblmanageUserIcon);
		wait(20);
		click(lblmanageUserIcon);
		wait(5);
		click(lblgroup);
		click(lblgroup);
		print("checkkckckckckkckckckkckckckc");
		wait(10);
		WebElement element = driver.findElement(lblgeneral);
		Actions actions = new Actions(driver);
		actions.moveToElement(element);
		actions.perform();
		wait(5); 
		click(editIcon);
		wait(2);
		verifyText("gaddammahesh286@gmail.com",By.xpath("//div[contains(@class,'col-lg-12 col-md-12 col-xs-12 col-sm-12 padding-tb-10 border-tb pointer')]//span[contains(@class,'font-size-12 text-bcbcbc ng-binding')][contains(text(),'gaddammahesh286@gmail.com')]"));
		wait(2);
		click(By.xpath("//i[@class='icon']"));
		wait(2);
		click(By.xpath("//a[contains(text(),'All Users')]"));
		wait(2);	 click(searchName);

		enterData("Gaddam Mahesh",searchName);
		wait(10);
		click(By.xpath("//div[@class='col-lg-3 col-md-3 col-xs-3 col-sm-3']//i[@class='padding-lr-10 icon text-left font-size-18 bold cursor-pointer gray-85 ng-scope']"));
		wait(5);
		click(By.xpath("//button//span[contains(text(),'OK')]"));
		wait(2);
	}
	// Added by vignesh on 5-Oct-20
	/* Function Name: assignContentsToGroup()
	 * purpose: Assign the catalog items to group
	 */
	public void assignContentsToGroup() {
		wait(5);
		click(lblmanageUserIcon);
		wait(5);
		click(lblgroup); 
		wait(5);
		moveElementFocusandClick(iconAssign);
		wait(10);
		click(selectAssignItem);
		wait(5);
		if(elementExist(okBtn)) {
			click(okBtn);
		}
		wait(3);
		click(saveBtn);
		wait(4);
	}
	//End
}
