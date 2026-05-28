import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class student {
    @Test
    void testGreet() {
        Student s = new Student();
        assertEquals("hello world..", s.greet());
    }
}
