package util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import model.Diamond;
import model.Necklace;
import model.PreciousStone;

public class DiamondNecklaceMaker {
	
	Scanner scanner = new Scanner(System.in);
	
	//Metod, dlya vvoda vesa i chistoty brillianta
	public void makeNecklace(Necklace<? extends PreciousStone> n) {
		ArrayList<Diamond> necklace = new ArrayList<Diamond>();
		System.out.println("How many diamonds do you need?");
		int a = scanner.nextInt();
		for(int b = 0; b < a; b++) {
			System.out.println("Enter how much this diamond weights");
			double weight = scanner.nextDouble();
			System.out.println("Enter the diamond's clarity");
			String clarity = scanner.next();
			Diamond d = new Diamond(Diamond.NAME, Diamond.COLOR, weight, 
					Diamond.PRICEFORUNIT, clarity);
			System.out.println(d.toString() + " It's price is " + d.countPrice() + "\u0024");
			necklace.add(d);
		}
		//Raschyot tseny vseh brilliantov v ozherel'ye
		double costOfNecklace = 0;
		for(Diamond d : necklace) {
			costOfNecklace += d.countPrice();
		}
		System.out.println("All stones cost " + costOfNecklace + "\u0024");
		double totalWeight = 0;
		for(Diamond d : necklace) {
			totalWeight += d.getWeight();
		}
		System.out.println("All stones weight: " + totalWeight);
		Comparator<Diamond> comparePrices = new Comparator<Diamond>() {
			@Override
			public int compare(Diamond o1, Diamond o2) {
				return Double.compare(o1.countPrice(), o2.countPrice());
			}
			
		};
		Collections.sort(necklace, comparePrices);
		System.out.println("The prices of DIamonds from the cheapest to the most expensive");
		for(Diamond d : necklace) {
			System.out.println(d.countPrice());
		}
		
	}
	
}
