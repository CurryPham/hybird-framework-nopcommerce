package com.nopcommerce.user;

import org.testng.annotations.Test;
import commons.BaseTest;
import commons.PageGeneratorManager;
import pageObjects.user.nopCommerce.UserCustomerInforPageObject;
import pageObjects.user.nopCommerce.UserHomePageObject;
import pageObjects.user.nopCommerce.UserLoginPageObject;
import pageObjects.user.nopCommerce.UserRegisterPageObject;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class Level_16_Share_Data_B extends BaseTest {

	@Parameters("browser")
	@BeforeClass
	public void beforeClass(String browserName) {
		driver = getBrowserDriver(browserName);
		homePage = PageGeneratorManager.getUserHomePage(driver);

		log.info("Pre-Condition - Step 01: Navigate to 'Register page'");
		registerPage = homePage.clickToRegister();

		log.info("Pre-Condition - Step 02: Enter to First Name textbox with value is '" + firstName + "'");
		registerPage.inputToFirstnameTextBox(firstName);

		log.info("Pre-Condition - Step 03: Enter to Last name textbox with value is '" + lastName + "'");
		registerPage.inputToLastnameTextBox(lastName);

		log.info("Pre-Condition - Step 04: Enter to Email Address textbox with value is '" + emailAddress + "'");
		registerPage.inputToEmailTextBox(emailAddress);

		log.info("Pre-Condition - Step 05: Enter to Password textbox with value is '" + password + "'");
		registerPage.inputToPasswordTextBox(password);

		log.info("Pre-Condition - Step 06: Enter to Confirm Password textbox with value is '" + password + "'");
		registerPage.inputToConfirmPasswordTextBox(password);

		log.info("Pre-Condition - Step 07: Click to Register button");
		homePage = registerPage.clickToRegisterButton();

		log.info("Pre-Condition - Step 08: Verify register success mesage is displayed");
		verifyEquals(registerPage.getRegisterSuccessMessage(), "Your registration completed");

		log.info("Pre-Condition - Step 09: Navigate to 'Home page'");
		loginPage = homePage.openLoginPage();

		log.info("Pre-Condition - Step 10: Click to Login button");
		homePage = loginPage.clickToLoginButton();

		log.info("Pre-Condition - Step 12: Enter to  Email Address textbox with value is '" + emailAddress + "'");
		loginPage.inputToEmailTextbox(emailAddress);

		log.info("Pre-Condition - Step 13: Enter to Password textbox with value is '" + password + "'");
		loginPage.inputToPasswordTextbox(password);
	}

	@Test
	public void Search_01_Empty_Data() {

	}

	@Test
	public void Search_02_Relative_Product_Name() {

	}

	@Test
	public void Search_03_Absolute_Product_Name() {

	}

	@Test
	public void Search_04_Parent_Category() {

	}

	@Test
	public void Search_05_Incorrect_Manufactorer() {

	}

	@Test
	public void Search_06_Correct_Manufatorer() {

	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

	private WebDriver driver;
	private String firstName, lastName, password, emailAddress;
	private UserHomePageObject homePage;
	UserRegisterPageObject registerPage;
	UserLoginPageObject loginPage;
	UserCustomerInforPageObject customerInforPage;

}
