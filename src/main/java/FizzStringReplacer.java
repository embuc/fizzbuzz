@SuppressWarnings("javadoc")
public class FizzStringReplacer implements StringReplacer{

	@Override
	public String fizzBuzzer(int i) {
		if(i%3 == 0) {
			return "Fizz";
		}
		return String.valueOf(i);
	}

}
