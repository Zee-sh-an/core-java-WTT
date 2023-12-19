package java_fundamentals;

import java.util.Scanner;

public class Question8 {

    public static void main(String[] args) {

        System.out.println("Enter the number for factorial");
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int count=1;
        for (int i=1;i<=a;i++){
            count=i*count;
        }
        System.out.println(count);


    }
}
