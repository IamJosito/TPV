package tpv;

import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;


public class Pantalla_Seleccion_Producto extends javax.swing.JFrame {

    private gestionPantallas gp;

    private Usuario us = new Usuario();
    Empleado empleadoLogeado = new Empleado();
    Almacen almc = new Almacen();
    HashMap<Integer, Integer> productosCarrito = new HashMap();
    
    public Pantalla_Seleccion_Producto() {
        initComponents();
        this.setLocationRelativeTo(null);
        panelCategorias.setVisible(false);
        gp = new gestionPantallas();
        this.cargarProductos();
    }
    
    public void cargarProductos(){
        
        //Eliminamos todos los componentes de nuestro panel de productos, por si acaso tenemos alguno
        panelProductos_SelecProd.removeAll();
        
        Almacen almacen = new Almacen();
        ArrayList <Producto> productos = almacen.mostrarProducto();
        int posX = 10;
        int posY = 10;
        
        
        for (int i = 0; i < productos.size(); i++) {
            
            //Para dar un salto a la siguiente linea al mostrar nuestros productos.
            if(posX >= 870){
                posY += 170;
                posX = 10;
            }
            
            //Obtenemos las imagenes de nuestros productos
            ImageIcon imgen = productos.get(i).getImagen();

            //Para reescalar la imagen al tamaño del label
            Image img = imgen.getImage();
            Image myImg = img.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
            ImageIcon newImage = new ImageIcon(myImg);
            //----------------------------------------------------
            
            //Por cada producto vamos a crear un Label para añadirlo al panel.
            JLabel imgProducto = new JLabel(newImage, SwingConstants.RIGHT);
            imgProducto.setVerticalAlignment(SwingConstants.TOP);
            imgProducto.setText("HOLA");
            imgProducto.setLayout(null);
            //Le seteamos de nombre el codigo de producto para que sea unico y no de fallos.
            imgProducto.setName(String.valueOf(productos.get(i).getCodigoProducto()));
            
            JLabel datosProducto = new JLabel("<HTML><b>Nombre:</b> "+ String.valueOf(productos.get(i).getNombre()) +" <br> <b>Cantidad:</b> "+ productosCarrito.get(Integer.parseInt(imgProducto.getName())) + " </HTML>");
            
            //Mouse listener para cuando cliquemos.
            imgProducto.addMouseListener(new MouseAdapter() {
                JLabel cantidad = new JLabel("0");
                int cantidadProductos;
                public void mouseClicked(MouseEvent e){
                    if (!productosCarrito.containsKey(Integer.parseInt(imgProducto.getName()))) {
                        productosCarrito.put(Integer.parseInt(imgProducto.getName()), 1);
                    }else{
                        cantidadProductos = productosCarrito.get(Integer.parseInt(imgProducto.getName()));
                        productosCarrito.put(Integer.parseInt(imgProducto.getName()), cantidadProductos+1);
                    } 
                    cargarProductos();
                }
                
            });
            
            
            
            //agregamos la label a nuestro panel.
            panelProductos_SelecProd.add(imgProducto,new org.netbeans.lib.awtextra.AbsoluteConstraints(posX, posY, 150, 150));
            panelProductos_SelecProd.add(datosProducto,new org.netbeans.lib.awtextra.AbsoluteConstraints(posX, posY+150, 150, 30));
            posX += 170;
            //870 limite en X
            
        }
        //revalidamos y repintamos el panel.
        panelProductos_SelecProd.revalidate();
        panelProductos_SelecProd.repaint();
        
    }
    
    public Pantalla_Seleccion_Producto(Empleado emp) {
        initComponents();
        this.setLocationRelativeTo(null);
        panelCategorias.setVisible(false);
        gp = new gestionPantallas();
        this.empleadoLogeado=emp; 
        System.out.println(empleadoLogeado.getCorreo());
        this.cargarProductos();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCategorias = new javax.swing.JPanel();
        btnCategoriaS_SelecProd = new javax.swing.JButton();
        btnCategoriaH_SelecProd = new javax.swing.JButton();
        btnCategoriaM_SelecProd = new javax.swing.JButton();
        btnCategoriaU_SelecProd = new javax.swing.JButton();
        btnCategoriaP_SelecProd = new javax.swing.JButton();
        btnCategoriaA_SelecProd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        panelProductos_SelecProd = new javax.swing.JPanel();
        panelMenuSelecProd = new javax.swing.JPanel();
        btnAdmin_SelecProd = new javax.swing.JButton();
        btnSalir_SelecProd = new javax.swing.JButton();
        btnCarrito_SelecProd = new javax.swing.JButton();
        btnCategoria_SelecProd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1024, 769));
        setSize(new java.awt.Dimension(1024, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

<<<<<<< HEAD
        getContentPane().add(panelCategorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 210, 690, 380));
=======
        getContentPane().add(panelCategorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 220, 690, 380));
>>>>>>> Josito

        panelProductos_SelecProd.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
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
    }// </editor-fold>//GEN-END:initComponents

    
    private void btnCategoria_SelecProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoria_SelecProdActionPerformed
        // TODO add your handling code here:
        panelCategorias.setVisible(true);
    }//GEN-LAST:event_btnCategoria_SelecProdActionPerformed

    private void btnCarrito_SelecProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarrito_SelecProdActionPerformed
        // TODO add your handling code here
        gp.creaCarrito(empleadoLogeado, productosCarrito);
        dispose();
    }//GEN-LAST:event_btnCarrito_SelecProdActionPerformed

    private void btnCategoriaS_SelecProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoriaS_SelecProdActionPerformed
        // TODO add your handling code here:
        //almc.mostrarProducto("stock");
        panelCategorias.setVisible(false);
    }//GEN-LAST:event_btnCategoriaS_SelecProdActionPerformed

    private void btnCategoriaM_SelecProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoriaM_SelecProdActionPerformed
        // TODO add your handling code here:
        almc.mostrarProductoGenero("m");
        panelCategorias.setVisible(false);
    }//GEN-LAST:event_btnCategoriaM_SelecProdActionPerformed

    private void btnCategoriaU_SelecProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoriaU_SelecProdActionPerformed
        // TODO add your handling code here:
        //almc.mostrarProductoGenero("u");
        panelCategorias.setVisible(false);
    }//GEN-LAST:event_btnCategoriaU_SelecProdActionPerformed

    private void btnCategoriaP_SelecProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoriaP_SelecProdActionPerformed
        // TODO add your handling code here:
        almc.mostrarProducto("precio");
        panelCategorias.setVisible(false);
    }//GEN-LAST:event_btnCategoriaP_SelecProdActionPerformed

    private void btnCategoriaA_SelecProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoriaA_SelecProdActionPerformed
        // TODO add your handling code here:
        almc.mostrarProducto("nombre");
        panelCategorias.setVisible(false);
    }//GEN-LAST:event_btnCategoriaA_SelecProdActionPerformed

    private void btnCategoriaH_SelecProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoriaH_SelecProdActionPerformed
        // TODO add your handling code here:
        //almc.mostrarProductoGenero("h");
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelCategorias;
    private javax.swing.JPanel panelMenuSelecProd;
    private javax.swing.JPanel panelProductos_SelecProd;
    // End of variables declaration//GEN-END:variables
}
