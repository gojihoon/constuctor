package day27_20220425;

public class Calculator1 {
	int num1;
	int num2;
	Calculator1(int num1,int num2){
		this.num1=num1;
		this.num2=num2;
	}
	void sum(int num1,int num2) {
		System.out.println("두수의 합: "+(num1+num2));
	}
	void sub(int num1,int num2) {
		System.out.println("두수의 차: "+(num1-num2));
	}
	int mul(int num1,int num2) {
		return num1*num2;
	}
	int div() {
		return num1/num2;
	}
}
