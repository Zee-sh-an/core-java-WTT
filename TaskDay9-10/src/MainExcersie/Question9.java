package MainExcersie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

//--> Set insertion

public class Question9 {
    public static void main(String[] args) {

        System.out.println("Enter the size of first the set");
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        Integer [] set1=new Integer[a];
        for (int i=0;i<a;i++){
            System.out.println("Enter the "+i+ " element");
            int b= sc.nextInt();
            set1[i]=b;
        }
        System.out.println("Enter the size of second set");
        int c= sc.nextInt();
        Integer [] set2=new Integer[c];
        for (int i=0;i<c;i++){
            System.out.println("Enter the "+i+ " element");
            int d= sc.nextInt();
            set2[i]=d;
        }

        HashSet<Integer> hashSet=new HashSet<>();
        hashSet.addAll(Arrays.asList(set2));
        hashSet.addAll(Arrays.asList(set1));
        System.out.println(hashSet);
    }
}
