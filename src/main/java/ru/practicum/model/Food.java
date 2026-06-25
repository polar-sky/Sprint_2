package ru.practicum.model;

import ru.practicum.model.constants.Discount;

public abstract class Food implements Discountable {
    protected int amount;
    protected double price;
    protected boolean isVegetarian;

    public Food(int amount, double price) {
        this.amount = amount;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    @Override
    public double getDiscount() {
        return Discount.DEFAULT;
    }

    public double totalPrice(){
        return amount * price;
    }

    public double discountPrice(){
        return totalPrice() * ((100 - getDiscount()) / 100);
    }
}
