package org.zia.training.java.forloopexample;

/*public class ForLoopExample {

	public static void main(String[] args) {
		for(int i=10; i>=1; i--){
            System.out.println("The value of i is: "+i);
		}
		for(int i=0; i<=10; i+=2) {
			System.out.println("The value of i is " +i);
		}
	}*/

public class ForLoopExample {

	public static void main(String args[]) {
		int[] numbers = { 10, 20, 30, 40, 50 };

		for (int x : numbers) {
			System.out.print(x);
			System.out.print(",");
		}
		System.out.print("\n");
		String[] names = { "James", "Larry", "Tom", "Lacy" };

		for (String name : names) {
			System.out.print(name);
			System.out.print(",");
		}
	}
}

