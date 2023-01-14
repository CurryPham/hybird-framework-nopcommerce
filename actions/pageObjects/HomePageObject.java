package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUls.HomePageUI;

public class HomePageObject extends BasePage {
	private WebDriver driver;

	public HomePageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void clickToRegisterLink() {
		waitForElementClickable(driver, HomePageUI.REGISTER_LINK);
		clickToElement(driver, HomePageUI.REGISTER_LINK);
	}

	public String getSuccessLogin() {
		waitForElementVisible(driver, HomePageUI.MY_ACCOUNT_LINK);
		return getElementText(driver, HomePageUI.MY_ACCOUNT_LINK);
	}

	public void clickToLoginLink() {
		clickToElement(driver, HomePageUI.LOGIN_LINK);

	}

}
