package pages_Delete;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.DeleteSpecificMethods;

public class verifyDeletedCompany extends DeleteSpecificMethods {
	public verifyDeletedCompany(ChromeDriver driver,Properties Prop) {
		this.driver=driver;
		this.Prop=Prop;
		}	
	public verifyDeletedCompany CompanyDeleted() throws InterruptedException {
		String text = driver.findElement(By.className("x-paging-info")).getText();
		if (text.equals("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}
		System.out.println(" Lead Deleted Successfully");
		return this;
	}

}
