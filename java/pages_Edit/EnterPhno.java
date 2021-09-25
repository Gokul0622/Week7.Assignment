package pages_Edit;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.EditSpecificMethods;
import base.ProjectSpecificMethods;

public class EnterPhno extends EditSpecificMethods {
	public EnterPhno(ChromeDriver driver,Properties Prop) {
		this.driver=driver;
		this.Prop=Prop;
		}	
	public ClickFindLeadAgain EnterPhno(String PhNo) throws InterruptedException {
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(PhNo);
		return new ClickFindLeadAgain(driver,Prop);
	}

}