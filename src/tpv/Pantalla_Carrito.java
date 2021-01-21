package tpv;

import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class Pantalla_Carrito extends javax.swing.JFrame {

    private gestionPantallas gp;
    Empleado empleadoLogeado;
    HashMap<Integer, Integer> productosCarrito;
    ArrayList productosCarritoArray;
    Ventas venta = new Ventas();
    public Pantalla_Carrito() {
        initComponents();
        //this.setLocationRelativeTo(null);
        gp = new gestionPantallas();
    }
    
    public Pantalla_Carrito(Empleado emp, HashMap productosCarrito) {
        initComponents();
        this.setLocationRelativeTo(null);
        gp = new gestionPantallas();
        this.empleadoLogeado = emp;
        this.productosCarrito = productosCarrito;
        this.cargaProducto();
    }

    public void cargaProducto(){
        
        panelProductos_Carrito.removeAll();
        Almacen almacen = new Almacen();
        ArrayList <Producto> productos = almacen.mostrarProducto(productosCarrito);
        int posX = 10;
        int posY = 10;
        double precioTotalFinal = 0;
        int articulosTotales = 0;
        
        for (int i = 0; i < productos.size(); i++) {
            
            //Para dar un salto a la siguiente linea al mostrar nuestros productos.
            if(posX >= 870){
                posY += 250;
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
            JLabel imgProducto = new JLabel(newImage);
            //Le seteamos de nombre el codigo de producto para que sea unico y no de fallos.
            imgProducto.setName(String.valueOf(productos.get(i).getCodigoProducto()));
            
            JLabel datosProducto = new JLabel("<HTML><b>Nombre:</b> "+ String.valueOf(productos.get(i).getNombre()) 
                    +" <br> <b>Codigo:</b> "+String.valueOf(productos.get(i).getCodigoProducto()) +" <br> <b>Precio:</b> "
                    +String.valueOf(productos.get(i).getPrecio())+" <br>"
                    + " <b>Cantidad:</b> "+String.valueOf(productosCarrito.get(productos.get(i).getCodigoProducto()))+" </HTML>");
            
            //Mouse listener para cuando cliquemos.
            imgProducto.addMouseListener(new MouseAdapter() {
                boolean estaSeleccionado = false;
                public void mouseClicked(MouseEvent e){
                    if(e.getClickCount() == 2){
                        int cantidad = productosCarrito.get(Integer.parseInt(imgProducto.getName()));
                        int key = Integer.parseInt(imgProducto.getName());
                        productosCarrito.put(key, cantidad-1);
                        if(productosCarrito.get(key) == 0) productosCarrito.remove(key);
                        
                        cargaProducto();
                        System.out.println("Hashmap "+ productosCarrito );
                        System.out.println("Llave: " + key + " Cantidad: "+ cantidad);
                        
                    }
                    
                }
            });
            
            //agregamos la label a nuestro panel.
            panelProductos_Carrito.add(imgProducto,new org.netbeans.lib.awtextra.AbsoluteConstraints(posX, posY, 150, 150));
            panelProductos_Carrito.add(datosProducto,new org.netbeans.lib.awtextra.AbsoluteConstraints(posX, posY+150, 150, 90));
            posX += 170;
            //870 limite en X
            
            precioTotalFinal += productos.get(i).getPrecio() * Integer.parseInt(datosProducto.getText().split(" ")[datosProducto.getText().split(" ").length - 2]);
            articulosTotales += Integer.parseInt(datosProducto.getText().split(" ")[datosProducto.getText().split(" ").length - 2]);
            
            
        }
        lblPrecio_Carrito.setText(String.valueOf(precioTotalFinal) + "€");
        lblCantidadArticulos.setText(String.valueOf(articulosTotales));
        //revalidamos y repintamos el panel.
        panelProductos_Carrito.revalidate();
        panelProductos_Carrito.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        lblCantidadArticulos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1024, 768));
        setPreferredSize(new java.awt.Dimension(1030, 600));
        setSize(new java.awt.Dimension(1024, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelProductos_Carrito.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jScrollPane1.setViewportView(panelProductos_Carrito);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 1040, 540));

        panelMenuSelecProd.setBackground(new java.awt.Color(102, 102, 102));
        panelMenuSelecProd.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(102, 102, 102)));
        panelMenuSelecProd.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPagarEfectivo_Carrito.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnPagarEfectivo_Carrito.setText("EFECTIVO");
        btnPagarEfectivo_Carrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarEfectivo_CarritoActionPerformed(evt);
            }
        });
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

        lblCantidadArticulos.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCantidadArticulos.setText("99999");
        jPanel1.add(lblCantidadArticulos, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 20, 100, 70));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 670, 1030, 100));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPagarTarjeta_CarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarTarjeta_CarritoActionPerformed
        if(!productosCarrito.isEmpty()){
            venta.agregarVenta(productosCarrito);
            productosCarrito.clear();
            gp.creaSeleccionProducto(empleadoLogeado, productosCarrito);
            dispose();
        }else{
            JOptionPane.showMessageDialog(null,"Tu carrito está vacío." ,"ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnPagarTarjeta_CarritoActionPerformed

    private void btnVolver_CarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolver_CarritoActionPerformed
        // TODO add your handling code here:
        gp.creaSeleccionProducto(empleadoLogeado, productosCarrito);
        dispose();
    }//GEN-LAST:event_btnVolver_CarritoActionPerformed

    private void btnPagarEfectivo_CarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarEfectivo_CarritoActionPerformed
        if(!productosCarrito.isEmpty()){
            venta.agregarVenta(productosCarrito);
            productosCarrito.clear();
            gp.creaSeleccionProducto(empleadoLogeado, productosCarrito);
            dispose();
        }else{
            JOptionPane.showMessageDialog(null,"Tu carrito está vacío." ,"ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnPagarEfectivo_CarritoActionPerformed


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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCantidadArticulos;
    private javax.swing.JLabel lblPrecio_Carrito;
    private javax.swing.JPanel panelMenuSelecProd;
    private javax.swing.JPanel panelProductos_Carrito;
    // End of variables declaration//GEN-END:variables
}
