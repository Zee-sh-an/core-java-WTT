package src.Task_Day_5_6;

class Vehicle{
    String make;
    String model;
    int year;
}
public class Question9 {
    public static void main(String[] args) {

        Vehicle vehicle=new Vehicle();
        vehicle.make="Honda";
        vehicle.model="A23";
        vehicle.year=2000;
        System.out.println("Vehicle make- "+vehicle.make+" ; "+"Vechile model- "+vehicle.model+" : "+" Vechile year- "+ vehicle.year);

    }

}
