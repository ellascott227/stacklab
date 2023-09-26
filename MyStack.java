
	
public class MyStack<T>
{
	Node<T> head;
	
	private static class Node<T> {
		public T data;
		public Node<T> point;
		
		public Node(T data, Node<T> point) {
			this.data = data;
			this.point = point;
		}
			
	}
	
	public MyStack()
	{
		Node<T> head = new Node<T>(null, null);
	}

	/**
	 * Pushes an element to the stack
	 * @param val
	 */
	public void push(T val)
	{
		Node<T> new_val = new Node<T>(val, head.point);
		head.point = new_val;
	}

	/**
	 * Throws stack underflow exception if empty
	 * @return the top element on the stack
	 */
	public T top() throws StackUnderFlowException
	{
		if(isEmpty()) {
			throw new StackUnderFlowException();
		}
		
		return head.point.data;
	}

	/**
	 * Pops the top element of the stack and returns it.
	 * Throws stack underflow exception if empty
	 * @return the popped element from the stack
	 */
	public T pop() throws StackUnderFlowException
	{
		
		if(head.point == null) {
			throw new StackUnderFlowException();
		}
		
		T temp = head.point.data;
		head.point = head.point.point;
		
		return temp;
	}

	/**
	 * 
	 * @return true if the stack is empty
	 */
	public boolean isEmpty()
	{
		if(head.point == null) {
			return true;
		}
		else {
			return false;
		}
	}

}