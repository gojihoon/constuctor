package day29_20220427;

public class PhoneDTO {
	private Long id;
	private String modelName;
	private String modlNumber;
	private int price;
	
	//기본생성자
	PhoneDTO(){
		
	}
	
	//매개변수 있는 생성자
	public PhoneDTO(Long id, String modelName, String modlNumber, int price) {
		this.id = id;
		this.modelName = modelName;
		this.modlNumber = modlNumber;
		this.price = price;
	}
	
	//getter/setter
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public String getModlNumber() {
		return modlNumber;
	}
	public void setModlNumber(String modlNumber) {
		this.modlNumber = modlNumber;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	//toString
	@Override
	public String toString() {
		return "PhoneDTO [id=" + id + ", modelName=" + modelName + ", modlNumber=" + modlNumber + ", price=" + price
				+ "]";
	}
	
	
}
