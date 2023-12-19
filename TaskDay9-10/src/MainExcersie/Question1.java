package MainExcersie;

import java.util.Arrays;
import java.util.Scanner;
//--> Array Manipulation
public class Question1 {
    public static void main(String[] args) {

        System.out.println("Enter the array size");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int [] array=new int[a];
        for (int i=0;i<a;i++){
            System.out.println("Enter a number");
            int v= sc.nextInt();
            array[i]=v;
        }
        for (int u:array) {
            System.out.println(u);
        }
        int count=0;
        for (int u:array) {
            count +=u;
        }
        System.out.println("The sum of the array is "+ count);

        System.out.println("The average of array is "+ count/2);

    }
}
