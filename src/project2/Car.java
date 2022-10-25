package project2;

public class Car {
    /*
    Create a Class Car that would have the following fields: carPrice and color and method
calculateSalePrice() which should be returning a price of the car.
Create 2 sub classes: Sedan and Truck. The Truck class has a field as weight and has its own
implementation of calculateSalePrice() method in which returned price is calculated as
following: if weight>2000 then returned price car should include 10% discount, otherwise 20%
discount. The Sedan class has field as length and also does it is own implementation of
calculateSalePrice(): if length of sedan is >20 feet then returned car price should include 5%
discount, otherwise 10% discount
     */

    double carPrice;
    String color;

   double calculateSalePrice(){
        return carPrice;
   }

}

class Sedan extends Car{

    double length;

    String calculateSalePrice(double length) {
        if (length > 20) {
            return(String.valueOf(carPrice-(carPrice*0.05))+" is the price of the longer sedan");
        } else {
            return (String.valueOf(carPrice-(carPrice*0.1))+" is the price of the shorter sedan");
        }
    }

}

class Truck extends Car{

    double weight;

    String calculateSalePrice(double weight){
        if(weight>2000){
            return(String.valueOf(carPrice-(carPrice*0.1))+" is the price of the bigger truck");
        }else {
            return(String.valueOf(carPrice-(carPrice*0.2))+" is the price of the smaller truck");
        }
    }

}


