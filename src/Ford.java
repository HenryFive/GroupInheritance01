public class Ford extends Car{
    protected int year;
    protected int manufacturerDiscount;

    public Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount) {
        super(speed, regularPrice, color);
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;
        this.getSalePriceFord();
    }

    double getSalePriceFord()
    {
        super.salePrice -= manufacturerDiscount;

        //will return zero since the price is already calculated and is store in the variable
        //will retain the double return data type since it is required in the exercise requirements
        return 0;
    }
}
