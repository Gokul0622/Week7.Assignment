package pages_Delete;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.DeleteSpecificMethods;
import base.EditSpecificMethods;
import base.ProjectSpecificMethods;

public class ClickDeleteButton extends DeleteSpecificMethods {
	public ClickDeleteButton(ChromeDriver driver, Properties Prop) {
		this.driver=driver;
		this.Prop=Prop;
		}	
	public ClickFindLeads ClickDeleteButton() {
		driver.findElement(By.linkText("Delete")).click();
		return new ClickFindLeads(driver, Prop);
	}
}
