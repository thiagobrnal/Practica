package jdbc;

import java.sql.*;

public class JDBC {

    public static void main(String[] args) {
        
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            
            Connection con = (Connection) DriverManager.getConnection("jdbc:mariadb://localhost:3306/world", "root", "12345678");
            
            if (con != null) {
                System.out.println("Conexion exitosa");
                
                String query = "SELECT * FROM `city`";
                
                try(Statement stmt = con.createStatement()){
                    ResultSet rs = stmt.executeQuery(query);
                    
                    while (rs.next()) {
                        
                          System.out.println(rs.getString("ID") + "\t" + rs.getString("Name") + "\t" + rs.getString("Population"));
                    }
                }
            }
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Error!!"+ex);
        } catch (SQLException ex){
            System.out.println("Error db"+ ex);
        }
    }

}
