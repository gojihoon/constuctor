package day30_20220428;

import java.util.*;

public class MemberRepository {
	static List<MemberDTO> memberList = new ArrayList<>();
	boolean result = false;

	boolean sign_up(MemberDTO member) {
		memberList.add(member);
		result = true;
		return result;
	}

	boolean login(String memberId, String memberPassword) {
		for (int i = 0; i < memberList.size(); i++) {
			if (memberId.equals(memberList.get(i).getMemberId())
					&& memberPassword.equals(memberList.get(i).getMemberPassword())) {
				result = true; // 왜 마지막으로 회원가입한 것만 로그인이 정상적으로 될까 앞에서 true가 나와도 for문은 계속 돌아서 무조건 false가 나올 수 밖에
								// 없게되고
				return result; // 마지막으로 회원가입한 것만 로그인이 정상적으로 되는 것은 for문 다 돌았을 때 마지막값이 false이기 때문이다.
			} else {
				result = false;
			}
		}
		return result;
	}

	List<MemberDTO> findAll() {
		return memberList;
	}

	MemberDTO findById(int id) {
		MemberDTO member = null;
		for (int i = 0; i < memberList.size(); i++) {
			if (id == memberList.get(i).getId()) {
				member = memberList.get(i);
			}
		}
		return member;
	}

	List<MemberDTO> delete(int id) {
		for (int i = 0; i < memberList.size(); i++) {
			if (id == memberList.get(i).getId()) {
				memberList.remove(i);
			}
		}
		return memberList;
	}

	List<MemberDTO> update(int id, String memberMobile) {
		for (int i = 0; i < memberList.size(); i++) {
			if (id == memberList.get(i).getId()) {
				memberList.get(i).setMemberMobile(memberMobile);
			}
		}
		return memberList;
	}
}