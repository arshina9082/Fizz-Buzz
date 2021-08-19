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
}
