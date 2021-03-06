package algorithms.week3.mergesort;

import java.util.Arrays;

import algorithms.week2.insertionsort.InsertionSort;
import algorithms.week2.shellsort.ShellSort;

// Example of use LinkedList with Stack and Interator
public class main {
	public static void main(String[] args) {
		int tamanho = 1000;
		Integer[] s = new Integer[tamanho];
		for (int x = 0; x < s.length; x++) {
			Double d = Math.random() * 1000;
			s[x] = d.intValue();
		}
		Integer[] aux = Arrays.copyOf(s, tamanho);
		Integer[] a = Arrays.copyOf(s, tamanho);
		Integer[] b = Arrays.copyOf(s, tamanho);



		System.out.println(Arrays.toString(s));
		System.out.println("----------------------------MergeSort");
		MergeSort.sort(s, aux, 0, s.length - 1);
		System.out.println(Arrays.toString(s));
		
		System.out.println("Interation MergeSort: " + MergeSort.interation);

		System.out.println(Arrays.toString(s));
		System.out.println("----------------------------ShellSort");
		ShellSort.sort(a);
		System.out.println(Arrays.toString(a));

		System.out.println("----------------------------InsertionSort");
		InsertionSort.sort(b);
		System.out.println(Arrays.toString(b));
		
	}
}
