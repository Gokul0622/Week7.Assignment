package pages_Edit;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.EditSpecificMethods;
import base.ProjectSpecificMethods;

public class ClickFindLeadAgain extends EditSpecificMethods{
	public ClickFindLeadAgain(ChromeDriver driver,Properties Prop) {
		this.driver=driver;
		this.Prop=Prop;
		}	
	public ClickFirstList ClickFindLeadButton() throws InterruptedException {
		//Thread.sleep(5000);
		//driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		return new ClickFirstList(driver,Prop);
	}
}
