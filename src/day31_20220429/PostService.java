package day31_20220429;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class PostService {
	Scanner sc = new Scanner(System.in);
	static PostRepository pr = new PostRepository();
	static PostDTO post = new PostDTO();
	static List<PostDTO> postList = new ArrayList<>();
	static Long id = 0L;
	void signUp() { 
		System.out.print("글제목: ");
		String postTitle = sc.nextLine();
		System.out.print("작성자: ");
		String postWriter = sc.next();
		System.out.print("비밀번호: ");
		String postPass = sc.next();
		System.out.print("내용: ");
		sc.nextLine();
		String postContents = sc.nextLine();

		LocalDateTime dateTime = LocalDateTime.now();
		String postDate = dateTime.format(DateTimeFormatter.ofPattern("yyyy년 MM월 HH:mm:ss"));

		post = new PostDTO(++id, postTitle, postWriter, postPass, postContents, 0L, postDate);
		boolean result = pr.signUp(post); //false를 쓰지 않아도 add가 되면 true 안되면 false를 준다.
		if (result) { // ==true라고 안해도 true라면 실행되고 false라면 실패한다.
			System.out.println("글이 작성되었습니다.");
		} else {
			System.out.println("글 작성에 실패하였습니다.");
		}
	}

	void postList() {
		List<PostDTO> postList = pr.postList();
		for (PostDTO p : postList) {
			System.out.println(p);
		}
	}

	void findById() {
		System.out.print("글번호: ");
		id = sc.nextLong();
		post = pr.findById(id);
		if (post != null) {
			System.out.println(post);
		} else {
			System.out.println("조회결과가 없습니다.!!");
		}
		sc.nextLine();
	}

	void update() {
		System.out.print("글번호: ");
		id = sc.nextLong();
		System.out.print("비밀번호: ");
		String postPass = sc.next();
		sc.nextLine();
		Long postId = pr.postCheck(id, postPass); // postPass가 틀렸더라도 id값을 리턴해줘서 수정이 가능해짐.>>고침
		if (postId != null) {
			System.out.print("수정할 내용: ");
			String postContents = sc.nextLine();
			postList = pr.update(id, postContents);
			PostDTO post = pr.findById(id);
			System.out.println(post);
			System.out.println("내용이 수정되었습니다.");
		} else {
			System.out.println("글번호와 비밀번호가 일치하지 않습니다.");
		}
	}

	void wirterPostList() {
		System.out.print("작성자: ");
		String postWriter = sc.next();
		List<PostDTO> wirterList = pr.wirterPostList(postWriter);
		if(wirterList.size() > 0) {
		for (PostDTO p : wirterList) {
			System.out.println(p);
		}
		} else {
			System.out.println("검색결과가 없습니다.");
		}
		sc.nextLine();
	}

	void delete() {
		System.out.print("글번호: ");
		id = sc.nextLong();
		System.out.print("비밀번호: ");
		String postPass = sc.next();
		Long postId = pr.postCheck(id, postPass);
		if (postId != null) {
			postList = pr.delete(id);
			postList();
			System.out.println("글이 삭제되었습니다.");
		} else {
			System.out.println("글번호와 비밀번호가 일치하지 않습니다.");
		}
		sc.nextLine();
	}
}
