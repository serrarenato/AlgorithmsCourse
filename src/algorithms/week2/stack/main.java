package algorithms.week2.stack;

import java.util.Iterator;

// Example of use LinkedList with Stack and Interator
public class main {
	public static void main(String[] args) {
		Queue<String> s = new LinkedQueueImpl<>();
		s.enqueue("TO");
		s.enqueue("BE");
		s.enqueue("OR");
		s.enqueue("NOT");
		s.enqueue("BE");
		Iterator<String> iterator = s.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("----------------------------");
		while (!s.isEmpty())
			System.out.println(s.dequeue());
	}
}
