import java.util.*;
import java.sql.*;
public class StudentDB {
    public static void main(String[] args) {
 
        // creates three different Connection objects
        Connection conn1 = null;
   
        try {
            // connect way #1
            String url = "jdbc:mysql://localhost:3306/studentDB";
            String user = "root";
            String password = "admin123";
			Class.forName("com.mysql.jdbc.Driver");  
            conn1 = DriverManager.getConnection(url, user, password);
            if (conn1 != null) {
                System.out.println("Connected to the database bank");
				Statement st=conn1.createStatement();
				ResultSet rs=st.executeQuery("select * from students");
				while(rs.next())
					System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
            }

			
        } catch (Exception ex) {
            System.out.println("An error occurred. Maybe user/password is invalid");
            ex.printStackTrace();
        }
    }
}