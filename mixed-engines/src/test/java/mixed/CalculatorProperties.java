package mixed;

import calculator.Calculator;
import net.jqwik.api.*;

class CalculatorProperties {

	Calculator calculator = new Calculator();

	@Property
	@Label("All numbers can be add")
	boolean allNumbersCanBeAdded(@ForAll int first, @ForAll int second) {
		//System.out.println("Hello from jqwik");
		return calculator.add(first, second) == first + second;
	}
}
