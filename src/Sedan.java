public class Sedan extends Car{
    int length;
    public Sedan(int speed, double regularPrice, String color, int length) {
        super(speed, regularPrice, color);
        this.length = length;
        this.getSalePrice();
    }

    //override the getSalePrice method and call it when constructing this class
    //this allows the computation to happen automatically without calling the class

    double getSalePrice() {
        super.getSalePrice(); // still need to call the parent getSalePrice since it still needs to calculate from parent class

        if (length > 20) {
            super.salePrice *= 0.05;
            //return regularPrice - (super.computeSalePrice(super.regularPrice) * 0.05);
            // previous code that will only return the regular price after it is computed and not stored
            // hence needing a new variable to store it
        } else {
            super.salePrice *= 0.1;
            //return regularPrice - (super.computeSalePrice(super.regularPrice) * .1);
        }

        //will return zero since the price is already calculated and is store in the variable
        //will retain the double return data type since it is required in the exercise requirements
        return 0;

    }
}
