package Task;

class Vehicles{
    public void Break(){
        System.out.println("Applying Breaks...");
    }
    public void averageSpeed(){
        System.out.println("Average speed is 20km/hr ");
    }
}
class Cars extends Vehicles{
    public void Break(){
        System.out.println("Force break applying..");
    }
    public void averageSpeed(){
        System.out.println("Average speed is 50km/hr");
    }
}
class Motorcycles extends Vehicles{
    public void Break(){
        System.out.println("Dis break applying..");
    }
    public void averageSpeed(){
        System.out.println("Average speed is 40km/hr");
    }
}
class Bicycles extends  Vehicles{

    public void Break(){
        System.out.println("Normal break applying..");
    }
    public void averageSpeed(){
        System.out.println("Average speed is 10km/hr");
    }

}
public class Question1 {

    public static void main(String[] args) {
        Cars cars=new Cars();
        cars.Break();
        cars.averageSpeed();

        Motorcycles motorcycles=new Motorcycles();
        motorcycles.Break();
        motorcycles.averageSpeed();

        Bicycles bicycles=new Bicycles();
        bicycles.Break();
        bicycles.averageSpeed();
    }

}
