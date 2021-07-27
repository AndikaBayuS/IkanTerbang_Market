/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramDataBarang;

import com.mysql.jdbc.exceptions.jdbc4.CommunicationsException;
import java.awt.HeadlessException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import method.dataForAll;

/**
 *
 * @author Andika
 */
public class DataModel extends dataForAll {
    
    public static DefaultTableModel model = new DefaultTableModel();
    
    public void insertData(int kodeBarang, String namaBarang, int hargaBeli, int hargaJual, int Jumlah){
        try {
            Class.forName(JDBC_DRIVER);  
            conn = DriverManager.getConnection(URL_WITH_DB, username, password);  
              
            query = "INSERT INTO databarang VALUES(" 
                    + kodeBarang + ", '" 
                    + namaBarang + "', " 
                    + hargaBeli  + ", " 
                    + hargaJual + ", " 
                    + Jumlah 
                    + ");";
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
    
    public void deleteData(String kodeBarang) {
        try {
            Class.forName(JDBC_DRIVER);  
            conn = DriverManager.getConnection(URL_WITH_DB, username, password);  

            query = "DELETE FROM databarang WHERE kodeBarang="+ Integer.parseInt(kodeBarang);
            int rs = stmt.executeUpdate(query);

            stmt.close();
            conn.close();
        } catch(CommunicationsException e) {
            notifErrorTryCatch(e);
        } catch(HeadlessException | ClassNotFoundException | SQLException e){
            notifErrorTryCatch(e);
        }
    }
    
    public void updateData(int kodeBarang, String namaBarang, int hargaBeli, int hargaJual, int Jumlah){
        try {
            Class.forName(JDBC_DRIVER);  
            conn = DriverManager.getConnection(URL_WITH_DB, username, password);  
              
            query = "UPDATE databarang SET " 
                    + "kodeBarang= " + kodeBarang + ", " 
                    + "namaBarang='" + namaBarang + "', " 
                    + "hargaBeli=" + hargaBeli  + ", " 
                    + "hargaJual=" + hargaJual + ", " 
                    + "jumlah=" + Jumlah
                    + " WHERE kodeBarang=" + kodeBarang;
            PreparedStatement rs = conn.prepareStatement(query);
            rs.execute();
            
            rs.close();
            conn.close();
        } catch(CommunicationsException e) {
            notifErrorTryCatch(e);
        } catch(HeadlessException | ClassNotFoundException | SQLException e){
            notifErrorTryCatch(e);
        }
    }
    
    public void setupTable() {
        try{
            Class.forName(JDBC_DRIVER);  
            conn = DriverManager.getConnection(URL_WITH_DB, username, password);

            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM databarang");
          
            model.addColumn("Kode Barang");
            model.addColumn("Nama Barang");
            model.addColumn("Jumlah");
            model.addColumn("Harga Beli");
            model.addColumn("Harga Jual");

            while(rs.next()) {
                Object[] row = {
                    rs.getInt("kodeBarang"),
                    rs.getString("namaBarang"),
                    rs.getInt("jumlah"),
                    rs.getInt("hargaBeli"),
                    rs.getInt("hargaJual"),
                };
                model.addRow(row);
            }
        } catch(CommunicationsException e) {
            notifErrorTryCatch(e);
        } catch(HeadlessException | ClassNotFoundException | SQLException e){
            notifErrorTryCatch(e);
        }  
    }
}
