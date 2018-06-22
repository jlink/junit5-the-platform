package mixed;

import net.jqwik.api.*;
import net.jqwik.api.constraints.AlphaChars;
import upper.Upperizer;

class UpperizerProperties {

	Upperizer upperizer = new Upperizer();

	@Property
	@Label("All strings are upperized")
	boolean allStringsAreUpperized(@ForAll @AlphaChars String anyAlphaString) {
		return upperizer.upperize(anyAlphaString).equals(anyAlphaString.toUpperCase());
	}
}
