public class FizzBuzz {
    int number;
    int digit;
    int num = number;

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

    public String divisibleOrContainsThreeOrFive() {
        String str = Integer.toString(number);
        if(num%15==0)
            return "FizzBuzz";
        else if((num%3 == 0) || str.contains("3"))
            return "Fizz";
        else if((num%5 == 0) || str.contains("5"))
            return "Buzz";
        return "null";
    }

}

