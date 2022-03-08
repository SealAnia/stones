package model;

public class Diamond extends PreciousStone {
	
	//Zadayu staticheskije polya, kotoryye budut odinakowy dlya wseh ob'yektow klassa
	public static final String NAME = "Diamond";
	public static final double PRICEFORUNIT = 11.6;
	public static final String COLOR = "white";
	//Nestaticheskiye polya budut raznymi dlya raznych ob'yektow
	private double diamondWeight;
	private String diamondClarity;
	
	//Gettery, settery
	
	public double getDiamondWeight() {
		return diamondWeight;
	}
	public void setDiamondWeight(double diamondWeight) {
		this.diamondWeight = diamondWeight;
	}
	
	public String getDiamondClarity() {
		return diamondClarity;
	}
	public void setDiamondClarity(String diamondClarity) {
		this.diamondClarity = diamondClarity;
	}
	
	//Konstruktory
	public Diamond() {
		
	}
	
	public Diamond(String NAME, String COLOR, double weight, double PRICEFORUNIT, String clarity) {
		super(NAME, COLOR, weight, PRICEFORUNIT, clarity);
		this.diamondWeight = weight;
		this.diamondClarity = clarity;
	}
	
	@Override
	public String toString() {
		return super.toString() + " It costs " +  PRICEFORUNIT + "\u0024 for carat.";
	}
	
	//Metod dlya rachyota tseny konkretnogo kamnya. 
	//"SV" oznachayet luchsheye kachestvo chem "IF", poetomu koeffitsient tseny vyshe
	@Override
	public double countPrice() {
		double price = PRICEFORUNIT * getDiamondWeight();
		if(getDiamondClarity().equalsIgnoreCase("SV")) {
			price = price * 10;
		}
		else if(getDiamondClarity().equalsIgnoreCase("IF")) {
			price = price * 5;
		}
		return price;
	}
	
}
