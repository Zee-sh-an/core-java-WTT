package Task_Day_5_6;

class Shapes{
    public void area(Double a){
        System.out.println("area");
    }
    public void perimeter(Double b ){
        System.out.println("perimeter");
    }
}
class Circle extends Shapes{
    public void area(int radius){
        System.out.println("Area of the Circle is :"+ 3.14*radius);
    }
    public void perimeter(int radius){
        System.out.println("Perimeter of the circle is : " + 2*3.14*radius);
    }
}
class Rectangle extends Shapes{

    public void area(int length,int width){
        System.out.println("Area of the Rectangle is : "+ length*width);
    }
    public void perimeter(int length,int width){
        System.out.println("Perimeter of the Rectangle is : " + 2*(length+width));
    }

}
public class Question5 {
    public static void main(String[] args) {
        Circle circle=new Circle();
        circle.area(4);
        circle.perimeter(6);
        circle.area(5.7);
        circle.perimeter(5.6);

        Rectangle rectangle = new Rectangle();
        rectangle.area(2,4);
        rectangle.perimeter(4,6);
        rectangle.area(4.5);
        rectangle.perimeter(3.9);
    }
}
