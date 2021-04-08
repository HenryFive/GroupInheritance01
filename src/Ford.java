public class Ford extends Car{
    protected int year;
    protected int manufacturerDiscount;

    public Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount) {
        super(speed, regularPrice, color);
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;
    }

    public void computeSalePrice()
    {
        //From sale price computed from car class, subtract the manufacturerDiscount
        //super.computeSalePrice(super.regularPrice);
        double temp = super.computeSalePrice(super.regularPrice);
        this.salePrice = temp - this.manufacturerDiscount;
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
