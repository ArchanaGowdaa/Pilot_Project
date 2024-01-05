package POM;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasePage1 {
	public WebDriver driver;
//	@BeforeTest
//	public Properties init_prop() throws IOException {
//		FileInputStream fis = new FileInputStream("C:\\Users\\Archana K M\\eclipse-workspace\\maven_project\\PropertyFolder\\Result.properties");
//		Properties prop = new Properties();
//		prop.load(fis);
//		
//		return prop;
//	}
	@BeforeClass(alwaysRun = true)
	public void launch() {
		driver=new ChromeDriver();
		Reporter.log("Browser is launched");
		driver.manage().window().maximize();
		Reporter.log("Browser is maximized");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@BeforeMethod(alwaysRun = true)
	public void loginToapp() {
		driver.get("https://demowebshop.tricentis.com/");
	}
//	@AfterClass
//	public void tear_down() {
//		driver.quit();
//	}
	

}
