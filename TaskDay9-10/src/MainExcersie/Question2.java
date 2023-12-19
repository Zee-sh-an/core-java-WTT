package MainExcersie;

import java.util.ArrayList;

//-->Arraylist Operation
public class Question2 {
    public static void main(String[] args) {

        ArrayList<String> to_do=new ArrayList<>();
        to_do.add("Reached office");
        to_do.add("Biometric scan");
        to_do.add("Setup Desk");
        to_do.add("On Desktop");
        to_do.add("Start coding");
        to_do.add("Mid break for cofee");

        to_do.remove("Mid break for cofee");

        System.out.println(to_do);

    }
}
