package algorithms.week2.shellsort;

import java.util.Arrays;

import algorithms.week2.insertionsort.InsertionSort;

// Example of use LinkedList with Stack and Interator
public class main {
	public static void main(String[] args) {
		int tamanho = 100;
		Integer[] s = new Integer[tamanho];
		for (int x = 0; x < s.length; x++) {
			Double d = Math.random() * 100;
			s[x] = d.intValue();
		}
		Integer[] d = Arrays.copyOf(s, tamanho);

		System.out.println(Arrays.toString(s));
		System.out.println("----------------------------ShellSort");
		ShellSort.sort(s);
		System.out.println(Arrays.toString(s));
		System.out.println(Arrays.toString(d));
		System.out.println("----------------------------InsertionSort");
		InsertionSort.sort(d);
		System.out.println(Arrays.toString(d));
	}
}
