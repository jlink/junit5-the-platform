package mixed;

import calculator.Calculator;
import org.junit.jupiter.api.*;

class UpperizerJupiterTests {

	Calculator calculator = new Calculator();

	@Test
	@DisplayName("Numbers can be added")
	void numbersCanBeAdded() {
		Assertions.assertEquals(7, calculator.add(4, 3));
	}
}
