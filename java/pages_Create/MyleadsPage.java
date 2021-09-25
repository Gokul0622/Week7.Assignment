package pages_Create;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class MyleadsPage extends ProjectSpecificMethods {
	public MyleadsPage(ChromeDriver driver,Properties Prop) {
		this.driver=driver;
		this.Prop=Prop;
		}
	public CreateLeadsPage ClickCreateLeadMenu() {
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLeadsPage(driver, Prop);
	}

}
