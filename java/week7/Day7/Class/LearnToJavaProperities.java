package week7.Day7.Class;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class LearnToJavaProperities {

	public static void main(String[] args) throws IOException   {

		FileInputStream fis = new FileInputStream("./src/main/resources/config.properties");
		Properties Prop = new Properties();
		Prop.load(fis);
		System.out.println(Prop.getProperty("url"));
		System.out.println(Prop.getProperty("username"));
		System.out.println(Prop.getProperty("password"));
//		driver.get(Url);
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		driver.findElement(By.id("username")).sendKeys(Username);
//		driver.findElement(By.id("password")).sendKeys(Password);
//		driver.findElement(By.className("decorativeSubmit")).click();
//		driver.findElement(By.linkText("CRM/SFA")).click();
//		driver.findElement(By.linkText("Leads")).click();
		
	}

}
