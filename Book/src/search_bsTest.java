import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class search_bsTest {
	
	BookManager mgr;
	
	@BeforeEach
	void setUp() throws Exception {
		mgr = new BookManager();
	}

	@Test
	void testSearchBook() {
		mgr.addBook(1, "소프트웨어 공학", "Tom", 2014);
		mgr.addBook(2, "분산 컴퓨팅", "Yoon", 2024);
		assertEquals(1, mgr.search_bs(1), "search failed");
		assertEquals(1, mgr.search_bs(2), "search failed");
		assertEquals(0, mgr.search_bs(3), "search failed");
	}

}
