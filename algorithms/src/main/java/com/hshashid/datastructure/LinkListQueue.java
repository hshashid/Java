package com.hshashid.datastructure;

import java.util.LinkedList;

public class LinkListQueue<T> implements Queue<T> {

	private LinkedList<T> data;

	public LinkListQueue() {
		data = new LinkedList<T>();
	}

	public void enque(T element) {
		data.addLast(element);
	}

	public T deque() {
		if (isEmpty()) {
			return null;
		} else {
			return data.removeFirst();
		}
	}

	public boolean isEmpty() {
		return (data.size() == 0);
	}

}
