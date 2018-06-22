package mixed;

import org.junit.*;
import org.junit.jupiter.api.DisplayName;
import upper.Upperizer;

public class UpperizerVintageTests {

	Upperizer upperizer = new Upperizer();

	@Test
	@DisplayName("Strings are upperized")
	public void allStringsAreUpperized() {
		Assert.assertEquals("HALLO", upperizer.upperize("hallo"));
	}
}
