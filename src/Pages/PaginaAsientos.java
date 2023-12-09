package Pages;
public class PaginaAsientos extends javax.swing.JFrame {

    
    public static int flotante = 10;
    private int contador = 0;
    private double precioBase = 10.0;
    public PaginaAsientos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        backgrounds = new javax.swing.JLabel();
        pelicula1Panel = new javax.swing.JPanel();
        pelicula2Panel = new javax.swing.JPanel();
        pelicula3Panel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backgrounds.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SELECCIONE SU PELICULA.png"))); // NOI18N
        background.add(backgrounds, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 480));

        pelicula1Panel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pelicula1Panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pelicula1PanelMouseClicked(evt);
            }
        });
        pelicula1Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        background.add(pelicula1Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 220, 310));

        pelicula2Panel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pelicula2Panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pelicula2PanelMouseClicked(evt);
            }
        });
        pelicula2Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        background.add(pelicula2Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 250, 310));

        pelicula3Panel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pelicula3Panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pelicula3PanelMouseClicked(evt);
            }
        });
        pelicula3Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        background.add(pelicula3Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 160, 210, 310));

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

    private void pelicula1PanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pelicula1PanelMouseClicked
        new BUTACAS1().setVisible(true);
    }//GEN-LAST:event_pelicula1PanelMouseClicked

    private void pelicula2PanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pelicula2PanelMouseClicked
        // TODO add your handling code here:
        new BUTACAS1().setVisible(true);
    }//GEN-LAST:event_pelicula2PanelMouseClicked

    private void pelicula3PanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pelicula3PanelMouseClicked
        // TODO add your handling code here:
       new BUTACAS1().setVisible(true);
    }//GEN-LAST:event_pelicula3PanelMouseClicked

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
            java.util.logging.Logger.getLogger(PaginaAsientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaginaAsientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaginaAsientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaginaAsientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new PaginaAsientos().setVisible(true);
        });
    }
    
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JLabel backgrounds;
    private javax.swing.JPanel pelicula1Panel;
    private javax.swing.JPanel pelicula2Panel;
    private javax.swing.JPanel pelicula3Panel;
    // End of variables declaration//GEN-END:variables
}
