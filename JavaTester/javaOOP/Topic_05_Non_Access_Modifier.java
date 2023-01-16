package javaOOP;

public final class Topic_05_Non_Access_Modifier {
	// Static: Variable/ Method
	// Dung cho tất cả các instance/object
	// Phạm vi cho toàn bộ system sử dụng nó
	// Có thể override được
	static String browserName = "Chrome";

	// Non static
	String severName = "Testing";

	// Hằng số
	final String colorCar = "Red";

	public static void main(String[] args) {

	}

	// Non static
	public void clickToElement(String elementName) {
		System.out.println(elementName);
	}

	// Static
	public static void sendkeyToElement(String element) {

	}

	// Final
	public final void setCarName() {

	}
}
