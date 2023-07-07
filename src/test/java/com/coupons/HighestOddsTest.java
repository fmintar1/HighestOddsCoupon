package com.coupons;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class HighestOddsTest {
    @Test
    public void test1() {
        //When
        int expected = HighestOdds.highestProbability(24);

        //Then
        assertEquals(5, expected);
    }
    @Test
    public void test2() {
        //When
        int expected = HighestOdds.highestProbability(90);

        //Then
        assertEquals(1, expected);
    }
    @Test
    public void test3() {
        //When
        int expected = HighestOdds.highestProbability(9);

        //Then
        assertEquals(9, expected);
    }
    @Test
    public void test4() {
        //When
        int expected = HighestOdds.highestProbability(89);

        //Then
        assertEquals(2, expected);
    }
}
