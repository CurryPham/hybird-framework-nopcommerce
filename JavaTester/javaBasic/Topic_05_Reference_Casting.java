package javaBasic;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Topic_05_Reference_Casting {
	
	protected String studentName;
	
//	public String getStudentName() {
//		return studentName;
//	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName ;
	}
	
	public void showStudentNamt() {
		System.out.println("Student name = " + studentName);
	}

	@Test
	public static void main(String[] args) {
		Topic_05_Reference_Casting firstStudent = new Topic_05_Reference_Casting();
		
		Topic_05_Reference_Casting secondStudent = new Topic_05_Reference_Casting();
	
		firstStudent.setStudentName("Nguyen Van Nam");
		secondStudent.setStudentName("Nguyen Van Nam");
		
		firstStudent.showStudentNamt();
		secondStudent.showStudentNamt();
		
		//Ép kiểu
		firstStudent = secondStudent;
		
		firstStudent.showStudentNamt();
		secondStudent.showStudentNamt();
		
		secondStudent.setStudentName("Pham Dang Khoa");
		
		firstStudent.showStudentNamt();
		secondStudent.showStudentNamt();
		
		WebDriver driver = null;
		JavascriptExecutor jsExcutor = (JavascriptExecutor) driver;
	
	}

}
