package hospital101;

import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pasindu
 */
public class DatabaseConnection{
    public Connection connection;
    public Statement statement;

    DatabaseConnection(String username, String password, String url){
        Properties info = new Properties();
        info.put( "user", username );
        info.put( "password", password );
        try {
            Driver myDriver = new com.mysql.jdbc.Driver();
            DriverManager.registerDriver( myDriver );
            connection = DriverManager.getConnection(url, info);
            statement = connection.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
            

        }
    }
    public int getSizeOfResults(ResultSet rowSet){
        try {
            if(rowSet.last()){
                int rowCount = rowSet.getRow();
                rowSet.beforeFirst();
            }
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 1;        
    }
    
}
