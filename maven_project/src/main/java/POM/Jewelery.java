package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Jewelery {
	public Jewelery(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
			@FindBy(xpath="(//a[contains(text(),'Jewelry')])[1]")
			private WebElement Jewellery;
			
			public WebElement getJewellery() {
				return Jewellery;
			}


			public WebElement getBlackAndWhite() {
				return BlackAndWhite;
			}


			public WebElement getEmailAFriend() {
				return EmailAFriend;
			}


			public WebElement getFriendMailTF() {
				return FriendMailTF;
			}


			public WebElement getYourMailTF() {
				return YourMailTF;
			}


			public WebElement getYourMsgTF() {
				return YourMsgTF;
			}


			public WebElement getSendMail() {
				return SendMail;
			}
			@FindBy(xpath="(//h2[@class='product-title'])[2]/child::a")
			private WebElement BlackAndWhite;
			
			@FindBy(xpath="//input[@value='Email a friend']")
			private WebElement EmailAFriend;
			
			@FindBy(name="FriendEmail")
			private WebElement FriendMailTF;
			
			@FindBy(name="YourEmailAddress")
			private WebElement YourMailTF;
			
			@FindBy(name="PersonalMessage")
			private WebElement YourMsgTF;
			
			
			@FindBy(name="send-email")
			private WebElement SendMail;
			
}
