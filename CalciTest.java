import static org.junit.Assert.*;
import org.junit.Test;

public class AddTest {
    @Test
    public void testAddition() {
        Add add = new Add();
        assertEquals(5, add.add(2, 3));
        assertEquals(-1, add.add(-2, 1));
        assertEquals(0, add.add(0, 0));
        assertEquals(100, add.add(50, 50));
    }

    @Test
    public void testSubtraction() {
        Add add = new Add();
        assertEquals(-1, add.subtract(2, 3));
        assertEquals(-3, add.subtract(-2, 1));
        assertEquals(0, add.subtract(0, 0));
        assertEquals(0, add.subtract(50, 50));
    }

    @Test
    public void testMultiplication() {
        Add add = new Add();
        assertEquals(6, add.multiply(2, 3));
        assertEquals(-2, add.multiply(-2, 1));
        assertEquals(0, add.multiply(0, 10));
        assertEquals(2500, add.multiply(50, 50));
    }

    @Test
    public void testDivision() {
        Add add = new Add();
        assertEquals(2, add.divide(6, 3));
        assertEquals(-2, add.divide(-4, 2));
        assertEquals(0, add.divide(0, 1));
        assertEquals(1, add.divide(50, 50));
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionByZero() {
        Add add = new Add();
        add.divide(5, 0);
    }
}

