package co.endava.app;

import co.endava.datos.Producto;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class AdministradorProductosTest {

    @Test
    void main() {
        Integer idTest = 105;
        String nombreTest="Agua";
        Double precioTest = 1800.0;
        Producto p5 = new Producto(105, "Agua", 1800.0);

        //Validacion ID
        assertEquals(idTest,p5.getId());

        //Validacion Nombre
        assertEquals(nombreTest,p5.getNombre());

        //Validacion Descuento
        assertEquals(getDescuentoTest(precioTest),p5.getDescuento());
    }


    public double getDescuentoTest(Double precioTest){
        return precioTest * 0.50;
    }



}