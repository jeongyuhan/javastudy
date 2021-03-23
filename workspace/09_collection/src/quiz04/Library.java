package quiz04;

import java.util.ArrayList;
import java.util.List;

public class Library {

	// field
	private String name;
	private List<Book> books = new ArrayList<Book>();
	
	// constructor
	public Library(String name) {
		this.name = name;
	}
	
	// method
	
	public void booksInfo() {
		System.out.println("도서관 : " + name);
		for(Book book : books) {
			System.out.println(book);
		}
	}
	
	
	// 추가
	public void addBook(Book book) {
		books.add(book);
	}
	
	// 삭제(1)
	public void removeBook(int bNo) {
		int removeIdx = -1; // 초기화값을 0으로 줄 경우 인덱스는 0부터 시작하므로 불편함이 생긴다.
		for(int i = 0, length = books.size(); i < length; i++) {
			if(books.get(i).getBNo() == bNo) {
				removeIdx = i;
				break;
			}
		}
		if(removeIdx == -1) {
			System.out.println(bNo + "번 Book이 없습니다.");
		} else {
			books.remove(removeIdx);
			System.out.println(bNo + "번 Book이 삭제되었습니다.");
		}
	}
	
	// 삭제(2)
	/*
	public void removeBook(int bNo) {
		for(Book book : books) {
			if(book.getBNo() == bNo) {
				books.remove(book);
				break;
			}
		}
	}
	*/
	
	
	
	
}
