package algorithms.week2.queue;
// Example of use LinkedList with Stack
public class main {
	public static void main(String[] args) {
		StackOfString s = new LinkedStackOfStringImpl();
		s.push("TO");
		s.push("BE");
		s.push("OR");
		s.push("NOT");
		s.push("BE");
		while (!s.isEmpty())
			System.out.println(s.pop());
	}
}
