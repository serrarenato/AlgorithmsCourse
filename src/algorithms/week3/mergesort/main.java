package algorithms.week3.mergesort;

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
		Integer[] aux = Arrays.copyOf(s, tamanho);

		System.out.println(Arrays.toString(s));
		System.out.println("----------------------------MergeSort");
		MergeSort.sort(s, aux,0, s.length);
		System.out.println(Arrays.toString(s));


	}
}
