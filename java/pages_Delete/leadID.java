package pages_Delete;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.DeleteSpecificMethods;

public class leadID extends DeleteSpecificMethods{
	public leadID(ChromeDriver driver,Properties Prop) {
		this.driver=driver;
		this.Prop=Prop;
		}	
	public findlead4 EnterLeadID(String leadid) throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadid);
		return new findlead4(driver,Prop);
	}

}
