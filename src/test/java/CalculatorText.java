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
}
