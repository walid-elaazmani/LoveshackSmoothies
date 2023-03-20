package be.intecbrussel.Walid.LoveShack.shop;

import be.intecbrussel.Walid.LoveShack.*;
import be.intecbrussel.Walid.LoveShack.mixables.vegetables.Celery;
import be.intecbrussel.Walid.LoveShack.mixables.vegetables.Spinach;
import be.intecbrussel.Walid.LoveShack.mixables.fruit.*;

public enum Smoothies {

    CITRUS( new Food[]  {new Orange(1), new Orange(6), new Lemon(2)}),
    STRAWBERRYDREAM (new Food[]{new StrawBerry(2), new Orange(6),new  Orange(6), new Banana(3)}),
    BANASLIDE(new Food[]{new Banana(3), new Banana(3),new  Orange(6)}),
    VEGGIESLURRY (new Food[]{new Banana(3), new Celery(9), new Spinach(5), new Apple(4)}),

    CUSTOM (new Food[]{});




    private double totalPrice;

    private Food[] recipe;

    Smoothies(Food[] recipe) {
        this.recipe = recipe;
    }

    void SmoothieRecipe(Food[] recipe){
    }

    public double getTotalPrice() {

        double r = 0;

        for (Food food : recipe) {

         r +=   food.getPricePerPiece();

        }
        return totalPrice = r;
    }

    public Food[] getRecipe() {
        return recipe;
    }


    public void setRecipe(Food[] recipe) {

        Smoothies.CUSTOM.recipe = recipe;

    }
}
