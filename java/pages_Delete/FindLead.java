package pages_Delete;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.DeleteSpecificMethods;
import base.EditSpecificMethods;
import base.ProjectSpecificMethods;

public class FindLead extends DeleteSpecificMethods {
	public FindLead(ChromeDriver driver,Properties Prop) {
		this.driver=driver;
		this.Prop=Prop;
		}	
	public PhoneMenu ClickFindLeadMenu() {
		driver.findElement(By.linkText("Find Leads")).click();
		return new PhoneMenu(driver,Prop);
	}

}
