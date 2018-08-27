package algorithms.week2.insertionsort;

public class InsertionSort {
	public static void sort(Comparable[] a) {
		int tamanho = a.length;
		int interation = 0;
		for (int x = 0; x < tamanho; x++) {
			// change to back one by one the order of array until find one bigger than current.
			for (int y = x; y > 0; y--) {
				interation++;
				if (less(a[y], a[y - 1]))
					exchange(a, y, y - 1);
				else
					break;
			}
		}
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
