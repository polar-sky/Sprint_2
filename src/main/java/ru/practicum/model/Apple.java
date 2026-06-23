package ru.practicum.model;

import ru.practicum.model.constants.Colour;
import ru.practicum.model.constants.Discount;

public class Apple extends Food{

    private String colour;

    public Apple(int amount, double price, String colour) {
        super(amount, price);
        this.colour = colour;
        isVegetarian = true;
    }

    public String getColour() {
        return colour;
    }


    //
    @Override
    public double getDiscount() {
        if (Colour.RED.equals(colour)) {
           return Discount.RED;
        } else {
            return Discount.DEFAULT;
        }
        }
    }
