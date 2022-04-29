package day31_20220429;

import java.util.*;

public class PostMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PostService ps = new PostService();
		int select = 0;
		boolean run = true;
		while (run) {
			System.out.println("------------------------------------------------------------------");
			System.out.println("| 1.글작성 | 2.글목록 | 3.글조회 | 4.글수정 | 5.글검색 | 6.글삭제 | 7.종료 |");
			System.out.print(">");
			select = sc.nextInt();
			if (select == 1) {
				ps.signUp();
			}
			if (select == 2) {
				ps.postList();
			}
			if (select == 3) {
				ps.findById();
			}
			if (select == 4) {
				ps.update();
			}
			if (select == 5) {
				ps.wirterPostList();
			}
			if (select == 6) {
				ps.delete();
			}
			if (select == 7) {
				System.out.println("종료");
				run = false;
			}
		}
		sc.close();
	}

}
