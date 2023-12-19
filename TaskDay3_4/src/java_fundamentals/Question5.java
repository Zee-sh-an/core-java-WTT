package java_fundamentals;

import java.util.Scanner;

public class Question5 {

    public static void main(String[] args) {

        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        if (a<0){
            System.out.println("Enter Number is negative");
        } else if (a==0) {
            System.out.println("Enter Number is zero");
        }
        else {
            System.out.println("Enter Number is positive");
        }
    }
}
