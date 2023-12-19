package src.Exercise;

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) throws ClassNotFoundException {

        System.out.println("Enter a number (for unchecked exception)");
        Scanner sc=new Scanner(System.in);

//   --> for arithmetic exception

        try {

            int a=sc.nextInt();
            int c= a/0;
            System.out.println(c);

        }catch (Exception e){
            e.printStackTrace();
        }

        finally {
            System.out.println("That was unchecked exception (Arithmetic Exception)");
        }

        System.out.println("Enter a String (for checked exception)");
        String s=sc.next();

// --> class not found exception

        try {
            Class.forName(s);
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            System.out.println("That was checked exception(ClassNotFoundException)");
        }
    }
}