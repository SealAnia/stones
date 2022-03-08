package util;

import java.util.ArrayList;
import java.util.Scanner;

import model.Necklace;
import model.PreciousStone;
import model.Sapphire;

public class SapphireNecklaceMaker {
	
	Scanner scanner = new Scanner(System.in);
	
	public void makeNecklace(Necklace<? extends PreciousStone> n) {
		ArrayList<Sapphire> necklace = new ArrayList<Sapphire>();
		System.out.println("How many sapphires do you need?");
		int a = scanner.nextInt();
		for(int b = 0; b < a; b++) {
			System.out.println("Enter how much this sapphire weights");
			double weight = scanner.nextDouble();
			System.out.println("Enter the sapphire's clarity");
			String clarity = scanner.next();
			Sapphire s = new Sapphire(Sapphire.getNAME(), Sapphire.getCOLOR(), weight, 
					Sapphire.getPRICEFORUNIT(), clarity);
			System.out.println(s.toString() + " It's price is " + s.countPrice() + "\u0024");
			necklace.add(s);
		}
		double costOfNecklace = 0;
		for(Sapphire s : necklace) {
			costOfNecklace += s.countPrice();
		}
		System.out.println("All stones cost " + costOfNecklace + "\u0024");
	}

}
