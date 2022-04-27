package day29_practice;
import java.util.ArrayList;
import java.util.List;
public class BookRepository {
	static List<BookDTO> bookList  = new ArrayList<>();
	void save(BookDTO book) {
		bookList.add(book);
	}
	List<BookDTO> findAll() {
		return bookList;
	}
	BookDTO findById(Long id) {
		BookDTO book = new BookDTO();
		for(int i=0; i<bookList.size(); i++) {
			if(id.equals(bookList.get(i).getId())) {
				book = bookList.get(i);
				
			}
		}
		return book;
	}
	BookDTO delete(Long id) {
		BookDTO book = new BookDTO();
		for(int i=0; i<bookList.size(); i++) {
			if(id.equals(bookList.get(i).getId())) {
				bookList.remove(i);
				book = bookList.get(i);
			}
		}
		return book;
	}
}
