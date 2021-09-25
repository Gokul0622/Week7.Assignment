package pages_Edit;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.EditSpecificMethods;
import base.ProjectSpecificMethods;

public class ClickSubmitButton extends EditSpecificMethods{
public ClickSubmitButton(ChromeDriver driver,Properties Prop ){
	this.driver=driver;
	this.Prop=Prop;
	}	
	public ClickSubmitButton ClickSubmitButton() {
		driver.findElement(By.name("submitButton")).click();
		System.out.println(" CompanyName Edited Successfully Updated");
		return this;
	}

}
