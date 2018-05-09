package main;

import java.util.Scanner;



import basicCake.BasicCake;

import type.cake.BirthdayCake;
import type.cake.ChristmasCake;
import type.cake.WeddingCake;

public class Bakery {

	public static void main(String[] args) {

		int choice;
		System.out.println("enter choice !!!!!!");
		Scanner sc = new Scanner(System.in);
		
		BasicCake c;

		do {
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
			 default :
				 System.out.println("wrong input enter again ");
			}

		} while (choice != 0);

	}

}
