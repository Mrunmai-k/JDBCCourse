import java.sql.*;

public class CRUD {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:postgresql://localhost:5432/demo";
        String user = "postgres";
        String pass = "Mrunmai@24";

        int sid = 4;
        String name = "Mitali";
        int marks = 55;
        /*

        //String ins1 = "insert into student values(3,'Bhagyashri',56)";
        //String ins2 = "insert into student values(" + sid + ",'" + name + "'," + marks + ")";
        //String up = "update student set sname='John' where sname='Bhagyashri'";
        //String del = "delete from student where sid = 3";
         */

        Connection conn = DriverManager.getConnection(url, user, pass);  //SQLException
        System.out.println("Connection Established");
//        Statement st = conn.createStatement();
//        System.out.println(st.execute(ins2));

        String sql = "insert into student values(?,?,?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1,sid);
        ps.setString(2,name);
        ps.setInt(3,marks);

        ps.execute();

        conn.close();
        System.out.println("Connection Closed");



    }
}