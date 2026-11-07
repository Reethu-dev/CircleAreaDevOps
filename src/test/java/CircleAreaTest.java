
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CircleAreaTest {

    CircleArea c = new CircleArea();

    @Test
    public void testRadiusFive() {
        assertEquals(78.5398,
            c.calculateArea(5), 0.001);
    }

    @Test
    public void testRadiusOne() {
        assertEquals(Math.PI,
            c.calculateArea(1), 0.001);
    }

    @Test
    public void testRadiusZero() {
        assertEquals(0,
            c.calculateArea(0), 0.001);
    }

    @Test
    public void testNegativeRadius() {
        assertThrows(IllegalArgumentException.class,
            () -> c.calculateArea(-5));
    }
}
