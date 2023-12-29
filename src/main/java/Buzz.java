public class Buzz implements StringReplacer {
	@Override
	public String fizzBuzzer(int i) {
		return i % 5 == 0 ? "Buzz" : Integer.toString(i);
	}
}
