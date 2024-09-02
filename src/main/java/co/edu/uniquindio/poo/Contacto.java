package co.edu.uniquindio.poo;

public class Contacto {
    private String nombre;
    private String alias;
    private String direccion;
    private String numero;
    private String email;

    public Contacto(String nombre, String alias, String direccion, String numero , String email ){
        this.nombre = nombre;
        this.alias = alias;
        this.direccion = direccion;
        this.numero = numero;
        this.email = email;
        assert !nombre.isBlank();
        assert !alias.isBlank();
        assert !direccion.isBlank();
        assert !numero.isBlank();
        assert email.contains("@");


    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getDirrecion() {
        return direccion;
    }

    public void setDirrecion(String dirrecion) {
        this.direccion = dirrecion;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public static void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }

    @Override
    public String toString() {
        return "\n NOMBRE = " + nombre + "\n ALIAS = " + alias + "\n DIRECCION =" + direccion + " \n NUMERO = " + numero
                + " EMAIL =" + email ;
    }
    
    
}
