package pages_Delete;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.DeleteSpecificMethods;

public class findlead4 extends DeleteSpecificMethods{
	public findlead4(ChromeDriver driver,Properties Prop) {
		this.driver=driver;
		this.Prop=Prop;
		}	
	public verifyDeletedCompany Clickfindleads() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		return new verifyDeletedCompany(driver,Prop);
	}

}
