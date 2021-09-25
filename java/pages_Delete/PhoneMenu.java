package pages_Delete;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.DeleteSpecificMethods;
import base.EditSpecificMethods;
import base.ProjectSpecificMethods;

public class PhoneMenu extends DeleteSpecificMethods{
	public PhoneMenu(ChromeDriver driver,Properties Prop) {
		this.driver=driver;
		this.Prop=Prop;
		}	
	public EnterPhno ClickPhoneMenu() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		return new EnterPhno(driver,Prop);

}
	}