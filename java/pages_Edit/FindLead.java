package pages_Edit;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.EditSpecificMethods;
import base.ProjectSpecificMethods;

public class FindLead extends EditSpecificMethods {
	public FindLead(ChromeDriver driver,Properties Prop) {
		this.driver=driver;
		this.Prop=Prop;
		}	
	public PhoneMenu ClickFindLeadMenu() {
		driver.findElement(By.linkText("Find Leads")).click();
		return new PhoneMenu(driver,Prop);
	}

}
