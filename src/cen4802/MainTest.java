package cen4802;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    @DisplayName("Fibonacci of 5")
    void testFibonacci5() {
        assertEquals(5, Main.fibonacci(5));
    }
    @Test
    @DisplayName("Fibonacci of 10, 15 & 20")
    void testFibonacci10_15_20() {
        assertAll(() -> assertEquals(55, Main.fibonacci(10)),
                () -> assertEquals(610, Main.fibonacci(15)),
                () -> assertEquals(6765, Main.fibonacci(20)));
    }

    @Test
    @DisplayName("Fibonacci of 30")
    void testFibonacci30() {
        assertEquals(832040, Main.fibonacci(30));
    }
}