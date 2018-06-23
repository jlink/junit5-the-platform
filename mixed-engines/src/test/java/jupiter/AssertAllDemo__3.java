package jupiter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class AssertAllDemo__3 {

	@Test
	void assertionGroup() {

		assertAll("Three asserts as a group", //
				() -> assertEquals(4, 17), //
				() -> assertTrue(false, "Second test also fails"), //
				() -> assertEquals(4, 4) //
		);

	}

}
