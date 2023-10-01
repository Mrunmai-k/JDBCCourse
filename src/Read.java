import java.sql.*;

public class Read {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        /*
        * import package
        * load and register
        * create connection
        * create statement
        * execute statement
        * process the result
        * close connection
        */

       String url = "jdbc:postgresql://localhost:5432/demo" ;
       String user = "postgres";
       String pass = "Mrunmai@24";
//       String sql1 = "select sname from student where sid=1";
       String sql2 = "select * from student";

       //optional
        //Class.forName("org.postgresql.Driver"); // ClassNotFoundEx
        Connection conn = DriverManager.getConnection(url,user,pass);  //SQLException

        System.out.println("Connection Established");

        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(sql2);
//        rs.next();
//        String name = rs.getString("sname");
//        System.out.println("Name of the student is: "+name);

        while(rs.next()){
            System.out.print(rs.getInt(1) + " - ");
            System.out.print(rs.getString(2) + " - ");
            System.out.println(rs.getInt(3));
        }

        conn.close();
        System.out.println("Connection Closed");
    }
}
