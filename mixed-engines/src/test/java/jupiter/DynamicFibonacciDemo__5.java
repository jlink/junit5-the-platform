package jupiter;

import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;


class DynamicFibonacciDemo__5 {

    @TestFactory
    @DisplayName("all Fibonaccis are odd")
    Stream<DynamicTest> allFibonaccisAreOdd() {
        return IntStream.range(1, 20).boxed()
                .map(this::fibonacci)
                .map(aFibonacci -> dynamicTest("Fibonacci = " + aFibonacci, () -> isOdd(aFibonacci)));

    }

    void isOdd(int candidate) {
        assertTrue(candidate % 2 != 0);
    }


    int fibonacci(int n) {

//        sleepABit();

        if (n < 2)
            return n;
        return fibonacci(n-1) + fibonacci(n-2);
    }


    private void sleepABit() {
        try {
            Thread.sleep(10L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
