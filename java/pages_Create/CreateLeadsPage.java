package pages_Create;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class CreateLeadsPage extends ProjectSpecificMethods {
	public CreateLeadsPage(ChromeDriver driver, Properties Prop) {
		this.driver=driver;
		this.Prop=Prop;
		}
	
	public ViewLeads ClickCreateLead(String company, String firstname, String lastname, String phno) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(company);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastname);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phno); 
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeads(driver,Prop);

	}

}
