package day29_practice;

public class BookMain {
	//1. bookRepository의 humanList에 새로운 객체를 저장
	//2. id가 1인 하나의 책만 조회
	//3. 조회한 데이터는 Service에서 출력
	//4. id가 1인 책 삭제
	//5. 삭제 후 리스트를 가져와서 Service에서 출력
	public static void main(String[] args) {
		BookDTO book = new BookDTO(1L,"마음의 미래","미치오 카쿠");
		BookDTO book1 = new BookDTO(2L,"날씨의 아이","신카이 마코토");
		BookService bs = new BookService();
		bs.save(book);
		bs.save(book1);
		bs.findAll();
		System.out.println();
		bs.findById(1L);
		bs.delete(1L);
	}

}
