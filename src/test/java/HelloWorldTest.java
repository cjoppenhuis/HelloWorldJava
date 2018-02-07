import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class HelloWorldTest {

    @Test
    public void testCountFunction() throws Exception {
        HelloWorld helloWorld = new HelloWorld();

        int firstNumber = 1;
        int secondNumber = 2;

        int answerOfFunction = helloWorld.countTwoNumbers(firstNumber, secondNumber);

        Assert.assertThat(answerOfFunction, CoreMatchers.is(3));
    }

}
