package AdvanceJava.workshop02;

public class PriceCalculator {
	public static double get(Basket basket) {
		
		double netPrice = 0;
		
        for (Book item : basket.books) {
        	netPrice += item.getPrice();
        }
        return netPrice;
    }
}
