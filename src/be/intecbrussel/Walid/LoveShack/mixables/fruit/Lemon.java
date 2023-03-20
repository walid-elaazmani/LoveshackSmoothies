package be.intecbrussel.Walid.LoveShack.mixables.fruit;

import be.intecbrussel.Walid.LoveShack.Fruit;

public class Lemon  extends Fruit {


    public Lemon(double pricePerPiece) {
        super(pricePerPiece);
    }

    public void mix(){
        System.out.println("Lemon is pressed and added");
    };
}
