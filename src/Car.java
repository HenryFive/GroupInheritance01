public class Car {
    int speed;
    double regularPrice;
    String color;
    double getSalePrice;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setGetSalePrice(double getSalePrice) {
        this.getSalePrice = getSalePrice;
    }

    public Car(int speed, double regularPrice, String color, double getSalePrice) {
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
        this.getSalePrice = getSalePrice;
    }

    double getGetSalePrice() {
        return getSalePrice;
    }
}
