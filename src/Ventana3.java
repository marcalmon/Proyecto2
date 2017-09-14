

/**
 *
 * @author Ingles
 */
import javax.swing.JOptionPane;

public class Ventana3 extends javax.swing.JFrame {

    /**
     * Creates new form Ventana3
     */
    public Ventana3() {
        initComponents();
        
        this.setLocationRelativeTo(null);
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
        boton1 = new javax.swing.JButton();
        btnsaludo = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        textnombre = new javax.swing.JTextField();
        btnborrar = new javax.swing.JButton();
        labelnom = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Perpetua Titling MT", 3, 18)); // NOI18N
        jLabel1.setText("Aplicación");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 20, 130, -1));

        boton1.setBackground(new java.awt.Color(204, 0, 255));
        boton1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 10)); // NOI18N
        boton1.setText("INICIO");
        boton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton1MouseClicked(evt);
            }
        });
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });
        getContentPane().add(boton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(312, 275, -1, -1));

        btnsaludo.setText("Saludar!");
        btnsaludo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnsaludoMouseClicked(evt);
            }
        });
        getContentPane().add(btnsaludo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, -1, -1));

        jLabel3.setFont(new java.awt.Font("Source Sans Pro Semibold", 0, 14)); // NOI18N
        jLabel3.setText("Escriba su nombre");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, -1, -1));

        textnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textnombreActionPerformed(evt);
            }
        });
        getContentPane().add(textnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 150, -1));

        btnborrar.setText("Borrar");
        btnborrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnborrarMouseClicked(evt);
            }
        });
        getContentPane().add(btnborrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 70, -1));

        labelnom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/e0c43b770eeacaea5e9792ad7e5fdf72--wallpaper-colour-rosa-pastel1.png"))); // NOI18N
        labelnom.setText("jLabel2");
        getContentPane().add(labelnom, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, 0, 410, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton1MouseClicked
        // TODO add your handling code here:
        Ventana1 v1 = new Ventana1();
        v1.setVisible(true);
        dispose();
    }//GEN-LAST:event_boton1MouseClicked

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton1ActionPerformed

    private void btnsaludoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsaludoMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "¡Hola "+textnombre.getText()+"!");
    }//GEN-LAST:event_btnsaludoMouseClicked

    private void textnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textnombreActionPerformed

    private void btnborrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnborrarMouseClicked
        // TODO add your handling code here:
        textnombre.setText(null);        
    }//GEN-LAST:event_btnborrarMouseClicked

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
            java.util.logging.Logger.getLogger(Ventana3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton1;
    private javax.swing.JButton btnborrar;
    private javax.swing.JButton btnsaludo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel labelnom;
    private javax.swing.JTextField textnombre;
    // End of variables declaration//GEN-END:variables
}
