package jupiter;

import java.util.*;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;


@DisplayName("A stack")
class TestingAStack__2 {

	private Stack<Object> stack;

	@Test
	@DisplayName("is instantiated with new Stack()")
	void isInstantiatedWithNew() {
		new Stack<>();
	}

	@Nested
	@DisplayName("when new")
	class WhenNew {

		@BeforeEach
		void init() {
			stack = new Stack<>();
		}

		@Test
		@DisplayName("is empty")
		void isEmpty() {
			Assertions.assertTrue(stack.isEmpty());
		}

		@Test
		@DisplayName("throws EmptyStackException when popped")
		void throwsExceptionWhenPopped() {
			assertThrows(EmptyStackException.class, () -> stack.pop());
		}

		@Test
		@DisplayName("throws EmptyStackException when peeked")
		void throwsExceptionWhenPeeked() {
			assertThrows(EmptyStackException.class, () -> stack.peek());
		}

		@Nested
		@DisplayName("after pushing an element")
		class AfterPushing {

			String anElement = "an element";

			@BeforeEach
			void init() {
				stack.push(anElement);
			}

			@Test
			@DisplayName("it is no longer empty")
			void isEmpty() {
				Assertions.assertFalse(stack.isEmpty());
			}

			@Test
			@DisplayName("returns the element when popped and is empty")
			void returnElementWhenPopped() {
				Assertions.assertEquals(anElement, stack.pop());
				Assertions.assertTrue(stack.isEmpty());
			}

			@Test
			@DisplayName("returns the element when peeked but remains not empty")
			void returnElementWhenPeeked() {
				Assertions.assertEquals(anElement, stack.peek());
				Assertions.assertFalse(stack.isEmpty());
			}
		}
	}
}
