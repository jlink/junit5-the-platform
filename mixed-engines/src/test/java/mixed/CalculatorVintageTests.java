package mixed;

import calculator.Calculator;
import org.junit.*;
import org.junit.jupiter.api.DisplayName;

public class CalculatorVintageTests {

	private Calculator calculator;

	@Before
	public void createCalculator() {
		calculator = new Calculator();
		System.out.println("Hello from JUnit 4");
	}

	@Test
	@DisplayName("Numbers can be added")
	public void numbersCanBeAdded() {
		Assert.assertEquals(7, calculator.add(4, 3));
	}
}
