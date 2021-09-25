package pages_Edit;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.EditSpecificMethods;
import base.ProjectSpecificMethods;

public class UpdateCompanyName extends EditSpecificMethods{
	public UpdateCompanyName(ChromeDriver driver,Properties Prop) {
		this.driver=driver;
		this.Prop=Prop;
		}	
	public ClickSubmitButton UpdateCompanyName(String CompanyName) {
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(CompanyName);
		return new ClickSubmitButton(driver,Prop);
	}
}
