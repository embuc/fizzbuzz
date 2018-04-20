@SuppressWarnings("javadoc")
public class NumberGenerator {


	public String numbers() {
		String result = "1";
		for( int i = 2; i <= 100; i++) {
			result = result + "," + String.valueOf(i);
		}
		return result;
	}
}
