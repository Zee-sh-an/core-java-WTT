package Task;

class Library{
private String title;
private String author;
private long ISBN;

public void setTitle(String title){
    this.title=title;
}
    public void setAuthor(String author){
        this.author=author;
    }
    public void setISBN(long isbn){
        this.ISBN=isbn;
    }
    public String getTitle(){
        return this.title;
    }
    public String getAuthor(){
        return this.author;
    }
    public long getISBN(){
        return this.ISBN;
    }
}

public class Question5 {
    public static void main(String[] args) {

        Library library=new Library();
        library.setTitle("Habits");
        library.setAuthor("Carl");
        library.setISBN(1234567890123l);

        System.out.println(library.getTitle());
        System.out.println(library.getAuthor());
        System.out.println(library.getISBN());

    }

}
