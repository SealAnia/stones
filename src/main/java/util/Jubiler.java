package util;

import java.util.ArrayList;
import java.util.Scanner;

import model.Diamond;
import model.PreciousStone;
import model.Ruby;
import model.Sapphire;

public class Jubiler {
	
	public DiamondNecklaceMaker diamondNecklaceMaker = new DiamondNecklaceMaker();
	public RubyNecklaceMaker rubyNecklaceMaker = new RubyNecklaceMaker();
	public SapphireNecklaceMaker sapphireNecklaceMaker = new SapphireNecklaceMaker();
	public AmberNecklaceMaker amberNecklaceMaker = new AmberNecklaceMaker();
	
	Scanner scanner = new Scanner(System.in);
	
	public void makeNecklaceFromPreciousStones() {
		ArrayList<PreciousStone> necklace = new ArrayList<PreciousStone>();
		System.out.println("How many diamonds do you need?");
		int numberOfDiamonds = scanner.nextInt();
		for(int a = 0; a < numberOfDiamonds; a++) {
			Diamond diamond = new Diamond();
			necklace.add(diamond);
		}
		System.out.println("How many rubys do you need?");
		int numberOfRubys = scanner.nextInt();
		for(int a = 0; a < numberOfRubys; a++) {
			Ruby ruby = new Ruby();
			necklace.add(ruby);
		}
		System.out.println("How many sapphires do you need?");
		int numberOfSapphires = scanner.nextInt();
		for(int a = 0; a < numberOfSapphires; a++) {
			Sapphire sapphire = new Sapphire();
			necklace.add(sapphire);
		}
		for(PreciousStone stone : necklace) {
			System.out.println(stone.getClass().toString());
		}
	}
	
}
