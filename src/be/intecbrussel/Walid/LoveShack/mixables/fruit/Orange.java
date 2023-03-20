package be.intecbrussel.Walid.LoveShack.mixables.fruit;

import be.intecbrussel.Walid.LoveShack.Fruit;

public class Orange extends Fruit {

    public Orange(double pricePerPiece) {
        super(pricePerPiece);
    }


    public void mix(){
        System.out.println("Orange is pressed and added");
    }



}
