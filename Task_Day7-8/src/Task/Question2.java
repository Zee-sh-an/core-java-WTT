package Task;

abstract class Shape{
    abstract void area();
}
class Circle extends Shape{

    public void area(){
        int radius=4;
        System.out.println("The area of Circle is "+ 3.14*4*4);
    }

}
class Rectangle extends Shape{

    public void area(){

        int length=4;
        int width=10;
        System.out.println("The area of Rectangle is "+ length*width);
    }

}
class Triangle extends Shape{

    public void area(){
        int base=4;
        int height=10;
        System.out.println("The area of Triangle is "+ (base*height*1)/2);
    }

}
public class Question2 {

    public static void main(String[] args) {
        Circle circle=new Circle();
        circle.area();

        Rectangle rectangle=new Rectangle();
        rectangle.area();

        Triangle triangle=new Triangle();
        triangle.area();

    }

}
