package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    void should_return_number_when_countOf_given_1() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expected = "1";

        //when
        String actual = fizzBuzz.countOff(1);

        //then
        assertEquals(expected, actual);
    }

    @Test
    void should_return_fizz_when_countOf_multiple_of_3() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expected = "fizz";

        //when
        String actual = fizzBuzz.countOff(3);

        //then
        assertEquals(expected, actual);
    }

//    @Test
//    void should_return_number_when_countOf_given_1() {
//        //given
//
//        //when
//
//        //then
//    }
}
