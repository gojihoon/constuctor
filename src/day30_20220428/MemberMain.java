package day30_20220428;

import java.util.Scanner;

public class MemberMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int select = 0;
		while (run) {
			System.out.println("-----------------------");
			System.out.println("| 1.회원가입 | 2.로그인 | 3.회원목록 | 4.상세조회 | 5.회원정보수정 | 6.회원삭제 | 7.종료 |");
			System.out.print(">");
			select = sc.nextInt();
			MemberService ms = new MemberService();
			String memberId = "";
			String memberPassword = "";
			String memberMobile = "";
			boolean result = false;

			if (select == 1) {
				ms.sign_up();
			}
			if (select == 2) {
				System.out.print("아이디: ");
				memberId = sc.next();
				System.out.print("비밀번호: ");
				memberPassword = sc.next();
				ms.login(memberId, memberPassword);
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
				System.out.print("아이디: ");
				memberId = sc.next();
				System.out.print("비밀번호: ");
				memberPassword = sc.next();
				result = ms.login(memberId, memberPassword);
				if (result == true) {
					System.out.println("수정할 회원의 관리번호: ");
					int id = sc.nextInt();
					System.out.print("수정할 전화번호: ");
					memberMobile = sc.next();
					ms.update(id, memberMobile);
				}
			}
			if (select == 6) {
				System.out.print("아이디: ");
				memberId = sc.next();
				System.out.print("비밀번호: ");
				memberPassword = sc.next();
				result = ms.login(memberId, memberPassword);
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
