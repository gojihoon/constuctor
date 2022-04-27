package day29_practice;

public class BookDTO {
	private Long id;
	private String name;
	private String author;
	public BookDTO() {
		
	}
	public BookDTO(Long id, String name, String author) {
		this.id = id;
		this.name = name;
		this.author = author;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "BookDTO [id=" + id + ", name=" + name + ", author=" + author + "]";
	}
	
	
}
