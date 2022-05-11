package model;

import discounts.FreeCupDiscount;
import discounts.ICanApplyDiscount;
import discounts.PrecentDiscount;

import java.util.ArrayList;

public class Cart {
    ArrayList<CartItem> items = new ArrayList<CartItem>();

    public double totalPriceOfProducts() {
        double sum = 0;
        for (CartItem item : items) {
            sum += item.getProduct().getPrice();
        }
        return sum;
    }

    public double totalPriceOfDiscountedProducts() {
        double sum = 0;
        for (CartItem item : items) {
            sum += item.getCurrentPrice();
        }
        return sum;
    }

    public ArrayList<CartItem> getItems() {
        return items;
    }

    public int totalSumOfProducts() {
        int counter = 0;
        for (CartItem item : items) {
            counter++;
        }
        return counter;
    }

    public void applyDiscount(ICanApplyDiscount discount) {
        if (discount.canApplyDiscount(this))
            discount.applyDiscount(this);
    }
}
