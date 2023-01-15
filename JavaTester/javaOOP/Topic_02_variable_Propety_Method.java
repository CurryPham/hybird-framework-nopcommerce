package javaOOP;

public class Topic_02_variable_Propety_Method {
	private Float knowledgePoints;
	private Float practicePoints;

	public Topic_02_variable_Propety_Method() {
		int number = 10; // biến cục bộ Constructor
	}

	// Access Modifier
	// Data Type
	// Variable name
	// Variable value
	private String studentName = "curry"; // Biến toàn cục (Global variable)

	// Static variable: dung và gán lại được
	public static String studentAddress = "Sai gon";

	// Dùng trong phạm vi Class này ( cho tất cả instance/object dùng
	private static String studenPhone = "124214214";

	// Final variable: ko cho phép gán lại/ ko override lại
	// Cố định dữ liệu ko được phép thay đổi trong quá trinh chạy
	final String country = "Viet Nam";

	// Static final variable: hằng sos (Constant)
	// Nó ko được ghi đè
	// Có thể truy cập rộng rãi cho tất cả các instance/thread
	static final float PI_NUMBER = 3.144214f;

	// Access modifier: default
	int studentID = 176363;

	// Hmaf (method) - static
	public static void main(String[] args) {
		// Local variable - biến cục bộ: hàm
		String studentName = "curry";

		if (studentName.startsWith("c")) {
			// Local variable - biến cục bộ: block code
			int number = 10;
		}
	}
}
