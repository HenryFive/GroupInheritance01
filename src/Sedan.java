public class Sedan extends Car{
    int length;
    public Sedan(int speed, double regularPrice, String color, int length) {
        super(speed, regularPrice, color);
        this.length = length;
    }

    public double sedancompSalePrice() {
        if (length > 20) {
            return regularPrice - (super.computeSalePrice(super.regularPrice) * 0.05);
        } else {
            return regularPrice - (super.computeSalePrice(super.regularPrice) * .1);
        }

    }
}
