package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComputersPage 
{
	public ComputersPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
			@FindBy(xpath="(//a[contains(text(),'Computers')])[1]")
			private WebElement Computers;
			
			public WebElement getComputers() {
				return Computers;
			}
			@FindBy(partialLinkText="Accessories")
			private WebElement AccessoriesLink;

			public WebElement getAccessoriesLink() {
				return AccessoriesLink;
			}

			public WebElement getAccessories() {
				return Accessories;
			}

			public WebElement getTCPCoaching() {
				return TCPCoaching;
			}

			public WebElement getAddYourReview() {
				return AddYourReview;
			}

			public WebElement getReviewTitle() {
				return ReviewTitle;
			}

			public WebElement getReviewText() {
				return ReviewText;
			}

			public WebElement getFirstRadioButton() {
				return FirstRadioButton;
			}

			public WebElement getSubmitButton() {
				return SubmitButton;
			}
			@FindBy(xpath="(//a[contains(text(),'Accessories')])[1]")
			private WebElement Accessories;
			
			@FindBy(xpath="//a[text()='TCP Coaching day']")
			private WebElement TCPCoaching;
			
			@FindBy(xpath="//a[text()='Add your review']")
			private WebElement AddYourReview;
			
			@FindBy(id="AddProductReview_Title")
			private WebElement ReviewTitle;
			
			@FindBy(id="AddProductReview_ReviewText")
			private WebElement ReviewText;
			
			@FindBy(id="addproductrating_1")
			private WebElement FirstRadioButton;
			
			@FindBy(name="add-review")
			private WebElement SubmitButton;

}
