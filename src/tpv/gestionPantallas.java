package tpv;


public class gestionPantallas {
    
    protected void creaSeleccionProducto(Empleado emp){
        Pantalla_Seleccion_Producto psp = new Pantalla_Seleccion_Producto(emp);
        psp.setVisible(true);
    }
    
    protected void creaLogin(){
        Pantalla_LogIn pl = new Pantalla_LogIn();
        pl.setVisible(true);
    }
    
    protected void creaRegistro(Empleado emp){
        Pantalla_Registro pr = new Pantalla_Registro(emp);
        pr.setVisible(true);
    }    
    
    protected void creaCarrito(Empleado emp){
        Pantalla_Carrito pc = new Pantalla_Carrito(emp);
        pc.setVisible(true);
    }   
    protected void creaAdministrador(Empleado emp){
        Pantalla_Administrador pa = new Pantalla_Administrador(emp);
        pa.setVisible(true);
    }
    
    protected void creaAdministrarUsuario(Empleado emp){
        Pantalla_AdministrarUsuarios pau = new Pantalla_AdministrarUsuarios(emp);
        pau.setVisible(true);
    }
}
