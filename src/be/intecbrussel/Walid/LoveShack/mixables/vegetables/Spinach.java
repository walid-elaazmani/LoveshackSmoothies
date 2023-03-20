package be.intecbrussel.Walid.LoveShack.mixables.vegetables;

import be.intecbrussel.Walid.LoveShack.Vegetable;

public class Spinach extends Vegetable {

    public Spinach(double pricePerPiece) {
        super(pricePerPiece);
    }

    public void mix(){
        System.out.println("Spinach is pressed and added");
    }
}
