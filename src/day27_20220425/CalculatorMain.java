package day27_20220425;

public class CalculatorMain {

	public static void main(String[] args) {
		//add1 메서드를 호출
		//기본생성자 자동생성
		Calculator cal = new Calculator();
		//리턴이 있는 메서드를 호출할 때는 호출결과 처리를 위한 코드 필요
		int result = cal.add1(); //cal.add1이 리턴 값으로 바뀐다.
		System.out.println(result);
		System.out.println("---");
		//add2
		result = cal.add2(10,20);
		System.out.println(result);
		System.out.println("---");
		//add3
		cal.add3();
		System.out.println("---");
		//add4
		cal.add4(10,20);
		System.out.println("---");
		//add5
		String result1 = cal.add5();
		System.out.println(result1);
		System.out.println("---");
		//add6
		String result2=cal.add6("맛있다", 10);
		System.out.println(result2);
		System.out.println("---");
		//add7
		boolean result3=cal.add7(10,10);
		System.out.println(result3);
	}
	

}

