package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import base.ProjectSpecificMethods;
import pages_Create.LoginPage;

public class runCreateLead extends ProjectSpecificMethods {
	@BeforeTest
	public void setFilename() {
		String filename = "Data"; 
	}
	//@Test(dataProvider="sendData")
	@Test()
	public void runCreateLead() {
		new LoginPage(driver,Prop)
		.enterUsername(Prop.getProperty("username"))
		//.enterUsername(username)
		//.enterPassword(password)
		.enterPassword(Prop.getProperty("password"))
		.clickLoginButton()
		.ClickCrmSfaLink()
		.ClickLeadsMenu()
		.ClickCreateLeadMenu()
		//.ClickCreateLead(firstname, lastname, companyname, phno)
		.ClickCreateLead(Prop.getProperty("company"),Prop.getProperty("firstname"),Prop.getProperty("lastname"),Prop.getProperty("phno"))
		.VerifyViewLead();

	}

}
//String username,String password, String company, String firstname, String lastname, String phno)