package commons;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.Reporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	private String projectPath = GlobalConstants.PROJECT_PATH;
	private WebDriver driver;

	protected WebDriver getBrowserDriver(String browserName) {
		BrowserList browserList = BrowserList.valueOf(browserName.toUpperCase());
		if (browserList == BrowserList.FIREFOX) {
			// WebDriverManager.firefoxdriver().driverVersion("").setup();
			System.setProperty("webdriver.gecko.driver", projectPath + "\\browserDrivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browserList == BrowserList.HEAD_FIREFOX) {
			WebDriverManager.chromedriver().setup();
			FirefoxOptions options = new FirefoxOptions();
			options.addArguments("--headless");
			options.addArguments("window-size=1920x1080");
			driver = new FirefoxDriver(options);
		} else if (browserList == BrowserList.CHROME) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserList == BrowserList.HEAD_CHOME) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--headless");
			options.addArguments("window-size=1920x1080");
			driver = new ChromeDriver(options);
		} else if (browserList == BrowserList.EDGE) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else {
			throw new RuntimeException("Please Import Browser Driver");
		}

		this.driver.manage().timeouts().implicitlyWait(GlobalConstants.LONG_TIMEOUT, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
		driver.get(GlobalConstants.USER_PAGE_URL);
		return this.driver;
	}

	protected WebDriver getBrowserDriver(String browserName, String appUrl) {
		BrowserList browserList = BrowserList.valueOf(browserName.toUpperCase());
		if (browserList == BrowserList.FIREFOX) {
			// WebDriverManager.firefoxdriver().driverVersion("").setup();
			System.setProperty("webdriver.gecko.driver", projectPath + "\\browserDrivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browserList == BrowserList.HEAD_FIREFOX) {
			WebDriverManager.chromedriver().setup();
			FirefoxOptions options = new FirefoxOptions();
			options.addArguments("--headless");
			options.addArguments("window-size=1920x1080");
			driver = new FirefoxDriver(options);
		} else if (browserList == BrowserList.CHROME) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserList == BrowserList.HEAD_CHOME) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--headless");
			options.addArguments("window-size=1920x1080");
			driver = new ChromeDriver(options);
		} else if (browserList == BrowserList.EDGE) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else {
			throw new RuntimeException("Please Import Browser Driver");
		}

		this.driver.manage().timeouts().implicitlyWait(GlobalConstants.LONG_TIMEOUT, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
		driver.get(appUrl);
		return this.driver;
	}

	protected String getEnviromentUrl(String enviromentName) {
		String url = null;
		switch (enviromentName) {
		case "DEV":
			url = GlobalConstants.USER_PAGE_URL;
			break;
		case "TEST":
			url = GlobalConstants.ADMIN_PAGE_URL;
			break;
		}
		return url;
	}

	private String getEnviromentValue(String severName) {
		String envUrl = null;
		EnviromentList enviroment = EnviromentList.valueOf(severName.toUpperCase());
		if (enviroment == EnviromentList.DEV) {
			envUrl = "https://demo.nopcommerce.com/";
		} else if (enviroment == EnviromentList.TESTING) {
			envUrl = "https://admin-demo.nopcommerce.com";

		} else if (enviroment == EnviromentList.STAGING) {
			envUrl = "https://staging..nopcommerce.com";

		} else if (enviroment == EnviromentList.PRODUCTION) {
			envUrl = "https://production.nopcommerce.com";
		}
		return envUrl;
	}

	public void sleepInSecond(long timeinsecond) {
		try {
			Thread.sleep(timeinsecond * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	protected int generateFakeNumber() {
		Random rand = new Random();
		return rand.nextInt(9999);
	}

	protected boolean verifyTrue(boolean condition) {
		boolean pass = true;
		try {
			if (condition == true) {
				System.out.println(" -------------------------- PASSED -------------------------- ");
			} else {
				System.out.println(" -------------------------- FAILED -------------------------- ");
			}
			Assert.assertTrue(condition);
		} catch (Throwable e) {
			pass = false;

			// Add lỗi vào ReportNG
			VerificationFailures.getFailures().addFailureForTest(Reporter.getCurrentTestResult(), e);
			Reporter.getCurrentTestResult().setThrowable(e);
		}
		return pass;
	}

	protected boolean verifyFalse(boolean condition) {
		boolean pass = true;
		try {
			if (condition == false) {
				System.out.println(" -------------------------- PASSED -------------------------- ");
			} else {
				System.out.println(" -------------------------- FAILED -------------------------- ");
			}
			Assert.assertFalse(condition);
		} catch (Throwable e) {
			pass = false;
			VerificationFailures.getFailures().addFailureForTest(Reporter.getCurrentTestResult(), e);
			Reporter.getCurrentTestResult().setThrowable(e);
		}
		return pass;
	}

	protected boolean verifyEquals(Object actual, Object expected) {
		boolean pass = true;
		try {
			Assert.assertEquals(actual, expected);
			System.out.println(" -------------------------- PASSED -------------------------- ");
		} catch (Throwable e) {
			pass = false;
			System.out.println(" -------------------------- FAILED -------------------------- ");
			VerificationFailures.getFailures().addFailureForTest(Reporter.getCurrentTestResult(), e);
			Reporter.getCurrentTestResult().setThrowable(e);
		}
		return pass;
	}
}
