package com.origin.fractal.testauto;

import java.util.HashSet;
import java.util.Set;

import org.openqa.selenium.By;

import com.wv.auto.framework.app.AppBasePage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class FractalAppPage extends AppBasePage {
	
	protected FractalAppPage(AppiumDriver<MobileElement> appDriver) {
		super(appDriver);
		this.appDriver = appDriver;
		setPlatform(appDriver);
	}
	
	public Set<String> getCatalogTypesSetApp(String objpath, String objpathType, int length) {
		String wholeObjPath = "";
		String catalogType="";
		HashSet<String> catlogTypes = new HashSet<String>();
		for(int i=0;i<length;i++) {
			wholeObjPath = objpath+(i)+objpathType;
			if(elementExist(By.xpath(wholeObjPath))) {
				catalogType=getText(By.xpath(wholeObjPath));
				catlogTypes.add(catalogType.toLowerCase());
			}
		}
		return catlogTypes;
	}
	//Added by Manju Priya A on Jan_22_19 for ios
	public Set<String> getCatalogTypesSetAppIos(String objPath1, String objPath2, int length) {
		String wholeObjPath = "";
		String catalogType="";
		HashSet<String> catlogTypes = new HashSet<String>();
		for(int i=1;i<=length;i++) {
			wholeObjPath = objPath1+(i)+objPath2;
			if(elementExist(By.xpath(wholeObjPath))) {
				catalogType=getText(By.xpath(wholeObjPath));
				catlogTypes.add(catalogType.toLowerCase());
			}
		}
		return catlogTypes;
	}
	
}
