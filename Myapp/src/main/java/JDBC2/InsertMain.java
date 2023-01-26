package JDBC2;

import java.sql.*;

public class InsertMain {
    public static void main(String args[]) throws SQLException {
        Connection con=null;
        PreparedStatement ps=null;
        Statement stmt=null;
        try {
        Class.forName("com.mysql.jdbc.Driver");
        con= DriverManager.getConnection("jdbc:mysql://localhost/student","root","password");
        String q="insert into student.detail(ID, Name,city)Values(2,'kamlesh', 'Prayagraj')";
            stmt=con.createStatement();
        stmt.executeUpdate(q);
        System.out.println("table inserted");
        } catch(Exception e) {
             System.out.println(e);
        }
   finally {
            con.close();
        }
    }
}