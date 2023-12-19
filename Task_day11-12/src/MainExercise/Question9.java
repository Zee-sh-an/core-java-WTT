package MainExercise;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;

public class Question9 {

    public static void main(String[] args) throws SQLException {

//      --> first set up mysql connector 8.1

        Connection con = null;
        ResultSet resultSet=null;


            try {

                //driver class load

//                Class.forName("com.mysql.jdbc.Driver");
                Class.forName("com.mysql.cj.jdbc.Driver");

//			create a connection....

                String url="jdbc:mysql://localhost:4040/walkingtree";
                String user="root";
                String password="root";

                con = DriverManager.getConnection(url, user, password);
//                 ---> creating a table uncomment line 31,34,35 and 66.
//                String query ="create table Student(Id int(10) primary key ,Name varchar(200))";
//
                Statement statement= con.createStatement();
//                statement.executeUpdate(query);
//                System.out.println("table is created");

//                --> inserting values in a table as a user input
                String q="insert into student (Name) values (?)";

                PreparedStatement pstmt=con.prepareStatement(q);

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter name that u want to insert");
                String name=br.readLine();

//                -->seting values
                pstmt.setString(1,name);


                pstmt.executeUpdate();

                System.out.println("value inserted");


//                ---> fetching values from database
                String fetch="Select * From student";

                resultSet=statement.executeQuery(fetch);

                while (resultSet.next()){
                    System.out.println("Name : " + resultSet.getString("Name"));
                    System.out.println("Id : " + resultSet.getString("Id"));
                    System.out.println();
                }

//                System.out.println("table is created");
                con.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
            finally {

//                --> closing database
                try {
                    if (con.isClosed()){
                        System.out.println("connection is closed");
                    }else {
                        System.out.println("connection is created");
                    }
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }
    }
