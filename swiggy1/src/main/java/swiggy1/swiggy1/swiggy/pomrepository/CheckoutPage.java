package swiggy1.swiggy1.swiggy.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage  {
		WebDriver driver;

		public CheckoutPage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(xpath = "//span[text()='Secure Checkout']")
		private WebElement checkout;

		public WebElement getCheckout() {
			return checkout;
		}

}
