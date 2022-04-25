package day27_20220425;

public class Member {
		int memberNum;
		String id;
		String pw;
		String name;
		String phoneNum;
		int age;
		void save(int memeberNum,String id,String pw,String name,String phoneNum,int age) {
			this.memberNum=memeberNum;
			this.id=id;
			this.pw=pw;
			this.name=name;
			this.phoneNum=phoneNum;
			this.age=age;
		}
		boolean memberLogin(String id1,String pw1){
			if(id.equals(id1) && pw.equals(pw1)) {
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


