package pages_Edit;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.EditSpecificMethods;
import base.ProjectSpecificMethods;

public class ClickFirstList extends EditSpecificMethods {
	public ClickFirstList(ChromeDriver driver,Properties Prop) {
		this.driver=driver;
		this.Prop=Prop;
		}	
	public ClickEditButton ClickFirstDisplayedList() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		return new ClickEditButton(driver,Prop);
	}
}

