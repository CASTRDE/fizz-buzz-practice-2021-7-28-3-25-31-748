package tdd.fizzbuzz;

public class FizzBuzz {
    public String countOff(int i) {
        String FIZZ = "Fizz", BUZZ = "Buzz", WHIZZ = "Whizz";
        String result = "";

        if( i%3 == 0) {
            result+=FIZZ;
        }
        if( i%5 == 0){
            result+=BUZZ;
        }
        if( i%7 == 0){
            result+=WHIZZ;
        }
        if(result.length() == 0){
            result=String.valueOf(i);
        }

        return result;
    }
}
