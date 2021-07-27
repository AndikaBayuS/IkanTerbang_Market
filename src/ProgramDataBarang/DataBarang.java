/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramDataBarang;

import AplikasiPenjualan.MenuUtama;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author YOGI
 */
public class DataBarang extends javax.swing.JFrame {

    /**
     * Creates new form DataBarang
     */
    DataModel dataModel = new DataModel();
    
    public DataBarang() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fieldHarga = new javax.swing.JTextField();
        fieldNama = new javax.swing.JTextField();
        fieldKode = new javax.swing.JTextField();
        fieldJumlah = new javax.swing.JSpinner();
        fieldHJual = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnInsert = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        dataTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fieldHarga.setBorder(null);
        fieldHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldHargaActionPerformed(evt);
            }
        });
        getContentPane().add(fieldHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 150, 20));

        fieldNama.setBorder(null);
        fieldNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNamaActionPerformed(evt);
            }
        });
        getContentPane().add(fieldNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 190, 20));

        fieldKode.setBorder(null);
        fieldKode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldKodeActionPerformed(evt);
            }
        });
        getContentPane().add(fieldKode, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 90, 20));

        fieldJumlah.setBorder(null);
        getContentPane().add(fieldJumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 70, 20));

        fieldHJual.setBorder(null);
        getContentPane().add(fieldHJual, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 160, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProgramDataBarang/dataBarangBackButton.png"))); // NOI18N
        jButton1.setToolTipText("");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 90, 30));

        btnInsert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProgramDataBarang/dataBarangInsertButton.png"))); // NOI18N
        btnInsert.setBorderPainted(false);
        btnInsert.setContentAreaFilled(false);
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });
        getContentPane().add(btnInsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 80, -1));

        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProgramDataBarang/dataBarangClearButton.png"))); // NOI18N
        btnClear.setBorderPainted(false);
        btnClear.setContentAreaFilled(false);
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        getContentPane().add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 80, -1));

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProgramDataBarang/dataBarangDeleteButton.png"))); // NOI18N
        btnDelete.setBorderPainted(false);
        btnDelete.setContentAreaFilled(false);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 470, 70, 30));

        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProgramDataBarang/dataBarangUpdateButton.png"))); // NOI18N
        btnEdit.setBorderPainted(false);
        btnEdit.setContentAreaFilled(false);
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        getContentPane().add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, 90, -1));

        dataTable.setModel(DataModel.model);
        dataModel.setupTable();
        dataTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dataTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(dataTable);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 620, 140));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProgramDataBarang/Data barang.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fieldHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldHargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldHargaActionPerformed

    private void fieldKodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldKodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldKodeActionPerformed

    private void fieldNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldNamaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new MenuUtama().setVisible(true);
        DataModel.model.setColumnCount(0);
        DataModel.model.setRowCount(0);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        String kdBarang = fieldKode.getText();
        String namaBarang = fieldNama.getText();
        String hrgBeli = fieldHarga.getText();
        String hrgJual = fieldHJual.getText();
        int jumlah = (int) fieldJumlah.getValue();
        int kodeBarang = Integer.parseInt(kdBarang);
        int hargaBeli = Integer.parseInt(hrgBeli);
        int hargaJual = Integer.parseInt(hrgJual);
        
        boolean check = (fieldKode.equals("") || fieldNama.equals("") || fieldHarga.equals("") || fieldHJual.equals("")); 
        
        if(check) {
            JOptionPane.showMessageDialog(null, "Please fill all forms!");
        }else{
            dataModel.insertData(kodeBarang, namaBarang, hargaBeli, hargaJual, jumlah);
            JOptionPane.showMessageDialog(null, "Data submitted");
            DataModel.model.setColumnCount(0);
            DataModel.model.setRowCount(0);
            
            dataModel.setupTable();
            fieldKode.setText("");
            fieldNama.setText("");
            fieldJumlah.setValue(0);
            fieldHarga.setText("");
            fieldHJual.setText("");
        }
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        fieldKode.setText("");
        fieldNama.setText("");
        fieldJumlah.setValue(0);
        fieldHarga.setText("");
        fieldHJual.setText("");
        
        JOptionPane.showMessageDialog(null, "Form cleared!");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int getRow = dataTable.getSelectedRow();
        String kodeBarang = dataTable.getModel().getValueAt(getRow,0).toString();
        dataModel.deleteData(kodeBarang);
        dataModel.model.removeRow(getRow);
        JOptionPane.showMessageDialog(null, "Data deleted!");
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        String kdBarang = fieldKode.getText();
        String namaBarang = fieldNama.getText();
        String hrgBeli = fieldHarga.getText();
        String hrgJual = fieldHJual.getText();
        int jumlah = (int) fieldJumlah.getValue();
        int kodeBarang = Integer.parseInt(kdBarang);
        int hargaBeli = Integer.parseInt(hrgBeli);
        int hargaJual = Integer.parseInt(hrgJual);
        
        JOptionPane.showMessageDialog(null, "Data updated!");
        dataModel.updateData(kodeBarang, namaBarang, hargaBeli, hargaJual, jumlah);
        DataModel.model.setColumnCount(0);
        DataModel.model.setRowCount(0);
        dataModel.setupTable();
    }//GEN-LAST:event_btnEditActionPerformed

    private void dataTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataTableMouseClicked
        int getRow = dataTable.rowAtPoint(evt.getPoint());
        String kdBarang = dataTable.getValueAt(getRow, 0).toString();
        fieldKode.setText(kdBarang);
        
        String namaBarang = dataTable.getValueAt(getRow, 1).toString();
        fieldNama.setText(namaBarang);
        
        String jml = dataTable.getValueAt(getRow, 2).toString();
        int jumlah = Integer.parseInt(jml);
        fieldJumlah.setValue(jumlah);
        
        String hrgBeli = dataTable.getValueAt(getRow, 3).toString();
        fieldHarga.setText(hrgBeli);
        
        String hrgJual = dataTable.getValueAt(getRow, 4).toString();
        fieldHJual.setText(hrgJual);
    }//GEN-LAST:event_dataTableMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DataBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataBarang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnInsert;
    private javax.swing.JTable dataTable;
    private javax.swing.JTextField fieldHJual;
    private javax.swing.JTextField fieldHarga;
    private javax.swing.JSpinner fieldJumlah;
    private javax.swing.JTextField fieldKode;
    private javax.swing.JTextField fieldNama;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
