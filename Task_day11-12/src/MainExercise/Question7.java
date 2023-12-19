package MainExercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {

        System.out.println("Enter two numbers for mathematical operation");

        try {
            Scanner sc=new Scanner(System.in);
            int a= sc.nextInt();
            int b= sc.nextInt();
            int c=a/b;

        }catch (ArithmeticException e){
            System.out.println("Enter a valid number nmber can not be divided by zero");
        }catch (InputMismatchException i){
            System.out.println("Enter a valid input which should be in number");
        }
    }
}