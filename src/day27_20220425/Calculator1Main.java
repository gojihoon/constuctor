package day27_20220425;

import java.util.Scanner;

public class Calculator1Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int num1=0;
		int num2=0;
		int select=0;
		int result=0;
		boolean run=true;
		Calculator1 cal = new Calculator1(num1,num2);
		while(run) {
			System.out.println("1.덧셈 | 2.뺄셈 | 3.곱셈 | 4.나눗셈 | 5.종료");
			select=sc.nextInt();
			if(select==1) {
				cal.sum(10, 20);
			}
			else if(select==2) {
				cal.sub(10, 20);
			}
			else if(select==3) {
				result=cal.mul(10, 20);
				System.out.println("두수의 곱: "+result);
			}
			else if(select==4) {
				System.out.print("첫번째 수: ");
				num1=sc.nextInt();
				System.out.print("두번째 수: ");
				num2=sc.nextInt();
				result=cal.div();
				System.out.println("두수의 나눗셈: "+result);
			}
			else if(select==5) {
				System.out.println("종료");
			}
			else {
				System.out.println("다시 입력하세요.");
			}
		}
		sc.close();
	}

}
