package com.hshashid.datastructure;

/**
 * Custom queue interface designed to implement a data structure which
 * implements the FIFO access pattern
 * 
 * @author hshashid
 * 
 * @param <T>
 */
public interface Queue<T> {
	/**
	 * Method implementation should put and element at the end of the queue
	 * 
	 * @param element
	 */
	public void enque(T element);

	/**
	 * Method implementation should remove an element from the front of the
	 * queue. Returns a null if there are no more elements in the queue
	 * 
	 * @return
	 */
	public T deque();

	/**
	 * Method implementation should return true or false based on the number of
	 * elements in the queue
	 * 
	 * @return
	 */
	public boolean isEmpty();

}
