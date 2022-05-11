package discounts;

import model.Cart;

import java.util.ArrayList;
import java.util.List;

public class CanApplyListOfDiscounts implements ICanApplyDiscount {
    private List<ICanApplyDiscount> listOfDiscounts;
    private List<ICanApplyDiscount> listOfDiscountsToImplement;

    public CanApplyListOfDiscounts() {
        listOfDiscounts = new ArrayList<>();
        listOfDiscounts.add(new ThreeInTwo());
        listOfDiscounts.add(new FreeCupDiscount());
        listOfDiscounts.add(new PrecentDiscount(0.1));

        listOfDiscountsToImplement = new ArrayList<>();
    }

    public boolean canApplyDiscount(Cart cart) {
        for (ICanApplyDiscount e : listOfDiscounts) {
            if (e.canApplyDiscount(cart)) {
                listOfDiscountsToImplement.add(e);
            }
        }
        return !listOfDiscounts.isEmpty();
    }

    public void applyDiscount(Cart cart) {
        for (ICanApplyDiscount e : listOfDiscountsToImplement) {
            e.applyDiscount(cart);
        }
    }
}
