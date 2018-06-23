package mixed;

import calculator.Calculator;
import org.junit.jupiter.api.*;

class CalculatorJupiterTests {

	private Calculator calculator;

	@BeforeEach
	void createCalculator() {
		calculator = new Calculator();
		System.out.println("Hello from JUnit 5");
	}

	@Test
	@DisplayName("Numbers can be added")
	void numbersCanBeAdded() {
		Assertions.assertEquals(7, calculator.add(4, 3));
	}
}
