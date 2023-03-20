package be.intecbrussel.Walid.LoveShack;

public abstract class Food implements Mixables {

    private final double pricePerPiece;

    public Food(double pricePerPiece) {
        this.pricePerPiece = pricePerPiece;
    }

    public double getPricePerPiece() {
        return pricePerPiece;
    }


}
