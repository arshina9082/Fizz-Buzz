public class FizzBuzz {
    int number;

    public FizzBuzz(int number) {
        this.number = number;
    }

    public String divisibleByThreeAndFive() {
        if (number <= 100) {
            if (number % 3 == 0)
                return "Fizz";
            else if (number % 5 == 0)
                return "Buzz";
            else
                return "null";
        }
        return "null";
    }
}
