package co.edu.uniquindio.poo;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Reunion {
    private String descripcion;
    private Date fecha;
    private Time hora;
    private List<Contacto>asistentes;

    public Reunion(String descripcion , Date fecha, Time hora){
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.hora = hora;
        asistentes = new LinkedList<>();
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public List<Contacto> getAsistentes() {
        return asistentes;
    }

    public void setAsistentes(List<Contacto> asistentes) {
        this.asistentes = asistentes;
    }

    public void agregarAsistente(Contacto contacto){
        if(validarAsistente(contacto.getNombre(),contacto.getNumero())){
            Contacto.mostrarMensaje("Error no se puede poner un contanto en la reunion ");
        }else{
        asistentes.add(contacto);
        }

    }

    public boolean validarAsistente(String nombre, String numero){
        for(Contacto contacto :asistentes){
            if(contacto.getNombre().equals(nombre) && contacto.getNumero().equals(numero)){
                return true;
            }
        }
        return false;
    }

    public void eliminarAsistente(String nombre ,String numero){
        for(Contacto contacto:asistentes){
            if(contacto.getNombre().equals(nombre) && contacto.getNumero().equals(numero)){
                asistentes.remove(contacto);
                break;
            }

        }

    }

    @Override
    public String toString() {
        return "Reunion " + descripcion + " fecha" + fecha + " hora " + hora + ", asistentes "
                + asistentes ; 
    }

    
    
}
