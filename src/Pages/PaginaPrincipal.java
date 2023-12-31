/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Pages;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author mwora
 */
public class PaginaPrincipal extends javax.swing.JFrame {

    
    
    double precioDulceria;
    /**
     * Creates new form PaginaPrincipal
     */
    public PaginaPrincipal() {
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

        background = new javax.swing.JPanel();
        headerPanel = new javax.swing.JPanel();
        imageHeader = new javax.swing.JLabel();
        panelIzquierda = new javax.swing.JPanel();
        imagenIzquierda = new javax.swing.JLabel();
        btnDulcería = new littletsu.PanelExt();
        txtDulcería = new javax.swing.JLabel();
        btnAsientos = new littletsu.PanelExt();
        txtAsientos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        headerPanel.setBackground(new java.awt.Color(51, 102, 255));
        headerPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imageHeader.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CINÉPOLIS.png"))); // NOI18N
        headerPanel.add(imageHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        background.add(headerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 100));

        panelIzquierda.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imagenIzquierda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/NUEVOS ESTRENOS.png"))); // NOI18N
        panelIzquierda.add(imagenIzquierda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        background.add(panelIzquierda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 190, 370));

        btnDulcería.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/DULCERÍA (3).png"))); // NOI18N
        btnDulcería.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDulceríaMouseClicked(evt);
            }
        });

        txtDulcería.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtDulcería.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDulceríaMouseClicked(evt);
            }
        });

        btnDulcería.setLayer(txtDulcería, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout btnDulceríaLayout = new javax.swing.GroupLayout(btnDulcería);
        btnDulcería.setLayout(btnDulceríaLayout);
        btnDulceríaLayout.setHorizontalGroup(
            btnDulceríaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtDulcería, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
        );
        btnDulceríaLayout.setVerticalGroup(
            btnDulceríaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtDulcería, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
        );

        background.add(btnDulcería, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 290, 280));

        btnAsientos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/DULCERÍA (4).png"))); // NOI18N

        txtAsientos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAsientosMouseClicked(evt);
            }
        });

        btnAsientos.setLayer(txtAsientos, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout btnAsientosLayout = new javax.swing.GroupLayout(btnAsientos);
        btnAsientos.setLayout(btnAsientosLayout);
        btnAsientosLayout.setHorizontalGroup(
            btnAsientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtAsientos, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
        );
        btnAsientosLayout.setVerticalGroup(
            btnAsientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtAsientos, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
        );

        background.add(btnAsientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDulceríaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDulceríaMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnDulceríaMouseClicked

    private void txtDulceríaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDulceríaMouseClicked
        // TODO add your handling code here:
        new PaginaDulceria().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_txtDulceríaMouseClicked

    private void txtAsientosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAsientosMouseClicked
        new PaginaAsientos().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_txtAsientosMouseClicked

        
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
            java.util.logging.Logger.getLogger(PaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaginaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private littletsu.PanelExt btnAsientos;
    private littletsu.PanelExt btnDulcería;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel imageHeader;
    private javax.swing.JLabel imagenIzquierda;
    private javax.swing.JPanel panelIzquierda;
    private javax.swing.JLabel txtAsientos;
    private javax.swing.JLabel txtDulcería;
    // End of variables declaration//GEN-END:variables
}
