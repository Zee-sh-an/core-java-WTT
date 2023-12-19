package java_fundamentals;

import java.util.Random;
import java.util.Scanner;

public class Question9 {

    public static void main(String[] args) {
        int a,rand;
        Random random=new Random();
        rand=random.nextInt(1,100);
        do {
            System.out.println("Enter the number you guess");
            Scanner sc=new Scanner(System.in);
            a=sc.nextInt();
            if (rand==a){
                System.out.println("correct");
            } else if (rand>a) {
                System.out.println("number is greater");
            }else {
                System.out.println("number is less");
            }
        }while (a!=rand);
    }

}
