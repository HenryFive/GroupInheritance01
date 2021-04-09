public class Ford extends Car{
    protected int year;
    protected int manufacturerDiscount;

    public Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount) {
        super(speed, regularPrice, color);
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;
        this.getSalePrice();

    }

    //removed getters and setters
    //override the getSalePrice method and call it when constructing this class
    //this allows the computation to happen automatically without calling the class

    double getSalePrice()
    {
        super.getSalePrice(); // still need to call the parent getSalePrice since it still needs to calculate from parent class
        super.salePrice -= manufacturerDiscount;

        //will return zero since the price is already calculated and is store in the variable
        //will retain the double return data type since it is required in the exercise requirements
        return 0;
    }
}
