package javaBasic;

import org.testng.annotations.Test;

public class Topic_04_Excecise {
	@Test
	public void TC_01() {
		
		String name = "Curry";
		int age = 15;
		
		System.out.println("Ater 15 years, age of " + name + " will be " + ( age +=15 ));
	}
	
	@Test
	public void TC_02() {
		int a = 5;
		int b = 6;
		
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println(a);
		System.out.println(b);
	}
	
	@Test
	public void TC_04() {
		int a = 4;
		int b = 5;
		boolean status = (a > b) ? true : false;
		System.out.println(status);
		
		if (a>b) {
			System.out.println("true");
		} else{
			System.out.println("false");
		}
	}
}
