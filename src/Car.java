public class Car {
    int speed;
    double regularPrice;
    String color;
    double salePrice;

    public double getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    //removed setters and getters since they are not used
    //removed method to calculate price since redundant
/*
        public double computeSalePrice(double regularPrice) {
        return regularPrice * 0.99;
    }
*/

    public Car(int speed, double regularPrice, String color) {
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
        getSalePrice();

    }

    //not a getter but a method to calculate sale price
    double getSalePrice() {
        salePrice = regularPrice * 0.99;
        return 0;
    }
}
