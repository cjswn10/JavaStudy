package hw;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectionProvider {

   public static void close(ResultSet rs, Statement stmt, Connection cnn) {

      try {
         if (rs != null) {
            rs.close();
         }
         if (stmt != null) {
            stmt.close();
         }
         if (cnn != null) {
            cnn.close();
         }
      } catch (Exception e) {
         System.out.println(e.getMessage());
      }
   }

   public static Connection getConnection() {

      Connection conn = null;

      try {
         Class.forName("oracle.jdbc.driver.OracleDriver");

         conn = DriverManager.getConnection("jdbc:oracle:thin:@203.236.209.105:1521:XE", "madang", "madang");
         Statement stmt = conn.createStatement();

      } catch (Exception e) {
         System.out.println(e.getMessage());
      }

      return conn;

   }

}