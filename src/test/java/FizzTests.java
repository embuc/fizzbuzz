import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;


@SuppressWarnings("javadoc")
@RunWith(JUnitParamsRunner.class)
public class FizzTests {

	@Test
	@Parameters({"1,1","2,2","3,Fizz","4,4","5,5","6,Fizz","7,7","8,8","9,Fizz","100,100","300,Fizz"})
	public void returnsFizzStringOnIntegerDividableWithThree(int inputInt, String expected) {
		StringReplacer fizzer = new FizzStringReplacer();
		assertEquals(expected, fizzer .fizzBuzzer(inputInt));
	}
}
