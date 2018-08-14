package algorithms.week2.stack;

import java.util.Iterator;

public class LinkedQueueImpl<T> implements Queue<T> {
	private Node first, last;

	@Override
	public void enqueue(T s) {
		Node oldLast = last;
		last = new Node(s, null);
		if (isEmpty())
			first = last;
		else
			oldLast.next = last;
	}

	@Override
	public T dequeue() {
		T p = first.item;
		first = first.next;
		if (isEmpty())
			last = null;
		return p;
	}

	@Override
	public boolean isEmpty() {
		return first == null;
	}

	@Override
	public Iterator<T> iterator() {
		return new Iterator<T>() {
			private Node current = first;

			@Override
			public boolean hasNext() {
				return current != null;
			}

			@Override
			public T next() {
				T t = current.item;
				current = current.next;
				return t;
			}

		};
	}

	class Node {

		public Node(T item, Node next) {
			this.item = item;
			this.next = next;
		}

		T item;
		Node next;

		@Override
		public String toString() {
			return "Node :" + item;
		}
	}

}
