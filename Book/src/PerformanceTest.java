import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.PrintStream;

public class PerformanceTest {
	BookManager mgr;
	PrintStream originalOut = System.out;
    PrintStream dummyOut = new PrintStream(new java.io.OutputStream() {
        public void write(int b) {
            // 아무것도 하지 않음
        }
    });

    @BeforeEach
    public void setUp() {
        mgr = new BookManager();
        // System.out 출력을 비활성화합니다.
        System.setOut(dummyOut);
        // 1000권의 책을 추가합니다.
        for (int i = 1; i <= 1000; i++) {
        	mgr.addBook(i, "Title " + i, "Author " + i, 2000 + i % 20);
        }
        // System.out 출력을 복원합니다.
        System.setOut(originalOut);
    }

    @Test
    public void testSearchBookPerformance() {
        long startTime = System.nanoTime();
        int result = mgr.searchBook(500);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        System.out.println("Linear Search Duration: " + duration + " nanoseconds");

        assertEquals(1, result); // 검색 성공 시 1을 반환해야 합니다.
    }

    @Test
    public void testSearchBsPerformance() {
        long startTime = System.nanoTime();
        int result = mgr.search_bs(500);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        System.out.println("Binary Search Duration: " + duration + " nanoseconds");

        assertEquals(1, result); // 검색 성공 시 1을 반환해야 합니다.
    }
}

