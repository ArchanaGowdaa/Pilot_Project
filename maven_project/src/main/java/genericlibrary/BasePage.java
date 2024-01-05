package genericlibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

	public BasePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Register")
	private WebElement registerLink;

	@FindBy(linkText = "Log in")
	private WebElement loginLink;

	@FindBy(xpath = "//span[text()='Shopping cart']")
	private WebElement shoppingCartLink;

	@FindBy(xpath = "//span[text()='Wishlist']")
	private WebElement wishlistLink;

	@FindBy(id = "small-searchterms")
	private WebElement searchBox;

	@FindBy(xpath = "//input[@value='Search']")
	private WebElement searchButton;

	@FindBy(partialLinkText = "BOOKS")
	private WebElement books;

	@FindBy(partialLinkText = "COMPUTERS")
	private WebElement computers;

	@FindBy(partialLinkText = "ELECTRONICS")
	private WebElement electronics;

	@FindBy(partialLinkText = "APPAREL & SHOES")
	private WebElement apparalesAndShoes;

	@FindBy(partialLinkText = "DIGITAL DOWNLOADS")
	private WebElement digitalDownloads;

	@FindBy(partialLinkText = "JEWELRY")
	private WebElement jewelry;

	@FindBy(partialLinkText = "GIFT CARDS")
	private WebElement giftCards;

	@FindBy(linkText = "Sitemap")
	private WebElement sitemap;

	@FindBy(linkText = "Privacy Notice")
	private WebElement privacynotice;

	@FindBy(linkText = "Conditions of Use")
	private WebElement conditionsofuser;

	@FindBy(linkText = "About us")
	private WebElement aboutus;

	@FindBy(linkText = "Contact us")
	private WebElement contactus;

	@FindBy(linkText = "Search")
	private WebElement search;

	@FindBy(linkText = "News")
	private WebElement news;

	@FindBy(linkText = "Blog")
	private WebElement blog;

	@FindBy(linkText = "Recently viewed products")
	private WebElement recentlyviewedproducts;

	@FindBy(linkText = "Compare products list")
	private WebElement compareproductlist;

	@FindBy(linkText = "New products")
	private WebElement newproduct;

	@FindBy(linkText = "My account")
	private WebElement myaccount;

	@FindBy(linkText = "Orders")
	private WebElement orders;

	@FindBy(linkText = "Addresses")
	private WebElement addresses;

	@FindBy(linkText = "Shopping cart")
	private WebElement shoppingcart;

	@FindBy(linkText = "Wishlist")
	private WebElement wishlist;

	@FindBy(linkText = "Facebook")
	private WebElement facebook;

	@FindBy(linkText = "Twitter")
	private WebElement twitter;

	@FindBy(linkText = "RSS")
	private WebElement rss;

	@FindBy(linkText = "YouTube")
	private WebElement youtube;

	@FindBy(linkText = "Google+")
	private WebElement google;

	@FindBy(linkText = "Tricentis")
	private WebElement tricentislink;

	@FindBy(id = "newsletter-email")
	private WebElement newsletteremaillink;

	@FindBy(id = "newsletter-subscribe-button")
	private WebElement newsletterbuttonlink;

	@FindBy(xpath = "//input[@value='Add to cart']")
	private WebElement addtocartlink;

	@FindBy(id = "add-to-wishlist-button-5")
	private WebElement addtowishlistbutton;

	@FindBy(xpath = "//input[@value='Add to compare list']")
	private WebElement comparelist;

	@FindBy(xpath = "//td[contains(@class,'remove-from-cart')]")
	private WebElement removefromcart;

	@FindBy(xpath = "//input[@value='Update shopping cart']")
	private WebElement updateshoppingcart;

	@FindBy(linkText = "Copy of Computing and Internet EX")
	private WebElement computingInternetlinkEX;

	@FindBy(id = "checkout")
	private WebElement Checkout;

	@FindBy(id = "termsofservice")
	private WebElement termofservice;

	@FindBy(id = "paymentmethod_0")
	private WebElement paymentmethod;

	public WebElement getPaymentmethod() {
		return paymentmethod;
	}

	@FindBy(xpath = "//input[contains(@name,'addtocart')]")
	private WebElement cartlink;

