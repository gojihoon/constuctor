package day30_20220428;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberService {
	static List<MemberDTO> memberList = new ArrayList<>();
	static MemberDTO member = new MemberDTO();
	static MemberRepository mr = new MemberRepository();
	boolean result = false;

	void sign_up() {
		int id = member.getId();
		++id;
		Scanner sc = new Scanner(System.in);
		String memberId = "";
		String memberPassword = "";
		String memberName = "";
		int memberAge = 0;
		String memberMobile = "";
		System.out.print("아이디: ");
		memberId = sc.next();
		System.out.print("비밀번호: ");
		memberPassword = sc.next();
		System.out.print("이름: ");
		memberName = sc.next();
		System.out.print("나이: ");
		memberAge = sc.nextInt();
		System.out.print("전화번호: ");
		memberMobile = sc.next();
		member = new MemberDTO(id, memberId, memberPassword, memberName, memberAge, memberMobile);
		for (int i = 0; i < memberList.size(); i++) {
			if (member.equals(memberList.get(i))) {
				System.out.println("중복 입니다.");
			}
		}
		result = mr.sign_up(member);
		if (result == true) {
			System.out.println("가입을 축하합니다.^^");
		}
	}

	boolean login(String memberId, String memberPassword) {
		result = mr.login(memberId, memberPassword);

		if (result == true) {
			System.out.println("로그인 되었습니다.");
		} else {
			System.out.println("아이디 또는 비밀번호가 틀립니다!!");
			result = false;
		}
		return result;
	}

	void findAll() {
		memberList = mr.findAll();
		for (MemberDTO m : memberList) {
			System.out.println(m);
		}
	}

	void findById(int id) {
		MemberDTO member = mr.findById(id);
		if (member == null) {
			System.out.println("조회 결과가 없습니다!!");
		} else {
			System.out.println(member);
		}
	}

	void delete(int id) {
		memberList = mr.delete(id);
		for (MemberDTO m : memberList) {
			System.out.println(m);
		}
	}

	void update(int id, String memberMobile) {
		memberList = mr.update(id, memberMobile);
		for (MemberDTO m : memberList) {
			System.out.println(m);
		}
	}
}
