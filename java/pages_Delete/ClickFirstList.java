package pages_Delete;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.DeleteSpecificMethods;
import base.EditSpecificMethods;
import base.ProjectSpecificMethods;

public class ClickFirstList extends DeleteSpecificMethods {
	public ClickFirstList(ChromeDriver driver,Properties Prop) {
		this.driver=driver;
		this.Prop=Prop;
		}	
	public ClickDeleteButton ClickFirstDisplayedList() throws InterruptedException {
		String leadid = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"))
				.getText();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		return new ClickDeleteButton(driver,Prop);
	}
}
