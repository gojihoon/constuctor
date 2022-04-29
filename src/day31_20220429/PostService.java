package day31_20220429;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class PostService {
	Scanner sc = new Scanner(System.in);
	static PostRepository pr = new PostRepository();
	static PostDTO post = new PostDTO();
	static List<PostDTO> postList = new ArrayList<>();
	LocalDateTime dateTime = LocalDateTime.now();
	String time = dateTime.format(DateTimeFormatter.ofPattern("yyyy년 MM월 HH:mm:ss"));
	boolean result = false;
	Long id = 0L;
	String postTitle = "";
	String postWriter = "";
	String postPass = "";
	String postContents = "";
	Long postHits = 0L;
	String postDate = time;

	void signUp() { // 1로 글등록하고 다른데 선택하고 다시 1로 돌아오면 글제목이 스킵됨
		System.out.print("글제목: ");
		postTitle = sc.nextLine();
		System.out.print("작성자: ");
		postWriter = sc.next();
		System.out.print("비밀번호: ");
		postPass = sc.next();
		System.out.print("내용: ");
		postContents = sc.nextLine();
		postContents = sc.nextLine();
		post = new PostDTO(++id, postTitle, postWriter, postPass, postContents, postHits, postDate);
		result = pr.signUp(post);
		if (result == true) {
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
	}

	void update() {
		result = false;
		System.out.print("글번호: ");
		id = sc.nextLong();
		System.out.print("비밀번호: ");
		postPass = sc.next();
		Long postId = pr.postCheck(id, postPass); // postPass가 틀렸더라도 id값을 리턴해줘서 수정이 가능해짐.>>고침
		if (postId != null) {
			System.out.print("수정할 내용: ");
			postContents = sc.nextLine();
			postContents = sc.nextLine();
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
		postWriter = sc.next();
		List<PostDTO> wirterList = pr.wirterPostList(postWriter);
		for (PostDTO p : wirterList) {
			System.out.println(p);
		}
	}

	void delete() {
		System.out.print("글번호: ");
		id = sc.nextLong();
		System.out.print("비밀번호: ");
		postPass = sc.next();
		Long postId = pr.postCheck(id, postPass);
		postList = pr.delete(id);
		if (postId != null) {
			postList = pr.update(id, postContents);
			postList();
			System.out.println("글이 삭제되었습니다.");
		} else {
			System.out.println("글번호와 비밀번호가 일치하지 않습니다.");
		}
	}
}
