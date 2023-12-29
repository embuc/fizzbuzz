public class App {
	public static void main(String[] args) {
		NumberGenerator generator = new NumberGenerator();
		String[] numbers = generator.numbers().split(",");
		StringReplacer fizzBuzz = new FizzBuzz();
		StringReplacer buzz = new Buzz();
		StringReplacer fizz = new Fizz();

		for (String number : numbers) {
			int num = Integer.valueOf(number);
			number = fizzBuzz.fizzBuzzer(num);
			if (number.equals("FizzBuzz")) {
				System.out.println(number);
			} else {
				number = fizz.fizzBuzzer(num);

				if (number.equals("Fizz")) {
					System.out.println(number);
				} else {
					number = buzz.fizzBuzzer(num);
					if (number.equals("Buzz")) {
						System.out.println(number);
					} else {
						System.out.println(number);
					}
				}
			}
		}
	}
}
