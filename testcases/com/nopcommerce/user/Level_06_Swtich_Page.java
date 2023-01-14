package com.nopcommerce.user;

import org.testng.annotations.Test;

import commons.BasePage;
import commons.BaseTest;
import pageObjects.AddressPageObject;
import pageObjects.CustomerInforPageObject;
import pageObjects.HomePageObject;
import pageObjects.LoginPageObject;
import pageObjects.MyProductReviewPageObject;
import pageObjects.PageGeneratorManager;
import pageObjects.RegisterPageObject;
import pageObjects.RewardPointPageObject;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Level_06_Swtich_Page extends BaseTest {

	@Parameters("browser")
	@BeforeClass
	public void beforeClass(String browserName) {

		driver = getBrowserDriver(browserName);

		firstName = "curry";
		lastName = "pham";
		emailAddress = "curry" + generateFakeNumber() + "@gmail.com";
		password = "123456";

		homePage = PageGeneratorManager.getHomePage(driver);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com");

		System.out.println("Pre_Conditon - Step 01: Click to Register link");
		registerPage = homePage.clickToRegisterLink();

		System.out.println("Pre_Conditon - Step 02: Input to required fields");
		registerPage.inputToFirstnameTextBox(firstName);
		registerPage.inputToLastnameTextBox(lastName);
		registerPage.inputToEmailTextBox(emailAddress);
		registerPage.inputToPasswordTextBox(password);
		registerPage.inputToConfirmPasswordTextBox(password);

		System.out.println("Pre_Conditon - Step 03: Click to Register button");
		homePage = registerPage.clickToRegisterButton();

		System.out.println("Pre_Conditon - Step 04: Verify success message displayed");
		Assert.assertEquals(registerPage.getRegisterSuccessMessage(), "Your registration completed");
	}

	@Test
	public void User_01_With_Email_Register_And_Correct_Password() {
		System.out.println("User_01 - Step 1: Click to Login link");
		loginPage = homePage.clickToLoginLink();

		System.out.println("User_01 - Step 2: Input Email");
		loginPage.inputToEmailTextbox(emailAddress);

		System.out.println("User_01 - Step 3: Input Password");
		loginPage.inputToPasswordTextbox(password);

		System.out.println("User_01 - Step 4: Click to Login button");
		homePage = loginPage.clickToLoginButton();

		System.out.println("User_01 - Step 5: Verify error wrong Password message");
		Assert.assertEquals(homePage.getSuccessLogin(), "My account");

		System.out.println("User_01 - Step 6: Click to Login button");
		customerInforPage = homePage.clickToCustomerInforLink();
	}

	@Test
	public void User_02_Switch_Page() {

		addressPage = customerInforPage.openAddressPage(driver);

		myProductReviewPage = addressPage.openMyProductReviewPage(driver);

		rewardPointPage = myProductReviewPage.openRewardPointPage(driver);

		addressPage = rewardPointPage.openAddressPage(driver);

		myProductReviewPage = rewardPointPage.openMyProductReviewPage(driver);

		addressPage = myProductReviewPage.openAddressPage(driver);

	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

	private WebDriver driver;
	private String firstName, lastName, password, emailAddress;
	private HomePageObject homePage;
	private RegisterPageObject registerPage;
	private LoginPageObject loginPage;
	private CustomerInforPageObject customerInforPage;
	private AddressPageObject addressPage;
	private MyProductReviewPageObject myProductReviewPage;
	private RewardPointPageObject rewardPointPage;

}
