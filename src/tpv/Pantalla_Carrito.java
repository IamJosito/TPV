package tpv;

public class Pantalla_Carrito extends javax.swing.JFrame {

    private gestionPantallas gp;
    Empleado empleadoLogeado;
    
    public Pantalla_Carrito() {
        initComponents();
        this.setLocationRelativeTo(null);
        gp = new gestionPantallas();
    }
    
    public Pantalla_Carrito(Empleado emp) {
        initComponents();
        this.setLocationRelativeTo(null);
        gp = new gestionPantallas();
        this.empleadoLogeado = emp;
    }


    @SuppressWarnings("unchecked")
    private void initComponents() {//GEN-BEGIN:initComponents

        jScrollPane1 = new javax.swing.JScrollPane();
        panelProductos_Carrito = new javax.swing.JPanel();
        panelMenuSelecProd = new javax.swing.JPanel();
        btnPagarEfectivo_Carrito = new javax.swing.JButton();
        btnVolver_Carrito = new javax.swing.JButton();
        btnPagarTarjeta_Carrito = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblPrecio_Carrito = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1024, 769));
        setSize(new java.awt.Dimension(1024, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelProductos_Carrito.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jScrollPane1.setViewportView(panelProductos_Carrito);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 1030, 540));

        panelMenuSelecProd.setBackground(new java.awt.Color(102, 102, 102));
        panelMenuSelecProd.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(102, 102, 102)));
        panelMenuSelecProd.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPagarEfectivo_Carrito.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnPagarEfectivo_Carrito.setText("EFECTIVO");
        panelMenuSelecProd.add(btnPagarEfectivo_Carrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 10, 120, 110));

        btnVolver_Carrito.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnVolver_Carrito.setText("ATRAS");
        btnVolver_Carrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolver_CarritoActionPerformed(evt);
            }
        });
        panelMenuSelecProd.add(btnVolver_Carrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 120, 110));

        btnPagarTarjeta_Carrito.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnPagarTarjeta_Carrito.setText("TARJETA");
        btnPagarTarjeta_Carrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarTarjeta_CarritoActionPerformed(evt);
            }
        });
        panelMenuSelecProd.add(btnPagarTarjeta_Carrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, 120, 110));

        getContentPane().add(panelMenuSelecProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 130));

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("PRECIO:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 16, 80, 70));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("<html><body>TOTAL DE <br>ARTICULOS:</body></html>");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 20, 90, 70));

        lblPrecio_Carrito.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblPrecio_Carrito.setText("99999 €");
        jPanel1.add(lblPrecio_Carrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 80, 70));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("99999");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 20, 100, 70));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 670, 1030, 100));

        pack();
    }//GEN-END:initComponents

    private void btnPagarTarjeta_CarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarTarjeta_CarritoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPagarTarjeta_CarritoActionPerformed

    private void btnVolver_CarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolver_CarritoActionPerformed
        // TODO add your handling code here:
        gp.creaSeleccionProducto(empleadoLogeado);
        dispose();
    }//GEN-LAST:event_btnVolver_CarritoActionPerformed


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
            java.util.logging.Logger.getLogger(Pantalla_Carrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Carrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Carrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Carrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla_Carrito().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPagarEfectivo_Carrito;
    private javax.swing.JButton btnPagarTarjeta_Carrito;
    private javax.swing.JButton btnVolver_Carrito;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPrecio_Carrito;
    private javax.swing.JPanel panelMenuSelecProd;
    private javax.swing.JPanel panelProductos_Carrito;
    // End of variables declaration//GEN-END:variables
}
