package mixed;

import calculator.Calculator;
import org.junit.*;
import org.junit.jupiter.api.DisplayName;

public class UpperizerVintageTests {

	Calculator calculator = new Calculator();

	@Test
	@DisplayName("Numbers can be added")
	public void numbersCanBeAdded() {
		Assert.assertEquals(7, calculator.add(4, 3));
	}
}
