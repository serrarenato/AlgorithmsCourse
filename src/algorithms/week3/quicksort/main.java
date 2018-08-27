package algorithms.week3.quicksort;

import java.util.Arrays;

import algorithms.week2.insertionsort.InsertionSort;
import algorithms.week2.shellsort.ShellSort;
import algorithms.week3.mergesort.MergeSort;

// Example of use LinkedList with Stack and Interator
public class main {
	public static void main(String[] args) {
		int tamanho = 10;
		Integer[] s = new Integer[tamanho];
		for (int x = 0; x < s.length; x++) {
			Double d = Math.random() * 1000;
			s[x] = d.intValue();
		}
		Integer[] aux = Arrays.copyOf(s, tamanho);
		Integer[] a = Arrays.copyOf(s, tamanho);
		Integer[] b = Arrays.copyOf(s, tamanho);
		Integer[] q = Arrays.copyOf(s, tamanho);

		System.out.println(Arrays.toString(s));
		System.out.println("----------------------------QuickSort");
		QuickSort.sort(q);
		System.out.println(Arrays.toString(q));
		System.out.println("Interation QuickSort: " + QuickSort.interation);

		System.out.println("----------------------------MergeSort");
		MergeSort.sort(s, aux, 0, s.length - 1);
		System.out.println(Arrays.toString(s));

		System.out.println("Interation MergeSort: " + QuickSort.interation);

		System.out.println(Arrays.toString(s));
		System.out.println("----------------------------ShellSort");
		ShellSort.sort(a);
		System.out.println(Arrays.toString(a));

		System.out.println("----------------------------InsertionSort");
		InsertionSort.sort(b);
		System.out.println(Arrays.toString(b));

	}
}
