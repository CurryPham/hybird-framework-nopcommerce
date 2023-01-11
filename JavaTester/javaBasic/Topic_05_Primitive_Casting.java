package javaBasic;

import org.testng.annotations.Test;

public class Topic_05_Primitive_Casting {

	@Test
	public static void main(String[] args) {
		// Ngầm định = ko mất dữ liệu
		//		byte bNumber = 126;
		//		System.out.println(bNumber);
		//		
		//		short sNumber = bNumber;
		//		System.out.println(sNumber);
		//		
		//		int iNumber = sNumber;
		//		System.out.println(iNumber);
		//		
		//		long lNumber = iNumber;
		//		System.out.println(lNumber);
		//		
		//		float fNumber = lNumber;
		//		System.out.println(fNumber);
		//		
		//		double dNumber = fNumber;
		//		System.out.println(dNumber);
		
		//Tường minh (Cast)
		
		double dNumber = 3563464644242426464666d;
		System.out.println(dNumber);
		
		float fNumber = (float) dNumber;
		System.out.println(fNumber);
		
		long lNumber = (long) fNumber;
		System.out.println(lNumber);
		
		int iNumber = (int) lNumber;
		System.out.println(iNumber);

	}

}
