import java.util.Random;
import java.util.Scanner;

public class Main {
    Scanner sc =new Scanner(System.in);
    int a=sc.nextInt();

    public static void VaribleDeclarationandInitialisation(){
        int age = 25;
        System.out.println(age);
    }

    public static void OddEven(){
        System.out.println("Enter Number to check odd or even");
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        if (a%2==0){
            System.out.println("Number is even");
        }else {
            System.out.println("Number is odd");
        }

    }
    public static void forLoop(){
        for (int i=1;i<=10;i++){
            System.out.println(i);
        }
    }
    public static void checkingAge(){
        System.out.println("Enter Your Age");
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        if(a>=18){
            System.out.println("You are eligible for vote");
        }else{
            System.out.println("you are not eligible for vote");
        }
    }

    public static void WhileLoopSum(){
        int a=2;
        int count=0;
        while (a<=50) {
//            System.out.println(a);
            if (a%2==0){
                count=count+a;
//                System.out.println(a);
            }
            a++;
        }
        System.out.println(count);
    }
    public static void SwitchStatement(){

        System.out.println("Enter a letter among 'A''B''C'");
        Scanner sc = new Scanner(System.in);
        char a=sc.next().charAt(0);
        switch (a){
            case 'A':
                System.out.println("Apple");
                break;
            case 'B':
                System.out.println("Banana");
                break;
            case 'C':
                System.out.println("Cherry");
                break;
        }
    }

    public static void GuessNumber(){
        int a;
        int rand;
        do {

            Random b = new Random();
            rand= b.nextInt(1,10);
            System.out.println("Enter the number");
            Scanner sc = new Scanner(System.in);
            a=sc.nextInt();
            if (rand==a){
                System.out.println("Your number is correct");
            }else {
                System.out.println("Try again");
            }
        }while (rand!=a);
    }
    public static void PrimeNumbers() {
//        int count = 0;

        for (int a=1;a<=50;a++) {
            int count = 0;
            for (int i=2; i<=a/2;i++) {
                    if (a%i == 0) {
                        count++;
                    }
            }
            if (count==0){
                System.out.println(a);
            }
        }
    }

    public static void FibonacciSequence(){

        System.out.println("Enter number ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int a=0,b=1,c;
        System.out.println(a);
        System.out.println(b);
        for(int i=1;i<=n;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.println(c);
        }
    }

    public static void factorial(){
        System.out.println("Enter number n");
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int a,b=1,c;
        for (int i=1;i<=n;i++){
            b=b*i;
        }
        System.out.println(b);
    }

    public static void main(String[] args) {
//        System.out.println("Hello world!");

//        Main.VaribleDeclarationandInitialisation();
//        Main.OddEven();
//        Main.forLoop();
//        Main.checkingAge();
//        Main.WhileLoopSum();
//        Main.SwitchStatement();
//        Main.GuessNumber();
        Main.PrimeNumbers();
//        Main.FibonacciSequence();
//        Main.factorial();
    }
}