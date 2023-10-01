import java.sql.*;

public class CRUD {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:postgresql://localhost:5432/demo";
        String user = "postgres";
        String pass = "Mrunmai@24";

        int sid = 5;
        String name = "Momo";
        int marks = 67;

        //String ins1 = "insert into student values(3,'Bhagyashri',56)";
        String ins2 = "insert into student values(" + sid + ",'" + name + "'," + marks + ")";
        //String up = "update student set sname='John' where sname='Bhagyashri'";
        //String del = "delete from student where sid = 3";
        Connection conn = DriverManager.getConnection(url, user, pass);  //SQLException
        System.out.println("Connection Established");
        Statement st = conn.createStatement();
        System.out.println(st.execute(ins2));


        conn.close();
        System.out.println("Connection Closed");
    }
}