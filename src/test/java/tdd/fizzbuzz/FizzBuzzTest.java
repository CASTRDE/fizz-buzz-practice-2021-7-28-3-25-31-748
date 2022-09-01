package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    void should_return_number_when_countOff_given_1() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expected = "1";

        //when
        String actual = fizzBuzz.countOff(1);

        //then
        assertEquals(expected, actual);
    }

    @Test
    void should_return_fizz_when_countOff_multiple_of_3() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expected = "Fizz";

        //when
        String actual = fizzBuzz.countOff(3);

        //then
        assertEquals(expected, actual);
    }

    @Test
    void should_return_buzz_when_countOff_multiple_of_5() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expected = "Buzz";

        //when
        String actual = fizzBuzz.countOff(5);

        //then
        assertEquals(expected, actual);
    }
//Notes
    //fizz = 3
    //buzz = 5
    //whizz = 7

}
