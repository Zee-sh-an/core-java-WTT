package java_fundamentals;

import java.util.Scanner;

public class Question4 {

    public static void main(String[] args) {

        System.out.println("Enter three numbers");
        Scanner sc=new Scanner(System.in);
        int count;
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
            if (a<b && c<b){
                System.out.println( b +" is greater");
            }
        if (a<c && b<c){
            System.out.println(c + " is greater");
        }
        if (b<a && c<a){
            System.out.println(a + " is greater");
        }
//   we can solve this question by this method also
        for (int i=0;i<=1;i++){
            if (a<b){
                a=c;
                count=b;
            }
            else {
                b=a;
                a=c;
                count=b;
            }
        }
        System.out.println(b);
        }
}
