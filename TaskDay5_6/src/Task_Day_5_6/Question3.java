package Task_Day_5_6;

class Book{
    String Name;
    String Author;
    int Cost;
    Book(String name,String author,int cost){
        this.Name=name;
        this.Author=author;
        this.Cost=cost;
    }
}
public class Question3 {
    public static void main(String[] args) {

        Book book=new Book("Atomic Habbits","carl",500);
        System.out.println(book.Name+" : "+book.Author+" : "+book.Cost);

    }
}
