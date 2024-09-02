/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class ContactoTest {
    private static final Logger LOG = Logger.getLogger(ContactoTest.class.getName());

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        LOG.info("Iniciado test shouldAnswerWithTrue");
        assertThrows(Throwable.class, ()-> new Contacto("", "", "", "", ""));
        LOG.info("Finalizando test shouldAnswerWithTrue");
    }

    public void email(){
        LOG.info("null");
        assertThrows(Throwable.class,()-> new Contacto("YESUU ESTEBAN", "ESTEBAN", "CR 19#57-70", "3213321453", "yesuaesteban@hotmail.com"));
        LOG.info("");
    }
}
