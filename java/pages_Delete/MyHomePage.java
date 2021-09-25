package pages_Delete;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.DeleteSpecificMethods;
import base.EditSpecificMethods;
import base.ProjectSpecificMethods;

public class MyHomePage extends DeleteSpecificMethods {
	public MyHomePage(ChromeDriver driver,Properties Prop) {
		this.driver=driver;
		this.Prop=Prop;
		}
	public FindLead ClickLeadsMenu() {
		driver.findElement(By.linkText("Leads")).click();
		return new FindLead(driver,Prop);
	}

}
