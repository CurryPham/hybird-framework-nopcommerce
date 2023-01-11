package javaBasic;

import java.util.Scanner;

public class Topic_01_Data_Type {
	
	static int studentNumber;
	static boolean statusValue;
	static final String BROWSER_Name = "Chorme"; // constant
	static int studentPrice;
	
	protected String studentName = "Automation FC";
	
	public static void main(String[] args) {
		int studentPrice = 5;
		
		System.out.println(studentPrice);
		 
		System.out.println(studentNumber);
		System.out.println(statusValue);
		System.out.println(Topic_01_Data_Type.BROWSER_Name);
		System.out.println(Topic_01_Data_Type.statusValue);
		System.out.println(Topic_01_Data_Type.studentPrice);
		
		Topic_01_Data_Type topic_1 = new Topic_01_Data_Type();
		Topic_01_Data_Type topic_2 = new Topic_01_Data_Type();
		Topic_01_Data_Type topic_3 = new Topic_01_Data_Type();
		 
		System.out.println(topic_1.studentName);
		//System.out.println(topic_1.BROWSER_Name); không nên dùng để gọi 1 constant
		System.out.println(topic_2.studentName);
		System.out.println(topic_3.studentName);
		
		// BROWSER_NAME = ""; Constant không cho phép gán vì nó là hằng số cố định không thay đỏi
		
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		System.out.println(name);
		System.out.println(name);	
		System.out.print(name);
		System.out.print(name);
	}
	
	// Getter: getCurrentUrl/ getTitle/ getText/ getAttribute/ getCccValue/ getSize/ getLocation/ getPoss
	public String getStudentName() {
		return this.studentName;
	}
	
	// Setter: click/ sendkey/ clear/ select/ back/ forward/ refesh/ get/ ...
	public void getStudentNumber(String stdName) {
		 this.studentName = stdName;
	}
}
