public class Jeepney extends Car{
    int weight;

    public Jeepney(int speed, double regularPrice, String color, int weight) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    double getSalePrice(){
        if (weight > 2000){
            return regularPrice * 0.10;
        }
        else {
            return regularPrice * 0.20;
        }
    }

}
