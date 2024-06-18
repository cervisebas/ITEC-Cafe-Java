package models;



public class Cliente {
    protected String Nombre;
    protected String Apellido;
    protected String Correo;
    protected int Telefono;
    
    public void Create(String Nombre,String Apellido,String Correo,int Telefono) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Correo = Correo;
        this.Telefono = Telefono;
    }
    


    
}
