import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * BookManager 클래스는 책을 관리하는 기능을 제공합니다.
 */
public class BookManager {
    
    /**
     * Book 클래스는 책의 정보를 나타냅니다.
     */
    public class Book {
        int id;        // 책의 고유 ID (0..∞)
        String title;  // 책의 제목
        String author; // 책의 저자
        int year;      // 책의 출판 연도 (e.g., 2023)

        /**
         * Book 클래스의 생성자
         * @param id 책의 고유 ID
         * @param title 책의 제목
         * @param author 책의 저자
         * @param year 책의 출판 연도
         */
        public Book(int id, String title, String author, int year) {
            this.id = id;
            this.title = title;
            this.author = author;
            this.year = year;
        } 
    }
    
    ArrayList<Book> books; // 책을 저장하는 ArrayList

    /**
     * BookManager 클래스의 생성자
     * books 리스트를 초기화합니다.
     */
    public BookManager() {
        books = new ArrayList<>();
    }

    /**
     * 새로운 책을 추가합니다.
     * @param id 책의 고유 ID
     * @param title 책의 제목
     * @param author 책의 저자
     * @param year 책의 출판 연도
     * @return 책이 성공적으로 추가되면 1을 반환, 이미 존재하면 0을 반환
     */
    public int addBook(int id, String title, String author, int year) {
        for (Book book : books) {
            if (book.id == id) {
                System.out.println("해당 id (" + id + ")는 이미 존재합니다.");
                return 0; // 책이 이미 존재하면 0을 반환
            }
        }
        Book newBook = new Book(id, title, author, year); // 새로운 Book 객체 생성
        books.add(newBook); // ArrayList에 책 추가
        Collections.sort(books, Comparator.comparingInt(o -> o.id)); // 책의 ID로 정렬
        System.out.println("Book { id: " + newBook.id + ", title: " + newBook.title + ", author: " + newBook.author + ", printed year: " + newBook.year + "} 도서가 추가되었습니다.");
        return 1; // 책이 성공적으로 추가되면 1을 반환
    }

    /**
     * 책을 검색합니다.
     * @param id 책의 고유 ID
     * @return 책이 존재하면 1을 반환, 존재하지 않으면 0을 반환
     */
    public int searchBook(int id) {
        for (Book book : books) {
            if (book.id == id) {
                System.out.println("검색 결과: ");
                System.out.println("Book{ id: " + book.id + ", title: " + book.title + ", author: " + book.author + ", printed year: " + book.year + "}");
                return 1; // 검색 성공 시 1을 반환
            }
        }
        System.out.println("검색된 도서가 없습니다.");
        return 0; // 검색 실패 시 0을 반환
    }

    /**
     * 책을 제거합니다.
     * @param id 책의 고유 ID
     * @return 책이 존재하면 1을 반환, 존재하지 않으면 0을 반환
     */
    public int removeBook(int id) {
        for (Book book : books) {
            if (book.id == id) {
                books.remove(book); // 책을 ArrayList에서 제거
                System.out.println("Book{ id: " + book.id + ", title: " + book.title + ", author: " + book.author + ", printed year: " + book.year + "} 도서를 삭제하였습니다.");
                return 1; // 제거 성공 시 1을 반환
            }
        }
        System.out.println("해당 도서가 없습니다.");
        return 0; // 제거 실패 시 0을 반환
    }
}