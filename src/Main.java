public class Main {
    public static void main(String[] args) {
/*        Sedan sedanInst1 = new Sedan(30,30000,"orange",10);
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
        System.out.println("Car: "+ carInst1.salePrice);*

 */

        // Optimized code

        //Creating instance
        Sedan sedan1  = new Sedan(30,30000,"orange",10);
        Ford ford1 = new Ford(60,100000,"blue",1990,5000);
        Ford ford2 = new Ford(65,150000,"green",1991,4000);
        Car car1 = new Car(100,120000,"purple");

        //Printing out objects
        System.out.println("Object Instance Sedan 1  Sale Price: " + sedan1.salePrice);
        System.out.println("Object Instance Ford 1   Sale Price: "+ ford1.salePrice);
        System.out.println("Object Instance Ford 2   Sale Price: "+ ford2.salePrice);
        System.out.println("Object Instance Car 1    Sale Price: "+ car1.salePrice);

    }
}