//		@FindBy(xpath = "//input[contains(@class,'button-2 wishlist-add-to-cart-button')]")
//		private WebElement whishlistaddtocart;

	public WebElement getAddtocartfromwishlist() {
		return addtocartfromwishlist;
	}

	@FindBy(xpath = "//td[@class='add-to-cart']/..//input[contains(@name,'addtocart')]")
	private WebElement addtocartfromwishlist;

	@FindBy(xpath = "//input[contains(@name,'addtocartbutton')]")
	private WebElement addtocartbuttonfromwishlist;

	public WebElement getAddtocartbuttonfromwishlist() {
		return addtocartbuttonfromwishlist;
	}

	public WebElement getCartlink() {
		return cartlink;
	}

	public WebElement getCheckout() {
		return Checkout;
	}

	public WebElement getTermofservice() {
		return termofservice;
	}

	public WebElement getComputingInternetlinkEX() {
		return computingInternetlinkEX;
	}

	public WebElement getUpdateshoppingcart() {
		return updateshoppingcart;
	}

	public WebElement getRemovefromcart() {
		return removefromcart;
	}

	public WebElement getComparelist() {
		return comparelist;
	}

	public WebElement getAddtowishlistbutton() {
		return addtowishlistbutton;
	}

	public WebElement getAddtocartlink() {
		return addtocartlink;
	}

	private void setAddtocartlink(WebElement addtocartlink) {
		this.addtocartlink = addtocartlink;
	}

	private WebElement getRegisterLink() {
		return registerLink;
	}

	public WebElement getLoginLink() {
		return loginLink;
	}

	private WebElement getShoppingCartLink() {
		return shoppingCartLink;
	}

	public WebElement getWishlistLink() {
		return wishlistLink;
	}

	private WebElement getSearchBox() {
		return searchBox;
	}

	private WebElement getSearchButton() {
		return searchButton;
	}

	public WebElement getBooks() {
		return books;
	}

	private WebElement getComputers() {
		return computers;
	}

	private WebElement getElectronics() {
		return electronics;
	}

	public WebElement getApparalesAndShoes() {
		return apparalesAndShoes;
	}

	private WebElement getDigitalDownloads() {
		return digitalDownloads;
	}

	private WebElement getJewelry() {
		return jewelry;
	}

	private WebElement getGiftCards() {
		return giftCards;
	}

	private WebElement getSitemap() {
		return sitemap;
	}

	private WebElement getPrivacynotice() {
		return privacynotice;
	}

	private WebElement getConditionsofuser() {
		return conditionsofuser;
	}

	private WebElement getAboutus() {
		return aboutus;
	}

	private WebElement getContactus() {
		return contactus;
	}

	private WebElement getSearch() {
		return search;
	}

	private WebElement getNews() {
		return news;
	}

	private WebElement getBlog() {
		return blog;
	}

	private WebElement getRecentlyviewedproducts() {
		return recentlyviewedproducts;
	}

	private WebElement getCompareproductlist() {
		return compareproductlist;
	}

	private WebElement getNewproduct() {
		return newproduct;
	}

	private WebElement getMyaccount() {
		return myaccount;
	}

	private WebElement getOrders() {
		return orders;
	}

	private WebElement getAddresses() {
		return addresses;
	}

	public WebElement getShoppingcart() {
		return shoppingcart;
	}

	public WebElement getWishlist() {
		return wishlist;
	}

	private WebElement getFacebook() {
		return facebook;
	}

	private WebElement getTwitter() {
		return twitter;
	}

	private WebElement getRss() {
		return rss;
	}

	private WebElement getYoutube() {
		return youtube;
	}

	private WebElement getGoogle() {
		return google;
	}

	private WebElement getTricentislink() {
		return tricentislink;
	}

	private WebElement getNewsletteremaillink() {
		return newsletteremaillink;
	}

	private WebElement getNewsletterbuttonlink() {
		return newsletterbuttonlink;
	}

}
