package com.jquery.database;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest;
import pageObjects.jQuery.HomePageObject;
import pageObjects.jQuery.PageGeneratorManager;

public class Level_10_DataTable_DataGrid extends BaseTest {
	private WebDriver driver;
	HomePageObject homePage;
	List<String> actualAllCountryValues;
	List<String> expectedAllCountryValues;

	@Parameters({ "browser", "url" })
	@BeforeClass
	public void beforeClass(String browserName, String appUrl) {
		driver = getBrowserDriver(browserName, appUrl);
		homePage = PageGeneratorManager.geHomePageObject(driver);
	}

	@Test
	public void Table_01_Paging() {

		homePage.openPagingPageNumber("5");
		Assert.assertTrue(homePage.isNumberActived("5"));

		homePage.openPagingPageNumber("7");
		Assert.assertTrue(homePage.isNumberActived("7"));

		homePage.openPagingPageNumber("9");
		Assert.assertTrue(homePage.isNumberActived("9"));

		homePage.openPagingPageNumber("11");
		Assert.assertTrue(homePage.isNumberActived("11"));

		homePage.openPagingPageNumber("14");
		Assert.assertTrue(homePage.isNumberActived("14"));

	}

	@Test
	public void Table_02_Enter_To_Header() {
		homePage.refeshToPage(driver);

		homePage.enterToHEaderTextboxByLabel("Country", "Argentina");

		homePage.enterToHEaderTextboxByLabel("Females", "338282");

		homePage.enterToHEaderTextboxByLabel("Males", "349238");

		homePage.enterToHEaderTextboxByLabel("Total", "687522");
	}

	@Test
	public void Table_03_Enter_To_Header() {

		actualAllCountryValues = homePage.getValueEachRowAtAllPage();
		Assert.assertEquals(actualAllCountryValues, false);
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}
}
