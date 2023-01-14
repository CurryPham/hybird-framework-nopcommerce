package pageObjects;

import org.openqa.selenium.WebDriver;
import commons.BasePage;
import pageUls.LoginPageUI;

public class LoginPageObject extends BasePage {
	WebDriver driver;

	public LoginPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void clickToLoginLink() {
		waitForElementClickable(driver, LoginPageUI.LOGIN_LINK);
		clickToElement(driver, LoginPageUI.LOGIN_LINK);
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

	public void clickToLoginButton() {
		waitForElementClickable(driver, LoginPageUI.LOGIN_BUTTON);
		clickToElement(driver, LoginPageUI.LOGIN_BUTTON);

	}

	public void inputToPasswordTextbox(String passWord) {
		waitForElementVisible(driver, LoginPageUI.PASSWORD_TEXTBOX);
		sendkeyToElement(driver, LoginPageUI.PASSWORD_TEXTBOX, passWord);

	}

}
