package tpv;

public class Pantalla_Seleccion_Producto extends javax.swing.JFrame {

    private gestionPantallas gp;
    private Usuario us = new Usuario();
    Empleado empleadoLogeado = new Empleado();
    
    public Pantalla_Seleccion_Producto() {
        initComponents();
        this.setLocationRelativeTo(null);
        panelCategorias.setVisible(false);
        gp = new gestionPantallas();
    }
    
    public Pantalla_Seleccion_Producto(Empleado emp) {
        initComponents();
        this.setLocationRelativeTo(null);
        panelCategorias.setVisible(false);
        gp = new gestionPantallas();
        this.empleadoLogeado=emp; 
        System.out.println(empleadoLogeado.getCorreo());
    }

 
    @SuppressWarnings("unchecked")
    private void initComponents() {//GEN-BEGIN:initComponents

        jScrollPane1 = new javax.swing.JScrollPane();
        panelProductos_SelecProd = new javax.swing.JPanel();
        panelCategorias = new javax.swing.JPanel();
        btnCategoriaS_SelecProd = new javax.swing.JButton();
        btnCategoriaH_SelecProd = new javax.swing.JButton();
        btnCategoriaM_SelecProd = new javax.swing.JButton();
        btnCategoriaU_SelecProd = new javax.swing.JButton();
        btnCategoriaP_SelecProd = new javax.swing.JButton();
        btnCategoriaA_SelecProd = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        panelMenuSelecProd = new javax.swing.JPanel();
        btnAdmin_SelecProd = new javax.swing.JButton();
        btnSalir_SelecProd = new javax.swing.JButton();
        btnCarrito_SelecProd = new javax.swing.JButton();
        btnCategoria_SelecProd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1024, 769));
        setSize(new java.awt.Dimension(1024, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelProductos_SelecProd.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelCategorias.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 0)));
        panelCategorias.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCategoriaS_SelecProd.setText("STOCK");
        btnCategoriaS_SelecProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoriaS_SelecProdActionPerformed(evt);
            }
        });
        panelCategorias.add(btnCategoriaS_SelecProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, 110, 110));

        btnCategoriaH_SelecProd.setText("HOMBRE");
        btnCategoriaH_SelecProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoriaH_SelecProdActionPerformed(evt);
            }
        });
        panelCategorias.add(btnCategoriaH_SelecProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 110, 110));

        btnCategoriaM_SelecProd.setText("MUJER");
        btnCategoriaM_SelecProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoriaM_SelecProdActionPerformed(evt);
            }
        });
        panelCategorias.add(btnCategoriaM_SelecProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 110, 110));

        btnCategoriaU_SelecProd.setText("UNISEX");
        btnCategoriaU_SelecProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoriaU_SelecProdActionPerformed(evt);
            }
        });
        panelCategorias.add(btnCategoriaU_SelecProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, 110, 110));

        btnCategoriaP_SelecProd.setText("PRECIO");
        btnCategoriaP_SelecProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoriaP_SelecProdActionPerformed(evt);
            }
        });
        panelCategorias.add(btnCategoriaP_SelecProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 110, 110));

        btnCategoriaA_SelecProd.setText("ALFABETICAMENTE");
        btnCategoriaA_SelecProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoriaA_SelecProdActionPerformed(evt);
            }
        });
        panelCategorias.add(btnCategoriaA_SelecProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, 110, 110));

        panelProductos_SelecProd.add(panelCategorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 690, 380));

        jButton1.setText("jButton1");
        panelProductos_SelecProd.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 160, 90, 80));

        jScrollPane1.setViewportView(panelProductos_SelecProd);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 1030, 640));

        panelMenuSelecProd.setBackground(new java.awt.Color(102, 102, 102));
        panelMenuSelecProd.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(102, 102, 102)));
        panelMenuSelecProd.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAdmin_SelecProd.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAdmin_SelecProd.setText("<html><body>MODO <br>ADMIN</body></html>");
        btnAdmin_SelecProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdmin_SelecProdActionPerformed(evt);
            }
        });
        panelMenuSelecProd.add(btnAdmin_SelecProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 120, 110));

        btnSalir_SelecProd.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnSalir_SelecProd.setText("SALIR");
        btnSalir_SelecProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalir_SelecProdActionPerformed(evt);
            }
        });
        panelMenuSelecProd.add(btnSalir_SelecProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 10, 120, 110));

        btnCarrito_SelecProd.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnCarrito_SelecProd.setText("CARRITO");
        btnCarrito_SelecProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarrito_SelecProdActionPerformed(evt);
            }
        });
        panelMenuSelecProd.add(btnCarrito_SelecProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 120, 110));

        btnCategoria_SelecProd.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnCategoria_SelecProd.setText("CATEGORIA");
        btnCategoria_SelecProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoria_SelecProdActionPerformed(evt);
            }
        });
        panelMenuSelecProd.add(btnCategoria_SelecProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 120, 110));

        getContentPane().add(panelMenuSelecProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 130));

        pack();
    }//GEN-END:initComponents

    
    private void btnCategoria_SelecProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoria_SelecProdActionPerformed
        // TODO add your handling code here:
        panelCategorias.setVisible(true);
    }//GEN-LAST:event_btnCategoria_SelecProdActionPerformed

    private void btnCarrito_SelecProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarrito_SelecProdActionPerformed
        // TODO add your handling code here
        gp.creaCarrito(empleadoLogeado);
        dispose();
    }//GEN-LAST:event_btnCarrito_SelecProdActionPerformed

    private void btnCategoriaS_SelecProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoriaS_SelecProdActionPerformed
        // TODO add your handling code here:
        panelCategorias.setVisible(false);
    }//GEN-LAST:event_btnCategoriaS_SelecProdActionPerformed

    private void btnCategoriaM_SelecProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoriaM_SelecProdActionPerformed
        // TODO add your handling code here:
        panelCategorias.setVisible(false);
    }//GEN-LAST:event_btnCategoriaM_SelecProdActionPerformed

    private void btnCategoriaU_SelecProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoriaU_SelecProdActionPerformed
        // TODO add your handling code here:
        panelCategorias.setVisible(false);
    }//GEN-LAST:event_btnCategoriaU_SelecProdActionPerformed

    private void btnCategoriaP_SelecProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoriaP_SelecProdActionPerformed
        // TODO add your handling code here:
        panelCategorias.setVisible(false);
    }//GEN-LAST:event_btnCategoriaP_SelecProdActionPerformed

    private void btnCategoriaA_SelecProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoriaA_SelecProdActionPerformed
        // TODO add your handling code here:
        panelCategorias.setVisible(false);
    }//GEN-LAST:event_btnCategoriaA_SelecProdActionPerformed

    private void btnCategoriaH_SelecProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoriaH_SelecProdActionPerformed
        // TODO add your handling code here:
        panelCategorias.setVisible(false);
    }//GEN-LAST:event_btnCategoriaH_SelecProdActionPerformed

    private void btnSalir_SelecProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir_SelecProdActionPerformed
        // TODO add your handling code here:
        gp.creaLogin();
        dispose();
    }//GEN-LAST:event_btnSalir_SelecProdActionPerformed

    private void btnAdmin_SelecProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdmin_SelecProdActionPerformed
        // TODO add your handling code here:
        if (us.comprobarAdmin(empleadoLogeado)) {
            gp.creaAdministrador(empleadoLogeado);
            dispose();
        } else {
            System.out.println("Debes de ser admin");
        }
    }//GEN-LAST:event_btnAdmin_SelecProdActionPerformed


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
            java.util.logging.Logger.getLogger(Pantalla_Seleccion_Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Seleccion_Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Seleccion_Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Seleccion_Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new Pantalla_Seleccion_Producto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdmin_SelecProd;
    private javax.swing.JButton btnCarrito_SelecProd;
    private javax.swing.JButton btnCategoriaA_SelecProd;
    private javax.swing.JButton btnCategoriaH_SelecProd;
    private javax.swing.JButton btnCategoriaM_SelecProd;
    private javax.swing.JButton btnCategoriaP_SelecProd;
    private javax.swing.JButton btnCategoriaS_SelecProd;
    private javax.swing.JButton btnCategoriaU_SelecProd;
    private javax.swing.JButton btnCategoria_SelecProd;
    private javax.swing.JButton btnSalir_SelecProd;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelCategorias;
    private javax.swing.JPanel panelMenuSelecProd;
    private javax.swing.JPanel panelProductos_SelecProd;
    // End of variables declaration//GEN-END:variables
}
