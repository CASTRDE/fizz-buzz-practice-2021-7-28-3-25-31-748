package tdd.fizzbuzz;

public class FizzBuzz {
    public String countOff(int i) {
        String FIZZ = "Fizz", BUZZ = "Buzz", WHIZZ = "Whizz";
        if( i%3 == 0)
            return FIZZ;
        else if( i%5 == 0)
            return BUZZ;
        else if( i%7 == 0)
            return WHIZZ;
        else
            return String.valueOf(i);
    }
}
