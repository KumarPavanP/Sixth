package nopCommerce.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import nopCommerce.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {

	@Test
	public void loginTest() throws InterruptedException {
		driver.get(baseURL);
		Thread.sleep(1000);
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickLogin();
		Thread.sleep(8000);

		if (driver.getTitle().equals("Dashboard / nopCommerce administration")) {
			Thread.sleep(1000);
			lp.clickLogout();
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

	}
}
