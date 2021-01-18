package tpv;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

public class Pantalla_AdministrarUsuarios extends javax.swing.JFrame {

    private gestionPantallas gp;
    
    ArrayList empleadosParaEliminar = new ArrayList();
    boolean buscadorVisible = false;
    Usuario usuario = new Usuario();
    ArrayList <Empleado> empleados = usuario.leerEmpleados();
    
    public Pantalla_AdministrarUsuarios() {
        initComponents();
        this.setLocationRelativeTo(null);
        gp = new gestionPantallas();
        txtBuscador.setVisible(buscadorVisible);
        this.cargarEmpleados();
    }

    /**
     * @see Metodo para cargar los productos que tenemos en nuestra base de datos.
     */
    public void cargarEmpleados(){
        //Primero eliminamos todos los productos que tenemos para eliminar de nuestro
        //array de productosParaEliminar.
        empleadosParaEliminar.clear();
        
        //Eliminamos todos los componentes de nuestro panel de productos, por si acaso tenemos alguno
        panelProductos_Administrador.removeAll();
        
        
        
        int posX = 10;
        int posY = 10;
        
        
        for (int i = 0; i < empleados.size(); i++) {
            
            //Para dar un salto a la siguiente linea al mostrar nuestros productos.
            if(posX >= 870){
                posY += 170;
                posX = 10;
            }
            
            Empleado emp = empleados.get(i);
            String esAdmin = emp.getEsAdmin() ? "Si" : "No";
            //Por cada producto vamos a crear un Label para añadirlo al panel.
            JLabel datosEmpleado = new JLabel("<HTML><b>Nombre:</b> "+emp.getNombre() +" "+ emp.getApellidos()+" <br> <b>Administrado:</b> "+ esAdmin +"</HTML>");
            //Le seteamos de nombre el codigo de producto para que sea unico y no de fallos.
            datosEmpleado.setName(String.valueOf(empleados.get(i).getCorreo()));
            datosEmpleado.setBorder(new EmptyBorder(0,5,0,0));
            //Mouse listener para cuando cliquemos.
            datosEmpleado.addMouseListener(new MouseAdapter() {
                boolean estaSeleccionado = false;
                public void mouseClicked(MouseEvent e){
                    //si no ha sido clickado le ponemos un borde y lo añadimos al array de eliminar producto
                    if(!estaSeleccionado){
                        Border border = BorderFactory.createLineBorder(Color.BLUE, 5);
                        datosEmpleado.setBorder(border);
                        empleadosParaEliminar.add(datosEmpleado.getName());
                        estaSeleccionado = true;
                    }else{
                        //Si ya habiamos clickado, le quitamos el borde y eliminamos ese producto de nuestro producto
                        //Como el nombre es un Integer, obtenemos el nombre, lo convertimos en numero y buscamos
                        //la posicion de ese indice para borrar esa posicion del array.
                        datosEmpleado.setBorder(new EmptyBorder(0,5,0,0));
                        empleadosParaEliminar.remove(empleadosParaEliminar.indexOf(datosEmpleado.getName()));
                        estaSeleccionado = false;
                    }
                }
            });
            
            //agregamos la label a nuestro panel.
            panelProductos_Administrador.add(datosEmpleado,new org.netbeans.lib.awtextra.AbsoluteConstraints(posX, posY, 150, 150));
            posX += 170;
            //870 limite en X
            
        }
        System.out.println(panelProductos_Administrador.getComponentCount());
        //revalidamos y repintamos el panel.
        panelProductos_Administrador.revalidate();
        panelProductos_Administrador.repaint();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtBuscador = new javax.swing.JTextField();
        panelMenuSelecProd = new javax.swing.JPanel();
        btnAnadirAdmin_Administrar = new javax.swing.JButton();
        btnBuscarEmp_Administrar = new javax.swing.JButton();
        btnAnadirEmp_Administrar = new javax.swing.JButton();
        btnQuitarEmp_Administrar = new javax.swing.JButton();
        btnQuitarAdmin_Administrar = new javax.swing.JButton();
        btnVolver_Administrar1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        panelProductos_Administrador = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1024, 769));
        setSize(new java.awt.Dimension(1024, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtBuscador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscadorActionPerformed(evt);
            }
        });
        txtBuscador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscadorKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscadorKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscadorKeyTyped(evt);
            }
        });
        getContentPane().add(txtBuscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 80, 120, 40));

        panelMenuSelecProd.setBackground(new java.awt.Color(102, 102, 102));
        panelMenuSelecProd.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(102, 102, 102)));
        panelMenuSelecProd.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAnadirAdmin_Administrar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAnadirAdmin_Administrar.setText("<html><body>AÑADIR<br>ADMINISTRADOR</body></html>");
        btnAnadirAdmin_Administrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnadirAdmin_AdministrarActionPerformed(evt);
            }
        });
        panelMenuSelecProd.add(btnAnadirAdmin_Administrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 120, 110));

        btnBuscarEmp_Administrar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnBuscarEmp_Administrar.setText("<html><body>BUSCAR<br>EMPLEADO</body></html>");
        btnBuscarEmp_Administrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarEmp_AdministrarActionPerformed(evt);
            }
        });
        panelMenuSelecProd.add(btnBuscarEmp_Administrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, 120, 110));

        btnAnadirEmp_Administrar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAnadirEmp_Administrar.setText("<html><body>AÑADIR <br>EMPLEADO</body></html>");
        btnAnadirEmp_Administrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnadirEmp_AdministrarActionPerformed(evt);
            }
        });
        panelMenuSelecProd.add(btnAnadirEmp_Administrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 120, 110));

        btnQuitarEmp_Administrar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnQuitarEmp_Administrar.setText("<html><body>ELIMINAR<br>EMPLEADO</body></html>");
        btnQuitarEmp_Administrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarEmp_AdministrarActionPerformed(evt);
            }
        });
        panelMenuSelecProd.add(btnQuitarEmp_Administrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 120, 110));

        btnQuitarAdmin_Administrar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnQuitarAdmin_Administrar.setText("<html><body>QUITAR<br>ADMINISTRADOR</body></html>");
        btnQuitarAdmin_Administrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarAdmin_AdministrarActionPerformed(evt);
            }
        });
        panelMenuSelecProd.add(btnQuitarAdmin_Administrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, 120, 110));

        btnVolver_Administrar1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnVolver_Administrar1.setText("VOLVER");
        btnVolver_Administrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolver_Administrar1ActionPerformed(evt);
            }
        });
        panelMenuSelecProd.add(btnVolver_Administrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 10, 120, 110));

        getContentPane().add(panelMenuSelecProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 130));

        panelProductos_Administrador.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jScrollPane1.setViewportView(panelProductos_Administrador);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 1030, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnQuitarEmp_AdministrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarEmp_AdministrarActionPerformed
        Usuario us = new Usuario();
        for (int i = 0; i < empleadosParaEliminar.size(); i++) {
            us.borrarEmpleado((String) empleadosParaEliminar.get(i));
        }
        
        this.cargarEmpleados();
    }//GEN-LAST:event_btnQuitarEmp_AdministrarActionPerformed

    private void btnAnadirEmp_AdministrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnadirEmp_AdministrarActionPerformed
        // TODO add your handling code here:

        gp.creaRegistro();
        dispose();
    }//GEN-LAST:event_btnAnadirEmp_AdministrarActionPerformed

    private void btnQuitarAdmin_AdministrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarAdmin_AdministrarActionPerformed
        Usuario us = new Usuario();
        for (int i = 0; i < empleadosParaEliminar.size(); i++) {
            us.eliminarAdmin((String) empleadosParaEliminar.get(i));
        }
        
        this.cargarEmpleados();
    }//GEN-LAST:event_btnQuitarAdmin_AdministrarActionPerformed

    private void btnVolver_Administrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolver_Administrar1ActionPerformed
        // TODO add your handling code here:

        gp.creaAdministrador();
        dispose();
    }//GEN-LAST:event_btnVolver_Administrar1ActionPerformed

    private void btnAnadirAdmin_AdministrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnadirAdmin_AdministrarActionPerformed
        Usuario us = new Usuario();
        for (int i = 0; i < empleadosParaEliminar.size(); i++) {
            us.anadirAdmin((String) empleadosParaEliminar.get(i));
        }
        
        this.cargarEmpleados();
    }//GEN-LAST:event_btnAnadirAdmin_AdministrarActionPerformed

    private void txtBuscadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscadorActionPerformed

    private void btnBuscarEmp_AdministrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarEmp_AdministrarActionPerformed
        buscadorVisible = !buscadorVisible;
        if(buscadorVisible) btnBuscarEmp_Administrar.setSize(new Dimension(120,70));
        else btnBuscarEmp_Administrar.setSize(new Dimension(120,110));
        txtBuscador.setVisible(buscadorVisible);
    }//GEN-LAST:event_btnBuscarEmp_AdministrarActionPerformed

    private void txtBuscadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscadorKeyTyped
        
    }//GEN-LAST:event_txtBuscadorKeyTyped

    private void txtBuscadorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscadorKeyPressed
        
    }//GEN-LAST:event_txtBuscadorKeyPressed

    private void txtBuscadorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscadorKeyReleased
        if(txtBuscador.getText().isEmpty()){
            empleados = usuario.leerEmpleados();
        }else{
            empleados = usuario.leerEmpleados(txtBuscador.getText());
        }
        this.cargarEmpleados();
    }//GEN-LAST:event_txtBuscadorKeyReleased

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
            java.util.logging.Logger.getLogger(Pantalla_AdministrarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla_AdministrarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla_AdministrarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla_AdministrarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Pantalla_AdministrarUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnadirAdmin_Administrar;
    private javax.swing.JButton btnAnadirEmp_Administrar;
    private javax.swing.JButton btnBuscarEmp_Administrar;
    private javax.swing.JButton btnQuitarAdmin_Administrar;
    private javax.swing.JButton btnQuitarEmp_Administrar;
    private javax.swing.JButton btnVolver_Administrar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelMenuSelecProd;
    private javax.swing.JPanel panelProductos_Administrador;
    private javax.swing.JTextField txtBuscador;
    // End of variables declaration//GEN-END:variables
}
