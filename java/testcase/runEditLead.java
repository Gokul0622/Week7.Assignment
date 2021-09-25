package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.EditSpecificMethods;
import pages_Edit.LoginPage;

public class runEditLead extends EditSpecificMethods{
	@BeforeTest
	public void setFilename() {
		String filename = "Data"; 
	}

	//@Test(dataProvider="sendData")
	@Test()
	public  void runedit() throws InterruptedException{
		new LoginPage(driver,Prop)
		.enterUsername(Prop.getProperty("username"))
		.enterPassword(Prop.getProperty("password"))
		.clickLoginButton()
		.ClickCrmSfaLink()
		.ClickLeadsMenu()
		.ClickFindLeadMenu()
		.ClickPhoneMenu()
		.EnterPhno(Prop.getProperty("phno"))
		.ClickFindLeadButton()
		.ClickFirstDisplayedList()
		.ClickEditButton()
		.UpdateCompanyName(Prop.getProperty("updatecompanyname"))
		.ClickSubmitButton();
	}

}
//String UserName,String Password, String PhNo, String CompanyName