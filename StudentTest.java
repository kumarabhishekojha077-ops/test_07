import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    @Test
    void testGreet() {
        Student s = new Student();
        assertEquals("hello world..", s.greet());
    }
}
