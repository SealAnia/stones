package model;

public class Ruby extends PreciousStone {
	
	private static final String NAME = "Ruby";
	private static final double PRICEFORUNIT = 8.5;
	private static final String COLOR = "red";
	private double rubyWeight;
	private String rubyClarity;
	
	public static String getNAME() {
		return NAME;
	}
	public static void setNAME(String NAME) {
		NAME = "Ruby";
	}
	
	public static double getPRICEFORUNIT() {
		return PRICEFORUNIT;
	}
	public static void setPRICEFORUNIT(double PRICEFORUNIT) {
		PRICEFORUNIT = 8.5;
	}
	
	public static String getCOLOR() {
		return COLOR;
	}
	public static void setCOLOR(String COLOR) {
		COLOR = "red";
	}
	
	public double getRubyWeight() {
		return rubyWeight;
	}
	public void setRubyWeight(double rubyWeight) {
		this.rubyWeight = rubyWeight;
	}
	
	public String getRubyClarity() {
		return rubyClarity;
	}
	public void setRubyClarity(String rubyClarity) {
		this.rubyClarity = rubyClarity;
	}
	
	public Ruby() {
		
	}
	
	public Ruby(String NAME, String COLOR, double weight, double PRICEFORUNIT, String clarity) {
		super(NAME, COLOR, weight, PRICEFORUNIT, clarity);
		this.rubyWeight = weight;
		this.rubyClarity = clarity;
	}
	
	@Override
	public String toString() {
		return super.toString() + " It costs " +  getPRICEFORUNIT() + "\u0024 for carat.";
	}
	
	@Override
	public double countPrice() {
		double price = getPRICEFORUNIT() * getRubyWeight();
		if(getRubyClarity().equals("SV")) {
			price = price * 6;
		}
		else if(getRubyClarity().equals("IF")) {
			price = price * 3.5;
		}
		return price;
	}
	
}
