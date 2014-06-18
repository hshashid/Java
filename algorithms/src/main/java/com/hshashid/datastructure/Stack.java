package com.hshashid.datastructure;

/**
 * Custom stack interface designed to implement a data structure which
 * implements the LIFO access pattern
 * 
 * @author hshashid
 * 
 * @param <T>
 */
public interface Stack<T> {
	/**
	 * Method implementation should push an element to the top of the stack
	 * 
	 * @param element
	 */
	public void push(T element);

	/**
	 * Method implementation should pop an element from the top of the stack
	 * 
	 * @param element
	 * @return
	 */
	public T pop(T element);

	/**
	 * Method implementation should show the element at the top of the stack
	 * without actually removing it from the stack
	 * 
	 * @return
	 */
	public T peek();
	
	/**
	 * Method implementation should return true or false based on the number
	 * of elements in the stack
	 * 
	 * @return
	 */
	public boolean isEmpty();
}
