package java_fundamentals;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {

        System.out.println("Enter a Number");
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        switch (a){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Wrong input (Should be between and equal to 1 and 7)");
        }

    }
}
