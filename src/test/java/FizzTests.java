import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzTests {

	@ParameterizedTest
	@CsvSource({"1,1","2,2","3,Fizz","4,4","5,5","6,Fizz","7,7","8,8","9,Fizz","100,100","300,Fizz"})
	public void returnsFizzStringOnIntegerDividableWithThree(int inputInt, String expected) {
		StringReplacer fizzer = new Fizz();
		assertEquals(expected, fizzer .fizzBuzzer(inputInt));
	}
}
