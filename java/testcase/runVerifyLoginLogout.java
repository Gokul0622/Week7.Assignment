package testcase;

import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages_Create.LoginPage;

public class runVerifyLoginLogout extends ProjectSpecificMethods {
	@Test
	public void Logout() {
	
	
	new LoginPage(driver, Prop)
	.enterUsername("username")
	.enterPassword("password")
	.clickLoginButton()
	.clickLogoutButton();
	
}
}