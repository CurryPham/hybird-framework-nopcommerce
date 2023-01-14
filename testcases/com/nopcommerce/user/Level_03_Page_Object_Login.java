package com.nopcommerce.user;

import org.testng.annotations.Test;

import commons.BasePage;
import pageObjects.HomePageObject;
import pageObjects.LoginPageObject;
import pageObjects.RegisterPageObject;

import org.testng.annotations.BeforeClass;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Level_03_Page_Object_Login extends BasePage {

	private WebDriver driver;
	private String firstName, lastName, password, emailAddress;
	private HomePageObject homePage;
	private RegisterPageObject registerPage;
	private LoginPageObject loginPage;
	private String projectPath = System.getProperty("user.dir");

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.gecko.driver", projectPath + "\\browserDrivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		firstName = "curry";
		lastName = "pham";
		emailAddress = "curry" + generateFakeNumber() + "@gmail.com";
		password = "123456";

		homePage = new HomePageObject(driver);
		registerPage = new RegisterPageObject(driver);
		loginPage = new LoginPageObject(driver);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com");

		System.out.println("Pre_Conditon - Step 01: Click to Register link");
		homePage.clickToRegisterLink();

		System.out.println("Pre_Conditon - Step 02: Input to required fields");
		registerPage.inputToFirstnameTextBox(firstName);
		registerPage.inputToLastnameTextBox(lastName);
		registerPage.inputToEmailTextBox(emailAddress);
		registerPage.inputToPasswordTextBox(password);
		registerPage.inputToConfirmPasswordTextBox(password);

		System.out.println("Pre_Conditon - Step 03: Click to Register button");
		registerPage.clickToRegisterButton();

		System.out.println("Pre_Conditon - Step 04: Verify success message displayed");
		Assert.assertEquals(registerPage.getRegisterSuccessMessage(), "Your registration completed");
	}

	@Test
	public void Login_01_With_Empty_Data() {
		System.out.println("Login_01 - Step 1: Click to Login link");
		homePage.clickToLoginLink();

		System.out.println("Login_01 - Step 2: Click to Login button");
		loginPage.clickToLoginButton();

		System.out.println("Login_01 - Step 3: Verify error Email message");
		Assert.assertEquals(loginPage.getErrorMessage(), "Please enter your email");
	}

	@Test
	public void Login_02_With_Invalid_Email() {
		System.out.println("Login_02 - Step 1: Click to Login link");
		loginPage.clickToLoginLink();

		System.out.println("Login_02 - Step 2: Input invalid Email");
		loginPage.inputToEmailTextbox("fewfwfwfwf");

		System.out.println("Login_02 - Step 3: Click to Login button");
		loginPage.clickToLoginButton();

		System.out.println("Login_02 - Step 4: Verify invalid Email  message");
		Assert.assertEquals(loginPage.getErrorMessage(), "Wrong email");
	}

	@Test
	public void Login_03_With_Email_Not_Register() {
		System.out.println("Login_03 - Step 1: Click to Login link");
		loginPage.clickToLoginLink();

		System.out.println("Login_03 - Step 2: Input  non register Email");
		loginPage.inputToEmailTextbox(emailAddress);

		System.out.println("Login_03 - Step 3: Click to Login button");
		loginPage.clickToLoginButton();

		System.out.println("Login_03 - Step 4: Verify invalid Email  message");
		Assert.assertEquals(loginPage.getIncorrectMessage(), "Login was unsuccessful. Please correct the errors and try again.\nThe credentials provided are incorrect");
	}

	@Test
	public void Login_04_With_Email_Register_And_Not_Enter_Password() {
		System.out.println("Login_04 - Step 1: Click to Login link");
		loginPage.clickToLoginLink();

		System.out.println("Login_04 - Step 2: Input Email");
		loginPage.inputToEmailTextbox(emailAddress);

		System.out.println("Login_04 - Step 3: Click to Login button");
		loginPage.clickToLoginButton();

		System.out.println("Login_04 - Step 4: Verify error blank Password message");
		Assert.assertEquals(loginPage.getIncorrectMessage(), "Login was unsuccessful. Please correct the errors and try again.\nThe credentials provided are incorrect");
	}

	@Test
	public void Login_05_With_Email_Register_And_Wrong_Password() {
		System.out.println("Login_05 - Step 1: Click to Login link");
		loginPage.clickToLoginLink();

		System.out.println("Login_05 - Step 2: Input Email");
		loginPage.inputToEmailTextbox(emailAddress);

		System.out.println("Login_05 - Step 3: Input wrong Password");
		loginPage.inputToPasswordTextbox("123");

		System.out.println("Login_05 - Step 4: Click to Login button");
		loginPage.clickToLoginButton();

		System.out.println("Login_05 - Step 5: Verify error wrong Password message");
		Assert.assertEquals(loginPage.getIncorrectMessage(), "Login was unsuccessful. Please correct the errors and try again.\nThe credentials provided are incorrect");
	}

	@Test
	public void Login_06_With_Email_Register_And_Correct_Password() {
		System.out.println("Login_06 - Step 1: Click to Login link");
		loginPage.clickToLoginLink();

		System.out.println("Login_06 - Step 2: Input Email");
		loginPage.inputToEmailTextbox(emailAddress);

		System.out.println("Login_06 - Step 3: Input Password");
		loginPage.inputToPasswordTextbox(password);

		System.out.println("Login_06 - Step 4: Click to Login button");
		loginPage.clickToLoginButton();

		System.out.println("Login_06 - Step 5: Verify error wrong Password message");
		Assert.assertEquals(homePage.getSuccessLogin(), "My account");

	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

	public int generateFakeNumber() {
		Random rand = new Random();
		return rand.nextInt(9999);
	}

}