package day32_20220502_1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class BankService {
	static Scanner sc = new Scanner(System.in);
	static BankRepository br = new BankRepository();
	static LocalDateTime dateTime = LocalDateTime.now();
	static String bankingDate = dateTime.format(DateTimeFormatter.ofPattern("yyyy년 MM월 HH:mm:ss"));

//	BankingDTO banking = new BankingDTO(++id, accountNumber, deposit, withdraw, bankingDate);// 거래내역 정보

	Long id = 0L;// 거래내역 관리 번호
	void save() {
		System.out.print("고객이름: ");
		String clientName = sc.next(); // 고객이름
		System.out.print("비밀번호(4자리): ");
		String clientPass = sc.next(); // 비밀번호
		System.out.print("계좌번호(000-000): ");
		String accountNumber = sc.next(); // 계좌번호
		
		String clientCreatedDate = dateTime.format(DateTimeFormatter.ofPattern("yyyy년MM월 HH:mm:ss")); // 가입일자

		ClientDTO client = new ClientDTO(++id, clientName, clientPass, clientCreatedDate, 0L, accountNumber);// 고객 정보
		String result = br.save(client);
		if (result != null) {
			System.out.println("신규 고객 등록 완료");
		} else {
			System.out.println("신규 고객 등록 실패");
		}
	}

	void findAll() {
		List<ClientDTO> clientList = br.findAll();
		for (ClientDTO c : clientList) {
			System.out.println(c);
		}
	}

	void balance() {
		System.out.print("계좌번호: ");
		String accountNumber = sc.next();
		Long balance = br.balance(accountNumber);
		if (balance != null) {
			System.out.println(accountNumber + " 계좌의 잔액은 " + balance + "원 입니다.");
		} else {
			System.out.println("일치하는 계좌가 없습니다.");
		}
	}

	Long id1 = 0L;

	void credits() {
		System.out.print("입금할 계좌번호: ");
		String accountNumber = sc.next();// 입금할 계좌번호
		boolean result = br.accountCheck(accountNumber);
		if (result == true) {
			System.out.print("입금액: ");
			Long deposit = sc.nextLong(); // 입금액
			BankingDTO banking = new BankingDTO(++id1, accountNumber, deposit, 0L, bankingDate);// 거래내역 정보
			br.save2(banking);
			br.credits(accountNumber, deposit);
			Long balance = br.balance(accountNumber);
			System.out.println(accountNumber + " 계좌의 잔액은 " + balance + "원 입니다.");
		} else {
			System.out.println("해당 계좌와 일치하는 계좌가 없습니다.");
		}
	}

	void debits() {
		System.out.print("출금할 계좌번호: ");
		String accountNumber = sc.next(); // 출금할 계좌번호
		System.out.print("비밀번호: ");
		String clientPass = sc.next(); // 비밀번호
		String accountNumber1 = br.accountCheck2(accountNumber, clientPass);
		if (accountNumber1 != null) {
			Long balance = br.balance(accountNumber1);
			System.out.print("출금액: ");
			Long withdraw = sc.nextLong(); // 출금액
			if (withdraw <= balance) {
				BankingDTO banking = new BankingDTO(++id1, accountNumber, 0L, withdraw, bankingDate);
				br.save2(banking);
				br.debits(accountNumber1, withdraw);
				balance = br.balance(accountNumber);
				System.out.println(accountNumber + " 계좌의 잔액은 " + balance + "원 입니다.");
			} else {
				System.out.println("잔액이 부족합니다!!");
			}
		} else {
			System.out.println("계좌번호 또는 비밀번호가 일치하지 않습니다.");
		}
	}

	void bankStatement() {
		System.out.print("조회할 계좌번호: ");
		String accountNumber = sc.next();
		boolean result = br.accountCheck(accountNumber);
		if (result == true) {
			System.out.println("| 1.모든 거래내역 확인 | 2.입금 내역만 확인 | 3.출금 내역만 확인 |");
			int select = 0;
			select = sc.nextInt();
			if (select == 1) {
				List<BankingDTO> bankingList = br.bankStatement();
				for (BankingDTO b : bankingList) {
					System.out.println(b);
				}
			} else if (select == 2) {
				List<BankingDTO> bankingList = br.bankStatement();
				for (int i = 0; i < bankingList.size(); i++) {
					System.out.println(bankingList.get(i).getDeposit() + "원");
				}
			} else if (select == 3) {
				List<BankingDTO> bankingList = br.bankStatement();
				for (int i = 0; i < bankingList.size(); i++) {
					System.out.println(bankingList.get(i).getWithdraw() + "원");
				}
			}
		} else {
			System.out.println("계좌가 존재하지 않습니다.");
		}
	}
}
