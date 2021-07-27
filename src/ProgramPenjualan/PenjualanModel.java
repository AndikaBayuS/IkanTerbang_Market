/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramPenjualan;

import com.mysql.jdbc.exceptions.jdbc4.CommunicationsException;
import java.awt.HeadlessException;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import method.dataForAll;

/**
 *
 * @author Andika
 */
public class PenjualanModel extends dataForAll {
    public static DefaultTableModel model = new DefaultTableModel();
    public static DefaultTableModel modelTransaksi = new DefaultTableModel();
    
    public void insertData(String kodeBarang, int hargaBarang, int Jumlah, int Potongan, int Total){
        try {
            Class.forName(JDBC_DRIVER);  
            conn = DriverManager.getConnection(URL_WITH_DB, username, password);  
              
            query = "INSERT INTO transaksi VALUES(" 
                    + kodeBarang + ", " 
                    + hargaBarang  + ", " 
                    + Jumlah + ", " 
                    + Potongan + ", "
                    + Total + ");";
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
    
    public void deleteData(String kodeBarang, String jumlah) {
        try {
            Class.forName(JDBC_DRIVER);  
            conn = DriverManager.getConnection(URL_WITH_DB, username, password);  

            query = "DELETE FROM transaksi WHERE kodeBarang="
                    + kodeBarang
                    + " AND jumlah=" + jumlah;
            int rs = stmt.executeUpdate(query);

            stmt.close();
            conn.close();
        } catch(CommunicationsException e) {
            notifErrorTryCatch(e);
        } catch(HeadlessException | ClassNotFoundException | SQLException e){
            notifErrorTryCatch(e);
        }
    }
    
    public void deleteAllData(){
        try {
            Class.forName(JDBC_DRIVER);  
            conn = DriverManager.getConnection(URL_WITH_DB, username, password);  
              
            query = "TRUNCATE transaksi";
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
    
    public void decrement(int jumlah, String kodeBarang) {
        try {
            Class.forName(JDBC_DRIVER);  
            conn = DriverManager.getConnection(URL_WITH_DB, username, password);  
              
            query = "UPDATE databarang SET jumlah = jumlah - " 
                    + jumlah 
                    + " WHERE kodeBarang = " + kodeBarang ;
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
    
    public void setupTableTransaksi() {
        try{
            Class.forName(JDBC_DRIVER);  
            conn = DriverManager.getConnection(URL_WITH_DB, username, password);

            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM transaksi");
          
            modelTransaksi.addColumn("Kode Barang");
            modelTransaksi.addColumn("Harga Barang");
            modelTransaksi.addColumn("Jumlah");
            modelTransaksi.addColumn("Potongan");
            modelTransaksi.addColumn("Total");

            while(rs.next()) {
                Object[] row = {
                    rs.getInt("kodeBarang"),
                    rs.getString("hargaBarang"),
                    rs.getInt("jumlah"),
                    rs.getInt("potongan"),
                    rs.getInt("total"),
                };
                modelTransaksi.addRow(row);
            }
        } catch(CommunicationsException e) {
            notifErrorTryCatch(e);
        } catch(HeadlessException | ClassNotFoundException | SQLException e){
            notifErrorTryCatch(e);
        }  
    }
}
