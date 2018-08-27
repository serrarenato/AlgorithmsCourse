package algorithms.week3.mergesort;

import java.util.Arrays;

public class MergeSort {
	public static int interation= 0;
	public static void merge(Comparable[] a, Comparable[] aux, int lo, int mid, int hi) {
		aux = Arrays.copyOf(a, a.length);
		int baixo = lo;
		int medio = mid + 1;
//		for (int k = lo; k <= hi; k++) {
//			aux[k] = a[k];
//			interation++;
//		}
		for (int k = lo; k <= hi; k++) {
			if (baixo > mid) {
				a[k] = aux[medio];
				medio++;
			} else if (medio > hi) {
				a[k] = aux[baixo];
				baixo++;
			} else if (baixo > mid) {
				a[k] = aux[medio];
				medio++;
			} else if (baixo > mid) {
				a[k] = aux[medio];
				medio++;
			} else if (less(aux[medio], aux[baixo])) {
				a[k] = aux[medio];
				medio++;
			} else {
				a[k] = aux[baixo];
				baixo++;
			}
			interation++;
		}
	}

	public static void sort(Comparable[] a, Comparable[] aux, int lo, int hi) {
		if (hi <= lo)
			return;
		int mid = lo + (hi - lo) / 2;
		sort(a, aux, lo, mid);
		sort(a, aux, mid + 1, hi);
		merge(a, aux, lo, mid, hi);
	}

	private static boolean less(Comparable comparable1, Comparable comparable2) {
		if (comparable1.compareTo(comparable2) == -1)
			return true;
		return false;
	}
}
