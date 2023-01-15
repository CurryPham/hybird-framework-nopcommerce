package javaOOP;

public class Topic_03_Method {

	public void showCarName() {
		System.out.println("Toyota");
	}

	static void showCarColor() {
		System.out.println("red");
	}

	public static void main(String[] args) {
		showCarColor();
		Topic_03_Method obj = new Topic_03_Method();
		obj.showCarName();
	}
}
