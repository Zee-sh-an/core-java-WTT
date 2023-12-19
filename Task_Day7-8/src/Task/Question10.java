package Task;

interface Drivable{
    void drivable();
}
interface FuelEfficient{
    void fuelefficient();
}
abstract class Vehicle{
    String make;
    String model;
    int year;
    Vehicle(String  make,String model,int year){
        this.make=make;
        this.model=model;
        this.year=year;
    }
}
class Car extends Vehicle implements Drivable,FuelEfficient{

    Car(String make,String model,int year){
        super(make,model,year);
    }

    public void drivable(){
        System.out.println("Car is drivable");
    }
    public void fuelefficient(){
        if (year>=2022){
            System.out.println("Car is fuel efficient");
        }else {
            System.out.println("Car is not much fuel efficiet");
        }
    }

}
class Motorcycle extends Vehicle implements Drivable,FuelEfficient{

    Motorcycle(String make,String model,int year){
        super(make,model,year);
    }
    public void drivable(){
        System.out.println("Bike is drivable");
    }
    public void fuelefficient(){
        if (year>=2022){
            System.out.println("Motorcycle is fuel efficient");
        }else {
            System.out.println("Motorcycle is not much fuel efficiet");
        }
    }
}
public class Question10 {

    public static void main(String[] args) {
        Motorcycle motorcycle=new Motorcycle("Honda","AK2",2022);
        motorcycle.drivable();
        motorcycle.fuelefficient();

        Car car=new Car("Honda","AK2",2022);
        car.drivable();
        car.fuelefficient();
    }

}
