import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberGeneratorTests {

    @Test
    public void firstNumberIsOne() {
        NumberGenerator generator = new NumberGenerator();

        assertEquals("1", generator.numbers().substring(0,1));
    }

    @Test
    public void firstNumberIsFollowedByAComma() {
        NumberGenerator generator = new NumberGenerator();

        assertEquals(",", generator.numbers().substring(1,2));
    }

    @Test
    public void fifthNumberIsFive() {
        assertEquals("5", new NumberGenerator().numbers().substring(8,9));
    }

    @Test
    public void lastNumberIs100() {
        String numbers = new NumberGenerator().numbers();
        assertEquals("100", numbers.substring(numbers.length() - 3,numbers.length()));
    }
}
