package pages_Create;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class MyHomePage extends ProjectSpecificMethods {
	public MyHomePage(ChromeDriver driver, Properties Prop) {
		this.driver=driver;
		this.Prop=Prop;
		}
	public MyleadsPage ClickLeadsMenu() {
		driver.findElement(By.linkText("Leads")).click();
		return new MyleadsPage(driver, Prop);
	}

}
