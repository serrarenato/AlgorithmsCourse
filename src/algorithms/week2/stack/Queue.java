package algorithms.week2.stack;

public interface Queue<T> extends Iterable<T> {
	public T dequeue();

	public void enqueue(T s);

	public boolean isEmpty();
}

