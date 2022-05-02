package day32_20220502_1;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		int select = 0;
		BankService bs = new BankService();
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("1.신규 고객 등록 | 2.잔액조회 | 3.입 금 | 4.출 금 | 5.거래 내역 확인 |6.종료");
		System.out.println("-----------------------------------------------------------------------");
		while (run) {
			System.out.print("선택> ");
			select = sc.nextInt();
			if (select == 1) {
				System.out.println("신규 고객 등록");
				bs.save();
			} else if (select == 2) {
				System.out.println("잔액 조회");
				bs.balance();
			} else if (select == 3) {
				System.out.println("입 금");
				bs.credits();
			} else if (select == 4) {
				System.out.println("출 금");
				bs.debits();
			} else if (select == 5) {
				System.out.println("거래내역확인");
				bs.bankStatement();
			} else if (select == 6) {
				run = false;
				System.out.println("종료");
			} else if(select == 7 ) {
				bs.findAll();
			}
		}
		sc.close();
	}
}
