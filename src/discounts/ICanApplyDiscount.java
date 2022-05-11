package discounts;

import model.Cart;

import java.util.List;

public interface ICanApplyDiscount {

    public boolean canApplyDiscount(Cart cart);
    public void applyDiscount(Cart cart);

}
