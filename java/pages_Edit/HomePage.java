package pages_Edit;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.EditSpecificMethods;
import base.ProjectSpecificMethods;

public class HomePage extends EditSpecificMethods {
	public HomePage(ChromeDriver driver,Properties Prop) {
		this.driver=driver;
		this.Prop=Prop;
		}
	
	public LoginPage clickLogoutButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new LoginPage(driver,Prop);

	}	
	public HomePage VerifyHomePage() {
		Boolean  Displayed=driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		System.out.println(Displayed);
		return this;
	}	
	public MyHomePage ClickCrmSfaLink() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage(driver,Prop);
		
	} 

}
