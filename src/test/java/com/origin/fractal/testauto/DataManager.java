package com.origin.fractal.testauto;

import org.testng.annotations.DataProvider;

public class DataManager {

	@DataProvider
	public static Object[][] browers() {
		return new Object[][] {
//			new Object[] { "1", "msedge" }, 
				new Object[] { "2", "chrome" },
				new Object[] { "3", "safari" }
//			,new Object[] { "4", "firefox" }

		};
	}
	
}
