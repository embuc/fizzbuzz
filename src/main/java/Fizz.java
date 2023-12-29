public class Fizz implements StringReplacer {
	@Override
	public String fizzBuzzer(int i) {
		return (i % 3 == 0) ? "Fizz" : String.valueOf(i);
	}
}
