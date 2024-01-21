package com.rest.gui.uas;

import config.conn;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author rsstst
 */
public class akun extends javax.swing.JFrame {
    
    private DefaultTableModel model_item;
    private String query;
    Connection connect = conn.getConnection();
    
    /**
     * Creates new form main
     */
    public akun() {
        initComponents();
        tampilData();
        String date = LocalDate.now().toString();
        akunDate.setText(date);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panelAkun = new javax.swing.JPanel();
        akunBrand = new javax.swing.JLabel();
        akunSubhead = new javax.swing.JLabel();
        akunDate = new javax.swing.JLabel();
        cartAkun = new javax.swing.JPanel();
        tabelPanel2 = new javax.swing.JPanel();
        tambahAkunBtn = new javax.swing.JButton();
        checkoutAkunBtn = new javax.swing.JButton();
        kembaliAkunBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        akunTable = new javax.swing.JTable();
        refreshAkunBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        akunBrand.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        akunBrand.setText("iSeller");

        akunSubhead.setText("Selamat datang! Selamat berbelanja~");

        akunDate.setText("Tanggal");

        javax.swing.GroupLayout panelAkunLayout = new javax.swing.GroupLayout(panelAkun);
        panelAkun.setLayout(panelAkunLayout);
        panelAkunLayout.setHorizontalGroup(
            panelAkunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAkunLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAkunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(akunSubhead, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                    .addComponent(akunBrand, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(akunDate, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelAkunLayout.setVerticalGroup(
            panelAkunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAkunLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(akunBrand)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelAkunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(akunSubhead, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addComponent(akunDate))
                .addContainerGap())
        );

        cartAkun.setBackground(new java.awt.Color(255, 102, 102));
        cartAkun.setToolTipText("");

        javax.swing.GroupLayout cartAkunLayout = new javax.swing.GroupLayout(cartAkun);
        cartAkun.setLayout(cartAkunLayout);
        cartAkunLayout.setHorizontalGroup(
            cartAkunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        cartAkunLayout.setVerticalGroup(
            cartAkunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
        );

        tabelPanel2.setLayout(new java.awt.GridBagLayout());

        tambahAkunBtn.setText("Tambah Item");
        tambahAkunBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahAkunBtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 0.1;
        tabelPanel2.add(tambahAkunBtn, gridBagConstraints);

        checkoutAkunBtn.setText("Checkout");
        checkoutAkunBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkoutAkunBtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 0.1;
        tabelPanel2.add(checkoutAkunBtn, gridBagConstraints);

        kembaliAkunBtn.setText("Kembali");
        kembaliAkunBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliAkunBtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 0.1;
        tabelPanel2.add(kembaliAkunBtn, gridBagConstraints);

        akunTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Game", "Nama Akun", "Stok", "Harga"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(akunTable);
        if (akunTable.getColumnModel().getColumnCount() > 0) {
            akunTable.getColumnModel().getColumn(0).setResizable(false);
            akunTable.getColumnModel().getColumn(1).setResizable(false);
            akunTable.getColumnModel().getColumn(2).setResizable(false);
            akunTable.getColumnModel().getColumn(3).setResizable(false);
            akunTable.getColumnModel().getColumn(4).setResizable(false);
        }

        refreshAkunBtn.setIcon(new javax.swing.ImageIcon("D:\\ref.png")); // NOI18N
        refreshAkunBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshAkunBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelAkun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cartAkun, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(refreshAkunBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(tabelPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelAkun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cartAkun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(refreshAkunBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabelPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void tampilData(){
        model_item = new DefaultTableModel();
        model_item.addColumn("ID");
        model_item.addColumn("Game");
        model_item.addColumn("Nama Akun");
        model_item.addColumn("Stok");
        model_item.addColumn("Harga");
        akunTable.setModel(model_item);

        try {
            DecimalFormat Decformat = new DecimalFormat("#.##");
            Decformat.setGroupingUsed(true);
            Decformat.setGroupingSize(3);
            java.sql.Statement stmt = connect.createStatement();
            query = "SELECT * FROM stok_akun";
            java.sql.ResultSet rs = stmt.executeQuery(query);
            while (rs.next()){
                int harga = rs.getInt("harga_akun");
                model_item.addRow(new Object[]{
                    rs.getString("id_akun"),
                    rs.getString("game_akun"),
                    rs.getString("nama_akun"),
                    rs.getString("jumlah_akun"),
                    Decformat.format(harga)
                });
            }  
    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }}
    
    private void refreshAkunBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshAkunBtnActionPerformed
        tampilData();
    }//GEN-LAST:event_refreshAkunBtnActionPerformed

    private void kembaliAkunBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliAkunBtnActionPerformed
        mainframe main = new mainframe();
        main.setVisible(true);
        main.pack();
        main.setLocationRelativeTo(null);
        main.setDefaultCloseOperation(login.EXIT_ON_CLOSE);
        dispose();
    }//GEN-LAST:event_kembaliAkunBtnActionPerformed

    private void checkoutAkunBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkoutAkunBtnActionPerformed
        checkout chk = new checkout();
        chk.setVisible(true);
        chk.pack();
        chk.setLocationRelativeTo(null);
        chk.setDefaultCloseOperation(EXIT_ON_CLOSE);
        dispose();
    }//GEN-LAST:event_checkoutAkunBtnActionPerformed

    private void tambahAkunBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahAkunBtnActionPerformed

        try {
            int rIndex = akunTable.getSelectedRow();
            int cIndex = 0;
            Object obj = akunTable.getValueAt(rIndex, cIndex);
            System.out.println(obj);
            
            java.sql.Statement stmt = connect.createStatement();
            query = "INSERT INTO checkout (idCO, namaCO, jumlahCO, hargaCO)\nSELECT id_akun, nama_akun, jumlah_akun, harga_akun FROM stok_akun WHERE id_akun = " + obj;
            stmt.execute(query);
            JOptionPane.showMessageDialog(this, "Akun telah ditambahkan");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_tambahAkunBtnActionPerformed

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
            java.util.logging.Logger.getLogger(akun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(akun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(akun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(akun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new akun().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel akunBrand;
    private javax.swing.JLabel akunDate;
    public javax.swing.JLabel akunSubhead;
    private javax.swing.JTable akunTable;
    private javax.swing.JPanel cartAkun;
    private javax.swing.JButton checkoutAkunBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton kembaliAkunBtn;
    private javax.swing.JPanel panelAkun;
    private javax.swing.JButton refreshAkunBtn;
    private javax.swing.JPanel tabelPanel2;
    private javax.swing.JButton tambahAkunBtn;
    // End of variables declaration//GEN-END:variables
}