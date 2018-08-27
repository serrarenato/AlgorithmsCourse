package algorithms.week4.binaryheap;

import java.util.Arrays;

public class BinaryHeap {
	Comparable[] s;
	int size = 0;

	public BinaryHeap(int size) {
		this.s = new Integer[size + 1];
	}

	public void insert(Comparable x) {
		s[++size] = x;
		swim(size);
	}

	private void swim(int k) {
		while (k > 1 && less(k / 2, k)) {
			exchange(k, k / 2);
			k = k / 2;
		}
	}

	private void sink(int k) {
		while (k * 2 <= this.size) {
			int filho = k * 2;
			if (filho < size && less(filho, filho + 1))
				filho++;
			if (!less(k, filho))
				break;
			exchange(k, filho);
			k = filho;
		}
	}

	public Comparable delMax() {
		Comparable max = s[1];
		exchange(1, size--);
		sink(1);
		s[size + 1] = null;
		return max;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	private boolean less(int comparable1, int comparable2) {
		if (s[comparable1].compareTo(s[comparable2]) == -1)
			return true;
		return false;
	}

	private void exchange(int change, int to) {
		Comparable changedTO = s[to];
		s[to] = s[change];
		s[change] = changedTO;
	}

	@Override
	public String toString() {
		return "BinaryHeap [s=" + Arrays.toString(s) + "]";
	}

}
