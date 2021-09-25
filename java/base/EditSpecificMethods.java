package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.EditLeadDataExcel;

public class EditSpecificMethods {
	public ChromeDriver driver;
	public String fileName;
	public Properties Prop;

	@DataProvider
	public String[][] sendData() throws IOException {
		return EditLeadDataExcel.readData("Data");
	}

	@BeforeMethod
	public void Precondition() throws IOException {
		FileInputStream fis = new FileInputStream("./src/main/resources/englishconfig.properties");
		Prop = new Properties();
		Prop.load(fis);
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@AfterMethod
	public void PostDeclaration() {
		{
			driver.close();
		}
	}
}
