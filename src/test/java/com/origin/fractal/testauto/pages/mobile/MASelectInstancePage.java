package com.origin.fractal.testauto.pages.mobile;

import org.openqa.selenium.By;

import com.origin.fractal.testauto.FractalAppPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class MASelectInstancePage extends FractalAppPage {
	private By txtSelectSub = By.id("com.originkonnect.app:id/textView3");
	private By insFractal = By.xpath("//android.widget.ImageView[@content-desc='Fractal']");
	
	private By insFractalDemo = By.xpath("//android.widget.ImageView[@content-desc='Fractal Demo']");
	private By insCogScale= By.xpath("//android.widget.ImageView[@content-desc=\"CognitiveU\"]");
	private By insMuleSoft = By.xpath("//android.widget.ImageView[@content-desc=\"MuleSoft\"]");
	private By insWV= By.xpath("//android.widget.ImageView[@content-des=\"Winvinaya Foundation\"]");
	private By insGE= By.xpath("//android.widget.ImageView[@content-des=\"EHS\"]");
	private By inseWOW=By.xpath("//android.widget.ImageView[@content-des=\"eWOW\"]");
	private By insJuniper= By.xpath("//android.widget.ImageView[@content-des=\"DT:Juniper\"]");
	private By lblMyLearning = By.id("com.originkonnect.app:id/action");
	private By btnMenu = By.id("com.originkonnect.app:id/action_bar_back");
	private By insChangeBtn = By.id("com.originkonnect.app:id/change_client");
	private By pageTitle = By.id("com.originkonnect.app:id/action");//Added by Manju Priya A on Jan_11_19
	public MASelectInstancePage(AppiumDriver<MobileElement> appDriver) {
		super(appDriver);

		this.setLocators();
	}

	public void setLocators() {
		if(platform.equalsIgnoreCase("ios")) {
			txtSelectSub = By.name("Select Subscription");
			insFractal = By.xpath("//XCUIElementTypeStaticText[@name='Select Subscription']/../*//XCUIElementTypeCollectionView");
			//Added By Manju Priya A on Dec-28-18
			//insFractalDemo = By.xpath("//XCUIElementTypeStaticText[@name='Select Subscription']/../*//XCUIElementTypeCollectionView");
			insFractalDemo = By.xpath("//XCUIElementTypeStaticText[contains(@name,'Select Subscription')]/../*//XCUIElementTypeCollectionView/XCUIElementTypeCell[3]");
			/*Starts - added By manju priya A on Dec-31-18*/
			pageTitle = By.xpath("//XCUIElementTypeImage[contains(@name,'menuButton')]/../XCUIElementTypeStaticText");
			btnMenu = By.xpath("//XCUIElementTypeImage[contains(@name,'menuButton')]/../XCUIElementTypeButton[1]");
			insChangeBtn = By.xpath("//XCUIElementTypeStaticText[contains(@name,'CHANGE')]");
			/*End of - added By manju priya A on Dec-31-18*/
		}
	}

	public void validateInstanceSelectionPage() {
		wait(5);
		verifyText("Select Subscription", getObj(txtSelectSub));
		
	}

	@SuppressWarnings("rawtypes")
	public void swipeInstances() {
		(new TouchAction(appDriver))
		.press(PointOption.point(714, 891))
		.moveTo(PointOption.point(126, 903))
		.release()
				.perform();

	}
	
	public void selectFractal() {
		wait(3);
		click(getObj(insFractal));
		
	}
	
	public void selectFractalDemo() {
		wait(3);
		click(getObj(insFractalDemo));	
	}
	public void selectCogscale() {
		for(int i=1;i<=6;i++) {
			try {
				
			 click(getObj(insCogScale));
			}
			catch(Exception e) {
				swipeInstances();
			}
		}
	/*	if(elementExist(insCogScale))
			{
			click(getObj(insCogScale));
			}
		
		else if(elementExist(insFractal))
		{
				swipeInstances();
			if (elementExist(insMuleSoft))
				{
				swipeInstances();
				}
			else {
				click(getObj(insCogScale));
				wait(5);
				print("Fractal");
			    }
		}
		else if(elementExist(insMuleSoft))
		{
			swipeInstances();
			if (elementExist(insFractal))
			{
			swipeInstances();
			}
			else
			{
			click(getObj(insCogScale));
			wait(5);
			}
			print("Mulesoft");
		}
		else if(elementExist(insWV))
		{
		        swipeInstances();
				if(elementExist(insGE))
				{
					swipeInstances();
				}
				else
				{
					click(getObj(insCogScale));
					wait(5);
				}
		}
		else if(elementExist(inseWOW))
		{
				swipeInstances();
				if(elementExist(insJuniper))
				{
					swipeInstances();
				}
				else
				{
					click(getObj(insCogScale));
					wait(5);
				}
		}
		else {
			swipeInstances();
			click(getObj(insCogScale));
			wait(5);
		}
	*/	/*else {
			click(getObj(insCogScale));
		}*/
		
	}
	public void verifyInstances() {
		elementExist(insFractal);
		elementExist(insFractalDemo);
	}
	public void verifyFractalSelection() {
		click(insFractal);
		verifyText("MY LEARNING",pageTitle);
		click(btnMenu);
		click(insChangeBtn);
	}
	public void verifyFractalDemoSelection() {
		click(insFractalDemo);
		verifyText("MY LEARNING",pageTitle);
	}
	

}
