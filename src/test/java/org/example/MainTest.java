package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
    /**
     * Methode die einen int übergeben bekommt und einen String returned.
     * - int teilobar durch 3 = "FIZZ"
     * - int teilbar durch 5 = "BUZZ"
     * - int teilbar durch 3&% = "FIZZBUZZ"
     * - Sonst int als String 4 = "4"
     */


    @Test
    void play_shouldReturnGivenIntAsString_WhenGiven4(){
        //GIVEN
        int input = 4;
        String expected = "4";
        //WHEN
        String actual = Main.play (input);
        //THEN
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void play_shouldReturnFizz_WhenGiven6(){
        //GIVEN
        int input = 6;
        String expected = "FIZZ";
        //WHEN
        String actual = Main.play(input);
        //THEN
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void play_shouldReturnBuzz_WhenGiven5(){
        //GIVEN
        int input = 5;
        String expected = "BUZZ";
        //WHEN
        String actual = Main.play(input);
        //THEN
        Assertions.assertEquals(expected, actual);

    }
    @Test
    void play_shouldReturn_FizzBUzz_WhenGiven15(){
        //Given
        int input = 15;
        String expected = "FIZZBUZZ";
        //WHEN
        String actual = Main.play(input);
        //THEN
        Assertions.assertEquals(expected, actual);
    }


// Alternative Test-Methode

@ParameterizedTest
@CsvSource(
        value = {
                "4, 4",
                "3, FIZZ",
                "6, FIZZ",
                "5, BUZZ",
                "15, FIZZBUZZ",
                "-3, FIZZ",
        }
)
    void playTest(int num, String expected){
        String actual = Main.play(num);
        Assertions.assertEquals(expected, actual);
    }
}