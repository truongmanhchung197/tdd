import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTranslateTest {

    @Test
    public void testFizzBuzz15() {
        int number = 15;
        String expected = "FizzBuzz";
        String result = FizzBuzzTranslate.FizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    public void testFizzBuzz21() {
        int number = 21;
        String expected = "Fizz";
        String result = FizzBuzzTranslate.FizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    public void testFizzBuzz65() {
        int number = 65;
        String expected = "Buzz";
        String result = FizzBuzzTranslate.FizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    public void testFizzBuzz34() {
        int number = 34;
        String expected = "thirty four";
        String result = FizzBuzzTranslate.FizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    public void testFizzBuzz0() {
        int number = 0;
        String expected = "FizzBuzz";
        String result = FizzBuzzTranslate.FizzBuzz(number);
        assertEquals(expected, result);
    }
}