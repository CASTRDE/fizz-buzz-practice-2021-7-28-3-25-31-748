package tdd.fizzbuzz;

public class FizzBuzz {
    public String countOff(int i) {
        if( i%3 == 0)
            return "Fizz";
        else
            return String.valueOf(i);
    }
}
