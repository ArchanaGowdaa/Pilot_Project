package genericlibrary;


	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;
	import org.testng.Reporter;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;

	public class Basescript {
		public static WebDriver driver;
		
	  @BeforeClass	
	  public void browseSetup() {
		  driver=new ChromeDriver();
		  Reporter.log("Browser Launched",true);
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		  driver.get("https://demowebshop.tricentis.com/login");
		  Reporter.log("URL Entered",true);
		  driver.findElement(By.id("Email")).sendKeys("salonydhotkar@gmail.com");
		  Reporter.log("Email address Entered Succesfully",true);
		  driver.findElement(By.id("Password")).sendKeys("$aloni1234");
		  Reporter.log("Password  Entered Succesfully",true);
		  driver.findElement(By.xpath("//input[@value='Log in']")).click();
		  Reporter.log("Login Successfully",true);
	  }
		  
//		  @AfterMethod
//		  public void Creditcard() {
//		  WebElement cardtype = driver.findElement(By.id("CreditCardType"));
//			Select cardtypeselect=new Select(cardtype);
//			cardtypeselect.selectByVisibleText("visa");
//			  Reporter.log("Clicked on Visa",true);
//			  driver.findElement(By.id("CardholderName")).sendKeys("saloni");
//			  Reporter.log("cardholder name Entered",true);
//			  driver.findElement(By.id("CardNumber")).sendKeys("5314625640123");
//			  Reporter.log("cardNumber Entered",true);
//			  WebElement MonthList = driver.findElement(By.id("ExpireMonth"));
//			  WebElement YearList = driver.findElement(By.id("ExpireYear"));
//			  
//			  Select monthselect=new Select(MonthList);
//			  
//			  Select yearselect=new Select(YearList);
//			  
//			  System.out.println(monthselect.isMultiple());
//			  monthselect.selectByVisibleText("7");
//			   yearselect.selectByValue("2030");
//			   
//			   driver.findElement(By.id("CardCode")).sendKeys("123");
//			   Reporter.log("CardCode is Entered",true);
	//	
	//   
//			
	//  }
	}


