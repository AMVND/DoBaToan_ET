package problem02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class MagazineManager {
	public static int insertMagazines(int documentcode,String publishername, String issuenumber,
			String name, int number, int month) {

		ResultSet rs = null;
	int magazineId = 0;
	
	String sql = "INSERT INTO magazine(documentcode, publishername, issuenumber, name, number,month) "
	+ "VALUES(?,?,?,?,?,?)";
	
	try (Connection conn = ConnectToDatabase.getConnection();
	PreparedStatement pstmt = conn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);) {
	
	pstmt.setInt(1, documentcode);
	pstmt.setString(2, publishername);
	pstmt.setString(3, issuenumber);
	pstmt.setString(4, name);
	pstmt.setInt(5, number);
	pstmt.setInt(6, month);
	
	pstmt.executeUpdate();
	
	} catch (SQLException ex) {
		System.out.println(ex.getMessage());
	} finally {
	try {
		if(rs != null)  rs.close();
	} catch (SQLException e) {
		System.out.println(e.getMessage());
		}
	}
	
	return magazineId;
	}
	/**
	* @param args the command line arguments
	*/
	public static void main(String[] args) {

	}
	public void show() {
		String sql = "SELECT documentcode, publishername, issuenumber, name, number,month " +
                "FROM magazine";
    
   try (Connection conn = ConnectToDatabase.getConnection();
        Statement stmt  = conn.createStatement();
        ResultSet rs    = stmt.executeQuery(sql)) {
       
      
       while (rs.next()) {
           System.out.println(rs.getInt("documentcode") + "\t" + 
                              rs.getString("publishername")  + "\t" +
                              rs.getString("issuenumber") + "\t" + 
                              rs.getString("name") + "\t"+ 
                              rs.getInt("number") + "\t"+ 
                              rs.getInt("month"));
                
       }
   } catch (SQLException ex) {
       System.out.println(ex.getMessage());
   }
	}
}