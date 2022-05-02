package day32_20220502_1;

public class BankingDTO {
	Long id1;// 거래내역 관리 번호
	String accountNumber;// 계좌번호
	Long deposit = 0L;// 입금액
	Long withdraw = 0L;// 출금액
	String bankingDate;// 거래일자

	public BankingDTO(Long id1, String accountNumber, Long deposit, Long withdraw, String bankingDate) {
		this.id1 = id1;
		this.accountNumber = accountNumber;
		this.deposit = deposit;
		this.withdraw = withdraw;
		this.bankingDate = bankingDate;
	}

	public Long getId() {
		return id1;
	}

	public void setId(Long id) {
		this.id1 = id1;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Long getDeposit() {
		return deposit;
	}

	public void setDeposit(Long deposit) {
		this.deposit = deposit;
	}

	public Long getWithdraw() {
		return withdraw;
	}

	public void setWithdraw(Long withdraw) {
		this.withdraw = withdraw;
	}

	public String getBankingDate() {
		return bankingDate;
	}

	public void setBankingDate(String bankingDate) {
		this.bankingDate = bankingDate;
	}

	@Override
	public String toString() {
		return "BankingDTO [id1=" + id1 + ", accountNumber=" + accountNumber + ", deposit=" + deposit + ", withdraw="
				+ withdraw + ", bankingDate=" + bankingDate + "]";
	}

}