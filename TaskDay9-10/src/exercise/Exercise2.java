package exercise;

import java.util.ArrayList;
import java.util.List;

//-->ArrayList Implementation

public class Exercise2 {
    public static void main(String[] args) {

        ArrayList<String> list=new ArrayList<>();
//        Adding
        list.add("Ishan");
        list.add("Vivek");
        list.add("Raju");
        list.add("kapil");
        list.add("Raghu");

//        Removing
        list.remove("Ishan");

//        Fetching
        System.out.println(list);

        for (String student: list) {
            System.out.println(student);
        }

    }
}
