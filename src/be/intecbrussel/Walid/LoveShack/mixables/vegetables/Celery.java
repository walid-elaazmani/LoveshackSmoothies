package be.intecbrussel.Walid.LoveShack.mixables.vegetables;

import be.intecbrussel.Walid.LoveShack.Vegetable;

public class Celery extends Vegetable {
    public Celery(double pricePerPiece) {
        super(pricePerPiece);
    }

    public void mix(){
        System.out.println("Celery is pressed and added");
    }
}
