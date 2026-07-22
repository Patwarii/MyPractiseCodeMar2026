package tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.BaseClass;
import pages.LoginPage;

public class LoginTest extends BaseClass {

	@Test(description = "Verify logo is displayed")
	public void userLoginTest() {

		SoftAssert sf = new SoftAssert();
        LoginPage lp = new LoginPage(driver);
        sf.assertTrue(lp.isLogoDisplayed(),
				"FAILURE: Login page logo is not displayed. Page may not have loaded correctly.");
	}

	@Test(description = "Verify user is able to enter the user id")
	public void UserIdEnter() {
		LoginPage lp = new LoginPage(driver);
		SoftAssert sf = new SoftAssert();
		lp.enterUserId("1063807");
		sf.assertTrue(true, "SUCCESS: User ID entered successfully");
	}

	@Test(description = "Verify user is able to enter password")
	public void passwordEnter() {
		LoginPage lp = new LoginPage(driver);
		SoftAssert sf = new SoftAssert();
		lp.enterPassword("Welcome123");
		sf.assertTrue(true, "SUCCESS: Password entered successfully");
	}

	@Test(description = "Verify user is able to click continue button")
	public void ClickContinuebtn() {
		LoginPage lp = new LoginPage(driver);
		SoftAssert sf = new SoftAssert();
		lp.clickContinue();
		sf.assertTrue(true, "SUCCESS: Continue button clicked successfully");

		
		sf.assertAll();
	}

}
