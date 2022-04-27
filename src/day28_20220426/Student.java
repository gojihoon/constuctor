package day28_20220426;

public class Student {
	private Long id;
	private String studentNumber;
	private String studentName;
	private String studentMajor;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
	public String getStudentNumber() {
		return studentNumber;
	}
	
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	
	public String getStudentMajor() {
		return studentMajor;
	}
	public void setStudentMajor(String studentMajor) {
		this.studentMajor = studentMajor;
	}
	@Override
	public String toString() { //toString 이라는 이름의 메서드, 리턴타입은 String //주소값 대신 실제 객체가 가지는 값들을 출력함 //Debug할 때
		return "Student [id=" + id + ", studentNumber=" + studentNumber + ", studentName=" + studentName
				+ ", studentMajor=" + studentMajor + "]";
	}
	
}