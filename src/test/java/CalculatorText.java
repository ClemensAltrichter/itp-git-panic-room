//package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void add_works() {
        assertEquals(5, Calculator.add(2, 3));
    }

    @Test
    void divide_works() {
        assertEquals(5, Calculator.divide(10, 2));
    }

    @Test
    void divide_works2() {
        assertEquals(6, Calculator.divide(48, 8));
    }
    @Test
    void divide_works3() {
        assertEquals(null, Calculator.divide(48, 0));
    }
}
