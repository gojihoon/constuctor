package day32_20220502_1;

public class ClientDTO {
	Long id;// 고객번호
	String clientName;// 고객이름
	String clientPass;// 비밀번호
	String clientCreatedDate;// 가입일자
	Long balance = 0L;// 잔액
	String accountNumber;// 계좌번호

	public ClientDTO(Long id, String clientName, String clientPass, String clientCreatedDate, Long balance,
			String accountNumber) {
		this.id = id;
		this.clientName = clientName;
		this.clientPass = clientPass;
		this.clientCreatedDate = clientCreatedDate;
		this.balance = balance;
		this.accountNumber = accountNumber;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getClientPass() {
		return clientPass;
	}

	public void setClientPass(String clientPass) {
		this.clientPass = clientPass;
	}

	public String getClientCreatedDate() {
		return clientCreatedDate;
	}

	public void setClientCreatedDate(String clientCreatedDate) {
		this.clientCreatedDate = clientCreatedDate;
	}

	public Long getBalance() {
		return balance;
	}

	public void setBalance(Long balance) {
		this.balance = balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	@Override
	public String toString() {
		return "ClientDTO [id=" + id + ", clientName=" + clientName + ", clientPass=" + clientPass
				+ ", clientCreatedDate=" + clientCreatedDate + ", balance=" + balance + ", accountNumber="
				+ accountNumber + "]";
	}

}
