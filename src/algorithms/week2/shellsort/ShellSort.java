package algorithms.week2.shellsort;

public class ShellSort {
	public static void sort(Comparable[] a) {
		int tamanho = a.length;

		int h = 1;
		while (h <= tamanho / 3)
			h = 3 * h + 1;
		int interation = 0;
		// Shell Sort
		while (h >= 1) {
			// InsertionSort
			for (int x = h; x < tamanho; x++) {
				// change to back one by one the order of array until find one bigger than
				// current.
				for (int y = x; y >= h; y = y - h) {
					interation++;
					if (less(a[y], a[y - h]))
						exchange(a, y, y - h);
					else
						break;
				}
			}
			h = h / 3;
		}
		// --- /InsertionSort
		System.out.println("Number of Interation: " + interation);
	}

	private static void exchange(Comparable[] a, int change, int to) {
		Comparable changedTO = a[to];
		a[to] = a[change];
		a[change] = changedTO;
	}

	private static boolean less(Comparable comparable1, Comparable comparable2) {
		if (comparable1.compareTo(comparable2) == -1)
			return true;
		return false;
	}
}
