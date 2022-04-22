package day26_20220422;

public class StudentMain {

	public static void main(String[] args) {
		// 기본생성자를 호출한 객체
		StudentClass student1 =new StudentClass();
			student1.name="고지훈";
			student1.studentNumber=2022;
			student1.major="컴퓨터";
			student1.age=20;
			student1.studentPring();
		System.out.println("");
		//매개변수 2개인 생성자를 호출한 객체
		StudentClass student2 =new StudentClass("고지훈",20);
			student2.studentPring();
			
		System.out.println("");
		//매개변수 4개인 생성자를 호출한 객체
		StudentClass student3 =new StudentClass("고지훈","컴퓨터",2022,20);
			student3.studentPring();
	}

}
