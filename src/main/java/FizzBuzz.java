public class FizzBuzz implements StringReplacer{
	@Override
	public String fizzBuzzer(int i) {
		if (i % 5 == 0 && i % 3 == 0) {
			return "FizzBuzz";
		}
		return String.valueOf(i);
	}
}
