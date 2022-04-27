package day29_practice;

import java.util.List;

public class BookService {
	static BookRepository br = new BookRepository();
	
	void save(BookDTO book) {
		br.save(book);
	}

	void findAll() {
		List<BookDTO> bookList = br.findAll();
		for (BookDTO b : bookList) {
			System.out.println(b);
		}
	}

	void findById(Long id) {

		BookDTO book = br.findById(id);
		System.out.println(book);
	}
	void delete(Long id) {
		BookDTO book = br.delete(id);
		System.out.println(book);
	}
}
