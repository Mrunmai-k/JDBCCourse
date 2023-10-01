import java.sql.*;
public class CRUD {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:postgresql://localhost:5432/demo" ;
        String user = "postgres";
        String pass = "Mrunmai@24";

        //String ins = "insert into student values(3,'Bhagyashri',56)";
        //String up = "update student set sname='John' where sname='Bhagyashri'";
        String del = "delete from student where sid = 3";
        Connection conn = DriverManager.getConnection(url,user,pass);  //SQLException
        System.out.println("Connection Established");
        Statement st = conn.createStatement();
        System.out.println(st.execute(del));


        conn.close();
        System.out.println("Connection Closed");
    }
}