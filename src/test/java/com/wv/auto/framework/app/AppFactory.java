package com.wv.auto.framework.app;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

public class AppFactory {

	public static AppiumDriver<MobileElement> getAndroidApp() {
		String fratalApkFile = "fractalapk/OriginFractal3.0.10.apk";
		AppiumDriver<MobileElement> appDriver = null;
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("deviceName", "emulator-5554"); // CVH7N15B05003054 , emulator-5554
		capabilities.setCapability("platformVersion", "8.0.0"); // 6.0.1, 8.1.0 , 6.0
		System.out.println(new File(fratalApkFile).getAbsolutePath());
		capabilities.setCapability("app", new File(fratalApkFile).getAbsolutePath());
		capabilities.setCapability("noReset", "true");
		System.out.println("Capabilities : " +capabilities.toString());
//		capabilities.setCapability("automationName", "uiautomator2");
//		capabilities.setCapability("appPackage", "com.originkonnect.app");
//		capabilities.setCapability("appActivity", "com.originkonnect.app.Activity.SplashscreenActivity");
//		capabilities.setCapability("deviceName", "944becb9");
		
		
		try {
			appDriver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return appDriver;
	}
	/*
	public static AppiumDriver<MobileElement> getiOSApp() {
		String fratalAppFile = "fractalapk/LearningStore.app";
		AppiumDriver<MobileElement> appDriver = null;
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
		capabilities.setCapability("platformName", "iOS");
		capabilities.setCapability("deviceName", "iPhone XS Max"); // 944becb9
		capabilities.setCapability("platformVersion", "12.0");
		System.out.println(new File(fratalAppFile).getAbsolutePath());
		capabilities.setCapability("app", new File(fratalAppFile).getAbsolutePath());
		capabilities.setCapability("noReset", "true");
		System.out.println("Capabilities : " +capabilities.toString());
		
		
		try {
			appDriver = new IOSDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return appDriver;
	}*/
	//Updated by Manju Priya A on Jan_11_19
	public static AppiumDriver<MobileElement> getiOSApp() {
		String fratalAppFile = "fractalapk/LearningStore.app";
		AppiumDriver<MobileElement> appDriver = null;
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
		capabilities.setCapability("platformName", "iOS");
		capabilities.setCapability("deviceName", "iPhone XS"); // 944becb9
		capabilities.setCapability("platformVersion", "12.1");
		System.out.println(new File(fratalAppFile).getAbsolutePath());
		capabilities.setCapability("app", new File(fratalAppFile).getAbsolutePath());
		capabilities.setCapability("noReset", "true");
		System.out.println("Capabilities : " +capabilities.toString());
		try {
			appDriver = new IOSDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return appDriver;
	}
}
