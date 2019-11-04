package com.wv.auto.framework;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

import com.wv.auto.framework.utils.Reporter;

public class BrowserFactory {
	// for windows
	private static String driversLocation = "C:/webdrivers/";
	private static String browserExtn ="";
	// for Mac
	private static String driversLocMac = "/Users/origin";
	public static WebDriver getBrowser(String strBrowserName) {
		Reporter.setBrowserAppOS(strBrowserName);
		WebDriver browser = null;
		if (strBrowserName.equalsIgnoreCase("firefox")) {
			browser = getBrowser(BrowserType.FIREFOX);
			System.out.println("Firefox Browser Opened");
		}
		if (strBrowserName.equalsIgnoreCase("ie11")) {
			browser = getBrowser(BrowserType.IE);
			System.out.println("IE Browser Opened");
		}
		if (strBrowserName.equalsIgnoreCase("chrome")) {
			browser = getBrowser(BrowserType.CHROME);
			System.out.println("Chrome Browser Opened");
		}
		if (strBrowserName.equalsIgnoreCase("msedge")) {
			browser = getBrowser(BrowserType.EDGE);
			System.out.println("Edge Browser Opened");
		}
		/*Start of - added by Manju Priya A on Jan_07_19*/
		if (strBrowserName.equalsIgnoreCase("safari")) {
			browser = getBrowser(BrowserType.SAFARI);
			System.out.println("Safari Browser Opened");
		}
		/*End of - added by Manju Priya A on Jan_07_19*/
		return browser;
	}
	
	public static WebDriver getBrowser(BrowserType browserType) {
		WebDriver browser = null;

		switch (browserType) {
		case FIREFOX:
			browser = getFirefoxBrowser();
			break;
		case IE:
			browser = getIEBrowser();
			break;
		case CHROME:
			browser = getChromeBrowser();
			break;
		case EDGE:
			browser = getMSEdgeBrowser();
			break;
		case SAFARI:
			browser = getRemoteSafariBrowser();
			//getSafariBrowser();/*Added by Manju Priya A on Jan_07_19 ths case*/
			break;
		}
		browser.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		browser.manage().window().maximize();
		return browser;
	}
	/*Start of - added by Manju Priya A on Jan_07_19*/
	public static WebDriver getSafariBrowser() {
		System.setProperty("webdriver.safari.driver", driversLocMac+"SafariDriver.safariextz");
		//System.setProperty("webdriver.ie.driver", driversLocation + "IEDriverServer.exe");
		WebDriver browser = new SafariDriver();
		return browser;

	}/*End of - added by Manju Priya A on Jan_07_19*/
	

	public static WebDriver getFirefoxBrowser() {
		System.setProperty("webdriver.gecko.driver", driversLocation + "geckodriver.exe");
		WebDriver browser = new FirefoxDriver();
		return browser;

	}

	public static WebDriver getMSEdgeBrowser() {
		System.setProperty("webdriver.edge.driver", driversLocation + "MicrosoftWebDriver.exe");
		WebDriver browser = new EdgeDriver();

		return browser;

	}

	public static WebDriver getChromeBrowser() {

		System.setProperty("webdriver.chrome.driver", driversLocation + "chromedriver.exe");
		WebDriver browser = new ChromeDriver();

		return browser;

	}

	public static WebDriver getIEBrowser() {
		System.setProperty("webdriver.ie.driver", driversLocation + "IEDriverServer.exe");
		WebDriver browser = new InternetExplorerDriver();
		return browser;

	}
	
	public static WebDriver getRemoteBrowser(BrowserType browserType, String strVersion, Platform platform) {
		WebDriver browser = null;

		switch (browserType) {
		case FIREFOX:
			browser = getRemoteFFBrowser(strVersion, platform);
			break;
		case IE:
			browser = getIEBrowser();
			break;
		case CHROME:
			browser = getRemoteChromeBrowser(strVersion, platform);
			break;
		case EDGE:
			browser = getMSEdgeBrowser();
			break;
		case SAFARI:
			browser = getSafariBrowser();/*Added by Manju Priya A on Jan_07_19 ths case*/
			break;
		}

		return browser;
	}
	public static WebDriver getRemoteFFBrowser(String strVersion, Platform platform) {
		WebDriver browser = null;
		DesiredCapabilities ffCaps = DesiredCapabilities.firefox();
		System.out.println("The firefox desired caps contains " + ffCaps.toString());
		try {
			// request the hub, with the desired capabilities
			browser = new RemoteWebDriver(new URL("http://OLSCHN-PC-0104:4444/wd/hub"), ffCaps);

		} catch (MalformedURLException e) {

			e.printStackTrace();
		}
		return browser;

	}

	public static WebDriver getRemoteChromeBrowser(String strVersion, Platform platform) {
		WebDriver browser = null;
		DesiredCapabilities chromeCaps = DesiredCapabilities.chrome();
		chromeCaps.setVersion(strVersion);
		chromeCaps.setPlatform(platform);

		System.out.println("The Chhrome desired caps contains " + chromeCaps.toString());
		try {
			// request the hub, with the desired capabilities
			browser = new RemoteWebDriver(new URL("http://OLSCHN-PC-0104:4444/wd/hub"), chromeCaps);

		} catch (MalformedURLException e) {

			e.printStackTrace();
		}
		return browser;

	}
	//Added on March_6th_19
	public static WebDriver getRemoteSafariBrowser() {
		WebDriver browser = null;
		
		//
		DesiredCapabilities capability = DesiredCapabilities.safari();
		capability.setBrowserName("safari");
		capability.setPlatform(Platform.MAC);
		SafariOptions options = new SafariOptions();
		//options.setUseCleanSession(true);
		//capability=DesiredCapabilities.safari();
		//capability.setCapability(SafariOptions.CAPABILITY, options);
		capability.setPlatform(Platform.ANY);

		try {
			browser=new RemoteWebDriver(new URL("http://192.168.1.77:4444/wd/hub"),capability);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//
		return browser;
	}
	 /*Start of - added by Manju Priya A on May_08_19*/
	public static String getOS() {
	String OS = System.getProperty("os.name").toLowerCase();
	String osName ="";
	if((OS.indexOf("win") >= 0)) {
	osName = "win";
	}else if((OS.indexOf("mac") >= 0)) {
	osName = "mac";
	}
	return osName;
	}
	public static void setDriverPath() {
		if(getOS().equalsIgnoreCase("win")) {
		driversLocation = "C:/webdrivers/";
		browserExtn = ".exe";
		}else if(getOS().equalsIgnoreCase("mac")){
		driversLocation= "/Users/origin/webdrivers/";
		browserExtn="";
		}
		
	/*End of - added by Manju Priya A on May_08_19*/
	}
}
