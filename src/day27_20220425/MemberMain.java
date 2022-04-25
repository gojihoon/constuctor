package day27_20220425;

import java.util.Scanner;
//3. 객체 프로그래밍 연습(회원예제)
//1. 회원은 회원번호, 아이디, 비밀번호, 이름, 전화번호, 나이 정보를 가진다. 
//2. 주요기능 
//    1. 회원가입(save)
//        1. 회원가입시 두가지 방법이 있음. 
//            1. 객체를 만들 때 모든 정보를 매개변수로 전달하여 필드값 지정하기 
//            2. 객체를 만들고 난 후 필드값을 각각 지정하기  
//    2. 로그인(memberLogin)
//        1. 로그인 메서드를 호출할 때 가입시 입력한 아이디, 비밀번호를 매개변수로 전달하고 boolean 리턴을 받아서 로그인 성공, 실패 여부를 출력함. 
//    3. 회원조회(findById)
//        1. 해당 객체의 회원조회 메서드를 호출하면 해당 회원의 전체 정보를 출력함. 
//    4. 정보수정(update)
//        1. 정보수정은 전화번호만 된다고 가정하고 
//        2. 정보수정 메서드 호출시 변경하고자 하는 전화번호를 매개변수로 넘겨서 해당 필드값을 변경하도록 한다. 
//        3. 변경 후 회원조회 메서드를 호출하여 값이 변경됐는지 확인함.
public class MemberMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int memberNum=0;
		String id= "";
		String id1="";
		String pw = "";
		String pw1="";
		String name = "";
		String phoneNum= "";
		int age=0;
		int join = 0;
		String phoneNum1 = "";
		boolean run = true;
		Member member = new Member();
		while (run) {
			System.out.println("1.회원가입 | 2.로그인 | 3.회원조회 | 4.정보수정 | 5. 종료");
			join=sc.nextInt();
			if (join == 1) {
				System.out.print("회원번호: ");
				memberNum=sc.nextInt();
				System.out.print("아이디: ");
				id=sc.next();
				System.out.print("비밀번호: ");
				pw=sc.next();
				System.out.print("이름: ");
				name=sc.next();
				System.out.print("전화번호: ");
				phoneNum=sc.next();
				System.out.print("나이: ");
				age=sc.nextInt();
				member.save(memberNum, id, pw, name, phoneNum, age);
			} 
			else if (join == 2) {
				System.out.print("아이디: ");
				id1=sc.next();
				System.out.print("비밀번호: ");
				pw1=sc.next();
				boolean result = member.memberLogin(id1, pw1);
				if (result == true) {
					System.out.println("로그인 성공!");
				} else if (result == false) {
					System.out.println("로그인 실패");
				}
			} 
			else if (join == 3) {
				member.findById();
			} 
			else if (join == 4) {
				System.out.print("변경할 전화번호: ");
				phoneNum1=sc.next();
				member.update(phoneNum1);
			}
			else if(join == 5) {
				System.out.println("종료");
				run = false;
			}
		}
		sc.close();
	}
}
