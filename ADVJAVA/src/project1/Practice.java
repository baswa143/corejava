package project1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Practice {
    private static final String DB_URL2="jdbc:mysql://localhost:3306/college";
    private static final String DB_User="root";
    private static final String DB_PASSWORD="Baswaraj@143";
   // private static final String Create_Sql = "CREATE TABLE STUDENT(STUDENT_id INT(24),STUDENT_NAME VARCHAR(100),STUDENT_FEE INT(40)";
    private static final String INSERT_SQL="INSERT INTO books VALUES(103,'SANDESH',3000)";
    public static void main(String args[]) throws Exception{
        //Local driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        //DB Connection
        Connection con = DriverManager.getConnection(DB_URL2,DB_User,DB_PASSWORD);

        //create statement
        Statement st = con.createStatement();

        //execute query
       // st.executeUpdate(Create_Sql);
        int rowsEffected = st.executeUpdate(INSERT_SQL);
        System.out.println("rows counted :"+rowsEffected);
        con.close();

    }

}

class Frd{
    private static final String DB_URL="jdbc:mysql://localhost:3306/college";
    private static final String DB_User="root";
    private static final String DB_Password="Baswaraj@143";
    private static final String INDEX_SQL1="INSERT INTO books VALUES(101,'SHIVA',349034)";
    public static void main(String []args)throws Exception{
        //class driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        // DB connection
        Connection con = DriverManager.getConnection(DB_URL,DB_User,DB_Password);
        //Statement
        Statement st= con.createStatement();
        int rowEffected=st.executeUpdate(INDEX_SQL1);
        System.out.println("rows counted :"+rowEffected);
        con.close();

    }
}

class A{
    public static final String DB_URL="jdbc:mysql://localhost:3306/college";
    public static final String DB_user="root";
    public static final String DB_password="Baswaraj@143";
    public static final String INdex_SQL="INSERT INTO books VALUES(105,'SCIENCE',3000)";
    public static void main(String []args) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(DB_URL,DB_user,DB_password);
        Statement st= con.createStatement();
        int rowEffected = st.executeUpdate(INdex_SQL);
        System.out.println("rows counted :"+rowEffected);
        con.close();
    }

}
class B{
    public static void main(String []args)throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/data","root","Baswaraj@143");
        Statement st=con.createStatement();
        int rows = st.executeUpdate("insert into books values(106,'corejava',4000)");
        System.out.println("rows counted:"+rows);
        con.close();
    }
}

class C{
    public static void main(String []args) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/data","root","Baswaraj@143");
        Statement st=con.createStatement();
        int rows=st.executeUpdate("insert into books values(108,'sql',5000)");
        System.out.println("rows counted:"+rows);
        con.close();
    }
}

class D{
    public static void main(String[] args)throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/data","root","Baswaraj@143");
        Statement st=con.createStatement();
        int rows=st.executeUpdate("insert into books values(108,'maths',5000)");
        System.out.println("rows counted:"+rows);
        con.close();
    }

}

class E{
    public static final String DB_URL="jdbc:mysql://localhost:3306/college";
    public static final String DB_USER="root";
    public static final String DB_PASSWORD ="Baswaraj@143";
    public static final String DELETE_SQL="delete from books where books_id=101";

    public static void main(String args[])throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
        Statement st=con.createStatement();
        int cnt=st.executeUpdate(DELETE_SQL);

        System.out.println("rows counted:"+cnt);
        con.close();

    }

}

class F{
    public static final String DB_URL="jdbc:mysql://localhost:3306/college";
    public static final String DB_USER="root";
    public static final String DB_PASSWORD="Baswaraj@143";
    public static final String SELECT_SQL="select *from books where books_id=105";

    public static void main(String []args) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery(SELECT_SQL);
        if(rs.next()){
            int bookid = rs.getInt("books_id");
            String name = rs.getString("books_name");
            double price = rs.getDouble("books_price");

            System.out.println(bookid);
            System.out.println(name);
            System.out.println(price);
        }
        else{
            System.out.println("no record found");
        }

    }
}

class G{
    public static final String DB_URL="jdbc:mysql://localhost:3306/college";
    public static final String DB_USER="root";
    public static final String DB_PASSWORD="Baswaraj@143";
    public static final String SELECT_SQL="select *from books where books_id=105";
    public static void main(String []args) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery(SELECT_SQL);
        if(rs.next()){
            int book_id =rs.getInt("books_id");
            String name = rs.getString("books_name");
            double price = rs.getDouble("books_price");
            System.out.println(book_id);
            System.out.println(name);
            System.out.println(price);
        }
        else{
            System.out.println("no record found");
        }
        con.close();
    }
}

class Demo{
    public static final String URL="jdbc:mysql://localhost:3306/college";
    public static final String USER="root";
    public static final String PASSWORD="Baswaraj@143";

    public static void main(String []args) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con= DriverManager.getConnection(URL,USER,PASSWORD);
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select *from brainwork");

        while(rs.next()){
            System.out.println(rs.getString("name"));
            System.out.println(rs.getString("course"));
        }
        con.close();

    }

}
