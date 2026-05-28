import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class student {
    @Test
    void testGreet() {
        student s = new student();
        assertEquals("hello world..", s.greet());
    }
}
