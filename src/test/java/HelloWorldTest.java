import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class HelloWorldTest {

    @Test
    public void testCountFunction() throws Exception {
        HelloWorld helloWorld = new HelloWorld();

        int firstNumber = 1;
        int secondNumber = 2;
        int thirdNumber = 3;

        int answerOfFunction = helloWorld.countTwoNumbers(firstNumber, secondNumber);
        int answerAgainFunction = helloWorld.countThreeNumbers(firstNumber, secondNumber, thirdNumber);

        Assert.assertThat(answerOfFunction, CoreMatchers.is(3));
        Assert.assertThat(answerAgainFunction, CoreMatchers.is(6));
    }

}
