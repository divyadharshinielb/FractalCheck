package com.origin.fractal.testauto.test.testsuites;



import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.origin.fractal.testauto.steps.DeleteEventandClassroomSteps;
import com.origin.fractal.testauto.steps.MenuSteps;
import com.origin.fractal.testauto.test.FractalBaseWebTest;
import com.wv.auto.framework.BrowserFactory;
import com.wv.auto.framework.utils.Reporter;
/* File Name: WebTestDeleteEventandClassroom.java
 * Purpose: Check notification for instructor on deleting event and classroom -FR1-2078
 * Number of Testcases: 12
 * Created by: DivyaDharshini
 * Created on: 25-May-2020
 */

public class WebTestDeleteEventandClassroom extends FractalBaseWebTest {
	@DataProvider
	public  Object[][] browers() {
		return new Object[][] {
			new Object[] { "1", "chrome" }
		};
	}
	@Test(dataProvider = "browers", groups= {"pilot"}, enabled= true, description="")
	public void ClassroomCreation(String row, String strBrowserName) throws Exception {
		driver = BrowserFactory.getBrowser(strBrowserName);
		loginToContentAdmin(driver);
		MenuSteps menuSteps = new MenuSteps(driver);
		DeleteEventandClassroomSteps delevnt = new DeleteEventandClassroomSteps(driver);
		menuSteps.clickMenu();
		menuSteps.gotoClassroomCreation();
		Reporter.writeSummary("TCID_DELNOTI_001, Verify navigation of classroom icon in admin part , " +  menuSteps.getResult() );
		delevnt.Classroomcreate();
		Reporter.writeSummary("TCID_DELNOTI_002, Verify whether classroom is created or not , " +  delevnt.getResult() );
		delevnt.eventCreation();
		Reporter.writeSummary("TCID_DELNOTI_003, Verify whether event is created or not , " +  delevnt.getResult() );
		delevnt.logoutAdmin();
		wait(10); //added wait as it takes time to load
		login(driver);
		delevnt.instructorAccept();
		Reporter.writeSummary("TCID_DELNOTI_004, Check whether the instructor accepts the event , " +  delevnt.getResult() );
		loginToContentAdmin(driver);
		menuSteps.clickMenu();
		menuSteps.gotoClassroomCreation();
		delevnt.accepteventDelete();
		Reporter.writeSummary("TCID_DELNOTI_005, Event gets deleted after accepted by instructor , " +  delevnt.getResult() );
		login(driver);
		delevnt.instructorLogin();
		Reporter.writeSummary("TCID_DELNOTI_006, The notification for event deletion occurs , " +  delevnt.getResult() );
		loginToContentAdmin(driver);
		menuSteps.clickMenu();
		menuSteps.gotoClassroomCreation();
		delevnt.eventCreation();
		delevnt.eventDeletebeforeaccept();
		Reporter.writeSummary("TCID_DELNOTI_007, The event is deleted before accepstance of instructor , " +  delevnt.getResult() );
		login(driver);
		delevnt.instructorLogin();
		wait(10); //added as it takes time to load 
		Reporter.writeSummary("TCID_DELNOTI_008, Check for the notification for event deletion occurs before accepted , " +  delevnt.getResult() );
		loginToContentAdmin(driver);
		menuSteps.clickMenu();
		menuSteps.gotoClassroomCreation();
		delevnt.eventCreation();
		delevnt.classroomDelete();
		Reporter.writeSummary("TCID_DELNOTI_009, The Classroom is deleted after creating one event , " +  delevnt.getResult() );
		login(driver);
		delevnt.instructorLogin();
		Reporter.writeSummary("TCID_DELNOTI_010, Check for the notification for classroom deletion , " +  delevnt.getResult() );
	}
}
