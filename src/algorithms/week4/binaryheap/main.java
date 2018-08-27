package algorithms.week4.binaryheap;

import java.util.Arrays;

import algorithms.week2.insertionsort.InsertionSort;
import algorithms.week2.shellsort.ShellSort;
import algorithms.week3.mergesort.MergeSort;

// Example of use LinkedList with Stack and Interator
public class main {
	public static void main(String[] args) {
		int tamanho = 6;
		BinaryHeap bi = new BinaryHeap(tamanho);
		for (int x = 0; x < tamanho; x++) {
			Double d = Math.random() * tamanho*10;
			bi.insert(d.intValue());
			System.out.print(", " + d.intValue());
		}

		System.out.println("----------------------------BinaryHeap");
		System.out.println(bi.toString());
		System.out.println(bi.delMax());
		System.out.println("Remove item: "+bi.toString());
		bi.insert(100);
		System.out.println(bi.toString());
		

//ex: BinaryHeap [s=[null, 58, 20, 18, 4, 8, 10]]
//		 58
//       /       \
//     20        18
//   /    \     /   \
//  4     8    10
   
	}
}
