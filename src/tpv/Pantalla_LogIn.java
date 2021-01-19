
package tpv;


public class Pantalla_LogIn extends javax.swing.JFrame {
    
    Empleado emp = new Empleado();
    Usuario us = new Usuario();
    Encriptacion md5 = new Encriptacion();
    private gestionPantallas gp;
    
    public Pantalla_LogIn() {
        initComponents();
        this.setLocationRelativeTo(null);
        gp = new gestionPantallas();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        gradientBG5 = new tpv.gradientBG();
        button1 = new tpv.button();
        lbl_Icono = new javax.swing.JLabel();
        lblInicio = new javax.swing.JLabel();
        txtPasswd_Login = new javax.swing.JPasswordField();
        btn_Entrar_LogIn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1024, 768));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1024, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gradientBG5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        button1.setText("button1");
        gradientBG5.add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 500, 210, 80));

        lbl_Icono.setText("ICO");
        gradientBG5.add(lbl_Icono, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 155, 50, 30));

        lblInicio.setFont(new java.awt.Font("Monotype Corsiva", 2, 36)); // NOI18N
        lblInicio.setForeground(new java.awt.Color(60, 18, 40));
        lblInicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInicio.setText("INICIO SESIÓN");
        gradientBG5.add(lblInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 155, 290, 40));

        txtPasswd_Login.setBackground(new java.awt.Color(60, 56, 58));
        txtPasswd_Login.setForeground(new java.awt.Color(229, 229, 229));
        txtPasswd_Login.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        gradientBG5.add(txtPasswd_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 400, 230, 40));

        btn_Entrar_LogIn.setBackground(new java.awt.Color(60, 56, 58));
        btn_Entrar_LogIn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_Entrar_LogIn.setForeground(new java.awt.Color(229, 229, 229));
        btn_Entrar_LogIn.setText("ENTRAR");
        gradientBG5.add(btn_Entrar_LogIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 500, 210, 80));

        jLabel4.setFont(new java.awt.Font("Monotype Corsiva", 0, 26)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(60, 18, 40));
        jLabel4.setText("Contraseña:");
        gradientBG5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 345, 160, 40));

        jLabel3.setBackground(new java.awt.Color(58, 58, 58));
        jLabel3.setFont(new java.awt.Font("Monotype Corsiva", 2, 26)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(60, 18, 40));
        jLabel3.setText("Correo:");
        gradientBG5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 236, 110, 30));

        txtEmail.setBackground(new java.awt.Color(60, 56, 58));
        txtEmail.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(229, 229, 229));
        txtEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        gradientBG5.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 285, 230, 40));

        getContentPane().add(gradientBG5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1024, 768));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Pantalla_LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla_LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla_LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla_LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla_LogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Entrar_LogIn;
    private tpv.button button1;
    private tpv.gradientBG gradientBG5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblInicio;
    private javax.swing.JLabel lbl_Icono;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtPasswd_Login;
    // End of variables declaration//GEN-END:variables
}
