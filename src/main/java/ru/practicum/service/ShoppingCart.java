package ru.practicum.service;

import ru.practicum.model.Food;

public class ShoppingCart {
    public Food[] food;

    public ShoppingCart(Food[] food) {
        this.food = food;
    }

    public Food[] getFood() {
        return food;
    }

    public double getPriceWithoutDiscount(){
        double price = 0;
        for (Food food : this.food){
                price += food.totalPrice();
            }
        return price;
    }

    public double getPriceWithDiscount(){
        double price = 0;
        for (Food food : this.food){
                price += food.discountPrice();
        }
        return price;
    }

    public double getVegetarianPriceWithoutDiscount(){
        double price = 0;
        for (Food food : this.food){
            if (food.isVegetarian()){
                price += food.totalPrice();
            }
        }
        return price;
    }
}
