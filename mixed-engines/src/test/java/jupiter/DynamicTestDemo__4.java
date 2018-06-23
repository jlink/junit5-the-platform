package jupiter;

import java.util.*;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.DynamicTest.*;


class DynamicTestDemo__4 {

	@TestFactory
	@DisplayName("A dynamic test collection")
	Collection<DynamicTest> dynamicTestCollection() {
		return Arrays.asList( //
				dynamicTest("test1", () -> assertTrue(true)), //
				dynamicTest("test2", () -> { } //
			) //
		);
	}

}
