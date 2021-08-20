public class FizzBuzz {
    int number;
    int digit;

    public FizzBuzz(int number) {
        this.number = number;
    }

    public String divisibleByThreeOrFive() {
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

    public String divisibleOrContainsThreeOrFive() {
        String str = Integer.toString(number);
        if(number%15==0)
            return "FizzBuzz";
        else if((number%3 == 0) || str.contains("3"))
            return "Fizz";
        else if((number%5 == 0) || str.contains("5"))
            return "Buzz";
        return "null";
    }

}

