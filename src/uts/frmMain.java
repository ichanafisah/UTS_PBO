/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Icha
 */
public class frmMain extends javax.swing.JFrame {

    /**
     * Creates new form frmMain
     */
    public frmMain() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtHarga = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TB = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        SAwal = new javax.swing.JComboBox<>();
        SAkhir = new javax.swing.JComboBox<>();
        JK = new javax.swing.JComboBox<>();
        txtNo = new javax.swing.JTextField();
        TD = new javax.swing.JComboBox<>();
        WB = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        Print1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(null);

        jLabel12.setText("FORM PEMESANAN KERETA API");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(10, 10, 670, 14);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(180, 10, 1110, 110);

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setLayout(null);

        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "NamaPemesan", "NoID", "StasiunAwal", "StasiunAkhir", "TanggalBerangkat", "JenisKereta", "WaktuBerangkat", "TempatDuduk", "Harga"
            }
        ));
        jScrollPane1.setViewportView(tblData);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(10, 11, 920, 510);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(350, 200, 940, 530);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Icha\\Downloads\\aww.jpg")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 0, 160, 130);

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));
        jPanel3.setLayout(null);
        jPanel3.add(jSeparator1);
        jSeparator1.setBounds(0, 29, 330, 10);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Pengisian Form ");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(10, 4, 150, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nama Pemesan");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(10, 40, 150, 17);
        jPanel3.add(txtNama);
        txtNama.setBounds(10, 60, 310, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("No ID");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(10, 100, 150, 17);
        jPanel3.add(txtHarga);
        txtHarga.setBounds(10, 540, 310, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Stasiun Awal");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(10, 160, 150, 17);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Stasiun Tujuan");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(10, 220, 150, 17);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Harga");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(10, 520, 150, 17);
        jPanel3.add(TB);
        TB.setBounds(10, 300, 310, 40);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Tanggal Berangkat");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(10, 280, 150, 17);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Jenis Kereta");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(10, 340, 150, 17);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Waktu Berangkat");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(10, 400, 150, 17);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Tempat Duduk");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(10, 460, 150, 17);

        SAwal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        SAwal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Stasiun Awal--", "Mojokerto", "Malang", "Jakarta", "Surabaya" }));
        jPanel3.add(SAwal);
        SAwal.setBounds(10, 180, 310, 40);

        SAkhir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        SAkhir.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Stasiun Akhir--", "Madiun", "Semarang", "Banyuwangi", "Yogyakarta" }));
        jPanel3.add(SAkhir);
        SAkhir.setBounds(10, 240, 310, 40);

        JK.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JK.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih Jenis Kereta--", "Ekonomi", "Bisnis", "Eksekutif" }));
        JK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JKActionPerformed(evt);
            }
        });
        jPanel3.add(JK);
        JK.setBounds(10, 360, 310, 40);
        jPanel3.add(txtNo);
        txtNo.setBounds(10, 120, 310, 40);

        TD.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        TD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih Gerbong--", "1", "2", "3", "4", "5" }));
        jPanel3.add(TD);
        TD.setBounds(10, 480, 310, 40);

        WB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        WB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih Waktu Berangkat--", "Pagi", "Siang", "Sore", "Malam" }));
        jPanel3.add(WB);
        WB.setBounds(10, 420, 310, 40);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(10, 130, 330, 600);

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));
        jPanel4.setLayout(null);

        btnAdd.setBackground(new java.awt.Color(204, 204, 204));
        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAdd.setText("Save");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel4.add(btnAdd);
        btnAdd.setBounds(220, 10, 100, 40);

        Reset.setBackground(new java.awt.Color(204, 204, 204));
        Reset.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Reset.setText("Clear");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });
        jPanel4.add(Reset);
        Reset.setBounds(340, 10, 100, 40);

        btnDelete.setBackground(new java.awt.Color(204, 204, 204));
        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel4.add(btnDelete);
        btnDelete.setBounds(470, 10, 100, 40);

        btnRefresh.setBackground(new java.awt.Color(204, 204, 204));
        btnRefresh.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        jPanel4.add(btnRefresh);
        btnRefresh.setBounds(590, 10, 100, 40);

        Print1.setBackground(new java.awt.Color(204, 204, 204));
        Print1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Print1.setText("Print");
        Print1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Print1ActionPerformed(evt);
            }
        });
        jPanel4.add(Print1);
        Print1.setBounds(710, 10, 100, 40);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(350, 130, 940, 60);

        setSize(new java.awt.Dimension(1314, 776));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
         
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String tanggal=dateFormat.format(TB.getDate());
        
        if ("".equals(txtNo.getText())||"".equals(txtNama.getText())||"".equals(SAwal.getItemListeners())||"".equals(SAkhir.getItemListeners())||tanggal.equals("")||"".equals(JK.getItemListeners())||"".equals(WB.getItemListeners())||"".equals(TD.getItemListeners())|| "".equals(txtHarga.getText())) {
            JOptionPane.showMessageDialog(this, "Harap Lengkapi Data", "Error",JOptionPane.WARNING_MESSAGE);
        } else {
            String SQL ="INSERT INTO t_pemesan (NoID,NamaPemesan,StasiunAwal,StasiunAkhir,TanggalBerangkat,JenisKereta,WaktuBerangkat,TempatDuduk,Harga) "
                    + "VALUES("+txtNo.getText()+",'"+txtNama.getText()+"','"+(String)SAwal.getSelectedItem()+"','"+(String)SAkhir.getSelectedItem()+"','"+tanggal+"','"+(String)JK.getSelectedItem()+"',"+(String)WB.getSelectedItem()+","+(String)TD.getSelectedItem()+",'"+txtHarga.getText()+"')";
            int status = KeretaDB.execute(SQL);
            if (status==1) {
                JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan","Sukses", JOptionPane.INFORMATION_MESSAGE);
                selectData();
            } else {
                JOptionPane.showMessageDialog(this, "Data gagal ditambahkan","Gagal",JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        // TODO add your handling code here:
        
        txtNo.setText("");
        txtNama.setText("");
        SAwal.setSelectedIndex(0);
        SAkhir.setSelectedIndex(0);
        JK.setSelectedIndex(0);
        TB.getDate();
        WB.setSelectedIndex(0);
        TD.setSelectedIndex(0);
        txtHarga.setText("");
    }//GEN-LAST:event_ResetActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int baris = tblData.getSelectedRow();
        if (baris!=-1) {
            String id = tblData.getValueAt(baris, 0).toString();
            String SQL = "DELETE FROM pesanan WHERE NoID='"+id+"'";
            int status;
            status = KeretaDB.execute(SQL);
            if (status==1) {
                JOptionPane.showMessageDialog(this, "Data berhasil dihapus","Sukses", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Data gagal dihapus","Gagal",JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Pilih baris data terlebih dahulu","Error",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        selectData();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void Print1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Print1ActionPerformed
        // TODO add your handling code here:
         MessageFormat header = new MessageFormat("Daftar Pemesanan Tiket");
        MessageFormat footer = new MessageFormat("Page {0,number,integer}     ");
        try {
            tblData.print(JTable.PrintMode.FIT_WIDTH, header, footer, true, null, true, null);
        } catch (Exception e) {
            System.err.format("Cannot Print %s%n",e.getMessage());
        }
    }//GEN-LAST:event_Print1ActionPerformed

    private void JKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JKActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_JKActionPerformed

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
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> JK;
    private javax.swing.JButton Print1;
    private javax.swing.JButton Reset;
    private javax.swing.JComboBox<String> SAkhir;
    private javax.swing.JComboBox<String> SAwal;
    private com.toedter.calendar.JDateChooser TB;
    private javax.swing.JComboBox<String> TD;
    private javax.swing.JComboBox<String> WB;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnRefresh;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblData;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNo;
    // End of variables declaration//GEN-END:variables

    private void selectData() {
        String kolom[] = {"NoID","NamaPemesan","StasiunAwal","StasiunAkhir",
            "TanggalBerangkat","JenisKereta","WaktuBerangkat","TempatDuduk","Harga"};
        DefaultTableModel dtm = new DefaultTableModel(null, kolom);
        String SQL = "SELECT * FROM t_pemesan";
        ResultSet rs = KeretaDB.executeQuery(SQL);
        try {
            while (rs.next()) {                
                String NoID = rs.getString(1);
                String NamaPemesan = rs.getString(2);
                String StasiunAwal = rs.getString(3);
                String StasiunAkhir = rs.getString(4);
                String TanggalBerangkat = rs.getString(5);
                String JenisKereta = rs.getString(6);
                String WaktuBerangkat = rs.getString(7);
                String TempatDuduk = rs.getString(9);
                String Harga = rs.getString(10);
                String data[] = {NoID,NamaPemesan,StasiunAwal,StasiunAkhir,TanggalBerangkat,JenisKereta, WaktuBerangkat,TempatDuduk,Harga};
                dtm.addRow(data);
            }
        } catch (SQLException ex) {
            Logger.getLogger(frmMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        tblData.setModel(dtm);
    }
}
