package day31_20220429;

import java.util.*;

public class PostRepository {
	static List<PostDTO> postList = new ArrayList<>();
	boolean result = false;

	boolean signUp(PostDTO post) {
		return postList.add(post);
	}

	List<PostDTO> postList() {
		return postList;
	}


//	Long postHits = 0L; 누적의 의미로 무조건 써야 하는줄 알았으나, getPostHits값이 애초에 0이었기 때문에 따로 선언할 필요가 없었다.
	PostDTO findById(Long id) {
		PostDTO post = null;
		for (int i = 0; i < postList.size(); i++) {// 글번호마다 따로따로 초기화가 되야함, 각각 조회수가 늘어나야 함>> 계속 누적되는 것과 누적이 안되것 2개의 값을 놓고
													// 누적되는
			if (id == postList.get(i).getId()) {
			Long postHits = postList.get(i).getPostHits(); // 기본값이 0 //얘가 핵심 , getPostHits가 글마다 다르게 적용되므로
															// 이게 없이 그냥 0을 쓰면 hits는 값이 늘어나지 않고 그대로 이고, 안쓴다면 글마다 적용이 안되고
															// 글이 하나의 조회수를 갖게 된다.
				postList.get(i).setPostHits(++postHits);
				post = postList.get(i);
//	postList.get(i).setPostHits(postList.get(i).getPostHits() + 1);
				//이런 형태가 더 많이 쓰임.
			}
		}
		return post;
	}

	List<PostDTO> update(Long id, String postContents) {
		for (int i = 0; i < postList.size(); i++) {
			if (id == postList.get(i).getId()) {
				postList.get(i).setPostContents(postContents);
			}
		}
		return postList;
	}

	Long postCheck(Long id, String postPass) {
		Long postId = null;
		for (int i = 0; i < postList.size(); i++) {
			if (id.equals(postList.get(i).getId()) && postPass.equals(postList.get(i).getPostPass())) {
				postId = postList.get(i).getId();
			}
		}
		return postId;
	}

	List<PostDTO> wirterPostList(String postWriter) {
		List<PostDTO> wirterList = new ArrayList<>();
		for (int i = 0; i < postList.size(); i++) {
			if (postWriter.equals(postList.get(i).getPostWriter())) {
				wirterList.add(postList.get(i));
			}
		}
		return wirterList;
	}

	List<PostDTO> delete(Long id) {
		for (int i = 0; i < postList.size(); i++) {
			if (id == postList.get(i).getId()) {
				postList.remove(i);
			}
		}
		return postList;
	}
}
