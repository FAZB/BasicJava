package org.zia.training.java.efthenelse;

import java.util.Scanner;

public class MyPlayGround {

	public static void main(String[] args) {
		int monkeyNum=10;
		String word = "little monkeys";
		while (monkeyNum>0) {
			/*if(monkeyNum ==1) {
				word = "little monkeys";
			}*/
			System.out.println(monkeyNum+ " "+word+" jumping on the bed. ");
			System.out.println("One fell down and bumped his head.");
			System.out.println("Mama called the doctor and the doctor said, 'no more monkeys jumping on the bed'.");
			--monkeyNum;
			System.out.println("---------------------------------------");
			if(monkeyNum==0) {
				System.out.println("No more monkeys jumping on the bed");
			}
		} 
	}
}
