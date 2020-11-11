package com.origin.originweb.testauto.test;


import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.wv.auto.framework.BaseTest;
import com.wv.auto.framework.utils.Reporter;

public class OriginFractalWebBaseTest extends BaseTest {
	public String browser = "Chrome";
	@BeforeMethod
	public void beforeMethod() {
		print("This is Origin Fractal WebSite Load Test beforeMethod");
	}

	@AfterMethod
	public void afterMethod() {
		print("This is Origin Fractal WebSite Load Test afterMethod");
		Assert.assertTrue(blnResult);
	}

	@BeforeSuite
	public void beforeSuite() throws IOException {
		Reporter.createReports();
	}

	@AfterSuite
	public void afterSuite() {
		Reporter.closeReports();
	}
	

}
