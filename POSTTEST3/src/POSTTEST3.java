/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hardi
 */
public class POSTTEST3 extends javax.swing.JFrame {

    /**
     * Creates new form POSTTEST3
     */
    public POSTTEST3() {
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

        jPanel1 = new javax.swing.JPanel();
        jpcopyright = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        LOGO = new javax.swing.JLabel();
        SISTEM = new javax.swing.JLabel();
        FAKULTAS = new javax.swing.JLabel();
        UNIVERSITAS = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jphome = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jpinformasi = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jpprofil = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        home = new javax.swing.JButton();
        profil = new javax.swing.JButton();
        informasi = new javax.swing.JButton();
        exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.BorderLayout(9, 0));

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));

        jpcopyright.setBackground(new java.awt.Color(0, 0, 102));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Copyright@2017");

        javax.swing.GroupLayout jpcopyrightLayout = new javax.swing.GroupLayout(jpcopyright);
        jpcopyright.setLayout(jpcopyrightLayout);
        jpcopyrightLayout.setHorizontalGroup(
            jpcopyrightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpcopyrightLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(309, 309, 309))
        );
        jpcopyrightLayout.setVerticalGroup(
            jpcopyrightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpcopyrightLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel6)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        LOGO.setIcon(new javax.swing.ImageIcon("D:\\NetBeansProjects\\Visual_C1_1515015103_POSTTEST\\POSTTEST3\\src\\UI.jpg")); // NOI18N

        SISTEM.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SISTEM.setText("SISTEM INFORMASI AKADEMIK");

        FAKULTAS.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        FAKULTAS.setText("FAKULTAS ILMU SOSIAL DAN POLITIK HUKUM");

        UNIVERSITAS.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        UNIVERSITAS.setText("UNIVERSITAS INDONESIA");

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));
        jPanel3.setLayout(new java.awt.CardLayout(50, 50));

        jphome.setBackground(new java.awt.Color(255, 255, 0));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon("D:\\NetBeansProjects\\Visual_C1_1515015103_POSTTEST\\POSTTEST3\\src\\Home.jpg")); // NOI18N

        javax.swing.GroupLayout jphomeLayout = new javax.swing.GroupLayout(jphome);
        jphome.setLayout(jphomeLayout);
        jphomeLayout.setHorizontalGroup(
            jphomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5)
        );
        jphomeLayout.setVerticalGroup(
            jphomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel3.add(jphome, "card2");

        jpinformasi.setBackground(new java.awt.Color(153, 0, 153));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Innovation at the Roots");

        javax.swing.GroupLayout jpinformasiLayout = new javax.swing.GroupLayout(jpinformasi);
        jpinformasi.setLayout(jpinformasiLayout);
        jpinformasiLayout.setHorizontalGroup(
            jpinformasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpinformasiLayout.createSequentialGroup()
                .addGroup(jpinformasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpinformasiLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel15))
                    .addGroup(jpinformasiLayout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(jLabel8)))
                .addGap(0, 205, Short.MAX_VALUE))
        );
        jpinformasiLayout.setVerticalGroup(
            jpinformasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpinformasiLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 192, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(104, 104, 104))
        );

        jPanel3.add(jpinformasi, "card4");

        jpprofil.setBackground(new java.awt.Color(255, 51, 51));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("MAAF. PROFILnya BELUM DI UPDATE");

        javax.swing.GroupLayout jpprofilLayout = new javax.swing.GroupLayout(jpprofil);
        jpprofil.setLayout(jpprofilLayout);
        jpprofilLayout.setHorizontalGroup(
            jpprofilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpprofilLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(106, 106, 106))
        );
        jpprofilLayout.setVerticalGroup(
            jpprofilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpprofilLayout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jLabel7)
                .addContainerGap(204, Short.MAX_VALUE))
        );

        jPanel3.add(jpprofil, "card3");

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setLayout(new java.awt.GridLayout(1, 0, 8, 4));

        home.setText("Home");
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });
        jPanel2.add(home);

        profil.setText("Profil");
        profil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profilActionPerformed(evt);
            }
        });
        jPanel2.add(profil);

        informasi.setText("Informasi");
        informasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                informasiActionPerformed(evt);
            }
        });
        jPanel2.add(informasi);

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel2.add(exit);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LOGO)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SISTEM)
                    .addComponent(FAKULTAS)
                    .addComponent(UNIVERSITAS))
                .addContainerGap(106, Short.MAX_VALUE))
            .addComponent(jpcopyright, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(SISTEM)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FAKULTAS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(UNIVERSITAS))
                    .addComponent(LOGO))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpcopyright, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        // TODO add your handling code here:
        jpinformasi.setVisible(false);
        jphome.setVisible(true);
        jpprofil.setVisible(false);
        
    }//GEN-LAST:event_homeActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void profilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profilActionPerformed
        // TODO add your handling code here:
        jpprofil.setVisible(true);
        jpinformasi.setVisible(false);
        jphome.setVisible(false);
    }//GEN-LAST:event_profilActionPerformed

    private void informasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_informasiActionPerformed
        // TODO add your handling code here:
        jphome.setVisible(false);
        jpinformasi.setVisible(true);
        jpprofil.setVisible(false);
    }//GEN-LAST:event_informasiActionPerformed

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
            java.util.logging.Logger.getLogger(POSTTEST3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(POSTTEST3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(POSTTEST3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(POSTTEST3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new POSTTEST3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FAKULTAS;
    private javax.swing.JLabel LOGO;
    private javax.swing.JLabel SISTEM;
    private javax.swing.JLabel UNIVERSITAS;
    private javax.swing.JButton exit;
    private javax.swing.JButton home;
    private javax.swing.JButton informasi;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jpcopyright;
    private javax.swing.JPanel jphome;
    private javax.swing.JPanel jpinformasi;
    private javax.swing.JPanel jpprofil;
    private javax.swing.JButton profil;
    // End of variables declaration//GEN-END:variables
}
