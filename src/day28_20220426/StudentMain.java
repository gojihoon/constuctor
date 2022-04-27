package day28_20220426;

import java.util.ArrayList;
import java.util.List;

public class StudentMain {

	public static void main(String[] args) {
		Student student1 = new Student();
		//private 로 선언되어서 id필드에 접근할 수 없어졌다.
		//메서드를 이용해서 간접적으로 필드에 접근
		//필드를 감춰두고 간접적으로 열어둠
		//student1.id = 1L; //field 값 지정
		//System.out.println(student1.id);//field 값 출력
		
		//getter/setter 적용
		student1.setId(1L); //필드에 1L 저장
		System.out.println(student1.getId()); //필드값 전부 꺼냄
		//앞으로 이렇게 쓸 것이다.
		
		/*
		 * Student 객체에
		 * id: 2
		 * number : 11223344
		 * name: 학생1
		 * major : 컴퓨터공학
		 * 을 각각 입력하고
		 * 필드값을 각각 출력
		 */
		Student student2 = new Student();
		student2.setId(2L);
		student2.setStudentName("학생1");
		student2.setStudentMajor("컴퓨터공학");
		System.out.println(student2.getId());
		System.out.println(student2.getStudentName());
		System.out.println(student2.getStudentMajor());
		System.out.println("---------------");
		//Student 객체를 담기 위한 list
		List<Student> studentList= new ArrayList<>();
		studentList.add(student2);
// 배열로 표현
		Student[] stuArray = new Student[10]; //Student객체를 담는 배열, 모든 클래스는 데이터 타입이 될 수 있다.(Student타입)
		stuArray[0]= student1;
		
		int[] intArray = new int[10]; 
//     	
		//get  //인스터스가 클래스 메서드를 사용하는 문법과 똑같다. studentList.get(0)=student2, get은 문법 0은 studentList의 index 0번 
		System.out.println("객체출력 "+ student2); //주소값이 밑에 출력문과 같다 
		System.out.println("리스트 객체만 출력 "+studentList.get(0)); //이것을 출력하면 get(0)=student2의 주소값이 나온다. 
		// 0번 인덱스에 담긴 Student 객체의 id값을 출력한다면
		System.out.println(studentList.get(0).getId());
		System.out.println("--------------");
		Student student3 = new Student();
		student3.setId(3L);
		student3.setStudentNumber("999999");
		student3.setStudentName("학생3");
		student3.setStudentMajor("전자공학");
		studentList.add(student3);
		// for문을 이용해서 studentList에 담긴 모든 학생의 이름만 출력
		for(int i=0; i<studentList.size(); i++) {
			System.out.println(studentList.get(i).getStudentName());
		}//get(index)에서 getStudentName 학생이름 출력
		for(Student stu: studentList) {
			System.out.println(stu.getStudentName());
		}//Student타입의 stu 변수에 studentList의 모든 값을 넣고 그중에서 getStudentName의 값만 출력
		
//		그냥 for문은 studentList의 index 0번에서 학생이름 출력// studentList의 index부터 찾아간다.		
//		for each문은 index 0번 넣고 그중에서 학생이름 출력// index를 차례대로 자동으로 넣어줘서 바로 찾는다.
//		1번 값들 넣고 그 중에서 학생 이름 출력
//		2번 값들 넣고 그 중에서 학생이름 출력
// for-each에서 stu가 student 타입인 이유는 setStudenName이 Student 타입의 필드 이기 때문이다.
	}

}
