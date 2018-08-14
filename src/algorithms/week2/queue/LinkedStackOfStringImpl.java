package algorithms.week2.queue;

public class LinkedStackOfStringImpl implements StackOfString {
	private Node first = null;

	@Override
	public String pop() {
		String p = first.item;
		first = first.next;
		return p;
	}

	@Override
	public void push(String s) {
		Node oldFirst = first;
		first = new Node(s, oldFirst);
	}

	@Override
	public boolean isEmpty() {
		return first == null;
	}
	@Override
	public String toString() {
		return first.item;
	}

	class Node {

		public Node(String item, Node next) {
			this.item = item;
			this.next = next;
		}

		String item;
		Node next;
		@Override
		public String toString() {
			return "Node :" + item;
		}
	}
	

}
