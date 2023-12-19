package Exercise1_to_5;

interface Display{
    void display();
}
interface Camera{
    void pixel();
}
interface Internet{
    void generation();
}
class Smartphone implements Display,Camera,Internet{

    public void display(){

        System.out.println("Smartphone has Large display with great features like Amoled,LCD,Oled etc displays");
    }

    public void pixel(){

        System.out.println("Smartphone has advance camera features which has high pixels and lens");

    }
    public void generation(){

        System.out.println("Currently in smartphones internet has 5 Generation ");
    }

}
public class Exercise5 {

    public static void main(String[] args) {
        Smartphone smartphone=new Smartphone();
        smartphone.display();
        smartphone.pixel();
        smartphone.generation();

    }

}
