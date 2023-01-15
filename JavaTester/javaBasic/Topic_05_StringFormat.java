package javaBasic;

public class Topic_05_StringFormat {

	public static final String ADDRESS_LINK = "xpath=//div[@class='listbox']//a[text()='Addresses']";
	public static final String CUSTOMER_INFOR_LINK = "xpath=//div[@class='listbox']//a[text()='Customer info']";
	public static final String REWARD_POINT_LINK = "xpath=//div[@class='listbox']//a[text()='Reward points']";
	public static final String MY_PRODUCT_REVIEW_LINK = "xpath=//div[@class='listbox']//a[text()='My product reviews']";
	public static final String DYNAMIC_SIBEBAR_BY_PAGE_NAME = "xpath=//div[@class='listbox']//a[text()='%s']";
	public static final String DYNAMIC_BY_PAGE_NAME = "xpath=//div[@class='%s']//a[text()='%s']";

	public static void main(String[] args) {
		// clickToSideBarLink(ADDRESS_LINK);
		// clickToSideBarLink(CUSTOMER_INFOR_LINK);
		// clickToSideBarLink(REWARD_POINT_LINK);
		// clickToSideBarLink(MY_PRODUCT_REVIEW_LINK);
		//
		// clickToSideBarLink(ADDRESS_LINK, "Addresses");
		// clickToSideBarLink(CUSTOMER_INFOR_LINK, "Customer info'");
		// clickToSideBarLink(REWARD_POINT_LINK, "Reward points");
		// clickToSideBarLink(MY_PRODUCT_REVIEW_LINK, "My product reviews");
		//
		// clickToSideBarLink(ADDRESS_LINK, "listbox", "Addresses");
		// clickToSideBarLink(CUSTOMER_INFOR_LINK, "listbox", "Customer info");
		// clickToSideBarLink(REWARD_POINT_LINK, "listbox", "Reward points");
		// clickToSideBarLink(MY_PRODUCT_REVIEW_LINK, "listbox", "My product reviews");

		clickToSideBarLink(ADDRESS_LINK, "listbox", "Addresses");
		clickToSideBarLink(CUSTOMER_INFOR_LINK, "listbox", "Customer info");
		clickToSideBarLink(REWARD_POINT_LINK, "listbox", "Reward points");
		clickToSideBarLink(MY_PRODUCT_REVIEW_LINK, "listbox", "My product reviews");

	}

	public static void clickToSideBarLink(String locator) {
		System.out.println("Click to: " + locator);
	}

	public static void clickToSideBarLink(String dynamicLocator, String pageName) {
		String locator = String.format(dynamicLocator, pageName);
		System.out.println("Click to: " + locator);
	}

	public static void clickToSideBarLink(String dynamicLocator, String navName, String pageName) {
		String locator = String.format(dynamicLocator, navName, pageName);
		System.out.println("Click to: " + locator);
	}

	public static void clickToSideBarLink(String dynamicLocator, String... params) {
		String locator = String.format(dynamicLocator, (Object[]) params);
		System.out.println("Click to: " + locator);
	}
}
