package tpv;

import java.awt.Component;
import javax.swing.JTextField;


public class Pantalla_Registro extends javax.swing.JFrame {

    private gestionPantallas gp;
    Empleado empleadoLogeado;
    public Pantalla_Registro() {
        initComponents();
        this.setLocationRelativeTo(null);
        gp = new gestionPantallas();
    }
    
    public Pantalla_Registro(Empleado emp) {
        initComponents();
        this.setLocationRelativeTo(null);
        gp = new gestionPantallas();
        this.empleadoLogeado = emp;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblRegistro = new javax.swing.JLabel();
        txtNombre_Registrar = new javax.swing.JTextField();
        txtApellidos_Registrar = new javax.swing.JTextField();
        txtEmail_Registrar = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        btnVolver_Registro = new javax.swing.JButton();
        txtPasswd_Reagistrar = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        errorCampos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1024, 768));
        setResizable(false);
        setSize(new java.awt.Dimension(1024, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("ico");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, -1, -1));

        lblRegistro.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblRegistro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegistro.setText("REGISTRAR USUARIO");
        getContentPane().add(lblRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 290, 40));

        txtNombre_Registrar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtNombre_Registrar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtNombre_Registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, 230, 40));

        txtApellidos_Registrar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtApellidos_Registrar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtApellidos_Registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, 230, 40));

        txtEmail_Registrar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtEmail_Registrar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEmail_Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmail_RegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(txtEmail_Registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 380, 230, 40));

        btnRegistrar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 520, 210, 80));

        btnVolver_Registro.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnVolver_Registro.setText("VOLVER");
        btnVolver_Registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolver_RegistroActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver_Registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 20, 140, 120));

        txtPasswd_Reagistrar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtPasswd_Reagistrar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtPasswd_Reagistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 440, 230, 40));

        jLabel2.setText("Contraseña:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 420, -1, -1));

        jLabel3.setText("Nombre:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, -1, -1));

        jLabel4.setText("Apellidos:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 300, -1, -1));

        jLabel5.setText("Correo:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 360, -1, -1));

        errorCampos.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        errorCampos.setForeground(new java.awt.Color(255, 0, 51));
        getContentPane().add(errorCampos, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 630, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmail_RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmail_RegistrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmail_RegistrarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        Empleado emp = new Empleado();
        Encriptacion encriptar = new Encriptacion();
        Usuario us = new Usuario();
        boolean estanVacio = false;
        
        for(Component c : this.getComponents()){
            if(c instanceof JTextField){
                JTextField txt = (JTextField) c;
                if(txt.getText().isEmpty()){
                    estanVacio = true;
                }
            }
        }
        
        if(!new String(txtPasswd_Reagistrar.getPassword()).isEmpty() && !estanVacio){
            emp.setNombre(txtNombre_Registrar.getText());
            emp.setApellidos(txtApellidos_Registrar.getText());
            emp.setCorreo(txtEmail_Registrar.getText());
            emp.setPassword(encriptar.getMD5String(new String(txtPasswd_Reagistrar.getPassword())));

            if (us.registro(emp)) {
                gp.creaAdministrarUsuario(empleadoLogeado);
                dispose();
            }else{
                errorCampos.setText("ERROR USUARIO EXISTENTE");
            }
        
        }else{
            errorCampos.setText("Rellena todos los campos");
        }
        
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnVolver_RegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolver_RegistroActionPerformed
        // TODO add your handling code here:
        gp.creaAdministrarUsuario(empleadoLogeado);
        dispose();
    }//GEN-LAST:event_btnVolver_RegistroActionPerformed

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
            java.util.logging.Logger.getLogger(Pantalla_Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla_Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnVolver_Registro;
    private javax.swing.JLabel errorCampos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblRegistro;
    private javax.swing.JTextField txtApellidos_Registrar;
    private javax.swing.JTextField txtEmail_Registrar;
    private javax.swing.JTextField txtNombre_Registrar;
    private javax.swing.JPasswordField txtPasswd_Reagistrar;
    // End of variables declaration//GEN-END:variables
}
