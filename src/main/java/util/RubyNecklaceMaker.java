package util;

import java.util.ArrayList;
import java.util.Scanner;

import model.Necklace;
import model.PreciousStone;
import model.Ruby;

public class RubyNecklaceMaker {
	
	Scanner scanner = new Scanner(System.in);

	public void makeNecklace(Necklace<? extends PreciousStone> n) {
		ArrayList<Ruby> necklace = new ArrayList<Ruby>();
		System.out.println("How many rubys do you need?");
		int a = scanner.nextInt();
		for(int b = 0; b < a; b++) {
			System.out.println("Enter how much this ruby weights");
			double weight = scanner.nextDouble();
			System.out.println("Enter the ruby's clarity");
			String clarity = scanner.next();
			Ruby r = new Ruby(Ruby.getNAME(), Ruby.getCOLOR(), weight, 
					Ruby.getPRICEFORUNIT(), clarity);
			System.out.println(r.toString() + " It's price is " + r.countPrice() + "\u0024");
			necklace.add(r);
			//r.countPrice();
		}
		double costOfNecklace = 0;
		for(Ruby r : necklace) {
			costOfNecklace += r.countPrice();
		}
		System.out.println("All stones cost " + costOfNecklace + "\u0024");
	}
	
}
