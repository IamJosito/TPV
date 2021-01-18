package tpv;


public class gestionPantallas {
  
    
    protected void creaSeleccionProducto(){
        Pantalla_Seleccion_Producto psp = new Pantalla_Seleccion_Producto();
        psp.setVisible(true);
    }
    
    protected void creaLogin(){
        Pantalla_LogIn pl = new Pantalla_LogIn();
        pl.setVisible(true);
    }
    
    protected void creaRegistro(){
        Pantalla_Registro pr = new Pantalla_Registro();
        pr.setVisible(true);
    }    
    
    protected void creaCarrito(){
        Pantalla_Carrito pc = new Pantalla_Carrito();
        pc.setVisible(true);
    }   
    protected void creaAdministrador(){
        Pantalla_Administrador pa = new Pantalla_Administrador();
        pa.setVisible(true);
    }
    
    protected void creaAdministrarUsuario(){
        Pantalla_AdministrarUsuarios pau = new Pantalla_AdministrarUsuarios();
        pau.setVisible(true);
    }
}
