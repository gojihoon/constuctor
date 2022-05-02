package day32_20220502_1;

import java.util.*;

public class BankRepository {
	//static List<ClientDTO> clientList = new ArrayList<>(hashSet);
	static List<ClientDTO> clientList = new ArrayList<>();
	static List<BankingDTO> bankingList = new ArrayList<>();

	// contains() 함수는 대상 문자열에 특정 문자열이 포함되어 있는지 확인하는 함수
	// Set은 중복된 값을 가지지 않는 Collection
	// HashSet은 Set 인터페이스를 구현한 클래스
	String save(ClientDTO client) {
		String account= null;
		clientList.add(client);
		for(int i=0; i<clientList.size(); i++) {
			if(client.accountNumber.equals(clientList.get(i).getAccountNumber())) {
				clientList.remove(clientList.get(i));
			}else {
			account = clientList.get(i).getAccountNumber();
			}
		}
		return account;
	}
    void remove(String accountNumber) {
    	for(int i=0; i<clientList.size(); i++) {
    		if(accountNumber.equals(clientList.get(i).getAccountNumber())) {
    			clientList.remove(i);
    		}
    	}
    }
	List<ClientDTO> findAll() {
		return clientList;
	}

	void save2(BankingDTO banking) {
		bankingList.add(banking);
	}

	Long balance(String accountNumber) {
		Long balance = null;
		for (int i = 0; i < clientList.size(); i++) {
			if (accountNumber.equals(clientList.get(i).getAccountNumber())) {
				balance = clientList.get(i).getBalance();
				return balance;
			}
		}
		return balance;
	}

	void credits(String accountNumber, Long deposit) {
		for (int i = 0; i < clientList.size(); i++) {
			if (accountNumber.equals(clientList.get(i).getAccountNumber())) {
				clientList.get(i).setBalance(clientList.get(i).getBalance() + deposit); // 두개의 리스트를 같이 쓰는 방법은 있나
			}
		}
	}

	boolean accountCheck(String accountNumber) {
		boolean result = false;
		for (int i = 0; i < clientList.size(); i++) {
			if (accountNumber.equals(clientList.get(i).getAccountNumber())) {
				result = true;
				return result;
			}
		}
		return result;
	}

	void debits(String accountNumber1, Long withdraw) {
		for (int i = 0; i < clientList.size(); i++) {
			if (accountNumber1.equals(clientList.get(i).getAccountNumber())) {
				clientList.get(i).setBalance(clientList.get(i).getBalance() - withdraw);

				// bankingList.get(i).setWithdraw(withdraw);
				// clientList.get(i).setBalance(clientList.get(i).getBalance() -
				// bankingList.get(i).getWithdraw());
				// bankingList.add(banking);
			}
		}
	}

	String accountCheck2(String accountNumber, String clientPass) {
		String accountNumber1 = null;
		for (int i = 0; i < clientList.size(); i++) {
			if (accountNumber.equals(clientList.get(i).getAccountNumber())
					&& clientPass.equals(clientList.get(i).getClientPass())) {
				accountNumber1 = clientList.get(i).getAccountNumber();
			}
		}
		return accountNumber1;
	}

	List<BankingDTO> bankStatement() {
		return bankingList;
	}

	Long withdraw() {
		Long withdraw = null;
		for (int i = 0; i < bankingList.size(); i++) {
			withdraw = bankingList.get(i).getWithdraw();
		}
		return withdraw;
	}
}
