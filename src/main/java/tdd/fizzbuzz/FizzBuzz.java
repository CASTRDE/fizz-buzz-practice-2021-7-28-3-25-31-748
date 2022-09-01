package tdd.fizzbuzz;

public class FizzBuzz {
    public String countOff(int i) {
        String FIZZ = "Fizz";
        if( i%3 == 0)
            return FIZZ;
        else
            return String.valueOf(i);
    }
}
