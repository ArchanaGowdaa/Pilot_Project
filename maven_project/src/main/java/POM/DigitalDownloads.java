package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DigitalDownloads {
	public DigitalDownloads(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
			@FindBy(xpath="(//a[contains(text(),'Digital')])[1]")
			private WebElement Digital;
			
			public WebElement getDigital() {
				return Digital;
			}

			public WebElement getMusic2() {
				return Music2;
			}

			public WebElement getDownload() {
				return Download;
			}
			@FindBy(xpath="(//a[contains(text(),'Music 2')])[1]")
			private WebElement Music2;
			
			@FindBy(xpath="(//a[contains(text(),'Download ')])[1]")
			private WebElement Download;

}
