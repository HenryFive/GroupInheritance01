public class Ford extends Car{
    protected int year;
    protected int manufacturerDiscount;

    public Ford(int speed, double regularPrice, String color, double getSalePrice, int year, int manufacturerDiscount) {
        super(speed, regularPrice, color, getSalePrice);
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;
    }

    double getSalePrice()
    {
        //From sale price computed from car class, subtract the manufacturerDiscount
        super.setGetSalePrice(super.getSalePrice - this.manufacturerDiscount);
        return super.getSalePrice;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getManufacturerDiscount() {
        return manufacturerDiscount;
    }

    public void setManufacturerDiscount(int manufacturerDiscount) {
        this.manufacturerDiscount = manufacturerDiscount;
    }
}
