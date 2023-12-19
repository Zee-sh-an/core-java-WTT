package java_fundamentals;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {

        System.out.println("Enter the year that you want to check for leap year");
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        if (a%4==0) {
            if (a % 100 == 0) {

                if (a % 400 == 0) {
                    System.out.println("It is a leap year");
                } else {
                    System.out.println("it is not a leap year");
                }
            }
        }
        else {
            System.out.println("it is not a leap year");
        }
    }
}
