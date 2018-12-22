package org.zia.training.java.testarray;

public class TestArray {

	public static void main(String[] args) {

		System.out.println("Index\tValue");
		double[] myList = { 1.9, 2.9, 3.4, 3.5 };
		// Print all the array elements
		for (int i = 0; i < myList.length; i++) {
			System.out.println(i + "\t" + myList[i] + " ");
		}

		System.out.println();
		// Summing all elements
		double total = 0;
		for (int i = 0; i < myList.length; i++) {
			total += myList[i];
		}
		System.out.println("Total is=" + total);
		System.out.println();
		// Finding the largest element
		double max = myList[0];
		for (int i = 0; i < myList.length; i++) {
			if (myList[i] > max)
				max = myList[i];
		}
		System.out.println("Max number is " + max);
		
		System.out.println();
		
		// Finding the minimum element
		double min = myList[0];
		for (int i = 0; i < myList.length; i++) {
			if (myList[i] < min)
				min = myList[i];
		}
		System.out.println("Min number is " + min);
		
		System.out.println();
		
		//multidemensional array
		int firstarray[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8, 9 } };
		int secondarray[][] = { { 10, 12, 13, 19 }, { 23, 45 }, { 45, 50, 70, 80 } };

		System.out.println("This is the first array");
		display(firstarray);
		System.out.println();
		System.out.println("This is the second array");
		display(secondarray);

	}

	public static void display(int x[][]) {
		for (int row = 0; row < x.length; row++) {
			for (int column = 0; column < x[row].length; column++) {
				System.out.print(x[row][column] + "\t");
			}
			System.out.println();
		}
	}
}
