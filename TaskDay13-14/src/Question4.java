package src;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Question4 {

//    -->Question4
//    Create a program that uses BufferedReader to read a CSV file containing student names and scores.
//    Process the data and display the average score.

    public static void main(String[] args) {

        try {
            FileReader fileReader = new FileReader("csvfile.txt");

            BufferedReader br = new BufferedReader(fileReader);

            String [] student;
            String line;
            int count=0;
            while ((line =br.readLine())!=null){

                student= line.split(",");

                System.out.println("Name : "+student[0]+" - Score : "+student[1]);
//                System.out.println(student[1]);
                int num=Integer.parseInt(student[1]);
                count+=num;
            }
            System.out.println("Average of score is: "+count/2);
//
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}