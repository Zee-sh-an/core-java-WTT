package src.MainExercise;

import java.io.*;
import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {

        try {
//       for checking file ("src/MainExercise/text") this is file path
            File file = new File("src/MainExercise/tex");

            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()){
                String str = sc.nextLine();
                System.out.println(str);
            }

        }catch (IOException e){
            System.out.println("oops! There is no such file");
        }

    }
}
