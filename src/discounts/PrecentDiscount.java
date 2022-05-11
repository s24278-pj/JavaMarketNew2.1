package discounts;

import model.Cart;
import model.CartItem;

public class PrecentDiscount implements ICanApplyDiscount {
    private double discountRate;

    public PrecentDiscount(double discountRate) {
        this.discountRate = discountRate;
    }

    public boolean canApplyDiscount(Cart cart) {
        return cart.totalPriceOfProducts() > 300;
    }

    public void applyDiscount(Cart cart) {
        for (CartItem item : cart.getItems()) {
            item.setCurrentPrice(item.getCurrentPrice() * (1 - discountRate));
        }
    }
}
