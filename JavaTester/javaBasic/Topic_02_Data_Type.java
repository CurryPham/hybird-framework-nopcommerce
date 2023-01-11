package javaBasic;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Topic_02_Data_Type {
	
	// Primitive type / value type: nguyên thủy
	byte bNumber = 6;
	
	short sNumber = 1500;
	
	int iNumber = 65000;
	
	long lNumber = 65000;
	
	float fNumber = 15.98f;
	
	double dNumber = 15.98d;
	
	char cChar = '1';
	
	boolean bStatus = false;
	
	// Reference type: tham chiếu
	
	// String
	String address = "Ho Chi Minh";
	
	// Array (Phải cùng 1 kiểu dữ liệu trong 1 Array
	String[] studentAddress = { address, "Ha Noi", "Da Nang"};
	Integer[] studentNumber = { 15, 20, 50 }; 
	
	//Tupe (Mảng của ngôn ngữ JavaScript/TypeScript cho phép khai báo nhiều kiểu dữ liệu trong 1 mảng
	
	// Class
	Topic_02_Data_Type topic;
	
	// Interface
	WebDriver driver;
	
	// Object  
	Object aObject;
	
	// Collection
	List<WebElement> homePageLinks = driver.findElements(By.tagName("a"));
	Set<String> allWindows = driver.getWindowHandles();
	List<String> productName = new ArrayList<String>();
	
	public void clickToElement() {
		address.trim();
		
		studentAddress.clone();
		
		driver.getCurrentUrl();
		
		aObject.toString();
		
		homePageLinks.size();
		
		allWindows.clear();
	}

	public static void main(String[] args) {
		

	}

}
