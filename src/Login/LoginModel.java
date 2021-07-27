/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import com.mysql.jdbc.exceptions.jdbc4.CommunicationsException;
import java.awt.HeadlessException;
import java.sql.DriverManager;
import java.sql.SQLException;
import method.dataForAll;

/**
 *
 * @author Andika
 */
public class LoginModel extends dataForAll {

    
    public boolean isUsernamePassEquals(String uname, String pass){
        boolean status = false;
        try{
            
            Class.forName(JDBC_DRIVER);  
            conn = DriverManager.getConnection(URL_WITH_DB, username, password);  
              
            query = "SELECT * FROM LOGIN";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(query);
            
            while (rs.next()) {
                if(uname.equals(rs.getString("username")) && pass.equals(rs.getString("password"))) {
                    status = true;
                }
            }
            rs.close();
            stmt.close();
            conn.close();
            
        } catch(CommunicationsException e) {
            notifErrorTryCatch(e);
        } catch(HeadlessException | ClassNotFoundException | SQLException e){
            notifErrorTryCatch(e);
        }
        return status;
    }
}
