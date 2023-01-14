package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUls.HomePageUI;

public class HomePageObject extends BasePage {
	private WebDriver driver;

	public HomePageObject(WebDriver driver) {
		this.driver = driver;
	}

	public RegisterPageObject clickToRegisterLink() {
		waitForElementClickable(driver, HomePageUI.REGISTER_LINK);
		clickToElement(driver, HomePageUI.REGISTER_LINK);
		return PageGeneratorManager.getRegisterPage(driver);
	}

	public String getSuccessLogin() {
		waitForElementVisible(driver, HomePageUI.MY_ACCOUNT_LINK);
		return getElementText(driver, HomePageUI.MY_ACCOUNT_LINK);
	}

	public LoginPageObject clickToLoginLink() {
		clickToElement(driver, HomePageUI.LOGIN_LINK);
		return PageGeneratorManager.getLoginPage(driver);
	}

	public CustomerInforPageObject clickToCustomerInforLink() {
		clickToElement(driver, HomePageUI.MY_ACCOUNT_LINK);
		return PageGeneratorManager.getCustomerInforPageLink(driver);
	}

}
