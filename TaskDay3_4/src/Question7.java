import java.util.Scanner;

public class Question7 {

    public static void main(String[] args) {

        System.out.println("Enter the number nth ");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int a=0,b=1,c;
        System.out.println(a);
        System.out.println(b);
        for (int i=0;i<n;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.println(c);
        }

    }

}
