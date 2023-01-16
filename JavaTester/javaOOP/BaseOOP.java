package javaOOP;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class BaseOOP extends BrowserName {

	WebDriver driver;
	private long longTimeout = 45;

	public void setImplicitWait() {
		driver.manage().timeouts().implicitlyWait(this.longTimeout, TimeUnit.MILLISECONDS);

		System.out.println(super.browserName);
	}
}
