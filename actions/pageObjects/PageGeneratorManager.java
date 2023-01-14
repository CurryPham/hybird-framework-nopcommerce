package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageGeneratorManager {

	public static HomePageObject getHomePage(WebDriver driver) {
		return new HomePageObject(driver);
	}

	public static LoginPageObject getLoginPage(WebDriver driver) {
		return new LoginPageObject(driver);
	}

	public static RegisterPageObject getRegisterPage(WebDriver driver) {
		return new RegisterPageObject(driver);
	}

	public static CustomerInforPageObject getCustomerInforPageLink(WebDriver driver) {
		return new CustomerInforPageObject(driver);
	}

	public static AddressPageObject getAddressPageLink(WebDriver driver) {
		return new AddressPageObject(driver);
	}

	public static RewardPointPageObject getRewaidPointPageLink(WebDriver driver) {
		return new RewardPointPageObject(driver);
	}

	public static MyProductReviewPageObject getMyProductReviewLink(WebDriver driver) {
		return new MyProductReviewPageObject(driver);
	}
}
