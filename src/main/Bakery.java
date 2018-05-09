package main;

import java.util.Scanner;



import basicCake.BasicCake;

import type.cake.BirthdayCake;
import type.cake.ChristmasCake;
import type.cake.WeddingCake;

public class Bakery {

	public static void main(String[] args) {

		int choice;
		
		Scanner sc = new Scanner(System.in);
		
		BasicCake c;

		do {
			System.out.println("ENTER CHOICE ");
			System.out.println("0: For Exit0");
			System.out.println("1: BirthDay Cake with candles");
			System.out.println("2: Wedding Cake with layering's ");
			System.out.println("3: Christmas Cake with message");
			
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				c = new BirthdayCake();
				c.bake();
				c.flavour();
				c.frost();
				((BirthdayCake) c).CandlesOnCake();

				break;

			case 2:
				c = new WeddingCake();
				c.bake();
				c.flavour();
				c.frost();
				((WeddingCake) c).Layering();

				break;
			case 3:
				c = new ChristmasCake();
				c.bake();
				c.flavour();
				c.frost();
				((ChristmasCake) c).MessageOnCake();
				break;
			 
			}

		} while (choice != 0);
		System.out.println("thank you !!!!!!!!!!");

	}

}
