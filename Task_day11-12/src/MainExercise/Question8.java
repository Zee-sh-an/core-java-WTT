package src.MainExercise;

import java.util.Scanner;

class NegativeNumberException extends Exception{

    public NegativeNumberException(String number){
        super(number);
    }
}

public class Question8 {

    static void number(int num) throws NegativeNumberException{
        if (num<0){
            throw new NegativeNumberException("number is negative");
        }else {
            System.out.println("Number is positive");
        }
    }

    public static void main(String[] args)   {

        try {

            System.out.println("Enter a number");
            Scanner sc=new Scanner(System.in);
            int a= sc.nextInt();
            number(a);

        }catch (NegativeNumberException e){

            System.out.println(e);

        }


    }

}
