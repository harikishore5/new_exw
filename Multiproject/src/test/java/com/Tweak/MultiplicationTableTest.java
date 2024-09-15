package com.Tweak;

import org.junit.Test;
import static org.junit.Assert.*;

public class MultiplicationTableTest {

    @Test
    public void testMultiplication() {
        // Assuming we have a method that generates multiplication results
        int number = 5;
        int expected = 25; // 5 x 5 = 25
        assertEquals(expected, number * 5);
    }
}
