package javaOOP;

public class Topic_01_Class_Object_Student {
	private int studentID;
	private String studentName;
	private Float knowledgePoints;
	private Float practicePoints;

	private int getStudentID() {
		return studentID;
	}

	private void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	private String getStudentName() {
		return studentName;
	}

	private void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	private Float getKnowledgePoints() {
		return knowledgePoints;
	}

	private void setKnowledgePoints(Float knowledgePoints) {
		this.knowledgePoints = knowledgePoints;
	}

	private Float getPracticePoints() {
		return practicePoints;
	}

	private void setPracticePoints(Float practicePoints) {
		this.practicePoints = practicePoints;
	}

	private Float getAvaragePoint() {
		return (this.knowledgePoints + this.practicePoints * 2) / 3;
	}

	protected void showStudentInfo() {
		System.out.println("Studen ID: " + getStudentID());
		System.out.println("Studen name: " + getStudentName());
		System.out.println("Knowledge points: " + getKnowledgePoints());
		System.out.println("Practice points: " + getPracticePoints());
		System.out.println("Average point: " + getAvaragePoint());
		System.out.println("-----------------------------------------------------------------");
	}

	public static void main(String[] args) {
		Topic_01_Class_Object_Student studentNumberOne = new Topic_01_Class_Object_Student();
		studentNumberOne.setStudentID(151283);
		studentNumberOne.setStudentName("Curry");
		studentNumberOne.setKnowledgePoints(8f);
		studentNumberOne.setPracticePoints(7.5f);
		studentNumberOne.showStudentInfo();

		Topic_01_Class_Object_Student studentNumberTwo = new Topic_01_Class_Object_Student();
		studentNumberTwo.setStudentID(157363);
		studentNumberTwo.setStudentName("Mason");
		studentNumberTwo.setKnowledgePoints(9f);
		studentNumberTwo.setPracticePoints(7.5f);
		studentNumberTwo.showStudentInfo();

		Topic_01_Class_Object_Student studentNumberThere = new Topic_01_Class_Object_Student();
		studentNumberThere.setStudentID(176363);
		studentNumberThere.setStudentName("Henry");
		studentNumberThere.setKnowledgePoints(8f);
		studentNumberThere.setPracticePoints(9f);
		studentNumberThere.showStudentInfo();

	}
}
