package day27_20220425;

public class Member {
		int memberNum; //변수이름:소속도 같이 써주는게 좋다. member+Id,member+Pw,member+Name
		String id;
		String pw;
		String name;
		String phoneNum;
		int age;
		// 모든 필드를 매개변수로 하는 생성자
		void save(int memeberNum,String id,String pw,String name,String phoneNum,int age) {
			this.memberNum=memeberNum;
			this.id=id;
			this.pw=pw;
			this.name=name;
			this.phoneNum=phoneNum;
			this.age=age;
		}
		boolean memberLogin(String id,String pw){
			if(this.id.equals(id) && this.pw.equals(pw)) {
				return true;
			}
			else {
				return false;
			}
		}
		void findById() {
			System.out.println("회원번호: "+memberNum);
			System.out.println("아이디: "+id);
			System.out.println("비밀번호: "+pw);
			System.out.println("이름: "+name);
			System.out.println("전화번호"+phoneNum);
			System.out.println("나이: "+age);
		}
		void update(String phoneNum1) {
			this.phoneNum=phoneNum1;
			findById();
		}
		
}


