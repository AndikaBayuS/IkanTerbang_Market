/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RekapData;

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
public class RekapModel extends dataForAll {
    
    public static DefaultTableModel model = new DefaultTableModel();
    public static DefaultTableModel modelTransaksi = new DefaultTableModel();
    
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
