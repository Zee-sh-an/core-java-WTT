package Task;

interface Resizable{
    void resizing();
}

class Images implements Resizable{

    public void resizing(){
        System.out.println("Images are resizable to very small");
    }

}
class Windows{
    public void resizing(){
        System.out.println("windows are not much resizable than Images");
    }
}

public class Question7 {
    public static void main(String[] args) {

    }
}
