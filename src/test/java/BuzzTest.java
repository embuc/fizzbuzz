
import org.junit.Assert;
import org.junit.Test;


public class BuzzTest {

    @Test
    public void returnBuzzStringOnNumberDivisibleByFive() {
        Assert.assertEquals("Buzz", new Buzz().fizzBuzzer(0));
        Assert.assertEquals("Buzz", new Buzz().fizzBuzzer(5));
        Assert.assertEquals("Buzz", new Buzz().fizzBuzzer(15));
        Assert.assertEquals("3", new Buzz().fizzBuzzer(3));
        Assert.assertEquals("9", new Buzz().fizzBuzzer(9));
    }

}
