package project1;

import java.sql.*;
import java.util.Arrays;
import java.util.Scanner;

public class Demo1
{
    static final String url="jdbc:mysql://localhost:3306/college";
    static final String user="root";
    static final String password="Baswaraj@143";
    public static void main(String []args) throws Exception
    {
        Connection con = DriverManager.getConnection(url,user,password);
         String query="insert into books(books_id,books_name,books_price) values(?,?,?)";
        PreparedStatement pst = con.prepareStatement(query);
//        ResultSet rs =pst.executeQuery();
       Scanner sc= new Scanner(System.in);
       while(true){
           System.out.println("Enter id: ");
           int books_id = sc.nextInt();
           System.out.println("Enter name: ");
           String books_name=sc.next();
           System.out.println("Enter price: ");
           double books_price=sc.nextDouble();
           System.out.println("Enter more data(Y/N): ");
           String choice=sc.next();
           pst.setInt(1,books_id);
           pst.setString(2,books_name);
           pst.setDouble(3, books_price);

           pst.addBatch();
           if (choice.toUpperCase().equals("N")){
               break;
           }
       }
       int[] arr = pst.executeBatch();
       for(int i=0;i<arr.length;i++){
           if(arr[i]==0){
               System.out.println("Query: "+i+"  not executed successfully!!");
           }
       }


        con.close();
    }
}

class M{
    public static void main(String[] args) throws Exception {
       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","Baswaraj@143");
       String query ="insert into books(books_id,books_name,books_price) values(?,?,?)";
       PreparedStatement st= con.prepareStatement(query);
      // ResultSet rs=st.executeQuery("insert into books(books_id,books_name,books_price) values(?,?,?)");
       Scanner sc=new Scanner(System.in);
       while (true){
           System.out.println("Enter id: ");
           int books_id=sc.nextInt();
           System.out.println("Enter name: ");
           String books_name=sc.next();
           System.out.println("Enter price: ");
           double books_price=sc.nextDouble();
           System.out.println("Enter more data (Y/N)");
           String choice = sc.next();
           st.setInt(1,books_id);
           st.setString(2,books_name);
           st.setDouble(3,books_price);
           st.addBatch();
           if(choice.toUpperCase().equals("N")){
               break;
           }
       }
       int arr[]= st.executeBatch();
       for(int i=0;i<arr.length;i++){
           if(arr[i]==0){
               System.out.println("Query"+i+"not executed successfully");
           }
       }
        System.out.println(Arrays.toString(arr));
       con.close();
    }

}

