/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12;

/**
 *
 * @author pared
 */
public class Frame12 extends javax.swing.JFrame {

    /**
     * Creates new form Frame12
     */
    public Frame12() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtPeliculasALQ = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        cmbNumDias = new javax.swing.JComboBox<>();
        txtTotalPag = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("TIENDA DVD.");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText(" Cantidad de Peliculas para Alquilar:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Numero de Dias para Alquilar: ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        txtPeliculasALQ.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPeliculasALQKeyTyped(evt);
            }
        });
        jPanel1.add(txtPeliculasALQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 140, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Monto a Pagar:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jButton1.setText("Ejecutar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, -1, -1));

        jButton2.setText("Borrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, -1, -1));

        cmbNumDias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7" }));
        jPanel1.add(cmbNumDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, -1, -1));

        txtTotalPag.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTotalPagKeyTyped(evt);
            }
        });
        jPanel1.add(txtTotalPag, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 120, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("*Gratis una pelicula");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        long cantpeli, numdias, montpgag, pelgratis=1500, resultado = 0, precpelis=1500, op2, op3, op = 0;
        int operacion;
        String res;
        
        cantpeli= Long.parseLong(txtPeliculasALQ.getText());
        operacion = cmbNumDias.getSelectedIndex();
        
        switch (operacion)
        {
            case 0:
                op= cantpeli-1;
                resultado= 1*precpelis*op;
                break;
            case 1:
                op= cantpeli-1;
                resultado= 2*precpelis*op;
                break;
            case 2:
                op= cantpeli-1;
                resultado = 3*precpelis*op;
                break;
            case 3:
                op= cantpeli-1;
                resultado= 4*precpelis*op;
                break;
            case 4:
                op= cantpeli-1;
                resultado= 5*precpelis*op;
                break;
            case 5:
                op= cantpeli-1;
                resultado = 6*precpelis*op;
                break;
            case 6:
                op= cantpeli-1;
                resultado = 7*precpelis*op;
                break;
        }
           res= String.valueOf(resultado);
           txtTotalPag.setText(res);
           
           
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtPeliculasALQKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPeliculasALQKeyTyped
        // TODO add your handling code here:
          char c=evt.getKeyChar(); 
          if(!Character.isDigit(c)) 
          { 
              getToolkit().beep(); 
              evt.consume();      
          }
         
         
    }//GEN-LAST:event_txtPeliculasALQKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        txtPeliculasALQ.setText("");
        txtTotalPag.setText("");
        txtPeliculasALQ.requestFocusInWindow();
        cmbNumDias.setSelectedIndex(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtTotalPagKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTotalPagKeyTyped
        // TODO add your handling code here:
          char c=evt.getKeyChar(); 
          if(!Character.isDigit(c)) 
          { 
              getToolkit().beep(); 
              evt.consume();      
          }
         
          if(!Character.isLetter(c)) 
          { 
              getToolkit().beep(); 
              evt.consume(); 
          }
    }//GEN-LAST:event_txtTotalPagKeyTyped

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
            java.util.logging.Logger.getLogger(Frame12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame12().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbNumDias;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtPeliculasALQ;
    private javax.swing.JTextField txtTotalPag;
    // End of variables declaration//GEN-END:variables
}
