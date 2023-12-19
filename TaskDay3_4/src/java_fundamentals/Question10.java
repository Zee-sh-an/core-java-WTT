package java_fundamentals;

import java.util.Scanner;

public class Question10 {

    public static void main(String[] args) {

        System.out.println("Enter the number tha you want for multiplication");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int count;
        for (int i=1;i<=10;i++){

            count=a*i;

            System.out.println(count);

        }
    }
}
