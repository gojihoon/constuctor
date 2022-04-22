package day26_20220422;

public class StudentClass {
	String name;
	String major;
	int studentNumber;
	int age;
	StudentClass(){
	
	}
	StudentClass(String name,int age){
		this.name=name;
		this.age=age;
		this.studentNumber=12345;
		this.major="컴퓨터";
	}
	// 모든 필드를 매개변수로 하는 생성자
	StudentClass(String name,String major,int studentNumber,int age){
		this.major=major;
		this.age=age;
		this.studentNumber=studentNumber;
		this.name=name;
	}
	//필드값 출력을 위한 메서드
	void studentPring() {
		System.out.println(this.name);
		System.out.println(this.major);
		System.out.println(this.studentNumber);
		System.out.println(this.age);
	}
}
