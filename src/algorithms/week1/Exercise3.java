package algorithms.week1;

import java.util.Arrays;
//Successor with delete. Given a set of nn integers S = { 0, 1, ... , n-1 } and a sequence of requests of the following form:
//
//Remove x from S
//Find the successor of x: the smallest y in S such that y >=x
//design a data type so that all operations (except construction) take logarithmic time or better in the worst case.
public class Exercise3 {
	public static void main(String[] args) {
		int n = 10; // length of array
		Integer[] numbers = initialize(n);
		printer(numbers);
		//numbers = deletandGetSmallerNumber(3, numbers);
		numbers = deletandGetSmallerNumberBinarySearch(3, numbers);
		printer(numbers);
	}
	// with Algorithm N
	public static Integer[] deletandGetSmallerNumber(int n, Integer[] numbers) {
		int smallerNumber = 0;
		Integer[] numbersNew = new Integer[numbers.length - 1];
		for (int x = 0; x < numbers.length; x++) {
			if (x > n)
				numbers[x - 1] = numbers[x];
			if (x == n)
				smallerNumber = numbers[x + 1];
		}
		System.out.println("Smaller Number: " + smallerNumber);
		System.arraycopy(numbers, 0, numbersNew, 0, numbers.length - 1);

		return numbersNew;
	}
	// with Algorithm better than N
	public static Integer[] deletandGetSmallerNumberBinarySearch(int n, Integer[] numbers) {
		int smallerNumber = 0;
		Integer[] numbersNew = new Integer[numbers.length - 1];
		boolean continuar=true;
		int posicao=numbers.length/2;
		while(continuar) {			
			if (numbers[posicao] > n)
				posicao=posicao-numbers.length/4;
			if (numbers[posicao] < n)
				posicao=posicao+numbers.length/4;
			if (numbers[posicao] == n) {
				smallerNumber = numbers[posicao + 1];
				continuar=false;
			}
		}
		System.out.println("Smaller Number: " + smallerNumber);
		System.arraycopy(numbers, posicao+1, numbersNew, posicao, numbers.length-1-posicao);
		System.arraycopy(numbers, 0, numbersNew, 0, posicao);
		

		return numbersNew;
	}


	public static Integer[] initialize(int n) {
		Integer[] numbers = new Integer[n];
		for (int x = 0; x < n; x++)
			numbers[x] = x;
		return numbers;
	}

	public static void printer(Integer[] a) {
		System.out.println(Arrays.toString(a));
	}
}
