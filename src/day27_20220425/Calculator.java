package day27_20220425;

public class Calculator {
	/*
	 * 모든 덧셈 메서드는 10, 20의 합을 구한다.
	 * 1. 
	 * 리턴타입: int
	 * 메서드이름:add1
	 * 매개변수:없음
	 */

	int num1;
	int num2;
	
	int add1() {
		int num1 = 10;
		int num2 = 20;
		return num1+num2;
	}
	/*
	 * 2. 
	 * 리턴타입: int
	 * 메서드이름:add2
	 * 매개변수:int 타입 2개
	 */
	int add2(int num1,int num2) {
		this.num1=num1;
		this.num2=num2;
		return num1+num2;
	}
	/*
	 * 모든 덧셈 메서드는 10, 20의 합을 구한다.
	 * 3. 
	 * 리턴타입: 없음
	 * 메서드이름:add3
	 * 매개변수:없음
	 */
	 void add3() {
		 int num1=10;
		 int num2=20;
		System.out.println(num1+num2);
	}
	 /*
	 * 모든 덧셈 메서드는 10, 20의 합을 구한다.
	 * 4. 
	 * 리턴타입: 없음
	 * 메서드이름:add4
	 * 매개변수:int 타입 2개
	 */
	 void add4(int num1,int num2) {
			System.out.println(num1+num2);
		}
	 /*
	  * 모든 덧셈 메서드는 10, 20의 합을 구한다.
	  * 5. 
	  * 리턴타입: String
	  * 메서드이름:add5
	  * 매개변수:없다
	  */
	 String add5() {
		 return"조용히해";
		 
	 }
	 /*
	  * 모든 덧셈 메서드는 10, 20의 합을 구한다.
	  * 6. 
	  * 리턴타입: String 
	  * 메서드이름:add6
	  *매개변수: String 1개, int 1개
	  * 실행내용:String값은 뒤에 !!를 추가해서 리턴.
	  * 	:int 값은 단순 출력만.
	  */
	 String add6(String a,int b) {
		 //System.out.println(b);
		 //return a;
		 String c=a+"!!"+String.valueOf(b);
		 return c;
	 }
	 /*
	  * 모든 덧셈 메서드는 10, 20의 합을 구한다.
	  * 7. 
	  * 리턴타입: boolean 
	  * 메서드이름:add7
	  *매개변수: int 2개
	  * 실행내용: 매개변수 2개의 합이 10보다 크거나 같다면 true 리턴
	  * 	10보다 작으면 false 리턴
	  */
	 boolean add7(int num1,int num2) {
		 int num =num1+num2;
		 boolean sum=false;
		 if(num>=10) {
			 //return true;
			 sum=true;
		 }
		 else{
			 //return false;//else if로하면 오류가 뜨고 else로 하면 오류가 안뜬다.
			 sum=false;     //이유는 경우의 수가 다 만들어지지 않아서 그렇다.
		 }
		 return sum;
	 }
	 
}


