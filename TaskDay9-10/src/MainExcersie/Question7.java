package MainExcersie;

import java.util.TreeMap;

//-->Country-Capital Mapping

public class Question7 {
    public static void main(String[] args) {

        TreeMap<String,String> Book=new TreeMap<>();
        Book.put("Mindset","Robin");
        Book.put("Atomic Habits","Carl");
        Book.put("Deep work","Newport");

        System.out.println(Book);
    }
}
