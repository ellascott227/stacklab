import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyStackTest<T> {

	MyStack<String> stack;
	String obj1;
	String obj2;
	String obj3;
	
	@BeforeEach
	void setUp() throws Exception {
		stack = new MyStack<String>();
		obj1 = "one";
		obj2 = "two";
		obj3 = "three";
		
		
	}

	@Test
	void testStack() {
		assertTrue(stack.isEmpty());
		stack.push(obj1);
		assertEquals(obj1, stack.top());
		
		stack.push(obj2);
		assertEquals(obj2, stack.pop());
		assertEquals(obj1, stack.top());
		
		stack.push(obj3);
		assertEquals(obj3, stack.top());
		assertEquals(obj3, stack.pop());
		
		assertFalse(stack.isEmpty());
		assertEquals(obj1, stack.pop());
		assertTrue(stack.isEmpty());
	}
	
	@Test
	void testUnderflow() {
		assertTrue(stack.isEmpty());
		assertThrows(StackUnderFlowException.class,
				()->{
					stack.top();
				});
		assertThrows(StackUnderFlowException.class,
				()->{
					stack.pop();
				});
		
		stack.push(obj1);
		assertEquals(obj1, stack.pop());
		
		assertThrows(StackUnderFlowException.class,
				()->{
					stack.top();
				});
		assertThrows(StackUnderFlowException.class,
				()->{
					stack.pop();
				});
	}
}


