package java_fundamentals;

import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {

        System.out.println("Enter Your Age");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if (a>=18){
            System.out.println("You are eligible for vote");
        }else {
            System.out.println("You are not eligible for vote");
        }

    }

}
