import static org.junit.Assert.assertEquals;

import org.junit.Test;

@SuppressWarnings("javadoc")
public class FizzBuzzTest {
	@Test
	public void ifDevisableBy3And5ReturnFizzBuzz() {
		assertEquals("FizzBuzz", new FizzBuzzerStringReplacer().fizzBuzzer(15));
	}

	@Test
	public void for30itShouldBeFizzBuzz() {
		assertEquals("FizzBuzz", new FizzBuzzerStringReplacer().fizzBuzzer(30));
	}

	@Test
	public void for5ReturnFiveAsString() {
		assertEquals("5", new FizzBuzzerStringReplacer().fizzBuzzer(5));
	}
}
