package phase1_project;


class Vehicle {

 private String brand;
 private int year;


 public Vehicle(String brand, int year) {
     this.brand = brand;
     this.year = year;
 }

 public void displayInfo() {
     System.out.println("Brand: " + brand);
     System.out.println("Year: " + year);
 }
}

class Car extends Vehicle {
 
 private int numOfDoors;

 public Car(String brand, int year, int numOfDoors) {
     super(brand, year); 
     this.numOfDoors = numOfDoors;
 }

 @Override
 public void displayInfo() {
     super.displayInfo(); 
     System.out.println("Number of Doors: " + numOfDoors);
 }
}

class Motorcycle extends Vehicle {
 
 public Motorcycle(String brand, int year) {
     super(brand, year);
 }
}

public class ObjectOriented {
 public static void main(String[] args) {
    
     Vehicle vehicle = new Vehicle("Generic Vehicle", 2020);
     Car car = new Car("Toyota", 2021, 4);
     Motorcycle motorcycle = new Motorcycle("Harley Davidson", 2020);

     Vehicle polymorphicCar = new Car("Honda", 2019, 2);

     System.out.println("Information about the Vehicle:");
     vehicle.displayInfo();

     System.out.println("\nInformation about the Car:");
     car.displayInfo();

     System.out.println("\nInformation about the Motorcycle:");
     motorcycle.displayInfo();
     System.out.println("\nInformation about the polymorphic Car:");
     polymorphicCar.displayInfo();
 }
}
