package com.belajar.hibernate.view;

import com.belajar.hibernate.controller.BarangController;

/**
 *
 * @author Rizki Mufrizal
 */
public class BarangView extends javax.swing.JFrame {

    private final BarangController barangController = new BarangController(this);

    /**
     * Creates new form Barang
     */
    public BarangView() {
        initComponents();
        barangController.tampilData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        namaBarang = new javax.swing.JTextField();
        jenisBarang = new javax.swing.JTextField();
        tanggalKadaluarsa = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        simpan = new javax.swing.JButton();
        update = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        idBarang = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Daftar Barang");

        jLabel2.setText("Nama Barang");

        jLabel3.setText("Jenis Barang");

        jLabel4.setText("Tanggal Kadaluarsa");

        namaBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaBarangActionPerformed(evt);
            }
        });

        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel);

        simpan.setText("Simpan");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });

        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        hapus.setText("Hapus");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        jLabel5.setText("ID Barang");

        idBarang.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(204, 204, 204))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(67, 67, 67)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(simpan)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(update)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(hapus))
                                    .addComponent(namaBarang)
                                    .addComponent(jenisBarang)
                                    .addComponent(tanggalKadaluarsa, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                    .addComponent(idBarang))))
                        .addGap(29, 29, 29))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(idBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(namaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jenisBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tanggalKadaluarsa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(simpan)
                    .addComponent(update)
                    .addComponent(hapus))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void namaBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaBarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaBarangActionPerformed

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        barangController.saveBarang();
    }//GEN-LAST:event_simpanActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        barangController.updateBarang();
    }//GEN-LAST:event_updateActionPerformed

    private void tabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMouseClicked
        barangController.show();
    }//GEN-LAST:event_tabelMouseClicked

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        barangController.deleteBarang();
    }//GEN-LAST:event_hapusActionPerformed

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
            java.util.logging.Logger.getLogger(BarangView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BarangView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BarangView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BarangView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BarangView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton hapus;
    private javax.swing.JTextField idBarang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jenisBarang;
    private javax.swing.JTextField namaBarang;
    private javax.swing.JButton simpan;
    private javax.swing.JTable tabel;
    private javax.swing.JTextField tanggalKadaluarsa;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the hapus
     */
    public javax.swing.JButton getHapus() {
        return hapus;
    }

    /**
     * @param hapus the hapus to set
     */
    public void setHapus(javax.swing.JButton hapus) {
        this.hapus = hapus;
    }

    /**
     * @return the idBarang
     */
    public javax.swing.JTextField getIdBarang() {
        return idBarang;
    }

    /**
     * @param idBarang the idBarang to set
     */
    public void setIdBarang(javax.swing.JTextField idBarang) {
        this.idBarang = idBarang;
    }

    /**
     * @return the jenisBarang
     */
    public javax.swing.JTextField getJenisBarang() {
        return jenisBarang;
    }

    /**
     * @param jenisBarang the jenisBarang to set
     */
    public void setJenisBarang(javax.swing.JTextField jenisBarang) {
        this.jenisBarang = jenisBarang;
    }

    /**
     * @return the namaBarang
     */
    public javax.swing.JTextField getNamaBarang() {
        return namaBarang;
    }

    /**
     * @param namaBarang the namaBarang to set
     */
    public void setNamaBarang(javax.swing.JTextField namaBarang) {
        this.namaBarang = namaBarang;
    }

    /**
     * @return the simpan
     */
    public javax.swing.JButton getSimpan() {
        return simpan;
    }

    /**
     * @param simpan the simpan to set
     */
    public void setSimpan(javax.swing.JButton simpan) {
        this.simpan = simpan;
    }

    /**
     * @return the tabel
     */
    public javax.swing.JTable getTabel() {
        return tabel;
    }

    /**
     * @param tabel the tabel to set
     */
    public void setTabel(javax.swing.JTable tabel) {
        this.tabel = tabel;
    }

    /**
     * @return the tanggalKadaluarsa
     */
    public javax.swing.JTextField getTanggalKadaluarsa() {
        return tanggalKadaluarsa;
    }

    /**
     * @param tanggalKadaluarsa the tanggalKadaluarsa to set
     */
    public void setTanggalKadaluarsa(javax.swing.JTextField tanggalKadaluarsa) {
        this.tanggalKadaluarsa = tanggalKadaluarsa;
    }

    /**
     * @return the update
     */
    public javax.swing.JButton getUpdate() {
        return update;
    }

    /**
     * @param update the update to set
     */
    public void setUpdate(javax.swing.JButton update) {
        this.update = update;
    }

}