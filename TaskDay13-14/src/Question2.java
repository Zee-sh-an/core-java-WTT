import java.io.*;

public class Question2 {

//    -->Question2
//    Write a program to create a new text file and write some
//    content to it using FileWriter and BufferedWriter.

    public static void main(String[] args)  {

        try {

            File file = new File("zeeshan.txt");//file will create in a package
//            File file = new File("D:\\zeeshan.txt");//file will create in a disk particular path
             file.createNewFile();

            System.out.println("new file created Sucessfully");

//          -->writting file
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("Hello zeeshan keep it up.");

            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(" Hello zeeshan you are doing well!");
            bufferedWriter.close();
            fileWriter.close();
            System.out.println("File written sucessfully written");


//          -->Reading file
            FileReader fileReader = new FileReader(file);

            BufferedReader br = new BufferedReader(fileReader);
            System.out.println(br.readLine());
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
