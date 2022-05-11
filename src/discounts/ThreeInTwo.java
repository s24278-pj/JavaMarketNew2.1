package discounts;

import model.Cart;
import model.CartItem;
import model.Product;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ThreeInTwo implements ICanApplyDiscount {

    public boolean canApplyDiscount(Cart cart) {
        return cart.totalSumOfProducts() > 2;
    }

    public void applyDiscount(Cart cart) {
        CartItem minPrice = Collections.min(cart.getItems());
        minPrice.setCurrentPrice(0.0);
    }
}
