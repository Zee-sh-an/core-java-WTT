package src;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Question1 {

//    ---> Question1
//    Create a Java program that reads a text file using FileReader and BufferedReader.
//    Print the contents to the console.


    public static void main(String[] args) throws IOException {

//        Filenotfoundexception is a subclass of Ioexception so both have much similar function
//        use txt extension for giving path in intellij because intellij adds txt extensions
        try{

//            FileReader fileReader=new FileReader("D:\\intellij projects\\TaskDay13-14\\src\\welcome.txt.txt");
            FileReader fileReader=new FileReader("welcome.txt");

            BufferedReader br=new BufferedReader(fileReader);
            System.out.println(br.readLine());


        }catch (IOException e){
            System.out.println("oops! File not found ");
            e.printStackTrace();
        }

    }

}
