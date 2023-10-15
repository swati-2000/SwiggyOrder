package test.java.com.trello.qspiders.endtoend;

import org.testng.Reporter;
import org.testng.annotations.Test;

import swiggy1.swiggy1.swiggy.genericutility.BaseClass;
import swiggy1.swiggy1.swiggy.pomrepository.CheckoutPage;
import swiggy1.swiggy1.swiggy.pomrepository.SwiggyLoginPage;
import swiggy1.swiggy1.swiggy.pomrepository.SwiggyProductPage;

public class SwiggyOrder extends BaseClass{
	@Test
	public void orderBiryani() throws Throwable {
		webdriverUtils.implicitWait(driver);
		SwiggyLoginPage login=new SwiggyLoginPage(driver);
		login.getSearchLocation().sendKeys("Btm");
		login.getLocationClick().click();
		SwiggyProductPage product=new SwiggyProductPage(driver);
		product.getSearchItemButton().click();
		product.getSearchItem().sendKeys("Biryani");
		product.getSearchInputBox().click();
		product.getAddButton().click();
		product.getCart().click();
		CheckoutPage checkout=new CheckoutPage(driver);
		String checkoutText = checkout.getCheckout().getText();
		Reporter.log(checkoutText); 
	}
}
