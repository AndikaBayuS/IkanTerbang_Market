/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package method;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Andika
 */
public class dataForAll extends javax.swing.JPanel {
    protected final String URL_WITH_DB = "jdbc:mysql://localhost:3306/dbikanterbang";
    protected final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
    protected Statement stmt = null;
    protected Connection conn = null;
    protected PreparedStatement preparedStmt;
    protected ResultSet rs;
    
    protected final String username = "root";
    protected final String password = "";
    protected String query = null;
    
    protected void notifErrorTryCatch(
        Exception e
    ) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, e.getMessage());
    }
}
