package co.edu.uniquindio.poo;

import java.sql.Time;
import java.util.Date;

public class App {
    public static void main(String[] args) {
        // Crear contactos
        Contacto contacto1 = new Contacto("Juan Perez", "Juan", "Calle 123", "123456789", "juan@uq.com");
        Contacto contacto2 = new Contacto("Maria Lopez", "Maria", "Calle 456", "98765432", "maria@gmail.com");
        Contacto contacto3 = new Contacto("Carlos Sanchez", "Carlos", "Avenida 789", "12345678", "carlos@outlook.com");
        Contacto contacto4 = new Contacto("Pedro Martinez", "Pedro", "Calle 789", "123456789", "pedro@hotmail.com");
        Contacto contacto5 = new Contacto("Yesuu Esteban", "Yesuu", "Calle 749", "321343534", "yesuaesteban@hotmail.com");
        Contacto contacto6 = new Contacto("Laura Martinez", "Laura", "Calle 101", "555123456", "laura@gmail.com");
        Contacto contacto7 = new Contacto("David Ramirez", "David", "Avenida 202", "555987654", "david@gmail.com");
        Contacto contacto8 = new Contacto("Ana Torres", "Ana", "Calle 303", "12345678", "ana@hotmail.com");
        Contacto contacto9 = new Contacto("Juan Perez", "Juan", "Calle 404", "123456789", "juan@uq.com");
        Contacto contacto10 = new Contacto("Miguel Gonzalez", "Miguel", "Avenida 505", "98765432", "miguel@gmail.com");
        Contacto contacto11 = new Contacto("Patricia Silva", "Patricia", "Calle 606", "111223344", "patricia@gmail.com");
        Contacto contacto12 = new Contacto("Antonio Vargas", "Antonio", "Calle 707", "222334455", "antonio@gmail.com");
        Contacto contacto13 = new Contacto("Sofia Jimenez", "Sofia", "Calle 808", "333445566", "sofia@gmail.com");
        Contacto contacto14 = new Contacto("Ricardo Moreno", "Ricardo", "Calle 909", "444556677", "ricardo@gmail.com");
        Contacto contacto15 = new Contacto("Gabriela Ruiz", "Gabriela", "Calle 1010", "555667788", "gabriela@gmail.com");
        Contacto contacto16 = new Contacto("Luis Martinez", "Luis", "Avenida 1111", "666778899", "luis@gmail.com");
        Contacto contacto17 = new Contacto("Claudia Ortiz", "Claudia", "Calle 1212", "777889900", "claudia@gmail.com");

        // Crear grupo "Amigos"
        Grupo grupoAmigos = new Grupo("Amigos", Categoria.AMIGOS);
        grupoAmigos.agregarContacto(contacto1);
        grupoAmigos.agregarContacto(contacto2);
        grupoAmigos.agregarContacto(contacto3);
        grupoAmigos.agregarContacto(contacto4);
        grupoAmigos.agregarContacto(contacto5);
        grupoAmigos.agregarContacto(contacto6);
        grupoAmigos.agregarContacto(contacto7);
        grupoAmigos.agregarContacto(contacto8);
        grupoAmigos.agregarContacto(contacto11);
        grupoAmigos.agregarContacto(contacto12);
        grupoAmigos.agregarContacto(contacto13);
        grupoAmigos.agregarContacto(contacto14);
        grupoAmigos.agregarContacto(contacto15);
        grupoAmigos.agregarContacto(contacto16);
        grupoAmigos.agregarContacto(contacto17);

        // Crear grupo "Oficina"
        Grupo grupoOficina = new Grupo("Oficina", Categoria.OFICINA);
        grupoOficina.agregarContacto(contacto1);
        grupoOficina.agregarContacto(contacto3);
        grupoOficina.agregarContacto(contacto4);
        grupoOficina.agregarContacto(contacto6);
        grupoOficina.agregarContacto(contacto7);
        grupoOficina.agregarContacto(contacto10);
        grupoOficina.agregarContacto(contacto11);
        grupoOficina.agregarContacto(contacto12);
        grupoOficina.agregarContacto(contacto13);

        // Crear grupo "Fiesta"
        Grupo grupoFiesta = new Grupo("Fiesta", Categoria.FIESTA);
        grupoFiesta.agregarContacto(contacto2);
        grupoFiesta.agregarContacto(contacto5);
        grupoFiesta.agregarContacto(contacto8);
        grupoFiesta.agregarContacto(contacto15);
        grupoFiesta.agregarContacto(contacto17);

        // Crear grupo "Familia"
        Grupo grupoFamilia = new Grupo("Familia", Categoria.FAMILIA);
        grupoFamilia.agregarContacto(contacto6);
        grupoFamilia.agregarContacto(contacto7);
        grupoFamilia.agregarContacto(contacto14);
        grupoFamilia.agregarContacto(contacto16);

        // Intentar agregar un contacto duplicado en el grupo "Amigos"
        grupoAmigos.agregarContacto(contacto1);
        grupoAmigos.agregarContacto(contacto2);

        // Eliminar un contacto (debe funcionar si hay más de 5 contactos)
        grupoAmigos.eliminarContacto(contacto4.getNombre(), contacto4.getNumero()); 
        grupoAmigos.eliminarContacto(contacto3.getNombre(), contacto3.getNumero()); // Elimina contacto3
        grupoAmigos.eliminarContacto(contacto9.getNombre(), contacto9.getNumero()); // Elimina contacto9
        grupoAmigos.eliminarContacto(contacto6.getNombre(), contacto6.getNumero()); // Elimina contacto6

        // Mostrar información de los grupos
        Contacto.mostrarMensaje(grupoAmigos.toString());
        Contacto.mostrarMensaje(grupoOficina.toString());
        Contacto.mostrarMensaje(grupoFiesta.toString());
        Contacto.mostrarMensaje(grupoFamilia.toString());

        // Crear reunión
        Reunion reunion = new Reunion("Reunión de Proyecto", new Date(), new Time(10, 04, 23));
        reunion.agregarAsistente(contacto1);  // Intento de agregar un contacto que fue eliminado
        reunion.agregarAsistente(contacto3);
        reunion.agregarAsistente(contacto6);

        // Intentar agregar asistentes duplicados a la reunión
        reunion.agregarAsistente(contacto8);  // Duplicado de contacto8
        reunion.agregarAsistente(contacto9);  // Duplicado de contacto9

        // Mostrar información de la reunión
        Contacto.mostrarMensaje(reunion.toString());
    }
}
