package src.java_fundamentals;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {

        System.out.println("Enter Two Numbers in which you want to perform task");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=a+b;
        int differece =a-b;
        int product=a*b;
        int quotient=a/b;
        System.out.println("Addition is "+ sum);
        System.out.println("Subtraction is "+ differece);
        System.out.println("Product is "+ product);
        System.out.println("Quotient is "+ quotient);
    }
}
