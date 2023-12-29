import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
	@Test
	public void ifDivisibleBy3And5ReturnFizzBuzz() {
		assertEquals("FizzBuzz", new FizzBuzz().fizzBuzzer(15));
	}

	@Test
	public void for30itShouldBeFizzBuzz() {
		assertEquals("FizzBuzz", new FizzBuzz().fizzBuzzer(30));
	}

	@Test
	public void for5ReturnFiveAsString() {
		assertEquals("5", new FizzBuzz().fizzBuzzer(5));
	}
}
