package javaOOP;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class Topic_06_This_Super extends BaseOOP {

	public Topic_06_This_Super() {

	}

	private WebDriver driver;
	private long longTimeout = 45;

	public void setImplicitWait() {
		driver.manage().timeouts().implicitlyWait(this.longTimeout, TimeUnit.MILLISECONDS);

		System.out.println(super.browserName);
	}

	public void clickToElement() {
		// ko dung super nó sẽ họi qua hàm ở class con (Hiện tại)
		setImplicitWait();

		// Gọ qua hàm ở lớp Cha
		super.setImplicitWait();
	}

	public static void main(String[] args) {
		Topic_06_This_Super topic = new Topic_06_This_Super();

	}

}
