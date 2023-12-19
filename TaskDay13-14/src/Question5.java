package src;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Question5 {
//    -->Question5
//    Develop a program that takes user input and writes it to a file using BufferedWriter.
//    Ensure the content is appended to the existing file.

    public static void main(String[] args) {

        System.out.println("Enter the data that u want to enter");
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine();
        try {

            FileWriter fw=new FileWriter("input.txt",true);
            BufferedWriter bw= new BufferedWriter(fw);
            bw.write(". "+s);
            bw.close();
            fw.close();

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
