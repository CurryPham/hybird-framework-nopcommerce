package pageObjects;

import org.openqa.selenium.WebDriver;
import commons.BasePage;
import pageUls.LoginPageUI;

public class LoginPageObject extends BasePage {
	WebDriver driver;

	public LoginPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public LoginPageObject clickToLoginLink() {
		waitForElementClickable(driver, LoginPageUI.LOGIN_LINK);
		clickToElement(driver, LoginPageUI.LOGIN_LINK);
		return new LoginPageObject(driver);
	}

	public String getIncorrectMessage() {
		waitForElementVisible(driver, LoginPageUI.INCORRECT_MESSAGE);
		return getElementText(driver, LoginPageUI.INCORRECT_MESSAGE);
	}

	public String getErrorMessage() {
		waitForElementVisible(driver, LoginPageUI.ERROR_MESSAGE);
		return getElementText(driver, LoginPageUI.ERROR_MESSAGE);
	}

	public void inputToEmailTextbox(String emailAdreess) {
		waitForElementVisible(driver, LoginPageUI.EMAIL_TEXTBOX);
		sendkeyToElement(driver, LoginPageUI.EMAIL_TEXTBOX, emailAdreess);

	}

	public HomePageObject clickToLoginButton() {
		waitForElementClickable(driver, LoginPageUI.LOGIN_BUTTON);
		clickToElement(driver, LoginPageUI.LOGIN_BUTTON);
		return new HomePageObject(driver);

	}

	public void inputToPasswordTextbox(String passWord) {
		waitForElementVisible(driver, LoginPageUI.PASSWORD_TEXTBOX);
		sendkeyToElement(driver, LoginPageUI.PASSWORD_TEXTBOX, passWord);

	}

}
