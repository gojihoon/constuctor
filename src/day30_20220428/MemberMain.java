package day30_20220428;

import java.util.Scanner;

public class MemberMain {
	static String memberId = "";
	static String memberPassword = "";
	static String memberMobile = "";
	static boolean result = false;
	static MemberService ms = new MemberService();
	static Scanner sc = new Scanner(System.in);

	static boolean login() {
		System.out.print("아이디: ");
		memberId = sc.next();
		System.out.print("비밀번호: ");
		memberPassword = sc.next();
		result= ms.login(memberId, memberPassword);
		return result;
		//login 로그인을 시도한 회원의 관리번호(id)
	}

	public static void main(String[] args) {
		boolean run = true;
		int select = 0;
		while (run) {
			System.out.println("-----------------------");
			System.out.println("| 1.회원가입 | 2.로그인 | 3.회원목록 | 4.상세조회 | 5.회원정보수정 | 6.회원삭제 | 7.종료 |");
			System.out.print(">");
			select = sc.nextInt();

			if (select == 1) {
				ms.sign_up(); //실행이 끝나면 돌아온다.
			}
			if (select == 2) {
				login();
			}
			if (select == 3) {
				ms.findAll();
			}
			if (select == 4) {
				System.out.print("조회할 회원의 관리번호: ");
				int id = sc.nextInt();
				ms.findById(id);
			}
			if (select == 5) {
				login();
				if (result == true) {
					System.out.println("수정할 회원의 관리번호: ");
					int id = sc.nextInt();
					System.out.print("수정할 전화번호: ");
					memberMobile = sc.next();
					ms.update(id, memberMobile);
				}
			}
			if (select == 6) {
				login();
				if (result == true) {
					System.out.print("삭제할 회원의 관리번호: ");
					int id = sc.nextInt();
					ms.delete(id);
				}
			}
			if (select == 7) {
				System.out.println("종료");
				run = false;
			}

		}
		sc.close();
	}

}
