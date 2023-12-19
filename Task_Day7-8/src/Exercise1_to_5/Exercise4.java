package Exercise1_to_5;

interface Features{
    abstract void parameter();
}

abstract class Shape{
    abstract void area();

    abstract void perimeter();
}

class Circle extends Shape implements Features{
    int radius;

    Circle(int radius){
        this.radius=radius;
    }
    public void perimeter(){
        System.out.println("The perimeter of circle is: " +2*3.14*radius);
    }
    public void area(){

        System.out.println("The area of Circle is: " + 3.14*radius*radius);

    }
    public void parameter(){
        System.out.println("Circle needs a one parameter which is Radius");
    }

}
class Rectangle extends Shape{

    int length;
    int width;

    Rectangle(int length,int width){
        this.width=width;
        this.length=length;
    }
    public void perimeter(){

        System.out.println("The perimeter of rectangle is: " + 2*(length+width));

    }
    public void area(){

        System.out.println("The area of Rectangle is: " + length*width);

    }
    public void parameter(){
        System.out.println("Rectangle needs two parameter Length and Width");
    }
}

public class Exercise4 {

    public static void main(String[] args) {

        Circle circle=new Circle(4);
        circle.area();
        circle.perimeter();
        circle.parameter();

        Rectangle rectangle=new Rectangle(4,2);
        rectangle.area();
        rectangle.perimeter();
        rectangle.parameter();

    }

}
