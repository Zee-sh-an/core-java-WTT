package Task_Day_5_6;

class BookItem{
    String Title;
    String Author;
    long Isbn;

    BookItem(String title,String author,long isbn){
     this.Title=title;
     this.Author=author;
     this.Isbn=isbn;
    }
    void show(){
        System.out.println("Title - "+Title+" : " + "Author - "+Author+"Isbn - "+Isbn);
    }
}
public class Question6 {
    public static void main(String[] args) {
        BookItem bookItem=new BookItem("Deep Work","Carl newport",123451234513L);
        bookItem.show();

        BookItem bookItem1=new BookItem("Mindset","Harbour",678906789013L);
        bookItem1.show();
    }
}
