package day28_20220426;

import java.util.Scanner;

public class PostMain {
	public static void main(String[] args) {
		int postNum = 0;
		String postPassword = "";
		String postTitle = "";
		String postUser = "";
		String postDetail = "";
		int postCount = 0;
		boolean run = true;
		int select = 0;
		Scanner sc = new Scanner(System.in);
		Post post = new Post();
		while (run) {
			System.out.println("| 1.글작성 | 2.글조회 | 3.글수정 | 4.종료 |");
			System.out.print(">");
			select = sc.nextInt();
			if (select == 1) {
				System.out.print("글번호: ");
				postNum = sc.nextInt();
				System.out.print("글비밀번호: ");
				postPassword = sc.next();
				System.out.print("제목: ");
				postTitle = sc.nextLine();
				postTitle = sc.nextLine();
				System.out.print("작성자: ");
				postUser = sc.next();
				System.out.print("내용: ");
				postDetail = sc.nextLine();
				postDetail = sc.nextLine();
				post.save(postNum, postPassword, postTitle, postUser, postDetail, postCount);
			} else if (select == 2) {
				post.findById();
			} else if (select == 3) {
				System.out.print("글번호: ");
				postNum = sc.nextInt();
				System.out.print("글비밀번호: ");
				postPassword = sc.next();
				boolean result = post.update(postNum, postPassword);
				if (result == true) {
					System.out.print("글 제목 수정: ");
					postTitle = sc.nextLine();
					postTitle = sc.nextLine();
					System.out.print("글 내용 수정: ");
					postDetail = sc.nextLine();
					post.update1(postTitle, postDetail);
				}
			} else if (select == 4) {
				System.out.println("종료");
				run = false;
			}
		}
	}

}
