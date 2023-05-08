package stacksanddeques;

import java.util.ArrayDeque;
/**
 * 
 * @author S546551 Mahesh Kumar Nanganoori
 *
 * @param <E>
 */
public class AStack<E> {
	private ArrayDeque<E> myStack;

	/**
	 * No arg constructor and initialising array deque
	 */
	public AStack() {
		super();
		myStack = new ArrayDeque<E>();
	}
	/**
	 * Push method to push the elements in to a stack
	 * @param element is a collection
	 */
	public void push(E element)
	{
		myStack.push(element);
	}
	/**
	 * Pop() to remove and print the top element in stack
	 * @return top element
	 */
	
	public E pop()
	{
		return myStack.pop();
	}
	
	/**
	 * peek method to display the last element
	 * @return list
	 */
	public E peek() {
		return myStack.peek();
	}
	
	/**
	 * to display the size of the list
	 * @return returns size
	 */
	public int size() {
		return myStack.size();
	}
	/**
	 * isEMpty to check wheather list is empty
	 * @return
	 */
	public boolean isEmpty() {
		return myStack.isEmpty();
	}

	/**
	 * Getter method for stack
	 * @return stack
	 */
	public ArrayDeque<E> getMyStack() {
		return (ArrayDeque<E>) myStack;
	}
/**
 * setter method for stack	
 * @param myStack holds the whole stack items
 */

	public void setMyStack(ArrayDeque<Book> myStack) {
		this.myStack = (ArrayDeque<E>) myStack;
	}
	

}
