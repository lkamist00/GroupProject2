package project2;

public class CarTester {
    public static void main(String[] args) {

        Sedan sedan=new Sedan();
        sedan.carPrice=10000;
        System.out.println(sedan.calculateSalePrice(10));
        System.out.println(sedan.calculateSalePrice(30));

        Truck truck=new Truck();
        truck.carPrice=20000;
        System.out.println(truck.calculateSalePrice(3000));
        System.out.println(truck.calculateSalePrice(1000));
    }
}
