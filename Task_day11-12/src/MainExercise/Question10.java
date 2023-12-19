package src.MainExercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Question10 {

    public static void inputMismatchException(){
        try {
            System.out.println("Enter a number");
            Scanner sc = new Scanner(System.in);
            int a=sc.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Exception occured : Enter a valid input ");
        }
    }

    public static void arithmaticException(){
        try {
            System.out.println("Enter two number (enter second number to Arithmetic exception handling)");
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            int b= sc.nextInt();
            int c=a/b;
        }catch (ArithmeticException e){
            System.out.println(" Exception occured : Enter a valid input number cannot be divided by zero\"");
        }
    }
    public static void fileNotFoundException(){
        try {

            FileInputStream file=new FileInputStream("d/src/app");

        }catch (FileNotFoundException e){
            System.out.println("Exception occured : Enter a valid file path");
        }
    }
    public static void main(String[] args) throws FileNotFoundException {

        inputMismatchException();
        arithmaticException();
        fileNotFoundException();
    }

}
