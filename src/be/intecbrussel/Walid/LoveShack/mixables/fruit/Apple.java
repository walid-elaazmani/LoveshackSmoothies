package be.intecbrussel.Walid.LoveShack.mixables.fruit;

import be.intecbrussel.Walid.LoveShack.Fruit;

public class Apple extends Fruit {

    public Apple(double pricePerPiece) {
        super(pricePerPiece);
    }

    public void mix(){
        System.out.println("Apple is added and pressed");
    }
}
