package be.intecbrussel.Walid.LoveShack.mixables.fruit;

import be.intecbrussel.Walid.LoveShack.Fruit;

public class StrawBerry extends Fruit {


    public StrawBerry(double pricePerPiece) {
        super(pricePerPiece);
    }


    public void mix(){
        System.out.println("Strawberry is pressed and added");
    }
}
