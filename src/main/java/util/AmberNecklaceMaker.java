package util;

import java.util.ArrayList;
import java.util.Scanner;

import model.Amber;
import model.Necklace;
import model.SemipreciousStone;

public class AmberNecklaceMaker {
	
	Scanner scanner = new Scanner(System.in);

	public void makeNecklace(Necklace<? extends SemipreciousStone> n) {
		ArrayList<Amber> necklace = new ArrayList<Amber>();
		System.out.println("How many ambers do you need?");
		int x = scanner.nextInt();
		for(int y = 0; y < x; y++) {
			System.out.println("Enter how much this amber weights");
			double weight = scanner.nextDouble();
			System.out.println("Enter the amber's extent of clarity");
			int clarity = scanner.nextInt();
			Amber a = new Amber(Amber.getNAME(), Amber.getCOLOR(), weight, 
					Amber.getPRICEFORUNIT(), clarity);
			System.out.println(a.toString() + " It's price is " + a.countPrice() + "\u0024");
			necklace.add(a);
		}
		double costOfNecklace = 0;
		for(Amber a : necklace) {
			costOfNecklace += a.countPrice();
		}
		System.out.println("All stones cost " + costOfNecklace + "\u0024");
	}

}
