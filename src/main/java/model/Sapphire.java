package model;

public class Sapphire extends PreciousStone {
	
	private static final String NAME = "Sapphire";
	private static final double PRICEFORUNIT = 7.4;
	private static final String COLOR = "blue";
	private double sapphireWeight;
	private String sapphireClarity;
	
	public static String getNAME() {
		return NAME;
	}
	public static void setNAME(String NAME) {
		NAME = "Sapphire";
	}
	
	public static double getPRICEFORUNIT() {
		return PRICEFORUNIT;
	}
	public static void setPRICEFORUNIT(double PRICEFORUNIT) {
		PRICEFORUNIT = 7.4;
	}
	
	public static String getCOLOR() {
		return COLOR;
	}
	public static void setCOLOR(String COLOR) {
		COLOR = "Blue";
	}
	
	public double getSapphireWeight() {
		return sapphireWeight;
	}
	public void setSapphireWeight(double sapphireWeight) {
		this.sapphireWeight = sapphireWeight;
	}
	
	public String getSapphireClarity() {
		return sapphireClarity;
	}
	public void setSapphireClarity(String sapphireClarity) {
		this.sapphireClarity = sapphireClarity;
	}
	
	public Sapphire() {
		
	}
	
	public Sapphire(String NAME, String COLOR, double weight, double PRICEFORUNIT, String clarity) {
		super(NAME, COLOR, weight, PRICEFORUNIT, clarity);
		this.sapphireWeight = weight;
		this.sapphireClarity = clarity;
	}
	
	@Override
	public String toString() {
		return super.toString() + " It costs " +  getPRICEFORUNIT() + "\u0024 for carat.";
	}
	
	@Override
	public double countPrice() {
		double price = getPRICEFORUNIT() * getSapphireWeight();
		if(getSapphireClarity().equals("SV")) {
			price = price * 7.5;
		}
		else if(getSapphireClarity().equals("IF")) {
			price = price * 4.1;
		}
		return price;
	}
	
}
