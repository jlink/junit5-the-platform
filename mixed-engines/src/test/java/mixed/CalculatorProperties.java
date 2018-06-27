package mixed;

import calculator.Calculator;
import net.jqwik.api.*;

class CalculatorProperties {

	Calculator calculator = new Calculator();

	CalculatorProperties() {
		System.out.println("Hello from jqwik");
	}

	@Property
	@Label("All numbers can be add")
	boolean allNumbersCanBeAdded(@ForAll int first, @ForAll int second) {
		return calculator.add(first, second) == first + second;
	}
}
