package pages_Edit;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.EditSpecificMethods;
import base.ProjectSpecificMethods;

public class ClickEditButton extends EditSpecificMethods {
	public ClickEditButton(ChromeDriver driver,Properties Prop) {
		this.driver=driver;
		this.Prop=Prop;
		}	
	public UpdateCompanyName ClickEditButton() {
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		return new UpdateCompanyName(driver,Prop);
	}
}
