	package day30_20220428;
	
	import java.util.ArrayList;
	import java.util.HashSet;
	import java.util.List;
	import java.util.Scanner;
	
	public class MemberService {
		static List<MemberDTO> memberList = new ArrayList<>();
		static MemberDTO member = new MemberDTO();
		static MemberRepository mr = new MemberRepository();
		boolean result = false;
		static Long id = 0L; //int 로 하면 실행할 때마다 초기화가 되므로 Long으로 선언해야 한다.
	//메서드하나 만들면 테스트 코드 만들어서 테스트한다. 요즘에는 테스트 코드 잘만드는게 실력. 근데 테스트 코드짜는게 더 어려움
		void sign_up() {
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
			member = new MemberDTO(++id, memberId, memberPassword, memberName, memberAge, memberMobile);
			
			result = mr.sign_up(member);
			if (result == true) {
				System.out.println("가입을 축하합니다.^^");
				// 중복 처리 못함 , 일단 for문이 실행이 안되는거 같은
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

		void findById() {
			findAll(); //같은 클래스 내에서는 객체를 생성하지않고 그냥 호출한다.
		}
	}
	//20대 만 따로 모아서 출력, 30대만 따로 리스트 모아서 출력
