package mixed;

import net.jqwik.api.*;
import net.jqwik.api.constraints.AlphaChars;
import org.junit.jupiter.api.*;
import upper.Upperizer;

class UpperizerJupiterTests {

	Upperizer upperizer = new Upperizer();

	@Test
	@DisplayName("Strings are upperized")
	void allStringsAreUpperized() {
		Assertions.assertEquals("HALLO", upperizer.upperize("hallo"));
	}
}
