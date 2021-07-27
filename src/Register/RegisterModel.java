/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Register;

import com.mysql.jdbc.exceptions.jdbc4.CommunicationsException;
import java.awt.HeadlessException;
import java.sql.DriverManager;
import java.sql.SQLException;
import method.dataForAll;

/**
 *
 * @author Andika
 */
public class RegisterModel extends dataForAll {
    
    public void registerUser(String uname, String pass, String namaDep, String namaBel){
        try{
            
            Class.forName(JDBC_DRIVER);  
            conn = DriverManager.getConnection(URL_WITH_DB, username, password);  
              
            query = "INSERT INTO login VALUES('"
                    + namaDep + "', '"
                    + namaBel + "', '"
                    + uname + "', '"
                    + pass + "')";
            stmt = conn.createStatement();
            int rs = stmt.executeUpdate(query);
            stmt.close();
            conn.close();
            
        } catch(CommunicationsException e) {
            notifErrorTryCatch(e);
        } catch(HeadlessException | ClassNotFoundException | SQLException e){
            notifErrorTryCatch(e);
        }
    }
}
