package com.origin.fractal.testauto.test.testsuites;
import org.testng.annotations.Test;

import com.origin.fractal.testauto.DataManager;
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
	/*@DataProvider
	public  Object[][] browers() {
		return new Object[][] {
			new Object[] { "1", "chrome" }
		};
	}*/
	@Test(dataProviderClass = DataManager.class,dataProvider="browers", groups= {"pilot"}, enabled= true, description="")
	public void ClassroomCreation(String row, String strBrowserName) throws Exception {
		driver = BrowserFactory.getBrowser(strBrowserName);
		loginToContentAdmin(driver);
		MenuSteps menuSteps = new MenuSteps(driver);
		DeleteEventandClassroomSteps delevnt = new DeleteEventandClassroomSteps(driver);
		Reporter.writeSummary("TCID_DELNOTI_001, Verify clicking the Classroom icon displays the Classroom page, "+  menuSteps.getResult() );
		menuSteps.clickMenu();
		Reporter.writeSummary("TCID_DELNOTI_002, Verify whether Admin should be able to view the CLASS ROOM page , "+  menuSteps.getResult() );
		menuSteps.gotoClassroomCreation();
		Reporter.writeSummary("TCID_DELNOTI_003, Verify clicking the Add Classroom button displays Classroom creation page , "+  menuSteps.getResult() );
		delevnt.Classroomcreate();
		Reporter.writeSummary("TCID_DELNOTI_004, Verify whether classroom is created or not , "+  delevnt.getResult() );
		delevnt.eventCreation();
		Reporter.writeSummary("TCID_DELNOTI_005, Verify whether event is created or not , "+  delevnt.getResult() );
		delevnt.logoutAdmin();
		wait(10); //added wait as it takes time to load
		login(driver);
		delevnt.instructorAccept();
		Reporter.writeSummary("TCID_DELNOTI_006, Check whether the instructor accepts the event , "+  delevnt.getResult() );
		loginToContentAdmin(driver);
		menuSteps.clickMenu();
		menuSteps.gotoClassroomCreation();
		delevnt.accepteventDelete();
		Reporter.writeSummary("TCID_DELNOTI_007, Event gets deleted after accepted by instructor , "+  delevnt.getResult() );
		login(driver);
		delevnt.instructorLogin();
		Reporter.writeSummary("TCID_DELNOTI_008, The notification for event deletion occurs , "+  delevnt.getResult() );
		loginToContentAdmin(driver);
		menuSteps.clickMenu();
		menuSteps.gotoClassroomCreation();
		delevnt.eventCreation();
		delevnt.eventDeletebeforeaccept();
		Reporter.writeSummary("TCID_DELNOTI_009, The event is deleted before accepstance of instructor , "+  delevnt.getResult() );
		login(driver);
		delevnt.instructorLogin();
		wait(10); //added as it takes time to load 
		Reporter.writeSummary("TCID_DELNOTI_010, Check for the notification for event deletion occurs before accepted , "+  delevnt.getResult() );
		loginToContentAdmin(driver);
		menuSteps.clickMenu();
		menuSteps.gotoClassroomCreation();
		delevnt.eventCreation();
		delevnt.classroomDelete();
		Reporter.writeSummary("TCID_DELNOTI_011, The Classroom is deleted after creating one event , "+  delevnt.getResult() );
		login(driver);
		delevnt.instructorLogin();
		Reporter.writeSummary("TCID_DELNOTI_012, Check for the notification for classroom deletion , "+  delevnt.getResult() );
		
	}
}
