package AdvanceJava.workshop02;

public class Checkout {
	public void process(Basket basket) {
        double netPrice = PriceCalculator.get(basket);
        double maxDiscount = DiscountCalculator.get(basket);
        double totalPrice = netPrice - maxDiscount;
        // TODO
        
        basket.setNetPrice(netPrice);
    }
}
