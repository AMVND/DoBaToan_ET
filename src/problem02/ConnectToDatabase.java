package problem02;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class ConnectToDatabase {
   public static Connection getConnection() throws SQLException {
	   
      String MySQLURL = "jdbc:mysql://localhost:3306/dobatoan_et?useSSL=false";
      String databseUserName = "root";
      String databasePassword = "1111";
      Connection con = null;
      try {
         con = DriverManager.getConnection(MySQLURL, databseUserName, databasePassword);
         if (con != null) {
            System.out.println("Database connection is successful !!!!");
         }
      } catch (Exception e) {
         e.printStackTrace();
      }
	return con;
   }
}
