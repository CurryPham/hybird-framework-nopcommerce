package javaBasic;

import java.util.Locale;

import com.github.javafaker.Faker;

public class Topic_06_Faker {

	public static void main(String[] args) {
		Faker faker = new Faker();
		System.out.println(faker.address().firstName());
		System.out.println(faker.address().lastName());
		System.out.println(faker.address().lastName());
		System.out.println(faker.address().lastName());
		System.out.println(faker.address().lastName());
	}
}
