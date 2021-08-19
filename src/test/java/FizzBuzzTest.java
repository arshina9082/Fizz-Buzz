import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class FizzBuzzTest {
    @Test
    void toCheckIfNumberIsDivisibleByThree()
    {
        FizzBuzz obj = new FizzBuzz(6);
        String expectedOut = "Fizz";
        String actualOut = obj.divisibleByThreeAndFive();
        assertEquals(expectedOut,actualOut);

    }

    @Test
    void toCheckIfNumberIsDivisibleByFive()
    {
        FizzBuzz obj = new FizzBuzz(10);
        String expectedOut = "Buzz";
        String actualOut = obj.divisibleByThreeAndFive();
        assertEquals(expectedOut,actualOut);

    }

    @Test
    void toCheckIfNumberIsDivisibleByNeitherThreeNorFive()
    {
        FizzBuzz obj = new FizzBuzz(61);
        String expectedOut = "null";
        String actualOut = obj.divisibleByThreeAndFive();
        assertEquals(expectedOut,actualOut);

    }

    @Test
    void toCheckIfNumberContainsThreeOrDivisibleByThree()
    {
        FizzBuzz obj = new FizzBuzz(27);
        String expectedOut = "Fizz";
        String actualOut = obj.divisibleOrContainsThreeOrFive();
        assertEquals(expectedOut,actualOut);

    }

    @Test
    void toCheckIfNumberContainsFiveOrDivisibleByFive()
    {
        FizzBuzz obj = new FizzBuzz(50);
        String expectedOut = "Buzz";
        String actualOut = obj.divisibleOrContainsThreeOrFive();
        assertEquals(expectedOut,actualOut);

    }

    @Test
    void toCheckIfNumberIsDivisibleByThreeAndFive()
    {
        FizzBuzz obj = new FizzBuzz(60);
        String expectedOut = "FizzBuzz";
        String actualOut = obj.divisibleOrContainsThreeOrFive();
        assertEquals(expectedOut,actualOut);

    }

    void toCheckIfNumberIsNotDivisibleByThreeNorFive()
    {
        FizzBuzz obj = new FizzBuzz(61);
        String expectedOut = "null";
        String actualOut = obj.divisibleOrContainsThreeOrFive();
        assertEquals(expectedOut,actualOut);

    }
}
