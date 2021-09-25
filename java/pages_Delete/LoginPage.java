package pages_Delete;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.DeleteSpecificMethods;
import base.EditSpecificMethods;
import base.ProjectSpecificMethods;

public class LoginPage extends DeleteSpecificMethods {
public LoginPage(ChromeDriver driver,Properties Prop) {
	this.driver=driver;
	this.Prop=Prop;
	}


	//					action+elementName
	public LoginPage enterUsername(String UserName) {
		driver.findElement(By.id("username")).sendKeys(UserName);
		return this;

	}

	public LoginPage enterPassword(String Password) {
		driver.findElement(By.id("password")).sendKeys(Password);
		return this;
	}

	public HomePage ClickLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new HomePage(driver,Prop);

	}
}
