public class Jeepney extends Car{
    int weight;

    double getSalePrice(){
        if (weight > 2000){
            return regularPrice * 0.10;
        }
        else {
            return regularPrice * 0.20;
        }
    }

}
