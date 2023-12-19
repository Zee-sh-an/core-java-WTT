package Exercise1_to_5;

class Animals{
    public void size(){
        System.out.println("Animals are of different sizes");
    }
    public void genericSound(){
        System.out.println("......");
    }
}
class Mammals extends Animals{

    public void size(){
        System.out.println("Mammals are generally large in size in comparision to reptiles and birds");
    }

    public void genericSound(){
        System.out.println("meow..belew..belew..");
    }

}
class Birds extends Animals{

    public void size(){

        System.out.println("Birds are in small size in comparison to mammals and reptiles");
    }

    public void genericSound(){
        System.out.println("chirping.....");
    }

}
class Reptiles extends Animals{
    public void size(){
        System.out.println("Reptiles are small in size than mammals and birds");
    }
    public void genericSound(){
        System.out.println("hissss......");
    }

}
public class Exercise1And2{
    public static void main(String[] args) {
        Mammals mammals=new Mammals();
        mammals.size();

        Birds birds =new Birds();
        birds.size();

        Reptiles reptiles=new Reptiles();
        reptiles.size();

    }
}
