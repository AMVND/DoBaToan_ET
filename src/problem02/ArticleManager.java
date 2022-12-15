package problem02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class ArticleManager {
	public static int insertArticles(int documentcode,String publishername, String issuenumber,
			String content, String publicDate) {

		ResultSet rs = null;
	int articleId = 0;
	
	String sql = "INSERT INTO article(documentcode, publishername, issuenumber, content, publicDate) "
	+ "VALUES(?,?,?,?,?)";
	
	try (Connection conn = ConnectToDatabase.getConnection();
	PreparedStatement pstmt = conn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);) {
	
	pstmt.setInt(1, documentcode);
	pstmt.setString(2, publishername);
	pstmt.setString(3, issuenumber);
	pstmt.setString(4, content);
	pstmt.setString(5, publicDate);
	
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
	
	return articleId;
	}
	/**
	* @param args the command line arguments
	*/
	
	public void show() {
		String sql = "SELECT documentcode, publishername, issuenumber, content, publicDate " +
                "FROM article";
    
   try (Connection conn = ConnectToDatabase.getConnection();
        Statement stmt  = conn.createStatement();
        ResultSet rs    = stmt.executeQuery(sql)) {
       
      
       while (rs.next()) {
           System.out.println(rs.getInt("documentcode") + "\t" + 
                              rs.getString("publishername")  + "\t" +
                              rs.getString("issuenumber") + "\t" + 
                              rs.getString("content") + "\t"+ 
                              rs.getString("publicDate"));
                
       }
   } catch (SQLException ex) {
       System.out.println(ex.getMessage());
   }
	}
	public static void main(String[] args) {
		

	}

}