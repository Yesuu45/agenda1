package co.edu.uniquindio.poo;

import java.util.LinkedList;
import java.util.List;

public class Grupo {
    private String nombre;
    private List<Contacto>contactos;
    private Categoria categoria;
    
    public Grupo(String nombre, Categoria categoria){
        this.nombre =  nombre;
        this.categoria=categoria;
        contactos= new LinkedList<>();
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Contacto> getContactos() {
        return contactos;
    }

    public void setContactos(List<Contacto> contactos) {
        this.contactos = contactos;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void agregarContacto(Contacto contacto) {
        if (validarDatos(contacto.getNombre(), contacto.getNumero())) {
            Contacto.mostrarMensaje("contacto repetido " + contacto.getNombre() + " " + contacto.getNumero());
        } else {
            contactos.add(contacto);
        }
    }
    

    public boolean validarDatos(String nombre, String numero) {
        for (Contacto contacto : contactos) {
            if (contacto.getNombre().equals(nombre) && contacto.getNumero().equals(numero)) {
                return true;
            }
        }
        return false; // Se añade retorno en caso de que no se encuentre un contacto
    }
    public void eliminarContacto(String nombre, String numero) {
        if (contactos.size() <= 5) {
            Contacto.mostrarMensaje("No se puede eliminar el contacto, el grupo debe tener al menos 5 contactos.");
            return;
        }
    
        boolean eliminado = false;
        for (int i = 0; i < contactos.size(); i++) {
            Contacto contacto = contactos.get(i);
            if (contacto.getNombre().equals(nombre) && contacto.getNumero().equals(numero)) {
                contactos.remove(i);
                Contacto.mostrarMensaje("Contacto eliminado: " + contacto.getNombre() + " " + contacto.getNumero());
                eliminado = true;
                break;
            }
        }
        if (!eliminado) {

        }
    }
    
    

    @Override
    public String toString() {
        return "Grupo " + nombre + "  contactos: " + contactos + " categoria " + categoria ;
    }
    

}
