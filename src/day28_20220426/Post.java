package day28_20220426;

public class Post {
	int postNum;
	String postPassword;
	String postTitle;
	String postUser;
	String postDetail;
	int postCount;

	void save(int postNum, String postPassword, String postTitle, String postUser, String postDetail, int postCount) {
		this.postNum = postNum;
		this.postPassword = postPassword;
		this.postTitle = postTitle;
		this.postUser = postUser;
		this.postDetail = postDetail;
		this.postCount = postCount;
	}

	void findById() {
		++postCount;
		System.out.println("글번호: " + postNum);
		System.out.println("글비밀번호: " + postPassword);
		System.out.println("제목: " + postTitle);
		System.out.println("작성자: " + postUser);
		System.out.println("내용: " + postDetail);
		System.out.println("조회수: " + postCount);
	}

	boolean update(int postNum, String postPassword) {
		if (this.postNum == postNum && this.postPassword.equals(postPassword)) {
			System.out.println("글번호와 비밀번호가 일치합니다.");
			return true;
		} else {
			System.out.println("글번호와 비밀번호가 일치하지 않습니다.");
			return false;
		}
	}

	void update1(String postTitle, String postDetail) {
		this.postTitle = postTitle;
		this.postDetail = postDetail;
		System.out.println("글이 수정되었습니다.");
		findById();
	}

}
