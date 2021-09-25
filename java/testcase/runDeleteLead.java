package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.DeleteSpecificMethods;
import pages_Delete.LoginPage;

public class runDeleteLead extends DeleteSpecificMethods {
	@BeforeTest
	public void setFilename() {
		String filename = "Data";
	}

	//@Test(dataProvider="sendData")
	@Test()
	public  void runDelete() throws InterruptedException{
		new LoginPage(driver,Prop) 
		.enterUsername(Prop.getProperty("username"))
		.enterPassword(Prop.getProperty("password"))
		.ClickLoginButton()
		.ClickCrmSfaLink()
		.ClickLeadsMenu()
		.ClickFindLeadMenu()
		.ClickPhoneMenu()
		.EnterPhno(Prop.getProperty("phno"))
		.ClickFindLeadButton()
		.ClickFirstDisplayedList()
		.ClickDeleteButton()
		.ClickfindsLeads()
		.EnterLeadID(Prop.getProperty("leadid"))
		.Clickfindleads()
		.CompanyDeleted();
}
}
//String UserName,String Password, String PhNo, String LeadID