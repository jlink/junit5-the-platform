package mixed;

import calculator.Calculator;
import net.jqwik.api.*;

class CalculatorProperties {

	Calculator calculator = new Calculator();

	@Property
	@Label("All numbers can be add")
	boolean allStringsAreUpperized(@ForAll int first, @ForAll int second) {
		return calculator.add(first, second) == first + second;
	}
}