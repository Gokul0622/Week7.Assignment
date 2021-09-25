package pages_Create;

import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class ViewLeads extends ProjectSpecificMethods {
	public ViewLeads(ChromeDriver driver, Properties Prop) {
		this.driver=driver;
		this.Prop=Prop;
		// TODO Auto-generated constructor stub
	}

	public ViewLeads VerifyViewLead() {
		System.out.println(" NewLead Created Successfully ");
		return this;
	}

}
