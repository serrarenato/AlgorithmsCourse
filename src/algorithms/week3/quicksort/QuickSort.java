package algorithms.week3.quicksort;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class QuickSort {
	public static int interation = 0;

	private static int partition(Comparable[] a, int lo, int hi) {
		int min = lo;
		int max = hi + 1;
		while (true) {
			while (less(a[min++], a[lo])) {
				if (min == hi)
					break;
				interation++;
			}
			while (less(a[lo], a[--max])) {
				if (max == lo)
					break;
				interation++;
			}

			if (min >= max)
				break;
			exchange(a, min, max);
			interation++;
		}
		exchange(a, lo, max);
		return max;
	}

	public static void sort(Comparable[] a) {
		shuffle(a);
		sort(a, 0, a.length - 1);
	}

	private static void sort(Comparable[] a, int lo, int hi) {
		if (hi < lo)
			return;
		interation++;
	
		int middle = partition(a, lo, hi);
		sort(a, lo, middle - 1);
		sort(a, middle + 1, hi);

	}

	private static boolean less(Comparable comparable1, Comparable comparable2) {
		if (comparable1.compareTo(comparable2) == -1)
			return true;
		return false;
	}

	private static void exchange(Comparable[] a, int change, int to) {
		Comparable changedTO = a[to];
		a[to] = a[change];
		a[change] = changedTO;
	}

	private static void shuffle(Comparable[] ar) {

		Random rnd = ThreadLocalRandom.current();
		for (int i = ar.length - 1; i > 0; i--) {
			int index = rnd.nextInt(i + 1);
			// Simple swap
			Comparable a = ar[index];
			ar[index] = ar[i];
			ar[i] = a;
		}
	}

}
