package Task;

interface Drawable{
    void drawable();
}
interface Clickable{

    void clickable();

}
class GraphicalElements implements Drawable,Clickable{

    public void drawable(){
        System.out.println("A drawable resource is a general concept for a graphic that can be drawn to the screen and that you can retrieve with APIs");
    }

    public void clickable(){
        System.out.println("It is the event that makes clikable direct to link on it can be on word,icon etc");
    }

}
public class Question8 {
    public static void main(String[] args) {
        GraphicalElements graphicalElements = new GraphicalElements();

        graphicalElements.drawable();
        graphicalElements.clickable();

    }

}
