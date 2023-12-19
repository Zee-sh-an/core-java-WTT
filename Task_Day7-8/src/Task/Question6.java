package Task;


abstract class Shape1{
    abstract void area();

    abstract void perimeter();
}

class Circle1 extends Shape1  {
    int radius;

    Circle1(int radius){
        this.radius=radius;
    }
    public void perimeter(){
        System.out.println("The perimeter of circle is: " +2*3.14*radius);
    }
    public void area(){

        System.out.println("The area of Circle is: " + 3.14*radius*radius);

    }

}
class Rectangle1 extends Shape1 {

    int length;
    int width;

    Rectangle1(int length,int width){
        this.width=width;
        this.length=length;
    }
    public void perimeter(){

        System.out.println("The perimeter of rectangle is: " + 2*(length+width));

    }
    public void area(){

        System.out.println("The area of Rectangle is: " + length*width);

    }

}

public class Question6 {

    public static void main(String[] args) {

        Circle1 circle=new Circle1(4);
        circle.area();
        circle.perimeter();

        Rectangle1 rectangle=new Rectangle1(4,2);
        rectangle.area();
        rectangle.perimeter();
    }

}

