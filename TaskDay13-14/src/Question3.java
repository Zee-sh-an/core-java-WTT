package src;

import java.io.*;

public class Question3 {

//    -->Question3
// Enhance the previous file reading program to handle exceptions gracefully.
// Implement appropriate exception handling for file-related operations.

    public static void main(String[] args) {

        try {

            File file = new File("zeeshan.txt");//file will create in a package
//            File file = new File("D:\\zeeshan.txt");//file will create in a disk particular path
            file.createNewFile();

            System.out.println("new file created Sucessfully");

//          -->writting file
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("Hello zeeshan keep it up.");

            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(" Hello zeeshan you are doing well! \n Be active");
            bufferedWriter.close();
            fileWriter.close();
            System.out.println("File written sucessfully written");


//          -->Reading file
            FileReader fileReader = new FileReader(file);

            BufferedReader br = new BufferedReader(fileReader);
//          readline only reads a line but using a while loop it will print the next line
            String line;
            while ((line=br.readLine())!=null){
                System.out.println(line);
            }

//            System.out.println(br.readLine());
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    }
