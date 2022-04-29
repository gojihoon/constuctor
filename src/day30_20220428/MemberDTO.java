package day30_20220428;

public class MemberDTO {
	private Long id; // 관리번호
	private String memberId;
	private String memberPassword;
	private String memberName;
	private int memberAge;
	private String memberMobile; // 전화번호

	MemberDTO() {

	}

	public MemberDTO(Long id, String memberId, String memberPassword, String memberName, int memberAge,
			String memberMobile) {
		this.id = id;
		this.memberId = memberId;
		this.memberPassword = memberPassword;
		this.memberName = memberName;
		this.memberAge = memberAge;
		this.memberMobile = memberMobile;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemeberId(String memeberId) {
		this.memberId = memeberId;
	}

	public String getMemberPassword() {
		return memberPassword;
	}

	public void setMemberPassword(String memberPassword) {
		this.memberPassword = memberPassword;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public int getMemberAge() {
		return memberAge;
	}

	public void setMemberAge(int memberAge) {
		this.memberAge = memberAge;
	}

	public String getMemberMobile() {
		return memberMobile;
	}

	public void setMemberMobile(String memberMobile) {
		this.memberMobile = memberMobile;
	}

	@Override
	public String toString() {
		return "MemberDTO [id=" + id + ", memberId=" + memberId + ", memberPassword=" + memberPassword + ", memberName="
				+ memberName + ", memberAge=" + memberAge + ", memberMobile=" + memberMobile + "]";
	}

}
