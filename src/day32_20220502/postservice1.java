package day32_20220502;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;


	public class postservice1 {
		Scanner scan = new Scanner(System.in);
		static Long id = 0L;
		postrepository1 pr = new postrepository1();
		
		public void save() {
			System.out.println("애");
			String postTitle1 = scan.next();
			System.out.print("글제목: ");
			String postTitle = scan.nextLine();
			System.out.print("작성자: ");
			String postWriter = scan.next();
			System.out.print("비밀번호: ");
			String postPass = scan.next();
			System.out.print("내용: ");
			scan.nextLine();
			String postContents = scan.nextLine();
			
			LocalDateTime dateTime = LocalDateTime.now();
			String postDate = dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
			
			postDTO1 newPost = 
					new postDTO1(++id, postTitle, postWriter, postPass, postContents, 0, postDate);
			boolean saveResult = pr.save(newPost);
			if(saveResult) {
				System.out.println("글등록 완료");
			} else {
				System.out.println("글등록 실패");
			}
		}

		public void findAll() {
			List<postDTO1> postList = pr.findAll();
			for(postDTO1 p: postList) {
				System.out.println(p);
			}
		}

		public void findById() {
			System.out.print("글번호: ");
			Long postId = scan.nextLong();
			// 조회수처리
			pr.updateHits(postId);
			postDTO1 post = pr.findById(postId);
			System.out.println(post);
		}

		public void update() {
			System.out.print("글번호: ");
			Long postId = scan.nextLong();
			System.out.print("비밀번호: ");
			String postPass = scan.nextLine();
			// 1. 글번호, 비밀번호 맞는지 체크 
			Long checkId = pr.postCheck(postId, postPass);
			// 2. 수정처리 
			if(checkId != null) {
				System.out.print("제목: ");
				String postTitle = scan.nextLine();
				System.out.print("내용: ");
				String postContents = scan.nextLine();
				postDTO1 updatePost = pr.update(checkId, postTitle, postContents);
				System.out.println(updatePost);
			} else {
				System.out.println("일치하는 정보가 없습니다.");
			}
		}

		public void search() {
			System.out.print("검색어(작성자): ");
			String keyword = scan.nextLine();
			List<postDTO1> searchList = pr.search(keyword);
			if(searchList.size() > 0) {
				for(postDTO1 p: searchList) {
					System.out.println(p);
				}
			} else {
				System.out.println("검색결과가 없습니다.");
			}
		}

		public void delete() {
			/*
			 * 1. 글번호, 비밀번호 입력 받아서 검증
			 * 2. 정보 맞으면 삭제처리 
			 * 3. 목록 출력 메서드 호출 
			 */
			System.out.print("글번호: ");
			Long postId = scan.nextLong();
			System.out.print("비밀번호: ");
			String postPass = scan.nextLine();
			Long checkId = pr.postCheck(postId, postPass);
			if(checkId != null) {
				pr.delete(checkId);
				findAll();
			} else {
				System.out.println("비밀번호가 틀립니다!!");
			}
		}

	}

















