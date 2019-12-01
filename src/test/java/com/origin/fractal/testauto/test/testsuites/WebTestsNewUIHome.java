package com.origin.fractal.testauto.test.testsuites;

import org.testng.annotations.DataProvider;

public class WebTestsNewUIHome {
	
	@DataProvider
	public Object[][] browers() {
		return new Object[][] {
		new Object[] { "1", "chrome" }
//		 ,new Object[] { "2", "firefox" },
//		 new Object[] { "3", "msedge" } ,
//		 new Object[] { "4", "ie11" }
		};
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
