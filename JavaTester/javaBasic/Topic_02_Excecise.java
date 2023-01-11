package javaBasic;

import java.lang.reflect.Array;

import org.testng.annotations.Test;

public class Topic_02_Excecise {

	@Test
	public void TC_01() {
		int a = 6;
		int b = 2;
		
		System.out.println("Tổng: " + ( a + b ));
		System.out.println("Hiệu: " + ( a - b ));
		System.out.println("Tích: " + ( a * b ));
		System.out.println("Thương: " + ( a / b ));
		
	}
	
	@Test
	public void TC_02() {
		float width = 7.5f;
		float hight = 3.8f;
		System.out.println("S of rectangle: " + (width * hight));
	}
	
	@Test
	public void TC_03() {
		
		String name1 = "Hello";
		String name2 = "Automation Testing";
		System.out.println(name1 + " " + name2);
	}
}
