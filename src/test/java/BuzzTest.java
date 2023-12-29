import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BuzzTest {

	@Test
	public void returnBuzzStringOnNumberDivisibleByFive() {
		assertEquals("Buzz", new Buzz().fizzBuzzer(0));
		assertEquals("Buzz", new Buzz().fizzBuzzer(5));
		assertEquals("Buzz", new Buzz().fizzBuzzer(15));
		assertEquals("3", new Buzz().fizzBuzzer(3));
		assertEquals("9", new Buzz().fizzBuzzer(9));
	}

}
