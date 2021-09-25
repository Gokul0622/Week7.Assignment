package pages_Edit;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.EditSpecificMethods;
import base.ProjectSpecificMethods;

public class MyHomePage extends EditSpecificMethods {
	public MyHomePage(ChromeDriver driver,Properties Prop) {
		this.driver=driver;
		this.Prop=Prop;
		}
	public FindLead ClickLeadsMenu() {
		driver.findElement(By.linkText("Leads")).click();
		return new FindLead(driver,Prop);
	}

}
