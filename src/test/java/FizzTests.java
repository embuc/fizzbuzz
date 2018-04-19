import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FizzTests {

	@Test
	public void returnsStringOneOnIntInputOne() {
		StringReplacer fizzer = new FizzStringReplacer();
		assertEquals("1", fizzer .fizzBuzzer(1));
	}

}
