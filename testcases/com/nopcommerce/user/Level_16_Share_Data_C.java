package com.nopcommerce.user;

import org.testng.annotations.Test;

import com.nopcommerce.common.Common_01_Register;
import com.nopcommerce.common.Common_01_Register_Cookie;

import commons.BasePage;
import commons.BaseTest;
import commons.PageGeneratorManager;
import pageObjects.user.nopCommerce.UserCustomerInforPageObject;
import pageObjects.user.nopCommerce.UserHomePageObject;
import pageObjects.user.nopCommerce.UserLoginPageObject;
import pageObjects.user.nopCommerce.UserRegisterPageObject;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Level_16_Share_Data_C extends BaseTest {

	@Parameters("browser")
	@BeforeClass
	public void beforeClass(String browserName) {
		driver = getBrowserDriver(browserName);
		homePage = PageGeneratorManager.getUserHomePage(driver);

		emailAddress = Common_01_Register.emailAddress;
		password = Common_01_Register.password;

		log.info("Pre_Condition  - Step 01: Navigate to 'Home page'");
		loginPage = homePage.openLoginPage();

		log.info("Pre_Condition - Step 02: Set Cookie and reload Page");
		loginPage.setCookies(driver, Common_01_Register_Cookie.loggedCookies);
		loginPage.refeshToPage(driver);

		log.info("Pre_Condition - Step 03: Verify login success mesage is displayed");
		verifyEquals(homePage.getSuccessLogin(), "My account");
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
