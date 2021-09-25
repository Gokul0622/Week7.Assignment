package pages_Delete;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.DeleteSpecificMethods;
import base.EditSpecificMethods;
import base.ProjectSpecificMethods;

public class ClickFindLeads extends DeleteSpecificMethods{
public ClickFindLeads(ChromeDriver driver,Properties Prop ){
	this.driver=driver;
	this.Prop=Prop;
	}	
	public leadID ClickfindsLeads() {
		driver.findElement(By.linkText("Find Leads")).click();
		return new leadID(driver,Prop);
	}

}
