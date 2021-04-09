public class Jeepney extends Car{
    int weight;

    public Jeepney(int speed, double regularPrice, String color, int weight) {
        super(speed, regularPrice, color);
        this.weight = weight;
        this.getSalePriceJeepney();
    }

    double getSalePriceJeepney(){

        if (weight > 2000){
            super.salePrice *= 0.10;
            //return regularPrice * 0.10; //previous code that will only return the regular price after it is computed and not stored
                                          // hence needing a new variable to store it
        }
        else {
            super.salePrice *= 0.10;
            //return regularPrice * 0.20;
        }

        //will return zero since the price is already calculated and is store in the variable
        //will retain the double return data type since it is required in the exercise requirements
        return 0;
    }

}
