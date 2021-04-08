public class Main {
    public static void main(String[] args) {
        Sedan sedanInst1 = new Sedan(30,30000,"orange",10);
        sedanInst1.salePrice =  sedanInst1.sedancompSalePrice();

        Ford fordInst1 = new Ford(60,100000,"blue",1990,5000);
        fordInst1.computeSalePrice();

        Ford fordInst2 = new Ford(65,150000,"green",1991,4000);
        fordInst2.computeSalePrice();

        Car carInst1 = new Car(100,120000,"purple");
        carInst1.salePrice = carInst1.computeSalePrice(carInst1.regularPrice);

        System.out.println("Sedan: "+ sedanInst1.salePrice);
        System.out.println("Ford 1: "+ fordInst1.salePrice);
        System.out.println("Ford 2: "+ fordInst2.salePrice);
        System.out.println("Car: "+ carInst1.salePrice);

    }
}
