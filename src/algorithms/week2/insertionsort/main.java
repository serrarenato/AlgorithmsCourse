package algorithms.week2.insertionsort;

import java.util.Arrays;

// Example of use LinkedList with Stack and Interator
public class main {
	public static void main(String[] args) {
		Integer[] s = new Integer[10];
		for (int x = 0; x < s.length; x++) {
			Double d = Math.random() * 100;
			s[x] = d.intValue();
		}

		System.out.println(Arrays.toString(s));
		System.out.println("----------------------------");
		InsertionSort.sort(s);
		System.out.println(Arrays.toString(s));
	}
}
