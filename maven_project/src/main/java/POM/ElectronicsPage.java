package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElectronicsPage{
	public ElectronicsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(partialLinkText="ELECTRONICS")
		private WebElement ElectonicsLink;
		

	@FindBy(partialLinkText="Cell phones")
	private WebElement CellPhone;
	
	@FindBy(linkText="Phone Cover")
	private WebElement PhoneCover;
	
	@FindBy(xpath="//select[@id='product_attribute_80_2_37']")
	private WebElement ManufactureDropDown;
	
	@FindBy(xpath="//select[@id='product_attribute_80_1_38']")
	private WebElement ColorDropDown;
	
	@FindBy(xpath="(//input[@value=\"Add to cart\"])[1]")
	private WebElement AddToCart;

	public WebElement getElectonicsLink() {
		return ElectonicsLink;
	}

	public WebElement getCellPhone() {
		return CellPhone;
	}

	public WebElement getPhoneCover() {
		return PhoneCover;
	}

	public WebElement getManufactureDropDown() {
		return ManufactureDropDown;
	}

	public WebElement getColorDropDown() {
		return ColorDropDown;
	}

	public WebElement getAddToCart() {
		return AddToCart;
	}
	

}