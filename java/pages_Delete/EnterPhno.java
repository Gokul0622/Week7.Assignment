package pages_Delete;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.DeleteSpecificMethods;
import base.EditSpecificMethods;
import base.ProjectSpecificMethods;

public class EnterPhno extends DeleteSpecificMethods {
	public EnterPhno(ChromeDriver driver,Properties Prop) {
		this.driver=driver;
		this.Prop=Prop;
		}	
	public ClickFindLeadAgain EnterPhno(String phno) {
		
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phno);
		return new ClickFindLeadAgain(driver,Prop);
	}

}