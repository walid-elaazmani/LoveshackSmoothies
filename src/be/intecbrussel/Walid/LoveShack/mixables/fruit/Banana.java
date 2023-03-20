package be.intecbrussel.Walid.LoveShack.mixables.fruit;

import be.intecbrussel.Walid.LoveShack.Fruit;

public class Banana extends Fruit {


    public Banana(double pricePerPiece) {
        super(pricePerPiece);
    }

    public void mix(){
        System.out.println("Banana is pressed and added");
    }
}
